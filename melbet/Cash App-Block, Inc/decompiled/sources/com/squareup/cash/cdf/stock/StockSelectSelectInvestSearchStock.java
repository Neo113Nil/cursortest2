package com.squareup.cash.cdf.stock;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class StockSelectSelectInvestSearchStock implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String list;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockSelectSelectInvestSearchStock(String str, String str2) {
        this.ticker = str;
        this.list = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "list", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockSelectSelectInvestSearchStock)) {
            return false;
        }
        StockSelectSelectInvestSearchStock stockSelectSelectInvestSearchStock = (StockSelectSelectInvestSearchStock) obj;
        return Intrinsics.areEqual(this.ticker, stockSelectSelectInvestSearchStock.ticker) && this.list.equals(stockSelectSelectInvestSearchStock.list);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select SelectInvestSearchStock";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.ticker;
        return this.list.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("StockSelectSelectInvestSearchStock(ticker=", this.ticker, ", list=", this.list, ")");
    }
}
