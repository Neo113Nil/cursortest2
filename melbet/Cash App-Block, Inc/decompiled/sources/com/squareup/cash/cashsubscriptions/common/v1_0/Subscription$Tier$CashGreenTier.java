package com.squareup.cash.cashsubscriptions.common.v1_0;

/* loaded from: classes8.dex */
public final class Subscription$Tier$CashGreenTier {
    public final CashGreenTierType value;

    public Subscription$Tier$CashGreenTier(CashGreenTierType cashGreenTierType) {
        cashGreenTierType.getClass();
        this.value = cashGreenTierType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Subscription$Tier$CashGreenTier) && this.value == ((Subscription$Tier$CashGreenTier) obj).value;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "CashGreenTier(value=" + this.value + ")";
    }
}
