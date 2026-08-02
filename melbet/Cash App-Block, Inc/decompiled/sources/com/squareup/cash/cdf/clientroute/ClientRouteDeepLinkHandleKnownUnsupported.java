package com.squareup.cash.cdf.clientroute;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class ClientRouteDeepLinkHandleKnownUnsupported implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_external_browser_fallback;
    public final Boolean is_supported_on_latest_version;
    public final LinkedHashMap parameters;
    public final String spec_name;

    public ClientRouteDeepLinkHandleKnownUnsupported(String str, Boolean bool, Boolean bool2) {
        this.spec_name = str;
        this.is_supported_on_latest_version = bool;
        this.is_external_browser_fallback = bool2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "ClientRoute", "cdf_action", "DeepLink");
        Countries.putSafe(m, "spec_name", str);
        Countries.putSafe(m, "is_supported_on_latest_version", bool);
        Countries.putSafe(m, "is_external_browser_fallback", bool2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRouteDeepLinkHandleKnownUnsupported)) {
            return false;
        }
        ClientRouteDeepLinkHandleKnownUnsupported clientRouteDeepLinkHandleKnownUnsupported = (ClientRouteDeepLinkHandleKnownUnsupported) obj;
        return Intrinsics.areEqual(this.spec_name, clientRouteDeepLinkHandleKnownUnsupported.spec_name) && Intrinsics.areEqual(this.is_supported_on_latest_version, clientRouteDeepLinkHandleKnownUnsupported.is_supported_on_latest_version) && Intrinsics.areEqual(this.is_external_browser_fallback, clientRouteDeepLinkHandleKnownUnsupported.is_external_browser_fallback);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ClientRoute DeepLink HandleKnownUnsupported";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.spec_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.is_supported_on_latest_version;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.is_external_browser_fallback;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        return Thread$State$EnumUnboxingLocalUtility.m(Thread$State$EnumUnboxingLocalUtility.m(this.is_supported_on_latest_version, "ClientRouteDeepLinkHandleKnownUnsupported(spec_name=", this.spec_name, ", is_supported_on_latest_version=", ", is_external_browser_fallback="), this.is_external_browser_fallback, ")");
    }
}
