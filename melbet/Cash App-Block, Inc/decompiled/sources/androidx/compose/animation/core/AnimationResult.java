package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class AnimationResult {
    public final AnimationEndReason endReason;
    public final AnimationState endState;

    public AnimationResult(AnimationState animationState, AnimationEndReason animationEndReason) {
        this.endState = animationState;
        this.endReason = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.endReason + ", endState=" + this.endState + ')';
    }
}
