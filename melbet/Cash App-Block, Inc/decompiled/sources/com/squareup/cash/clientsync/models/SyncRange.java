package com.squareup.cash.clientsync.models;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SyncRange {
    public final byte[] bytes;
    public final SyncTopic topic;

    public SyncRange(SyncTopic syncTopic, byte[] bArr) {
        syncTopic.getClass();
        bArr.getClass();
        this.topic = syncTopic;
        this.bytes = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SyncRange)) {
            return false;
        }
        SyncRange syncRange = (SyncRange) obj;
        return Intrinsics.areEqual(this.topic, syncRange.topic) && Arrays.equals(this.bytes, syncRange.bytes);
    }

    public final SyncTopic getTopic() {
        return this.topic;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.bytes) + (Integer.hashCode(this.topic.value) * 31);
    }

    public final String toString() {
        return "SyncRange(topic=" + this.topic + ", bytes=[" + this.bytes.length + "])";
    }
}
