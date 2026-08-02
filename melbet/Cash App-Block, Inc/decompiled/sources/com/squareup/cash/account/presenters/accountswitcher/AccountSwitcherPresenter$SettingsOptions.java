package com.squareup.cash.account.presenters.accountswitcher;

import com.squareup.cash.eligibility.backend.api.SettingVisibility;

/* loaded from: classes5.dex */
public final class AccountSwitcherPresenter$SettingsOptions {
    public final SettingVisibility createBusinessVisibility;
    public final SettingVisibility createPersonalVisibility;
    public final SettingVisibility linkAccountVisibility;

    public AccountSwitcherPresenter$SettingsOptions(SettingVisibility settingVisibility, SettingVisibility settingVisibility2, SettingVisibility settingVisibility3) {
        this.createBusinessVisibility = settingVisibility;
        this.createPersonalVisibility = settingVisibility2;
        this.linkAccountVisibility = settingVisibility3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitcherPresenter$SettingsOptions)) {
            return false;
        }
        AccountSwitcherPresenter$SettingsOptions accountSwitcherPresenter$SettingsOptions = (AccountSwitcherPresenter$SettingsOptions) obj;
        return this.createBusinessVisibility == accountSwitcherPresenter$SettingsOptions.createBusinessVisibility && this.createPersonalVisibility == accountSwitcherPresenter$SettingsOptions.createPersonalVisibility && this.linkAccountVisibility == accountSwitcherPresenter$SettingsOptions.linkAccountVisibility;
    }

    public final int hashCode() {
        return this.linkAccountVisibility.hashCode() + ((this.createPersonalVisibility.hashCode() + (this.createBusinessVisibility.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SettingsOptions(createBusinessVisibility=" + this.createBusinessVisibility + ", createPersonalVisibility=" + this.createPersonalVisibility + ", linkAccountVisibility=" + this.linkAccountVisibility + ")";
    }
}
