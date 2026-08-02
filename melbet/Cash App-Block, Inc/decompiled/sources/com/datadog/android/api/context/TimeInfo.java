package com.datadog.android.api.context;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes.dex */
public final class TimeInfo {
    public static final TimeInfo EMPTY = new TimeInfo(0, 0, 0, 0);
    public final long deviceTimeNs;
    public final long serverTimeNs;
    public final long serverTimeOffsetMs;
    public final long serverTimeOffsetNs;

    public TimeInfo(long j, long j2, long j3, long j4) {
        this.deviceTimeNs = j;
        this.serverTimeNs = j2;
        this.serverTimeOffsetNs = j3;
        this.serverTimeOffsetMs = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeInfo)) {
            return false;
        }
        TimeInfo timeInfo = (TimeInfo) obj;
        return this.deviceTimeNs == timeInfo.deviceTimeNs && this.serverTimeNs == timeInfo.serverTimeNs && this.serverTimeOffsetNs == timeInfo.serverTimeOffsetNs && this.serverTimeOffsetMs == timeInfo.serverTimeOffsetMs;
    }

    public final int hashCode() {
        return Long.hashCode(this.serverTimeOffsetMs) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.deviceTimeNs) * 31, 31, this.serverTimeNs), 31, this.serverTimeOffsetNs);
    }

    public final String toString() {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.deviceTimeNs, "TimeInfo(deviceTimeNs=", ", serverTimeNs=");
        m1149m.append(this.serverTimeNs);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.serverTimeOffsetNs, ", serverTimeOffsetNs=", ", serverTimeOffsetMs=", m1149m);
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.serverTimeOffsetMs, ")", m1149m);
    }
}
