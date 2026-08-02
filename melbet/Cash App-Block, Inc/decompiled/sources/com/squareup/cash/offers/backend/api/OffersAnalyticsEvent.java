package com.squareup.cash.offers.backend.api;

import com.squareup.cash.cdf.Event;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class OffersAnalyticsEvent implements Event {
    public final String name;
    public final LinkedHashMap parameters;

    public OffersAnalyticsEvent(String str, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.name = str;
        this.parameters = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersAnalyticsEvent)) {
            return false;
        }
        OffersAnalyticsEvent offersAnalyticsEvent = (OffersAnalyticsEvent) obj;
        return Intrinsics.areEqual(this.name, offersAnalyticsEvent.name) && this.parameters.equals(offersAnalyticsEvent.parameters);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return this.name;
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.parameters.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "OffersAnalyticsEvent(name=" + this.name + ", parameters=" + this.parameters + ")";
    }
}
