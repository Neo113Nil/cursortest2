package com.squareup.cash.account.settings.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;

/* loaded from: classes5.dex */
public final class PaymentPadThemeOption {
    public final int selectedIcon;
    public final int unselectedIcon;

    public PaymentPadThemeOption(int i, int i2) {
        this.selectedIcon = i;
        this.unselectedIcon = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentPadThemeOption)) {
            return false;
        }
        PaymentPadThemeOption paymentPadThemeOption = (PaymentPadThemeOption) obj;
        return this.selectedIcon == paymentPadThemeOption.selectedIcon && this.unselectedIcon == paymentPadThemeOption.unselectedIcon;
    }

    public final int hashCode() {
        return Integer.hashCode(this.unselectedIcon) + (Integer.hashCode(this.selectedIcon) * 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.selectedIcon, this.unselectedIcon, "PaymentPadThemeOption(selectedIcon=", ", unselectedIcon=", ")");
    }
}
