package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.pipeline.StorageOperation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DeleteEntity implements EntityStorageOperation {
    public final SyncEntity entity;
    public final TaskId taskId;

    public DeleteEntity(TaskId taskId, SyncEntity syncEntity) {
        taskId.getClass();
        this.taskId = taskId;
        this.entity = syncEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteEntity)) {
            return false;
        }
        DeleteEntity deleteEntity = (DeleteEntity) obj;
        return Intrinsics.areEqual(this.taskId, deleteEntity.taskId) && this.entity.equals(deleteEntity.entity);
    }

    @Override // com.squareup.cash.clientsync.pipeline.EntityStorageOperation
    public final SyncEntity getEntity() {
        return this.entity;
    }

    @Override // com.squareup.cash.clientsync.pipeline.StorageOperation
    public final TaskId getTaskId() {
        return this.taskId;
    }

    public final int hashCode() {
        return this.entity.hashCode() + (this.taskId.id.hashCode() * 31);
    }

    public final String toString() {
        return "DeleteEntity(taskId=" + this.taskId + ", entity=" + this.entity + ")";
    }

    public final class Result implements StorageOperation.Result {
        public final SyncEntity deletedEntity;
        public final DeleteEntity storageOperation;

        public Result(DeleteEntity deleteEntity, SyncEntity syncEntity) {
            this.storageOperation = deleteEntity;
            this.deletedEntity = syncEntity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return this.storageOperation.equals(result.storageOperation) && Intrinsics.areEqual(this.deletedEntity, result.deletedEntity);
        }

        public final SyncEntity getDeletedEntity() {
            return this.deletedEntity;
        }

        @Override // com.squareup.cash.clientsync.pipeline.StorageOperation.Result
        public final DeleteEntity getStorageOperation() {
            return this.storageOperation;
        }

        public final int hashCode() {
            int hashCode = this.storageOperation.hashCode() * 31;
            SyncEntity syncEntity = this.deletedEntity;
            return hashCode + (syncEntity == null ? 0 : syncEntity.hashCode());
        }

        public final String toString() {
            return "Result(storageOperation=" + this.storageOperation + ", deletedEntity=" + this.deletedEntity + ")";
        }

        @Override // com.squareup.cash.clientsync.pipeline.StorageOperation.Result
        public final StorageOperation getStorageOperation() {
            return this.storageOperation;
        }
    }
}
