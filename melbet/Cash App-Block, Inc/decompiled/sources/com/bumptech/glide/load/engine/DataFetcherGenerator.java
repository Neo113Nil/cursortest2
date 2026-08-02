package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;

/* loaded from: classes4.dex */
public interface DataFetcherGenerator {

    public interface FetcherReadyCallback {
        void onDataFetcherFailed(Key key, Exception exc, DataFetcher dataFetcher, int i);

        void onDataFetcherReady(Key key, Object obj, DataFetcher dataFetcher, int i, Key key2);
    }

    void cancel();

    boolean startNext();
}
