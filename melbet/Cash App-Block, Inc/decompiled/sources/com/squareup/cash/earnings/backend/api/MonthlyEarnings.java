package com.squareup.cash.earnings.backend.api;

import com.squareup.protos.common.Money;
import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MonthlyEarnings {
    public final YearMonth period;
    public final Money total;

    public MonthlyEarnings(YearMonth yearMonth, Money money) {
        yearMonth.getClass();
        this.period = yearMonth;
        this.total = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonthlyEarnings)) {
            return false;
        }
        MonthlyEarnings monthlyEarnings = (MonthlyEarnings) obj;
        return Intrinsics.areEqual(this.period, monthlyEarnings.period) && this.total.equals(monthlyEarnings.total);
    }

    public final int hashCode() {
        return this.total.hashCode() + (this.period.hashCode() * 31);
    }

    public final String toString() {
        return "MonthlyEarnings(period=" + this.period + ", total=" + this.total + ")";
    }
}
