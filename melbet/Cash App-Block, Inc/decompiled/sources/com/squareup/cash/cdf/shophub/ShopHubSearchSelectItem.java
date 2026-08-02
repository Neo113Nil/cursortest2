package com.squareup.cash.cdf.shophub;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ShopHubSearchSelectItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String entity_attributes;
    public final String entity_token;
    public final Integer item_index_col;
    public final Integer item_index_row;
    public final Integer item_total_count;
    public final String merchant_tags;
    public final LinkedHashMap parameters;
    public final String query_token;
    public final String referrer_flow_token;
    public final String remote_suggestion_generation_id;
    public final String search_flow_token;
    public final Integer section_index_row;
    public final String section_name;
    public final String shop_flow_token;

    public ShopHubSearchSelectItem(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, String str7, String str8, String str9) {
        Origin origin = Origin.SHOP_HUB_PRODUCTS_SEARCH;
        str.getClass();
        this.shop_flow_token = str;
        this.search_flow_token = str2;
        this.entity_token = str3;
        this.entity_attributes = str4;
        this.section_name = str5;
        this.section_index_row = num;
        this.item_index_row = num2;
        this.item_index_col = num3;
        this.item_total_count = num4;
        this.remote_suggestion_generation_id = str6;
        this.referrer_flow_token = str7;
        this.query_token = str8;
        this.merchant_tags = str9;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 21, "ShopHub", "cdf_action", "Search");
        Countries.putSafe(m, "shop_flow_token", str);
        Countries.putSafe(m, "search_flow_token", str2);
        Countries.putSafe(m, "entity_token", str3);
        Countries.putSafe(m, "entity_attributes", str4);
        Countries.putSafe(m, "section_name", str5);
        Countries.putSafe(m, "section_index_row", num);
        Countries.putSafe(m, "section_index_col", 0);
        Countries.putSafe(m, "item_index_row", num2);
        Countries.putSafe(m, "item_index_col", num3);
        Countries.putSafe(m, "item_total_count", num4);
        Countries.putSafe(m, "remote_suggestion_generation_id", str6);
        Countries.putSafe(m, "referrer_flow_token", str7);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "query_token", str8);
        Countries.putSafe(m, "merchant_tags", str9);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 0;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ShopHubSearchSelectItem) {
            ShopHubSearchSelectItem shopHubSearchSelectItem = (ShopHubSearchSelectItem) obj;
            if (Intrinsics.areEqual(this.shop_flow_token, shopHubSearchSelectItem.shop_flow_token) && Intrinsics.areEqual(this.search_flow_token, shopHubSearchSelectItem.search_flow_token) && Intrinsics.areEqual(this.entity_token, shopHubSearchSelectItem.entity_token) && Intrinsics.areEqual(this.entity_attributes, shopHubSearchSelectItem.entity_attributes) && this.section_name.equals(shopHubSearchSelectItem.section_name) && Intrinsics.areEqual(this.section_index_row, shopHubSearchSelectItem.section_index_row) && obj2.equals(obj2) && Intrinsics.areEqual(this.item_index_row, shopHubSearchSelectItem.item_index_row) && Intrinsics.areEqual(this.item_index_col, shopHubSearchSelectItem.item_index_col) && Intrinsics.areEqual(this.item_total_count, shopHubSearchSelectItem.item_total_count) && Intrinsics.areEqual(this.remote_suggestion_generation_id, shopHubSearchSelectItem.remote_suggestion_generation_id) && Intrinsics.areEqual(this.referrer_flow_token, shopHubSearchSelectItem.referrer_flow_token)) {
                Origin origin = Origin.SHOP_HUB_PRODUCTS_SEARCH;
                if (Intrinsics.areEqual(this.query_token, shopHubSearchSelectItem.query_token) && Intrinsics.areEqual(this.merchant_tags, shopHubSearchSelectItem.merchant_tags)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ShopHub Search SelectItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.shop_flow_token.hashCode() * 31;
        String str = this.search_flow_token;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entity_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entity_attributes;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 961, 31, this.section_name);
        Integer num = this.section_index_row;
        int hashCode4 = (m + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = 0;
        int hashCode5 = (num2.hashCode() + hashCode4) * 31;
        Integer num3 = this.item_index_row;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.item_index_col;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.item_total_count;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 961;
        String str4 = this.remote_suggestion_generation_id;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.referrer_flow_token;
        int hashCode10 = (Origin.SHOP_HUB_PRODUCTS_SEARCH.hashCode() + ((hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.query_token;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.merchant_tags;
        return (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 961;
    }

    public final String toString() {
        Origin origin = Origin.SHOP_HUB_PRODUCTS_SEARCH;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShopHubSearchSelectItem(shop_flow_token=", this.shop_flow_token, ", search_flow_token=", this.search_flow_token, ", entity_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.entity_token, ", entity_attributes=", this.entity_attributes, ", suggestion_id=null, section_name=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.section_name, ", section_index_row=", this.section_index_row, ", section_index_col=");
        NavAction$$ExternalSyntheticOutline0.m(m, (Integer) 0, ", item_index_row=", this.item_index_row, ", item_index_col=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.item_index_col, ", item_total_count=", this.item_total_count, ", search_text=null, remote_suggestion_generation_id=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.remote_suggestion_generation_id, ", referrer_flow_token=", this.referrer_flow_token, ", origin=");
        m.append(origin);
        m.append(", query_token=");
        m.append(this.query_token);
        m.append(", merchant_tags=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.merchant_tags, ", offer_type=null, search_origin=null)");
    }
}
