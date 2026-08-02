package com.squareup.cash.account.settings.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel {
    public final int numBlockedAccounts;
    public final String subtitle;
    public final String title;
    public final String viewAllButtonLabel;

    public ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel(String str, String str2, String str3, int i) {
        str2.getClass();
        str3.getClass();
        this.title = str;
        this.subtitle = str2;
        this.viewAllButtonLabel = str3;
        this.numBlockedAccounts = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel)) {
            return false;
        }
        ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel = (ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel) obj;
        return this.title.equals(profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel.title) && Intrinsics.areEqual(this.subtitle, profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel.subtitle) && Intrinsics.areEqual(this.viewAllButtonLabel, profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel.viewAllButtonLabel) && this.numBlockedAccounts == profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel.numBlockedAccounts;
    }

    public final int hashCode() {
        return Integer.hashCode(this.numBlockedAccounts) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle), 31, this.viewAllButtonLabel);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BlockedAccountsSectionViewModel(title=", this.title, ", subtitle=", this.subtitle, ", viewAllButtonLabel=");
        m.append(this.viewAllButtonLabel);
        m.append(", numBlockedAccounts=");
        m.append(this.numBlockedAccounts);
        m.append(")");
        return m.toString();
    }
}
