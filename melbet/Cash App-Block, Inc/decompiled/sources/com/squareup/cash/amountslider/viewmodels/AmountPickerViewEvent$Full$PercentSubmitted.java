package com.squareup.cash.amountslider.viewmodels;

import java.math.BigDecimal;

/* loaded from: classes5.dex */
public final class AmountPickerViewEvent$Full$PercentSubmitted extends AmountPickerViewEvent {
    public final BigDecimal amount;

    public AmountPickerViewEvent$Full$PercentSubmitted(BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmountPickerViewEvent$Full$PercentSubmitted) && this.amount.equals(((AmountPickerViewEvent$Full$PercentSubmitted) obj).amount);
    }

    public final int hashCode() {
        return this.amount.hashCode();
    }

    public final String toString() {
        return "PercentSubmitted(amount=" + this.amount + ")";
    }
}
