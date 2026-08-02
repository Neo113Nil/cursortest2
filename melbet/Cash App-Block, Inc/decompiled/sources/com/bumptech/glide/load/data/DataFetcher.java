package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;

/* loaded from: classes4.dex */
public interface DataFetcher {

    public interface DataCallback {
        void onDataReady(Object obj);

        void onLoadFailed(Exception exc);
    }

    void cancel();

    void cleanup();

    Class getDataClass();

    int getDataSource();

    void loadData(Priority priority, DataCallback dataCallback);
}
