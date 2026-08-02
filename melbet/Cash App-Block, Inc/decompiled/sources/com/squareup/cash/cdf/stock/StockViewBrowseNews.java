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

/* loaded from: classes6.dex */
public final class StockViewBrowseNews implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String investment_state;
    public final String news_type;
    public final LinkedHashMap parameters;

    public StockViewBrowseNews(String str, String str2) {
        this.investment_state = str;
        this.news_type = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "View");
        Countries.putSafe(m, "investment_state", str);
        Countries.putSafe(m, "news_type", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockViewBrowseNews)) {
            return false;
        }
        StockViewBrowseNews stockViewBrowseNews = (StockViewBrowseNews) obj;
        return this.investment_state.equals(stockViewBrowseNews.investment_state) && this.news_type.equals(stockViewBrowseNews.news_type);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock View BrowseNews";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.news_type.hashCode() + (this.investment_state.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("StockViewBrowseNews(investment_state=", this.investment_state, ", news_type=", this.news_type, ")");
    }
}
