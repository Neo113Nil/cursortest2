package com.squareup.cash.card.onboarding;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public interface TagOrderConfirmationViewEvent {

    public final class Close implements TagOrderConfirmationViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 16663727;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Continue implements TagOrderConfirmationViewEvent {
        public static final Continue INSTANCE = new Continue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Continue);
        }

        public final int hashCode() {
            return 847918736;
        }

        public final String toString() {
            return "Continue";
        }
    }
}
