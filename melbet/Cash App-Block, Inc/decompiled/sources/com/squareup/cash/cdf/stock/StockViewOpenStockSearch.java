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
public final class StockViewOpenStockSearch implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source NEW_CUSTOMER_CTA_BUTTON;
        public static final Source PORTFOLIO_SEARCH_BAR;

        static {
            Source source = new Source("NEW_CUSTOMER_CTA_BUTTON", 0);
            NEW_CUSTOMER_CTA_BUTTON = source;
            Source source2 = new Source("PORTFOLIO_SEARCH_BAR", 1);
            PORTFOLIO_SEARCH_BAR = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public StockViewOpenStockSearch(Source source) {
        this.source = source;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Stock", "cdf_action", "View");
        Countries.putSafe(m, "source", source);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StockViewOpenStockSearch) && this.source == ((StockViewOpenStockSearch) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock View OpenStockSearch";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "StockViewOpenStockSearch(source=" + this.source + ")";
    }
}
