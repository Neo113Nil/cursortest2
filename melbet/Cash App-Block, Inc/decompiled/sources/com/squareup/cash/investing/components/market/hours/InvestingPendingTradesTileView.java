package com.squareup.cash.investing.components.market.hours;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.viewmodels.market.hours.InvestingPendingTradesTileWidgetViewModel;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class InvestingPendingTradesTileView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingPendingTradesTileView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(InvestingPendingTradesTileWidgetViewModel investingPendingTradesTileWidgetViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(954703403);
        int i2 = (gapComposer.changed(investingPendingTradesTileWidgetViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (investingPendingTradesTileWidgetViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(4723046, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(3, (Object) investingPendingTradesTileWidgetViewModel, (Object) function1), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(this, investingPendingTradesTileWidgetViewModel, function1, i, 1);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((InvestingPendingTradesTileWidgetViewModel) obj, function1, gapComposer, 0);
    }
}
