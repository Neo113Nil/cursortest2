package com.squareup.cash.profile.views;

import com.squareup.cash.account.settings.viewmodels.IncomingRequestsViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePasswordDialogViewEvent$OkClick;
import com.squareup.cash.account.settings.viewmodels.SearchPrivacySectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.TaxesPasswordViewEvent;
import com.squareup.cash.account.settings.viewmodels.UnsupportedSettingViewEvent;
import com.squareup.cash.profile.viewmodels.CategoryListViewEvent;
import com.squareup.cash.profile.viewmodels.GenericProfileElementsViewEvent;
import com.squareup.cash.profile.viewmodels.OpenSourceViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileConfirmRemoveAliasViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileHeaderMenuSheetResult;
import com.squareup.cash.profile.viewmodels.ProfileHeaderMenuViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class ProfileKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ ProfileKt$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        IncomingRequestsViewEvent.GoBack goBack = IncomingRequestsViewEvent.GoBack.INSTANCE;
        ProfileViewEvent.ProfileAvatarClicked profileAvatarClicked = ProfileViewEvent.ProfileAvatarClicked.INSTANCE;
        SearchPrivacySectionViewEvent.GoBack goBack2 = SearchPrivacySectionViewEvent.GoBack.INSTANCE;
        ProfilePasscodeSectionViewEvent.GoBack goBack3 = ProfilePasscodeSectionViewEvent.GoBack.INSTANCE;
        TaxesPasswordViewEvent.GoBack goBack4 = TaxesPasswordViewEvent.GoBack.INSTANCE;
        UnsupportedSettingViewEvent.CloseClicked closeClicked = UnsupportedSettingViewEvent.CloseClicked.INSTANCE;
        CategoryListViewEvent.DialogDismissed dialogDismissed = CategoryListViewEvent.DialogDismissed.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(ProfileViewEvent.NavigationIconClicked.INSTANCE);
                break;
            case 1:
                function1.invoke(GenericProfileElementsViewEvent.FavoritesListViewAllClicked.INSTANCE);
                break;
            case 2:
                int i2 = IncomingRequestsView.$r8$clinit;
                function1.invoke(goBack);
                break;
            case 3:
                function1.invoke(goBack);
                break;
            case 4:
                function1.invoke(OpenSourceViewEvent.Exit.INSTANCE);
                break;
            case 5:
                function1.invoke(ProfileConfirmRemoveAliasViewEvent.ConfirmClicked.INSTANCE);
                break;
            case 6:
                function1.invoke(ProfileConfirmRemoveAliasViewEvent.CancelClicked.INSTANCE);
                break;
            case 7:
                function1.invoke(new ProfileHeaderMenuViewEvent.Complete(ProfileHeaderMenuSheetResult.EXISTING_PHOTO));
                break;
            case 8:
                function1.invoke(new ProfileHeaderMenuViewEvent.Complete(ProfileHeaderMenuSheetResult.TAKE_PHOTO));
                break;
            case 9:
                function1.invoke(new ProfileHeaderMenuViewEvent.Complete(ProfileHeaderMenuSheetResult.CLEAR_PHOTO));
                break;
            case 10:
                function1.invoke(profileAvatarClicked);
                break;
            case 11:
                function1.invoke(ProfileViewEvent.PrimaryButtonClicked.INSTANCE);
                break;
            case 12:
                function1.invoke(ProfileViewEvent.SecondaryButtonClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(profileAvatarClicked);
                break;
            case 14:
                int i3 = SearchVisibilityView.$r8$clinit;
                function1.invoke(goBack2);
                break;
            case 15:
                function1.invoke(goBack2);
                break;
            case 16:
                int i4 = SecurityLockView.$r8$clinit;
                function1.invoke(goBack3);
                break;
            case 17:
                function1.invoke(goBack3);
                break;
            case 18:
                function1.invoke(ProfilePasswordDialogViewEvent$OkClick.INSTANCE);
                break;
            case 19:
                int i5 = TaxesPasswordView.$r8$clinit;
                function1.invoke(goBack4);
                break;
            case 20:
                function1.invoke(goBack4);
                break;
            case 21:
                function1.invoke(TaxesPasswordViewEvent.ChangePasswordClicked.INSTANCE);
                break;
            case 22:
                int i6 = UnsupportedSettingView.$r8$clinit;
                function1.invoke(closeClicked);
                break;
            case 23:
                function1.invoke(closeClicked);
                break;
            case 24:
                function1.invoke(UnsupportedSettingViewEvent.SwitchAccountsClicked.INSTANCE);
                break;
            case 25:
                function1.invoke(dialogDismissed);
                break;
            case 26:
                function1.invoke(dialogDismissed);
                break;
            case 27:
                function1.invoke(CategoryListViewEvent.OpenNotificationSettingsClick.INSTANCE);
                break;
            case 28:
                function1.invoke(dialogDismissed);
                break;
            default:
                function1.invoke(CategoryListViewEvent.GoBack.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
