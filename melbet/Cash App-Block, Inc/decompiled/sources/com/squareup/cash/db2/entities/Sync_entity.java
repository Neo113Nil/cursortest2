package com.squareup.cash.db2.entities;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Sync_entity {
    public final byte[] entity;
    public final String entity_id;
    public final Long entity_processor_version;
    public final Long sync_entity_version;
    public final Integer sync_value_type;
    public final int topic;

    /* renamed from: type, reason: collision with root package name */
    public final int f1124type;

    public Sync_entity(String str, int i, byte[] bArr, Long l, Integer num, Long l2, int i2) {
        str.getClass();
        bArr.getClass();
        this.entity_id = str;
        this.f1124type = i;
        this.entity = bArr;
        this.entity_processor_version = l;
        this.sync_value_type = num;
        this.sync_entity_version = l2;
        this.topic = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sync_entity)) {
            return false;
        }
        Sync_entity sync_entity = (Sync_entity) obj;
        return Intrinsics.areEqual(this.entity_id, sync_entity.entity_id) && this.f1124type == sync_entity.f1124type && Intrinsics.areEqual(this.entity, sync_entity.entity) && Intrinsics.areEqual(this.entity_processor_version, sync_entity.entity_processor_version) && Intrinsics.areEqual(this.sync_value_type, sync_entity.sync_value_type) && Intrinsics.areEqual(this.sync_entity_version, sync_entity.sync_entity_version) && this.topic == sync_entity.topic;
    }

    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.entity) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.f1124type, this.entity_id.hashCode() * 31, 31)) * 31;
        Long l = this.entity_processor_version;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.sync_value_type;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.sync_entity_version;
        return Integer.hashCode(this.topic) + ((hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.entity);
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Sync_entity(entity_id=", this.f1124type, this.entity_id, ", type=", ", entity=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.entity_processor_version, arrays, ", entity_processor_version=", ", sync_value_type=", m);
        m.append(this.sync_value_type);
        m.append(", sync_entity_version=");
        m.append(this.sync_entity_version);
        m.append(", topic=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.topic, ")", m);
    }
}
