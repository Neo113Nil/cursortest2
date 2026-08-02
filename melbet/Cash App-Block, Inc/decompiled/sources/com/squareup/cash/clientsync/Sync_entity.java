package com.squareup.cash.clientsync;

import com.squareup.cash.clientsync.models.SyncEntityType;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.models.SyncValueType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Sync_entity {
    public final byte[] entity_data;
    public final String entity_id;
    public final SyncEntityType entity_type;
    public final Long entity_version;
    public final SyncTopic topic;
    public final SyncValueType value_type;

    public Sync_entity(SyncTopic syncTopic, String str, SyncEntityType syncEntityType, byte[] bArr, Long l, SyncValueType syncValueType) {
        syncTopic.getClass();
        str.getClass();
        syncEntityType.getClass();
        bArr.getClass();
        this.topic = syncTopic;
        this.entity_id = str;
        this.entity_type = syncEntityType;
        this.entity_data = bArr;
        this.entity_version = l;
        this.value_type = syncValueType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sync_entity)) {
            return false;
        }
        Sync_entity sync_entity = (Sync_entity) obj;
        return Intrinsics.areEqual(this.topic, sync_entity.topic) && Intrinsics.areEqual(this.entity_id, sync_entity.entity_id) && Intrinsics.areEqual(this.entity_type, sync_entity.entity_type) && Intrinsics.areEqual(this.entity_data, sync_entity.entity_data) && Intrinsics.areEqual(this.entity_version, sync_entity.entity_version) && Intrinsics.areEqual(this.value_type, sync_entity.value_type);
    }

    public final byte[] getEntity_data() {
        return this.entity_data;
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final SyncEntityType getEntity_type() {
        return this.entity_type;
    }

    public final Long getEntity_version() {
        return this.entity_version;
    }

    public final SyncTopic getTopic() {
        return this.topic;
    }

    public final SyncValueType getValue_type() {
        return this.value_type;
    }

    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.entity_data) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entity_type.value, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Integer.hashCode(this.topic.value) * 31, 31, this.entity_id), 31)) * 31;
        Long l = this.entity_version;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        SyncValueType syncValueType = this.value_type;
        return hashCode2 + (syncValueType != null ? Integer.hashCode(syncValueType.value) : 0);
    }

    public final String toString() {
        return "Sync_entity(topic=" + this.topic + ", entity_id=" + this.entity_id + ", entity_type=" + this.entity_type + ", entity_data=" + Arrays.toString(this.entity_data) + ", entity_version=" + this.entity_version + ", value_type=" + this.value_type + ")";
    }
}
