package com.squareup.cash.cdf.benefitshub;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class BenefitsHubScrollScrolledThrough implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final LinkedHashMap parameters;
    public final int progress;

    public BenefitsHubScrollScrolledThrough(int i) {
        this.progress = i;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "BenefitsHub", "cdf_action", "Scroll");
        Countries.putSafe(m, "progress", Integer.valueOf(i));
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenefitsHubScrollScrolledThrough) && this.progress == ((BenefitsHubScrollScrolledThrough) obj).progress;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "BenefitsHub Scroll ScrolledThrough";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return Integer.hashCode(this.progress);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.progress, "BenefitsHubScrollScrolledThrough(progress=", ")");
    }
}
