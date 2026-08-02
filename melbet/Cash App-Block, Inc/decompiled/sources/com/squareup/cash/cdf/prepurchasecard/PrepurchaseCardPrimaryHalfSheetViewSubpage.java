package com.squareup.cash.cdf.prepurchasecard;

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
public final class PrepurchaseCardPrimaryHalfSheetViewSubpage implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String subpage_title;
    public final Surface surface;

    public PrepurchaseCardPrimaryHalfSheetViewSubpage(String str, Surface surface) {
        this.subpage_title = str;
        this.surface = surface;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PrepurchaseCard", "cdf_action", "PrimaryHalfSheet");
        Countries.putSafe(m, "subpage_title", str);
        Countries.putSafe(m, "surface", surface);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCardPrimaryHalfSheetViewSubpage)) {
            return false;
        }
        PrepurchaseCardPrimaryHalfSheetViewSubpage prepurchaseCardPrimaryHalfSheetViewSubpage = (PrepurchaseCardPrimaryHalfSheetViewSubpage) obj;
        return Intrinsics.areEqual(this.subpage_title, prepurchaseCardPrimaryHalfSheetViewSubpage.subpage_title) && this.surface == prepurchaseCardPrimaryHalfSheetViewSubpage.surface;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PrepurchaseCard PrimaryHalfSheet ViewSubpage";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.subpage_title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Surface surface = this.surface;
        return hashCode + (surface != null ? surface.hashCode() : 0);
    }

    public final String toString() {
        return "PrepurchaseCardPrimaryHalfSheetViewSubpage(subpage_title=" + this.subpage_title + ", surface=" + this.surface + ")";
    }
}
