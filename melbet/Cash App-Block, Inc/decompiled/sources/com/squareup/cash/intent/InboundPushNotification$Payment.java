package com.squareup.cash.intent;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.maps.android.compose.MapEffectKt;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InboundPushNotification$Payment extends MapEffectKt {
    public final String analyticsKey;
    public final String paymentToken;

    public InboundPushNotification$Payment(String str, String str2) {
        str.getClass();
        MapsKt__MapsKt.mapOf(new Pair("payment_token", str), new Pair("analytics_key", str2));
        this.paymentToken = str;
        this.analyticsKey = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboundPushNotification$Payment)) {
            return false;
        }
        InboundPushNotification$Payment inboundPushNotification$Payment = (InboundPushNotification$Payment) obj;
        return Intrinsics.areEqual(this.paymentToken, inboundPushNotification$Payment.paymentToken) && Intrinsics.areEqual(this.analyticsKey, inboundPushNotification$Payment.analyticsKey);
    }

    public final String getPaymentToken() {
        return this.paymentToken;
    }

    public final int hashCode() {
        int hashCode = this.paymentToken.hashCode() * 31;
        String str = this.analyticsKey;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("Payment(paymentToken=", this.paymentToken, ", analyticsKey=", this.analyticsKey, ")");
    }
}
