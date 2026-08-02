package com.squareup.cash.earnings.backend.api;

import app.cash.api.ApiResult;

/* loaded from: classes6.dex */
public interface EarnerModeResult {

    public final class Failure implements EarnerModeResult {
        public final ApiResult.Failure error;

        public Failure(ApiResult.Failure failure) {
            this.error = failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.error.equals(((Failure) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return "Failure(error=" + this.error + ")";
        }
    }

    public final class Success implements EarnerModeResult {
        public static final Success INSTANCE = new Success();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Success);
        }

        public final int hashCode() {
            return 578315899;
        }

        public final String toString() {
            return "Success";
        }
    }
}
