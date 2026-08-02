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
public final class StockTradeChangeOrderType implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final OrderSide order_side;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockTradeChangeOrderType(OrderSide orderSide, String str) {
        this.order_side = orderSide;
        this.ticker = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "Trade");
        Countries.putSafe(m, "order_side", orderSide);
        Countries.putSafe(m, "ticker", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockTradeChangeOrderType)) {
            return false;
        }
        StockTradeChangeOrderType stockTradeChangeOrderType = (StockTradeChangeOrderType) obj;
        return this.order_side == stockTradeChangeOrderType.order_side && Intrinsics.areEqual(this.ticker, stockTradeChangeOrderType.ticker);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Trade ChangeOrderType";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.order_side.hashCode() * 31;
        String str = this.ticker;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StockTradeChangeOrderType(order_side=" + this.order_side + ", ticker=" + this.ticker + ")";
    }
}
