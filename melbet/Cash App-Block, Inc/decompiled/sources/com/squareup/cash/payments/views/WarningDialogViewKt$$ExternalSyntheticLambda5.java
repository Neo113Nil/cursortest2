package com.squareup.cash.payments.views;

import android.os.Parcelable;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestHelpViewEvent;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentLoadingViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewEvent;
import com.squareup.cash.payments.viewmodels.QuickPayDetailsViewEvent;
import com.squareup.cash.payments.viewmodels.RecipientSelectionWarningViewEvent$Finish;
import com.squareup.cash.payments.viewmodels.SchedulePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.WarningDialogViewEvent$ButtonClicked;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class WarningDialogViewKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ WarningDialogViewKt$$ExternalSyntheticLambda5(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(WarningDialogViewEvent$ButtonClicked.INSTANCE);
                break;
            case 1:
                function1.invoke(PaymentConfigurationViewEvent.PersonalizeTapped.INSTANCE);
                break;
            case 2:
                function1.invoke(PaymentConfigurationViewEvent.ScheduleTapped.INSTANCE);
                break;
            case 3:
                function1.invoke(PaymentConfigurationViewEvent.RecurringDisabledTapped.INSTANCE);
                break;
            case 4:
                function1.invoke(PaymentConfigurationViewEvent.RecurringDisabledToastDismissed.INSTANCE);
                break;
            case 5:
                function1.invoke(PaymentConfigurationViewEvent.GrantContactsPermissionTappedFromRow.INSTANCE);
                break;
            case 6:
                function1.invoke(PaymentConfigurationViewEvent.CloseOnwLinkMessage.INSTANCE);
                break;
            case 7:
                function1.invoke(PaymentConfigurationViewEvent.GrantContactsPermissionTappedFromCard.INSTANCE);
                break;
            case 8:
                function1.invoke(PaymentConfigurationViewEvent.ScanQrCodeTapped.INSTANCE);
                break;
            case 9:
                function1.invoke(PaymentConfigurationViewEvent.SearchTooltipDismissed.INSTANCE);
                break;
            case 10:
                function1.invoke(PaymentConfigurationViewEvent.Back.INSTANCE);
                break;
            case 11:
                function1.invoke(PaymentConfigurationViewEvent.AmountInputContinueTapped.INSTANCE);
                break;
            case 12:
                function1.invoke(PaymentConfigurationViewEvent.AddRecipientTapped.INSTANCE);
                break;
            case 13:
                function1.invoke(PaymentConfigurationViewEvent.ShareLinkTapped.INSTANCE);
                break;
            case 14:
                function1.invoke(PaymentConfigurationViewEvent.SelectInstrumentRowTapped.INSTANCE);
                break;
            case 15:
                function1.invoke(PaymentLoadingViewEvent.Back.INSTANCE);
                break;
            case 16:
                function1.invoke(QuickPayDetailsViewEvent.CloseClicked.INSTANCE);
                break;
            case 17:
                function1.invoke(QuickPayDetailsViewEvent.ChangeOrientationClicked.INSTANCE);
                break;
            case 18:
                Parcelable.Creator<AlertDialogResult> creator = AlertDialogResult.CREATOR;
                function1.invoke(new RecipientSelectionWarningViewEvent$Finish());
                break;
            case 19:
                function1.invoke(SchedulePaymentViewEvent.RemoveSchedule.INSTANCE);
                break;
            case 20:
                function1.invoke(SchedulePaymentViewEvent.Cancel.INSTANCE);
                break;
            case 21:
                function1.invoke(SchedulePaymentViewEvent.Done.INSTANCE);
                break;
            case 22:
                function1.invoke(SchedulePaymentViewEvent.Close.INSTANCE);
                break;
            case 23:
                function1.invoke(PersonalizePaymentRecipientViewEvent.ExistingReactionTapped.INSTANCE);
                break;
            case 24:
                function1.invoke(PersonalizePaymentRecipientViewEvent.ReplyButtonTapped.INSTANCE);
                break;
            case 25:
                function1.invoke(NearbyPayRequestHelpViewEvent.CloseClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(NearbyPayRequestHelpViewEvent.MoreInfoClicked.INSTANCE);
                break;
            case 27:
                function1.invoke(NearbyPayRequestViewEvent.OnCloseClicked.INSTANCE);
                break;
            case 28:
                function1.invoke(NearbyPayRequestViewEvent.OnViewAllPayersClicked.INSTANCE);
                break;
            default:
                function1.invoke(NearbyPayRequestViewEvent.OnPermissionsAction.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
