package com.squareup.cash.retro.views;

import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Condensed$ItemConfirmed;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$HelpClicked;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.recurringpayments.viewmodels.SelectCadenceViewEvent;
import com.squareup.cash.recurringpayments.viewmodels.SelectDayOfCadenceViewEvent;
import com.squareup.cash.retro.viewmodels.PaymentPlanSummaryViewEvent;
import com.squareup.cash.retro.viewmodels.SelectPaymentPlanViewEvent;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewEvent;
import com.squareup.cash.savings.viewmodels.TransferringViewEvent$Exit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class PaymentPlanSummaryKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PaymentPlanSummaryViewEvent.ViewSourceInfo viewSourceInfo = PaymentPlanSummaryViewEvent.ViewSourceInfo.INSTANCE;
        SelectPaymentPlanViewEvent.Close close = SelectPaymentPlanViewEvent.Close.INSTANCE;
        SelectPaymentPlanViewEvent.DismissHalfSheet dismissHalfSheet = SelectPaymentPlanViewEvent.DismissHalfSheet.INSTANCE;
        AmountPickerViewEvent$Full$HelpClicked amountPickerViewEvent$Full$HelpClicked = AmountPickerViewEvent$Full$HelpClicked.INSTANCE;
        AmountPickerViewEvent$Full$SystemBack amountPickerViewEvent$Full$SystemBack = AmountPickerViewEvent$Full$SystemBack.INSTANCE;
        PaymentPlanSummaryViewEvent.DismissBottomSheet dismissBottomSheet = PaymentPlanSummaryViewEvent.DismissBottomSheet.INSTANCE;
        AmountPickerViewEvent$Full$Close amountPickerViewEvent$Full$Close = AmountPickerViewEvent$Full$Close.INSTANCE;
        PaymentPlanSummaryViewEvent.Close close2 = PaymentPlanSummaryViewEvent.Close.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(close2);
                break;
            case 1:
                function1.invoke(SelectCadenceViewEvent.TapBack.INSTANCE);
                break;
            case 2:
                function1.invoke(SelectCadenceViewEvent.TapClose.INSTANCE);
                break;
            case 3:
                function1.invoke(SelectDayOfCadenceViewEvent.TapBack.INSTANCE);
                break;
            case 4:
                function1.invoke(SelectDayOfCadenceViewEvent.TapClose.INSTANCE);
                break;
            case 5:
                function1.invoke(close2);
                break;
            case 6:
                function1.invoke(viewSourceInfo);
                break;
            case 7:
                function1.invoke(dismissBottomSheet);
                break;
            case 8:
                function1.invoke(close2);
                break;
            case 9:
                function1.invoke(dismissBottomSheet);
                break;
            case 10:
                function1.invoke(dismissBottomSheet);
                break;
            case 11:
                function1.invoke(close2);
                break;
            case 12:
                function1.invoke(viewSourceInfo);
                break;
            case 13:
                function1.invoke(close);
                break;
            case 14:
                function1.invoke(close);
                break;
            case 15:
                function1.invoke(dismissHalfSheet);
                break;
            case 16:
                function1.invoke(SelectPaymentPlanViewEvent.UpdatePaymentPlan.INSTANCE);
                break;
            case 17:
                function1.invoke(dismissHalfSheet);
                break;
            case 18:
                function1.invoke(SelectPaymentPlanViewEvent.ConfirmPaymentPlan.INSTANCE);
                break;
            case 19:
                function1.invoke(amountPickerViewEvent$Full$Close);
                break;
            case 20:
                function1.invoke(new AmountPickerViewEvent$Condensed$ItemConfirmed(null));
                break;
            case 21:
                function1.invoke(amountPickerViewEvent$Full$SystemBack);
                break;
            case 22:
                function1.invoke(amountPickerViewEvent$Full$Close);
                break;
            case 23:
                function1.invoke(amountPickerViewEvent$Full$HelpClicked);
                break;
            case 24:
                function1.invoke(amountPickerViewEvent$Full$HelpClicked);
                break;
            case 25:
                function1.invoke(amountPickerViewEvent$Full$SystemBack);
                break;
            case 26:
                function1.invoke(amountPickerViewEvent$Full$Close);
                break;
            case 27:
                function1.invoke(SavingsScreenViewEvent.Exit.INSTANCE);
                break;
            case 28:
                function1.invoke(SavingsScreenViewEvent.SeeAllActivitiesEvent.INSTANCE);
                break;
            default:
                function1.invoke(TransferringViewEvent$Exit.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
