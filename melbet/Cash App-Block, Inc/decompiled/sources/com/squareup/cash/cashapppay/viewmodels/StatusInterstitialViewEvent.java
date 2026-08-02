package com.squareup.cash.cashapppay.viewmodels;

/* loaded from: classes6.dex */
public interface StatusInterstitialViewEvent {

    public final class Dismiss implements StatusInterstitialViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1094992118;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class Finished implements StatusInterstitialViewEvent {
        public static final Finished INSTANCE = new Finished();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Finished);
        }

        public final int hashCode() {
            return -1370882170;
        }

        public final String toString() {
            return "Finished";
        }
    }
}
