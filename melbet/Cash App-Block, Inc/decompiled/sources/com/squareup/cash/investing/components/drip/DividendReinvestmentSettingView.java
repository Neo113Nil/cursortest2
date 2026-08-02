package com.squareup.cash.investing.components.drip;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewModel;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.InterruptibleKt;

/* loaded from: classes6.dex */
public final class DividendReinvestmentSettingView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DividendReinvestmentSettingView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(DividendReinvestmentSettingViewModel dividendReinvestmentSettingViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1470072441);
        int i2 = (gapComposer.changed(dividendReinvestmentSettingViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (dividendReinvestmentSettingViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            InterruptibleKt.DividendReinvestmentSettingViewContent(dividendReinvestmentSettingViewModel, function1, gapComposer, (i2 & 112) | (i2 & 14) | 8);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new QuickAccessBarKt$$ExternalSyntheticLambda1((Object) this, (Object) dividendReinvestmentSettingViewModel, (Function) function1, i, 25);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((DividendReinvestmentSettingViewModel) obj, function1, gapComposer, 0);
    }
}
