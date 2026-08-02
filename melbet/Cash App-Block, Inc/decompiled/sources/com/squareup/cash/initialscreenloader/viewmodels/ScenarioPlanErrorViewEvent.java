package com.squareup.cash.initialscreenloader.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public interface ScenarioPlanErrorViewEvent {

    public final class Close implements ScenarioPlanErrorViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -1075971470;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Retry implements ScenarioPlanErrorViewEvent {
        public static final Retry INSTANCE = new Retry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Retry);
        }

        public final int hashCode() {
            return -1062322398;
        }

        public final String toString() {
            return "Retry";
        }
    }
}
