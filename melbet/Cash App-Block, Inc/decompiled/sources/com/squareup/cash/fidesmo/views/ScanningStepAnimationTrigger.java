package com.squareup.cash.fidesmo.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes6.dex */
public final class ScanningStepAnimationTrigger {
    public final int progressPercent;
    public final int turnCount;

    public ScanningStepAnimationTrigger(int i, int i2) {
        this.progressPercent = i;
        this.turnCount = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanningStepAnimationTrigger)) {
            return false;
        }
        ScanningStepAnimationTrigger scanningStepAnimationTrigger = (ScanningStepAnimationTrigger) obj;
        return this.progressPercent == scanningStepAnimationTrigger.progressPercent && this.turnCount == scanningStepAnimationTrigger.turnCount;
    }

    public final int hashCode() {
        return Integer.hashCode(this.turnCount) + (Integer.hashCode(this.progressPercent) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.progressPercent, this.turnCount, "ScanningStepAnimationTrigger(progressPercent=", ", turnCount=", ")");
    }
}
