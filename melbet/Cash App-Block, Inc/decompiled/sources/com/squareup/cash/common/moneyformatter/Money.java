package com.squareup.cash.common.moneyformatter;

import com.squareup.cash.common.moneyformatter.currency.Currency;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Money {
    public final Amount centsAmount;
    public final Currency currency;

    public Money(long j, Currency currency) {
        currency.getClass();
        BigDecimal valueOf = BigDecimal.valueOf(j);
        valueOf.getClass();
        this.centsAmount = new Amount(valueOf);
        this.currency = currency;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Money)) {
            return false;
        }
        Money money = (Money) obj;
        return Intrinsics.areEqual(this.centsAmount, money.centsAmount) && this.currency == money.currency;
    }

    public final int hashCode() {
        return this.currency.hashCode() + (this.centsAmount.value.hashCode() * 31);
    }

    public final String toString() {
        return "Money(centsAmount=" + this.centsAmount + ", currency=" + this.currency + ")";
    }
}
