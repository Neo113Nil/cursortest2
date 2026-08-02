package com.datadog.android.rum.internal.domain.state;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ViewUIPerformanceReport {
    public long freezeFramesDuration;
    public final long minViewLifetimeThresholdNs;
    public long slowFramesDurationNs;
    public final Queue slowFramesRecords;
    public long totalFramesDurationNs;
    public final long viewStartedTimeStamp;

    public ViewUIPerformanceReport(long j, Queue queue, long j2, long j3, long j4, long j5) {
        queue.getClass();
        this.viewStartedTimeStamp = j;
        this.slowFramesRecords = queue;
        this.totalFramesDurationNs = j2;
        this.slowFramesDurationNs = j3;
        this.freezeFramesDuration = j4;
        this.minViewLifetimeThresholdNs = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewUIPerformanceReport)) {
            return false;
        }
        ViewUIPerformanceReport viewUIPerformanceReport = (ViewUIPerformanceReport) obj;
        return this.viewStartedTimeStamp == viewUIPerformanceReport.viewStartedTimeStamp && Intrinsics.areEqual(this.slowFramesRecords, viewUIPerformanceReport.slowFramesRecords) && this.totalFramesDurationNs == viewUIPerformanceReport.totalFramesDurationNs && this.slowFramesDurationNs == viewUIPerformanceReport.slowFramesDurationNs && this.freezeFramesDuration == viewUIPerformanceReport.freezeFramesDuration && this.minViewLifetimeThresholdNs == viewUIPerformanceReport.minViewLifetimeThresholdNs;
    }

    public final int hashCode() {
        return Long.hashCode(this.minViewLifetimeThresholdNs) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.slowFramesRecords.hashCode() + (Long.hashCode(this.viewStartedTimeStamp) * 31)) * 31, 31, this.totalFramesDurationNs), 31, this.slowFramesDurationNs), 31, this.freezeFramesDuration);
    }

    public final String toString() {
        long j = this.totalFramesDurationNs;
        long j2 = this.slowFramesDurationNs;
        long j3 = this.freezeFramesDuration;
        StringBuilder sb = new StringBuilder("ViewUIPerformanceReport(viewStartedTimeStamp=");
        sb.append(this.viewStartedTimeStamp);
        sb.append(", slowFramesRecords=");
        sb.append(this.slowFramesRecords);
        Boxes$$ExternalSyntheticOutline1.m1151m(j, ", totalFramesDurationNs=", ", slowFramesDurationNs=", sb);
        sb.append(j2);
        Boxes$$ExternalSyntheticOutline1.m1151m(j3, ", freezeFramesDuration=", ", minViewLifetimeThresholdNs=", sb);
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.minViewLifetimeThresholdNs, ")", sb);
    }
}
