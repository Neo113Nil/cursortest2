package com.squareup.cash.account.settings.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel {
    public final String body;
    public final String label;
    public final Integer numAllowedAccounts;

    public ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel(Integer num, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.label = str;
        this.body = str2;
        this.numAllowedAccounts = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel)) {
            return false;
        }
        ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel = (ProfilePrivacyReadyViewModel$AllowedAccountsSectionViewModel) obj;
        return Intrinsics.areEqual(this.label, profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel.label) && Intrinsics.areEqual(this.body, profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel.body) && Intrinsics.areEqual(this.numAllowedAccounts, profilePrivacyReadyViewModel$AllowedAccountsSectionViewModel.numAllowedAccounts);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.body);
        Integer num = this.numAllowedAccounts;
        return m + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AllowedAccountsSectionViewModel(label=", this.label, ", body=", this.body, ", numAllowedAccounts="), this.numAllowedAccounts, ")");
    }
}
