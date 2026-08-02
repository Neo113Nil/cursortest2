package com.squareup.cash.account.settings.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface ProfilePrivacyViewModel {

    /* loaded from: classes7.dex */
    public final class Loading implements ProfilePrivacyViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 2142193612;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes7.dex */
    public final class Ready implements ProfilePrivacyViewModel {
        public final ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel allowedAccountsSectionViewModel;
        public final ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel blockedAccountsSectionModel;
        public final ProfilePrivacyReadyViewModel$CashMeSettingViewModel cashMeSettingModel;
        public final boolean contactsSync;
        public final ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel personalizedAdsSettingModel;
        public final ProfilePrivacyReadyViewModel$ProfileSecurityPolicy policy;
        public final ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel searchPrivacySectionViewModel;
        public final boolean showIncomingRequestsSection;

        public Ready(boolean z, ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel, ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel, boolean z2, ProfilePrivacyReadyViewModel$SearchPrivacySectionViewModel profilePrivacyReadyViewModel$SearchPrivacySectionViewModel, ProfilePrivacyReadyViewModel$CashMeSettingViewModel profilePrivacyReadyViewModel$CashMeSettingViewModel, ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel, ProfilePrivacyReadyViewModel$ProfileSecurityPolicy profilePrivacyReadyViewModel$ProfileSecurityPolicy) {
            this.contactsSync = z;
            this.blockedAccountsSectionModel = profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel;
            this.allowedAccountsSectionViewModel = profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel;
            this.showIncomingRequestsSection = z2;
            this.searchPrivacySectionViewModel = profilePrivacyReadyViewModel$SearchPrivacySectionViewModel;
            this.cashMeSettingModel = profilePrivacyReadyViewModel$CashMeSettingViewModel;
            this.personalizedAdsSettingModel = profilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel;
            this.policy = profilePrivacyReadyViewModel$ProfileSecurityPolicy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.contactsSync == ready.contactsSync && Intrinsics.areEqual(this.blockedAccountsSectionModel, ready.blockedAccountsSectionModel) && Intrinsics.areEqual(this.allowedAccountsSectionViewModel, ready.allowedAccountsSectionViewModel) && this.showIncomingRequestsSection == ready.showIncomingRequestsSection && this.searchPrivacySectionViewModel.equals(ready.searchPrivacySectionViewModel) && this.cashMeSettingModel.equals(ready.cashMeSettingModel) && this.personalizedAdsSettingModel.equals(ready.personalizedAdsSettingModel) && this.policy.equals(ready.policy);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.contactsSync) * 31;
            ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel = this.blockedAccountsSectionModel;
            int hashCode2 = (hashCode + (profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel == null ? 0 : profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel.hashCode())) * 31;
            ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel = this.allowedAccountsSectionViewModel;
            return this.policy.hashCode() + ((this.personalizedAdsSettingModel.hashCode() + ((this.cashMeSettingModel.hashCode() + ((this.searchPrivacySectionViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel != null ? profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel.hashCode() : 0)) * 31, 31, this.showIncomingRequestsSection)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Ready(contactsSync=" + this.contactsSync + ", blockedAccountsSectionModel=" + this.blockedAccountsSectionModel + ", allowedAccountsSectionViewModel=" + this.allowedAccountsSectionViewModel + ", showIncomingRequestsSection=" + this.showIncomingRequestsSection + ", searchPrivacySectionViewModel=" + this.searchPrivacySectionViewModel + ", cashMeSettingModel=" + this.cashMeSettingModel + ", personalizedAdsSettingModel=" + this.personalizedAdsSettingModel + ", policy=" + this.policy + ")";
        }
    }
}
