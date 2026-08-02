package com.squareup.cash.history.navigation;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.room.RoomDatabase$closeBarrier$1;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.payments.backend.real.RealPaymentActionCompletionDispatcher;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.protos.cash.investcrypto.server.TradingService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.investing.InvestingService;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class PaymentActionNavigator implements UiActivitySetupTeardown {
    public final Activity context;
    public final Navigator navigator;
    public final PaymentActionHandler paymentActionHandler;
    public final PaymentManager paymentManager;
    public final RealRouter$Factory$Impl routerFactory;

    public PaymentActionNavigator(Activity activity, RealRouter$Factory$Impl realRouter$Factory$Impl, PaymentActionHandler$Factory$Impl paymentActionHandler$Factory$Impl, PaymentManager paymentManager, Navigator navigator, RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1) {
        navigator.getClass();
        this.context = activity;
        this.routerFactory = realRouter$Factory$Impl;
        this.paymentManager = paymentManager;
        this.navigator = navigator;
        PaymentActionHandler.MetroFactory metroFactory = paymentActionHandler$Factory$Impl.delegateFactory;
        RealIntentFactory realIntentFactory = (RealIntentFactory) metroFactory.intentFactory.invoke();
        RealLegacyActivityEntityManager realLegacyActivityEntityManager = (RealLegacyActivityEntityManager) metroFactory.activityEntityManager.invoke();
        PaymentManager paymentManager2 = (PaymentManager) metroFactory.paymentManager.invoke();
        FlowStarter flowStarter = (FlowStarter) metroFactory.flowStarter.invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.invoke();
        RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) metroFactory.balanceSnapshotManager.invoke();
        RealInstrumentManager realInstrumentManager = (RealInstrumentManager) metroFactory.instrumentManager.invoke();
        AppConfigManager appConfigManager = (AppConfigManager) metroFactory.appConfig.invoke();
        RealClientSyncer realClientSyncer = (RealClientSyncer) metroFactory.clientSyncer.invoke();
        RealProfileSyncer realProfileSyncer = (RealProfileSyncer) metroFactory.profileSyncer.invoke();
        AppService appService = (AppService) metroFactory.appService.invoke();
        CryptoService cryptoService = (CryptoService) metroFactory.cryptoService.invoke();
        TradingService tradingService = (TradingService) metroFactory.tradingService.invoke();
        InvestingService investingService = (InvestingService) metroFactory.investingService.invoke();
        LendingAppService lendingAppService = (LendingAppService) metroFactory.lendingAppService.invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory.cashDatabase.invoke();
        RealClientRouteParser realClientRouteParser = (RealClientRouteParser) metroFactory.clientRouteParser.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.ioDispatcher.invoke();
        ProductionAttributionEventEmitter productionAttributionEventEmitter = (ProductionAttributionEventEmitter) metroFactory.attributionEventEmitter.invoke();
        RealSupportNavigator realSupportNavigator = (RealSupportNavigator) metroFactory.supportNavigator.invoke();
        RealCustomerStore realCustomerStore = (RealCustomerStore) metroFactory.customerStore.invoke();
        Analytics analytics = (Analytics) metroFactory.analytics.invoke();
        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) metroFactory.uuidGenerator.invoke();
        RealPaymentActionCompletionDispatcher realPaymentActionCompletionDispatcher = (RealPaymentActionCompletionDispatcher) metroFactory.paymentActionCompletionDispatcher.invoke();
        CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) metroFactory.scope).value;
        realIntentFactory.getClass();
        realLegacyActivityEntityManager.getClass();
        paymentManager2.getClass();
        flowStarter.getClass();
        androidStringManager.getClass();
        realBalanceSnapshotManager.getClass();
        realInstrumentManager.getClass();
        appConfigManager.getClass();
        realClientSyncer.getClass();
        realProfileSyncer.getClass();
        appService.getClass();
        cryptoService.getClass();
        tradingService.getClass();
        investingService.getClass();
        lendingAppService.getClass();
        cashAccountDatabaseImpl.getClass();
        realClientRouteParser.getClass();
        coroutineContext.getClass();
        productionAttributionEventEmitter.getClass();
        realSupportNavigator.getClass();
        realCustomerStore.getClass();
        analytics.getClass();
        realUuidGenerator.getClass();
        realPaymentActionCompletionDispatcher.getClass();
        coroutineScope.getClass();
        this.paymentActionHandler = new PaymentActionHandler(realIntentFactory, realLegacyActivityEntityManager, paymentManager2, flowStarter, androidStringManager, realBalanceSnapshotManager, realInstrumentManager, appConfigManager, realClientSyncer, realProfileSyncer, appService, cryptoService, tradingService, investingService, lendingAppService, cashAccountDatabaseImpl, realClientRouteParser, coroutineContext, productionAttributionEventEmitter, realSupportNavigator, realCustomerStore, analytics, realUuidGenerator, realPaymentActionCompletionDispatcher, coroutineScope, roomDatabase$closeBarrier$1);
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealBoostSelector.AnonymousClass1((Continuation) null, this, 16), 1);
        return StateFlowKt.noOpTeardown;
    }
}
