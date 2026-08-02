package com.squareup.cash.cdf.stock;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class StockTradeSetPrice implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Long order_price_per_unit_bps;
    public final OrderSide order_side;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockTradeSetPrice(OrderSide orderSide, String str, Long l) {
        this.order_side = orderSide;
        this.ticker = str;
        this.order_price_per_unit_bps = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Stock", "cdf_action", "Trade");
        Countries.putSafe(m, "order_side", orderSide);
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "order_price_per_unit_bps", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockTradeSetPrice)) {
            return false;
        }
        StockTradeSetPrice stockTradeSetPrice = (StockTradeSetPrice) obj;
        return this.order_side == stockTradeSetPrice.order_side && Intrinsics.areEqual(this.ticker, stockTradeSetPrice.ticker) && this.order_price_per_unit_bps.equals(stockTradeSetPrice.order_price_per_unit_bps);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Trade SetPrice";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.order_side.hashCode() * 31;
        String str = this.ticker;
        return this.order_price_per_unit_bps.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StockTradeSetPrice(order_side=");
        sb.append(this.order_side);
        sb.append(", ticker=");
        sb.append(this.ticker);
        sb.append(", order_price_per_unit_bps=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.order_price_per_unit_bps, ")");
    }
}
