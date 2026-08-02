package com.squareup.cash.blockers.views;

import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import com.squareup.cash.account.settings.viewmodels.ArcadeAutofillSettingsDetailViewEvent;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewEvent;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewEvent;
import com.squareup.cash.blockers.viewmodels.SetAddressViewEvent;
import com.squareup.cash.blockers.viewmodels.SetNameEvent;
import com.squareup.cash.family.requestsponsorship.viewmodels.SelectSponsorViewEvent;
import com.squareup.cash.invitations.InviteContactsViewEvent;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.payments.viewmodels.MainPaymentViewEvent;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewEvent;
import com.squareup.cash.payments.viewmodels.QuickPayViewEvent;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import com.squareup.cash.shopping.autofill.viewmodels.EditAutofillViewEvent;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewEvent;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewEvent;
import com.squareup.cash.support.views.ContactSupportEmailInputView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class SetNameViewKt$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DelegatingSoftwareKeyboardController f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ SetNameViewKt$$ExternalSyntheticLambda6(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = delegatingSoftwareKeyboardController;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InviteContactsViewEvent.Shared shared = InviteContactsViewEvent.Shared.INSTANCE;
        MainPaymentViewEvent.PersonalizePaymentClick personalizePaymentClick = MainPaymentViewEvent.PersonalizePaymentClick.INSTANCE;
        Function1 function1 = this.f$1;
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = this.f$0;
        switch (i) {
            case 0:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(SetNameEvent.GoBack.INSTANCE);
                break;
            case 1:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(BankAccountLinkingViewEvent.Back.INSTANCE);
                break;
            case 2:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(ReferralCodeViewEvent.SkipAction.INSTANCE);
                break;
            case 3:
                function1.invoke(ReferralCodeViewEvent.GoBack.INSTANCE);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
            case 4:
                function1.invoke(SetAddressViewEvent.Exit.INSTANCE);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
            case 5:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(SelectSponsorViewEvent.ClosePressed.INSTANCE);
                break;
            case 6:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(InviteContactsViewEvent.Close.INSTANCE);
                break;
            case 7:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(InviteContactsViewEvent.ShowReferralRules.INSTANCE);
                break;
            case 8:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(shared);
                break;
            case 9:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(shared);
                break;
            case 10:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(MoneybotChatViewEvent.OpenChatHistory.INSTANCE);
                break;
            case 11:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(MainPaymentViewEvent.SelectInstrument.INSTANCE);
                break;
            case 12:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(MainPaymentViewEvent.CloseClicked.INSTANCE);
                break;
            case 13:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(personalizePaymentClick);
                break;
            case 14:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(personalizePaymentClick);
                break;
            case 15:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(PaymentConfigurationViewEvent.Back.INSTANCE);
                break;
            case 16:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(QuickPayViewEvent.SelectInstrumentClick.INSTANCE);
                break;
            case 17:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(QuickPayViewEvent.Close.INSTANCE);
                break;
            case 18:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(QuickPayViewEvent.OpenDetails.INSTANCE);
                break;
            case 19:
                function1.invoke(PoolInvitePeopleListViewEvent.Exit.INSTANCE);
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                break;
            case 20:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(ArcadeAutofillSettingsDetailViewEvent.ErrorCloseClicked.INSTANCE);
                break;
            case 21:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(ArcadeAutofillSettingsDetailViewEvent.BackClicked.INSTANCE);
                break;
            case 22:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(EditAutofillViewEvent.ErrorCloseClicked.INSTANCE);
                break;
            case 23:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(EditAutofillViewEvent.BackClicked.INSTANCE);
                break;
            case 24:
                int i2 = ContactSupportEmailInputView.$r8$clinit;
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(ContactSupportEmailInputViewEvent.ExitFlow.INSTANCE);
                break;
            default:
                if (delegatingSoftwareKeyboardController != null) {
                    delegatingSoftwareKeyboardController.hide();
                }
                function1.invoke(ContactSupportEmailMessageViewEvent.ExitFlow.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SetNameViewKt$$ExternalSyntheticLambda6(Function1 function1, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = delegatingSoftwareKeyboardController;
    }
}
