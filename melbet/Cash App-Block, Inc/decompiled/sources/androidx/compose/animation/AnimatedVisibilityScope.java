package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.Modifier;
import app.cash.molecule.PlatformKt;
import com.squareup.workflow1.WorkflowInterceptorKt$intercept$1$render$1;

/* loaded from: classes.dex */
public interface AnimatedVisibilityScope {
    static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl, int i) {
        if ((i & 1) != 0) {
            enterTransitionImpl = EnterExitTransitionKt.fadeIn$default(null, 3);
        }
        if ((i & 2) != 0) {
            exitTransitionImpl = EnterExitTransitionKt.fadeOut$default(null, 3);
        }
        return animatedVisibilityScope.animateEnterExit(modifier, enterTransitionImpl, exitTransitionImpl);
    }

    default Modifier animateEnterExit(Modifier modifier, EnterTransitionImpl enterTransitionImpl, ExitTransitionImpl exitTransitionImpl) {
        return PlatformKt.composed(modifier, new WorkflowInterceptorKt$intercept$1$render$1(1, this, enterTransitionImpl, exitTransitionImpl));
    }

    Transition getTransition();
}
