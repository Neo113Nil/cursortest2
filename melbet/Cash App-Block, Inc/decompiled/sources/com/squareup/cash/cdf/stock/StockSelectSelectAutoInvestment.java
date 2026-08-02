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
public final class StockSelectSelectAutoInvestment implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EquityType equity_type;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockSelectSelectAutoInvestment(String str, EquityType equityType) {
        this.ticker = str;
        this.equity_type = equityType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "ticker", str);
        Countries.putSafe(m, "equity_type", equityType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockSelectSelectAutoInvestment)) {
            return false;
        }
        StockSelectSelectAutoInvestment stockSelectSelectAutoInvestment = (StockSelectSelectAutoInvestment) obj;
        return Intrinsics.areEqual(this.ticker, stockSelectSelectAutoInvestment.ticker) && this.equity_type == stockSelectSelectAutoInvestment.equity_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select SelectAutoInvestment";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.ticker;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        EquityType equityType = this.equity_type;
        return hashCode + (equityType != null ? equityType.hashCode() : 0);
    }

    public final String toString() {
        return "StockSelectSelectAutoInvestment(ticker=" + this.ticker + ", equity_type=" + this.equity_type + ")";
    }
}
