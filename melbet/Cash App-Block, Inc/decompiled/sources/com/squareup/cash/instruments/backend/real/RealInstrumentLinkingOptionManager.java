package com.squareup.cash.instruments.backend.real;

import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RealInstrumentLinkingOptionManager {
    public final SyncValueReader syncValueReader;

    public RealInstrumentLinkingOptionManager(SyncValueReader syncValueReader) {
        this.syncValueReader = syncValueReader;
    }

    public final StateFlow select() {
        return this.syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.MultiInstrumentLinkingOptions, EmptyList.INSTANCE, new ActivityItemLayout$$ExternalSyntheticLambda4(this));
    }
}
