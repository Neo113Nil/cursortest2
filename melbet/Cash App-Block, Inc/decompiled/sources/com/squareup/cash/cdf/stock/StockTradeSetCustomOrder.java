package com.squareup.cash.cdf.stock;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class StockTradeSetCustomOrder implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long amount;
    public final Long current_price_per_unit_bps;
    public final Long order_price_per_unit_bps;
    public final OrderSide order_side;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockTradeSetCustomOrder(OrderSide orderSide, String str, Long l, Long l2, Long l3) {
        this.order_side = orderSide;
        this.ticker = str;
        this.amount = l;
        this.current_price_per_unit_bps = l2;
        this.order_price_per_unit_bps = l3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "Stock", "cdf_action", "Trade");
        Countries.putSafe(m, "order_side", orderSide);
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "amount", l);
        Countries.putSafe(m, "current_price_per_unit_bps", l2);
        Countries.putSafe(m, "order_price_per_unit_bps", l3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockTradeSetCustomOrder)) {
            return false;
        }
        StockTradeSetCustomOrder stockTradeSetCustomOrder = (StockTradeSetCustomOrder) obj;
        return this.order_side == stockTradeSetCustomOrder.order_side && Intrinsics.areEqual(this.ticker, stockTradeSetCustomOrder.ticker) && Intrinsics.areEqual(this.amount, stockTradeSetCustomOrder.amount) && this.current_price_per_unit_bps.equals(stockTradeSetCustomOrder.current_price_per_unit_bps) && this.order_price_per_unit_bps.equals(stockTradeSetCustomOrder.order_price_per_unit_bps);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Trade SetCustomOrder";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.order_side.hashCode() * 31;
        String str = this.ticker;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.amount;
        return this.order_price_per_unit_bps.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.current_price_per_unit_bps, (hashCode2 + (l != null ? l.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StockTradeSetCustomOrder(order_side=");
        sb.append(this.order_side);
        sb.append(", ticker=");
        sb.append(this.ticker);
        sb.append(", amount=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.amount, ", current_price_per_unit_bps=", this.current_price_per_unit_bps, ", order_price_per_unit_bps=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.order_price_per_unit_bps, ")");
    }
}
