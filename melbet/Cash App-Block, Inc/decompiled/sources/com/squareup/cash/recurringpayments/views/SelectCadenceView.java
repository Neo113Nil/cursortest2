package com.squareup.cash.recurringpayments.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.recurringpayments.viewmodels.SelectCadenceViewModel;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt$$ExternalSyntheticLambda0;
import com.squareup.cash.util.BackHandlerKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class SelectCadenceView extends ComposeUiView {
    public final RealImageLoader imageLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCadenceView(Context context, RealImageLoader realImageLoader) {
        super(context);
        context.getClass();
        this.imageLoader = realImageLoader;
    }

    public final void Content(SelectCadenceViewModel selectCadenceViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1370288849);
        int i2 = (gapComposer.changedInstance(selectCadenceViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new PaymentPlanSummaryKt$$ExternalSyntheticLambda0(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            BackHandlerKt.setBackHandler(this, (Function0) rememberedValue);
            if (selectCadenceViewModel != null) {
                gapComposer.startReplaceGroup(-1388827726);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(850561425, new SelectCadenceView$$ExternalSyntheticLambda1(function1, selectCadenceViewModel, this), gapComposer), gapComposer, 6);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1386706799);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectCadenceView$$ExternalSyntheticLambda1(this, selectCadenceViewModel, function1, i);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((SelectCadenceViewModel) obj, function1, gapComposer, 0);
    }
}
