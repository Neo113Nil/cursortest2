package com.squareup.cash.bitcoin.viewmodels.applet.buttons;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;

/* loaded from: classes5.dex */
public interface BitcoinTradeButtonsWidgetViewEvent extends BitcoinHomeViewEvent {

    public final class Buy implements BitcoinTradeButtonsWidgetViewEvent {
        public static final Buy INSTANCE = new Buy();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Buy);
        }

        public final int hashCode() {
            return 58749298;
        }

        public final String toString() {
            return "Buy";
        }
    }

    public final class Convert implements BitcoinTradeButtonsWidgetViewEvent {
        public static final Convert INSTANCE = new Convert();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Convert);
        }

        public final int hashCode() {
            return -1402226017;
        }

        public final String toString() {
            return "Convert";
        }
    }

    public final class Sell implements BitcoinTradeButtonsWidgetViewEvent {
        public static final Sell INSTANCE = new Sell();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Sell);
        }

        public final int hashCode() {
            return 1821719014;
        }

        public final String toString() {
            return "Sell";
        }
    }

    public final class Transfer implements BitcoinTradeButtonsWidgetViewEvent {
        public static final Transfer INSTANCE = new Transfer();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Transfer);
        }

        public final int hashCode() {
            return 1327020159;
        }

        public final String toString() {
            return "Transfer";
        }
    }
}
