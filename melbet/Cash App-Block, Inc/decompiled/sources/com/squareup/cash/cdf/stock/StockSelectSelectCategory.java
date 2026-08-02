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
public final class StockSelectSelectCategory implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String category_name;
    public final EquityType equity_type;
    public final ScreenSource origin;
    public final LinkedHashMap parameters;

    public StockSelectSelectCategory(String str, ScreenSource screenSource, EquityType equityType) {
        this.category_name = str;
        this.origin = screenSource;
        this.equity_type = equityType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "category_name", str);
        Countries.putSafe(m, "origin", screenSource);
        Countries.putSafe(m, "equity_type", equityType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockSelectSelectCategory)) {
            return false;
        }
        StockSelectSelectCategory stockSelectSelectCategory = (StockSelectSelectCategory) obj;
        return Intrinsics.areEqual(this.category_name, stockSelectSelectCategory.category_name) && this.origin == stockSelectSelectCategory.origin && this.equity_type == stockSelectSelectCategory.equity_type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select SelectCategory";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.category_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ScreenSource screenSource = this.origin;
        int hashCode2 = (hashCode + (screenSource == null ? 0 : screenSource.hashCode())) * 31;
        EquityType equityType = this.equity_type;
        return hashCode2 + (equityType != null ? equityType.hashCode() : 0);
    }

    public final String toString() {
        return "StockSelectSelectCategory(category_name=" + this.category_name + ", origin=" + this.origin + ", equity_type=" + this.equity_type + ")";
    }
}
