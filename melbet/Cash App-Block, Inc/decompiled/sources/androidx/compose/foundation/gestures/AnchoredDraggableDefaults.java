package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;

/* loaded from: classes3.dex */
public abstract class AnchoredDraggableDefaults {
    public static final TweenSpec SnapAnimationSpec = AnimatableKt.tween$default(0, 0, null, 7);
    public static final BorderKt$$ExternalSyntheticLambda1 PositionalThreshold = new BorderKt$$ExternalSyntheticLambda1(17);
    public static final DecayAnimationSpecImpl DecayAnimationSpec = AnimatableKt.exponentialDecay$default();
}
