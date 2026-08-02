package com.squareup.cash.benefits.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public interface PdsaBenefitsExplainerViewEvent {

    public final class Close implements PdsaBenefitsExplainerViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 2097303032;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class PrimaryButtonClicked implements PdsaBenefitsExplainerViewEvent {
        public static final PrimaryButtonClicked INSTANCE = new PrimaryButtonClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PrimaryButtonClicked);
        }

        public final int hashCode() {
            return 111929779;
        }

        public final String toString() {
            return "PrimaryButtonClicked";
        }
    }
}
