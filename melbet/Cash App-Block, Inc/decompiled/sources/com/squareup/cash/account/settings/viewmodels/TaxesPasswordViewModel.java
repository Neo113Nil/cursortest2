package com.squareup.cash.account.settings.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public final class TaxesPasswordViewModel {
    public final boolean enabled;

    public TaxesPasswordViewModel(boolean z) {
        this.enabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaxesPasswordViewModel) && this.enabled == ((TaxesPasswordViewModel) obj).enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    public final String toString() {
        return Fragment$5$$ExternalSyntheticOutline0.m("TaxesPasswordViewModel(enabled=", ")", this.enabled);
    }
}
