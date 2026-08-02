package com.squareup.cash.cdf.browser;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.BreadcrumbHelper;
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
public final class BrowserNavigateNavigationFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String business_name;
    public final String business_token;
    public final String entity_name;
    public final String entity_token;
    public final EntityType entity_type;
    public final String error;
    public final InfoContext info_context;
    public final Boolean is_initial_navigation;
    public final Boolean is_main_frame;
    public final String navigation_id;
    public final BrowserOrigin origin;
    public final LinkedHashMap parameters;
    public final String shop_flow_token;
    public final Integer status_code;
    public final String url;

    public BrowserNavigateNavigationFailed(String str, String str2, EntityType entityType, Boolean bool, String str3, String str4, String str5, String str6, String str7, Integer num, InfoContext infoContext, BrowserOrigin browserOrigin, String str8, Boolean bool2) {
        this.entity_token = str;
        this.entity_name = str2;
        this.entity_type = entityType;
        this.is_initial_navigation = bool;
        this.shop_flow_token = str3;
        this.url = str4;
        this.business_token = str5;
        this.business_name = str6;
        this.error = str7;
        this.status_code = num;
        this.info_context = infoContext;
        this.origin = browserOrigin;
        this.navigation_id = str8;
        this.is_main_frame = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 18, "Browser", "cdf_action", "Navigate");
        Countries.putSafe(m, "entity_token", str);
        Countries.putSafe(m, "entity_name", str2);
        Countries.putSafe(m, "entity_type", entityType);
        Countries.putSafe(m, "is_initial_navigation", bool);
        Countries.putSafe(m, "shop_flow_token", str3);
        Countries.putSafe(m, "url", str4);
        Countries.putSafe(m, "business_token", str5);
        Countries.putSafe(m, "business_name", str6);
        Countries.putSafe(m, BreadcrumbHelper.Category.ERROR, str7);
        Countries.putSafe(m, "status_code", num);
        Countries.putSafe(m, "info_context", infoContext);
        Countries.putSafe(m, "origin", browserOrigin);
        Countries.putSafe(m, "navigation_id", str8);
        Countries.putSafe(m, "is_main_frame", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrowserNavigateNavigationFailed)) {
            return false;
        }
        BrowserNavigateNavigationFailed browserNavigateNavigationFailed = (BrowserNavigateNavigationFailed) obj;
        return Intrinsics.areEqual(this.entity_token, browserNavigateNavigationFailed.entity_token) && Intrinsics.areEqual(this.entity_name, browserNavigateNavigationFailed.entity_name) && this.entity_type == browserNavigateNavigationFailed.entity_type && this.is_initial_navigation.equals(browserNavigateNavigationFailed.is_initial_navigation) && Intrinsics.areEqual(this.shop_flow_token, browserNavigateNavigationFailed.shop_flow_token) && Intrinsics.areEqual(this.url, browserNavigateNavigationFailed.url) && Intrinsics.areEqual(this.business_token, browserNavigateNavigationFailed.business_token) && Intrinsics.areEqual(this.business_name, browserNavigateNavigationFailed.business_name) && Intrinsics.areEqual(this.error, browserNavigateNavigationFailed.error) && Intrinsics.areEqual(this.status_code, browserNavigateNavigationFailed.status_code) && this.info_context == browserNavigateNavigationFailed.info_context && this.origin == browserNavigateNavigationFailed.origin && Intrinsics.areEqual(this.navigation_id, browserNavigateNavigationFailed.navigation_id) && this.is_main_frame.equals(browserNavigateNavigationFailed.is_main_frame);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Browser Navigate NavigationFailed";
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
        int hashCode3 = (m + (str3 == null ? 0 : str3.hashCode())) * 961;
        String str4 = this.url;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.business_token;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.business_name;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.error;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.status_code;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        InfoContext infoContext = this.info_context;
        int hashCode9 = (hashCode8 + (infoContext == null ? 0 : infoContext.hashCode())) * 31;
        BrowserOrigin browserOrigin = this.origin;
        int hashCode10 = (hashCode9 + (browserOrigin == null ? 0 : browserOrigin.hashCode())) * 31;
        String str8 = this.navigation_id;
        return this.is_main_frame.hashCode() + ((hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrowserNavigateNavigationFailed(entity_token=", this.entity_token, ", entity_name=", this.entity_name, ", entity_type=");
        m.append(this.entity_type);
        m.append(", store_id=null, is_initial_navigation=");
        m.append(this.is_initial_navigation);
        m.append(", shop_flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.shop_flow_token, ", referrer_flow_token=null, url=", this.url, ", business_token=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.business_token, ", business_name=", this.business_name, ", error=");
        NavAction$$ExternalSyntheticOutline0.m(m, this.error, ", status_code=", this.status_code, ", info_context=");
        m.append(this.info_context);
        m.append(", origin=");
        m.append(this.origin);
        m.append(", navigation_id=");
        m.append(this.navigation_id);
        m.append(", is_main_frame=");
        m.append(this.is_main_frame);
        m.append(")");
        return m.toString();
    }
}
