package com.squareup.cash.afterpayapplet.backend.real;

import com.squareup.cash.cdf.Event;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayAnalyticsEvent implements Event {
    public final String name;
    public final LinkedHashMap parameters;

    public AfterpayAnalyticsEvent(String str, LinkedHashMap linkedHashMap) {
        str.getClass();
        this.name = str;
        this.parameters = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAnalyticsEvent)) {
            return false;
        }
        AfterpayAnalyticsEvent afterpayAnalyticsEvent = (AfterpayAnalyticsEvent) obj;
        return Intrinsics.areEqual(this.name, afterpayAnalyticsEvent.name) && this.parameters.equals(afterpayAnalyticsEvent.parameters);
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
        return "AfterpayAnalyticsEvent(name=" + this.name + ", parameters=" + this.parameters + ")";
    }
}
