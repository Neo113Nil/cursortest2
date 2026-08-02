package com.squareup.cash.cdf.stock;

import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class StockTradeStart implements Event {
    public static final zzd Companion = new zzd(28);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EquityType equity_type;
    public final OrderSide order_side;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockTradeStart(OrderSide orderSide, String str, EquityType equityType) {
        this.order_side = orderSide;
        this.ticker = str;
        this.equity_type = equityType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Stock", "cdf_action", "Trade");
        Countries.putSafe(m, "order_side", orderSide);
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "equity_type", equityType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockTradeStart)) {
            return false;
        }
        StockTradeStart stockTradeStart = (StockTradeStart) obj;
        return this.order_side == stockTradeStart.order_side && Intrinsics.areEqual(this.ticker, stockTradeStart.ticker) && this.equity_type == stockTradeStart.equity_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Trade Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.order_side.hashCode() * 31;
        String str = this.ticker;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        EquityType equityType = this.equity_type;
        return hashCode2 + (equityType != null ? equityType.hashCode() : 0);
    }

    public final String toString() {
        return "StockTradeStart(order_side=" + this.order_side + ", ticker=" + this.ticker + ", equity_type=" + this.equity_type + ")";
    }
}
