package com.squareup.cash.intent;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.maps.android.compose.MapEffectKt;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InboundPushNotification$Route extends MapEffectKt {
    public final String analyticsKey;
    public final String url;

    public InboundPushNotification$Route(String str, String str2) {
        str.getClass();
        MapsKt__MapsJVMKt.mapOf(new Pair("analytics_key", str2));
        this.url = str;
        this.analyticsKey = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundPushNotification$Route)) {
            return false;
        }
        InboundPushNotification$Route inboundPushNotification$Route = (InboundPushNotification$Route) obj;
        return Intrinsics.areEqual(this.url, inboundPushNotification$Route.url) && Intrinsics.areEqual(this.analyticsKey, inboundPushNotification$Route.analyticsKey);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        String str = this.analyticsKey;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Route(url=", this.url, ", analyticsKey=", this.analyticsKey, ")");
    }
}
