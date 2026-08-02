package com.squareup.cash.shopping.sup.views;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import app.cash.broadway.ui.compose.ComposeUiView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentPlanDetailsViewModel;
import com.squareup.cash.ui.OutsideTapCloses;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final class SingleUsePaymentPlanDetailsSheet extends ComposeUiView implements OutsideTapCloses {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleUsePaymentPlanDetailsSheet(Context context) {
        super(context);
        context.getClass();
    }

    public final void Content(SingleUsePaymentPlanDetailsViewModel singleUsePaymentPlanDetailsViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(231030046);
        int i2 = (gapComposer.changedInstance(singleUsePaymentPlanDetailsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (singleUsePaymentPlanDetailsViewModel == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            SingleUsePaymentAddCardSheetKt.PlanDetails(singleUsePaymentPlanDetailsViewModel, function1, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda1(this, singleUsePaymentPlanDetailsViewModel, function1, i, 16);
        }
    }

    @Override // app.cash.broadway.ui.compose.ComposeUiView
    public final /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, GapComposer gapComposer) {
        Content((SingleUsePaymentPlanDetailsViewModel) obj, function1, gapComposer, 0);
    }
}
