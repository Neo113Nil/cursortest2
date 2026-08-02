package androidx.compose.animation;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.compose.ui.unit.Density;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class FlingCalculator {
    public final float friction;
    public final float magicPhysicalCoefficient;

    /* loaded from: classes3.dex */
    public final class FlingInfo {
        public final float distance;
        public final long duration;
        public final float initialVelocity;

        public FlingInfo(float f, float f2, long j) {
            this.initialVelocity = f;
            this.distance = f2;
            this.duration = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingInfo)) {
                return false;
            }
            FlingInfo flingInfo = (FlingInfo) obj;
            return Float.compare(this.initialVelocity, flingInfo.initialVelocity) == 0 && Float.compare(this.distance, flingInfo.distance) == 0 && this.duration == flingInfo.duration;
        }

        public final int hashCode() {
            return Long.hashCode(this.duration) + CameraState$Type$EnumUnboxingLocalUtility.m(this.distance, Float.hashCode(this.initialVelocity) * 31, 31);
        }

        public final float position(long j) {
            long j2 = this.duration;
            return Math.signum(this.initialVelocity) * this.distance * AndroidFlingSpline.flingPosition(j2 > 0 ? j / j2 : 1.0f).distanceCoefficient;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
            sb.append(this.initialVelocity);
            sb.append(", distance=");
            sb.append(this.distance);
            sb.append(", duration=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.duration, ')');
        }

        public final float velocity(long j) {
            long j2 = this.duration;
            return (((Math.signum(this.initialVelocity) * AndroidFlingSpline.flingPosition(j2 > 0 ? j / j2 : 1.0f).velocityCoefficient) * this.distance) / j2) * 1000.0f;
        }
    }

    public FlingCalculator(float f, Density density) {
        this.friction = f;
        float density2 = density.getDensity();
        float f2 = FlingCalculatorKt.DecelerationRate;
        this.magicPhysicalCoefficient = density2 * 386.0878f * 160.0f * 0.84f;
    }

    public final FlingInfo flingInfo(float f) {
        float[] fArr = AndroidFlingSpline.SplinePositions;
        double deceleration = AndroidFlingSpline.deceleration(f, this.friction * this.magicPhysicalCoefficient);
        double d = FlingCalculatorKt.DecelerationRate;
        double d2 = d - 1.0d;
        return new FlingInfo(f, (float) (Math.exp((d / d2) * deceleration) * r0 * r10), (long) (Math.exp(deceleration / d2) * 1000.0d));
    }
}
