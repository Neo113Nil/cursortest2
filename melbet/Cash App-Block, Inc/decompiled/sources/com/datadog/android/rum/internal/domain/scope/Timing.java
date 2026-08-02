package com.datadog.android.rum.internal.domain.scope;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class Timing {
    public final long duration;
    public final long startTime;

    public Timing(long j, long j2) {
        this.startTime = j;
        this.duration = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timing)) {
            return false;
        }
        Timing timing = (Timing) obj;
        return this.startTime == timing.startTime && this.duration == timing.duration;
    }

    public final int hashCode() {
        return Long.hashCode(this.duration) + (Long.hashCode(this.startTime) * 31);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.duration, ")", Boxes$$ExternalSyntheticOutline1.m1149m(this.startTime, "Timing(startTime=", ", duration="));
    }
}
