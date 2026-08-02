package com.squareup.cash.data.contacts;

import app.cash.api.ApiResult;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class ContactsSyncResponse {

    public final class WasRateLimited extends ContactsSyncResponse {
        public static final WasRateLimited INSTANCE = new WasRateLimited();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WasRateLimited);
        }

        public final int hashCode() {
            return -173349561;
        }

        public final String toString() {
            return "WasRateLimited";
        }
    }

    public final class Failure extends ContactsSyncResponse {
        public final ApiResult.Failure failure;
        public final boolean rateLimited;

        public /* synthetic */ Failure(ApiResult.Failure failure, int i) {
            this((i & 1) != 0 ? null : failure, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.failure, failure.failure) && this.rateLimited == failure.rateLimited;
        }

        public final boolean getRateLimited() {
            return this.rateLimited;
        }

        public final int hashCode() {
            ApiResult.Failure failure = this.failure;
            return Boolean.hashCode(this.rateLimited) + ((failure == null ? 0 : failure.hashCode()) * 31);
        }

        public final String toString() {
            return "Failure(failure=" + this.failure + ", rateLimited=" + this.rateLimited + ")";
        }

        public Failure(ApiResult.Failure failure, boolean z) {
            this.failure = failure;
            this.rateLimited = z;
        }
    }

    public final class Success extends ContactsSyncResponse {
        public final boolean nothingChanged;
        public final boolean rateLimited;

        public /* synthetic */ Success(boolean z, int i) {
            this((i & 1) == 0, (i & 2) != 0 ? false : z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.rateLimited == success.rateLimited && this.nothingChanged == success.nothingChanged;
        }

        public final boolean getNothingChanged() {
            return this.nothingChanged;
        }

        public final boolean getRateLimited() {
            return this.rateLimited;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.nothingChanged) + (Boolean.hashCode(this.rateLimited) * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Success(rateLimited=", ", nothingChanged=", ")", this.rateLimited, this.nothingChanged);
        }

        public Success(boolean z, boolean z2) {
            this.rateLimited = z;
            this.nothingChanged = z2;
        }
    }
}
