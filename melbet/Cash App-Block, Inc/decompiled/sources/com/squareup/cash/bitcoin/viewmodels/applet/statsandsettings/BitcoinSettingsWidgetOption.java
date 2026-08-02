package com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BitcoinSettingsWidgetOption {

    public final class DisplayCurrency implements BitcoinSettingsWidgetOption {
        public final String primaryText;
        public final String secondaryText;

        public DisplayCurrency(String str, String str2) {
            str.getClass();
            this.primaryText = str;
            this.secondaryText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisplayCurrency)) {
                return false;
            }
            DisplayCurrency displayCurrency = (DisplayCurrency) obj;
            return Intrinsics.areEqual(this.primaryText, displayCurrency.primaryText) && Intrinsics.areEqual(this.secondaryText, displayCurrency.secondaryText);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final BitcoinSettingsWidgetViewEvent getEvent() {
            return BitcoinSettingsWidgetViewEvent.DisplayCurrencyClicked.INSTANCE;
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final String getPrimaryText() {
            return this.primaryText;
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final int hashCode() {
            int hashCode = this.primaryText.hashCode() * 31;
            String str = this.secondaryText;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("DisplayCurrency(primaryText=", this.primaryText, ", secondaryText=", this.secondaryText, ")");
        }
    }

    public final class Limits implements BitcoinSettingsWidgetOption {
        public final String primaryText;

        public Limits(String str) {
            str.getClass();
            this.primaryText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Limits) && Intrinsics.areEqual(this.primaryText, ((Limits) obj).primaryText);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final BitcoinSettingsWidgetViewEvent getEvent() {
            return BitcoinSettingsWidgetViewEvent.LimitsClicked.INSTANCE;
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final String getPrimaryText() {
            return this.primaryText;
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final String getSecondaryText() {
            return null;
        }

        public final int hashCode() {
            return this.primaryText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Limits(primaryText=", this.primaryText, ")");
        }
    }

    public final class PriceAlerts implements BitcoinSettingsWidgetOption {
        public final String primaryText;

        public PriceAlerts(String str) {
            str.getClass();
            this.primaryText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PriceAlerts) && Intrinsics.areEqual(this.primaryText, ((PriceAlerts) obj).primaryText);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final BitcoinSettingsWidgetViewEvent getEvent() {
            return BitcoinSettingsWidgetViewEvent.PriceAlertsClicked.INSTANCE;
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final String getPrimaryText() {
            return this.primaryText;
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final String getSecondaryText() {
            return null;
        }

        public final int hashCode() {
            return this.primaryText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PriceAlerts(primaryText=", this.primaryText, ")");
        }
    }

    public final class PricePerBitcoin implements BitcoinSettingsWidgetOption {
        public final String primaryText;
        public final String secondaryText;

        public PricePerBitcoin(String str, String str2) {
            str.getClass();
            this.primaryText = str;
            this.secondaryText = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PricePerBitcoin)) {
                return false;
            }
            PricePerBitcoin pricePerBitcoin = (PricePerBitcoin) obj;
            return Intrinsics.areEqual(this.primaryText, pricePerBitcoin.primaryText) && Intrinsics.areEqual(this.secondaryText, pricePerBitcoin.secondaryText);
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final BitcoinSettingsWidgetViewEvent getEvent() {
            return null;
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final String getPrimaryText() {
            return this.primaryText;
        }

        @Override // com.squareup.cash.bitcoin.viewmodels.applet.statsandsettings.BitcoinSettingsWidgetOption
        public final String getSecondaryText() {
            return this.secondaryText;
        }

        public final int hashCode() {
            int hashCode = this.primaryText.hashCode() * 31;
            String str = this.secondaryText;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("PricePerBitcoin(primaryText=", this.primaryText, ", secondaryText=", this.secondaryText, ")");
        }
    }

    BitcoinSettingsWidgetViewEvent getEvent();

    String getPrimaryText();

    String getSecondaryText();
}
