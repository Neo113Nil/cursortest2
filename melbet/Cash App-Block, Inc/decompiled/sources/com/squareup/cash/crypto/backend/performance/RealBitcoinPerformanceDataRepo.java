package com.squareup.cash.crypto.backend.performance;

import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.history.navigation.PaymentActionHandler$confirmPayment$1$2;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.util.money.CurrencyConverter$Factory;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes6.dex */
public final class RealBitcoinPerformanceDataRepo {
    public final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 bitcoinBalance;
    public final StateFlowImpl bitcoinBalanceVersion;
    public final Flow bitcoinPerformanceSummary;
    public final Flow bitcoinPerformanceSummaryAndDetails;
    public final StateFlowImpl lastPerformanceSummaryUpdated;
    public final StateFlowImpl performanceDataState;

    public RealBitcoinPerformanceDataRepo(SyncValueReader syncValueReader, RealCryptoValueRepo realCryptoValueRepo, RealJurisdictionConfigManager realJurisdictionConfigManager, RealCryptoBalanceRepo realCryptoBalanceRepo, CurrencyConverter$Factory currencyConverter$Factory) {
        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new CardModelView$cardHeat$$inlined$map$1(realJurisdictionConfigManager.select(), 21));
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(BitcoinPerformanceDataState.FRESH);
        this.performanceDataState = MutableStateFlow;
        this.bitcoinBalanceVersion = FlowKt.MutableStateFlow(0L);
        Continuation continuation = null;
        this.lastPerformanceSummaryUpdated = FlowKt.MutableStateFlow(null);
        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(syncValueReader.getSingleValue(AndroidSyncValueSpecs.BitcoinPerformanceSummary), new RealBitcoinPerformanceDataRepo$bitcoinBalance$1(this, null, 1), 3);
        StateFlow singleValue = syncValueReader.getSingleValue(AndroidSyncValueSpecs.BitcoinPerformanceDetails);
        StateFlow singleValue2 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.BitcoinPerformanceDetailsUserInterface);
        this.bitcoinBalance = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(realCryptoBalanceRepo.getBitcoinBalance(), new RealBitcoinPerformanceDataRepo$bitcoinBalance$1(this, null, 0), 3);
        ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(distinctUntilChanged, 24), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, this, currencyConverter$Factory, 9));
        Flow distinctUntilChanged2 = FlowKt.distinctUntilChanged(FlowKt.combine(flowKt__MergeKt$flatMapConcat$$inlined$map$1, realCryptoValueRepo.valuePerBitcoin(null), MutableStateFlow, transformLatest, new RealBitcoinPerformanceDataRepo$bitcoinPerformanceSummary$1(5, null)));
        this.bitcoinPerformanceSummary = distinctUntilChanged2;
        this.bitcoinPerformanceSummaryAndDetails = FlowKt.distinctUntilChanged(FlowKt.combine(singleValue, transformLatest, distinctUntilChanged2, singleValue2, new PaymentActionHandler$confirmPayment$1$2(this, continuation, 1)));
    }
}
