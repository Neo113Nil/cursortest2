package com.squareup.cash.cdf.clientroute;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class ClientRouteDeepLinkLaunch implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String source;
    public final String url;

    public ClientRouteDeepLinkLaunch(String str, String str2) {
        Boolean bool = Boolean.TRUE;
        this.url = str;
        this.source = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "ClientRoute", "cdf_action", "DeepLink");
        Countries.putSafe(m, "url", str);
        Countries.putSafe(m, "source", str2);
        Countries.putSafe(m, "can_open", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRouteDeepLinkLaunch)) {
            return false;
        }
        ClientRouteDeepLinkLaunch clientRouteDeepLinkLaunch = (ClientRouteDeepLinkLaunch) obj;
        if (!Intrinsics.areEqual(this.url, clientRouteDeepLinkLaunch.url) || !Intrinsics.areEqual(this.source, clientRouteDeepLinkLaunch.source)) {
            return false;
        }
        Object obj2 = Boolean.TRUE;
        return obj2.equals(obj2);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ClientRoute DeepLink Launch";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        return Boolean.TRUE.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRouteDeepLinkLaunch(url=", this.url, ", source=", this.source, ", can_open="), Boolean.TRUE, ")");
    }
}
