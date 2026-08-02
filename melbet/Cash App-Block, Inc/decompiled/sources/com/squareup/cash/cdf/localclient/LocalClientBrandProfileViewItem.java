package com.squareup.cash.cdf.localclient;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class LocalClientBrandProfileViewItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final String buyer_token;
    public final String checkout_flow_token;
    public final String discount_ids;
    public final Boolean is_combo_item;
    public final Boolean is_combo_slot_item;
    public final String item_token;
    public final String location_token;
    public final LinkedHashMap parameters;
    public final String parent_combo_item_token;

    public LocalClientBrandProfileViewItem(String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, int i) {
        str6 = (i & 256) != 0 ? null : str6;
        this.brand_token = str;
        this.location_token = str2;
        this.buyer_token = str3;
        this.checkout_flow_token = str4;
        this.item_token = str5;
        this.is_combo_item = bool;
        this.is_combo_slot_item = bool2;
        this.parent_combo_item_token = str6;
        this.discount_ids = str7;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "LocalClient", "cdf_action", "BrandProfile");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "location_token", str2);
        Countries.putSafe(m, "buyer_token", str3);
        Countries.putSafe(m, "checkout_flow_token", str4);
        Countries.putSafe(m, "item_token", str5);
        Countries.putSafe(m, "is_combo_item", bool);
        Countries.putSafe(m, "is_combo_slot_item", bool2);
        Countries.putSafe(m, "parent_combo_item_token", str6);
        Countries.putSafe(m, "discount_ids", str7);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientBrandProfileViewItem)) {
            return false;
        }
        LocalClientBrandProfileViewItem localClientBrandProfileViewItem = (LocalClientBrandProfileViewItem) obj;
        return Intrinsics.areEqual(this.brand_token, localClientBrandProfileViewItem.brand_token) && Intrinsics.areEqual(this.location_token, localClientBrandProfileViewItem.location_token) && Intrinsics.areEqual(this.buyer_token, localClientBrandProfileViewItem.buyer_token) && Intrinsics.areEqual(this.checkout_flow_token, localClientBrandProfileViewItem.checkout_flow_token) && Intrinsics.areEqual(this.item_token, localClientBrandProfileViewItem.item_token) && this.is_combo_item.equals(localClientBrandProfileViewItem.is_combo_item) && this.is_combo_slot_item.equals(localClientBrandProfileViewItem.is_combo_slot_item) && Intrinsics.areEqual(this.parent_combo_item_token, localClientBrandProfileViewItem.parent_combo_item_token) && Intrinsics.areEqual(this.discount_ids, localClientBrandProfileViewItem.discount_ids);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient BrandProfile ViewItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.location_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.buyer_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.checkout_flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.item_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_combo_slot_item, ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_combo_item, (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31);
        String str6 = this.parent_combo_item_token;
        int hashCode5 = (m + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.discount_ids;
        return hashCode5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientBrandProfileViewItem(brand_token=", this.brand_token, ", location_token=", this.location_token, ", anonymous_buyer_token=null, buyer_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.buyer_token, ", checkout_flow_token=", this.checkout_flow_token, ", item_token=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.item_token, ", is_combo_item=", this.is_combo_item, ", is_combo_slot_item=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.is_combo_slot_item, ", parent_combo_item_token=", this.parent_combo_item_token, ", discount_ids=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.discount_ids, ")");
    }
}
