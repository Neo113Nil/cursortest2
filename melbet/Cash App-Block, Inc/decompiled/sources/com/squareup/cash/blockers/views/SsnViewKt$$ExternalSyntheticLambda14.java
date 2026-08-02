package com.squareup.cash.blockers.views;

import com.squareup.cash.blockers.viewmodels.ContactsPermissionExplanationSheetEvent;
import com.squareup.cash.blockers.viewmodels.InviteFriendsViewEvent;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewEvent;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.SelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.SetAddressViewEvent;
import com.squareup.cash.blockers.viewmodels.SetNameEvent;
import com.squareup.cash.blockers.viewmodels.SetPinViewEvent;
import com.squareup.cash.blockers.viewmodels.SignatureViewEvent;
import com.squareup.cash.blockers.viewmodels.SsnViewEvent;
import com.squareup.cash.blockers.viewmodels.StatusResultViewEvent;
import com.squareup.cash.blockers.viewmodels.UnselectableOptionViewEvent$GoBack;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyHelpViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentViewEvent;
import com.squareup.cash.blockers.viewmodels.WelcomeViewEvent$Back;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class SsnViewKt$$ExternalSyntheticLambda14 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda14(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SelectionViewEvent.GoBack goBack = SelectionViewEvent.GoBack.INSTANCE;
        SignatureViewEvent.Back back = SignatureViewEvent.Back.INSTANCE;
        InviteFriendsViewEvent.SkipClick skipClick = InviteFriendsViewEvent.SkipClick.INSTANCE;
        InviteFriendsViewEvent.InviteClick inviteClick = InviteFriendsViewEvent.InviteClick.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(SsnViewEvent.Help.INSTANCE);
                break;
            case 1:
                function1.invoke(RequestPushNotificationsBlockerViewEvent.OnDismiss.INSTANCE);
                break;
            case 2:
                function1.invoke(RequestPushNotificationsBlockerViewEvent.OnContinue.INSTANCE);
                break;
            case 3:
                function1.invoke(SavingsTransferOptionSelectionViewEvent.Dismiss.INSTANCE);
                break;
            case 4:
                function1.invoke(SavingsTransferOptionSelectionViewEvent.Back.INSTANCE);
                break;
            case 5:
                int i2 = SelectionView.$r8$clinit;
                function1.invoke(goBack);
                break;
            case 6:
                function1.invoke(goBack);
                break;
            case 7:
                function1.invoke(SetAddressViewEvent.GoBack.INSTANCE);
                break;
            case 8:
                function1.invoke(SetAddressViewEvent.HelpClick.INSTANCE);
                break;
            case 9:
                function1.invoke(SetNameEvent.HelpButtonClicked.INSTANCE);
                break;
            case 10:
                function1.invoke(SetPinViewEvent.HelpButtonClicked.INSTANCE);
                break;
            case 11:
                function1.invoke(SetPinViewEvent.PrimaryButtonClicked.INSTANCE);
                break;
            case 12:
                int i3 = SignatureView.$r8$clinit;
                function1.invoke(back);
                break;
            case 13:
                function1.invoke(back);
                break;
            case 14:
                function1.invoke(StatusResultViewEvent.GoBack.INSTANCE);
                break;
            case 15:
                function1.invoke(UnselectableOptionViewEvent$GoBack.INSTANCE);
                break;
            case 16:
                function1.invoke(VerifyInstrumentViewEvent.ShowHelpItems.INSTANCE);
                break;
            case 17:
                int i4 = VerifyContactsView.$r8$clinit;
                function1.invoke(VerifyContactsViewEvent.OSBack.INSTANCE);
                break;
            case 18:
                function1.invoke(VerifyContactsViewEvent.Dismiss.INSTANCE);
                break;
            case 19:
                function1.invoke(VerifyContactsViewEvent.HelpClick.INSTANCE);
                break;
            case 20:
                function1.invoke(VerifyContactsViewEvent.Submit.INSTANCE);
                break;
            case 21:
                function1.invoke(VerifyHelpViewEvent.CancelClick.INSTANCE);
                break;
            case 22:
                function1.invoke(WelcomeViewEvent$Back.INSTANCE);
                break;
            case 23:
                function1.invoke(ContactsPermissionExplanationSheetEvent.OnCloseClick.INSTANCE);
                break;
            case 24:
                function1.invoke(InviteFriendsViewEvent.CloseClick.INSTANCE);
                break;
            case 25:
                function1.invoke(skipClick);
                break;
            case 26:
                function1.invoke(inviteClick);
                break;
            case 27:
                function1.invoke(InviteFriendsViewEvent.HowWeUseContactsClick.INSTANCE);
                break;
            case 28:
                function1.invoke(skipClick);
                break;
            default:
                function1.invoke(inviteClick);
                break;
        }
        return Unit.INSTANCE;
    }
}
