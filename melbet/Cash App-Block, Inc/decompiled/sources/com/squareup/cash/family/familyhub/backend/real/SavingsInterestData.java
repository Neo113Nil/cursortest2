package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.piggybank.api.v2.InterestYieldStatus;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SavingsInterestData {
    public final LocalizedString enhancedRate;
    public final InterestYieldStatus status;

    public SavingsInterestData(InterestYieldStatus interestYieldStatus, LocalizedString localizedString) {
        this.status = interestYieldStatus;
        this.enhancedRate = localizedString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsInterestData)) {
            return false;
        }
        SavingsInterestData savingsInterestData = (SavingsInterestData) obj;
        return this.status == savingsInterestData.status && Intrinsics.areEqual(this.enhancedRate, savingsInterestData.enhancedRate);
    }

    public final int hashCode() {
        InterestYieldStatus interestYieldStatus = this.status;
        int hashCode = (interestYieldStatus == null ? 0 : interestYieldStatus.hashCode()) * 31;
        LocalizedString localizedString = this.enhancedRate;
        return hashCode + (localizedString != null ? localizedString.hashCode() : 0);
    }

    public final String toString() {
        return "SavingsInterestData(status=" + this.status + ", enhancedRate=" + this.enhancedRate + ")";
    }
}
