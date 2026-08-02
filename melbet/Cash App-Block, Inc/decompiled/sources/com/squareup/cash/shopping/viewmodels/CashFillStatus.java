package com.squareup.cash.shopping.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class CashFillStatus {
    public final boolean cashFillEnabled;
    public final String cashFillVersion;

    public CashFillStatus(boolean z, String str) {
        str.getClass();
        this.cashFillEnabled = z;
        this.cashFillVersion = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashFillStatus)) {
            return false;
        }
        CashFillStatus cashFillStatus = (CashFillStatus) obj;
        return this.cashFillEnabled == cashFillStatus.cashFillEnabled && Intrinsics.areEqual(this.cashFillVersion, cashFillStatus.cashFillVersion);
    }

    public final int hashCode() {
        return this.cashFillVersion.hashCode() + (Boolean.hashCode(this.cashFillEnabled) * 31);
    }

    public final String toString() {
        return "CashFillStatus(cashFillEnabled=" + this.cashFillEnabled + ", cashFillVersion=" + this.cashFillVersion + ")";
    }
}
