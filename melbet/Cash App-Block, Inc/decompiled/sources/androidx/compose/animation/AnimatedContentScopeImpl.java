package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class AnimatedContentScopeImpl implements AnimatedVisibilityScope {
    public final /* synthetic */ AnimatedVisibilityScope $$delegate_0;

    public AnimatedContentScopeImpl(AnimatedVisibilityScope animatedVisibilityScope) {
        this.$$delegate_0 = animatedVisibilityScope;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final Modifier animateEnterExit(Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl) {
        return this.$$delegate_0.animateEnterExit(modifier, enterTransitionImpl, exitTransitionImpl);
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public final Transition getTransition() {
        return this.$$delegate_0.getTransition();
    }
}
