package com.squareup.cash.bitcoin.applets.presenters.data;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public final class BitcoinRepositoryModel$Installed$ZeroBalance implements BitcoinRepositoryModel {
    public final String formattedBalance;

    public BitcoinRepositoryModel$Installed$ZeroBalance(String str) {
        this.formattedBalance = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinRepositoryModel$Installed$ZeroBalance) && this.formattedBalance.equals(((BitcoinRepositoryModel$Installed$ZeroBalance) obj).formattedBalance);
    }

    public final int hashCode() {
        return this.formattedBalance.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ZeroBalance(formattedBalance=", this.formattedBalance, ")");
    }
}
