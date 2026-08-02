package com.squareup.cash.p2pblocking.views;

import com.squareup.cash.cdf.browser.SheetDismissMechanism;
import com.squareup.cash.cdf.offers.SheetDismissOrigin;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersNotificationEvent$Dismiss;
import com.squareup.cash.offers.viewmodels.viewevents.OffersRedemptionViewEvents$Close;
import com.squareup.cash.offers.viewmodels.viewevents.OffersTimelineViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersTimelineViewEventV2;
import com.squareup.cash.offers.views.redemption.OffersRedemptionSheetView;
import com.squareup.cash.offers.views.sup.OffersNotificationView;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerErrorViewEvent$Close;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewEvent;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewEvent;
import com.squareup.cash.onboarding.accountpicker.viewmodels.ConfirmAccountRemovalViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewEvent;
import com.squareup.cash.p2pblocking.viewmodels.SelectCustomerViewEvent;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class P2PListViewKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ P2PListViewKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PasskeyManagementViewEvent.DismissCreatePasskey dismissCreatePasskey = PasskeyManagementViewEvent.DismissCreatePasskey.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(P2PListViewEvent.TapBack.INSTANCE);
                break;
            case 1:
                function1.invoke(OffersHomeViewEventV2.BackClicked.INSTANCE);
                break;
            case 2:
                function1.invoke(OffersHomeViewEvent.SystemBackPressed.INSTANCE);
                break;
            case 3:
                function1.invoke(OffersHomeViewEvent.SearchBarBackButtonClicked.INSTANCE);
                break;
            case 4:
                function1.invoke(OffersHomeViewEvent.ViewBackEvent.INSTANCE);
                break;
            case 5:
                int i2 = OffersRedemptionSheetView.$r8$clinit;
                function1.invoke(new OffersRedemptionViewEvents$Close(SheetDismissMechanism.Other));
                break;
            case 6:
                function1.invoke(new OffersRedemptionViewEvents$Close(SheetDismissMechanism.Button));
                break;
            case 7:
                int i3 = OffersNotificationView.$r8$clinit;
                function1.invoke(OffersNotificationEvent$Dismiss.INSTANCE);
                break;
            case 8:
                function1.invoke(OffersTimelineViewEventV2.SheetDismissed.INSTANCE);
                break;
            case 9:
                function1.invoke(OffersTimelineViewEventV2.BackClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(new OffersTimelineViewEvent.CloseTimelineSheet(SheetDismissOrigin.Other));
                break;
            case 11:
                function1.invoke(AccountPickerViewEvent.DisableEditMode.INSTANCE);
                break;
            case 12:
                function1.invoke(AccountPickerViewEvent.OpenOptionsMenu.INSTANCE);
                break;
            case 13:
                function1.invoke(AccountPickerViewEvent.SkipAccountSelection.INSTANCE);
                break;
            case 14:
                function1.invoke(AliasPickerViewEvent.GoBack.INSTANCE);
                break;
            case 15:
                function1.invoke(AliasPickerViewEvent.VerifyAnotherWay.INSTANCE);
                break;
            case 16:
                function1.invoke(AccountPickerErrorViewEvent$Close.INSTANCE);
                break;
            case 17:
                function1.invoke(ConfirmAccountRemovalViewEvent.PositiveClick.INSTANCE);
                break;
            case 18:
                function1.invoke(ConfirmAccountRemovalViewEvent.NegativeClick.INSTANCE);
                break;
            case 19:
                function1.invoke(AllowlistSelectionViewEvent.TapContinue.INSTANCE);
                break;
            case 20:
                function1.invoke(AllowlistSelectionViewEvent.TapSafetyResources.INSTANCE);
                break;
            case 21:
                function1.invoke(AllowlistSelectionViewEvent.DismissDialog.INSTANCE);
                break;
            case 22:
                function1.invoke(AllowlistSelectionViewEvent.ConfirmSkip.INSTANCE);
                break;
            case 23:
                function1.invoke(AllowlistSelectionViewEvent.CancelSkip.INSTANCE);
                break;
            case 24:
                function1.invoke(P2PListViewEvent.DismissDialog.INSTANCE);
                break;
            case 25:
                function1.invoke(SelectCustomerViewEvent.TapContinue.INSTANCE);
                break;
            case 26:
                function1.invoke(SelectCustomerViewEvent.DismissDialog.INSTANCE);
                break;
            case 27:
                function1.invoke(dismissCreatePasskey);
                break;
            case 28:
                function1.invoke(dismissCreatePasskey);
                break;
            default:
                function1.invoke(dismissCreatePasskey);
                break;
        }
        return Unit.INSTANCE;
    }
}
