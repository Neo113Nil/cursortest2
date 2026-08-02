package com.squareup.cash.cdf.prepurchasecard;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class PrepurchaseCardPrimaryHalfSheetView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Surface surface;

    public PrepurchaseCardPrimaryHalfSheetView(Surface surface) {
        this.surface = surface;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "PrepurchaseCard", "cdf_action", "PrimaryHalfSheet");
        Countries.putSafe(m, "surface", surface);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrepurchaseCardPrimaryHalfSheetView) && this.surface == ((PrepurchaseCardPrimaryHalfSheetView) obj).surface;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PrepurchaseCard PrimaryHalfSheet View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Surface surface = this.surface;
        if (surface == null) {
            return 0;
        }
        return surface.hashCode();
    }

    public final String toString() {
        return "PrepurchaseCardPrimaryHalfSheetView(surface=" + this.surface + ")";
    }
}
