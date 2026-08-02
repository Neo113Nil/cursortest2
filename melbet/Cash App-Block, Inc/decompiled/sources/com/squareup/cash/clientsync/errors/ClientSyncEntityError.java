package com.squareup.cash.clientsync.errors;

import com.squareup.cash.clientsync.UtilsKt;
import com.squareup.protos.franklin.common.EncryptedSyncEntity;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncEntityType;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.franklin.common.SyncValueType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/clientsync/errors/ClientSyncEntityError;", "Lcom/squareup/cash/clientsync/errors/ClientSyncReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ClientSyncEntityError extends ClientSyncReportedError {
    public final String message;

    /* renamed from: type, reason: collision with root package name */
    public final String f1113type;

    public ClientSyncEntityError(SyncEntity syncEntity) {
        syncEntity.getClass();
        String str = syncEntity.entity_id;
        EncryptedSyncEntity encryptedSyncEntity = syncEntity.encrypted_sync_entity;
        str = str == null ? "ID_MISSING" : str;
        StringBuilder sb = new StringBuilder();
        SyncEntityType type2 = UtilsKt.type(syncEntity);
        sb.append(type2 != null ? String.valueOf(type2) : "TYPE_MISSING");
        SyncValue syncValue = syncEntity.sync_value;
        SyncValueType syncValueType = (syncValue == null || (syncValueType = syncValue.f1393type) == null) ? encryptedSyncEntity != null ? encryptedSyncEntity.sync_value_type : null : syncValueType;
        if (syncValueType != null) {
            sb.append("/" + syncValueType);
        }
        String sb2 = sb.toString();
        this.f1113type = sb2;
        boolean z = encryptedSyncEntity != null;
        Boolean bool = syncEntity.deleted;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("id=", str, "; type=", sb2, "; deleted=");
        m.append(booleanValue);
        m.append("; encrypted:");
        m.append(z);
        this.message = m.toString();
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    /* renamed from: getGroupingDescriptor, reason: from getter */
    public String getF1113type() {
        return this.f1113type;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
