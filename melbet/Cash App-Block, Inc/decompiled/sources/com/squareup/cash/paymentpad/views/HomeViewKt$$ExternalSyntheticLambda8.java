package com.squareup.cash.paymentpad.views;

import com.squareup.cash.paychecks.viewmodels.DistributionWheelContentEvent;
import com.squareup.cash.paymentpad.viewmodels.HomeViewEvent;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewEvent;
import com.squareup.cash.paymentpad.viewmodels.LowDiskSpaceAlertViewEvent;
import com.squareup.cash.payments.viewmodels.ConfirmDuplicateDialogViewEvent;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogViewEvent;
import com.squareup.cash.payments.viewmodels.ContactSyncViewEvent;
import com.squareup.cash.payments.viewmodels.DuplicatePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.payments.viewmodels.NoteRequiredViewEvent$Close;
import com.squareup.cash.payments.viewmodels.PaymentClaimViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class HomeViewKt$$ExternalSyntheticLambda8 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ HomeViewKt$$ExternalSyntheticLambda8(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DistributionWheelContentEvent.InfoButtonTapped infoButtonTapped = DistributionWheelContentEvent.InfoButtonTapped.INSTANCE;
        ConfirmRecipientDialogViewEvent.Cancel cancel = ConfirmRecipientDialogViewEvent.Cancel.INSTANCE;
        MainPaymentViewEvent.GrantContactsPermissionClicked grantContactsPermissionClicked = MainPaymentViewEvent.GrantContactsPermissionClicked.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(HomeViewEvent.SuspensionsBannerClicked.INSTANCE);
                break;
            case 1:
                function1.invoke(infoButtonTapped);
                break;
            case 2:
                function1.invoke(DistributionWheelContentEvent.HeroAmountTapped.INSTANCE);
                break;
            case 3:
                function1.invoke(infoButtonTapped);
                break;
            case 4:
                function1.invoke(HomeViewEvent.QrCode.INSTANCE);
                break;
            case 5:
                function1.invoke(HomeViewEvent.PayRequestNearby.INSTANCE);
                break;
            case 6:
                function1.invoke(LitePaymentPadViewEvent.ExchangeRatePreviewTapped.INSTANCE);
                break;
            case 7:
                function1.invoke(LitePaymentPadViewEvent.QrCode.INSTANCE);
                break;
            case 8:
                function1.invoke(LitePaymentPadViewEvent.Pay.INSTANCE);
                break;
            case 9:
                function1.invoke(LitePaymentPadViewEvent.Dismiss.INSTANCE);
                break;
            case 10:
                int i2 = LowDiskSpaceAlertDialog.$r8$clinit;
                function1.invoke(LowDiskSpaceAlertViewEvent.NegativeButtonClick.INSTANCE);
                break;
            case 11:
                int i3 = LowDiskSpaceAlertDialog.$r8$clinit;
                function1.invoke(LowDiskSpaceAlertViewEvent.PositiveButtonClick.INSTANCE);
                break;
            case 12:
                function1.invoke(ConfirmDuplicateDialogViewEvent.Confirm.INSTANCE);
                break;
            case 13:
                function1.invoke(ConfirmDuplicateDialogViewEvent.Cancel.INSTANCE);
                break;
            case 14:
                function1.invoke(cancel);
                break;
            case 15:
                function1.invoke(ConfirmRecipientDialogViewEvent.Confirm.INSTANCE);
                break;
            case 16:
                function1.invoke(ConfirmRecipientDialogViewEvent.ViewProfile.INSTANCE);
                break;
            case 17:
                function1.invoke(cancel);
                break;
            case 18:
                function1.invoke(ContactSyncViewEvent.Confirm.INSTANCE);
                break;
            case 19:
                function1.invoke(ContactSyncViewEvent.Cancel.INSTANCE);
                break;
            case 20:
                function1.invoke(DuplicatePaymentViewEvent.GoBack.INSTANCE);
                break;
            case 21:
                function1.invoke(DuplicatePaymentViewEvent.Continue.INSTANCE);
                break;
            case 22:
                function1.invoke(MainPaymentViewEvent.HandleBack.INSTANCE);
                break;
            case 23:
                function1.invoke(grantContactsPermissionClicked);
                break;
            case 24:
                function1.invoke(grantContactsPermissionClicked);
                break;
            case 25:
                function1.invoke(MainPaymentViewEvent.ClearClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(NoteRequiredViewEvent$Close.INSTANCE);
                break;
            case 27:
                function1.invoke(PaymentClaimViewEvent.CancelClick.INSTANCE);
                break;
            case 28:
                function1.invoke(PaymentClaimViewEvent.DepositClick.INSTANCE);
                break;
            default:
                function1.invoke(PaymentConfigurationViewEvent.RetryLoadingTapped.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
