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
public final class OffersSelectAfterpayContinue implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final LinkedHashMap parameters;
    public final String search_flow_token;
    public final String shop_flow_token;

    public OffersSelectAfterpayContinue(String str, String str2, String str3, String str4) {
        Screen screen = Screen.AP_APPLET_HOME;
        this.shop_flow_token = str;
        this.search_flow_token = str2;
        this.business_token = str3;
        this.business_name = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 9, "Offers", "cdf_action", "SelectAfterpay");
        Countries.putSafe(m, "shop_flow_token", str);
        Countries.putSafe(m, "search_flow_token", str2);
        Countries.putSafe(m, "business_token", str3);
        Countries.putSafe(m, "business_name", str4);
        Countries.putSafe(m, "from_screen", screen);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSelectAfterpayContinue)) {
            return false;
        }
        OffersSelectAfterpayContinue offersSelectAfterpayContinue = (OffersSelectAfterpayContinue) obj;
        if (!Intrinsics.areEqual(this.shop_flow_token, offersSelectAfterpayContinue.shop_flow_token) || !Intrinsics.areEqual(this.search_flow_token, offersSelectAfterpayContinue.search_flow_token) || !Intrinsics.areEqual(this.business_token, offersSelectAfterpayContinue.business_token) || !Intrinsics.areEqual(this.business_name, offersSelectAfterpayContinue.business_name)) {
            return false;
        }
        Screen screen = Screen.OFFERS_HOME_V2;
        return true;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers SelectAfterpay Continue";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.shop_flow_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.search_flow_token;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.business_token;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.business_name;
        return (Screen.AP_APPLET_HOME.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31;
    }

    public final String toString() {
        Screen screen = Screen.AP_APPLET_HOME;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersSelectAfterpayContinue(shop_flow_token=", this.shop_flow_token, ", search_flow_token=", this.search_flow_token, ", referrer_flow_token=null, business_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.business_token, ", business_name=", this.business_name, ", from_screen=");
        m.append(screen);
        m.append(", from_section=null)");
        return m.toString();
    }
}
