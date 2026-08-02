package com.squareup.cash.earningstracker.backend.real;

import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsTrackerDataResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsWithExpiration {
    public final EarningsTrackerDataResponse data;
    public final long expirationDate;

    public EarningsWithExpiration(EarningsTrackerDataResponse earningsTrackerDataResponse, long j) {
        earningsTrackerDataResponse.getClass();
        this.data = earningsTrackerDataResponse;
        this.expirationDate = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsWithExpiration)) {
            return false;
        }
        EarningsWithExpiration earningsWithExpiration = (EarningsWithExpiration) obj;
        return Intrinsics.areEqual(this.data, earningsWithExpiration.data) && this.expirationDate == earningsWithExpiration.expirationDate;
    }

    public final int hashCode() {
        return Long.hashCode(this.expirationDate) + (this.data.hashCode() * 31);
    }

    public final String toString() {
        return "EarningsWithExpiration(data=" + this.data + ", expirationDate=" + this.expirationDate + ")";
    }
}
