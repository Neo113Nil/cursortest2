package com.squareup.cash.clientsync.pipeline;

import com.squareup.cash.clientsync.models.SyncTrigger;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SyncRequestOperation {
    public final SyncScope scope;
    public final TaskId taskId;
    public final SyncTrigger trigger;

    /* loaded from: classes8.dex */
    public interface Result {

        /* loaded from: classes6.dex */
        public final class Failure implements Result {
            public final SyncRequestOperation syncRequestOperation;
            public final List syncResponseOperationResults;

            public Failure(SyncRequestOperation syncRequestOperation, List list) {
                syncRequestOperation.getClass();
                list.getClass();
                this.syncRequestOperation = syncRequestOperation;
                this.syncResponseOperationResults = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) obj;
                return Intrinsics.areEqual(this.syncRequestOperation, failure.syncRequestOperation) && Intrinsics.areEqual(this.syncResponseOperationResults, failure.syncResponseOperationResults);
            }

            @Override // com.squareup.cash.clientsync.pipeline.SyncRequestOperation.Result
            public final SyncRequestOperation getSyncRequestOperation() {
                return this.syncRequestOperation;
            }

            public final int hashCode() {
                return this.syncResponseOperationResults.hashCode() + (this.syncRequestOperation.hashCode() * 31);
            }

            public final String toString() {
                return "Failure(syncRequestOperation=" + this.syncRequestOperation + ", syncResponseOperationResults=" + this.syncResponseOperationResults + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class Skipped implements Result {
            public final SyncRequestOperation syncRequestOperation;

            public Skipped(SyncRequestOperation syncRequestOperation) {
                syncRequestOperation.getClass();
                this.syncRequestOperation = syncRequestOperation;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Skipped) && Intrinsics.areEqual(this.syncRequestOperation, ((Skipped) obj).syncRequestOperation);
            }

            @Override // com.squareup.cash.clientsync.pipeline.SyncRequestOperation.Result
            public final SyncRequestOperation getSyncRequestOperation() {
                return this.syncRequestOperation;
            }

            public final int hashCode() {
                return this.syncRequestOperation.hashCode();
            }

            public final String toString() {
                return "Skipped(syncRequestOperation=" + this.syncRequestOperation + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class Success implements Result {
            public final SyncRequestOperation syncRequestOperation;
            public final List syncResponseOperationResults;

            public Success(SyncRequestOperation syncRequestOperation, List list) {
                syncRequestOperation.getClass();
                this.syncRequestOperation = syncRequestOperation;
                this.syncResponseOperationResults = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return Intrinsics.areEqual(this.syncRequestOperation, success.syncRequestOperation) && this.syncResponseOperationResults.equals(success.syncResponseOperationResults);
            }

            @Override // com.squareup.cash.clientsync.pipeline.SyncRequestOperation.Result
            public final SyncRequestOperation getSyncRequestOperation() {
                return this.syncRequestOperation;
            }

            public final int hashCode() {
                return this.syncResponseOperationResults.hashCode() + (this.syncRequestOperation.hashCode() * 31);
            }

            public final String toString() {
                return "Success(syncRequestOperation=" + this.syncRequestOperation + ", syncResponseOperationResults=" + this.syncResponseOperationResults + ")";
            }
        }

        SyncRequestOperation getSyncRequestOperation();
    }

    public SyncRequestOperation(TaskId taskId, SyncTrigger syncTrigger, SyncScope syncScope) {
        this.taskId = taskId;
        this.trigger = syncTrigger;
        this.scope = syncScope;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncRequestOperation)) {
            return false;
        }
        SyncRequestOperation syncRequestOperation = (SyncRequestOperation) obj;
        return this.taskId.equals(syncRequestOperation.taskId) && this.trigger == syncRequestOperation.trigger && this.scope.equals(syncRequestOperation.scope);
    }

    public final int hashCode() {
        return this.scope.hashCode() + ((this.trigger.hashCode() + (this.taskId.id.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SyncRequestOperation(taskId=" + this.taskId + ", trigger=" + this.trigger + ", scope=" + this.scope + ")";
    }
}
