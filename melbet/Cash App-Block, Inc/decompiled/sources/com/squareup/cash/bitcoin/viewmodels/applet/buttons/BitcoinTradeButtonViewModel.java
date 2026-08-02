package com.squareup.cash.bitcoin.viewmodels.applet.buttons;

/* loaded from: classes5.dex */
public final class BitcoinTradeButtonViewModel {
    public final BitcoinTradeButtonDisplayType displayType;
    public final BitcoinTradeButtonsWidgetViewEvent event;

    public BitcoinTradeButtonViewModel(BitcoinTradeButtonDisplayType bitcoinTradeButtonDisplayType, BitcoinTradeButtonsWidgetViewEvent bitcoinTradeButtonsWidgetViewEvent) {
        this.displayType = bitcoinTradeButtonDisplayType;
        this.event = bitcoinTradeButtonsWidgetViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinTradeButtonViewModel)) {
            return false;
        }
        BitcoinTradeButtonViewModel bitcoinTradeButtonViewModel = (BitcoinTradeButtonViewModel) obj;
        return this.displayType.equals(bitcoinTradeButtonViewModel.displayType) && this.event.equals(bitcoinTradeButtonViewModel.event);
    }

    public final int hashCode() {
        return this.event.hashCode() + (this.displayType.hashCode() * 31);
    }

    public final String toString() {
        return "BitcoinTradeButtonViewModel(displayType=" + this.displayType + ", event=" + this.event + ")";
    }
}
