package com.squareup.cash.clientsync.pipeline;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientsync.models.ResetTrigger;
import com.squareup.cash.clientsync.pipeline.StorageOperation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class DeleteAllRangesAndEntities implements StorageOperation {
    public final TaskId taskId;
    public final ResetTrigger trigger;

    public DeleteAllRangesAndEntities(TaskId taskId, ResetTrigger resetTrigger) {
        taskId.getClass();
        this.taskId = taskId;
        this.trigger = resetTrigger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteAllRangesAndEntities)) {
            return false;
        }
        DeleteAllRangesAndEntities deleteAllRangesAndEntities = (DeleteAllRangesAndEntities) obj;
        return Intrinsics.areEqual(this.taskId, deleteAllRangesAndEntities.taskId) && this.trigger == deleteAllRangesAndEntities.trigger;
    }

    @Override // com.squareup.cash.clientsync.pipeline.StorageOperation
    public final TaskId getTaskId() {
        return this.taskId;
    }

    public final ResetTrigger getTrigger() {
        return this.trigger;
    }

    public final int hashCode() {
        return this.trigger.hashCode() + (this.taskId.id.hashCode() * 31);
    }

    public final String toString() {
        return "DeleteAllRangesAndEntities(taskId=" + this.taskId + ", trigger=" + this.trigger + ")";
    }

    public final class Result implements StorageOperation.Result {
        public final long deletedEntityCount;
        public final long deletedRangeCount;
        public final DeleteAllRangesAndEntities storageOperation;

        public Result(DeleteAllRangesAndEntities deleteAllRangesAndEntities, long j, long j2) {
            this.storageOperation = deleteAllRangesAndEntities;
            this.deletedRangeCount = j;
            this.deletedEntityCount = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return this.storageOperation.equals(result.storageOperation) && this.deletedRangeCount == result.deletedRangeCount && this.deletedEntityCount == result.deletedEntityCount;
        }

        public final long getDeletedEntityCount() {
            return this.deletedEntityCount;
        }

        public final long getDeletedRangeCount() {
            return this.deletedRangeCount;
        }

        @Override // com.squareup.cash.clientsync.pipeline.StorageOperation.Result
        public final DeleteAllRangesAndEntities getStorageOperation() {
            return this.storageOperation;
        }

        public final int hashCode() {
            return Long.hashCode(this.deletedEntityCount) + Recorder$$ExternalSyntheticOutline2.m(this.storageOperation.hashCode() * 31, 31, this.deletedRangeCount);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(storageOperation=");
            sb.append(this.storageOperation);
            sb.append(", deletedRangeCount=");
            sb.append(this.deletedRangeCount);
            return Boxes$$ExternalSyntheticOutline1.m(this.deletedEntityCount, ", deletedEntityCount=", ")", sb);
        }

        @Override // com.squareup.cash.clientsync.pipeline.StorageOperation.Result
        public final StorageOperation getStorageOperation() {
            return this.storageOperation;
        }
    }
}
