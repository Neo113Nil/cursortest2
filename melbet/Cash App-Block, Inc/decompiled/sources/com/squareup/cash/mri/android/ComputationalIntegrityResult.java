package com.squareup.cash.mri.android;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class ComputationalIntegrityResult {
    public final ComputationalIntegrityConfig config;
    public final long cpuTimeMs;
    public final long inputTimestampMs;
    public final String outputHash;
    public final long wallClockMs;

    public ComputationalIntegrityResult(long j, long j2, long j3, String str, ComputationalIntegrityConfig computationalIntegrityConfig) {
        this.wallClockMs = j;
        this.cpuTimeMs = j2;
        this.inputTimestampMs = j3;
        this.outputHash = str;
        this.config = computationalIntegrityConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComputationalIntegrityResult)) {
            return false;
        }
        ComputationalIntegrityResult computationalIntegrityResult = (ComputationalIntegrityResult) obj;
        return this.wallClockMs == computationalIntegrityResult.wallClockMs && this.cpuTimeMs == computationalIntegrityResult.cpuTimeMs && this.inputTimestampMs == computationalIntegrityResult.inputTimestampMs && this.outputHash.equals(computationalIntegrityResult.outputHash) && this.config.equals(computationalIntegrityResult.config);
    }

    public final ComputationalIntegrityConfig getConfig() {
        return this.config;
    }

    public final long getCpuTimeMs() {
        return this.cpuTimeMs;
    }

    public final long getInputTimestampMs() {
        return this.inputTimestampMs;
    }

    public final String getOutputHash() {
        return this.outputHash;
    }

    public final long getWallClockMs() {
        return this.wallClockMs;
    }

    public final int hashCode() {
        return this.config.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Long.hashCode(this.wallClockMs) * 31, 31, this.cpuTimeMs), 31, this.inputTimestampMs), 31, this.outputHash);
    }

    public final String toString() {
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(this.wallClockMs, "ComputationalIntegrityResult(wallClockMs=", ", cpuTimeMs=");
        m1149m.append(this.cpuTimeMs);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.inputTimestampMs, ", inputTimestampMs=", ", outputHash=", m1149m);
        m1149m.append(this.outputHash);
        m1149m.append(", config=");
        m1149m.append(this.config);
        m1149m.append(")");
        return m1149m.toString();
    }
}
