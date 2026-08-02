package com.squareup.cash.cdf.globalsearch;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GlobalSearchViewItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.SNOWFLAKE);
    public final String entity_token;
    public final String entity_type;
    public final String external_id;
    public final String metadata_json;
    public final LinkedHashMap parameters;
    public final String query_token;
    public final Integer row_index;
    public final String search_flow_token;
    public final SearchOrigin search_origin;
    public final Integer section_index;

    public GlobalSearchViewItem(String str, String str2, String str3, SearchOrigin searchOrigin, String str4, String str5, Integer num, Integer num2, String str6) {
        this.search_flow_token = str;
        this.external_id = str2;
        this.query_token = str3;
        this.search_origin = searchOrigin;
        this.entity_token = str4;
        this.entity_type = str5;
        this.row_index = num;
        this.section_index = num2;
        this.metadata_json = str6;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 11, "GlobalSearch", "cdf_action", "View");
        Countries.putSafe(m, "search_flow_token", str);
        Countries.putSafe(m, "external_id", str2);
        Countries.putSafe(m, "query_token", str3);
        Countries.putSafe(m, "search_origin", searchOrigin);
        Countries.putSafe(m, "entity_token", str4);
        Countries.putSafe(m, "entity_type", str5);
        Countries.putSafe(m, "row_index", num);
        Countries.putSafe(m, "section_index", num2);
        Countries.putSafe(m, "metadata_json", str6);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchViewItem)) {
            return false;
        }
        GlobalSearchViewItem globalSearchViewItem = (GlobalSearchViewItem) obj;
        return Intrinsics.areEqual(this.search_flow_token, globalSearchViewItem.search_flow_token) && Intrinsics.areEqual(this.external_id, globalSearchViewItem.external_id) && Intrinsics.areEqual(this.query_token, globalSearchViewItem.query_token) && this.search_origin == globalSearchViewItem.search_origin && Intrinsics.areEqual(this.entity_token, globalSearchViewItem.entity_token) && Intrinsics.areEqual(this.entity_type, globalSearchViewItem.entity_type) && Intrinsics.areEqual(this.row_index, globalSearchViewItem.row_index) && Intrinsics.areEqual(this.section_index, globalSearchViewItem.section_index) && Intrinsics.areEqual(this.metadata_json, globalSearchViewItem.metadata_json);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "GlobalSearch View Item";
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
        String str3 = this.query_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SearchOrigin searchOrigin = this.search_origin;
        int hashCode4 = (hashCode3 + (searchOrigin == null ? 0 : searchOrigin.hashCode())) * 31;
        String str4 = this.entity_token;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.entity_type;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.row_index;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.section_index;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.metadata_json;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GlobalSearchViewItem(search_flow_token=", this.search_flow_token, ", external_id=", this.external_id, ", query_token=");
        m.append(this.query_token);
        m.append(", search_origin=");
        m.append(this.search_origin);
        m.append(", entity_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.entity_token, ", entity_type=", this.entity_type, ", row_index=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.row_index, ", section_index=", this.section_index, ", metadata_json=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.metadata_json, ")");
    }
}
