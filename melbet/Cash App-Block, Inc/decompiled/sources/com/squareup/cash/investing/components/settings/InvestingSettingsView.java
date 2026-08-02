package com.squareup.cash.investing.components.settings;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.broadway.ui.compose.ComposeUiView;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewModel;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import kotlin.jvm.functions.Function1;
import net.idrnd.face.iad.capture.internal.s;

/* loaded from: classes6.dex */
public final class InvestingSettingsView extends ComposeUiView {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestingSettingsView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(InvestingSettingsViewModel investingSettingsViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1183159900);
        int i2 = (gapComposer.changed(investingSettingsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            if (investingSettingsViewModel == null) {
                gapComposer.startReplaceGroup(-1279896161);
            } else {
                gapComposer.startReplaceGroup(-1279896160);
                s.InvestSettings(investingSettingsViewModel, function1, gapComposer, (i2 & 112) | (i2 & 14) | 8);
            }
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(this, investingSettingsViewModel, function1, i, 9);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((InvestingSettingsViewModel) obj, function1, gapComposer, 0);
    }
}
