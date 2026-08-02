package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class FloatTweenSpec implements FloatAnimationSpec {
    public final long delayNanos;
    public final int duration;
    public final long durationNanos;
    public final Easing easing;

    public FloatTweenSpec(int i, int i2, Easing easing) {
        this.duration = i;
        this.easing = easing;
        this.durationNanos = i * 1000000;
        this.delayNanos = i2 * 1000000;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final long getDurationNanos(float f, float f2, float f3) {
        return this.delayNanos + this.durationNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float getValueFromNanos(long j, float f, float f2, float f3) {
        long j2 = j - this.delayNanos;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.durationNanos;
        if (j2 > j3) {
            j2 = j3;
        }
        float transform = this.easing.transform(this.duration == 0 ? 1.0f : j2 / j3);
        return (f2 * transform) + ((1.0f - transform) * f);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public final float getVelocityFromNanos(long j, float f, float f2, float f3) {
        long j2 = j - this.delayNanos;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.durationNanos;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (getValueFromNanos(j4, f, f2, f3) - getValueFromNanos(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    public FloatTweenSpec(int i, Easing easing, int i2) {
        this(i, 0, (i2 & 4) != 0 ? EasingKt.FastOutSlowInEasing : easing);
    }
}
