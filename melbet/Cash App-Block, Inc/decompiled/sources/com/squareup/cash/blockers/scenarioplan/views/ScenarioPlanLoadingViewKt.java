package com.squareup.cash.blockers.scenarioplan.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanLoadingViewModel;
import com.squareup.cash.borrow.views.ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0;

/* loaded from: classes4.dex */
public abstract class ScenarioPlanLoadingViewKt {

    /* renamed from: lambda$-56271650, reason: not valid java name */
    public static final ComposableLambdaImpl f274lambda$56271650 = new ComposableLambdaImpl(new ComposableSingletons$BorrowUiFactoryKt$$ExternalSyntheticLambda0(2), false, -56271650);

    public static final void ScenarioPlanLoading(ScenarioPlanLoadingViewModel scenarioPlanLoadingViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1968008458);
        int i2 = (gapComposer.changedInstance(scenarioPlanLoadingViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(2045486657, new ScenarioPlanLoadingViewKt$$ExternalSyntheticLambda0(scenarioPlanLoadingViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScenarioPlanLoadingViewKt$$ExternalSyntheticLambda0(scenarioPlanLoadingViewModel, i);
        }
    }
}
