package com.squareup.cash.cdf.endofonboarding;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EndOfOnboardingCheckLockedRegion implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final String locked_region;
    public final LinkedHashMap parameters;

    public EndOfOnboardingCheckLockedRegion(String str) {
        this.locked_region = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "EndOfOnboarding", "cdf_action", "Check");
        Countries.putSafe(m, "locked_region", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EndOfOnboardingCheckLockedRegion) && Intrinsics.areEqual(this.locked_region, ((EndOfOnboardingCheckLockedRegion) obj).locked_region);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "EndOfOnboarding Check LockedRegion";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.locked_region;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EndOfOnboardingCheckLockedRegion(locked_region=", this.locked_region, ")");
    }
}
