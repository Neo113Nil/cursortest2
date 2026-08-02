package com.squareup.cash.cdf.stock;

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
public final class StockTradeEnterAmount implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long amount;
    public final String amount_text;
    public final OrderSide order_side;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockTradeEnterAmount(OrderSide orderSide, String str, Long l, String str2) {
        this.order_side = orderSide;
        this.ticker = str;
        this.amount = l;
        this.amount_text = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "Stock", "cdf_action", "Trade");
        Countries.putSafe(m, "order_side", orderSide);
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "amount", l);
        Countries.putSafe(m, "amount_text", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockTradeEnterAmount)) {
            return false;
        }
        StockTradeEnterAmount stockTradeEnterAmount = (StockTradeEnterAmount) obj;
        return this.order_side == stockTradeEnterAmount.order_side && Intrinsics.areEqual(this.ticker, stockTradeEnterAmount.ticker) && this.amount.equals(stockTradeEnterAmount.amount) && Intrinsics.areEqual(this.amount_text, stockTradeEnterAmount.amount_text);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Trade EnterAmount";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.order_side.hashCode() * 31;
        String str = this.ticker;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.amount, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.amount_text;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "StockTradeEnterAmount(order_side=" + this.order_side + ", ticker=" + this.ticker + ", amount=" + this.amount + ", amount_text=" + this.amount_text + ")";
    }
}
