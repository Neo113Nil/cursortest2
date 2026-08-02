package com.squareup.cash.cdf.localclient;

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
public final class LocalClientCheckoutFlowToggleLocalCash implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final String cart_token;
    public final LinkedHashMap parameters;
    public final Boolean value;

    public LocalClientCheckoutFlowToggleLocalCash(String str, Boolean bool) {
        this.cart_token = str;
        this.value = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "LocalClient", "cdf_action", "CheckoutFlow");
        Countries.putSafe(m, "cart_token", str);
        Countries.putSafe(m, "value", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalClientCheckoutFlowToggleLocalCash)) {
            return false;
        }
        LocalClientCheckoutFlowToggleLocalCash localClientCheckoutFlowToggleLocalCash = (LocalClientCheckoutFlowToggleLocalCash) obj;
        return Intrinsics.areEqual(this.cart_token, localClientCheckoutFlowToggleLocalCash.cart_token) && this.value.equals(localClientCheckoutFlowToggleLocalCash.value);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "LocalClient CheckoutFlow ToggleLocalCash";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.cart_token;
        return this.value.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "LocalClientCheckoutFlowToggleLocalCash(cart_token=" + this.cart_token + ", value=" + this.value + ")";
    }
}
