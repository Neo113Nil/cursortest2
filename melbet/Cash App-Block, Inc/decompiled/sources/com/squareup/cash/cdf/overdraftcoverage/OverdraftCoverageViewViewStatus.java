package com.squareup.cash.cdf.overdraftcoverage;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class OverdraftCoverageViewViewStatus implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final OverdraftStatus status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class OverdraftStatus {
        public static final /* synthetic */ OverdraftStatus[] $VALUES;
        public static final OverdraftStatus ACTIVATED;
        public static final OverdraftStatus DISABLED;
        public static final OverdraftStatus ELIGIBLE;
        public static final OverdraftStatus INELIGIBLE;
        public static final OverdraftStatus UPSELL;

        static {
            OverdraftStatus overdraftStatus = new OverdraftStatus("UPSELL", 0);
            UPSELL = overdraftStatus;
            OverdraftStatus overdraftStatus2 = new OverdraftStatus("ELIGIBLE", 1);
            ELIGIBLE = overdraftStatus2;
            OverdraftStatus overdraftStatus3 = new OverdraftStatus("ACTIVATED", 2);
            ACTIVATED = overdraftStatus3;
            OverdraftStatus overdraftStatus4 = new OverdraftStatus("DISABLED", 3);
            DISABLED = overdraftStatus4;
            OverdraftStatus overdraftStatus5 = new OverdraftStatus("INELIGIBLE", 4);
            INELIGIBLE = overdraftStatus5;
            $VALUES = new OverdraftStatus[]{overdraftStatus, overdraftStatus2, overdraftStatus3, overdraftStatus4, overdraftStatus5};
        }

        public static OverdraftStatus valueOf(String str) {
            return (OverdraftStatus) Enum.valueOf(OverdraftStatus.class, str);
        }

        public static OverdraftStatus[] values() {
            return (OverdraftStatus[]) $VALUES.clone();
        }
    }

    public OverdraftCoverageViewViewStatus(OverdraftStatus overdraftStatus) {
        this.status = overdraftStatus;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "OverdraftCoverage", "cdf_action", "View");
        Countries.putSafe(m, "status", overdraftStatus);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverdraftCoverageViewViewStatus) && this.status == ((OverdraftCoverageViewViewStatus) obj).status;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "OverdraftCoverage View ViewStatus";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.status.hashCode();
    }

    public final String toString() {
        return "OverdraftCoverageViewViewStatus(status=" + this.status + ")";
    }
}
