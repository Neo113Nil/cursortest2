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
public final class GrowToolsToggleOffConfirm implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Origin origin;
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentType f1088type;

    public GrowToolsToggleOffConfirm(Origin origin, InvestmentType investmentType) {
        this.origin = origin;
        this.f1088type = investmentType;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "GrowTools", "cdf_action", "Toggle");
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "type", investmentType);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GrowToolsToggleOffConfirm)) {
            return false;
        }
        GrowToolsToggleOffConfirm growToolsToggleOffConfirm = (GrowToolsToggleOffConfirm) obj;
        return this.origin == growToolsToggleOffConfirm.origin && this.f1088type == growToolsToggleOffConfirm.f1088type;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "GrowTools Toggle OffConfirm";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.f1088type.hashCode() + (this.origin.hashCode() * 31);
    }

    public final String toString() {
        return "GrowToolsToggleOffConfirm(origin=" + this.origin + ", type=" + this.f1088type + ")";
    }
}
