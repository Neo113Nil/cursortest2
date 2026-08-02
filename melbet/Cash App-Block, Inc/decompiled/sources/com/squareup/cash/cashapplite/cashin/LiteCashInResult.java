package com.squareup.cash.cashapplite.cashin;

import com.squareup.protos.franklin.common.ResponseContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LiteCashInResult {

    public final class Error implements LiteCashInResult {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Error(message=null)";
        }
    }

    public final class NeedsRedirect implements LiteCashInResult {
        public final ResponseContext responseContext;

        public NeedsRedirect(ResponseContext responseContext) {
            responseContext.getClass();
            this.responseContext = responseContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NeedsRedirect) && Intrinsics.areEqual(this.responseContext, ((NeedsRedirect) obj).responseContext);
        }

        public final int hashCode() {
            return this.responseContext.hashCode();
        }

        public final String toString() {
            return "NeedsRedirect(responseContext=" + this.responseContext + ")";
        }
    }

    public final class Success implements LiteCashInResult {
        public final CashInAccountInfo accountInfo;

        public Success(CashInAccountInfo cashInAccountInfo) {
            this.accountInfo = cashInAccountInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && this.accountInfo.equals(((Success) obj).accountInfo);
        }

        public final int hashCode() {
            return this.accountInfo.rows.hashCode();
        }

        public final String toString() {
            return "Success(accountInfo=" + this.accountInfo + ")";
        }
    }
}
