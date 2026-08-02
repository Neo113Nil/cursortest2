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
public final class StockSelectToggleStockSelection implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_selected;
    public final LinkedHashMap parameters;
    public final String symbol;

    public StockSelectToggleStockSelection(Boolean bool, String str) {
        this.is_selected = bool;
        this.symbol = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "is_selected", bool);
        Countries.putSafe(m, "symbol", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockSelectToggleStockSelection)) {
            return false;
        }
        StockSelectToggleStockSelection stockSelectToggleStockSelection = (StockSelectToggleStockSelection) obj;
        return this.is_selected.equals(stockSelectToggleStockSelection.is_selected) && Intrinsics.areEqual(this.symbol, stockSelectToggleStockSelection.symbol);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select ToggleStockSelection";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.is_selected.hashCode() * 31;
        String str = this.symbol;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StockSelectToggleStockSelection(is_selected=" + this.is_selected + ", symbol=" + this.symbol + ")";
    }
}
