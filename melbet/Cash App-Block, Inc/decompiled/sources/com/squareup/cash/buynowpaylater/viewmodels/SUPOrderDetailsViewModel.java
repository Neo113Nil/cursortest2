package com.squareup.cash.buynowpaylater.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SUPOrderDetailsViewModel {
    public final SUPCardInfo cardInfo;
    public final String message;
    public final SUPOrderTransactions transactions;

    public SUPOrderDetailsViewModel(SUPCardInfo sUPCardInfo, String str, SUPOrderTransactions sUPOrderTransactions) {
        this.cardInfo = sUPCardInfo;
        this.message = str;
        this.transactions = sUPOrderTransactions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SUPOrderDetailsViewModel)) {
            return false;
        }
        SUPOrderDetailsViewModel sUPOrderDetailsViewModel = (SUPOrderDetailsViewModel) obj;
        return Intrinsics.areEqual(this.cardInfo, sUPOrderDetailsViewModel.cardInfo) && Intrinsics.areEqual(this.message, sUPOrderDetailsViewModel.message) && Intrinsics.areEqual(this.transactions, sUPOrderDetailsViewModel.transactions);
    }

    public final int hashCode() {
        SUPCardInfo sUPCardInfo = this.cardInfo;
        int hashCode = (sUPCardInfo == null ? 0 : sUPCardInfo.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SUPOrderTransactions sUPOrderTransactions = this.transactions;
        return hashCode2 + (sUPOrderTransactions != null ? sUPOrderTransactions.hashCode() : 0);
    }

    public final String toString() {
        return "SUPOrderDetailsViewModel(cardInfo=" + this.cardInfo + ", message=" + this.message + ", transactions=" + this.transactions + ")";
    }
}
