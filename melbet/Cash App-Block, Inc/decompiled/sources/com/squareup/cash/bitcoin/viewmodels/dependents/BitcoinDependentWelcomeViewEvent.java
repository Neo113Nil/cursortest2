package com.squareup.cash.bitcoin.viewmodels.dependents;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes5.dex */
public interface BitcoinDependentWelcomeViewEvent {

    public final class Close implements BitcoinDependentWelcomeViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -603697637;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class CtaTapped implements BitcoinDependentWelcomeViewEvent {
        public static final CtaTapped INSTANCE = new CtaTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CtaTapped);
        }

        public final int hashCode() {
            return -1406012577;
        }

        public final String toString() {
            return "CtaTapped";
        }
    }
}
