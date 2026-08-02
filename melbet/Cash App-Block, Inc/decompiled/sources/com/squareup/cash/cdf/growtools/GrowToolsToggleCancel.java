package com.squareup.cash.cdf.growtools;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class GrowToolsToggleCancel implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Origin origin;
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentType f1086type;

    public GrowToolsToggleCancel(Origin origin, InvestmentType investmentType) {
        this.origin = origin;
        this.f1086type = investmentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "GrowTools", "cdf_action", "Toggle");
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "type", investmentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GrowToolsToggleCancel)) {
            return false;
        }
        GrowToolsToggleCancel growToolsToggleCancel = (GrowToolsToggleCancel) obj;
        return this.origin == growToolsToggleCancel.origin && this.f1086type == growToolsToggleCancel.f1086type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "GrowTools Toggle Cancel";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.f1086type.hashCode() + (this.origin.hashCode() * 31);
    }

    public final String toString() {
        return "GrowToolsToggleCancel(origin=" + this.origin + ", type=" + this.f1086type + ")";
    }
}
