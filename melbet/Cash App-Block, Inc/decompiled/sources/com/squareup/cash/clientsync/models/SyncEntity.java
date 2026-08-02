package com.squareup.cash.clientsync.models;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SyncEntity {
    public final String entityId;
    public final Object entityProto;
    public final SyncEntityType entityType;
    public final Long entityVersion;
    public final SyncTopic topic;
    public final SyncValueType valueType;

    public SyncEntity(SyncTopic syncTopic, String str, SyncEntityType syncEntityType, Object obj, Long l, SyncValueType syncValueType) {
        syncTopic.getClass();
        str.getClass();
        syncEntityType.getClass();
        obj.getClass();
        this.topic = syncTopic;
        this.entityId = str;
        this.entityType = syncEntityType;
        this.entityProto = obj;
        this.entityVersion = l;
        this.valueType = syncValueType;
    }

    public static SyncEntity copy$default(SyncEntity syncEntity, SyncTopic syncTopic, com.squareup.protos.franklin.common.SyncEntity syncEntity2, int i) {
        if ((i & 1) != 0) {
            syncTopic = syncEntity.topic;
        }
        SyncTopic syncTopic2 = syncTopic;
        String str = syncEntity.entityId;
        SyncEntityType syncEntityType = syncEntity.entityType;
        Object obj = syncEntity2;
        if ((i & 8) != 0) {
            obj = syncEntity.entityProto;
        }
        Object obj2 = obj;
        Long l = syncEntity.entityVersion;
        SyncValueType syncValueType = syncEntity.valueType;
        syncEntity.getClass();
        syncTopic2.getClass();
        str.getClass();
        syncEntityType.getClass();
        obj2.getClass();
        return new SyncEntity(syncTopic2, str, syncEntityType, obj2, l, syncValueType);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncEntity)) {
            return false;
        }
        SyncEntity syncEntity = (SyncEntity) obj;
        return Intrinsics.areEqual(this.topic, syncEntity.topic) && Intrinsics.areEqual(this.entityId, syncEntity.entityId) && Intrinsics.areEqual(this.entityType, syncEntity.entityType) && Intrinsics.areEqual(this.entityProto, syncEntity.entityProto) && Intrinsics.areEqual(this.entityVersion, syncEntity.entityVersion) && Intrinsics.areEqual(this.valueType, syncEntity.valueType);
    }

    public final String getEntityId() {
        return this.entityId;
    }

    public final Object getEntityProto() {
        return this.entityProto;
    }

    public final SyncEntityType getEntityType() {
        return this.entityType;
    }

    public final Long getEntityVersion() {
        return this.entityVersion;
    }

    public final SyncTopic getTopic() {
        return this.topic;
    }

    public final SyncValueType getValueType() {
        return this.valueType;
    }

    public final int hashCode() {
        int hashCode = (this.entityProto.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entityType.value, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.topic.value) * 31, 31, this.entityId), 31)) * 31;
        Long l = this.entityVersion;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        SyncValueType syncValueType = this.valueType;
        return hashCode2 + (syncValueType != null ? Integer.hashCode(syncValueType.value) : 0);
    }

    public final String toString() {
        return "SyncEntity(topic=" + this.topic + ", entityId=" + this.entityId + ", entityType=" + this.entityType + ", entityProto=[omitted], entityVersion=" + this.entityVersion + ", valueType=" + this.valueType + ")";
    }
}
