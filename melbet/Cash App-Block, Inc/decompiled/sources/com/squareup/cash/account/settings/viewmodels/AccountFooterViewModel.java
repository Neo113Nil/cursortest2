package com.squareup.cash.account.settings.viewmodels;

import com.squareup.cash.eligibility.backend.api.SettingVisibility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AccountFooterViewModel {
    public final String appVersion;
    public final SettingVisibility createBusinessAccountVisibility;
    public final SettingVisibility createPersonalAccountVisibility;
    public final String disclosureText;
    public final boolean showDisclosureIcon;

    public AccountFooterViewModel(String str, SettingVisibility settingVisibility, SettingVisibility settingVisibility2, String str2, boolean z) {
        str.getClass();
        this.appVersion = str;
        this.createBusinessAccountVisibility = settingVisibility;
        this.createPersonalAccountVisibility = settingVisibility2;
        this.disclosureText = str2;
        this.showDisclosureIcon = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountFooterViewModel)) {
            return false;
        }
        AccountFooterViewModel accountFooterViewModel = (AccountFooterViewModel) obj;
        return Intrinsics.areEqual(this.appVersion, accountFooterViewModel.appVersion) && this.createBusinessAccountVisibility == accountFooterViewModel.createBusinessAccountVisibility && this.createPersonalAccountVisibility == accountFooterViewModel.createPersonalAccountVisibility && Intrinsics.areEqual(this.disclosureText, accountFooterViewModel.disclosureText) && this.showDisclosureIcon == accountFooterViewModel.showDisclosureIcon;
    }

    public final int hashCode() {
        int hashCode = (this.createPersonalAccountVisibility.hashCode() + ((this.createBusinessAccountVisibility.hashCode() + (this.appVersion.hashCode() * 31)) * 31)) * 31;
        String str = this.disclosureText;
        return Boolean.hashCode(this.showDisclosureIcon) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountFooterViewModel(appVersion=");
        sb.append(this.appVersion);
        sb.append(", createBusinessAccountVisibility=");
        sb.append(this.createBusinessAccountVisibility);
        sb.append(", createPersonalAccountVisibility=");
        sb.append(this.createPersonalAccountVisibility);
        sb.append(", disclosureText=");
        sb.append(this.disclosureText);
        sb.append(", showDisclosureIcon=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showDisclosureIcon, ")");
    }
}
