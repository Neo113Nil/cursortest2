package com.squareup.cash.clientsync.errors;

import com.squareup.cash.clientsync.pipeline.TaskId;
import com.squareup.protos.franklin.common.SyncEntity;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientsync/errors/ClientSyncEntityFieldValidationError;", "Lcom/squareup/cash/clientsync/errors/ClientSyncEntityError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ClientSyncEntityFieldValidationError extends ClientSyncEntityError {
    public final SyncEntity entity;
    public final String errorDescription;
    public final String groupingDescriptor;
    public final boolean isBackgroundError;
    public final String message;
    public final TaskId taskId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientSyncEntityFieldValidationError(SyncEntity syncEntity, TaskId taskId, String str) {
        super(syncEntity);
        syncEntity.getClass();
        taskId.getClass();
        this.entity = syncEntity;
        this.taskId = taskId;
        this.errorDescription = str;
        this.message = super.message + "; taskId:" + taskId + "; errorDescription:" + str;
        this.groupingDescriptor = str;
        this.isBackgroundError = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientSyncEntityFieldValidationError)) {
            return false;
        }
        ClientSyncEntityFieldValidationError clientSyncEntityFieldValidationError = (ClientSyncEntityFieldValidationError) obj;
        return Intrinsics.areEqual(this.entity, clientSyncEntityFieldValidationError.entity) && Intrinsics.areEqual(this.taskId, clientSyncEntityFieldValidationError.taskId) && Intrinsics.areEqual(this.errorDescription, clientSyncEntityFieldValidationError.errorDescription);
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncEntityError, com.squareup.cash.observability.types.ReportedError
    /* renamed from: getGroupingDescriptor, reason: from getter */
    public final String getF1113type() {
        return this.groupingDescriptor;
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncEntityError, java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        return this.errorDescription.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entity.hashCode() * 31, 31, this.taskId.id);
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncReportedError
    /* renamed from: isBackgroundError, reason: from getter */
    public final boolean getIsBackgroundError() {
        return this.isBackgroundError;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientSyncEntityFieldValidationError(entity=");
        sb.append(this.entity);
        sb.append(", taskId=");
        sb.append(this.taskId);
        sb.append(", errorDescription=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.errorDescription, ")");
    }
}
