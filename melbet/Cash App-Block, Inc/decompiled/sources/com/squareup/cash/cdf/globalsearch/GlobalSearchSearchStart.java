package com.squareup.cash.cdf.globalsearch;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GlobalSearchSearchStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final LinkedHashMap parameters;
    public final String search_flow_token;
    public final SearchOrigin search_origin;

    public GlobalSearchSearchStart(String str, String str2, SearchOrigin searchOrigin) {
        this.search_flow_token = str;
        this.external_id = str2;
        this.search_origin = searchOrigin;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "GlobalSearch", "cdf_action", "Search");
        Countries.putSafe(m, "search_flow_token", str);
        Countries.putSafe(m, "external_id", str2);
        Countries.putSafe(m, "search_origin", searchOrigin);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchSearchStart)) {
            return false;
        }
        GlobalSearchSearchStart globalSearchSearchStart = (GlobalSearchSearchStart) obj;
        return Intrinsics.areEqual(this.search_flow_token, globalSearchSearchStart.search_flow_token) && Intrinsics.areEqual(this.external_id, globalSearchSearchStart.external_id) && this.search_origin == globalSearchSearchStart.search_origin;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "GlobalSearch Search Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.search_flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.external_id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        SearchOrigin searchOrigin = this.search_origin;
        return hashCode2 + (searchOrigin != null ? searchOrigin.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GlobalSearchSearchStart(search_flow_token=", this.search_flow_token, ", external_id=", this.external_id, ", search_origin=");
        m.append(this.search_origin);
        m.append(")");
        return m.toString();
    }
}
