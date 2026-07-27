package com.adjust.sdk.scheduler;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public interface ThreadExecutor {
    void submit(Runnable runnable);

    void teardown();
}
