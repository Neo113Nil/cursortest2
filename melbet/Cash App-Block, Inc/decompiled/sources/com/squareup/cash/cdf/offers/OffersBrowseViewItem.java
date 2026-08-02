package com.squareup.cash.cdf.offers;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
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
public final class OffersBrowseViewItem implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.BRAZE, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final Integer item_index_row;
    public final String offer_name;
    public final String offer_token;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String section_id;
    public final Integer section_index_row;

    public OffersBrowseViewItem(String str, String str2, Integer num, Integer num2, String str3, String str4, String str5, String str6) {
        Screen screen = Screen.OFFERS_HOME_V2;
        this.referrer_flow_token = str;
        this.section_id = str2;
        this.section_index_row = num;
        this.item_index_row = num2;
        this.business_token = str3;
        this.business_name = str4;
        this.offer_token = str5;
        this.offer_name = str6;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 30, "Offers", "cdf_action", "Browse");
        Countries.putSafe(m, "screen", screen);
        Countries.putSafe(m, "referrer_flow_token", str);
        Countries.putSafe(m, "section_id", str2);
        Countries.putSafe(m, "section_index_row", num);
        Countries.putSafe(m, "item_index_row", num2);
        Countries.putSafe(m, "business_token", str3);
        Countries.putSafe(m, "business_name", str4);
        Countries.putSafe(m, "offer_token", str5);
        Countries.putSafe(m, "offer_name", str6);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersBrowseViewItem)) {
            return false;
        }
        OffersBrowseViewItem offersBrowseViewItem = (OffersBrowseViewItem) obj;
        Screen screen = Screen.OFFERS_HOME_V2;
        return Intrinsics.areEqual(this.referrer_flow_token, offersBrowseViewItem.referrer_flow_token) && this.section_id.equals(offersBrowseViewItem.section_id) && this.section_index_row.equals(offersBrowseViewItem.section_index_row) && this.item_index_row.equals(offersBrowseViewItem.item_index_row) && Intrinsics.areEqual(this.business_token, offersBrowseViewItem.business_token) && Intrinsics.areEqual(this.business_name, offersBrowseViewItem.business_name) && Intrinsics.areEqual(this.offer_token, offersBrowseViewItem.offer_token) && Intrinsics.areEqual(this.offer_name, offersBrowseViewItem.offer_name);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers Browse ViewItem";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = Screen.OFFERS_HOME_V2.hashCode() * 923521;
        String str = this.referrer_flow_token;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 29791, 31, this.section_id), 923521, this.section_index_row), 887503681, this.item_index_row);
        String str2 = this.business_token;
        int hashCode2 = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.business_name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.offer_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.offer_name;
        return (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 28629151;
    }

    public final String toString() {
        Screen screen = Screen.OFFERS_HOME_V2;
        StringBuilder sb = new StringBuilder("OffersBrowseViewItem(screen=");
        sb.append(screen);
        sb.append(", shop_flow_token=null, browse_flow_token=null, origin=null, referrer_flow_token=");
        sb.append(this.referrer_flow_token);
        sb.append(", marketing_source=null, marketing_utm=null, section_id=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.section_id, ", section_index_row=", this.section_index_row, ", section_index_column=null, section_item_count=null, section_name=null, item_index_row=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.item_index_row, ", item_index_column=null, title_text=null, subtitle_text=null, search_filter_token=null, search_filter_name=null, business_token=", this.business_token, ", business_name=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.business_name, ", afterpay_feature=null, offer_token=", this.offer_token, ", offer_name=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.offer_name, ", offer_type=null, offer_payment_method=null, offer_channel=null, offer_category_token=null, offer_details=null)");
    }
}
