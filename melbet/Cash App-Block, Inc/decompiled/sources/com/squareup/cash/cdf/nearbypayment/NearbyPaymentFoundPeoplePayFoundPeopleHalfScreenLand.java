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
public final class NearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Integer people_count;

    public NearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand(Integer num, String str) {
        this.people_count = num;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "NearbyPayment", "cdf_action", "FoundPeople");
        Countries.putSafe(m, "people_count", num);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand)) {
            return false;
        }
        NearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand nearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand = (NearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand) obj;
        return this.people_count.equals(nearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand.people_count) && this.flow_token.equals(nearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NearbyPayment FoundPeople PayFoundPeopleHalfScreenLand";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.flow_token.hashCode() + (this.people_count.hashCode() * 31);
    }

    public final String toString() {
        return "NearbyPaymentFoundPeoplePayFoundPeopleHalfScreenLand(people_count=" + this.people_count + ", flow_token=" + this.flow_token + ")";
    }
}
