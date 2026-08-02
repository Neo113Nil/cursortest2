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
public final class IntegrityCheckSucceed implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final String optional_failed_checks;
    public final LinkedHashMap parameters;
    public final Trigger trigger;

    public IntegrityCheckSucceed(Trigger trigger, String str) {
        this.trigger = trigger;
        this.optional_failed_checks = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Integrity", "cdf_action", "Check");
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "optional_failed_checks", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegrityCheckSucceed)) {
            return false;
        }
        IntegrityCheckSucceed integrityCheckSucceed = (IntegrityCheckSucceed) obj;
        return this.trigger == integrityCheckSucceed.trigger && this.optional_failed_checks.equals(integrityCheckSucceed.optional_failed_checks);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Integrity Check Succeed";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Trigger trigger = this.trigger;
        return this.optional_failed_checks.hashCode() + ((trigger == null ? 0 : trigger.hashCode()) * 31);
    }

    public final String toString() {
        return "IntegrityCheckSucceed(trigger=" + this.trigger + ", optional_failed_checks=" + this.optional_failed_checks + ")";
    }
}
