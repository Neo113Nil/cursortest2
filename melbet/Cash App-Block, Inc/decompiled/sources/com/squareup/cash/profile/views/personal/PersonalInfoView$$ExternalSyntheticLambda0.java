package com.squareup.cash.profile.views.personal;

import com.squareup.cash.account.settings.viewmodels.AliasesSectionEvent;
import com.squareup.cash.account.settings.viewmodels.AllowedAccountsSectionViewEvent$TapViewAll;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewEvent;
import com.squareup.cash.account.settings.viewmodels.BlockedAccountsSectionViewEvent$TapViewAll;
import com.squareup.cash.account.settings.viewmodels.IdentityVerificationSectionViewEvent$IdentityVerificationClick;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoConfirmationDialogEvent;
import com.squareup.cash.account.settings.viewmodels.PersonalInfoSectionViewEvent;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfilePasscodeSectionViewEvent;
import com.squareup.cash.profile.viewmodels.ChannelListViewEvent;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewEvent;
import com.squareup.cash.profile.viewmodels.EnableAliasSheetViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class PersonalInfoView$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ PersonalInfoView$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PersonalScreenViewEvent.Close close = PersonalScreenViewEvent.Close.INSTANCE;
        ChannelListViewEvent.DialogDismissed dialogDismissed = ChannelListViewEvent.DialogDismissed.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(close);
                break;
            case 1:
                function1.invoke(dialogDismissed);
                break;
            case 2:
                function1.invoke(dialogDismissed);
                break;
            case 3:
                function1.invoke(ChannelListViewEvent.OpenNotificationSettingsClick.INSTANCE);
                break;
            case 4:
                function1.invoke(dialogDismissed);
                break;
            case 5:
                function1.invoke(ChannelListViewEvent.GoBack.INSTANCE);
                break;
            case 6:
                function1.invoke(ContactMethodDetailsViewEvent.GoBack.INSTANCE);
                break;
            case 7:
                function1.invoke(EnableAliasSheetViewEvent.Dismiss.INSTANCE);
                break;
            case 8:
                function1.invoke(EnableAliasSheetViewEvent.ConfirmClicked.INSTANCE);
                break;
            case 9:
                function1.invoke(ProfileNotificationsViewEvent.GoBack.INSTANCE);
                break;
            case 10:
                function1.invoke(ProfileNotificationsViewEvent.OpenSettingsTapped.INSTANCE);
                break;
            case 11:
                function1.invoke(ArcadeAutofillSettingsDetailViewEvent.ErrorCtaButtonClicked.INSTANCE);
                break;
            case 12:
                function1.invoke(ArcadeAutofillSettingsDetailViewEvent.DiscardChangesAccepted.INSTANCE);
                break;
            case 13:
                function1.invoke(ArcadeAutofillSettingsDetailViewEvent.CtaButtonClicked.INSTANCE);
                break;
            case 14:
                function1.invoke(ArcadeAutofillSettingsDetailViewEvent.SuccessAnimationCompleted.INSTANCE);
                break;
            case 15:
                function1.invoke(ArcadeAutofillSettingsDetailViewEvent.AutofillToggleClicked.INSTANCE);
                break;
            case 16:
                function1.invoke(AliasesSectionEvent.NavigationAction.AddMobile.INSTANCE);
                break;
            case 17:
                function1.invoke(AliasesSectionEvent.NavigationAction.AddEmail.INSTANCE);
                break;
            case 18:
                function1.invoke(PersonalInfoConfirmationDialogEvent.Confirm.INSTANCE);
                break;
            case 19:
                function1.invoke(PersonalInfoConfirmationDialogEvent.ReviewLater.INSTANCE);
                break;
            case 20:
                function1.invoke(PersonalInfoSectionViewEvent.ShowLegalNameHelperSection.INSTANCE);
                break;
            case 21:
                function1.invoke(PersonalInfoSectionViewEvent.AddressClick.INSTANCE);
                break;
            case 22:
                function1.invoke(PersonalInfoSectionViewEvent.BannerCtaClick.INSTANCE);
                break;
            case 23:
                function1.invoke(close);
                break;
            case 24:
                function1.invoke(Boolean.FALSE);
                break;
            case 25:
                function1.invoke(Boolean.TRUE);
                break;
            case 26:
                function1.invoke(AllowedAccountsSectionViewEvent$TapViewAll.INSTANCE);
                break;
            case 27:
                function1.invoke(BlockedAccountsSectionViewEvent$TapViewAll.INSTANCE);
                break;
            case 28:
                function1.invoke(ProfilePasscodeSectionViewEvent.ChangePasscodeClick.INSTANCE);
                break;
            default:
                function1.invoke(IdentityVerificationSectionViewEvent$IdentityVerificationClick.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
