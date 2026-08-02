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
public final class TrustedDeviceRemoveRetry implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Integer attempt_count;
    public final LinkedHashMap parameters;

    public TrustedDeviceRemoveRetry(Integer num) {
        this.attempt_count = num;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "TrustedDevice", "cdf_action", "Remove");
        Countries.putSafe(m, "attempt_count", num);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrustedDeviceRemoveRetry) && this.attempt_count.equals(((TrustedDeviceRemoveRetry) obj).attempt_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TrustedDevice Remove Retry";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.attempt_count.hashCode();
    }

    public final String toString() {
        return "TrustedDeviceRemoveRetry(attempt_count=" + this.attempt_count + ")";
    }
}
