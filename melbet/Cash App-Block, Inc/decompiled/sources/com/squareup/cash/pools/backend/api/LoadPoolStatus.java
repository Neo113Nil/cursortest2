package com.squareup.cash.pools.backend.api;

import com.squareup.protos.cash.pools.GetMoneyPoolResponse;

/* loaded from: classes6.dex */
public interface LoadPoolStatus {

    public final class HttpFailure implements LoadPoolStatus {
        public static final HttpFailure INSTANCE = new HttpFailure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HttpFailure);
        }

        public final int hashCode() {
            return -31565313;
        }

        public final String toString() {
            return "HttpFailure";
        }
    }

    public final class NetworkFailure implements LoadPoolStatus {
        public static final NetworkFailure INSTANCE = new NetworkFailure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NetworkFailure);
        }

        public final int hashCode() {
            return 1025141823;
        }

        public final String toString() {
            return "NetworkFailure";
        }
    }

    /* loaded from: classes7.dex */
    public final class ResponseFailure implements LoadPoolStatus {
        public final GetMoneyPoolResponse.FailureReason error;

        public ResponseFailure(GetMoneyPoolResponse.FailureReason failureReason) {
            this.error = failureReason;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ResponseFailure) && this.error == ((ResponseFailure) obj).error;
        }

        public final int hashCode() {
            GetMoneyPoolResponse.FailureReason failureReason = this.error;
            if (failureReason == null) {
                return 0;
            }
            return failureReason.hashCode();
        }

        public final String toString() {
            return "ResponseFailure(error=" + this.error + ")";
        }
    }

    public final class Success implements LoadPoolStatus {
        public final PoolData data;

        public Success(PoolData poolData) {
            this.data = poolData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.data.equals(((Success) obj).data);
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.data + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class UnknownFailure implements LoadPoolStatus {
        public static final UnknownFailure INSTANCE = new UnknownFailure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UnknownFailure);
        }

        public final int hashCode() {
            return 1752613539;
        }

        public final String toString() {
            return "UnknownFailure";
        }
    }
}
