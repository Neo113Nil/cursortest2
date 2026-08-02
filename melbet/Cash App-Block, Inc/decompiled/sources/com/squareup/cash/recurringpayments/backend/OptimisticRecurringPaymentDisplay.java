package com.squareup.cash.recurringpayments.backend;

import com.squareup.protos.common.Money;

/* loaded from: classes7.dex */
public final class OptimisticRecurringPaymentDisplay {
    public final Money amount;
    public final String scheduleDescription;

    public OptimisticRecurringPaymentDisplay(Money money, String str) {
        this.amount = money;
        this.scheduleDescription = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptimisticRecurringPaymentDisplay)) {
            return false;
        }
        OptimisticRecurringPaymentDisplay optimisticRecurringPaymentDisplay = (OptimisticRecurringPaymentDisplay) obj;
        return this.amount.equals(optimisticRecurringPaymentDisplay.amount) && this.scheduleDescription.equals(optimisticRecurringPaymentDisplay.scheduleDescription);
    }

    public final int hashCode() {
        return this.scheduleDescription.hashCode() + (this.amount.hashCode() * 31);
    }

    public final String toString() {
        return "OptimisticRecurringPaymentDisplay(amount=" + this.amount + ", scheduleDescription=" + this.scheduleDescription + ")";
    }
}
