package com.datadog.android.rum.internal.domain;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class Time {
    public final long nanoTime;
    public final long timestamp;

    public /* synthetic */ Time() {
        this(System.currentTimeMillis(), System.nanoTime());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Time)) {
            return false;
        }
        Time time = (Time) obj;
        return this.timestamp == time.timestamp && this.nanoTime == time.nanoTime;
    }

    public final int hashCode() {
        return Long.hashCode(this.nanoTime) + (Long.hashCode(this.timestamp) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.nanoTime, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.timestamp, "Time(timestamp=", ", nanoTime="));
    }

    public Time(long j, long j2) {
        this.timestamp = j;
        this.nanoTime = j2;
    }
}
