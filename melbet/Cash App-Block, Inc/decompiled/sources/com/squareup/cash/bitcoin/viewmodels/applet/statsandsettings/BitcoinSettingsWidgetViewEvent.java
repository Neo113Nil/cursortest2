package com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;

/* loaded from: classes5.dex */
public interface BitcoinSettingsWidgetViewEvent extends BitcoinHomeViewEvent {

    public final class DisplayCurrencyClicked implements BitcoinSettingsWidgetViewEvent {
        public static final DisplayCurrencyClicked INSTANCE = new DisplayCurrencyClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DisplayCurrencyClicked);
        }

        public final int hashCode() {
            return 1953274934;
        }

        public final String toString() {
            return "DisplayCurrencyClicked";
        }
    }

    public final class LimitsClicked implements BitcoinSettingsWidgetViewEvent {
        public static final LimitsClicked INSTANCE = new LimitsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LimitsClicked);
        }

        public final int hashCode() {
            return 1938903085;
        }

        public final String toString() {
            return "LimitsClicked";
        }
    }

    public final class PriceAlertsClicked implements BitcoinSettingsWidgetViewEvent {
        public static final PriceAlertsClicked INSTANCE = new PriceAlertsClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PriceAlertsClicked);
        }

        public final int hashCode() {
            return 1227788873;
        }

        public final String toString() {
            return "PriceAlertsClicked";
        }
    }
}
