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
public final class ShopHubSearchViewItem implements Event {
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

    public ShopHubSearchViewItem(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, String str7, String str8, String str9) {
        Origin origin = Origin.SHOP_HUB_PRODUCTS_SEARCH;
        str.getClass();
        str2.getClass();
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
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 22, "ShopHub", "cdf_action", "Search");
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
        if (obj instanceof ShopHubSearchViewItem) {
            ShopHubSearchViewItem shopHubSearchViewItem = (ShopHubSearchViewItem) obj;
            if (Intrinsics.areEqual(this.shop_flow_token, shopHubSearchViewItem.shop_flow_token) && Intrinsics.areEqual(this.search_flow_token, shopHubSearchViewItem.search_flow_token) && Intrinsics.areEqual(this.entity_token, shopHubSearchViewItem.entity_token) && Intrinsics.areEqual(this.entity_attributes, shopHubSearchViewItem.entity_attributes) && this.section_name.equals(shopHubSearchViewItem.section_name) && Intrinsics.areEqual(this.section_index_row, shopHubSearchViewItem.section_index_row) && obj2.equals(obj2) && Intrinsics.areEqual(this.item_index_row, shopHubSearchViewItem.item_index_row) && Intrinsics.areEqual(this.item_index_col, shopHubSearchViewItem.item_index_col) && Intrinsics.areEqual(this.item_total_count, shopHubSearchViewItem.item_total_count) && Intrinsics.areEqual(this.remote_suggestion_generation_id, shopHubSearchViewItem.remote_suggestion_generation_id) && Intrinsics.areEqual(this.referrer_flow_token, shopHubSearchViewItem.referrer_flow_token)) {
                Origin origin = Origin.SHOP_HUB_PRODUCTS_SEARCH;
                if (Intrinsics.areEqual(this.query_token, shopHubSearchViewItem.query_token) && Intrinsics.areEqual(this.merchant_tags, shopHubSearchViewItem.merchant_tags)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ShopHub Search ViewItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.shop_flow_token.hashCode() * 31, 31, this.search_flow_token);
        String str = this.entity_token;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entity_attributes;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 961, 31, this.section_name);
        Integer num = this.section_index_row;
        int hashCode2 = (m2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = 0;
        int hashCode3 = (num2.hashCode() + hashCode2) * 31;
        Integer num3 = this.item_index_row;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.item_index_col;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.item_total_count;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 961;
        String str3 = this.remote_suggestion_generation_id;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.referrer_flow_token;
        int hashCode8 = (Origin.SHOP_HUB_PRODUCTS_SEARCH.hashCode() + ((hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        String str5 = this.query_token;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.merchant_tags;
        return (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 29791;
    }

    public final String toString() {
        Origin origin = Origin.SHOP_HUB_PRODUCTS_SEARCH;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ShopHubSearchViewItem(shop_flow_token=", this.shop_flow_token, ", search_flow_token=", this.search_flow_token, ", entity_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.entity_token, ", entity_attributes=", this.entity_attributes, ", suggestion_id=null, section_name=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.section_name, ", section_index_row=", this.section_index_row, ", section_index_col=");
        NavAction$$ExternalSyntheticOutline0.m(m, (Integer) 0, ", item_index_row=", this.item_index_row, ", item_index_col=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.item_index_col, ", item_total_count=", this.item_total_count, ", search_text=null, remote_suggestion_generation_id=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.remote_suggestion_generation_id, ", referrer_flow_token=", this.referrer_flow_token, ", origin=");
        m.append(origin);
        m.append(", query_token=");
        m.append(this.query_token);
        m.append(", merchant_tags=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.merchant_tags, ", offer_type=null, item_name=null, search_origin=null)");
    }
}
