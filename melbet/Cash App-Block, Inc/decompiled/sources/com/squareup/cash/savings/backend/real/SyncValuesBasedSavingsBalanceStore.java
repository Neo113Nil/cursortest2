package com.squareup.cash.savings.backend.real;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import com.squareup.cash.appmessages.badging.AppMessageBadgeCounter$collect$2;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Wires$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public final class SyncValuesBasedSavingsBalanceStore implements HasObservability {
    public final ErrorReporter errorReporter;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final SyncValueReader syncValueReader;

    public SyncValuesBasedSavingsBalanceStore(SyncValueReader syncValueReader, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.syncValueReader = syncValueReader;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
    }

    public final FinishSetupTileBadgeCounter get() {
        AndroidSyncValueSpecs$Wires$1 androidSyncValueSpecs$Wires$1 = AndroidSyncValueSpecs.VersionedSavingsFolders;
        SyncValueReader syncValueReader = this.syncValueReader;
        return FlowKt.combine(syncValueReader.getSingleValue(androidSyncValueSpecs$Wires$1), syncValueReader.getAllValues(AndroidSyncValueSpecs.BalanceSnapshot), syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.SavingsApplet, null, new RealSandboxer$$ExternalSyntheticLambda0(this, 6)), new AppMessageBadgeCounter$collect$2(this, null, 4));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }
}
