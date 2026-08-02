package com.squareup.cash.family.familyhub.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes6.dex */
public final class DependentControlsAndLimitsFooterViewModel {
    public final String footerText;
    public final boolean isAllowlistStyle;

    public DependentControlsAndLimitsFooterViewModel(String str, boolean z) {
        this.footerText = str;
        this.isAllowlistStyle = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DependentControlsAndLimitsFooterViewModel)) {
            return false;
        }
        DependentControlsAndLimitsFooterViewModel dependentControlsAndLimitsFooterViewModel = (DependentControlsAndLimitsFooterViewModel) obj;
        return this.footerText.equals(dependentControlsAndLimitsFooterViewModel.footerText) && this.isAllowlistStyle == dependentControlsAndLimitsFooterViewModel.isAllowlistStyle;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isAllowlistStyle) + (this.footerText.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("DependentControlsAndLimitsFooterViewModel(footerText=", this.footerText, ", isAllowlistStyle=", ")", this.isAllowlistStyle);
    }
}
