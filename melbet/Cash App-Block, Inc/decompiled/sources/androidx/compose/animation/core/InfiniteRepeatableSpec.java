package androidx.compose.animation.core;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache$cache$1;

/* loaded from: classes3.dex */
public final class InfiniteRepeatableSpec implements AnimationSpec {
    public final DurationBasedAnimationSpec animation;
    public final long initialStartOffset;
    public final RepeatMode repeatMode;

    public InfiniteRepeatableSpec(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j) {
        this.animation = durationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.initialStartOffset = j;
        if (durationBasedAnimationSpec instanceof TweenSpec) {
            TweenSpec tweenSpec = (TweenSpec) durationBasedAnimationSpec;
            if (tweenSpec.durationMillis != 0 || tweenSpec.delay != 0) {
                return;
            }
        } else if (durationBasedAnimationSpec instanceof SnapSpec) {
            if (((SnapSpec) durationBasedAnimationSpec).delay != 0) {
                return;
            }
        } else if (!(durationBasedAnimationSpec instanceof KeyframesSpec) || ((KeyframesSpec) durationBasedAnimationSpec).config.durationMillis != 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Animation to be infinitely repeated cannot have a 0-duration");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InfiniteRepeatableSpec)) {
            return false;
        }
        InfiniteRepeatableSpec infiniteRepeatableSpec = (InfiniteRepeatableSpec) obj;
        return infiniteRepeatableSpec.animation.equals(this.animation) && infiniteRepeatableSpec.repeatMode == this.repeatMode && infiniteRepeatableSpec.initialStartOffset == this.initialStartOffset;
    }

    public final int hashCode() {
        return Long.hashCode(this.initialStartOffset) + ((this.repeatMode.hashCode() + (this.animation.hashCode() * 31)) * 31);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedAnimationSpec vectorize(TwoWayConverterImpl twoWayConverterImpl) {
        VectorizedDurationBasedAnimationSpec vectorize = this.animation.vectorize(twoWayConverterImpl);
        RealStrongMemoryCache$cache$1 realStrongMemoryCache$cache$1 = new RealStrongMemoryCache$cache$1();
        realStrongMemoryCache$cache$1.map = vectorize;
        realStrongMemoryCache$cache$1.this$0 = this.repeatMode;
        realStrongMemoryCache$cache$1.maxSize = (vectorize.getDurationMillis() + vectorize.getDelayMillis()) * 1000000;
        realStrongMemoryCache$cache$1.size = this.initialStartOffset * 1000000;
        return realStrongMemoryCache$cache$1;
    }
}
