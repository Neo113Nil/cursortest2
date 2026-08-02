package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.pipeline.DeleteAllRangesAndEntities;
import com.squareup.cash.clientsync.pipeline.DeleteEntity;
import com.squareup.cash.clientsync.pipeline.ReplaceRanges;
import com.squareup.cash.clientsync.pipeline.StorageOperation;
import com.squareup.cash.clientsync.pipeline.UpdateEntity;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public interface ClientSyncStorageObserver {

    public abstract class Typed implements ClientSyncStorageObserver {
        public void onAfterDeleteAllRangesAndEntities(DeleteAllRangesAndEntities.Result result) {
        }

        public void onAfterDeleteEntity(DeleteEntity.Result result) {
        }

        @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver
        public final void onAfterStorageOperation(StorageOperation.Result result) {
            if (result instanceof ReplaceRanges.Result) {
                return;
            }
            if (result instanceof UpdateEntity.Result) {
                onAfterUpdateEntity((UpdateEntity.Result) result);
                return;
            }
            if (result instanceof DeleteEntity.Result) {
                onAfterDeleteEntity((DeleteEntity.Result) result);
            } else if (result instanceof DeleteAllRangesAndEntities.Result) {
                onAfterDeleteAllRangesAndEntities((DeleteAllRangesAndEntities.Result) result);
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
        }

        public void onAfterUpdateEntity(UpdateEntity.Result result) {
        }

        public void onBeforeDeleteAllRangesAndEntities(DeleteAllRangesAndEntities deleteAllRangesAndEntities) {
            deleteAllRangesAndEntities.getClass();
        }

        @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver
        public final void onBeforeStorageOperation(StorageOperation storageOperation) {
            storageOperation.getClass();
            if (storageOperation instanceof ReplaceRanges) {
                return;
            }
            if (storageOperation instanceof UpdateEntity) {
                onBeforeUpdateEntity((UpdateEntity) storageOperation);
            } else {
                if (storageOperation instanceof DeleteEntity) {
                    return;
                }
                if (storageOperation instanceof DeleteAllRangesAndEntities) {
                    onBeforeDeleteAllRangesAndEntities((DeleteAllRangesAndEntities) storageOperation);
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                }
            }
        }

        public void onBeforeUpdateEntity(UpdateEntity updateEntity) {
            updateEntity.getClass();
        }

        public void onDeleteAllRangesAndEntitiesFailure(DeleteAllRangesAndEntities deleteAllRangesAndEntities, Throwable th) {
            deleteAllRangesAndEntities.getClass();
        }

        @Override // com.squareup.cash.clientsync.pipeline.ClientSyncStorageObserver
        public final void onStorageOperationFailure(StorageOperation storageOperation, Throwable th) {
            storageOperation.getClass();
            if ((storageOperation instanceof ReplaceRanges) || (storageOperation instanceof UpdateEntity) || (storageOperation instanceof DeleteEntity)) {
                return;
            }
            if (storageOperation instanceof DeleteAllRangesAndEntities) {
                onDeleteAllRangesAndEntitiesFailure((DeleteAllRangesAndEntities) storageOperation, th);
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
            }
        }
    }

    default void onAfterStorageOperation(StorageOperation.Result result) {
    }

    default void onBeforeStorageOperation(StorageOperation storageOperation) {
        storageOperation.getClass();
    }

    void onStorageOperationFailure(StorageOperation storageOperation, Throwable th);
}
