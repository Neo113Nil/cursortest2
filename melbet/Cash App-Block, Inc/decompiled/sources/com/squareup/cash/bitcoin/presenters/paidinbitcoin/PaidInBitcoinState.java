package com.squareup.cash.bitcoin.presenters.paidinbitcoin;

import com.squareup.protos.cash.postcard.CashAppCard;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class PaidInBitcoinState {
    public final Integer allocationBps;
    public final CashAppCard.PhysicalCardOrderState cardState;
    public final boolean hasDirectDepositAccount;
    public final boolean paidInBitcoinEnabled;
    public final int selectedPercentage;

    public PaidInBitcoinState(boolean z, Integer num, CashAppCard.PhysicalCardOrderState physicalCardOrderState, boolean z2) {
        physicalCardOrderState.getClass();
        this.paidInBitcoinEnabled = z;
        this.allocationBps = num;
        this.cardState = physicalCardOrderState;
        this.hasDirectDepositAccount = z2;
        this.selectedPercentage = (num != null ? num.intValue() : 0) / 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidInBitcoinState)) {
            return false;
        }
        PaidInBitcoinState paidInBitcoinState = (PaidInBitcoinState) obj;
        return this.paidInBitcoinEnabled == paidInBitcoinState.paidInBitcoinEnabled && Intrinsics.areEqual(this.allocationBps, paidInBitcoinState.allocationBps) && this.cardState == paidInBitcoinState.cardState && this.hasDirectDepositAccount == paidInBitcoinState.hasDirectDepositAccount;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.paidInBitcoinEnabled) * 31;
        Integer num = this.allocationBps;
        return Boolean.hashCode(this.hasDirectDepositAccount) + ((this.cardState.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "PaidInBitcoinState(paidInBitcoinEnabled=" + this.paidInBitcoinEnabled + ", allocationBps=" + this.allocationBps + ", cardState=" + this.cardState + ", hasDirectDepositAccount=" + this.hasDirectDepositAccount + ")";
    }
}
