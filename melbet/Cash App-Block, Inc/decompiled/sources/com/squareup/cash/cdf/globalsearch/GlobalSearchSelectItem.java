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
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GlobalSearchSelectItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
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
    public final TapTarget tap_target;

    public GlobalSearchSelectItem(String str, String str2, String str3, SearchOrigin searchOrigin, String str4, String str5, Integer num, Integer num2, TapTarget tapTarget, String str6) {
        this.search_flow_token = str;
        this.external_id = str2;
        this.query_token = str3;
        this.search_origin = searchOrigin;
        this.entity_token = str4;
        this.entity_type = str5;
        this.row_index = num;
        this.section_index = num2;
        this.tap_target = tapTarget;
        this.metadata_json = str6;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "GlobalSearch", "cdf_action", "Select");
        Countries.putSafe(m, "search_flow_token", str);
        Countries.putSafe(m, "external_id", str2);
        Countries.putSafe(m, "query_token", str3);
        Countries.putSafe(m, "search_origin", searchOrigin);
        Countries.putSafe(m, "entity_token", str4);
        Countries.putSafe(m, "entity_type", str5);
        Countries.putSafe(m, "row_index", num);
        Countries.putSafe(m, "section_index", num2);
        Countries.putSafe(m, "tap_target", tapTarget);
        Countries.putSafe(m, "metadata_json", str6);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSearchSelectItem)) {
            return false;
        }
        GlobalSearchSelectItem globalSearchSelectItem = (GlobalSearchSelectItem) obj;
        return Intrinsics.areEqual(this.search_flow_token, globalSearchSelectItem.search_flow_token) && Intrinsics.areEqual(this.external_id, globalSearchSelectItem.external_id) && Intrinsics.areEqual(this.query_token, globalSearchSelectItem.query_token) && this.search_origin == globalSearchSelectItem.search_origin && Intrinsics.areEqual(this.entity_token, globalSearchSelectItem.entity_token) && Intrinsics.areEqual(this.entity_type, globalSearchSelectItem.entity_type) && Intrinsics.areEqual(this.row_index, globalSearchSelectItem.row_index) && Intrinsics.areEqual(this.section_index, globalSearchSelectItem.section_index) && this.tap_target == globalSearchSelectItem.tap_target && Intrinsics.areEqual(this.metadata_json, globalSearchSelectItem.metadata_json);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "GlobalSearch Select Item";
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
        TapTarget tapTarget = this.tap_target;
        int hashCode9 = (hashCode8 + (tapTarget == null ? 0 : tapTarget.hashCode())) * 31;
        String str6 = this.metadata_json;
        return hashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GlobalSearchSelectItem(search_flow_token=", this.search_flow_token, ", external_id=", this.external_id, ", query_token=");
        m.append(this.query_token);
        m.append(", search_origin=");
        m.append(this.search_origin);
        m.append(", entity_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.entity_token, ", entity_type=", this.entity_type, ", row_index=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.row_index, ", section_index=", this.section_index, ", tap_target=");
        m.append(this.tap_target);
        m.append(", metadata_json=");
        m.append(this.metadata_json);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ GlobalSearchSelectItem(String str, String str2, String str3, SearchOrigin searchOrigin, String str4, Integer num, Integer num2, TapTarget tapTarget, int i) {
        this(str, str2, str3, searchOrigin, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : "ACTIVITY", (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, tapTarget, null);
    }
}
