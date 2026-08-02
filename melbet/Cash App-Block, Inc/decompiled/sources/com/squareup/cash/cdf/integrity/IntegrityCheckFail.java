package com.squareup.cash.cdf.integrity;

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
public final class IntegrityCheckFail implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final String mandatory_failed_checks;
    public final String optional_failed_checks;
    public final LinkedHashMap parameters;
    public final Trigger trigger;

    public IntegrityCheckFail(Trigger trigger, String str, String str2) {
        this.trigger = trigger;
        this.mandatory_failed_checks = str;
        this.optional_failed_checks = str2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 5, "Integrity", "cdf_action", "Check");
        Countries.putSafe(m, "trigger", trigger);
        Countries.putSafe(m, "mandatory_failed_checks", str);
        Countries.putSafe(m, "optional_failed_checks", str2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntegrityCheckFail)) {
            return false;
        }
        IntegrityCheckFail integrityCheckFail = (IntegrityCheckFail) obj;
        return this.trigger == integrityCheckFail.trigger && this.mandatory_failed_checks.equals(integrityCheckFail.mandatory_failed_checks) && this.optional_failed_checks.equals(integrityCheckFail.optional_failed_checks);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Integrity Check Fail";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Trigger trigger = this.trigger;
        return this.optional_failed_checks.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((trigger == null ? 0 : trigger.hashCode()) * 31, 31, this.mandatory_failed_checks);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegrityCheckFail(trigger=");
        sb.append(this.trigger);
        sb.append(", mandatory_failed_checks=");
        sb.append(this.mandatory_failed_checks);
        sb.append(", optional_failed_checks=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.optional_failed_checks, ")");
    }
}
