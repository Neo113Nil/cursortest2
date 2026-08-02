package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes6.dex */
public final class CryptoMeasureParserPerformanceRecord implements Event {
    public static final List destinations = CollectionsKt__CollectionsJVMKt.listOf(EventDestination.AMPLITUDE);
    public final LinkedHashMap parameters;
    public final Long time_ms;

    public CryptoMeasureParserPerformanceRecord(Long l) {
        this.time_ms = l;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "MeasureParserPerformance");
        Countries.putSafe(m, "time_ms", l);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoMeasureParserPerformanceRecord) && this.time_ms.equals(((CryptoMeasureParserPerformanceRecord) obj).time_ms);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto MeasureParserPerformance Record";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.time_ms.hashCode();
    }

    public final String toString() {
        return "CryptoMeasureParserPerformanceRecord(time_ms=" + this.time_ms + ")";
    }
}
