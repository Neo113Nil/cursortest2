package com.squareup.cash.intent;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.maps.android.compose.MapEffectKt;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InboundPushNotification$Profile extends MapEffectKt {
    public final String analyticsKey;
    public final String customerToken;

    public InboundPushNotification$Profile(String str, String str2) {
        str.getClass();
        MapsKt__MapsKt.mapOf(new Pair("customer_token", str), new Pair("analytics_key", str2));
        this.customerToken = str;
        this.analyticsKey = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundPushNotification$Profile)) {
            return false;
        }
        InboundPushNotification$Profile inboundPushNotification$Profile = (InboundPushNotification$Profile) obj;
        return Intrinsics.areEqual(this.customerToken, inboundPushNotification$Profile.customerToken) && Intrinsics.areEqual(this.analyticsKey, inboundPushNotification$Profile.analyticsKey);
    }

    public final String getCustomerToken() {
        return this.customerToken;
    }

    public final int hashCode() {
        int hashCode = this.customerToken.hashCode() * 31;
        String str = this.analyticsKey;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Profile(customerToken=", this.customerToken, ", analyticsKey=", this.analyticsKey, ")");
    }
}
