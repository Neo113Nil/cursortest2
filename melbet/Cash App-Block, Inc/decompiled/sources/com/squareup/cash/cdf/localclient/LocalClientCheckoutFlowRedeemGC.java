package com.squareup.cash.cdf.localclient;

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
public final class LocalClientCheckoutFlowRedeemGC implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String buyer_token;
    public final String cart_token;
    public final String gc_token;
    public final LinkedHashMap parameters;

    public LocalClientCheckoutFlowRedeemGC(String str, String str2, String str3) {
        this.buyer_token = str;
        this.cart_token = str2;
        this.gc_token = str3;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "LocalClient", "cdf_action", "CheckoutFlow");
        Countries.putSafe(m, "buyer_token", str);
        Countries.putSafe(m, "cart_token", str2);
        Countries.putSafe(m, "gc_token", str3);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCheckoutFlowRedeemGC)) {
            return false;
        }
        LocalClientCheckoutFlowRedeemGC localClientCheckoutFlowRedeemGC = (LocalClientCheckoutFlowRedeemGC) obj;
        return Intrinsics.areEqual(this.buyer_token, localClientCheckoutFlowRedeemGC.buyer_token) && Intrinsics.areEqual(this.cart_token, localClientCheckoutFlowRedeemGC.cart_token) && this.gc_token.equals(localClientCheckoutFlowRedeemGC.gc_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient CheckoutFlow RedeemGC";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.buyer_token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cart_token;
        return this.gc_token.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalClientCheckoutFlowRedeemGC(anonymous_buyer_token=null, buyer_token=", this.buyer_token, ", cart_token=", this.cart_token, ", gc_token="), this.gc_token, ")");
    }
}
