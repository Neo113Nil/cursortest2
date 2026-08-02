package com.squareup.cash.cdf.settingseligibility;

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

/* loaded from: classes.dex */
public final class SettingsEligibilityRetrieveFailed implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final Long attempt_number;
    public final String origin_description;
    public final LinkedHashMap parameters;
    public final Long policy_change_timestamp;
    public final String reason;

    public SettingsEligibilityRetrieveFailed(Long l, Long l2, String str, String str2) {
        this.reason = str;
        this.policy_change_timestamp = l;
        this.origin_description = str2;
        this.attempt_number = l2;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 6, "SettingsEligibility", "cdf_action", "Retrieve");
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
        if (!(obj instanceof SettingsEligibilityRetrieveFailed)) {
            return false;
        }
        SettingsEligibilityRetrieveFailed settingsEligibilityRetrieveFailed = (SettingsEligibilityRetrieveFailed) obj;
        return this.reason.equals(settingsEligibilityRetrieveFailed.reason) && Intrinsics.areEqual(this.policy_change_timestamp, settingsEligibilityRetrieveFailed.policy_change_timestamp) && Intrinsics.areEqual(this.origin_description, settingsEligibilityRetrieveFailed.origin_description) && Intrinsics.areEqual(this.attempt_number, settingsEligibilityRetrieveFailed.attempt_number);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SettingsEligibility Retrieve Failed";
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
        StringBuilder m = RumErrorSource$EnumUnboxingLocalUtility.m(this.policy_change_timestamp, "SettingsEligibilityRetrieveFailed(reason=", this.reason, ", policy_change_timestamp=", ", origin_description=");
        m.append(this.origin_description);
        m.append(", attempt_number=");
        m.append(this.attempt_number);
        m.append(")");
        return m.toString();
    }
}
