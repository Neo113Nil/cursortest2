package com.squareup.cash.cdf.nearbypayment;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
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
public final class NearbyPaymentDiscoverFoundPeople implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String customer_token;
    public final String flow_token;
    public final LinkedHashMap parameters;
    public final Integer people_count;

    public NearbyPaymentDiscoverFoundPeople(Integer num, String str, String str2) {
        this.customer_token = str;
        this.people_count = num;
        this.flow_token = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "NearbyPayment", "cdf_action", "Discover");
        Countries.putSafe(m, "customer_token", str);
        Countries.putSafe(m, "people_count", num);
        Countries.putSafe(m, "flow_token", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentDiscoverFoundPeople)) {
            return false;
        }
        NearbyPaymentDiscoverFoundPeople nearbyPaymentDiscoverFoundPeople = (NearbyPaymentDiscoverFoundPeople) obj;
        return this.customer_token.equals(nearbyPaymentDiscoverFoundPeople.customer_token) && this.people_count.equals(nearbyPaymentDiscoverFoundPeople.people_count) && Intrinsics.areEqual(this.flow_token, nearbyPaymentDiscoverFoundPeople.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NearbyPayment Discover FoundPeople";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.customer_token.hashCode() * 31, 31, this.people_count);
        String str = this.flow_token;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m(this.people_count, "NearbyPaymentDiscoverFoundPeople(customer_token=", this.customer_token, ", people_count=", ", flow_token="), this.flow_token, ")");
    }
}
