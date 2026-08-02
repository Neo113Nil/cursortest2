package com.squareup.cash.cdf.sponsoredaccount;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SponsoredAccountManagePendingRequestTapOne implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String dependent_customer_token;
    public final PendingRequestLocation from;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PendingRequestLocation {
        public static final /* synthetic */ PendingRequestLocation[] $VALUES;
        public static final PendingRequestLocation AllPendingRequestsList;
        public static final PendingRequestLocation FamilyHome;

        static {
            PendingRequestLocation pendingRequestLocation = new PendingRequestLocation("FamilyHome", 0);
            FamilyHome = pendingRequestLocation;
            PendingRequestLocation pendingRequestLocation2 = new PendingRequestLocation("AllPendingRequestsList", 1);
            AllPendingRequestsList = pendingRequestLocation2;
            $VALUES = new PendingRequestLocation[]{pendingRequestLocation, pendingRequestLocation2};
        }

        public static PendingRequestLocation valueOf(String str) {
            return (PendingRequestLocation) Enum.valueOf(PendingRequestLocation.class, str);
        }

        public static PendingRequestLocation[] values() {
            return (PendingRequestLocation[]) $VALUES.clone();
        }
    }

    public SponsoredAccountManagePendingRequestTapOne(String str, PendingRequestLocation pendingRequestLocation) {
        this.dependent_customer_token = str;
        this.from = pendingRequestLocation;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "SponsoredAccount", "cdf_action", "ManagePendingRequest");
        Countries.putSafe(m, "dependent_customer_token", str);
        Countries.putSafe(m, "from", pendingRequestLocation);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponsoredAccountManagePendingRequestTapOne)) {
            return false;
        }
        SponsoredAccountManagePendingRequestTapOne sponsoredAccountManagePendingRequestTapOne = (SponsoredAccountManagePendingRequestTapOne) obj;
        return Intrinsics.areEqual(this.dependent_customer_token, sponsoredAccountManagePendingRequestTapOne.dependent_customer_token) && this.from == sponsoredAccountManagePendingRequestTapOne.from;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "SponsoredAccount ManagePendingRequest TapOne";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.dependent_customer_token;
        return this.from.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SponsoredAccountManagePendingRequestTapOne(dependent_customer_token=" + this.dependent_customer_token + ", from=" + this.from + ")";
    }
}
