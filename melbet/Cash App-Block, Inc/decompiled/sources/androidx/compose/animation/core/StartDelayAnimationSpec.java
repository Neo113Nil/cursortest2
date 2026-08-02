package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class StartDelayAnimationSpec implements AnimationSpec {
    public final AnimationSpec animationSpec;
    public final long startDelayNanos;

    public StartDelayAnimationSpec(FiniteAnimationSpec finiteAnimationSpec, long j) {
        this.animationSpec = finiteAnimationSpec;
        this.startDelayNanos = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StartDelayAnimationSpec)) {
            return false;
        }
        StartDelayAnimationSpec startDelayAnimationSpec = (StartDelayAnimationSpec) obj;
        return startDelayAnimationSpec.startDelayNanos == this.startDelayNanos && Intrinsics.areEqual(startDelayAnimationSpec.animationSpec, this.animationSpec);
    }

    public final int hashCode() {
        return Long.hashCode(this.startDelayNanos) + (this.animationSpec.hashCode() * 31);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec vectorize(TwoWayConverterImpl twoWayConverterImpl) {
        return new StartDelayVectorizedAnimationSpec(this.animationSpec.vectorize(twoWayConverterImpl), this.startDelayNanos);
    }
}
