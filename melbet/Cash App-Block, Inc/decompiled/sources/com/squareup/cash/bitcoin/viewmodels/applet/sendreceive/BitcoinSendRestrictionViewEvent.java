package com.squareup.cash.bitcoin.viewmodels.applet.sendreceive;

/* loaded from: classes5.dex */
public interface BitcoinSendRestrictionViewEvent {

    public final class CloseClicked implements BitcoinSendRestrictionViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return -1956422824;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class DoneClicked implements BitcoinSendRestrictionViewEvent {
        public static final DoneClicked INSTANCE = new DoneClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DoneClicked);
        }

        public final int hashCode() {
            return -1536325412;
        }

        public final String toString() {
            return "DoneClicked";
        }
    }

    public final class LearnMoreClicked implements BitcoinSendRestrictionViewEvent {
        public static final LearnMoreClicked INSTANCE = new LearnMoreClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LearnMoreClicked);
        }

        public final int hashCode() {
            return 456451575;
        }

        public final String toString() {
            return "LearnMoreClicked";
        }
    }
}
