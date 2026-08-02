package com.squareup.cash.cdf.browser;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.BrowserOrigin;
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
public final class BrowserNavigateNavigationFinished implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final String entity_name;
    public final String entity_token;
    public final EntityType entity_type;
    public final InfoContext info_context;
    public final Boolean is_initial_navigation;
    public final String navigation_id;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String referrer_flow_token;
    public final String shop_flow_token;
    public final Long total_time;
    public final String url;

    public BrowserNavigateNavigationFinished(String str, String str2, EntityType entityType, Boolean bool, String str3, String str4, String str5, String str6, String str7, Long l, InfoContext infoContext, BrowserOrigin browserOrigin, String str8) {
        this.entity_token = str;
        this.entity_name = str2;
        this.entity_type = entityType;
        this.is_initial_navigation = bool;
        this.shop_flow_token = str3;
        this.referrer_flow_token = str4;
        this.url = str5;
        this.business_token = str6;
        this.business_name = str7;
        this.total_time = l;
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.navigation_id = str8;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 16, "Browser", "cdf_action", "Navigate");
        Countries.putSafe(m, "entity_token", str);
        Countries.putSafe(m, "entity_name", str2);
        Countries.putSafe(m, "entity_type", entityType);
        Countries.putSafe(m, "is_initial_navigation", bool);
        Countries.putSafe(m, "shop_flow_token", str3);
        Countries.putSafe(m, "referrer_flow_token", str4);
        Countries.putSafe(m, "url", str5);
        Countries.putSafe(m, "business_token", str6);
        Countries.putSafe(m, "business_name", str7);
        Countries.putSafe(m, "total_time", l);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "navigation_id", str8);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserNavigateNavigationFinished)) {
            return false;
        }
        BrowserNavigateNavigationFinished browserNavigateNavigationFinished = (BrowserNavigateNavigationFinished) obj;
        return Intrinsics.areEqual(this.entity_token, browserNavigateNavigationFinished.entity_token) && Intrinsics.areEqual(this.entity_name, browserNavigateNavigationFinished.entity_name) && this.entity_type == browserNavigateNavigationFinished.entity_type && this.is_initial_navigation.equals(browserNavigateNavigationFinished.is_initial_navigation) && Intrinsics.areEqual(this.shop_flow_token, browserNavigateNavigationFinished.shop_flow_token) && Intrinsics.areEqual(this.referrer_flow_token, browserNavigateNavigationFinished.referrer_flow_token) && Intrinsics.areEqual(this.url, browserNavigateNavigationFinished.url) && Intrinsics.areEqual(this.business_token, browserNavigateNavigationFinished.business_token) && Intrinsics.areEqual(this.business_name, browserNavigateNavigationFinished.business_name) && this.total_time.equals(browserNavigateNavigationFinished.total_time) && this.info_context == browserNavigateNavigationFinished.info_context && this.origin == browserNavigateNavigationFinished.origin && Intrinsics.areEqual(this.navigation_id, browserNavigateNavigationFinished.navigation_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Navigate NavigationFinished";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.entity_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entity_name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EntityType entityType = this.entity_type;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_initial_navigation, (hashCode2 + (entityType == null ? 0 : entityType.hashCode())) * 961, 31);
        String str3 = this.shop_flow_token;
        int hashCode3 = (m + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.referrer_flow_token;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.business_token;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.business_name;
        int m2 = ViewEvent$State$EnumUnboxingLocalUtility.m(this.total_time, (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        InfoContext infoContext = this.info_context;
        int hashCode7 = (m2 + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode8 = (hashCode7 + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str8 = this.navigation_id;
        return hashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrowserNavigateNavigationFinished(entity_token=", this.entity_token, ", entity_name=", this.entity_name, ", entity_type=");
        m.append(this.entity_type);
        m.append(", store_id=null, is_initial_navigation=");
        m.append(this.is_initial_navigation);
        m.append(", shop_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.shop_flow_token, ", referrer_flow_token=", this.referrer_flow_token, ", url=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.url, ", business_token=", this.business_token, ", business_name=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.total_time, this.business_name, ", total_time=", ", info_context=", m);
        m.append(this.info_context);
        m.append(", origin=");
        m.append(this.origin);
        m.append(", navigation_id=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.navigation_id, ")");
    }
}
