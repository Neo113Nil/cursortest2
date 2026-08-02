package com.squareup.cash.cdf.localclient;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LocalClientCartMenuItemAddFailure implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String combo_slot_selections;
    public final Boolean is_combo_item;
    public final Boolean is_combo_slot_item;
    public final String item_token;
    public final LinkedHashMap parameters;

    public LocalClientCartMenuItemAddFailure(Boolean bool, Boolean bool2, String str, String str2) {
        this.item_token = str;
        this.is_combo_item = bool;
        this.is_combo_slot_item = bool2;
        this.combo_slot_selections = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "LocalClient", "cdf_action", "Cart");
        Countries.putSafe(m, "error_message", "missing_selections");
        Countries.putSafe(m, "item_token", str);
        Countries.putSafe(m, "is_combo_item", bool);
        Countries.putSafe(m, "is_combo_slot_item", bool2);
        Countries.putSafe(m, "combo_slot_selections", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCartMenuItemAddFailure)) {
            return false;
        }
        LocalClientCartMenuItemAddFailure localClientCartMenuItemAddFailure = (LocalClientCartMenuItemAddFailure) obj;
        return Intrinsics.areEqual(this.item_token, localClientCartMenuItemAddFailure.item_token) && this.is_combo_item.equals(localClientCartMenuItemAddFailure.is_combo_item) && this.is_combo_slot_item.equals(localClientCartMenuItemAddFailure.is_combo_slot_item) && Intrinsics.areEqual(this.combo_slot_selections, localClientCartMenuItemAddFailure.combo_slot_selections);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient Cart MenuItemAddFailure";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int i = (-1865230112) * 31;
        String str = this.item_token;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_combo_slot_item, ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_combo_item, (i + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.combo_slot_selections;
        return m + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.is_combo_item, "LocalClientCartMenuItemAddFailure(error_message=missing_selections, item_token=", this.item_token, ", is_combo_item=", ", is_combo_slot_item=");
        m.append(this.is_combo_slot_item);
        m.append(", combo_slot_selections=");
        m.append(this.combo_slot_selections);
        m.append(")");
        return m.toString();
    }
}
