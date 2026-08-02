package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.plaid.api.PlaidLinkResult;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface PlaidLinkViewEvent {

    public final class Dismiss implements PlaidLinkViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1174989907;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class ReceivedResult implements PlaidLinkViewEvent {
        public final PlaidLinkResult result;

        public ReceivedResult(PlaidLinkResult plaidLinkResult) {
            plaidLinkResult.getClass();
            this.result = plaidLinkResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReceivedResult) && Intrinsics.areEqual(this.result, ((ReceivedResult) obj).result);
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "ReceivedResult(result=" + this.result + ")";
        }
    }

    public final class WaitingForParams implements PlaidLinkViewEvent {
        public static final WaitingForParams INSTANCE = new WaitingForParams();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WaitingForParams);
        }

        public final int hashCode() {
            return -486932423;
        }

        public final String toString() {
            return "WaitingForParams";
        }
    }
}
