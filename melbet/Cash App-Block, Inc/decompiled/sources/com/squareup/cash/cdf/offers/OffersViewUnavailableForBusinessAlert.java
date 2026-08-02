package com.squareup.cash.cdf.offers;

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
public final class OffersViewUnavailableForBusinessAlert implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final String referrer_source;

    public OffersViewUnavailableForBusinessAlert(String str) {
        this.referrer_source = str;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Offers", "cdf_action", "View");
        Countries.putSafe(m, "referrer_source", str);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OffersViewUnavailableForBusinessAlert) && Intrinsics.areEqual(this.referrer_source, ((OffersViewUnavailableForBusinessAlert) obj).referrer_source);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Offers View UnavailableForBusinessAlert";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.referrer_source;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OffersViewUnavailableForBusinessAlert(referrer_source=", this.referrer_source, ")");
    }
}
