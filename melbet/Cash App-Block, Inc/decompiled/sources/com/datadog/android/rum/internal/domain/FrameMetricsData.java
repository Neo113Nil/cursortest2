package com.datadog.android.rum.internal.domain;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class FrameMetricsData {
    public long animationDuration;
    public long commandIssueDuration;
    public long deadline;
    public double displayRefreshRate;
    public long drawDuration;
    public int droppedFrames;
    public boolean firstDrawFrame;
    public long gpuDuration;
    public long inputHandlingDuration;
    public long intendedVsyncTimestamp;
    public long layoutMeasureDuration;
    public long swapBuffersDuration;
    public long syncDuration;
    public long totalDuration;
    public long unknownDelayDuration;
    public long vsyncTimestamp;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrameMetricsData)) {
            return false;
        }
        FrameMetricsData frameMetricsData = (FrameMetricsData) obj;
        return this.droppedFrames == frameMetricsData.droppedFrames && this.unknownDelayDuration == frameMetricsData.unknownDelayDuration && this.inputHandlingDuration == frameMetricsData.inputHandlingDuration && this.animationDuration == frameMetricsData.animationDuration && this.layoutMeasureDuration == frameMetricsData.layoutMeasureDuration && this.drawDuration == frameMetricsData.drawDuration && this.syncDuration == frameMetricsData.syncDuration && this.commandIssueDuration == frameMetricsData.commandIssueDuration && this.swapBuffersDuration == frameMetricsData.swapBuffersDuration && this.totalDuration == frameMetricsData.totalDuration && this.firstDrawFrame == frameMetricsData.firstDrawFrame && this.intendedVsyncTimestamp == frameMetricsData.intendedVsyncTimestamp && this.vsyncTimestamp == frameMetricsData.vsyncTimestamp && this.gpuDuration == frameMetricsData.gpuDuration && this.deadline == frameMetricsData.deadline && Double.compare(this.displayRefreshRate, frameMetricsData.displayRefreshRate) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.displayRefreshRate) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Integer.hashCode(this.droppedFrames) * 31, 31, this.unknownDelayDuration), 31, this.inputHandlingDuration), 31, this.animationDuration), 31, this.layoutMeasureDuration), 31, this.drawDuration), 31, this.syncDuration), 31, this.commandIssueDuration), 31, this.swapBuffersDuration), 31, this.totalDuration), 31, this.firstDrawFrame), 31, this.intendedVsyncTimestamp), 31, this.vsyncTimestamp), 31, this.gpuDuration), 31, this.deadline);
    }

    public final String toString() {
        int i = this.droppedFrames;
        long j = this.unknownDelayDuration;
        long j2 = this.inputHandlingDuration;
        long j3 = this.animationDuration;
        long j4 = this.layoutMeasureDuration;
        long j5 = this.drawDuration;
        long j6 = this.syncDuration;
        long j7 = this.commandIssueDuration;
        long j8 = this.swapBuffersDuration;
        long j9 = this.totalDuration;
        boolean z = this.firstDrawFrame;
        long j10 = this.intendedVsyncTimestamp;
        long j11 = this.vsyncTimestamp;
        long j12 = this.gpuDuration;
        long j13 = this.deadline;
        double d = this.displayRefreshRate;
        StringBuilder sb = new StringBuilder("FrameMetricsData(droppedFrames=");
        sb.append(i);
        sb.append(", unknownDelayDuration=");
        sb.append(j);
        Boxes$$ExternalSyntheticOutline1.m1151m(j2, ", inputHandlingDuration=", ", animationDuration=", sb);
        sb.append(j3);
        Boxes$$ExternalSyntheticOutline1.m1151m(j4, ", layoutMeasureDuration=", ", drawDuration=", sb);
        sb.append(j5);
        Boxes$$ExternalSyntheticOutline1.m1151m(j6, ", syncDuration=", ", commandIssueDuration=", sb);
        sb.append(j7);
        Boxes$$ExternalSyntheticOutline1.m1151m(j8, ", swapBuffersDuration=", ", totalDuration=", sb);
        sb.append(j9);
        sb.append(", firstDrawFrame=");
        sb.append(z);
        Boxes$$ExternalSyntheticOutline1.m1151m(j10, ", intendedVsyncTimestamp=", ", vsyncTimestamp=", sb);
        sb.append(j11);
        Boxes$$ExternalSyntheticOutline1.m1151m(j12, ", gpuDuration=", ", deadline=", sb);
        sb.append(j13);
        sb.append(", displayRefreshRate=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
