package com.squareup.cash.instruments.screens;

import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentSelectionResult {
    public final Money acceptedFeeAmount;
    public final String token;

    public InstrumentSelectionResult(Money money, String str) {
        money.getClass();
        this.token = str;
        this.acceptedFeeAmount = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentSelectionResult)) {
            return false;
        }
        InstrumentSelectionResult instrumentSelectionResult = (InstrumentSelectionResult) obj;
        return Intrinsics.areEqual(this.token, instrumentSelectionResult.token) && Intrinsics.areEqual(this.acceptedFeeAmount, instrumentSelectionResult.acceptedFeeAmount);
    }

    public final int hashCode() {
        String str = this.token;
        return this.acceptedFeeAmount.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "InstrumentSelectionResult(token=" + this.token + ", acceptedFeeAmount=" + this.acceptedFeeAmount + ")";
    }
}
