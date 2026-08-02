package com.squareup.cash.crypto.backend.balance;

import androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2;
import androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.webkit.internal.WebViewGlueCommunicator;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.stablecoin.capability.api.StablecoinCapability;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import com.squareup.cash.util.money.RealCurrencyConverter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;

/* loaded from: classes.dex */
public final class RealCryptoBalanceRepo {
    public final FeatureFlagManager featureFlagManager;
    public final KeyValue hasStablecoinActivity;
    public final InstrumentQueries instrumentQueries;
    public final CoroutineContext ioDispatcher;
    public final RealRestrictedBalanceStore restrictedBalanceStore;
    public final Signal signOut;
    public final RealStablecoinCapabilityHelper stablecoinCapabilityHelper;
    public final SyncValueReader syncValueReader;

    public RealCryptoBalanceRepo(CashAccountDatabaseImpl cashAccountDatabaseImpl, SyncValueReader syncValueReader, FeatureFlagManager featureFlagManager, RealStablecoinCapabilityHelper realStablecoinCapabilityHelper, RealRestrictedBalanceStore realRestrictedBalanceStore, CoroutineContext coroutineContext, Signal signal, KeyValue keyValue) {
        this.syncValueReader = syncValueReader;
        this.featureFlagManager = featureFlagManager;
        this.stablecoinCapabilityHelper = realStablecoinCapabilityHelper;
        this.restrictedBalanceStore = realRestrictedBalanceStore;
        this.ioDispatcher = coroutineContext;
        this.signOut = signal;
        this.hasStablecoinActivity = keyValue;
        this.instrumentQueries = cashAccountDatabaseImpl.instrumentQueries;
    }

    public final Flow balanceForCurrency(CurrencyCode currencyCode) {
        CashInstrumentType cashInstrumentType = CashInstrumentType.CASH_BALANCE;
        RealCryptoBalanceRepo$$ExternalSyntheticLambda0 realCryptoBalanceRepo$$ExternalSyntheticLambda0 = new RealCryptoBalanceRepo$$ExternalSyntheticLambda0();
        InstrumentQueries instrumentQueries = this.instrumentQueries;
        instrumentQueries.getClass();
        cashInstrumentType.getClass();
        return StateFlowKt.runUntil(DBUtil.mapToOneOrNull(DBUtil.toFlow(new InstrumentQueries.ForCurrencyQuery(instrumentQueries, cashInstrumentType, currencyCode, new ViewTreeObservers$$ExternalSyntheticLambda3(1, realCryptoBalanceRepo$$ExternalSyntheticLambda0, instrumentQueries))), this.ioDispatcher), this.signOut);
    }

    public final ChannelFlowTransformLatest getBitcoinBalance() {
        return Trace.selectClientSyncValues(this.featureFlagManager, SyncValueType.BALANCE_SNAPSHOT, FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(balanceForCurrency(CurrencyCode.BTC), 7)), new AppLockMonitor$special$$inlined$map$2(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(this.syncValueReader.getAllValues(AndroidSyncValueSpecs.BalanceSnapshot), 8), 5));
    }

    public final FlowKt__MergeKt$flatMapConcat$$inlined$map$1 getStablecoinBalance() {
        Continuation continuation = null;
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.transformLatest(this.stablecoinCapabilityHelper.isAvailableFlow(StablecoinCapability.STABLECOIN), new AnchoredDraggableNode$drag$2(continuation, this, 11)), new EntitySyncerKt$hasSyncedFlow$1(this, continuation, 18), 3);
    }

    public final FinishSetupTileBadgeCounter restrictedBitcoinBalance(RealCurrencyConverter realCurrencyConverter) {
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 convert = WebViewGlueCommunicator.convert(Countries.asMoney(getBitcoinBalance()), realCurrencyConverter);
        RealRestrictedBalanceStore realRestrictedBalanceStore = this.restrictedBalanceStore;
        return FlowKt.combine(convert, new RealGooglePayer$createWallet$$inlined$filter$1(realRestrictedBalanceStore.syncValueReader.getSingleValue(AndroidSyncValueSpecs.CrowRestrictionsData), 1), realRestrictedBalanceStore.select(), new AnchoredDraggableKt$snapTo$2());
    }
}
