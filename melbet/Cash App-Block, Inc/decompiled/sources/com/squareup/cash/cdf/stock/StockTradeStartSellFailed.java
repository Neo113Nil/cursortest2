package com.squareup.cash.cdf.stock;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class StockTradeStartSellFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final LinkedHashMap parameters = BalanceFeedKt$$ExternalSyntheticOutline0.m$1("cdf_entity", 2, "Stock", "cdf_action", "Trade");
    public final String name = "Stock Trade StartSellFailed";

    public final boolean equals(Object obj) {
        return obj instanceof StockTradeStartSellFailed;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return this.name;
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }
}
