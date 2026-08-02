package com.squareup.cash.cdf.nearbypayment;

import com.google.mlkit.common.internal.zzb;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class NearbyPaymentNuxLocationPermissionResult implements Event {
    public static final zzb Companion = new zzb(27);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String flow_token;
    public final Boolean granted;
    public final LinkedHashMap parameters;

    public NearbyPaymentNuxLocationPermissionResult(Boolean bool, String str) {
        this.granted = bool;
        this.flow_token = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "NearbyPayment", "cdf_action", "Nux");
        Countries.putSafe(m, "granted", bool);
        Countries.putSafe(m, "flow_token", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentNuxLocationPermissionResult)) {
            return false;
        }
        NearbyPaymentNuxLocationPermissionResult nearbyPaymentNuxLocationPermissionResult = (NearbyPaymentNuxLocationPermissionResult) obj;
        return this.granted.equals(nearbyPaymentNuxLocationPermissionResult.granted) && Intrinsics.areEqual(this.flow_token, nearbyPaymentNuxLocationPermissionResult.flow_token);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "NearbyPayment Nux LocationPermissionResult";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.granted.hashCode() * 31;
        String str = this.flow_token;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NearbyPaymentNuxLocationPermissionResult(granted=" + this.granted + ", flow_token=" + this.flow_token + ")";
    }
}
