package com.squareup.cash.cdf.stock;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StockTradeSetExpiration implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String expiration_period;
    public final OrderSide order_side;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockTradeSetExpiration(OrderSide orderSide, String str, String str2) {
        this.order_side = orderSide;
        this.ticker = str;
        this.expiration_period = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Stock", "cdf_action", "Trade");
        Countries.putSafe(m, "order_side", orderSide);
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "expiration_period", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockTradeSetExpiration)) {
            return false;
        }
        StockTradeSetExpiration stockTradeSetExpiration = (StockTradeSetExpiration) obj;
        return this.order_side == stockTradeSetExpiration.order_side && Intrinsics.areEqual(this.ticker, stockTradeSetExpiration.ticker) && Intrinsics.areEqual(this.expiration_period, stockTradeSetExpiration.expiration_period);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Trade SetExpiration";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.order_side.hashCode() * 31;
        String str = this.ticker;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expiration_period;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StockTradeSetExpiration(order_side=");
        sb.append(this.order_side);
        sb.append(", ticker=");
        sb.append(this.ticker);
        sb.append(", expiration_period=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.expiration_period, ")");
    }
}
