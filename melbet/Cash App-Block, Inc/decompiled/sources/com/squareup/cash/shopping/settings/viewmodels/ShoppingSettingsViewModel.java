package com.squareup.cash.shopping.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class ShoppingSettingsViewModel {
    public final boolean autofillEnabled;

    public ShoppingSettingsViewModel(boolean z) {
        this.autofillEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShoppingSettingsViewModel) && this.autofillEnabled == ((ShoppingSettingsViewModel) obj).autofillEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.autofillEnabled);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("ShoppingSettingsViewModel(autofillEnabled=", ")", this.autofillEnabled);
    }
}
