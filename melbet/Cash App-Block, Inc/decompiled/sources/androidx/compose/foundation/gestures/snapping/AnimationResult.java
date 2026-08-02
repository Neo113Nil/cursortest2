package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;

/* loaded from: classes3.dex */
public final class AnimationResult {
    public final AnimationState currentAnimationState;
    public final Float remainingOffset;

    public AnimationResult(Float f, AnimationState animationState) {
        this.remainingOffset = f;
        this.currentAnimationState = animationState;
    }
}
