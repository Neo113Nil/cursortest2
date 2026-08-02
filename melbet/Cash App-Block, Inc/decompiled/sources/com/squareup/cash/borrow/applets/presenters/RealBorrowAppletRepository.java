package com.squareup.cash.borrow.applets.presenters;

import com.squareup.cash.boost.db.RewardQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes5.dex */
public final class RealBorrowAppletRepository {
    public final DerivedStateFlow availabilityState;
    public final DerivedStateFlow tileEntryPointModel;

    public RealBorrowAppletRepository(RealBorrowDataManager realBorrowDataManager, CoroutineScope coroutineScope) {
        ReadonlyStateFlow stateIn = FlowKt.stateIn(FlowKt.distinctUntilChanged(realBorrowDataManager.borrowHomeEntryPoint(true)), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), null);
        this.availabilityState = StateFlowKt.mapState(stateIn, new RewardQueries$$ExternalSyntheticLambda4(23));
        this.tileEntryPointModel = StateFlowKt.mapState(stateIn, new RewardQueries$$ExternalSyntheticLambda4(this));
    }

    public final DerivedStateFlow getAvailabilityState() {
        return this.availabilityState;
    }
}
