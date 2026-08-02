package com.squareup.cash.clientsync.errors;

import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncValueType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SyncEntityErrorMetadata {
    public final String entityId;
    public final SyncEntityType entityType;
    public final Long entityVersion;
    public final SyncValueType valueType;

    public SyncEntityErrorMetadata(String str, SyncEntityType syncEntityType, SyncValueType syncValueType, Long l) {
        str.getClass();
        syncEntityType.getClass();
        this.entityId = str;
        this.entityType = syncEntityType;
        this.valueType = syncValueType;
        this.entityVersion = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncEntityErrorMetadata)) {
            return false;
        }
        SyncEntityErrorMetadata syncEntityErrorMetadata = (SyncEntityErrorMetadata) obj;
        return Intrinsics.areEqual(this.entityId, syncEntityErrorMetadata.entityId) && Intrinsics.areEqual(this.entityType, syncEntityErrorMetadata.entityType) && Intrinsics.areEqual(this.valueType, syncEntityErrorMetadata.valueType) && Intrinsics.areEqual(this.entityVersion, syncEntityErrorMetadata.entityVersion);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entityType.value, this.entityId.hashCode() * 31, 31);
        SyncValueType syncValueType = this.valueType;
        int hashCode = (m + (syncValueType == null ? 0 : Integer.hashCode(syncValueType.value))) * 31;
        Long l = this.entityVersion;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return this.entityId + ":" + this.entityType + ":" + this.valueType + ":" + this.entityVersion;
    }
}
