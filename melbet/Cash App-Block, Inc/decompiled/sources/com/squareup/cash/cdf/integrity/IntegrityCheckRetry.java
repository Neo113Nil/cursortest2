package com.squareup.cash.cdf.integrity;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class IntegrityCheckRetry implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final String checks;
    public final LinkedHashMap parameters;
    public final Trigger trigger;

    public IntegrityCheckRetry(Trigger trigger, String str) {
        this.trigger = trigger;
        this.checks = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Integrity", "cdf_action", "Check");
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "checks", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegrityCheckRetry)) {
            return false;
        }
        IntegrityCheckRetry integrityCheckRetry = (IntegrityCheckRetry) obj;
        return this.trigger == integrityCheckRetry.trigger && this.checks.equals(integrityCheckRetry.checks);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Integrity Check Retry";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Trigger trigger = this.trigger;
        return this.checks.hashCode() + ((trigger == null ? 0 : trigger.hashCode()) * 31);
    }

    public final String toString() {
        return "IntegrityCheckRetry(trigger=" + this.trigger + ", checks=" + this.checks + ")";
    }
}
