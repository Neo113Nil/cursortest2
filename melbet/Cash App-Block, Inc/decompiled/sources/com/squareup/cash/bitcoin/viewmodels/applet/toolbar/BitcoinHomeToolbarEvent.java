package com.squareup.cash.bitcoin.viewmodels.applet.toolbar;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;

/* loaded from: classes5.dex */
public interface BitcoinHomeToolbarEvent extends BitcoinHomeViewEvent {

    public final class BackClicked implements BitcoinHomeToolbarEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 393709604;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class BitcoinMapClicked implements BitcoinHomeToolbarEvent {
        public static final BitcoinMapClicked INSTANCE = new BitcoinMapClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BitcoinMapClicked);
        }

        public final int hashCode() {
            return -2123294003;
        }

        public final String toString() {
            return "BitcoinMapClicked";
        }
    }

    public final class BitcoinScannerClicked implements BitcoinHomeToolbarEvent {
        public static final BitcoinScannerClicked INSTANCE = new BitcoinScannerClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BitcoinScannerClicked);
        }

        public final int hashCode() {
            return 133664491;
        }

        public final String toString() {
            return "BitcoinScannerClicked";
        }
    }
}
