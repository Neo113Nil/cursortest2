package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.FloatDecayAnimationSpec;

/* loaded from: classes3.dex */
public final class ArrowValues implements FloatDecayAnimationSpec {
    public float endAngle;
    public float scale;

    public ArrowValues() {
        this.endAngle = Math.max(1.0E-7f, Math.abs(0.1f));
        this.scale = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.endAngle;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f) {
        return ((long) ((((float) Math.log(this.endAngle / Math.abs(f))) * 1000.0f) / this.scale)) * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f, float f2) {
        if (Math.abs(f2) <= this.endAngle) {
            return f;
        }
        double log = Math.log(Math.abs(r1 / f2));
        float f3 = this.scale;
        return ((f2 / f3) * ((float) Math.exp((f3 * ((log / f3) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(float f, float f2, long j) {
        float f3 = this.scale;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.scale));
    }

    public ArrowValues(float f, float f2) {
        this.endAngle = f;
        this.scale = f2;
    }
}
