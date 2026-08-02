package com.squareup.cash.paychecks.views;

import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$Close;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewEvent$Full$SystemBack;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewEvent;
import com.squareup.cash.passkeys.viewmodels.PasskeyUpsellViewEvent;
import com.squareup.cash.paychecks.viewmodels.DistributePaycheckViewEvent;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewEvent;
import com.squareup.cash.paychecks.viewmodels.HelpSheetViewEvent;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent;
import com.squareup.cash.paychecks.viewmodels.PaycheckAlertDialogViewEvent$TapPrimaryButton;
import com.squareup.cash.paychecks.viewmodels.PaychecksActivityListViewEvent;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewEvent;
import com.squareup.cash.paychecks.viewmodels.PaychecksReceiptViewEvent$Close;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class HelpSheetViewKt$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ HelpSheetViewKt$$ExternalSyntheticLambda2(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PasskeyUpsellViewEvent.SkipTapped skipTapped = PasskeyUpsellViewEvent.SkipTapped.INSTANCE;
        DistributePaycheckViewEvent.Exit exit = DistributePaycheckViewEvent.Exit.INSTANCE;
        PasskeyManagementViewEvent.DismissRemovePasskey dismissRemovePasskey = PasskeyManagementViewEvent.DismissRemovePasskey.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(HelpSheetViewEvent.AdditionalHelp.INSTANCE);
                break;
            case 1:
                function1.invoke(PasskeyManagementViewEvent.RetryCreatePasskey.INSTANCE);
                break;
            case 2:
                function1.invoke(PasskeyManagementViewEvent.DismissCreatePasskey.INSTANCE);
                break;
            case 3:
                function1.invoke(PasskeyManagementViewEvent.RetryLoadPasskeys.INSTANCE);
                break;
            case 4:
                function1.invoke(dismissRemovePasskey);
                break;
            case 5:
                function1.invoke(dismissRemovePasskey);
                break;
            case 6:
                function1.invoke(PasskeyManagementViewEvent.ManageDevicesTapped.INSTANCE);
                break;
            case 7:
                function1.invoke(dismissRemovePasskey);
                break;
            case 8:
                function1.invoke(dismissRemovePasskey);
                break;
            case 9:
                function1.invoke(dismissRemovePasskey);
                break;
            case 10:
                function1.invoke(PasskeyManagementViewEvent.CreatePasskeyTapped.INSTANCE);
                break;
            case 11:
                function1.invoke(PasskeyManagementViewEvent.BackButtonTapped.INSTANCE);
                break;
            case 12:
                function1.invoke(skipTapped);
                break;
            case 13:
                function1.invoke(skipTapped);
                break;
            case 14:
                function1.invoke(PasskeyUpsellViewEvent.RegisterTapped.INSTANCE);
                break;
            case 15:
                function1.invoke(PaychecksHomeViewEvent.Exit.INSTANCE);
                break;
            case 16:
                function1.invoke(AmountPickerViewEvent$Full$SystemBack.INSTANCE);
                break;
            case 17:
                function1.invoke(AmountPickerViewEvent$Full$Close.INSTANCE);
                break;
            case 18:
                function1.invoke(exit);
                break;
            case 19:
                function1.invoke(exit);
                break;
            case 20:
                function1.invoke(DistributePaycheckViewEvent.Help.INSTANCE);
                break;
            case 21:
                function1.invoke(EditDistributionViewEvent.Exit.INSTANCE);
                break;
            case 22:
                function1.invoke(EditDistributionViewEvent.ExplanationDismissed.INSTANCE);
                break;
            case 23:
                function1.invoke(EditDistributionViewEvent.Exit.INSTANCE);
                break;
            case 24:
                function1.invoke(HelpSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 25:
                function1.invoke(MultipleAllocationViewEvent.Exit.INSTANCE);
                break;
            case 26:
                function1.invoke(MultipleAllocationViewEvent.ExplanationDismissed.INSTANCE);
                break;
            case 27:
                function1.invoke(PaycheckAlertDialogViewEvent$TapPrimaryButton.INSTANCE);
                break;
            case 28:
                function1.invoke(PaychecksActivityListViewEvent.Close.INSTANCE);
                break;
            default:
                function1.invoke(PaychecksReceiptViewEvent$Close.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
