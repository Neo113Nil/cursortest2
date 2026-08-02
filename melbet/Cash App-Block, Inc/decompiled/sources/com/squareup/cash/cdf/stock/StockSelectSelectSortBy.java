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
public final class StockSelectSelectSortBy implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Sort sort;
    public final StockSource source;

    public StockSelectSelectSortBy(Sort sort, StockSource stockSource) {
        this.sort = sort;
        this.source = stockSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "sort", sort);
        Countries.putSafe(m, "source", stockSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockSelectSelectSortBy)) {
            return false;
        }
        StockSelectSelectSortBy stockSelectSelectSortBy = (StockSelectSelectSortBy) obj;
        return this.sort == stockSelectSelectSortBy.sort && this.source == stockSelectSelectSortBy.source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select SelectSortBy";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Sort sort = this.sort;
        return this.source.hashCode() + ((sort == null ? 0 : sort.hashCode()) * 31);
    }

    public final String toString() {
        return "StockSelectSelectSortBy(sort=" + this.sort + ", source=" + this.source + ")";
    }
}
