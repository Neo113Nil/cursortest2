package com.squareup.cash.fidesmo.views;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class ScanningStabilityAnimation {
    public static final ScanningStabilityAnimation Idle = new ScanningStabilityAnimation(RecyclerView.DECELERATION_RATE, 1.0f);
    public final float pulseScale;
    public final float rotationDegrees;

    public ScanningStabilityAnimation(float f, float f2) {
        this.rotationDegrees = f;
        this.pulseScale = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanningStabilityAnimation)) {
            return false;
        }
        ScanningStabilityAnimation scanningStabilityAnimation = (ScanningStabilityAnimation) obj;
        return Float.compare(this.rotationDegrees, scanningStabilityAnimation.rotationDegrees) == 0 && Float.compare(this.pulseScale, scanningStabilityAnimation.pulseScale) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.pulseScale) + (Float.hashCode(this.rotationDegrees) * 31);
    }

    public final String toString() {
        return "ScanningStabilityAnimation(rotationDegrees=" + this.rotationDegrees + ", pulseScale=" + this.pulseScale + ")";
    }
}
