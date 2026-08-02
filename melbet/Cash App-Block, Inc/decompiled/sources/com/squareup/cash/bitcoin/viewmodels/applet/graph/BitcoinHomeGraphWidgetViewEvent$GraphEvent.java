package com.squareup.cash.bitcoin.viewmodels.applet.graph;

import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;
import com.squareup.cash.portfolio.graphs.viewmodels.InvestingGraphViewEvent;

/* loaded from: classes5.dex */
public final class BitcoinHomeGraphWidgetViewEvent$GraphEvent implements BitcoinHomeViewEvent {
    public final InvestingGraphViewEvent event;

    public BitcoinHomeGraphWidgetViewEvent$GraphEvent(InvestingGraphViewEvent investingGraphViewEvent) {
        this.event = investingGraphViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BitcoinHomeGraphWidgetViewEvent$GraphEvent) && this.event.equals(((BitcoinHomeGraphWidgetViewEvent$GraphEvent) obj).event);
    }

    public final int hashCode() {
        return this.event.hashCode();
    }

    public final String toString() {
        return "GraphEvent(event=" + this.event + ")";
    }
}
