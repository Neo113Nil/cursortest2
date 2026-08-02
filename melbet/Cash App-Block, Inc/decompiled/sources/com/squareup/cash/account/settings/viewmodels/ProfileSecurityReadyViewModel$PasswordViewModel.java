package com.squareup.cash.account.settings.viewmodels;

/* loaded from: classes5.dex */
public final class ProfileSecurityReadyViewModel$PasswordViewModel {
    public final ChangePasswordViewModel changePasswordViewModel;
    public final boolean showPasswordSection;

    public ProfileSecurityReadyViewModel$PasswordViewModel(boolean z, ChangePasswordViewModel changePasswordViewModel) {
        this.showPasswordSection = z;
        this.changePasswordViewModel = changePasswordViewModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileSecurityReadyViewModel$PasswordViewModel)) {
            return false;
        }
        ProfileSecurityReadyViewModel$PasswordViewModel profileSecurityReadyViewModel$PasswordViewModel = (ProfileSecurityReadyViewModel$PasswordViewModel) obj;
        return this.showPasswordSection == profileSecurityReadyViewModel$PasswordViewModel.showPasswordSection && this.changePasswordViewModel.equals(profileSecurityReadyViewModel$PasswordViewModel.changePasswordViewModel);
    }

    public final int hashCode() {
        return this.changePasswordViewModel.state.hashCode() + (Boolean.hashCode(this.showPasswordSection) * 31);
    }

    public final String toString() {
        return "PasswordViewModel(showPasswordSection=" + this.showPasswordSection + ", changePasswordViewModel=" + this.changePasswordViewModel + ")";
    }
}
