package com.squareup.cash.bitcoin.viewmodels.applet.balance;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;

/* loaded from: classes5.dex */
public final class BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay implements BitcoinHomeViewEvent {
    public static final BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay INSTANCE = new BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinBalanceWidgetViewEvent$ToggleCurrencyDisplay);
    }

    public final int hashCode() {
        return -75570631;
    }

    public final String toString() {
        return "ToggleCurrencyDisplay";
    }
}
