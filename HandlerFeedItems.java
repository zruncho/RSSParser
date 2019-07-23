package com.axelby.riasel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by ivailo on 6/6/16.
 */
public class HandlerFeedItems implements FeedParser.FeedItemHandler, Serializable
{
    private List<FeedItem> _FeedItemsList;

    private int _itemcount = 0;

    private static final long serialVersionUID = 1L;

    public HandlerFeedItems() {
        _FeedItemsList = new Vector<>(0);
    }

    public void OnFeedItem(FeedParser feedParser, FeedItem item)
    {
        _FeedItemsList.add(item);
        _itemcount++;
    }

    public FeedItem getItem(int location) {

        //return the item at the chosen position
        return _FeedItemsList.get(location);
    }

    public int getItemCount() {

        //return the number of items in the feed
        return _itemcount;

    }
}
