package com.datadog.android.rum.internal.domain.event;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class ResourceTiming {
    public final long connectDuration;
    public final long connectStart;
    public final long dnsDuration;
    public final long dnsStart;
    public final long downloadDuration;
    public final long downloadStart;
    public final long firstByteDuration;
    public final long firstByteStart;
    public final long sslDuration;
    public final long sslStart;

    public ResourceTiming(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.dnsStart = j;
        this.dnsDuration = j2;
        this.connectStart = j3;
        this.connectDuration = j4;
        this.sslStart = j5;
        this.sslDuration = j6;
        this.firstByteStart = j7;
        this.firstByteDuration = j8;
        this.downloadStart = j9;
        this.downloadDuration = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceTiming)) {
            return false;
        }
        ResourceTiming resourceTiming = (ResourceTiming) obj;
        return this.dnsStart == resourceTiming.dnsStart && this.dnsDuration == resourceTiming.dnsDuration && this.connectStart == resourceTiming.connectStart && this.connectDuration == resourceTiming.connectDuration && this.sslStart == resourceTiming.sslStart && this.sslDuration == resourceTiming.sslDuration && this.firstByteStart == resourceTiming.firstByteStart && this.firstByteDuration == resourceTiming.firstByteDuration && this.downloadStart == resourceTiming.downloadStart && this.downloadDuration == resourceTiming.downloadDuration;
    }

    public final int hashCode() {
        return Long.hashCode(this.downloadDuration) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.dnsStart) * 31, 31, this.dnsDuration), 31, this.connectStart), 31, this.connectDuration), 31, this.sslStart), 31, this.sslDuration), 31, this.firstByteStart), 31, this.firstByteDuration), 31, this.downloadStart);
    }

    public final String toString() {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.dnsStart, "ResourceTiming(dnsStart=", ", dnsDuration=");
        m1149m.append(this.dnsDuration);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.connectStart, ", connectStart=", ", connectDuration=", m1149m);
        m1149m.append(this.connectDuration);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.sslStart, ", sslStart=", ", sslDuration=", m1149m);
        m1149m.append(this.sslDuration);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.firstByteStart, ", firstByteStart=", ", firstByteDuration=", m1149m);
        m1149m.append(this.firstByteDuration);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.downloadStart, ", downloadStart=", ", downloadDuration=", m1149m);
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.downloadDuration, ")", m1149m);
    }
}
