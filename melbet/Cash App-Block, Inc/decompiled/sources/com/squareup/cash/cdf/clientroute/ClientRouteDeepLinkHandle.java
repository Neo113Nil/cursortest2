package com.squareup.cash.cdf.clientroute;

import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
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
public final class ClientRouteDeepLinkHandle implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_deferred;
    public final Boolean is_handled;
    public final LinkedHashMap parameters;
    public final String source;
    public final String url;

    public ClientRouteDeepLinkHandle(Boolean bool, Boolean bool2, String str, String str2) {
        this.url = str;
        this.source = str2;
        this.is_deferred = bool;
        this.is_handled = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "ClientRoute", "cdf_action", "DeepLink");
        Countries.putSafe(m, "url", str);
        Countries.putSafe(m, "source", str2);
        Countries.putSafe(m, "is_deferred", bool);
        Countries.putSafe(m, "is_handled", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRouteDeepLinkHandle)) {
            return false;
        }
        ClientRouteDeepLinkHandle clientRouteDeepLinkHandle = (ClientRouteDeepLinkHandle) obj;
        return Intrinsics.areEqual(this.url, clientRouteDeepLinkHandle.url) && Intrinsics.areEqual(this.source, clientRouteDeepLinkHandle.source) && this.is_deferred.equals(clientRouteDeepLinkHandle.is_deferred) && this.is_handled.equals(clientRouteDeepLinkHandle.is_handled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ClientRoute DeepLink Handle";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source;
        return this.is_handled.hashCode() + ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_deferred, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ClientRouteDeepLinkHandle(url=", this.url, ", source=", this.source, ", is_deferred=");
        m.append(this.is_deferred);
        m.append(", is_handled=");
        m.append(this.is_handled);
        m.append(")");
        return m.toString();
    }
}
