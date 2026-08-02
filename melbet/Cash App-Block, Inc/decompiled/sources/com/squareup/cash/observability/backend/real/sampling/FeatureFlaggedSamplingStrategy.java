package com.squareup.cash.observability.backend.real.sampling;

import androidx.compose.runtime.AbstractApplier;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.backend.real.InMemoryReportedErrorCache;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.observability.types.SampleStrategy;

/* loaded from: classes6.dex */
public final class FeatureFlaggedSamplingStrategy implements SampleStrategy {
    public final InMemoryReportedErrorCache cache;
    public final FeatureFlagManager featureFlagManager;
    public final AbstractApplier flag;
    public final SyncRangeQueries$$ExternalSyntheticLambda1 shouldCollect;

    public FeatureFlaggedSamplingStrategy(InMemoryReportedErrorCache inMemoryReportedErrorCache, FeatureFlagManager featureFlagManager, AbstractApplier abstractApplier, SyncRangeQueries$$ExternalSyntheticLambda1 syncRangeQueries$$ExternalSyntheticLambda1) {
        abstractApplier.getClass();
        this.cache = inMemoryReportedErrorCache;
        this.featureFlagManager = featureFlagManager;
        this.flag = abstractApplier;
        this.shouldCollect = syncRangeQueries$$ExternalSyntheticLambda1;
    }

    @Override // com.squareup.cash.observability.types.SampleStrategy
    public final boolean shouldCollectEvent(ReportedError reportedError) {
        reportedError.getClass();
        if (!((Boolean) this.shouldCollect.invoke(((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(this.flag))).booleanValue()) {
            return false;
        }
        this.cache.addIfNotExists(reportedError);
        return true;
    }
}
