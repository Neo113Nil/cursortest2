package com.squareup.cash.cdf.trusteddevice;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class TrustedDeviceViewAll implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer number_of_devices;
    public final LinkedHashMap parameters;

    public TrustedDeviceViewAll(Integer num) {
        this.number_of_devices = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "TrustedDevice", "cdf_action", "View");
        Countries.putSafe(m, "number_of_devices", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrustedDeviceViewAll) && this.number_of_devices.equals(((TrustedDeviceViewAll) obj).number_of_devices);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TrustedDevice View All";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.number_of_devices.hashCode();
    }

    public final String toString() {
        return "TrustedDeviceViewAll(number_of_devices=" + this.number_of_devices + ")";
    }
}
