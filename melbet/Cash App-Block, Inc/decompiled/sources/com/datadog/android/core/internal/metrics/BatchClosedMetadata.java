package com.datadog.android.core.internal.metrics;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class BatchClosedMetadata {
    public final long eventsCount;
    public final long lastTimeWasUsedInMs;

    public BatchClosedMetadata(long j, long j2) {
        this.lastTimeWasUsedInMs = j;
        this.eventsCount = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchClosedMetadata)) {
            return false;
        }
        BatchClosedMetadata batchClosedMetadata = (BatchClosedMetadata) obj;
        return this.lastTimeWasUsedInMs == batchClosedMetadata.lastTimeWasUsedInMs && this.eventsCount == batchClosedMetadata.eventsCount;
    }

    public final int hashCode() {
        return Long.hashCode(this.eventsCount) + (Long.hashCode(this.lastTimeWasUsedInMs) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.eventsCount, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.lastTimeWasUsedInMs, "BatchClosedMetadata(lastTimeWasUsedInMs=", ", eventsCount="));
    }
}
