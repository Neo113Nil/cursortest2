package com.squareup.cash.blockers.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes4.dex */
public interface EarnerUpsellBlockerViewEvent {

    public final class Close implements EarnerUpsellBlockerViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 890225875;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class GetStarted implements EarnerUpsellBlockerViewEvent {
        public static final GetStarted INSTANCE = new GetStarted();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GetStarted);
        }

        public final int hashCode() {
            return -951867824;
        }

        public final String toString() {
            return "GetStarted";
        }
    }
}
