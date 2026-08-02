package defpackage;

import androidx.compose.animation.core.AnimationEndReason;

/* loaded from: classes10.dex */
public final class wi2 {
    public final kj2 a;
    public final AnimationEndReason b;

    public wi2(kj2 kj2Var, AnimationEndReason animationEndReason) {
        this.a = kj2Var;
        this.b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.a + ')';
    }
}
