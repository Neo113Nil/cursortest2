package com.squareup.cash.shopping.sup.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.profile.views.TaxesPasswordViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.shopping.sup.viewmodels.SingleUsePaymentCancelPlanDialogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class SingleUsePaymentCancelPlanDialogKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ SingleUsePaymentCancelPlanDialogViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SingleUsePaymentCancelPlanDialogKt$$ExternalSyntheticLambda0(SingleUsePaymentCancelPlanDialogViewModel singleUsePaymentCancelPlanDialogViewModel, Function1 function1) {
        this.f$0 = singleUsePaymentCancelPlanDialogViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        SingleUsePaymentCancelPlanDialogViewModel singleUsePaymentCancelPlanDialogViewModel = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ModalKt.Modal((Modifier) null, singleUsePaymentCancelPlanDialogViewModel.title, singleUsePaymentCancelPlanDialogViewModel.message, Expect_jvmKt.rememberComposableLambda(-2110092947, new ShareSheetViewKt$$ExternalSyntheticLambda1(28, (Object) singleUsePaymentCancelPlanDialogViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(102322990, new TaxesPasswordViewKt$$ExternalSyntheticLambda4(16, function1), gapComposer), (Function3) null, gapComposer, 27648, 33);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                SingleUsePaymentAddCardSheetKt.CancelPlan(singleUsePaymentCancelPlanDialogViewModel, function1, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SingleUsePaymentCancelPlanDialogKt$$ExternalSyntheticLambda0(SingleUsePaymentCancelPlanDialogViewModel singleUsePaymentCancelPlanDialogViewModel, Function1 function1, int i) {
        this.f$0 = singleUsePaymentCancelPlanDialogViewModel;
        this.f$1 = function1;
    }
}
