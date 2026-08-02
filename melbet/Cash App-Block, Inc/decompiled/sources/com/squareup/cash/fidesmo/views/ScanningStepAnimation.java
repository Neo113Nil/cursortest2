package com.squareup.cash.fidesmo.views;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class ScanningStepAnimation {
    public static final ScanningStepAnimation Idle = new ScanningStepAnimation(RecyclerView.DECELERATION_RATE, 1.0f);
    public final float orbScale;
    public final float rotationDegrees;

    public ScanningStepAnimation(float f, float f2) {
        this.rotationDegrees = f;
        this.orbScale = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanningStepAnimation)) {
            return false;
        }
        ScanningStepAnimation scanningStepAnimation = (ScanningStepAnimation) obj;
        return Float.compare(this.rotationDegrees, scanningStepAnimation.rotationDegrees) == 0 && Float.compare(this.orbScale, scanningStepAnimation.orbScale) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.orbScale) + (Float.hashCode(this.rotationDegrees) * 31);
    }

    public final String toString() {
        return "ScanningStepAnimation(rotationDegrees=" + this.rotationDegrees + ", orbScale=" + this.orbScale + ")";
    }
}
