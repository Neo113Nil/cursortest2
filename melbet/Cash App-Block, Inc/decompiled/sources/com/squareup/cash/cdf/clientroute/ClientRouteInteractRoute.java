package com.squareup.cash.cdf.clientroute;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.mlkit.common.internal.zzd;
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

/* loaded from: classes.dex */
public final class ClientRouteInteractRoute implements Event {
    public static final zzd Companion = new zzd(20);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Boolean is_deep_link;
    public final String origin;
    public final LinkedHashMap parameters;
    public final String spec_name;
    public final String spec_path_format;
    public final String url;

    public ClientRouteInteractRoute(Boolean bool, String str, String str2, String str3, String str4) {
        this.origin = str;
        this.is_deep_link = bool;
        this.spec_name = str2;
        this.spec_path_format = str3;
        this.url = str4;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "ClientRoute", "cdf_action", "Interact");
        Countries.putSafe(m, "origin", str);
        Countries.putSafe(m, "is_deep_link", bool);
        Countries.putSafe(m, "spec_name", str2);
        Countries.putSafe(m, "spec_path_format", str3);
        Countries.putSafe(m, "url", str4);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientRouteInteractRoute)) {
            return false;
        }
        ClientRouteInteractRoute clientRouteInteractRoute = (ClientRouteInteractRoute) obj;
        return Intrinsics.areEqual(this.origin, clientRouteInteractRoute.origin) && this.is_deep_link.equals(clientRouteInteractRoute.is_deep_link) && Intrinsics.areEqual(this.spec_name, clientRouteInteractRoute.spec_name) && Intrinsics.areEqual(this.spec_path_format, clientRouteInteractRoute.spec_path_format) && Intrinsics.areEqual(this.url, clientRouteInteractRoute.url);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "ClientRoute Interact Route";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.origin;
        int m = ViewEvent$State$EnumUnboxingLocalUtility.m(this.is_deep_link, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.spec_name;
        int hashCode = (m + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.spec_path_format;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.url;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Thread$State$EnumUnboxingLocalUtility.m(this.is_deep_link, "ClientRouteInteractRoute(origin=", this.origin, ", is_deep_link=", ", spec_name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.spec_name, ", spec_path_format=", this.spec_path_format, ", url=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.url, ")");
    }
}
