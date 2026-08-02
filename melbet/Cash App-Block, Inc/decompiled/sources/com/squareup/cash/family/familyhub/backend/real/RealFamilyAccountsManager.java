package com.squareup.cash.family.familyhub.backend.real;

import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db2.WebLoginConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;

/* loaded from: classes.dex */
public final class RealFamilyAccountsManager implements HasObservability {
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final SyncValueReader syncValueReader;
    public final WebLoginConfigQueries$$ExternalSyntheticLambda0 visibleDependentsPredicate = new WebLoginConfigQueries$$ExternalSyntheticLambda0(10);

    public RealFamilyAccountsManager(SyncValueReader syncValueReader, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.syncValueReader = syncValueReader;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    public final DerivedStateFlow isActivelySponsored() {
        return StateFlowKt.mapState(sponsorsFlow(), new StoryQueries$$ExternalSyntheticLambda0(28));
    }

    public final DerivedStateFlow isSponsored() {
        return StateFlowKt.mapState(sponsorsFlow(), new WebLoginConfigQueries$$ExternalSyntheticLambda0(9));
    }

    public final DerivedStateFlow sponsorsFlow() {
        return StateFlowKt.mapState(this.syncValueReader.getAllValues(AndroidSyncValueSpecs.FamilyAccount, new WebLoginConfigQueries$$ExternalSyntheticLambda0(11)), new WebLoginConfigQueries$$ExternalSyntheticLambda0(12));
    }
}
