package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;

/* loaded from: classes.dex */
public interface ClientSyncRequestObserver {
    void onAfterSyncRequestOperation(SyncRequestOperation.Result result);

    default void onAfterSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
    }

    void onBeforeSyncRequestOperation(SyncRequestOperation syncRequestOperation);

    default void onBeforeSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
    }

    default void onSyncRequestPageFailure(SyncRequestOperation syncRequestOperation) {
    }
}
