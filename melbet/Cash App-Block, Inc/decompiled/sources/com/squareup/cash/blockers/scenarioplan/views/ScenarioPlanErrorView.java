package com.squareup.cash.blockers.scenarioplan.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanErrorViewModel;
import com.squareup.cash.blockers.views.BirthdayView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.formview.components.FormView;
import com.squareup.cash.formview.components.FormView$Factory$Impl;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes4.dex */
public final class ScenarioPlanErrorView extends ComposeUiView implements FormView.FormViewParent {
    public final FormView formView;

    static {
        KProperty[] kPropertyArr = FormView.$$delegatedProperties;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScenarioPlanErrorView(Context context, FormView$Factory$Impl formView$Factory$Impl) {
        super(context);
        context.getClass();
        this.formView = formView$Factory$Impl.create(context);
    }

    public final void Content(ScenarioPlanErrorViewModel scenarioPlanErrorViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1425821071);
        int i2 = (gapComposer.changedInstance(scenarioPlanErrorViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(this) ? 256 : 128);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (scenarioPlanErrorViewModel == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Model should not be null");
            return;
        } else {
            SharedFlowImpl sharedFlowImpl = this.formView.viewEvents;
            Updater.LaunchedEffect(gapComposer, sharedFlowImpl, new FileBlockerView$6$2$2(sharedFlowImpl, (Continuation) null, function1, 18));
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1906506086, new SetPinViewKt$$ExternalSyntheticLambda2(7, this, scenarioPlanErrorViewModel), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(this, scenarioPlanErrorViewModel, function1, i, 2);
        }
    }

    @Override // com.squareup.cash.ui.OnBackListener
    public final boolean onBack() {
        return false;
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((ScenarioPlanErrorViewModel) obj, function1, gapComposer, 0);
    }
}
