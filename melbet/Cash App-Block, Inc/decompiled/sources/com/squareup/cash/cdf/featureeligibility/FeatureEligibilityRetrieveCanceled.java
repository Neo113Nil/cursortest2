package com.squareup.cash.cdf.featureeligibility;

import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FeatureEligibilityRetrieveCanceled implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final Long attempt_number;
    public final String origin_description;
    public final LinkedHashMap parameters;
    public final Long policy_change_timestamp;
    public final String reason;

    public FeatureEligibilityRetrieveCanceled(Long l, Long l2, String str, String str2) {
        this.reason = str;
        this.policy_change_timestamp = l;
        this.origin_description = str2;
        this.attempt_number = l2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "FeatureEligibility", "cdf_action", "Retrieve");
        Countries.putSafe(m, "reason", str);
        Countries.putSafe(m, "policy_change_timestamp", l);
        Countries.putSafe(m, "origin_description", str2);
        Countries.putSafe(m, "attempt_number", l2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureEligibilityRetrieveCanceled)) {
            return false;
        }
        FeatureEligibilityRetrieveCanceled featureEligibilityRetrieveCanceled = (FeatureEligibilityRetrieveCanceled) obj;
        return this.reason.equals(featureEligibilityRetrieveCanceled.reason) && Intrinsics.areEqual(this.policy_change_timestamp, featureEligibilityRetrieveCanceled.policy_change_timestamp) && Intrinsics.areEqual(this.origin_description, featureEligibilityRetrieveCanceled.origin_description) && Intrinsics.areEqual(this.attempt_number, featureEligibilityRetrieveCanceled.attempt_number);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "FeatureEligibility Retrieve Canceled";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        int hashCode = this.reason.hashCode() * 31;
        Long l = this.policy_change_timestamp;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.origin_description;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.attempt_number;
        return hashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.policy_change_timestamp, "FeatureEligibilityRetrieveCanceled(reason=", this.reason, ", policy_change_timestamp=", ", origin_description=");
        m.append(this.origin_description);
        m.append(", attempt_number=");
        m.append(this.attempt_number);
        m.append(")");
        return m.toString();
    }
}
