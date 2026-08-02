package com.squareup.cash.cdf.offers;

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
public final class OffersViewSelectAfterpaySheet implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final LinkedHashMap parameters;
    public final String search_flow_token;
    public final String shop_flow_token;

    public OffersViewSelectAfterpaySheet(String str, String str2, String str3, String str4) {
        Origin origin = Origin.AFTERPAY_APPLET;
        Screen screen = Screen.AP_APPLET_HOME;
        AfterpayFeature afterpayFeature = AfterpayFeature.IN_NETWORK;
        this.shop_flow_token = str;
        this.search_flow_token = str2;
        this.business_token = str3;
        this.business_name = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 12, "Offers", "cdf_action", "View");
        Countries.putSafe(m, "shop_flow_token", str);
        Countries.putSafe(m, "search_flow_token", str2);
        Countries.putSafe(m, "business_token", str3);
        Countries.putSafe(m, "business_name", str4);
        Countries.putSafe(m, "origin", origin);
        Countries.putSafe(m, "from_screen", screen);
        Countries.putSafe(m, "afterpay_feature", afterpayFeature);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersViewSelectAfterpaySheet)) {
            return false;
        }
        OffersViewSelectAfterpaySheet offersViewSelectAfterpaySheet = (OffersViewSelectAfterpaySheet) obj;
        if (!Intrinsics.areEqual(this.shop_flow_token, offersViewSelectAfterpaySheet.shop_flow_token) || !Intrinsics.areEqual(this.search_flow_token, offersViewSelectAfterpaySheet.search_flow_token) || !Intrinsics.areEqual(this.business_token, offersViewSelectAfterpaySheet.business_token) || !Intrinsics.areEqual(this.business_name, offersViewSelectAfterpaySheet.business_name)) {
            return false;
        }
        Origin origin = Origin.DISCO;
        Screen screen = Screen.OFFERS_HOME_V2;
        AfterpayFeature afterpayFeature = AfterpayFeature.IN_NETWORK;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers View SelectAfterpaySheet";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.shop_flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.search_flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 29791;
        String str3 = this.business_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.business_name;
        return AfterpayFeature.IN_NETWORK.hashCode() + ((Screen.AP_APPLET_HOME.hashCode() + ((Origin.AFTERPAY_APPLET.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31)) * 961);
    }

    public final String toString() {
        Origin origin = Origin.AFTERPAY_APPLET;
        Screen screen = Screen.AP_APPLET_HOME;
        AfterpayFeature afterpayFeature = AfterpayFeature.IN_NETWORK;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersViewSelectAfterpaySheet(shop_flow_token=", this.shop_flow_token, ", search_flow_token=", this.search_flow_token, ", browser_session_token=null, referrer_flow_token=null, business_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.business_token, ", business_name=", this.business_name, ", origin=");
        m.append(origin);
        m.append(", from_screen=");
        m.append(screen);
        m.append(", from_section=null, afterpay_feature=");
        m.append(afterpayFeature);
        m.append(")");
        return m.toString();
    }
}
