package com.squareup.cash.common.viewmodels;

import java.time.LocalDate;

/* loaded from: classes6.dex */
public final class NextAvailableCashTag {
    public final LocalDate date;
    public final CashTagSymbol symbol;

    public NextAvailableCashTag(LocalDate localDate, CashTagSymbol cashTagSymbol) {
        this.date = localDate;
        this.symbol = cashTagSymbol;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NextAvailableCashTag)) {
            return false;
        }
        NextAvailableCashTag nextAvailableCashTag = (NextAvailableCashTag) obj;
        return this.date.equals(nextAvailableCashTag.date) && this.symbol == nextAvailableCashTag.symbol;
    }

    public final int hashCode() {
        return this.symbol.hashCode() + (this.date.hashCode() * 31);
    }

    public final String toString() {
        return "NextAvailableCashTag(date=" + this.date + ", symbol=" + this.symbol + ")";
    }
}
