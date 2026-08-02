package com.squareup.cash.investing.viewmodels.dependent;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public interface DependentWelcomeViewEvent {

    public final class Close implements DependentWelcomeViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -479896255;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CtaClicked implements DependentWelcomeViewEvent {
        public static final CtaClicked INSTANCE = new CtaClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaClicked);
        }

        public final int hashCode() {
            return -1343759794;
        }

        public final String toString() {
            return "CtaClicked";
        }
    }
}
