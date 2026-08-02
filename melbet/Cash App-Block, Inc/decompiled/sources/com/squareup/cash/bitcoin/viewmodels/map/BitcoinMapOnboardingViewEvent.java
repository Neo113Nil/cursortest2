package com.squareup.cash.bitcoin.viewmodels.map;

/* loaded from: classes5.dex */
public interface BitcoinMapOnboardingViewEvent {

    public final class Continue implements BitcoinMapOnboardingViewEvent {
        public static final Continue INSTANCE = new Continue();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Continue);
        }

        public final int hashCode() {
            return -1523751800;
        }

        public final String toString() {
            return "Continue";
        }
    }

    public final class GoBack implements BitcoinMapOnboardingViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 1085902352;
        }

        public final String toString() {
            return "GoBack";
        }
    }
}
