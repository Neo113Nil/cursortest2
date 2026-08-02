package com.squareup.cash.cdf.papermoney;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PaperMoneyMapFilterApply implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Boolean is_barcode_selected;
    public final Boolean is_swipe_selected;
    public final LinkedHashMap parameters;

    public PaperMoneyMapFilterApply(Boolean bool, Boolean bool2) {
        this.is_barcode_selected = bool;
        this.is_swipe_selected = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PaperMoney", "cdf_action", "MapFilter");
        Countries.putSafe(m, "is_barcode_selected", bool);
        Countries.putSafe(m, "is_swipe_selected", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaperMoneyMapFilterApply)) {
            return false;
        }
        PaperMoneyMapFilterApply paperMoneyMapFilterApply = (PaperMoneyMapFilterApply) obj;
        return this.is_barcode_selected.equals(paperMoneyMapFilterApply.is_barcode_selected) && this.is_swipe_selected.equals(paperMoneyMapFilterApply.is_swipe_selected);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PaperMoney MapFilter Apply";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.is_swipe_selected.hashCode() + (this.is_barcode_selected.hashCode() * 31);
    }

    public final String toString() {
        return "PaperMoneyMapFilterApply(is_barcode_selected=" + this.is_barcode_selected + ", is_swipe_selected=" + this.is_swipe_selected + ")";
    }
}
