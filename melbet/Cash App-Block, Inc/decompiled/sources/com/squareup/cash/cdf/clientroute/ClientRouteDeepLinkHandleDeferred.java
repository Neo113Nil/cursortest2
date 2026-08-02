package com.squareup.cash.cdf.clientroute;

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
public final class ClientRouteDeepLinkHandleDeferred implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String appsflyer_id;
    public final String is_suceessful;
    public final LinkedHashMap parameters;
    public final String source;
    public final String url;

    public ClientRouteDeepLinkHandleDeferred(String str, String str2, String str3, String str4) {
        this.url = str;
        this.source = str2;
        this.is_suceessful = str3;
        this.appsflyer_id = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "ClientRoute", "cdf_action", "DeepLink");
        Countries.putSafe(m, "url", str);
        Countries.putSafe(m, "source", str2);
        Countries.putSafe(m, "is_suceessful", str3);
        Countries.putSafe(m, "appsflyer_id", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRouteDeepLinkHandleDeferred)) {
            return false;
        }
        ClientRouteDeepLinkHandleDeferred clientRouteDeepLinkHandleDeferred = (ClientRouteDeepLinkHandleDeferred) obj;
        return Intrinsics.areEqual(this.url, clientRouteDeepLinkHandleDeferred.url) && Intrinsics.areEqual(this.source, clientRouteDeepLinkHandleDeferred.source) && Intrinsics.areEqual(this.is_suceessful, clientRouteDeepLinkHandleDeferred.is_suceessful) && Intrinsics.areEqual(this.appsflyer_id, clientRouteDeepLinkHandleDeferred.appsflyer_id);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ClientRoute DeepLink HandleDeferred";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.is_suceessful;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appsflyer_id;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRouteDeepLinkHandleDeferred(url=", this.url, ", source=", this.source, ", is_suceessful="), this.is_suceessful, ", appsflyer_id=", this.appsflyer_id, ")");
    }
}
