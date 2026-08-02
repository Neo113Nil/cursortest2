package com.squareup.cash.cdf.moneybothome;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
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
public final class MoneybotHomeBrowseSelectItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String home_session_id;
    public final String item_category;
    public final String item_id;
    public final HomeItemType item_type;
    public final LinkedHashMap parameters;
    public final TapElement tap_element;

    public MoneybotHomeBrowseSelectItem(String str, HomeItemType homeItemType, String str2, String str3, TapElement tapElement) {
        this.home_session_id = str;
        this.item_type = homeItemType;
        this.item_id = str2;
        this.item_category = str3;
        this.tap_element = tapElement;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "MoneybotHome", "cdf_action", "Browse");
        Countries.putSafe(m, "home_session_id", str);
        Countries.putSafe(m, "item_type", homeItemType);
        Countries.putSafe(m, "item_id", str2);
        Countries.putSafe(m, "item_category", str3);
        Countries.putSafe(m, "tap_element", tapElement);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotHomeBrowseSelectItem)) {
            return false;
        }
        MoneybotHomeBrowseSelectItem moneybotHomeBrowseSelectItem = (MoneybotHomeBrowseSelectItem) obj;
        return this.home_session_id.equals(moneybotHomeBrowseSelectItem.home_session_id) && this.item_type == moneybotHomeBrowseSelectItem.item_type && Intrinsics.areEqual(this.item_id, moneybotHomeBrowseSelectItem.item_id) && Intrinsics.areEqual(this.item_category, moneybotHomeBrowseSelectItem.item_category) && this.tap_element == moneybotHomeBrowseSelectItem.tap_element;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "MoneybotHome Browse SelectItem";
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
        return this.tap_element.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoneybotHomeBrowseSelectItem(home_session_id=");
        sb.append(this.home_session_id);
        sb.append(", item_type=");
        sb.append(this.item_type);
        sb.append(", item_id=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.item_id, ", item_category=", this.item_category, ", tap_element=");
        sb.append(this.tap_element);
        sb.append(")");
        return sb.toString();
    }
}
