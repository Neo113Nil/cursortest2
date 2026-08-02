package com.squareup.cash.afterpayapplet.presenters;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.protos.cash.activity.api.v1.OrderRow;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class CompletedOrdersActivitiesManager implements ActivitiesManager {
    public static final Set COMPLETED_STATES = ArraysKt___ArraysKt.toSet(new OrderRow.OrderRowLoanUiState[]{OrderRow.OrderRowLoanUiState.COMPLETED, OrderRow.OrderRowLoanUiState.REFUNDED, OrderRow.OrderRowLoanUiState.CANCELLED});
    public final ActivitiesManager delegate;

    public CompletedOrdersActivitiesManager(ActivitiesManager activitiesManager) {
        activitiesManager.getClass();
        this.delegate = activitiesManager;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Flow activities() {
        return new BitcoinDepositsPresenter$special$$inlined$filter$1(this.delegate.activities(), 10);
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final void clear() {
        this.delegate.clear();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Flow firstServerPages() {
        return this.delegate.firstServerPages();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Object load(ActivitiesManager.LoadMode loadMode, Continuation continuation) {
        return this.delegate.load(loadMode, continuation);
    }
}
