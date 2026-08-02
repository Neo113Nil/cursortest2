package com.squareup.cash.observability.backend.real.sampling;

import com.squareup.cash.observability.backend.real.InMemoryReportedErrorCache;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.observability.types.SampleStrategy;

/* loaded from: classes.dex */
public final class OneErrorPerAppSessionStrategy implements SampleStrategy {
    public final InMemoryReportedErrorCache cache;

    public OneErrorPerAppSessionStrategy(InMemoryReportedErrorCache inMemoryReportedErrorCache) {
        this.cache = inMemoryReportedErrorCache;
    }

    @Override // com.squareup.cash.observability.types.SampleStrategy
    public final boolean shouldCollectEvent(ReportedError reportedError) {
        reportedError.getClass();
        return this.cache.addIfNotExists(reportedError);
    }
}
