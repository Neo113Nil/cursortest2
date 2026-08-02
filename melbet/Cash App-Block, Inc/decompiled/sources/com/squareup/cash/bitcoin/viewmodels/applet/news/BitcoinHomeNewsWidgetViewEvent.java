package com.squareup.cash.bitcoin.viewmodels.applet.news;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinHomeNewsWidgetViewEvent implements BitcoinHomeViewEvent {
    public final InvestingCryptoNewsViewEvent event;

    public BitcoinHomeNewsWidgetViewEvent(InvestingCryptoNewsViewEvent investingCryptoNewsViewEvent) {
        investingCryptoNewsViewEvent.getClass();
        this.event = investingCryptoNewsViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinHomeNewsWidgetViewEvent) && Intrinsics.areEqual(this.event, ((BitcoinHomeNewsWidgetViewEvent) obj).event);
    }

    public final int hashCode() {
        return this.event.hashCode();
    }

    public final String toString() {
        return "BitcoinHomeNewsWidgetViewEvent(event=" + this.event + ")";
    }
}
