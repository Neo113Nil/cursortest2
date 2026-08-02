package com.squareup.cash.qrcodes.views;

import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyViewEvent;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityPrivacyViewEvent$ManageIncomingRequests;
import com.squareup.cash.account.settings.viewmodels.ProfileSecurityViewEvent;
import com.squareup.cash.account.settings.viewmodels.trustedcontact.InvestingContactViewEvent;
import com.squareup.cash.profile.views.security.ProfilePrivacyView;
import com.squareup.cash.profile.views.security.ProfileSecurityView;
import com.squareup.cash.profile.views.trustedcontact.InvestingContactView;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewEvent;
import com.squareup.cash.qrcodes.viewmodels.CashQrScannerViewEvent;
import com.squareup.cash.qrcodes.viewmodels.CashQrShortcutsOnboardingViewEvent;
import com.squareup.cash.qrcodes.viewmodels.CashtagQrScanViewEvent;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewEvent;
import com.squareup.cash.qrcodes.viewmodels.QrCodeProfileViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class CashtagQrScanView$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ CashtagQrScanView$$ExternalSyntheticLambda0(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ProfilePrivacyViewEvent.NavBack navBack = ProfilePrivacyViewEvent.NavBack.INSTANCE;
        ProfileSecurityViewEvent.NavBack navBack2 = ProfileSecurityViewEvent.NavBack.INSTANCE;
        InvestingContactViewEvent.BackClicked backClicked = InvestingContactViewEvent.BackClicked.INSTANCE;
        CashQrScannerViewEvent.Exit exit = CashQrScannerViewEvent.Exit.INSTANCE;
        CashQrShortcutsOnboardingViewEvent.Dismiss dismiss = CashQrShortcutsOnboardingViewEvent.Dismiss.INSTANCE;
        CashtagQrScanViewEvent.Exit exit2 = CashtagQrScanViewEvent.Exit.INSTANCE;
        QrAddressScannerViewEvent.Exit exit3 = QrAddressScannerViewEvent.Exit.INSTANCE;
        QrCodeProfileViewEvent.Share share = QrCodeProfileViewEvent.Share.INSTANCE;
        QrCodeProfileViewEvent.Back back = QrCodeProfileViewEvent.Back.INSTANCE;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                int i2 = CashtagQrScanView.$r8$clinit;
                function1.invoke(exit2);
                break;
            case 1:
                int i3 = ProfilePrivacyView.$r8$clinit;
                function1.invoke(navBack);
                break;
            case 2:
                function1.invoke(navBack);
                break;
            case 3:
                int i4 = ProfileSecurityView.$r8$clinit;
                function1.invoke(navBack2);
                break;
            case 4:
                function1.invoke(navBack2);
                break;
            case 5:
                function1.invoke(ProfileSecurityPrivacyViewEvent$ManageIncomingRequests.INSTANCE);
                break;
            case 6:
                function1.invoke(ProfilePrivacyViewEvent.ManageSearchVisibility.INSTANCE);
                break;
            case 7:
                function1.invoke(ProfileSecurityViewEvent.ManageSecurityLock.INSTANCE);
                break;
            case 8:
                function1.invoke(ProfileSecurityViewEvent.ManageTaxesPassword.INSTANCE);
                break;
            case 9:
                int i5 = InvestingContactView.$r8$clinit;
                function1.invoke(backClicked);
                break;
            case 10:
                function1.invoke(backClicked);
                break;
            case 11:
                function1.invoke(InvestingContactViewEvent.EditClicked.INSTANCE);
                break;
            case 12:
                function1.invoke(InvestingContactViewEvent.RemoveClicked.INSTANCE);
                break;
            case 13:
                function1.invoke(PromotionsReferralsHomeViewEvent.GoBack.INSTANCE);
                break;
            case 14:
                function1.invoke(PromotionsReferralsHomeViewEvent.EnterCodeTapped.INSTANCE);
                break;
            case 15:
                function1.invoke(PromotionsReferralsHomeViewEvent.InviteFriendTapped.INSTANCE);
                break;
            case 16:
                function1.invoke(exit);
                break;
            case 17:
                function1.invoke(exit);
                break;
            case 18:
                int i6 = CashQrShortcutsOnboardingView.$r8$clinit;
                function1.invoke(dismiss);
                break;
            case 19:
                function1.invoke(CashQrShortcutsOnboardingViewEvent.AddWidget.INSTANCE);
                break;
            case 20:
                function1.invoke(CashQrShortcutsOnboardingViewEvent.AddTile.INSTANCE);
                break;
            case 21:
                function1.invoke(dismiss);
                break;
            case 22:
                function1.invoke(exit2);
                break;
            case 23:
                function1.invoke(exit3);
                break;
            case 24:
                function1.invoke(QrAddressScannerViewEvent.PasteAddressPressed.INSTANCE);
                break;
            case 25:
                function1.invoke(exit3);
                break;
            case 26:
                int i7 = QrCodeProfileView.$r8$clinit;
                function1.invoke(back);
                break;
            case 27:
                function1.invoke(share);
                break;
            case 28:
                function1.invoke(share);
                break;
            default:
                function1.invoke(back);
                break;
        }
        return Unit.INSTANCE;
    }
}
