package com.squareup.cash.paymentpad.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class HypeConfig {
    public final String amountSubLabel;
    public final boolean showBratAmount;

    public HypeConfig(boolean z, String str) {
        this.showBratAmount = z;
        this.amountSubLabel = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HypeConfig)) {
            return false;
        }
        HypeConfig hypeConfig = (HypeConfig) obj;
        return this.showBratAmount == hypeConfig.showBratAmount && Intrinsics.areEqual(this.amountSubLabel, hypeConfig.amountSubLabel);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.showBratAmount) * 31;
        String str = this.amountSubLabel;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HypeConfig(showBratAmount=" + this.showBratAmount + ", amountSubLabel=" + this.amountSubLabel + ")";
    }
}
