package com.squareup.cash.pools.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public interface PoolCreateViewEvent {

    public final class Close implements PoolCreateViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1180544497;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class TermsOfService implements PoolCreateViewEvent {
        public static final TermsOfService INSTANCE = new TermsOfService();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof TermsOfService);
        }

        public final int hashCode() {
            return -1693640898;
        }

        public final String toString() {
            return "TermsOfService";
        }
    }
}
