package com.squareup.cash.benefits.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public interface GreenEligibleTransactionsViewEvent {

    public final class Back implements GreenEligibleTransactionsViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -1290184784;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class LearnMore implements GreenEligibleTransactionsViewEvent {
        public static final LearnMore INSTANCE = new LearnMore();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LearnMore);
        }

        public final int hashCode() {
            return 151207568;
        }

        public final String toString() {
            return "LearnMore";
        }
    }
}
