package com.squareup.cash.offers.views.redemption;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.offers.viewmodels.OffersRedemptionViewModel;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class OffersRedemptionSheetView extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OffersRedemptionSheetView(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(OffersRedemptionViewModel offersRedemptionViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-384391248);
        int i2 = (gapComposer.changedInstance(offersRedemptionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (offersRedemptionViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
                return;
            }
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new P2PListViewKt$$ExternalSyntheticLambda0(5, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1874224021, new OffersRedemptionSheetView$$ExternalSyntheticLambda1(offersRedemptionViewModel, function1), gapComposer), gapComposer, 6);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HelpSheetView$$ExternalSyntheticLambda0(this, offersRedemptionViewModel, function1, i, 5);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((OffersRedemptionViewModel) obj, function1, gapComposer, 0);
    }
}
