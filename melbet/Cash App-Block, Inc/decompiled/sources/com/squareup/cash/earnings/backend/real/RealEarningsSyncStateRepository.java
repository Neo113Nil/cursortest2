package com.squareup.cash.earnings.backend.real;

import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class RealEarningsSyncStateRepository {
    public final DerivedStateFlow appletAvailabilityState;
    public final StateFlow appletUiState;
    public final StateFlow homeUiState;

    public RealEarningsSyncStateRepository(SyncValueReader syncValueReader) {
        this.homeUiState = syncValueReader.getSingleValue(AndroidSyncValueSpecs.EarningsHomeUiState);
        StateFlow singleValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.EarningsAppletUiState);
        this.appletUiState = singleValue;
        this.appletAvailabilityState = StateFlowKt.mapState(singleValue, new ComposeDialogKt$$ExternalSyntheticLambda14(22));
    }
}
