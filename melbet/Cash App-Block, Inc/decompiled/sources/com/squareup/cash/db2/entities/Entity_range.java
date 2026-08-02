package com.squareup.cash.db2.entities;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Entity_range {
    public final byte[] range;
    public final int topic;

    public Entity_range(byte[] bArr, int i) {
        this.range = bArr;
        this.topic = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entity_range)) {
            return false;
        }
        Entity_range entity_range = (Entity_range) obj;
        return Intrinsics.areEqual(this.range, entity_range.range) && this.topic == entity_range.topic;
    }

    public final byte[] getRange() {
        return this.range;
    }

    public final int getTopic() {
        return this.topic;
    }

    public final int hashCode() {
        byte[] bArr = this.range;
        return Integer.hashCode(this.topic) + ((bArr == null ? 0 : Arrays.hashCode(bArr)) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline1.m("Entity_range(range=", this.topic, Arrays.toString(this.range), ", topic=", ")");
    }
}
