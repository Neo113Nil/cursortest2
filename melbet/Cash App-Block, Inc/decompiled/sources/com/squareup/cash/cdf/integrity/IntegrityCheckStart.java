package com.squareup.cash.cdf.integrity;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class IntegrityCheckStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final Boolean abort_on_any_failure;
    public final String checks;
    public final LinkedHashMap parameters;
    public final Trigger trigger;

    public IntegrityCheckStart(Trigger trigger, String str, Boolean bool) {
        this.trigger = trigger;
        this.checks = str;
        this.abort_on_any_failure = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Integrity", "cdf_action", "Check");
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "checks", str);
        Countries.putSafe(m, "abort_on_any_failure", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegrityCheckStart)) {
            return false;
        }
        IntegrityCheckStart integrityCheckStart = (IntegrityCheckStart) obj;
        return this.trigger == integrityCheckStart.trigger && this.checks.equals(integrityCheckStart.checks) && this.abort_on_any_failure.equals(integrityCheckStart.abort_on_any_failure);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Integrity Check Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.abort_on_any_failure.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.trigger.hashCode() * 31, 31, this.checks);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegrityCheckStart(trigger=");
        sb.append(this.trigger);
        sb.append(", checks=");
        sb.append(this.checks);
        sb.append(", abort_on_any_failure=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.abort_on_any_failure, ")");
    }
}
