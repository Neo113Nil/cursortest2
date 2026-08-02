package com.squareup.cash.investing.components.teengraduation;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.investing.viewmodels.teengraduation.StocksTransferEtaViewModel;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class StocksTransferEtaSheetView extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StocksTransferEtaSheetView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(StocksTransferEtaViewModel stocksTransferEtaViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1925981577);
        int i2 = (gapComposer.changed(stocksTransferEtaViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (stocksTransferEtaViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(241156974, new HypeWelcomeUIKt$$ExternalSyntheticLambda0(10, (Object) stocksTransferEtaViewModel, (Object) function1), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(this, stocksTransferEtaViewModel, function1, i, 12);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((StocksTransferEtaViewModel) obj, function1, gapComposer, 0);
    }
}
