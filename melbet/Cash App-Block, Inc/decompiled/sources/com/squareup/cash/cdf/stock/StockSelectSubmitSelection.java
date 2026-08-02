package com.squareup.cash.cdf.stock;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class StockSelectSubmitSelection implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final String selected_symbols;

    public StockSelectSubmitSelection(String str, String str2) {
        this.flow_token = str;
        this.selected_symbols = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Stock", "cdf_action", "Select");
        Countries.putSafe(m, "flow_token", str);
        Countries.putSafe(m, "selected_symbols", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StockSelectSubmitSelection)) {
            return false;
        }
        StockSelectSubmitSelection stockSelectSubmitSelection = (StockSelectSubmitSelection) obj;
        return Intrinsics.areEqual(this.flow_token, stockSelectSubmitSelection.flow_token) && this.selected_symbols.equals(stockSelectSubmitSelection.selected_symbols);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Stock Select SubmitSelection";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.flow_token;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.selected_symbols);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("StockSelectSubmitSelection(flow_token=", this.flow_token, ", selected_symbols=", this.selected_symbols, ", cta_title=null)");
    }
}
