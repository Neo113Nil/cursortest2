package com.squareup.cash.clientsync.pipeline;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.clientsync.network.ServerSyncResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SyncResponseOperation {
    public final Origin origin;
    public final ServerSyncResponse response;
    public final TaskId taskId;

    public interface Origin {

        /* loaded from: classes8.dex */
        public final class FromResponseContext implements Origin {
            public static final FromResponseContext INSTANCE = new FromResponseContext();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FromResponseContext);
            }

            public final int hashCode() {
                return -1554939467;
            }

            public final String toString() {
                return "FromResponseContext";
            }
        }

        /* loaded from: classes8.dex */
        public final class FromSyncRequest implements Origin {
            public final List requestRanges;

            public FromSyncRequest(List list) {
                list.getClass();
                this.requestRanges = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FromSyncRequest) && Intrinsics.areEqual(this.requestRanges, ((FromSyncRequest) obj).requestRanges);
            }

            public final int hashCode() {
                return this.requestRanges.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("FromSyncRequest(requestRanges=", ")", this.requestRanges);
            }
        }
    }

    /* loaded from: classes8.dex */
    public final class Result {
        public final List storageOperationResults;
        public final SyncResponseOperation syncResponseOperation;

        public Result(SyncResponseOperation syncResponseOperation, List list) {
            syncResponseOperation.getClass();
            list.getClass();
            this.syncResponseOperation = syncResponseOperation;
            this.storageOperationResults = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.areEqual(this.syncResponseOperation, result.syncResponseOperation) && Intrinsics.areEqual(this.storageOperationResults, result.storageOperationResults);
        }

        public final SyncResponseOperation getSyncResponseOperation() {
            return this.syncResponseOperation;
        }

        public final int hashCode() {
            return this.storageOperationResults.hashCode() + (this.syncResponseOperation.hashCode() * 31);
        }

        public final String toString() {
            return "Result(syncResponseOperation=" + this.syncResponseOperation + ", storageOperationResults=" + this.storageOperationResults + ")";
        }
    }

    public SyncResponseOperation(TaskId taskId, Origin origin, ServerSyncResponse serverSyncResponse) {
        serverSyncResponse.getClass();
        this.taskId = taskId;
        this.origin = origin;
        this.response = serverSyncResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncResponseOperation)) {
            return false;
        }
        SyncResponseOperation syncResponseOperation = (SyncResponseOperation) obj;
        return this.taskId.equals(syncResponseOperation.taskId) && this.origin.equals(syncResponseOperation.origin) && Intrinsics.areEqual(this.response, syncResponseOperation.response);
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final ServerSyncResponse getResponse() {
        return this.response;
    }

    public final TaskId getTaskId() {
        return this.taskId;
    }

    public final int hashCode() {
        return this.response.hashCode() + ((this.origin.hashCode() + (this.taskId.id.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SyncResponseOperation(taskId=" + this.taskId + ", origin=" + this.origin + ", response=" + this.response + ")";
    }
}
