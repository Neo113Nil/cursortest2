package com.squareup.cash.blockers.scenarioplan.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanLoadingViewModel;
import com.squareup.cash.blockers.views.BirthdayView$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ScenarioPlanLoadingView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScenarioPlanLoadingView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(ScenarioPlanLoadingViewModel scenarioPlanLoadingViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1437486915);
        int i2 = (gapComposer.changedInstance(scenarioPlanLoadingViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ScenarioPlanLoadingViewKt.ScenarioPlanLoading(scenarioPlanLoadingViewModel, gapComposer, i2 & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, scenarioPlanLoadingViewModel, function1, i, 3);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ScenarioPlanLoadingViewModel) obj, function1, gapComposer, 0);
    }
}
