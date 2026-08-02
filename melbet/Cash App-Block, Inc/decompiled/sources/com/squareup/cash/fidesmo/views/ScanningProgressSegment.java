package com.squareup.cash.fidesmo.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes8.dex */
public final class ScanningProgressSegment {
    public final int endInclusive;
    public final int startInclusive;

    public ScanningProgressSegment(int i, int i2) {
        this.startInclusive = i;
        this.endInclusive = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanningProgressSegment)) {
            return false;
        }
        ScanningProgressSegment scanningProgressSegment = (ScanningProgressSegment) obj;
        return this.startInclusive == scanningProgressSegment.startInclusive && this.endInclusive == scanningProgressSegment.endInclusive;
    }

    public final int hashCode() {
        return Integer.hashCode(this.endInclusive) + (Integer.hashCode(this.startInclusive) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.startInclusive, this.endInclusive, "ScanningProgressSegment(startInclusive=", ", endInclusive=", ")");
    }
}
