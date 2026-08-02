package com.squareup.cash.account.components;

import com.squareup.cash.account.components.business.BusinessInfoView;
import com.squareup.cash.account.settings.viewmodels.AccountViewEvent;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewEvent;
import com.squareup.cash.account.settings.viewmodels.ThemeSwitcherViewEvent;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewEvent;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountSwitcherViewEvent;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountsLoadingFailedViewEvent$CloseClicked;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final /* synthetic */ class AccountToDoKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ AccountToDoKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ThemeSwitcherViewEvent.Exit exit = ThemeSwitcherViewEvent.Exit.INSTANCE;
        BusinessInfoViewEvent.DismissBottomSheet dismissBottomSheet = BusinessInfoViewEvent.DismissBottomSheet.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(AccountViewEvent.ClaimRewardClick.INSTANCE);
                break;
            case 1:
                function1.invoke(AccountViewEvent.TrustedDevicesClick.INSTANCE);
                break;
            case 2:
                function1.invoke(AccountViewEvent.PasskeysClick.INSTANCE);
                break;
            case 3:
                function1.invoke(AccountViewEvent.AddPhotoClick.INSTANCE);
                break;
            case 4:
                function1.invoke(AccountViewEvent.SecurityHubClick.INSTANCE);
                break;
            case 5:
                function1.invoke(AccountViewEvent.InviteFriendsClicked.INSTANCE);
                break;
            case 6:
                function1.invoke(AccountViewEvent.BackClicked.INSTANCE);
                break;
            case 7:
                function1.invoke(AccountViewEvent.SwitchAccountClick.INSTANCE);
                break;
            case 8:
                function1.invoke(AccountViewEvent.EditProfileClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(AccountViewEvent.AddQrToHomeScreenClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(AccountViewEvent.QrCodeRetryClick.INSTANCE);
                break;
            case 11:
                function1.invoke(AccountViewEvent.QrClick.INSTANCE);
                break;
            case 12:
                function1.invoke(AccountViewEvent.ShareClick.INSTANCE);
                break;
            case 13:
                function1.invoke(AccountViewEvent.QrScanClick.INSTANCE);
                break;
            case 14:
                function1.invoke(EditProfileViewEvent.BackClicked.INSTANCE);
                break;
            case 15:
                function1.invoke(EditProfileViewEvent.OnCloseUpdateNameDialog.INSTANCE);
                break;
            case 16:
                function1.invoke(new EditProfileViewEvent.BusinessProfileClicked(true));
                break;
            case 17:
                function1.invoke(exit);
                break;
            case 18:
                function1.invoke(ThemeSwitcherViewEvent.Retry.INSTANCE);
                break;
            case 19:
                function1.invoke(exit);
                break;
            case 20:
                function1.invoke(ThemeSwitcherViewEvent.Done.INSTANCE);
                break;
            case 21:
                function1.invoke(AccountSwitcherViewEvent.CreateBusinessAccountClick.INSTANCE);
                break;
            case 22:
                function1.invoke(AccountSwitcherViewEvent.CreatePersonalAccountClick.INSTANCE);
                break;
            case 23:
                function1.invoke(AccountSwitcherViewEvent.AddAccountClick.INSTANCE);
                break;
            case 24:
                function1.invoke(AccountSwitcherViewEvent.Close.INSTANCE);
                break;
            case 25:
                function1.invoke(AccountsLoadingFailedViewEvent$CloseClicked.INSTANCE);
                break;
            case 26:
                function1.invoke(dismissBottomSheet);
                break;
            case 27:
                int i2 = BusinessInfoView.$r8$clinit;
                function1.invoke(dismissBottomSheet);
                break;
            case 28:
                function1.invoke(BusinessInfoViewEvent.BackClicked.INSTANCE);
                break;
            default:
                function1.invoke(BusinessInfoViewEvent.ViewBusinessTaxInfo.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
