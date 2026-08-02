package com.squareup.cash.clientsync;

import com.squareup.cash.clientsync.models.SyncTopic;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class Sync_range {
    public final byte[] bytes;
    public final SyncTopic topic;

    public Sync_range(SyncTopic syncTopic, byte[] bArr) {
        syncTopic.getClass();
        bArr.getClass();
        this.topic = syncTopic;
        this.bytes = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sync_range)) {
            return false;
        }
        Sync_range sync_range = (Sync_range) obj;
        return Intrinsics.areEqual(this.topic, sync_range.topic) && Intrinsics.areEqual(this.bytes, sync_range.bytes);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.bytes) + (Integer.hashCode(this.topic.value) * 31);
    }

    public final String toString() {
        return "Sync_range(topic=" + this.topic + ", bytes=" + Arrays.toString(this.bytes) + ")";
    }
}
