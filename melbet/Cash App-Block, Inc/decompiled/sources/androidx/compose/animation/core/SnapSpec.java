package androidx.compose.animation.core;

import com.google.android.gms.dynamite.zzo;

/* loaded from: classes.dex */
public final class SnapSpec implements DurationBasedAnimationSpec {
    public final int delay;

    public SnapSpec(int i) {
        this.delay = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof SnapSpec) && ((SnapSpec) obj).delay == this.delay;
    }

    public final int hashCode() {
        return this.delay;
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedDurationBasedAnimationSpec vectorize(TwoWayConverterImpl twoWayConverterImpl) {
        return new zzo((byte) 0, this.delay);
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec
    public final VectorizedFiniteAnimationSpec vectorize() {
        return new zzo((byte) 0, this.delay);
    }
}
