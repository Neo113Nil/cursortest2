package com.squareup.cash.eligibility.backend.api;

import bo.app.re$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class EligibilityRefreshAnalyticsData {
    public final Long currentAttempt;
    public final String originDescription;
    public final long policyChangeTimestamp;

    public EligibilityRefreshAnalyticsData(long j, Long l, String str) {
        this.policyChangeTimestamp = j;
        this.originDescription = str;
        this.currentAttempt = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EligibilityRefreshAnalyticsData)) {
            return false;
        }
        EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData = (EligibilityRefreshAnalyticsData) obj;
        return this.policyChangeTimestamp == eligibilityRefreshAnalyticsData.policyChangeTimestamp && Intrinsics.areEqual(this.originDescription, eligibilityRefreshAnalyticsData.originDescription) && Intrinsics.areEqual(this.currentAttempt, eligibilityRefreshAnalyticsData.currentAttempt);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.policyChangeTimestamp) * 31;
        String str = this.originDescription;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.currentAttempt;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("EligibilityRefreshAnalyticsData(policyChangeTimestamp=", this.policyChangeTimestamp, ", originDescription=", this.originDescription);
        m.append(", currentAttempt=");
        m.append(this.currentAttempt);
        m.append(")");
        return m.toString();
    }
}
