package com.squareup.cash.crypto.backend.roundups;

import com.squareup.protos.common.Money;

/* loaded from: classes5.dex */
public final class BitcoinRoundUpsUsageStats {
    public final Money amount;
    public final int numberOfExecutions;

    public BitcoinRoundUpsUsageStats(int i, Money money) {
        this.numberOfExecutions = i;
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinRoundUpsUsageStats)) {
            return false;
        }
        BitcoinRoundUpsUsageStats bitcoinRoundUpsUsageStats = (BitcoinRoundUpsUsageStats) obj;
        return this.numberOfExecutions == bitcoinRoundUpsUsageStats.numberOfExecutions && this.amount.equals(bitcoinRoundUpsUsageStats.amount);
    }

    public final int hashCode() {
        return this.amount.hashCode() + (Integer.hashCode(this.numberOfExecutions) * 31);
    }

    public final String toString() {
        return "BitcoinRoundUpsUsageStats(numberOfExecutions=" + this.numberOfExecutions + ", amount=" + this.amount + ")";
    }
}
