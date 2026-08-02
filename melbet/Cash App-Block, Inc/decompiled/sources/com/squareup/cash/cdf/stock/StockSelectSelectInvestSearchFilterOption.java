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
public final class StockSelectSelectInvestSearchFilterOption implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String filter;
    public final String options;
    public final LinkedHashMap parameters;

    public StockSelectSelectInvestSearchFilterOption(String str, String str2) {
        this.filter = str;
        this.options = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 8, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "filter", str);
        Countries.putSafe(m, "options", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockSelectSelectInvestSearchFilterOption)) {
            return false;
        }
        StockSelectSelectInvestSearchFilterOption stockSelectSelectInvestSearchFilterOption = (StockSelectSelectInvestSearchFilterOption) obj;
        return Intrinsics.areEqual(this.filter, stockSelectSelectInvestSearchFilterOption.filter) && this.options.equals(stockSelectSelectInvestSearchFilterOption.options);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select SelectInvestSearchFilterOption";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.filter;
        return this.options.hashCode() + ((str == null ? 0 : str.hashCode()) * 28629151);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("StockSelectSelectInvestSearchFilterOption(filter=", this.filter, ", categories=null, stock_performance=null, time_period=null, advanced=null, options=", this.options, ")");
    }
}
