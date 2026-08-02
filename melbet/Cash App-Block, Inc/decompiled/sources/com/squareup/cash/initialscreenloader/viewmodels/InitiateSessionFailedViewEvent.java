package com.squareup.cash.initialscreenloader.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public interface InitiateSessionFailedViewEvent {

    public final class Close implements InitiateSessionFailedViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 1959165031;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Retry implements InitiateSessionFailedViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return 1972814103;
        }

        public final String toString() {
            return "Retry";
        }
    }
}
