package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;

/* loaded from: classes.dex */
public interface ClientSyncResponseObserver {
    void onAfterSyncResponseOperation(SyncResponseOperation.Result result);

    void onBeforeSyncResponseOperation(SyncResponseOperation syncResponseOperation);
}
