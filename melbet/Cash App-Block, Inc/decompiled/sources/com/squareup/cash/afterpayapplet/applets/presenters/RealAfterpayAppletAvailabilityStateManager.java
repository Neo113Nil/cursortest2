package com.squareup.cash.afterpayapplet.applets.presenters;

import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository$getEntryPointAvailable$3;
import com.squareup.cash.aiedge.MLKitTitleGenerator$prepareModel$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes5.dex */
public final class RealAfterpayAppletAvailabilityStateManager {
    public final ReadonlyStateFlow availabilityState;

    public RealAfterpayAppletAvailabilityStateManager(RealAfterpayAppletRepository realAfterpayAppletRepository, CoroutineScope coroutineScope) {
        int i = 15;
        this.availabilityState = FlowKt.stateIn(new BitcoinDepositsPresenter$special$$inlined$filter$1(FlowKt.distinctUntilChanged(FlowKt.transformLatest(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.distinctUntilChangedBy$FlowKt__DistinctKt(realAfterpayAppletRepository.getAfterpayAppletCache(), new ActivityTabViewKt$$ExternalSyntheticLambda17(i), FlowKt.defaultAreEquivalent), realAfterpayAppletRepository, i), new RealAfterpayAppletRepository$getEntryPointAvailable$3(new MLKitTitleGenerator$prepareModel$1(realAfterpayAppletRepository, null, 1), null))), 8), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), AppletAvailabilityState.LOADING);
    }
}
