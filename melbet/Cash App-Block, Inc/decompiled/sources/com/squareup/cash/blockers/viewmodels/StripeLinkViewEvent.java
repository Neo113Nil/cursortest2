package com.squareup.cash.blockers.viewmodels;

import com.squareup.cash.stripe.api.StripeLinkResult;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface StripeLinkViewEvent {

    public final class Dismiss implements StripeLinkViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1388578350;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class ReceivedResult implements StripeLinkViewEvent {
        public final StripeLinkResult result;

        public ReceivedResult(StripeLinkResult stripeLinkResult) {
            stripeLinkResult.getClass();
            this.result = stripeLinkResult;
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

    public final class WaitingForParams implements StripeLinkViewEvent {
        public static final WaitingForParams INSTANCE = new WaitingForParams();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof WaitingForParams);
        }

        public final int hashCode() {
            return 528403646;
        }

        public final String toString() {
            return "WaitingForParams";
        }
    }
}
