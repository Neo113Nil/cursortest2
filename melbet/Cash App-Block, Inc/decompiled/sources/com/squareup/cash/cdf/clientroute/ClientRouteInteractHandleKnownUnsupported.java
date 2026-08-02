package com.squareup.cash.cdf.clientroute;

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
public final class ClientRouteInteractHandleKnownUnsupported implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_supported_on_latest_version;
    public final LinkedHashMap parameters;
    public final String spec_name;

    public ClientRouteInteractHandleKnownUnsupported(String str, Boolean bool) {
        this.spec_name = str;
        this.is_supported_on_latest_version = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "ClientRoute", "cdf_action", "Interact");
        Countries.putSafe(m, "spec_name", str);
        Countries.putSafe(m, "is_supported_on_latest_version", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRouteInteractHandleKnownUnsupported)) {
            return false;
        }
        ClientRouteInteractHandleKnownUnsupported clientRouteInteractHandleKnownUnsupported = (ClientRouteInteractHandleKnownUnsupported) obj;
        return Intrinsics.areEqual(this.spec_name, clientRouteInteractHandleKnownUnsupported.spec_name) && Intrinsics.areEqual(this.is_supported_on_latest_version, clientRouteInteractHandleKnownUnsupported.is_supported_on_latest_version);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ClientRoute Interact HandleKnownUnsupported";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.spec_name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.is_supported_on_latest_version;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "ClientRouteInteractHandleKnownUnsupported(spec_name=" + this.spec_name + ", is_supported_on_latest_version=" + this.is_supported_on_latest_version + ")";
    }
}
