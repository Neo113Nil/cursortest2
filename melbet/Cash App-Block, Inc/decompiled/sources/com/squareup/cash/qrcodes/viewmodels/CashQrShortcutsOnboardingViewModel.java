package com.squareup.cash.qrcodes.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes7.dex */
public final class CashQrShortcutsOnboardingViewModel {
    public final boolean tileSupported;
    public final boolean widgetSupported;

    public CashQrShortcutsOnboardingViewModel(boolean z, boolean z2) {
        this.widgetSupported = z;
        this.tileSupported = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashQrShortcutsOnboardingViewModel)) {
            return false;
        }
        CashQrShortcutsOnboardingViewModel cashQrShortcutsOnboardingViewModel = (CashQrShortcutsOnboardingViewModel) obj;
        return this.widgetSupported == cashQrShortcutsOnboardingViewModel.widgetSupported && this.tileSupported == cashQrShortcutsOnboardingViewModel.tileSupported;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.tileSupported) + (Boolean.hashCode(this.widgetSupported) * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("CashQrShortcutsOnboardingViewModel(widgetSupported=", ", tileSupported=", ")", this.widgetSupported, this.tileSupported);
    }
}
