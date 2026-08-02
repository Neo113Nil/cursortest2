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
public final class PrepurchaseCardToggleView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Surface surface;
    public final ToggleState toggle_state;

    public PrepurchaseCardToggleView(ToggleState toggleState, Surface surface) {
        this.toggle_state = toggleState;
        this.surface = surface;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "PrepurchaseCard", "cdf_action", "Toggle");
        Countries.putSafe(m, "toggle_state", toggleState);
        Countries.putSafe(m, "surface", surface);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepurchaseCardToggleView)) {
            return false;
        }
        PrepurchaseCardToggleView prepurchaseCardToggleView = (PrepurchaseCardToggleView) obj;
        return this.toggle_state == prepurchaseCardToggleView.toggle_state && this.surface == prepurchaseCardToggleView.surface;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "PrepurchaseCard Toggle View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        ToggleState toggleState = this.toggle_state;
        return this.surface.hashCode() + ((toggleState == null ? 0 : toggleState.hashCode()) * 31);
    }

    public final String toString() {
        return "PrepurchaseCardToggleView(toggle_state=" + this.toggle_state + ", surface=" + this.surface + ")";
    }
}
