package com.squareup.cash.cdf.stock;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class StockViewViewNews implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final EquityType equity_type;
    public final LinkedHashMap parameters;
    public final ScreenSource source;

    public StockViewViewNews(ScreenSource screenSource, EquityType equityType) {
        this.source = screenSource;
        this.equity_type = equityType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "View");
        Countries.putSafe(m, "source", screenSource);
        Countries.putSafe(m, "equity_type", equityType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockViewViewNews)) {
            return false;
        }
        StockViewViewNews stockViewViewNews = (StockViewViewNews) obj;
        return this.source == stockViewViewNews.source && this.equity_type == stockViewViewNews.equity_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock View ViewNews";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        EquityType equityType = this.equity_type;
        return hashCode + (equityType == null ? 0 : equityType.hashCode());
    }

    public final String toString() {
        return "StockViewViewNews(source=" + this.source + ", equity_type=" + this.equity_type + ")";
    }
}
