package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.pipeline.StorageOperation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class UpdateEntity implements EntityStorageOperation {
    public final SyncEntity entity;
    public final TaskId taskId;

    public UpdateEntity(TaskId taskId, SyncEntity syncEntity) {
        taskId.getClass();
        this.taskId = taskId;
        this.entity = syncEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateEntity)) {
            return false;
        }
        UpdateEntity updateEntity = (UpdateEntity) obj;
        return Intrinsics.areEqual(this.taskId, updateEntity.taskId) && this.entity.equals(updateEntity.entity);
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
        return "UpdateEntity(taskId=" + this.taskId + ", entity=" + this.entity + ")";
    }

    public final class Result implements StorageOperation.Result {
        public final UpdateEntity storageOperation;

        public Result(UpdateEntity updateEntity) {
            this.storageOperation = updateEntity;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && this.storageOperation.equals(((Result) obj).storageOperation);
        }

        @Override // com.squareup.cash.clientsync.pipeline.StorageOperation.Result
        public final StorageOperation getStorageOperation() {
            return this.storageOperation;
        }

        public final int hashCode() {
            return this.storageOperation.hashCode();
        }

        public final String toString() {
            return "Result(storageOperation=" + this.storageOperation + ")";
        }

        @Override // com.squareup.cash.clientsync.pipeline.StorageOperation.Result
        public final UpdateEntity getStorageOperation() {
            return this.storageOperation;
        }
    }
}
