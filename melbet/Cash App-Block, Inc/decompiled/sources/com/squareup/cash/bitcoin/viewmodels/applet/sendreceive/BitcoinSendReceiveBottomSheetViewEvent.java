package com.squareup.cash.bitcoin.viewmodels.applet.sendreceive;

/* loaded from: classes5.dex */
public interface BitcoinSendReceiveBottomSheetViewEvent {

    public final class CloseClicked implements BitcoinSendReceiveBottomSheetViewEvent {
        public static final CloseClicked INSTANCE = new CloseClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseClicked);
        }

        public final int hashCode() {
            return 1489634965;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    public final class ReceiveClicked implements BitcoinSendReceiveBottomSheetViewEvent {
        public static final ReceiveClicked INSTANCE = new ReceiveClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ReceiveClicked);
        }

        public final int hashCode() {
            return 1017665994;
        }

        public final String toString() {
            return "ReceiveClicked";
        }
    }

    public final class SendClicked implements BitcoinSendReceiveBottomSheetViewEvent {
        public static final SendClicked INSTANCE = new SendClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SendClicked);
        }

        public final int hashCode() {
            return -1833114823;
        }

        public final String toString() {
            return "SendClicked";
        }
    }
}
