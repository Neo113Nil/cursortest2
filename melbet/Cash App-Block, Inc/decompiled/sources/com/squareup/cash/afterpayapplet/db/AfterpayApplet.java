package com.squareup.cash.afterpayapplet.db;

import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletResponse;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayApplet {
    public final AfterpayAppletResponse afterpay_applet_response;
    public final long key;
    public final Long ttl_in_millis;

    public AfterpayApplet(long j, Long l, AfterpayAppletResponse afterpayAppletResponse) {
        afterpayAppletResponse.getClass();
        this.key = j;
        this.ttl_in_millis = l;
        this.afterpay_applet_response = afterpayAppletResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayApplet)) {
            return false;
        }
        AfterpayApplet afterpayApplet = (AfterpayApplet) obj;
        return this.key == afterpayApplet.key && Intrinsics.areEqual(this.ttl_in_millis, afterpayApplet.ttl_in_millis) && Intrinsics.areEqual(this.afterpay_applet_response, afterpayApplet.afterpay_applet_response);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.key) * 31;
        Long l = this.ttl_in_millis;
        return this.afterpay_applet_response.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        return "AfterpayApplet(key=" + this.key + ", ttl_in_millis=" + this.ttl_in_millis + ", afterpay_applet_response=" + this.afterpay_applet_response + ")";
    }
}
