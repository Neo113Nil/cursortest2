package com.squareup.cash.account.settings.viewmodels;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class ProfileSecurityReadyViewModel$AuthenticatorViewModel {
    public final boolean isAuthenticatorActive;
    public final boolean showAuthenticatorSection;
    public final boolean useTaxesTheme;

    public ProfileSecurityReadyViewModel$AuthenticatorViewModel(boolean z, boolean z2, boolean z3) {
        this.showAuthenticatorSection = z;
        this.isAuthenticatorActive = z2;
        this.useTaxesTheme = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileSecurityReadyViewModel$AuthenticatorViewModel)) {
            return false;
        }
        ProfileSecurityReadyViewModel$AuthenticatorViewModel profileSecurityReadyViewModel$AuthenticatorViewModel = (ProfileSecurityReadyViewModel$AuthenticatorViewModel) obj;
        return this.showAuthenticatorSection == profileSecurityReadyViewModel$AuthenticatorViewModel.showAuthenticatorSection && this.isAuthenticatorActive == profileSecurityReadyViewModel$AuthenticatorViewModel.isAuthenticatorActive && this.useTaxesTheme == profileSecurityReadyViewModel$AuthenticatorViewModel.useTaxesTheme;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.useTaxesTheme) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.showAuthenticatorSection) * 31, 31, this.isAuthenticatorActive);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("AuthenticatorViewModel(showAuthenticatorSection=", ", isAuthenticatorActive=", ", useTaxesTheme=", this.showAuthenticatorSection, this.isAuthenticatorActive), this.useTaxesTheme, ")");
    }
}
