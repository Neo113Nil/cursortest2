package com.squareup.cash.clientsync.pipeline;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.clientsync.pipeline.StorageOperation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ReplaceRanges implements StorageOperation {
    public final ArrayList rangesToAdd;
    public final List rangesToDelete;
    public final TaskId taskId;

    public final class Result implements StorageOperation.Result {
        public final ReplaceRanges storageOperation;

        public Result(ReplaceRanges replaceRanges) {
            this.storageOperation = replaceRanges;
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
    }

    public ReplaceRanges(TaskId taskId, List list, ArrayList arrayList) {
        taskId.getClass();
        list.getClass();
        this.taskId = taskId;
        this.rangesToDelete = list;
        this.rangesToAdd = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReplaceRanges)) {
            return false;
        }
        ReplaceRanges replaceRanges = (ReplaceRanges) obj;
        return Intrinsics.areEqual(this.taskId, replaceRanges.taskId) && Intrinsics.areEqual(this.rangesToDelete, replaceRanges.rangesToDelete) && this.rangesToAdd.equals(replaceRanges.rangesToAdd);
    }

    @Override // com.squareup.cash.clientsync.pipeline.StorageOperation
    public final TaskId getTaskId() {
        return this.taskId;
    }

    public final int hashCode() {
        return this.rangesToAdd.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.taskId.id.hashCode() * 31, 31, this.rangesToDelete);
    }

    public final String toString() {
        int size = this.rangesToDelete.size();
        int size2 = this.rangesToAdd.size();
        StringBuilder sb = new StringBuilder("ReplaceRanges(taskId=");
        sb.append(this.taskId);
        sb.append(", rangesToDelete=[");
        sb.append(size);
        sb.append("], rangesToAdd=[");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(size2, "])", sb);
    }
}
