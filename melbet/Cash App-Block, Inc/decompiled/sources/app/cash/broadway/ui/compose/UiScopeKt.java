package app.cash.broadway.ui.compose;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScopeKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import bo.app.u4$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.SheetKt$TheSheet$visibilityScope$1$1$1;

/* loaded from: classes.dex */
public abstract class UiScopeKt {
    public static final StaticProvidableCompositionLocal LocalContainerSharedTransitionScope = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(12));
    public static final StaticProvidableCompositionLocal LocalContainerAnimatedVisibilityScope = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(12));
    public static final StaticProvidableCompositionLocal LocalSwipeTransition = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(12));

    public static final void UiScope(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1555570461);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, (i & 3) != 2)) {
            AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) gapComposer.consume(LocalContainerAnimatedVisibilityScope);
            if (animatedVisibilityScope == null) {
                gapComposer.startReplaceGroup(-697377215);
                SheetKt$TheSheet$visibilityScope$1$1$1 sheetKt$TheSheet$visibilityScope$1$1$1 = new SheetKt$TheSheet$visibilityScope$1$1$1(AnimatableKt.updateTransition(EnterExitState.Visible, null, gapComposer, 6, 2), 1);
                gapComposer.end(false);
                animatedVisibilityScope = sheetKt$TheSheet$visibilityScope$1$1$1;
            } else {
                gapComposer.startReplaceGroup(254596920);
                gapComposer.end(false);
            }
            SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) gapComposer.consume(LocalContainerSharedTransitionScope);
            if (sharedTransitionScope != null) {
                gapComposer.startReplaceGroup(-697086807);
                composableLambdaImpl.invoke(new UiScope(animatedVisibilityScope, sharedTransitionScope), (Object) gapComposer, (Object) 48);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-697020839);
                SharedTransitionScopeKt.SharedTransitionLayout(null, Expect_jvmKt.rememberComposableLambda(-1787310337, new UiScopeKt$$ExternalSyntheticLambda0(0, composableLambdaImpl, animatedVisibilityScope), gapComposer), gapComposer, 48, 1);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new UiScopeKt$$ExternalSyntheticLambda1(i, i2, composableLambdaImpl);
        }
    }
}
