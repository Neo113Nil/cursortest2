package com.squareup.cash.cdf.stock;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StockTradeSetAutoInvest implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Frequency frequency;
    public final OrderSide order_side;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockTradeSetAutoInvest(OrderSide orderSide, String str, Frequency frequency) {
        this.order_side = orderSide;
        this.ticker = str;
        this.frequency = frequency;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Stock", "cdf_action", "Trade");
        Countries.putSafe(m, "order_side", orderSide);
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "frequency", frequency);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockTradeSetAutoInvest)) {
            return false;
        }
        StockTradeSetAutoInvest stockTradeSetAutoInvest = (StockTradeSetAutoInvest) obj;
        return this.order_side == stockTradeSetAutoInvest.order_side && Intrinsics.areEqual(this.ticker, stockTradeSetAutoInvest.ticker) && this.frequency == stockTradeSetAutoInvest.frequency;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Trade SetAutoInvest";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.order_side.hashCode() * 31;
        String str = this.ticker;
        return this.frequency.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "StockTradeSetAutoInvest(order_side=" + this.order_side + ", ticker=" + this.ticker + ", frequency=" + this.frequency + ")";
    }
}
