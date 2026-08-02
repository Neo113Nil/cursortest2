package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface DurationBasedAnimationSpec extends FiniteAnimationSpec {
    @Override // androidx.compose.animation.core.AnimationSpec
    VectorizedDurationBasedAnimationSpec vectorize(TwoWayConverterImpl twoWayConverterImpl);
}
