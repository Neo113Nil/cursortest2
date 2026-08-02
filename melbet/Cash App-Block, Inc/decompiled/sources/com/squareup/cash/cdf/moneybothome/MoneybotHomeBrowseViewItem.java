package com.squareup.cash.cdf.moneybothome;

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
public final class MoneybotHomeBrowseViewItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String home_session_id;
    public final String item_category;
    public final String item_id;
    public final HomeItemType item_type;
    public final LinkedHashMap parameters;

    public MoneybotHomeBrowseViewItem(String str, HomeItemType homeItemType, String str2, String str3) {
        this.home_session_id = str;
        this.item_type = homeItemType;
        this.item_id = str2;
        this.item_category = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "MoneybotHome", "cdf_action", "Browse");
        Countries.putSafe(m, "home_session_id", str);
        Countries.putSafe(m, "item_type", homeItemType);
        Countries.putSafe(m, "item_id", str2);
        Countries.putSafe(m, "item_category", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotHomeBrowseViewItem)) {
            return false;
        }
        MoneybotHomeBrowseViewItem moneybotHomeBrowseViewItem = (MoneybotHomeBrowseViewItem) obj;
        return this.home_session_id.equals(moneybotHomeBrowseViewItem.home_session_id) && this.item_type == moneybotHomeBrowseViewItem.item_type && Intrinsics.areEqual(this.item_id, moneybotHomeBrowseViewItem.item_id) && Intrinsics.areEqual(this.item_category, moneybotHomeBrowseViewItem.item_category);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MoneybotHome Browse ViewItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = (this.item_type.hashCode() + (this.home_session_id.hashCode() * 31)) * 31;
        String str = this.item_id;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.item_category;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneybotHomeBrowseViewItem(home_session_id=");
        sb.append(this.home_session_id);
        sb.append(", item_type=");
        sb.append(this.item_type);
        sb.append(", item_id=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.item_id, ", item_category=", this.item_category, ")");
    }
}
