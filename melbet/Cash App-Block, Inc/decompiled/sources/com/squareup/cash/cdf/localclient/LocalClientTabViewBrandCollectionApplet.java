package com.squareup.cash.cdf.localclient;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LocalClientTabViewBrandCollectionApplet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String location_tokens;
    public final LinkedHashMap parameters;

    public LocalClientTabViewBrandCollectionApplet(String str) {
        this.location_tokens = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "LocalClient", "cdf_action", "Tab");
        Countries.putSafe(m, "location_tokens", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalClientTabViewBrandCollectionApplet) && this.location_tokens.equals(((LocalClientTabViewBrandCollectionApplet) obj).location_tokens);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient Tab ViewBrandCollectionApplet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.location_tokens.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientTabViewBrandCollectionApplet(location_tokens=", this.location_tokens, ")");
    }
}
