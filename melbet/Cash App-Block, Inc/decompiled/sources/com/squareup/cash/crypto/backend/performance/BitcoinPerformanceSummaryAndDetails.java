package com.squareup.cash.crypto.backend.performance;

import com.squareup.protos.common.Money;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BitcoinPerformanceSummaryAndDetails {
    public final BitcoinPerformanceDetails details;
    public final BitcoinPerformanceSummary summary;
    public final Money userBitcoinBalanceValue;

    public BitcoinPerformanceSummaryAndDetails(BitcoinPerformanceSummary bitcoinPerformanceSummary, BitcoinPerformanceDetails bitcoinPerformanceDetails, Money money) {
        bitcoinPerformanceSummary.getClass();
        money.getClass();
        this.summary = bitcoinPerformanceSummary;
        this.details = bitcoinPerformanceDetails;
        this.userBitcoinBalanceValue = money;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinPerformanceSummaryAndDetails)) {
            return false;
        }
        BitcoinPerformanceSummaryAndDetails bitcoinPerformanceSummaryAndDetails = (BitcoinPerformanceSummaryAndDetails) obj;
        return Intrinsics.areEqual(this.summary, bitcoinPerformanceSummaryAndDetails.summary) && this.details.equals(bitcoinPerformanceSummaryAndDetails.details) && Intrinsics.areEqual(this.userBitcoinBalanceValue, bitcoinPerformanceSummaryAndDetails.userBitcoinBalanceValue);
    }

    public final int hashCode() {
        return this.userBitcoinBalanceValue.hashCode() + ((this.details.hashCode() + (this.summary.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BitcoinPerformanceSummaryAndDetails(summary=" + this.summary + ", details=" + this.details + ", userBitcoinBalanceValue=" + this.userBitcoinBalanceValue + ")";
    }
}
