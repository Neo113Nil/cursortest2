package com.squareup.cash.earningstracker.backend.api;

import com.squareup.protos.cash.cashbusinessaccounts.api.v1.EarningsTrackerDataResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class EarningsTrackerDataResult {

    public final class Failure extends EarningsTrackerDataResult {
        public static final Failure INSTANCE = new Failure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failure);
        }

        public final int hashCode() {
            return 909657683;
        }

        public final String toString() {
            return "Failure";
        }
    }

    public final class Loading extends EarningsTrackerDataResult {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1962084859;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Success extends EarningsTrackerDataResult {
        public final EarningsTrackerDataResponse earnings;
        public final boolean refreshFailed;

        public Success(EarningsTrackerDataResponse earningsTrackerDataResponse, boolean z) {
            earningsTrackerDataResponse.getClass();
            this.earnings = earningsTrackerDataResponse;
            this.refreshFailed = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.areEqual(this.earnings, success.earnings) && this.refreshFailed == success.refreshFailed;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.refreshFailed) + (this.earnings.hashCode() * 31);
        }

        public final String toString() {
            return "Success(earnings=" + this.earnings + ", refreshFailed=" + this.refreshFailed + ")";
        }
    }
}
