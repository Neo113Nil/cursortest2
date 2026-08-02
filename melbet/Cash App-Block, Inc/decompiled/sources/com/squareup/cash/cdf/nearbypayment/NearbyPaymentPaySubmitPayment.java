package com.squareup.cash.cdf.nearbypayment;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class NearbyPaymentPaySubmitPayment implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Long amount;
    public final String flow_token;
    public final LinkedHashMap parameters;

    public NearbyPaymentPaySubmitPayment(Long l, String str) {
        this.amount = l;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "NearbyPayment", "cdf_action", "Pay");
        Countries.putSafe(m, "amount", l);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentPaySubmitPayment)) {
            return false;
        }
        NearbyPaymentPaySubmitPayment nearbyPaymentPaySubmitPayment = (NearbyPaymentPaySubmitPayment) obj;
        return this.amount.equals(nearbyPaymentPaySubmitPayment.amount) && this.flow_token.equals(nearbyPaymentPaySubmitPayment.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NearbyPayment Pay SubmitPayment";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.flow_token.hashCode() + (this.amount.hashCode() * 31);
    }

    public final String toString() {
        return "NearbyPaymentPaySubmitPayment(amount=" + this.amount + ", flow_token=" + this.flow_token + ")";
    }
}
