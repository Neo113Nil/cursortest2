package com.squareup.cash.cdf.stock;

import com.google.mlkit.common.internal.zze;
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
public final class StockTradeSubmitAmount implements Event {
    public static final zze Companion = new zze(28);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE, EventDestination.BRAZE});
    public final Long amount;
    public final Frequency frequency;
    public final OrderSide order_side;
    public final OrderType order_type;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String ticker;

    public StockTradeSubmitAmount(OrderSide orderSide, String str, Long l, OrderType orderType, Frequency frequency, String str2) {
        this.order_side = orderSide;
        this.ticker = str;
        this.amount = l;
        this.order_type = orderType;
        this.frequency = frequency;
        this.referrer_flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Stock", "cdf_action", "Trade");
        Countries.putSafe(m, "order_side", orderSide);
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "amount", l);
        Countries.putSafe(m, "order_type", orderType);
        Countries.putSafe(m, "frequency", frequency);
        Countries.putSafe(m, "referrer_flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockTradeSubmitAmount)) {
            return false;
        }
        StockTradeSubmitAmount stockTradeSubmitAmount = (StockTradeSubmitAmount) obj;
        return this.order_side == stockTradeSubmitAmount.order_side && Intrinsics.areEqual(this.ticker, stockTradeSubmitAmount.ticker) && Intrinsics.areEqual(this.amount, stockTradeSubmitAmount.amount) && this.order_type == stockTradeSubmitAmount.order_type && this.frequency == stockTradeSubmitAmount.frequency && Intrinsics.areEqual(this.referrer_flow_token, stockTradeSubmitAmount.referrer_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Trade SubmitAmount";
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
        int hashCode3 = (this.frequency.hashCode() + ((this.order_type.hashCode() + ((hashCode2 + (l == null ? 0 : l.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.referrer_flow_token;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "StockTradeSubmitAmount(order_side=" + this.order_side + ", ticker=" + this.ticker + ", amount=" + this.amount + ", order_type=" + this.order_type + ", frequency=" + this.frequency + ", referrer_flow_token=" + this.referrer_flow_token + ")";
    }
}
