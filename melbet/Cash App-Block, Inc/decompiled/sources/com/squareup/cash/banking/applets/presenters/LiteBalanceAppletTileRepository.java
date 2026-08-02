package com.squareup.cash.banking.applets.presenters;

import androidx.core.os.BundleKt;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.molecule.RecompositionMode;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.exchangedata.real.RealFxExchangeRateStreamingSubscriber;
import com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.transfers.data.TransferType;
import com.squareup.cash.wallet.presenters.CardAppletTileRepository;
import com.squareup.cash.wallet.presenters.RealCardAppletTileRepository;
import com.squareup.protos.common.CurrencyCode;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes5.dex */
public final class LiteBalanceAppletTileRepository implements BalanceAppletTileRepository {
    public final ReadonlyStateFlow _model;
    public final FinishSetupTileBadgeCounter accountAndRoutingStateFlow;
    public final Flow addCashEnabled;
    public final ChannelFlowTransformLatest balanceSnapshot;
    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 fxExchangeRate;
    public final TransferManager transferManager;

    public LiteBalanceAppletTileRepository(RealBalanceSnapshotManager realBalanceSnapshotManager, RealDemandDepositAccountManager realDemandDepositAccountManager, RealStatusAndLimitsManager realStatusAndLimitsManager, RealFeatureEligibilityRepository realFeatureEligibilityRepository, CardAppletTileRepository cardAppletTileRepository, RealFxExchangeRateStreamingSubscriber realFxExchangeRateStreamingSubscriber, CoroutineScope coroutineScope, TransferManager transferManager) {
        this.transferManager = transferManager;
        this.balanceSnapshot = realBalanceSnapshotManager.select();
        this.addCashEnabled = realStatusAndLimitsManager.addCashEnabled();
        CurrencyCode currencyCode = CurrencyCode.USD;
        CurrencyCode currencyCode2 = CurrencyCode.MXN;
        currencyCode.getClass();
        currencyCode2.getClass();
        this.fxExchangeRate = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(FlowKt.flowOn(FlowKt.channelFlow(new RealFidesmoClient$observeDeviceState$1(realFxExchangeRateStreamingSubscriber, currencyCode, currencyCode2, (Continuation) null, 9)), realFxExchangeRateStreamingSubscriber.ioDispatcher), 24);
        this.accountAndRoutingStateFlow = FlowKt.combine(realDemandDepositAccountManager.selectUiDda(), new FinishSetupTileBadgeCounter(10, realFeatureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.DDA_TAB}), ((RealCardAppletTileRepository) cardAppletTileRepository).nullStateCardDetails, new LiteBalanceAppletTileRepository$accountAndRoutingStateFlow$1(4, null, 0));
        RecompositionMode recompositionMode = RecompositionMode.ContextClock;
        this._model = FlowKt.stateIn(BundleKt.moleculeFlow$default(new CashtagViewKt$$ExternalSyntheticLambda10(this, 2)), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), null);
    }

    @Override // com.squareup.cash.banking.applets.presenters.BalanceAppletTileRepository
    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 addMoneyTransferData() {
        return ((RealTransferManager) this.transferManager).transferData(TransferType.ADD_CASH, true);
    }

    @Override // com.squareup.cash.banking.applets.presenters.BalanceAppletTileRepository
    public final ReadonlyStateFlow balanceModel() {
        return this._model;
    }

    @Override // com.squareup.cash.banking.applets.presenters.BalanceAppletTileRepository
    public final RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 withdrawTransferData() {
        return ((RealTransferManager) this.transferManager).transferData(TransferType.CASH_OUT, true);
    }
}
