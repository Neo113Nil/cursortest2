package com.squareup.cash.nfc.viewmodels;

/* loaded from: classes6.dex */
public interface NfcNotAvailableViewEvent {

    public final class Dismiss implements NfcNotAvailableViewEvent {
        public static final Dismiss INSTANCE = new Dismiss();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return 1812683866;
        }

        public final String toString() {
            return "Dismiss";
        }
    }

    public final class GoToNfcSettings implements NfcNotAvailableViewEvent {
        public static final GoToNfcSettings INSTANCE = new GoToNfcSettings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoToNfcSettings);
        }

        public final int hashCode() {
            return 1753576251;
        }

        public final String toString() {
            return "GoToNfcSettings";
        }
    }
}
