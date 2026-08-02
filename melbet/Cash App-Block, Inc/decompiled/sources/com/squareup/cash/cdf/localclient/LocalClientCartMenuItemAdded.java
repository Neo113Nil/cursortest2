package com.squareup.cash.cdf.localclient;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
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
public final class LocalClientCartMenuItemAdded implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String brand_token;
    public final String buyer_token;
    public final String checkout_flow_token;
    public final String combo_slot_selections;
    public final String discount_ids;
    public final Boolean is_combo_item;
    public final String location_token;
    public final Long menu_item_category_index;
    public final String menu_item_category_token;
    public final Long menu_item_index;
    public final String menu_item_modifier_tokens;
    public final String menu_item_token;
    public final String menu_item_variation_token;
    public final LinkedHashMap parameters;
    public final Long quantity;
    public final Long reorderable_selection_index;
    public final ReorderableSelectionSource reorderable_selection_source;
    public final Long subtotal;

    public LocalClientCartMenuItemAdded(String str, String str2, String str3, String str4, Long l, String str5, Long l2, Long l3, ReorderableSelectionSource reorderableSelectionSource, String str6, String str7, Long l4, Long l5, String str8, Boolean bool, String str9, String str10) {
        this.brand_token = str;
        this.buyer_token = str2;
        this.location_token = str3;
        this.menu_item_token = str4;
        this.menu_item_index = l;
        this.menu_item_category_token = str5;
        this.menu_item_category_index = l2;
        this.reorderable_selection_index = l3;
        this.reorderable_selection_source = reorderableSelectionSource;
        this.menu_item_variation_token = str6;
        this.menu_item_modifier_tokens = str7;
        this.quantity = l4;
        this.subtotal = l5;
        this.checkout_flow_token = str8;
        this.is_combo_item = bool;
        this.combo_slot_selections = str9;
        this.discount_ids = str10;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 20, "LocalClient", "cdf_action", "Cart");
        Countries.putSafe(m, "brand_token", str);
        Countries.putSafe(m, "buyer_token", str2);
        Countries.putSafe(m, "location_token", str3);
        Countries.putSafe(m, "menu_item_token", str4);
        Countries.putSafe(m, "menu_item_index", l);
        Countries.putSafe(m, "menu_item_category_token", str5);
        Countries.putSafe(m, "menu_item_category_index", l2);
        Countries.putSafe(m, "reorderable_selection_index", l3);
        Countries.putSafe(m, "reorderable_selection_source", reorderableSelectionSource);
        Countries.putSafe(m, "menu_item_variation_token", str6);
        Countries.putSafe(m, "menu_item_modifier_tokens", str7);
        Countries.putSafe(m, "quantity", l4);
        Countries.putSafe(m, "subtotal", l5);
        Countries.putSafe(m, "checkout_flow_token", str8);
        Countries.putSafe(m, "is_combo_item", bool);
        Countries.putSafe(m, "combo_slot_selections", str9);
        Countries.putSafe(m, "discount_ids", str10);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCartMenuItemAdded)) {
            return false;
        }
        LocalClientCartMenuItemAdded localClientCartMenuItemAdded = (LocalClientCartMenuItemAdded) obj;
        return Intrinsics.areEqual(this.brand_token, localClientCartMenuItemAdded.brand_token) && this.buyer_token.equals(localClientCartMenuItemAdded.buyer_token) && Intrinsics.areEqual(this.location_token, localClientCartMenuItemAdded.location_token) && Intrinsics.areEqual(this.menu_item_token, localClientCartMenuItemAdded.menu_item_token) && Intrinsics.areEqual(this.menu_item_index, localClientCartMenuItemAdded.menu_item_index) && Intrinsics.areEqual(this.menu_item_category_token, localClientCartMenuItemAdded.menu_item_category_token) && Intrinsics.areEqual(this.menu_item_category_index, localClientCartMenuItemAdded.menu_item_category_index) && Intrinsics.areEqual(this.reorderable_selection_index, localClientCartMenuItemAdded.reorderable_selection_index) && this.reorderable_selection_source == localClientCartMenuItemAdded.reorderable_selection_source && Intrinsics.areEqual(this.menu_item_variation_token, localClientCartMenuItemAdded.menu_item_variation_token) && this.menu_item_modifier_tokens.equals(localClientCartMenuItemAdded.menu_item_modifier_tokens) && this.quantity.equals(localClientCartMenuItemAdded.quantity) && this.subtotal.equals(localClientCartMenuItemAdded.subtotal) && Intrinsics.areEqual(this.checkout_flow_token, localClientCartMenuItemAdded.checkout_flow_token) && this.is_combo_item.equals(localClientCartMenuItemAdded.is_combo_item) && Intrinsics.areEqual(this.combo_slot_selections, localClientCartMenuItemAdded.combo_slot_selections) && Intrinsics.areEqual(this.discount_ids, localClientCartMenuItemAdded.discount_ids);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient Cart MenuItemAdded";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.brand_token;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.buyer_token);
        String str2 = this.location_token;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.menu_item_token;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.menu_item_index;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.menu_item_category_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.menu_item_category_index;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.reorderable_selection_index;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        ReorderableSelectionSource reorderableSelectionSource = this.reorderable_selection_source;
        int hashCode7 = (hashCode6 + (reorderableSelectionSource == null ? 0 : reorderableSelectionSource.hashCode())) * 31;
        String str5 = this.menu_item_variation_token;
        int m2 = ViewEvent$State$EnumUnboxingLocalUtility.m(this.subtotal, ViewEvent$State$EnumUnboxingLocalUtility.m(this.quantity, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.menu_item_modifier_tokens), 31), 31);
        String str6 = this.checkout_flow_token;
        int m3 = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_combo_item, (m2 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        String str7 = this.combo_slot_selections;
        int hashCode8 = (m3 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.discount_ids;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientCartMenuItemAdded(anonymous_buyer_token=null, brand_token=", this.brand_token, ", buyer_token=", this.buyer_token, ", location_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.location_token, ", menu_item_token=", this.menu_item_token, ", menu_item_index=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.menu_item_index, ", menu_item_category_token=", this.menu_item_category_token, ", menu_item_category_index=", m);
        Thread$State$EnumUnboxingLocalUtility.m(m, this.menu_item_category_index, ", reorderable_selection_index=", this.reorderable_selection_index, ", reorderable_selection_source=");
        m.append(this.reorderable_selection_source);
        m.append(", menu_item_variation_token=");
        m.append(this.menu_item_variation_token);
        m.append(", menu_item_modifier_tokens=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.quantity, this.menu_item_modifier_tokens, ", quantity=", ", subtotal=", m);
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.subtotal, ", checkout_flow_token=", this.checkout_flow_token, ", is_combo_item=", m);
        Thread$State$EnumUnboxingLocalUtility.m(m, this.is_combo_item, ", combo_slot_selections=", this.combo_slot_selections, ", discount_ids=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.discount_ids, ")");
    }
}
