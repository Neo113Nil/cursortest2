package com.squareup.cash.cdf.featureeligibility;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
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
public final class FeatureEligibilityRetrieveSucceeded implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final Long attempt_number;
    public final String origin_description;
    public final LinkedHashMap parameters;
    public final Long policy_change_timestamp;

    public FeatureEligibilityRetrieveSucceeded(Long l, String str, Long l2) {
        this.policy_change_timestamp = l;
        this.origin_description = str;
        this.attempt_number = l2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 7, "FeatureEligibility", "cdf_action", "Retrieve");
        Countries.putSafe(m, "policy_change_timestamp", l);
        Countries.putSafe(m, "origin_description", str);
        Countries.putSafe(m, "attempt_number", l2);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureEligibilityRetrieveSucceeded)) {
            return false;
        }
        FeatureEligibilityRetrieveSucceeded featureEligibilityRetrieveSucceeded = (FeatureEligibilityRetrieveSucceeded) obj;
        return Intrinsics.areEqual(this.policy_change_timestamp, featureEligibilityRetrieveSucceeded.policy_change_timestamp) && Intrinsics.areEqual(this.origin_description, featureEligibilityRetrieveSucceeded.origin_description) && Intrinsics.areEqual(this.attempt_number, featureEligibilityRetrieveSucceeded.attempt_number);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "FeatureEligibility Retrieve Succeeded";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        Long l = this.policy_change_timestamp;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.origin_description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.attempt_number;
        return (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureEligibilityRetrieveSucceeded(policy_change_timestamp=");
        sb.append(this.policy_change_timestamp);
        sb.append(", origin_description=");
        sb.append(this.origin_description);
        sb.append(", attempt_number=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.attempt_number, ", local_values=null, remote_values=null)");
    }
}
