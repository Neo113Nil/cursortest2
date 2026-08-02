package com.squareup.cash.bitcoin.viewmodels.applet.map;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;

/* loaded from: classes5.dex */
public final class BitcoinMapCardWidgetViewEvent$OnCardClicked implements BitcoinHomeViewEvent {
    public static final BitcoinMapCardWidgetViewEvent$OnCardClicked INSTANCE = new BitcoinMapCardWidgetViewEvent$OnCardClicked();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof BitcoinMapCardWidgetViewEvent$OnCardClicked);
    }

    public final int hashCode() {
        return -1168165468;
    }

    public final String toString() {
        return "OnCardClicked";
    }
}
