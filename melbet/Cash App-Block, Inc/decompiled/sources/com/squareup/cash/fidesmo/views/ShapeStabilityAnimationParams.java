package com.squareup.cash.fidesmo.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes6.dex */
public final class ShapeStabilityAnimationParams {
    public static final ShapeStabilityAnimationParams Disabled = new ShapeStabilityAnimationParams(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 127);
    public final boolean enabled;
    public final float maxFrequencyHz;
    public final float maxPulseScale;
    public final float maxRotationDegrees;
    public final float minFrequencyHz;
    public final float minPulseScale;
    public final float minRotationDegrees;

    public ShapeStabilityAnimationParams(float f, float f2, float f3, float f4, int i) {
        boolean z = (i & 1) == 0;
        f = (i & 2) != 0 ? 0.0f : f;
        f2 = (i & 4) != 0 ? 0.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 0.0f : f4;
        float f5 = (i & 64) != 0 ? 1.0f : 1.1f;
        this.enabled = z;
        this.minRotationDegrees = f;
        this.maxRotationDegrees = f2;
        this.minFrequencyHz = f3;
        this.maxFrequencyHz = f4;
        this.minPulseScale = 1.0f;
        this.maxPulseScale = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShapeStabilityAnimationParams)) {
            return false;
        }
        ShapeStabilityAnimationParams shapeStabilityAnimationParams = (ShapeStabilityAnimationParams) obj;
        return this.enabled == shapeStabilityAnimationParams.enabled && Float.compare(this.minRotationDegrees, shapeStabilityAnimationParams.minRotationDegrees) == 0 && Float.compare(this.maxRotationDegrees, shapeStabilityAnimationParams.maxRotationDegrees) == 0 && Float.compare(this.minFrequencyHz, shapeStabilityAnimationParams.minFrequencyHz) == 0 && Float.compare(this.maxFrequencyHz, shapeStabilityAnimationParams.maxFrequencyHz) == 0 && Float.compare(this.minPulseScale, shapeStabilityAnimationParams.minPulseScale) == 0 && Float.compare(this.maxPulseScale, shapeStabilityAnimationParams.maxPulseScale) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.maxPulseScale) + CameraState$Type$EnumUnboxingLocalUtility.m(this.minPulseScale, CameraState$Type$EnumUnboxingLocalUtility.m(this.maxFrequencyHz, CameraState$Type$EnumUnboxingLocalUtility.m(this.minFrequencyHz, CameraState$Type$EnumUnboxingLocalUtility.m(this.maxRotationDegrees, CameraState$Type$EnumUnboxingLocalUtility.m(this.minRotationDegrees, Boolean.hashCode(this.enabled) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapeStabilityAnimationParams(enabled=");
        sb.append(this.enabled);
        sb.append(", minRotationDegrees=");
        sb.append(this.minRotationDegrees);
        sb.append(", maxRotationDegrees=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.maxRotationDegrees, ", minFrequencyHz=", this.minFrequencyHz, ", maxFrequencyHz=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.maxFrequencyHz, ", minPulseScale=", this.minPulseScale, ", maxPulseScale=");
        return Recorder$$ExternalSyntheticOutline1.m(this.maxPulseScale, ")", sb);
    }
}
