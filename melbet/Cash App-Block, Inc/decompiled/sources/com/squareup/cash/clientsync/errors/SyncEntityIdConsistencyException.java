package com.squareup.cash.clientsync.errors;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientsync.SyncEntityMetadata;
import com.squareup.protos.franklin.common.SyncEntityType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/squareup/cash/clientsync/errors/SyncEntityIdConsistencyException;", "Lcom/squareup/cash/clientsync/errors/ClientSyncReportedError;", "IdExpectation", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SyncEntityIdConsistencyException extends ClientSyncReportedError {
    public final IdExpectation idExpectation;
    public final boolean isBackgroundError;
    public final String message;
    public final Map metadata;

    /* renamed from: type, reason: collision with root package name */
    public final SyncEntityType f1114type;

    public final class IdExpectation {
        public final SyncEntityMetadata entityMetadata;
        public final String payloadField;
        public final String payloadIdValue;

        public IdExpectation(SyncEntityMetadata syncEntityMetadata, String str, String str2) {
            str.getClass();
            this.entityMetadata = syncEntityMetadata;
            this.payloadField = str;
            this.payloadIdValue = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdExpectation)) {
                return false;
            }
            IdExpectation idExpectation = (IdExpectation) obj;
            return this.entityMetadata.equals(idExpectation.entityMetadata) && Intrinsics.areEqual(this.payloadField, idExpectation.payloadField) && Intrinsics.areEqual(this.payloadIdValue, idExpectation.payloadIdValue);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entityMetadata.hashCode() * 31, 31, this.payloadField);
            String str = this.payloadIdValue;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IdExpectation(entityMetadata=");
            sb.append(this.entityMetadata);
            sb.append(", payloadField=");
            sb.append(this.payloadField);
            sb.append(", payloadIdValue=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.payloadIdValue, ")");
        }
    }

    public SyncEntityIdConsistencyException(SyncEntityType syncEntityType, IdExpectation idExpectation) {
        this.f1114type = syncEntityType;
        this.idExpectation = idExpectation;
        String str = idExpectation.payloadField;
        this.message = "Expected SyncEntity.id to match " + str + " in payload of " + syncEntityType;
        SyncEntityMetadata syncEntityMetadata = idExpectation.entityMetadata;
        String str2 = syncEntityMetadata.id;
        Long l = syncEntityMetadata.version;
        String str3 = idExpectation.payloadIdValue;
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(l, "id(", str2, ") version(", ") payloadField(");
        m.append(str);
        m.append(") payloadIdValue(");
        m.append(str3);
        m.append(")");
        this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Client Sync", MapsKt__MapsJVMKt.mapOf(new Pair("entities", CollectionsKt__CollectionsJVMKt.listOf(m.toString()))));
        this.isBackgroundError = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncEntityIdConsistencyException)) {
            return false;
        }
        SyncEntityIdConsistencyException syncEntityIdConsistencyException = (SyncEntityIdConsistencyException) obj;
        return this.f1114type == syncEntityIdConsistencyException.f1114type && Intrinsics.areEqual(this.idExpectation, syncEntityIdConsistencyException.idExpectation);
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    /* renamed from: getGroupingDescriptor */
    public final String getF1113type() {
        return this.f1114type.toString();
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    @Override // com.squareup.cash.observability.types.ReportedError
    public final Map getMetadata() {
        return this.metadata;
    }

    public final int hashCode() {
        return this.idExpectation.hashCode() + (this.f1114type.hashCode() * 31);
    }

    @Override // com.squareup.cash.clientsync.errors.ClientSyncReportedError
    /* renamed from: isBackgroundError, reason: from getter */
    public final boolean getIsBackgroundError() {
        return this.isBackgroundError;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "SyncEntityIdConsistencyException(type=" + this.f1114type + ", idExpectation=" + this.idExpectation + ")";
    }
}
