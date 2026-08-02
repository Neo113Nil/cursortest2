package com.squareup.cash.pools.backend.api;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public interface RemovePoolParticipantFailureReason {

    public final class HttpFailure implements RemovePoolParticipantFailureReason {
        public static final HttpFailure INSTANCE = new HttpFailure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HttpFailure);
        }

        public final int hashCode() {
            return -634314714;
        }

        public final String toString() {
            return "HttpFailure";
        }
    }

    public final class NetworkFailure implements RemovePoolParticipantFailureReason {
        public static final NetworkFailure INSTANCE = new NetworkFailure();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NetworkFailure);
        }

        public final int hashCode() {
            return 1776001208;
        }

        public final String toString() {
            return "NetworkFailure";
        }
    }

    public final class SuccessfulRequestFailureReason implements RemovePoolParticipantFailureReason {
        public final ArrayList errors;

        public SuccessfulRequestFailureReason(ArrayList arrayList) {
            this.errors = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SuccessfulRequestFailureReason) && this.errors.equals(((SuccessfulRequestFailureReason) obj).errors);
        }

        public final int hashCode() {
            return this.errors.hashCode();
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("SuccessfulRequestFailureReason(errors=", ")", this.errors);
        }
    }
}
