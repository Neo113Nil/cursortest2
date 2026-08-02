package com.squareup.cash.crypto.analytics;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.cdf.crypto.CryptoTradeComplete;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class RealCryptoFlowLogger implements BlockerFlowListener {
    public final Analytics analytics;
    public CryptoTradeComplete cryptoTradeCompleteEvent;
    public String trackedFlowToken;

    public RealCryptoFlowLogger(Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onBlockerPresented(BlockersData blockersData, String str, String str2, BlockerDescriptor blockerDescriptor) {
        blockerDescriptor.getClass();
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onFlowCancelled(BlockersData blockersData) {
        blockersData.getClass();
        if (Intrinsics.areEqual(blockersData.flowToken, this.trackedFlowToken)) {
            this.cryptoTradeCompleteEvent = null;
            this.trackedFlowToken = null;
        }
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onFlowCompleted(BlockersData blockersData) {
        blockersData.getClass();
        if (Intrinsics.areEqual(blockersData.flowToken, this.trackedFlowToken)) {
            CryptoTradeComplete cryptoTradeComplete = this.cryptoTradeCompleteEvent;
            if (cryptoTradeComplete != null) {
                this.analytics.track(cryptoTradeComplete, null);
                this.cryptoTradeCompleteEvent = null;
            }
            this.trackedFlowToken = null;
        }
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onFlowStarted(BlockersData blockersData, String str, ScenarioPlan scenarioPlan, ClientScenario clientScenario) {
        blockersData.getClass();
        str.getClass();
    }

    @Override // com.squareup.cash.blockers.flowlistener.BlockerFlowListener
    public final void onNavigation(Screen screen, Screen screen2, boolean z) {
        screen2.getClass();
    }
}
