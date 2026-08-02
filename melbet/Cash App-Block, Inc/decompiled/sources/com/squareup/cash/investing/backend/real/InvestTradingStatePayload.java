package com.squareup.cash.investing.backend.real;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InvestTradingStatePayload {
    public final boolean hasActiveBrokerageAccount;
    public final Instant transferCompletionTime;

    public InvestTradingStatePayload(boolean z, Instant instant) {
        this.hasActiveBrokerageAccount = z;
        this.transferCompletionTime = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestTradingStatePayload)) {
            return false;
        }
        InvestTradingStatePayload investTradingStatePayload = (InvestTradingStatePayload) obj;
        return this.hasActiveBrokerageAccount == investTradingStatePayload.hasActiveBrokerageAccount && Intrinsics.areEqual(this.transferCompletionTime, investTradingStatePayload.transferCompletionTime);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.hasActiveBrokerageAccount) * 31;
        Instant instant = this.transferCompletionTime;
        return hashCode + (instant == null ? 0 : instant.hashCode());
    }

    public final String toString() {
        return "InvestTradingStatePayload(hasActiveBrokerageAccount=" + this.hasActiveBrokerageAccount + ", transferCompletionTime=" + this.transferCompletionTime + ")";
    }
}
