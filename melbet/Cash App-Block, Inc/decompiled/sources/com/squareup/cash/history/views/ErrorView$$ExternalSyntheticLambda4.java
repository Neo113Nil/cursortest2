package com.squareup.cash.history.views;

import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewEvent;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsActivityViewEvent$Back;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewEvent;
import com.squareup.cash.history.payments.viewmodels.ProfilePaymentHistoryViewEvent$ViewAll;
import com.squareup.cash.history.viewmodels.CancelPaymentViewEvent;
import com.squareup.cash.history.viewmodels.CancelPendingSupPaymentViewEvent;
import com.squareup.cash.history.viewmodels.ErrorViewEvent$NegativeClick;
import com.squareup.cash.history.viewmodels.InvestingRoundUpsFailedViewEvent$Close;
import com.squareup.cash.history.viewmodels.InvestingRoundUpsSkippedViewEvent$Close;
import com.squareup.cash.history.viewmodels.PasscodeDialogViewEvent;
import com.squareup.cash.history.viewmodels.PaymentReceiptDialogViewEvent$Close;
import com.squareup.cash.history.viewmodels.RefundPaymentEvent;
import com.squareup.cash.history.viewmodels.ReportAbuseEvent;
import com.squareup.cash.history.viewmodels.SkipPaymentViewEvent;
import com.squareup.cash.initialscreenloader.viewmodels.AppUpgradeViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ErrorView$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ErrorView$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ReportAbuseEvent.CancelClick cancelClick = ReportAbuseEvent.CancelClick.INSTANCE;
        ReportAbuseEvent.ActionClick actionClick = ReportAbuseEvent.ActionClick.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                int i2 = ErrorView.$r8$clinit;
                function1.invoke(ErrorViewEvent$NegativeClick.INSTANCE);
                break;
            case 1:
                function1.invoke(FidesmoProvisioningViewEvent.Retry.INSTANCE);
                break;
            case 2:
                function1.invoke(FidesmoProvisioningViewEvent.Close.INSTANCE);
                break;
            case 3:
                function1.invoke(new GenericTreeElementsViewEvent.DismissEvent(null));
                break;
            case 4:
                function1.invoke(GlobalSearchViewEvent.Retry.INSTANCE);
                break;
            case 5:
                function1.invoke(GlobalSearchViewEvent.BackEvent.INSTANCE);
                break;
            case 6:
                function1.invoke(GrowToolsActivityViewEvent$Back.INSTANCE);
                break;
            case 7:
                function1.invoke(GrowToolsManagerViewEvent.ChangeButtonTapped.INSTANCE);
                break;
            case 8:
                function1.invoke(GrowToolsManagerViewEvent.ActivityShowMoreTapped.INSTANCE);
                break;
            case 9:
                function1.invoke(GrowToolsManagerViewEvent.TargetAvatarTapped.INSTANCE);
                break;
            case 10:
                function1.invoke(GrowToolsManagerViewEvent.Back.INSTANCE);
                break;
            case 11:
                function1.invoke(ProfilePaymentHistoryViewEvent$ViewAll.INSTANCE);
                break;
            case 12:
                int i3 = CancelPaymentView.$r8$clinit;
                function1.invoke(CancelPaymentViewEvent.NegativeClick.INSTANCE);
                break;
            case 13:
                int i4 = CancelPaymentView.$r8$clinit;
                function1.invoke(CancelPaymentViewEvent.PositiveClick.INSTANCE);
                break;
            case 14:
                function1.invoke(CancelPendingSupPaymentViewEvent.SecondaryButtonClicked.INSTANCE);
                break;
            case 15:
                function1.invoke(CancelPendingSupPaymentViewEvent.PrimaryButtonClicked.INSTANCE);
                break;
            case 16:
                int i5 = InvestingRoundUpsFailedDialog.$r8$clinit;
                function1.invoke(InvestingRoundUpsFailedViewEvent$Close.INSTANCE);
                break;
            case 17:
                int i6 = InvestingRoundUpsSkippedDialog.$r8$clinit;
                function1.invoke(InvestingRoundUpsSkippedViewEvent$Close.INSTANCE);
                break;
            case 18:
                function1.invoke(PasscodeDialogViewEvent.Cancel.INSTANCE);
                break;
            case 19:
                int i7 = PaymentReceiptDialogView.$r8$clinit;
                function1.invoke(PaymentReceiptDialogViewEvent$Close.INSTANCE);
                break;
            case 20:
                int i8 = RefundPaymentView.$r8$clinit;
                function1.invoke(RefundPaymentEvent.PositiveButtonClick.INSTANCE);
                break;
            case 21:
                int i9 = RefundPaymentView.$r8$clinit;
                function1.invoke(RefundPaymentEvent.NegativeButtonClick.INSTANCE);
                break;
            case 22:
                function1.invoke(actionClick);
                break;
            case 23:
                function1.invoke(cancelClick);
                break;
            case 24:
                function1.invoke(cancelClick);
                break;
            case 25:
                function1.invoke(actionClick);
                break;
            case 26:
                function1.invoke(actionClick);
                break;
            case 27:
                int i10 = SkipPaymentView.$r8$clinit;
                function1.invoke(SkipPaymentViewEvent.Cancel.INSTANCE);
                break;
            case 28:
                int i11 = SkipPaymentView.$r8$clinit;
                function1.invoke(SkipPaymentViewEvent.Confirm.INSTANCE);
                break;
            default:
                function1.invoke(AppUpgradeViewEvent.Close.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
