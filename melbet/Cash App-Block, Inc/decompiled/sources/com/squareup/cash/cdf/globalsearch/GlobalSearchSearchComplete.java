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
public final class GlobalSearchSearchComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String external_id;
    public final LinkedHashMap parameters;
    public final String query_token;
    public final String search_flow_token;
    public final SearchOrigin search_origin;

    public GlobalSearchSearchComplete(String str, String str2, SearchOrigin searchOrigin, String str3) {
        this.search_flow_token = str;
        this.external_id = str2;
        this.search_origin = searchOrigin;
        this.query_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "GlobalSearch", "cdf_action", "Search");
        Countries.putSafe(m, "search_flow_token", str);
        Countries.putSafe(m, "external_id", str2);
        Countries.putSafe(m, "search_origin", searchOrigin);
        Countries.putSafe(m, "query_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchSearchComplete)) {
            return false;
        }
        GlobalSearchSearchComplete globalSearchSearchComplete = (GlobalSearchSearchComplete) obj;
        return Intrinsics.areEqual(this.search_flow_token, globalSearchSearchComplete.search_flow_token) && Intrinsics.areEqual(this.external_id, globalSearchSearchComplete.external_id) && this.search_origin == globalSearchSearchComplete.search_origin && Intrinsics.areEqual(this.query_token, globalSearchSearchComplete.query_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "GlobalSearch Search Complete";
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
        int hashCode3 = (hashCode2 + (searchOrigin == null ? 0 : searchOrigin.hashCode())) * 31;
        String str3 = this.query_token;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GlobalSearchSearchComplete(search_flow_token=", this.search_flow_token, ", external_id=", this.external_id, ", search_origin=");
        m.append(this.search_origin);
        m.append(", query_token=");
        m.append(this.query_token);
        m.append(")");
        return m.toString();
    }
}
