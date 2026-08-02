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
public final class TrustedDeviceRemoveConfirmation implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final Integer removal_failure_count;
    public final Integer removal_success_count;

    public TrustedDeviceRemoveConfirmation(Integer num, Integer num2) {
        this.removal_success_count = num;
        this.removal_failure_count = num2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "TrustedDevice", "cdf_action", "Remove");
        Countries.putSafe(m, "removal_success_count", num);
        Countries.putSafe(m, "removal_failure_count", num2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedDeviceRemoveConfirmation)) {
            return false;
        }
        TrustedDeviceRemoveConfirmation trustedDeviceRemoveConfirmation = (TrustedDeviceRemoveConfirmation) obj;
        return this.removal_success_count.equals(trustedDeviceRemoveConfirmation.removal_success_count) && this.removal_failure_count.equals(trustedDeviceRemoveConfirmation.removal_failure_count);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "TrustedDevice Remove Confirmation";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.removal_failure_count.hashCode() + (this.removal_success_count.hashCode() * 31);
    }

    public final String toString() {
        return "TrustedDeviceRemoveConfirmation(removal_success_count=" + this.removal_success_count + ", removal_failure_count=" + this.removal_failure_count + ")";
    }
}
