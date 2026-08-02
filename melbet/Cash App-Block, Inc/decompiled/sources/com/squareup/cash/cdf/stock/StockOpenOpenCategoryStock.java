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
public final class StockOpenOpenCategoryStock implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String category_name;
    public final LinkedHashMap parameters;
    public final String ticker;

    public StockOpenOpenCategoryStock(String str, String str2) {
        this.category_name = str;
        this.ticker = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "Open");
        Countries.putSafe(m, "category_name", str);
        Countries.putSafe(m, "ticker", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockOpenOpenCategoryStock)) {
            return false;
        }
        StockOpenOpenCategoryStock stockOpenOpenCategoryStock = (StockOpenOpenCategoryStock) obj;
        return Intrinsics.areEqual(this.category_name, stockOpenOpenCategoryStock.category_name) && Intrinsics.areEqual(this.ticker, stockOpenOpenCategoryStock.ticker);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Open OpenCategoryStock";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.category_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ticker;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("StockOpenOpenCategoryStock(category_name=", this.category_name, ", ticker=", this.ticker, ")");
    }
}
