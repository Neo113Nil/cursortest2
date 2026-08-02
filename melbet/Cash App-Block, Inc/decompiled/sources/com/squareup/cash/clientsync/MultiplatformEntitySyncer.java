package com.squareup.cash.clientsync;

import com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import kotlin.Lazy;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class MultiplatformEntitySyncer implements ClientSyncRequestObserver {
    public final Lazy clientSyncer;
    public final JobImpl hasSynced = JobKt.Job$default();

    public MultiplatformEntitySyncer(Lazy lazy) {
        this.clientSyncer = lazy;
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onAfterSyncRequestOperation(SyncRequestOperation.Result result) {
        result.getClass();
        if (result instanceof SyncRequestOperation.Result.Success) {
            this.hasSynced.complete$1();
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onAfterSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onBeforeSyncRequestOperation(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onBeforeSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onSyncRequestPageFailure(SyncRequestOperation syncRequestOperation) {
    }
}
