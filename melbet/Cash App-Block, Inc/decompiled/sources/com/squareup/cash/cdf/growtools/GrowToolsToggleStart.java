package com.squareup.cash.cdf.growtools;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class GrowToolsToggleStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean enabled;
    public final Origin origin;
    public final LinkedHashMap parameters;

    /* renamed from: type, reason: collision with root package name */
    public final InvestmentType f1089type;

    public GrowToolsToggleStart(Origin origin, InvestmentType investmentType, Boolean bool) {
        this.origin = origin;
        this.f1089type = investmentType;
        this.enabled = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "GrowTools", "cdf_action", "Toggle");
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "type", investmentType);
        Countries.putSafe(m, "enabled", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GrowToolsToggleStart)) {
            return false;
        }
        GrowToolsToggleStart growToolsToggleStart = (GrowToolsToggleStart) obj;
        return this.origin == growToolsToggleStart.origin && this.f1089type == growToolsToggleStart.f1089type && this.enabled.equals(growToolsToggleStart.enabled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "GrowTools Toggle Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.enabled.hashCode() + ((this.f1089type.hashCode() + (this.origin.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GrowToolsToggleStart(origin=");
        sb.append(this.origin);
        sb.append(", type=");
        sb.append(this.f1089type);
        sb.append(", enabled=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.enabled, ")");
    }
}
