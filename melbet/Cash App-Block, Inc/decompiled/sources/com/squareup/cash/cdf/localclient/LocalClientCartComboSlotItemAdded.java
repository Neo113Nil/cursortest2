package com.squareup.cash.cdf.localclient;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class LocalClientCartComboSlotItemAdded implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final String buyer_token;
    public final String checkout_flow_token;
    public final String combo_item_token;
    public final String location_token;
    public final String menu_item_modifier_labels;
    public final String menu_item_modifier_tokens;
    public final String menu_item_token;
    public final String menu_item_variation_name;
    public final String menu_item_variation_token;
    public final LinkedHashMap parameters;

    public LocalClientCartComboSlotItemAdded(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.combo_item_token = str;
        this.brand_token = str2;
        this.buyer_token = str3;
        this.location_token = str4;
        this.menu_item_token = str5;
        this.menu_item_variation_token = str6;
        this.menu_item_variation_name = str7;
        this.menu_item_modifier_tokens = str8;
        this.menu_item_modifier_labels = str9;
        this.checkout_flow_token = str10;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "LocalClient", "cdf_action", "Cart");
        Countries.putSafe(m, "combo_item_token", str);
        Countries.putSafe(m, "brand_token", str2);
        Countries.putSafe(m, "buyer_token", str3);
        Countries.putSafe(m, "location_token", str4);
        Countries.putSafe(m, "menu_item_token", str5);
        Countries.putSafe(m, "menu_item_variation_token", str6);
        Countries.putSafe(m, "menu_item_variation_name", str7);
        Countries.putSafe(m, "menu_item_modifier_tokens", str8);
        Countries.putSafe(m, "menu_item_modifier_labels", str9);
        Countries.putSafe(m, "checkout_flow_token", str10);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCartComboSlotItemAdded)) {
            return false;
        }
        LocalClientCartComboSlotItemAdded localClientCartComboSlotItemAdded = (LocalClientCartComboSlotItemAdded) obj;
        return Intrinsics.areEqual(this.combo_item_token, localClientCartComboSlotItemAdded.combo_item_token) && Intrinsics.areEqual(this.brand_token, localClientCartComboSlotItemAdded.brand_token) && Intrinsics.areEqual(this.buyer_token, localClientCartComboSlotItemAdded.buyer_token) && Intrinsics.areEqual(this.location_token, localClientCartComboSlotItemAdded.location_token) && Intrinsics.areEqual(this.menu_item_token, localClientCartComboSlotItemAdded.menu_item_token) && Intrinsics.areEqual(this.menu_item_variation_token, localClientCartComboSlotItemAdded.menu_item_variation_token) && Intrinsics.areEqual(this.menu_item_variation_name, localClientCartComboSlotItemAdded.menu_item_variation_name) && this.menu_item_modifier_tokens.equals(localClientCartComboSlotItemAdded.menu_item_modifier_tokens) && Intrinsics.areEqual(this.menu_item_modifier_labels, localClientCartComboSlotItemAdded.menu_item_modifier_labels) && Intrinsics.areEqual(this.checkout_flow_token, localClientCartComboSlotItemAdded.checkout_flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient Cart ComboSlotItemAdded";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.combo_item_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 961;
        String str2 = this.brand_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buyer_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.location_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.menu_item_token;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.menu_item_variation_token;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.menu_item_variation_name;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.menu_item_modifier_tokens);
        String str8 = this.menu_item_modifier_labels;
        int hashCode7 = (m + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.checkout_flow_token;
        return hashCode7 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientCartComboSlotItemAdded(combo_item_token=", this.combo_item_token, ", anonymous_buyer_token=null, brand_token=", this.brand_token, ", buyer_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.buyer_token, ", location_token=", this.location_token, ", menu_item_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.menu_item_token, ", menu_item_variation_token=", this.menu_item_variation_token, ", menu_item_variation_name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.menu_item_variation_name, ", menu_item_modifier_tokens=", this.menu_item_modifier_tokens, ", menu_item_modifier_labels=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.menu_item_modifier_labels, ", checkout_flow_token=", this.checkout_flow_token, ")");
    }
}
