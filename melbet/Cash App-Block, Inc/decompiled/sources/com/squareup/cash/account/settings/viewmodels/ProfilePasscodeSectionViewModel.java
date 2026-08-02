package com.squareup.cash.account.settings.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ProfilePasscodeSectionViewModel {
    public final Toggle appLockToggle;
    public final Toggle biometricsToggle;
    public final Control securityLockControl;
    public final Toggle transferToggle;

    public ProfilePasscodeSectionViewModel(Control control, Toggle toggle, Toggle toggle2, int i) {
        toggle = (i & 4) != 0 ? null : toggle;
        toggle2 = (i & 8) != 0 ? null : toggle2;
        this.securityLockControl = control;
        this.biometricsToggle = null;
        this.appLockToggle = toggle;
        this.transferToggle = toggle2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfilePasscodeSectionViewModel)) {
            return false;
        }
        ProfilePasscodeSectionViewModel profilePasscodeSectionViewModel = (ProfilePasscodeSectionViewModel) obj;
        return this.securityLockControl.equals(profilePasscodeSectionViewModel.securityLockControl) && Intrinsics.areEqual(this.biometricsToggle, profilePasscodeSectionViewModel.biometricsToggle) && Intrinsics.areEqual(this.appLockToggle, profilePasscodeSectionViewModel.appLockToggle) && Intrinsics.areEqual(this.transferToggle, profilePasscodeSectionViewModel.transferToggle);
    }

    public final int hashCode() {
        int hashCode = this.securityLockControl.hashCode() * 31;
        Toggle toggle = this.biometricsToggle;
        int hashCode2 = (hashCode + (toggle == null ? 0 : toggle.hashCode())) * 31;
        Toggle toggle2 = this.appLockToggle;
        int hashCode3 = (hashCode2 + (toggle2 == null ? 0 : toggle2.hashCode())) * 31;
        Toggle toggle3 = this.transferToggle;
        return hashCode3 + (toggle3 != null ? toggle3.hashCode() : 0);
    }

    public final String toString() {
        return "ProfilePasscodeSectionViewModel(securityLockControl=" + this.securityLockControl + ", biometricsToggle=" + this.biometricsToggle + ", appLockToggle=" + this.appLockToggle + ", transferToggle=" + this.transferToggle + ")";
    }
}
