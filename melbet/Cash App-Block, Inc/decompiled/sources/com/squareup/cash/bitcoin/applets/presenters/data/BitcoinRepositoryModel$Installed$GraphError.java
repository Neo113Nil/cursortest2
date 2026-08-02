package com.squareup.cash.bitcoin.applets.presenters.data;

import bo.app.re$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class BitcoinRepositoryModel$Installed$GraphError implements BitcoinRepositoryModel {
    public final long balanceAmountCents;
    public final String formattedBalance;

    public BitcoinRepositoryModel$Installed$GraphError(String str, long j) {
        this.formattedBalance = str;
        this.balanceAmountCents = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinRepositoryModel$Installed$GraphError)) {
            return false;
        }
        BitcoinRepositoryModel$Installed$GraphError bitcoinRepositoryModel$Installed$GraphError = (BitcoinRepositoryModel$Installed$GraphError) obj;
        return this.formattedBalance.equals(bitcoinRepositoryModel$Installed$GraphError.formattedBalance) && this.balanceAmountCents == bitcoinRepositoryModel$Installed$GraphError.balanceAmountCents;
    }

    public final int hashCode() {
        return Long.hashCode(this.balanceAmountCents) + (this.formattedBalance.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("GraphError(formattedBalance=", this.formattedBalance, ", balanceAmountCents=", this.balanceAmountCents);
        m.append(")");
        return m.toString();
    }
}
