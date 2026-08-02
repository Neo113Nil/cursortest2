package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.flags.RealClientSyncFlags;
import com.squareup.cash.clientsync.logging.RealClientSyncLogger;
import com.squareup.cash.clientsync.pipeline.StorageOperation;
import com.squareup.cash.clientsync.pipeline.SyncRequestOperation;
import com.squareup.cash.clientsync.pipeline.SyncResponseOperation;

/* loaded from: classes.dex */
public final class DebugLoggingObserver implements ClientSyncRequestObserver, ClientSyncResponseObserver, ClientSyncStorageObserver {
    public final RealClientSyncFlags flags;
    public final RealClientSyncLogger logger;

    public DebugLoggingObserver(RealClientSyncFlags realClientSyncFlags, RealClientSyncLogger realClientSyncLogger) {
        this.flags = realClientSyncFlags;
        this.logger = realClientSyncLogger;
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver
    public final void onAfterStorageOperation(StorageOperation.Result result) {
        if (this.flags.isVerboseLoggingEnabled()) {
            RealClientSyncLogger.debug$default(this.logger, "[" + result.getStorageOperation().getTaskId() + "] After storage operation " + result);
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onAfterSyncRequestOperation(SyncRequestOperation.Result result) {
        result.getClass();
        SyncRequestOperation syncRequestOperation = result.getSyncRequestOperation();
        RealClientSyncLogger.debug$default(this.logger, "[" + syncRequestOperation.taskId + "] After sync request operation " + syncRequestOperation);
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onAfterSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
        RealClientSyncLogger.debug$default(this.logger, "[" + syncRequestOperation.taskId + "] After sync request page " + syncRequestOperation);
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncResponseObserver
    public final void onAfterSyncResponseOperation(SyncResponseOperation.Result result) {
        if (this.flags.isVerboseLoggingEnabled()) {
            SyncResponseOperation syncResponseOperation = result.getSyncResponseOperation();
            RealClientSyncLogger.debug$default(this.logger, "[" + syncResponseOperation.getTaskId() + "] After sync response operation " + syncResponseOperation);
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver
    public final void onBeforeStorageOperation(StorageOperation storageOperation) {
        storageOperation.getClass();
        if (this.flags.isVerboseLoggingEnabled()) {
            RealClientSyncLogger.debug$default(this.logger, "[" + storageOperation.getTaskId() + "] Before storage operation " + storageOperation);
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onBeforeSyncRequestOperation(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
        RealClientSyncLogger.debug$default(this.logger, "[" + syncRequestOperation.taskId + "] Before sync request operation " + syncRequestOperation);
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onBeforeSyncRequestPage(SyncRequestOperation syncRequestOperation) {
        syncRequestOperation.getClass();
        RealClientSyncLogger.debug$default(this.logger, "[" + syncRequestOperation.taskId + "] Before sync request page " + syncRequestOperation);
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncResponseObserver
    public final void onBeforeSyncResponseOperation(SyncResponseOperation syncResponseOperation) {
        syncResponseOperation.getClass();
        if (this.flags.isVerboseLoggingEnabled()) {
            RealClientSyncLogger.debug$default(this.logger, "[" + syncResponseOperation.getTaskId() + "] Before sync response operation " + syncResponseOperation);
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver
    public final void onStorageOperationFailure(StorageOperation storageOperation, Throwable th) {
        storageOperation.getClass();
        if (this.flags.isVerboseLoggingEnabled()) {
            RealClientSyncLogger.debug$default(this.logger, "[" + storageOperation.getTaskId() + "] Failed storage operation " + storageOperation + " because of " + th);
        }
    }

    @Override // com.squareup.cash.clientsync.pipeline.ClientSyncRequestObserver
    public final void onSyncRequestPageFailure(SyncRequestOperation syncRequestOperation) {
        RealClientSyncLogger.debug$default(this.logger, "[" + syncRequestOperation.taskId + "] Failed sync request page " + syncRequestOperation);
    }
}
