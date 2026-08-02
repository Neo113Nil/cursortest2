package com.squareup.cash.profile.views;

import com.squareup.cash.account.settings.viewmodels.ConfirmReplaceInfoViewEvent;
import com.squareup.cash.account.settings.viewmodels.ErrorViewEvent$GoBack;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewEvent;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.viewmodels.ConfirmRemoveDevicesViewEvent$PositiveClick;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerDetailsViewEvent;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerListViewEvent;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerRemovedSuccessViewEvent;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceRemovalFailedViewEvent;
import com.squareup.cash.profile.viewmodels.AccountSwitchInfoDialogViewEvent$ConfirmationClicked;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileConfirmSignOutViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class ErrorViewKt$$ExternalSyntheticLambda4 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ErrorViewKt$$ExternalSyntheticLambda4(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DeviceManagerListViewEvent.GoBack goBack = DeviceManagerListViewEvent.GoBack.INSTANCE;
        DeviceManagerRemovedSuccessViewEvent.Done done = DeviceManagerRemovedSuccessViewEvent.Done.INSTANCE;
        DeviceManagerRemovedSuccessViewEvent.EnableSecurityOption enableSecurityOption = DeviceManagerRemovedSuccessViewEvent.EnableSecurityOption.INSTANCE;
        DeviceRemovalFailedViewEvent.TryAgain tryAgain = DeviceRemovalFailedViewEvent.TryAgain.INSTANCE;
        DeviceManagerRemovedSuccessViewEvent.GoBack goBack2 = DeviceManagerRemovedSuccessViewEvent.GoBack.INSTANCE;
        DeviceRemovalFailedViewEvent.Close close = DeviceRemovalFailedViewEvent.Close.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(ErrorViewEvent$GoBack.INSTANCE);
                break;
            case 1:
                function1.invoke(PrepurchaseCashCardPlanningViewEvent.Close.INSTANCE);
                break;
            case 2:
                function1.invoke(new ConfirmRemoveDevicesViewEvent$PositiveClick(DeviceManagerConfirmRemoveDevicesScreen.Result.Remove.INSTANCE));
                break;
            case 3:
                function1.invoke(new ConfirmRemoveDevicesViewEvent$PositiveClick(DeviceManagerConfirmRemoveDevicesScreen.Result.Cancel.INSTANCE));
                break;
            case 4:
                function1.invoke(DeviceManagerDetailsViewEvent.DeleteDevice.INSTANCE);
                break;
            case 5:
                function1.invoke(goBack);
                break;
            case 6:
                function1.invoke(DeviceManagerListViewEvent.RefreshDevices.INSTANCE);
                break;
            case 7:
                function1.invoke(goBack);
                break;
            case 8:
                function1.invoke(goBack2);
                break;
            case 9:
                function1.invoke(goBack2);
                break;
            case 10:
                function1.invoke(done);
                break;
            case 11:
                function1.invoke(enableSecurityOption);
                break;
            case 12:
                function1.invoke(done);
                break;
            case 13:
                function1.invoke(enableSecurityOption);
                break;
            case 14:
                function1.invoke(goBack2);
                break;
            case 15:
                function1.invoke(goBack2);
                break;
            case 16:
                function1.invoke(close);
                break;
            case 17:
                function1.invoke(close);
                break;
            case 18:
                function1.invoke(tryAgain);
                break;
            case 19:
                function1.invoke(close);
                break;
            case 20:
                function1.invoke(tryAgain);
                break;
            case 21:
                function1.invoke(close);
                break;
            case 22:
                function1.invoke(close);
                break;
            case 23:
                function1.invoke(close);
                break;
            case 24:
                function1.invoke(AccountSwitchInfoDialogViewEvent$ConfirmationClicked.INSTANCE);
                break;
            case 25:
                function1.invoke(ConfirmReplaceInfoViewEvent.ConfirmReplace.INSTANCE);
                break;
            case 26:
                function1.invoke(ConfirmReplaceInfoViewEvent.Cancel.INSTANCE);
                break;
            case 27:
                function1.invoke(ProfileConfirmSignOutViewEvent.Confirm.INSTANCE);
                break;
            case 28:
                function1.invoke(ProfileConfirmSignOutViewEvent.Cancel.INSTANCE);
                break;
            default:
                function1.invoke(GenericProfileElementsViewEvent.FavoritesListAddClicked.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
