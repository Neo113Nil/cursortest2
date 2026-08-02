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
public final class GrowToolsManageActivityItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Origin origin;
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentType f1081type;

    public GrowToolsManageActivityItem(Origin origin, InvestmentType investmentType) {
        this.origin = origin;
        this.f1081type = investmentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "GrowTools", "cdf_action", "Manage");
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "type", investmentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GrowToolsManageActivityItem)) {
            return false;
        }
        GrowToolsManageActivityItem growToolsManageActivityItem = (GrowToolsManageActivityItem) obj;
        return this.origin == growToolsManageActivityItem.origin && this.f1081type == growToolsManageActivityItem.f1081type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "GrowTools Manage ActivityItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.f1081type.hashCode() + (this.origin.hashCode() * 31);
    }

    public final String toString() {
        return "GrowToolsManageActivityItem(origin=" + this.origin + ", type=" + this.f1081type + ")";
    }
}
