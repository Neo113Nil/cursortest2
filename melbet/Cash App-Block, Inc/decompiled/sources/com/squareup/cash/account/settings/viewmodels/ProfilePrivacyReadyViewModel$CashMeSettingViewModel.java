package com.squareup.cash.account.settings.viewmodels;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfilePrivacyReadyViewModel$CashMeSettingViewModel {
    public final String description;
    public final String headerText;
    public final boolean isActivated;
    public final boolean isChecked;
    public final boolean showCashMeSection;

    public ProfilePrivacyReadyViewModel$CashMeSettingViewModel(String str, String str2, boolean z, boolean z2, boolean z3) {
        str2.getClass();
        this.headerText = str;
        this.description = str2;
        this.isChecked = z;
        this.isActivated = z2;
        this.showCashMeSection = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePrivacyReadyViewModel$CashMeSettingViewModel)) {
            return false;
        }
        ProfilePrivacyReadyViewModel$CashMeSettingViewModel profilePrivacyReadyViewModel$CashMeSettingViewModel = (ProfilePrivacyReadyViewModel$CashMeSettingViewModel) obj;
        return this.headerText.equals(profilePrivacyReadyViewModel$CashMeSettingViewModel.headerText) && Intrinsics.areEqual(this.description, profilePrivacyReadyViewModel$CashMeSettingViewModel.description) && this.isChecked == profilePrivacyReadyViewModel$CashMeSettingViewModel.isChecked && this.isActivated == profilePrivacyReadyViewModel$CashMeSettingViewModel.isActivated && this.showCashMeSection == profilePrivacyReadyViewModel$CashMeSettingViewModel.showCashMeSection;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.showCashMeSection) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.headerText.hashCode() * 31, 31, this.description), 31, this.isChecked), 31, this.isActivated);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CashMeSettingViewModel(headerText=", this.headerText, ", description=", this.description, ", isChecked=");
        re$$ExternalSyntheticOutline0.m(m, this.isChecked, ", isActivated=", this.isActivated, ", showCashMeSection=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.showCashMeSection, ")");
    }
}
