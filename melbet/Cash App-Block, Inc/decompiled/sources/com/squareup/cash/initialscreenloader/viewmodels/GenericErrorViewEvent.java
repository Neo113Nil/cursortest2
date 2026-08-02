package com.squareup.cash.initialscreenloader.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public interface GenericErrorViewEvent {

    public final class Close implements GenericErrorViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -884943316;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class SignOut implements GenericErrorViewEvent {
        public static final SignOut INSTANCE = new SignOut();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SignOut);
        }

        public final int hashCode() {
            return 1194712965;
        }

        public final String toString() {
            return "SignOut";
        }
    }
}
