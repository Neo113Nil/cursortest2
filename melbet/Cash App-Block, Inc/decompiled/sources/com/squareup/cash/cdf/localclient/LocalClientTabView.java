package com.squareup.cash.cdf.localclient;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LocalClientTabView implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String card_brand_tokens;
    public final Boolean geo_tab;
    public final LinkedHashMap parameters;

    public LocalClientTabView(String str, Boolean bool) {
        this.card_brand_tokens = str;
        this.geo_tab = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "LocalClient", "cdf_action", "Tab");
        Countries.putSafe(m, "card_brand_tokens", str);
        Countries.putSafe(m, "geo_tab", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientTabView)) {
            return false;
        }
        LocalClientTabView localClientTabView = (LocalClientTabView) obj;
        return this.card_brand_tokens.equals(localClientTabView.card_brand_tokens) && this.geo_tab.equals(localClientTabView.geo_tab);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient Tab View";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.geo_tab.hashCode() + (this.card_brand_tokens.hashCode() * 961);
    }

    public final String toString() {
        return "LocalClientTabView(card_brand_tokens=" + this.card_brand_tokens + ", discovery_brand_tokens=null, geo_tab=" + this.geo_tab + ")";
    }
}
