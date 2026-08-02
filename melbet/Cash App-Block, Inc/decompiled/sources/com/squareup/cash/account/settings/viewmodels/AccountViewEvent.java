package com.squareup.cash.account.settings.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.screen.Screen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AccountViewEvent {

    public final class AddPhotoClick implements AccountViewEvent {
        public static final AddPhotoClick INSTANCE = new AddPhotoClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddPhotoClick);
        }

        public final int hashCode() {
            return 1488837528;
        }

        public final String toString() {
            return "AddPhotoClick";
        }
    }

    public final class AddQrToHomeScreenClicked implements AccountViewEvent {
        public static final AddQrToHomeScreenClicked INSTANCE = new AddQrToHomeScreenClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddQrToHomeScreenClicked);
        }

        public final int hashCode() {
            return 1763477502;
        }

        public final String toString() {
            return "AddQrToHomeScreenClicked";
        }
    }

    public final class BackClicked implements AccountViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 2026277665;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class BusinessInfoClick implements AccountViewEvent {
        public static final BusinessInfoClick INSTANCE = new BusinessInfoClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BusinessInfoClick);
        }

        public final int hashCode() {
            return -1441135941;
        }

        public final String toString() {
            return "BusinessInfoClick";
        }
    }

    public final class BusinessesClick implements AccountViewEvent {
        public static final BusinessesClick INSTANCE = new BusinessesClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BusinessesClick);
        }

        public final int hashCode() {
            return 1115823899;
        }

        public final String toString() {
            return "BusinessesClick";
        }
    }

    public final class ClaimRewardClick implements AccountViewEvent {
        public static final ClaimRewardClick INSTANCE = new ClaimRewardClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ClaimRewardClick);
        }

        public final int hashCode() {
            return 655100028;
        }

        public final String toString() {
            return "ClaimRewardClick";
        }
    }

    public final class CreateBusinessAccountClick implements AccountViewEvent {
        public static final CreateBusinessAccountClick INSTANCE = new CreateBusinessAccountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreateBusinessAccountClick);
        }

        public final int hashCode() {
            return 1742801494;
        }

        public final String toString() {
            return "CreateBusinessAccountClick";
        }
    }

    public final class CreatePersonalAccountClick implements AccountViewEvent {
        public static final CreatePersonalAccountClick INSTANCE = new CreatePersonalAccountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CreatePersonalAccountClick);
        }

        public final int hashCode() {
            return 1027649750;
        }

        public final String toString() {
            return "CreatePersonalAccountClick";
        }
    }

    public final class DisclosureUrlClick implements AccountViewEvent {
        public final String url;

        public DisclosureUrlClick(String str) {
            str.getClass();
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DisclosureUrlClick) && Intrinsics.areEqual(this.url, ((DisclosureUrlClick) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DisclosureUrlClick(url=", this.url, ")");
        }
    }

    public final class DocumentsClick implements AccountViewEvent {
        public static final DocumentsClick INSTANCE = new DocumentsClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DocumentsClick);
        }

        public final int hashCode() {
            return 87536687;
        }

        public final String toString() {
            return "DocumentsClick";
        }
    }

    public final class EditProfileClicked implements AccountViewEvent {
        public static final EditProfileClicked INSTANCE = new EditProfileClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof EditProfileClicked);
        }

        public final int hashCode() {
            return -1248795161;
        }

        public final String toString() {
            return "EditProfileClicked";
        }
    }

    public final class FamilyAccountsClick implements AccountViewEvent {
        public static final FamilyAccountsClick INSTANCE = new FamilyAccountsClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FamilyAccountsClick);
        }

        public final int hashCode() {
            return -378730209;
        }

        public final String toString() {
            return "FamilyAccountsClick";
        }
    }

    public final class FavoritesListAddClicked implements AccountViewEvent {
        public static final FavoritesListAddClicked INSTANCE = new FavoritesListAddClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FavoritesListAddClicked);
        }

        public final int hashCode() {
            return 971389468;
        }

        public final String toString() {
            return "FavoritesListAddClicked";
        }
    }

    public final class FavoritesListCreateClicked implements AccountViewEvent {
        public static final FavoritesListCreateClicked INSTANCE = new FavoritesListCreateClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FavoritesListCreateClicked);
        }

        public final int hashCode() {
            return -1262024203;
        }

        public final String toString() {
            return "FavoritesListCreateClicked";
        }
    }

    public final class FavoritesListViewAllClicked implements AccountViewEvent {
        public static final FavoritesListViewAllClicked INSTANCE = new FavoritesListViewAllClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FavoritesListViewAllClicked);
        }

        public final int hashCode() {
            return -1552282975;
        }

        public final String toString() {
            return "FavoritesListViewAllClicked";
        }
    }

    public final class FavoritesSettingsRowClicked implements AccountViewEvent {
        public static final FavoritesSettingsRowClicked INSTANCE = new FavoritesSettingsRowClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FavoritesSettingsRowClicked);
        }

        public final int hashCode() {
            return 915534856;
        }

        public final String toString() {
            return "FavoritesSettingsRowClicked";
        }
    }

    public final class HelpClick implements AccountViewEvent {
        public static final HelpClick INSTANCE = new HelpClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HelpClick);
        }

        public final int hashCode() {
            return 330814696;
        }

        public final String toString() {
            return "HelpClick";
        }
    }

    public final class InviteFriendsClicked implements AccountViewEvent {
        public static final InviteFriendsClicked INSTANCE = new InviteFriendsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InviteFriendsClicked);
        }

        public final int hashCode() {
            return -1751615622;
        }

        public final String toString() {
            return "InviteFriendsClicked";
        }
    }

    public final class LimitsClick implements AccountViewEvent {
        public static final LimitsClick INSTANCE = new LimitsClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LimitsClick);
        }

        public final int hashCode() {
            return 282780209;
        }

        public final String toString() {
            return "LimitsClick";
        }
    }

    public final class LinkedBanksClick implements AccountViewEvent {
        public static final LinkedBanksClick INSTANCE = new LinkedBanksClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LinkedBanksClick);
        }

        public final int hashCode() {
            return 1631297481;
        }

        public final String toString() {
            return "LinkedBanksClick";
        }
    }

    public final class NotificationsClick implements AccountViewEvent {
        public static final NotificationsClick INSTANCE = new NotificationsClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NotificationsClick);
        }

        public final int hashCode() {
            return 1781463167;
        }

        public final String toString() {
            return "NotificationsClick";
        }
    }

    public final class OnDialogResult implements AccountViewEvent {
        public final Object result;
        public final Screen screen;

        public OnDialogResult(Screen screen, Object obj) {
            screen.getClass();
            this.screen = screen;
            this.result = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDialogResult)) {
                return false;
            }
            OnDialogResult onDialogResult = (OnDialogResult) obj;
            return Intrinsics.areEqual(this.screen, onDialogResult.screen) && Intrinsics.areEqual(this.result, onDialogResult.result);
        }

        public final int hashCode() {
            int hashCode = this.screen.hashCode() * 31;
            Object obj = this.result;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "OnDialogResult(screen=" + this.screen + ", result=" + this.result + ")";
        }
    }

    public final class OpenSourceSoftwareClick implements AccountViewEvent {
        public static final OpenSourceSoftwareClick INSTANCE = new OpenSourceSoftwareClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenSourceSoftwareClick);
        }

        public final int hashCode() {
            return 1027926397;
        }

        public final String toString() {
            return "OpenSourceSoftwareClick";
        }
    }

    public final class PasskeysClick implements AccountViewEvent {
        public static final PasskeysClick INSTANCE = new PasskeysClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PasskeysClick);
        }

        public final int hashCode() {
            return 404444324;
        }

        public final String toString() {
            return "PasskeysClick";
        }
    }

    public final class PersonalClick implements AccountViewEvent {
        public static final PersonalClick INSTANCE = new PersonalClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PersonalClick);
        }

        public final int hashCode() {
            return -1737356087;
        }

        public final String toString() {
            return "PersonalClick";
        }
    }

    public final class PrivacyClick implements AccountViewEvent {
        public static final PrivacyClick INSTANCE = new PrivacyClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrivacyClick);
        }

        public final int hashCode() {
            return 1903261983;
        }

        public final String toString() {
            return "PrivacyClick";
        }
    }

    public final class PrivacyNoticeClick implements AccountViewEvent {
        public static final PrivacyNoticeClick INSTANCE = new PrivacyNoticeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrivacyNoticeClick);
        }

        public final int hashCode() {
            return 746990567;
        }

        public final String toString() {
            return "PrivacyNoticeClick";
        }
    }

    public final class PromotionsReferralsClick implements AccountViewEvent {
        public static final PromotionsReferralsClick INSTANCE = new PromotionsReferralsClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PromotionsReferralsClick);
        }

        public final int hashCode() {
            return -7441727;
        }

        public final String toString() {
            return "PromotionsReferralsClick";
        }
    }

    public final class QrClick implements AccountViewEvent {
        public static final QrClick INSTANCE = new QrClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QrClick);
        }

        public final int hashCode() {
            return -938215864;
        }

        public final String toString() {
            return "QrClick";
        }
    }

    public final class QrCodeBoxMeasured implements AccountViewEvent {
        public final int backgroundColor;
        public final int logoColor;
        public final int size;

        public QrCodeBoxMeasured(int i, int i2, int i3) {
            this.backgroundColor = i;
            this.logoColor = i2;
            this.size = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QrCodeBoxMeasured)) {
                return false;
            }
            QrCodeBoxMeasured qrCodeBoxMeasured = (QrCodeBoxMeasured) obj;
            return this.backgroundColor == qrCodeBoxMeasured.backgroundColor && this.logoColor == qrCodeBoxMeasured.logoColor && this.size == qrCodeBoxMeasured.size;
        }

        public final int hashCode() {
            return Integer.hashCode(this.size) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.logoColor, Integer.hashCode(this.backgroundColor) * 31, 31);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.size, ")", Recorder$$ExternalSyntheticOutline2.m107m(this.backgroundColor, this.logoColor, "QrCodeBoxMeasured(backgroundColor=", ", logoColor=", ", size="));
        }
    }

    public final class QrCodeRetryClick implements AccountViewEvent {
        public static final QrCodeRetryClick INSTANCE = new QrCodeRetryClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QrCodeRetryClick);
        }

        public final int hashCode() {
            return -901609267;
        }

        public final String toString() {
            return "QrCodeRetryClick";
        }
    }

    public final class QrScanClick implements AccountViewEvent {
        public static final QrScanClick INSTANCE = new QrScanClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof QrScanClick);
        }

        public final int hashCode() {
            return 470705611;
        }

        public final String toString() {
            return "QrScanClick";
        }
    }

    public final class SecurityClick implements AccountViewEvent {
        public static final SecurityClick INSTANCE = new SecurityClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecurityClick);
        }

        public final int hashCode() {
            return 1272208329;
        }

        public final String toString() {
            return "SecurityClick";
        }
    }

    public final class SecurityHubClick implements AccountViewEvent {
        public static final SecurityHubClick INSTANCE = new SecurityHubClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SecurityHubClick);
        }

        public final int hashCode() {
            return 858802098;
        }

        public final String toString() {
            return "SecurityHubClick";
        }
    }

    public final class ShareClick implements AccountViewEvent {
        public static final ShareClick INSTANCE = new ShareClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShareClick);
        }

        public final int hashCode() {
            return -904139032;
        }

        public final String toString() {
            return "ShareClick";
        }
    }

    public final class ShoppingSettingClick implements AccountViewEvent {
        public static final ShoppingSettingClick INSTANCE = new ShoppingSettingClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ShoppingSettingClick);
        }

        public final int hashCode() {
            return -1329543713;
        }

        public final String toString() {
            return "ShoppingSettingClick";
        }
    }

    public final class SignOutClick implements AccountViewEvent {
        public static final SignOutClick INSTANCE = new SignOutClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SignOutClick);
        }

        public final int hashCode() {
            return 597200374;
        }

        public final String toString() {
            return "SignOutClick";
        }
    }

    public final class SocialInstagramClick implements AccountViewEvent {
        public static final SocialInstagramClick INSTANCE = new SocialInstagramClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SocialInstagramClick);
        }

        public final int hashCode() {
            return -1549807358;
        }

        public final String toString() {
            return "SocialInstagramClick";
        }
    }

    public final class SocialXClick implements AccountViewEvent {
        public static final SocialXClick INSTANCE = new SocialXClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SocialXClick);
        }

        public final int hashCode() {
            return 745418748;
        }

        public final String toString() {
            return "SocialXClick";
        }
    }

    public final class SwitchAccountClick implements AccountViewEvent {
        public static final SwitchAccountClick INSTANCE = new SwitchAccountClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SwitchAccountClick);
        }

        public final int hashCode() {
            return 860578734;
        }

        public final String toString() {
            return "SwitchAccountClick";
        }
    }

    public final class TermsOfServiceClick implements AccountViewEvent {
        public static final TermsOfServiceClick INSTANCE = new TermsOfServiceClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TermsOfServiceClick);
        }

        public final int hashCode() {
            return -1318607470;
        }

        public final String toString() {
            return "TermsOfServiceClick";
        }
    }

    public final class ThemesClick implements AccountViewEvent {
        public static final ThemesClick INSTANCE = new ThemesClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ThemesClick);
        }

        public final int hashCode() {
            return -1483028033;
        }

        public final String toString() {
            return "ThemesClick";
        }
    }

    public final class TrustedDevicesClick implements AccountViewEvent {
        public static final TrustedDevicesClick INSTANCE = new TrustedDevicesClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TrustedDevicesClick);
        }

        public final int hashCode() {
            return -1228254685;
        }

        public final String toString() {
            return "TrustedDevicesClick";
        }
    }

    public final class VersionCodeClick implements AccountViewEvent {
        public static final VersionCodeClick INSTANCE = new VersionCodeClick();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VersionCodeClick);
        }

        public final int hashCode() {
            return -1007262622;
        }

        public final String toString() {
            return "VersionCodeClick";
        }
    }
}
