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
public final class StockScrollScrollNews implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final ScreenSource source;

    public StockScrollScrollNews(ScreenSource screenSource) {
        this.source = screenSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Stock", "cdf_action", "Scroll");
        Countries.putSafe(m, "source", screenSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StockScrollScrollNews) && this.source == ((StockScrollScrollNews) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Scroll ScrollNews";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "StockScrollScrollNews(source=" + this.source + ")";
    }
}
