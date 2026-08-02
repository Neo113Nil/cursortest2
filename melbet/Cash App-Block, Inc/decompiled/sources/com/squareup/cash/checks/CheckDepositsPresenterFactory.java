package com.squareup.cash.checks;

import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.ui.node.NodeChain;
import androidx.datastore.core.SimpleActor;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.home.LocalHomeGeoPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import coil3.ComponentRegistry;
import coil3.ImageLoader$Builder;
import com.google.mlkit.vision.common.zzb;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.activity.backend.RealActivityFeedProducer;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.buynowpaylater.presenters.AfterPayInfoSheetPresenter$Factory$Impl;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDetailsOverflowActionSheetPresenter$Factory$Impl;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDetailsPresenter$Factory$Impl;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDocumentPresenter$Factory$Impl;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderHubPresenter$Factory$Impl;
import com.squareup.cash.buynowpaylater.screens.AfterPayInfoSheetScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDetailsScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDocumentScreen;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderHubScreen;
import com.squareup.cash.buynowpaylater.screens.OrderDetailsOverflowActionSheetScreen;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.checks.CaptureCheckFacePresenter;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.checks.screens.CaptureCheckFaceScreen;
import com.squareup.cash.checks.screens.CheckDepositAmountScreen;
import com.squareup.cash.checks.screens.ConfirmBackOfCheckScreen;
import com.squareup.cash.checks.screens.ConfirmFrontOfCheckScreen;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.checks.screens.VerifyCheckDialogScreen;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.datefilterbar.backend.real.RealDateFilterGenerator;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$MetroFactory;
import com.squareup.cash.earnings.backend.real.RealEarningsStreamsRepository;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.earnings.backend.real.RealPayerRepository;
import com.squareup.cash.earnings.presenters.EarningsActivityListPresenter$Factory$Impl;
import com.squareup.cash.earnings.presenters.home.EarningsHeaderPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.earnings.presenters.home.EarningsHomeAnalytics;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$Factory$Impl;
import com.squareup.cash.earnings.presenters.payers.AddPayerCustomersPresenter$Factory$Impl;
import com.squareup.cash.earnings.presenters.payers.PayerTaggingPromptPresenter$Factory$Impl;
import com.squareup.cash.earnings.presenters.streamdetail.EarningsStreamDetailPresenter$Factory$Impl;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.earnings.screens.PayerTaggingPromptSheet;
import com.squareup.cash.earnings.screens.home.EarningsActivityListScreen;
import com.squareup.cash.earnings.screens.home.EarningsHomeScreen;
import com.squareup.cash.earnings.screens.streamdetail.EarningsStreamDetailScreen;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentLinkingOptionManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.presenters.InstrumentSelectionBlockerPresenter;
import com.squareup.cash.instruments.presenters.InstrumentSelectionBlockerPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.InstrumentSelectionLoadingPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.InstrumentSelectionPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.TransferOptionPickerPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.TransferOptionPickerResolver;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.instruments.screens.InstrumentSelectionScreen;
import com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs;
import com.squareup.cash.instruments.screens.TransferOptionPickerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$MetroFactory;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.cryptoinvestflow.service.CryptoInvestFlowService;
import com.squareup.protos.franklin.app.AppService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import squareup.cash.moneta.api.v1_0.MonetaService;
import squareup.cash.out.api.v1_0.CashOutService;

/* loaded from: classes.dex */
public final class CheckDepositsPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object captureCheckFacePresenter;
    public final Object checkDepositAmountPresenter;
    public final Object confirmBack;
    public final Object confirmFront;
    public final Object verifyCheckDeposit;

    public CheckDepositsPresenterFactory(ConfirmBackOfCheckPresenter$Factory$Impl confirmBackOfCheckPresenter$Factory$Impl, ConfirmFrontOfCheckPresenter$Factory$Impl confirmFrontOfCheckPresenter$Factory$Impl, VerifyCheckDepositPresenter$Factory$Impl verifyCheckDepositPresenter$Factory$Impl, VerifyCheckDialogPresenter$Factory$Impl verifyCheckDialogPresenter$Factory$Impl, CheckDepositAmountPresenter$Factory$Impl checkDepositAmountPresenter$Factory$Impl, CaptureCheckFacePresenter$Factory$Impl captureCheckFacePresenter$Factory$Impl) {
        this.$r8$classId = 0;
        this.confirmBack = confirmBackOfCheckPresenter$Factory$Impl;
        this.confirmFront = confirmFrontOfCheckPresenter$Factory$Impl;
        this.verifyCheckDeposit = verifyCheckDepositPresenter$Factory$Impl;
        this.checkDepositAmountPresenter = checkDepositAmountPresenter$Factory$Impl;
        this.captureCheckFacePresenter = captureCheckFacePresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.captureCheckFacePresenter;
        Object obj2 = this.checkDepositAmountPresenter;
        Object obj3 = this.verifyCheckDeposit;
        Object obj4 = this.confirmFront;
        Object obj5 = this.confirmBack;
        switch (i) {
            case 0:
                screen.getClass();
                if (screen instanceof ConfirmBackOfCheckScreen) {
                    Analytics analytics = (Analytics) ((ConfirmBackOfCheckPresenter$Factory$Impl) obj5).delegateFactory.analytics.getValue();
                    analytics.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ConfirmBackOfCheckPresenter(analytics, (ConfirmBackOfCheckScreen) screen, screenNavigator));
                }
                if (screen instanceof ConfirmFrontOfCheckScreen) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory = ((ConfirmFrontOfCheckPresenter$Factory$Impl) obj4).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.blockerFlowAnalytics.invoke();
                    Analytics analytics2 = (Analytics) metroFactory.analytics.getValue();
                    factory.getClass();
                    analytics2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ConfirmFrontOfCheckPresenter(factory, analytics2, (ConfirmFrontOfCheckScreen) screen, screenNavigator));
                }
                if (screen instanceof CheckDepositAmountScreen) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory2 = ((CheckDepositAmountPresenter$Factory$Impl) obj2).delegateFactory;
                    Analytics analytics3 = (Analytics) metroFactory2.analytics.getValue();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) metroFactory2.blockerFlowAnalytics.invoke();
                    analytics3.getClass();
                    blockerFlowListener.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CheckDepositAmountPresenter(analytics3, blockerFlowListener, (CheckDepositAmountScreen) screen, screenNavigator));
                }
                if (screen instanceof VerifyCheckDepositScreen) {
                    VerifyCheckDepositPresenter.MetroFactory metroFactory3 = ((VerifyCheckDepositPresenter$Factory$Impl) obj3).delegateFactory;
                    Analytics analytics4 = (Analytics) metroFactory3.analytics.getValue();
                    BlockerFlowListener blockerFlowListener2 = (BlockerFlowListener) metroFactory3.blockerFlowAnalytics.invoke();
                    AppService appService = (AppService) metroFactory3.appService.getValue();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory3.blockersNavigator.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory3.stringManager.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) metroFactory3.moneyFormatterFactory.invoke();
                    analytics4.getClass();
                    blockerFlowListener2.getClass();
                    appService.getClass();
                    blockersDataNavigator.getClass();
                    androidStringManager.getClass();
                    factory2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDepositPresenter((VerifyCheckDepositScreen) screen, screenNavigator, analytics4, blockerFlowListener2, appService, blockersDataNavigator, androidStringManager, factory2));
                }
                if (screen instanceof VerifyCheckDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((VerifyCheckDialogScreen) screen, screenNavigator));
                }
                if (!(screen instanceof CaptureCheckFaceScreen)) {
                    return null;
                }
                CaptureCheckFacePresenter.MetroFactory metroFactory4 = ((CaptureCheckFacePresenter$Factory$Impl) obj).delegateFactory;
                ErrorReporter errorReporter = (ErrorReporter) metroFactory4.errorReporter.lambda.invoke();
                IntentLauncher intentLauncher = (IntentLauncher) metroFactory4.intentLauncher.invoke();
                AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory4.stringManager.lambda.invoke();
                AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) metroFactory4.permissionManager.invoke();
                errorReporter.getClass();
                intentLauncher.getClass();
                androidStringManager2.getClass();
                androidPermissionManager.getClass();
                return MoleculePresenterKt.asPresenter$default(new CaptureCheckFacePresenter(errorReporter, intentLauncher, androidStringManager2, androidPermissionManager, (CaptureCheckFaceScreen) screen, screenNavigator));
            case 1:
                screen.getClass();
                if (screen instanceof AfterPayOrderDetailsScreen) {
                    HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory = ((AfterPayOrderDetailsPresenter$Factory$Impl) obj5).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) helpSheetPresenter$MetroFactory.routerFactory.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) helpSheetPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
                    CashApProxyClientService cashApProxyClientService = (CashApProxyClientService) helpSheetPresenter$MetroFactory.syncValueReader.getValue();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) helpSheetPresenter$MetroFactory.errorReporter.lambda.invoke();
                    factory3.getClass();
                    realRouter$Factory$Impl.getClass();
                    cashApProxyClientService.getClass();
                    androidStringManager3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(factory3, realRouter$Factory$Impl, cashApProxyClientService, androidStringManager3, (AfterPayOrderDetailsScreen) screen, screenNavigator));
                }
                if (screen instanceof AfterPayOrderHubScreen) {
                    Instrument$Adapter instrument$Adapter = ((AfterPayOrderHubPresenter$Factory$Impl) obj4).delegateFactory;
                    n nVar = (n) ((AndroidFileSaver.MetroFactory) instrument$Adapter.cash_instrument_typeAdapter).invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) instrument$Adapter.card_brandAdapter).lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) ((Provider) instrument$Adapter.balance_currencyAdapter).invoke();
                    coroutineContext.getClass();
                    realRouter$Factory$Impl2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(nVar, coroutineContext, realRouter$Factory$Impl2, (AfterPayOrderHubScreen) screen, screenNavigator));
                }
                if (screen instanceof AfterPayInfoSheetScreen) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory5 = ((AfterPayInfoSheetPresenter$Factory$Impl) obj3).delegateFactory;
                    RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) metroFactory5.blockerFlowAnalytics.invoke();
                    Analytics analytics5 = (Analytics) metroFactory5.analytics.getValue();
                    realRouter$Factory$Impl3.getClass();
                    analytics5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new MusicPresenter(realRouter$Factory$Impl3, analytics5, (AfterPayInfoSheetScreen) screen, screenNavigator));
                }
                if (screen instanceof AfterPayOrderDocumentScreen) {
                    TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = ((AfterPayOrderDocumentPresenter$Factory$Impl) obj).delegateFactory;
                    CashApProxyClientService cashApProxyClientService2 = (CashApProxyClientService) transferInPresenter$MetroFactory.analytics.getValue();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
                    IntentLauncher intentLauncher2 = (IntentLauncher) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    cashApProxyClientService2.getClass();
                    androidStringManager4.getClass();
                    intentLauncher2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(cashApProxyClientService2, androidStringManager4, intentLauncher2, (AfterPayOrderDocumentScreen) screen, screenNavigator));
                }
                if (!(screen instanceof OrderDetailsOverflowActionSheetScreen)) {
                    return null;
                }
                CheckDepositAmountPresenter.MetroFactory metroFactory6 = ((AfterPayOrderDetailsOverflowActionSheetPresenter$Factory$Impl) obj2).delegateFactory;
                RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) metroFactory6.blockerFlowAnalytics.invoke();
                Analytics analytics6 = (Analytics) metroFactory6.analytics.getValue();
                realRouter$Factory$Impl4.getClass();
                analytics6.getClass();
                return MoleculePresenterKt.asPresenter$default(new MusicPresenter(realRouter$Factory$Impl4, analytics6, (OrderDetailsOverflowActionSheetScreen) screen, screenNavigator));
            case 2:
                screen.getClass();
                if (screen instanceof EarningsActivityListScreen) {
                    ComponentRegistry.Builder builder = ((EarningsActivityListPresenter$Factory$Impl) obj5).delegateFactory;
                    SessionManager sessionManager = (SessionManager) ((LambdaProvider) builder.interceptors).lambda.invoke();
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) ((LambdaProvider) builder.mappers).lambda.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) builder.keyers).invoke();
                    ActivityItemPresenter.Factory factory4 = (ActivityItemPresenter.Factory) ((Provider) builder.lazyFetcherFactories).invoke();
                    RealActivityFeedProducer realActivityFeedProducer = (RealActivityFeedProducer) ((RealLocaleAssetProvider$MetroFactory) builder.lazyDecoderFactories).invoke();
                    sessionManager.getClass();
                    androidStringManager5.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl.getClass();
                    factory4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter(sessionManager, androidStringManager5, (EarningsActivityListScreen) screen, screenNavigator, realActivityEmbeddedPresenter$Factory$Impl, factory4, realActivityFeedProducer));
                }
                if (screen instanceof EarningsHomeScreen) {
                    ArticlePresenter.MetroFactory metroFactory7 = ((EarningsHomePresenter$Factory$Impl) obj4).delegateFactory;
                    RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) metroFactory7.contactSupportNavigator.invoke();
                    ActivitiesManager.Factory factory5 = (ActivitiesManager.Factory) metroFactory7.linkNavigator.invoke();
                    SessionManager sessionManager2 = (SessionManager) ((LambdaProvider) metroFactory7.stringManager).lambda.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory7.viewedArticlesStore.invoke();
                    DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) metroFactory7.supportStatus.invoke();
                    zzb zzbVar = (zzb) ((FillrInitializer.MetroFactory) metroFactory7.transactionService).invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) metroFactory7.articlesService).getValue();
                    RealEarningsSyncStateRepository realEarningsSyncStateRepository = (RealEarningsSyncStateRepository) metroFactory7.launcher.invoke();
                    Result result = (Result) ((AndroidFileSaver.MetroFactory) metroFactory7.analytics).invoke();
                    RealDisclosureProvider realDisclosureProvider = (RealDisclosureProvider) metroFactory7.routerFactory.invoke();
                    EarningsHomeAnalytics earningsHomeAnalytics = (EarningsHomeAnalytics) metroFactory7.supportPhoneService.invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) metroFactory7.incidentsService.invoke();
                    AndroidStringManager androidStringManager6 = (AndroidStringManager) ((LambdaProvider) metroFactory7.dateFormatManager).lambda.invoke();
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) ((LambdaProvider) metroFactory7.clock).lambda.invoke();
                    EarningsHeaderPresenter$AssistedInjectionFactory$Impl earningsHeaderPresenter$AssistedInjectionFactory$Impl = (EarningsHeaderPresenter$AssistedInjectionFactory$Impl) ((InstanceFactory) metroFactory7.activityDataBridge).value;
                    CoroutineContext coroutineContext2 = (CoroutineContext) ((LambdaProvider) metroFactory7.observabilityManager).lambda.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) ((LambdaProvider) metroFactory7.moshi).lambda.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) metroFactory7.viewTokenGenerator.invoke();
                    realRouter$Factory$Impl5.getClass();
                    factory5.getClass();
                    sessionManager2.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl2.getClass();
                    defaultActivityItemEventHandler$Factory$Impl.getClass();
                    syncValueReader.getClass();
                    realEarningsSyncStateRepository.getClass();
                    realDisclosureProvider.getClass();
                    earningsHomeAnalytics.getClass();
                    realClientSyncer.getClass();
                    androidStringManager6.getClass();
                    androidDateFormatManager.getClass();
                    earningsHeaderPresenter$AssistedInjectionFactory$Impl.getClass();
                    coroutineContext2.getClass();
                    errorReporter2.getClass();
                    sampleStrategy.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EarningsHomePresenter(realRouter$Factory$Impl5, factory5, sessionManager2, realActivityEmbeddedPresenter$Factory$Impl2, defaultActivityItemEventHandler$Factory$Impl, zzbVar, syncValueReader, realEarningsSyncStateRepository, result, realDisclosureProvider, earningsHomeAnalytics, realClientSyncer, androidStringManager6, androidDateFormatManager, earningsHeaderPresenter$AssistedInjectionFactory$Impl, coroutineContext2, (EarningsHomeScreen) screen, screenNavigator, errorReporter2, sampleStrategy));
                }
                if (screen instanceof AddPayerCustomersScreen) {
                    LocalPosCheckInPresenter.MetroFactory metroFactory8 = ((AddPayerCustomersPresenter$Factory$Impl) obj3).delegateFactory;
                    RealPayerRepository realPayerRepository = (RealPayerRepository) metroFactory8.permissionManager.invoke();
                    RealContactRepository realContactRepository = (RealContactRepository) metroFactory8.launcher.invoke();
                    RealRecipientRepository realRecipientRepository = (RealRecipientRepository) metroFactory8.store.invoke();
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) metroFactory8.stringManager.lambda.invoke();
                    realPayerRepository.getClass();
                    realContactRepository.getClass();
                    realRecipientRepository.getClass();
                    androidStringManager7.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(realPayerRepository, realContactRepository, realRecipientRepository, androidStringManager7, (AddPayerCustomersScreen) screen, screenNavigator));
                }
                if (screen instanceof PayerTaggingPromptSheet) {
                    SimpleActor simpleActor = ((PayerTaggingPromptPresenter$Factory$Impl) obj2).delegateFactory;
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) ((LambdaProvider) simpleActor.scope).lambda.invoke();
                    RealPayerRepository realPayerRepository2 = (RealPayerRepository) ((Provider) simpleActor.consumeMessage).invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) simpleActor.messageQueue).value;
                    LocalizedMoneyFormatter.Factory factory6 = (LocalizedMoneyFormatter.Factory) ((Provider) simpleActor.remainingMessages).invoke();
                    androidStringManager8.getClass();
                    realPayerRepository2.getClass();
                    coroutineScope.getClass();
                    factory6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(androidStringManager8, realPayerRepository2, coroutineScope, factory6, (PayerTaggingPromptSheet) screen, screenNavigator));
                }
                if (!(screen instanceof EarningsStreamDetailScreen)) {
                    return null;
                }
                NodeChain nodeChain = ((EarningsStreamDetailPresenter$Factory$Impl) obj).delegateFactory;
                RealEarningsStreamsRepository realEarningsStreamsRepository = (RealEarningsStreamsRepository) ((RealEarningsChartRepository$MetroFactory) nodeChain.layoutNode).invoke();
                RealDateFilterGenerator realDateFilterGenerator = (RealDateFilterGenerator) ((Provider) nodeChain.sentinelHead).invoke();
                RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl3 = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) nodeChain.innerCoordinator).invoke();
                AndroidStringManager androidStringManager9 = (AndroidStringManager) ((LambdaProvider) nodeChain.outerCoordinator).lambda.invoke();
                RealLocaleManager realLocaleManager = (RealLocaleManager) ((LambdaProvider) nodeChain.tail).lambda.invoke();
                AndroidClock androidClock = (AndroidClock) ((LambdaProvider) nodeChain.head).lambda.invoke();
                ActivitiesManager.Factory factory7 = (ActivitiesManager.Factory) ((Provider) nodeChain.current).invoke();
                SessionManager sessionManager3 = (SessionManager) ((LambdaProvider) nodeChain.buffer).lambda.invoke();
                LocalizedMoneyFormatter.Factory factory8 = (LocalizedMoneyFormatter.Factory) ((Provider) nodeChain.stack).invoke();
                CoroutineContext coroutineContext3 = (CoroutineContext) ((LambdaProvider) nodeChain.cachedDiffer).lambda.invoke();
                realDateFilterGenerator.getClass();
                realActivityEmbeddedPresenter$Factory$Impl3.getClass();
                androidStringManager9.getClass();
                realLocaleManager.getClass();
                androidClock.getClass();
                factory7.getClass();
                sessionManager3.getClass();
                factory8.getClass();
                coroutineContext3.getClass();
                return MoleculePresenterKt.asPresenter$default(new TransfersPresenter(realEarningsStreamsRepository, realDateFilterGenerator, realActivityEmbeddedPresenter$Factory$Impl3, androidStringManager9, realLocaleManager, androidClock, factory7, sessionManager3, factory8, coroutineContext3, (EarningsStreamDetailScreen) screen, screenNavigator));
            default:
                screen.getClass();
                if (screen instanceof InstrumentSelectionScreen) {
                    RememberEventDispatcher rememberEventDispatcher = ((InstrumentSelectionPresenter$Factory$Impl) obj5).delegateFactory;
                    AppConfigManager appConfigManager = (AppConfigManager) ((DoubleCheck) rememberEventDispatcher.abandoning).getValue();
                    AndroidStringManager androidStringManager10 = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher.traceContext).lambda.invoke();
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) ((Provider) rememberEventDispatcher.remembering).invoke();
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) ((Provider) rememberEventDispatcher.currentRememberingList).invoke();
                    RealInstrumentLinkingOptionManager realInstrumentLinkingOptionManager = (RealInstrumentLinkingOptionManager) ((Provider) rememberEventDispatcher.leaving).invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) rememberEventDispatcher.sideEffects).invoke();
                    RealStatusAndLimitsManager realStatusAndLimitsManager = (RealStatusAndLimitsManager) ((Provider) rememberEventDispatcher.rememberSet).invoke();
                    LocalizedMoneyFormatter.Factory factory9 = (LocalizedMoneyFormatter.Factory) ((Provider) rememberEventDispatcher.releasing).invoke();
                    FlowStarter flowStarter = (FlowStarter) ((DoubleCheck) rememberEventDispatcher.ignoreLeavingSet).getValue();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) ((Provider) rememberEventDispatcher.pausedPlaceholders).invoke();
                    GooglePayPaymentsClient googlePayPaymentsClient = (GooglePayPaymentsClient) ((Provider) rememberEventDispatcher.nestedRemembersLists).invoke();
                    appConfigManager.getClass();
                    androidStringManager10.getClass();
                    realBalanceSnapshotManager.getClass();
                    realInstrumentManager.getClass();
                    realInstrumentLinkingOptionManager.getClass();
                    realProfileManager.getClass();
                    realStatusAndLimitsManager.getClass();
                    factory9.getClass();
                    flowStarter.getClass();
                    realFamilyAccountsManager.getClass();
                    googlePayPaymentsClient.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TransfersPresenter(appConfigManager, androidStringManager10, realBalanceSnapshotManager, realInstrumentManager, realInstrumentLinkingOptionManager, realProfileManager, realStatusAndLimitsManager, factory9, flowStarter, realFamilyAccountsManager, googlePayPaymentsClient, (InstrumentSelectionScreen) screen, screenNavigator));
                }
                if (screen instanceof InstrumentSelectionBlockerScreen) {
                    TaxAuthorizationPresenter.MetroFactory metroFactory9 = ((InstrumentSelectionBlockerPresenter$Factory$Impl) obj4).delegateFactory;
                    com.squareup.cash.cashlynxflow.service.v2.AppService appService2 = (com.squareup.cash.cashlynxflow.service.v2.AppService) metroFactory9.taxService.getValue();
                    BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) metroFactory9.blockersDataNavigator.invoke();
                    Analytics analytics7 = (Analytics) metroFactory9.flowStarter.getValue();
                    AndroidStringManager androidStringManager11 = (AndroidStringManager) metroFactory9.stringManager.lambda.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory9.appService.getValue();
                    appService2.getClass();
                    blockersDataNavigator2.getClass();
                    analytics7.getClass();
                    androidStringManager11.getClass();
                    featureFlagManager.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InstrumentSelectionBlockerPresenter(appService2, blockersDataNavigator2, analytics7, androidStringManager11, featureFlagManager, (InstrumentSelectionBlockerScreen) screen, screenNavigator));
                }
                if (screen instanceof InstrumentSelectionLoadingScreen) {
                    TaxAuthorizationPresenter.MetroFactory metroFactory10 = ((InstrumentSelectionLoadingPresenter$Factory$Impl) obj3).delegateFactory;
                    CashOutService cashOutService = (CashOutService) metroFactory10.taxService.getValue();
                    MonetaService monetaService = (MonetaService) metroFactory10.flowStarter.getValue();
                    CryptoInvestFlowService cryptoInvestFlowService = (CryptoInvestFlowService) metroFactory10.appService.getValue();
                    BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) metroFactory10.blockersDataNavigator.invoke();
                    AndroidStringManager androidStringManager12 = (AndroidStringManager) metroFactory10.stringManager.lambda.invoke();
                    cashOutService.getClass();
                    monetaService.getClass();
                    cryptoInvestFlowService.getClass();
                    blockersDataNavigator3.getClass();
                    androidStringManager12.getClass();
                    return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(cashOutService, monetaService, cryptoInvestFlowService, blockersDataNavigator3, androidStringManager12, (InstrumentSelectionLoadingScreen) screen, screenNavigator));
                }
                if (screen instanceof SelectPaymentInstrumentArgs) {
                    ImageLoader$Builder imageLoader$Builder = ((SelectPaymentInstrumentPresenter$Factory$Impl) obj2).delegateFactory;
                    AppConfigManager appConfigManager2 = (AppConfigManager) ((DoubleCheck) imageLoader$Builder.application).getValue();
                    AndroidStringManager androidStringManager13 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.defaults).lambda.invoke();
                    RealBalanceSnapshotManager realBalanceSnapshotManager2 = (RealBalanceSnapshotManager) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
                    RealInstrumentManager realInstrumentManager2 = (RealInstrumentManager) ((Provider) imageLoader$Builder.memoryCacheLazy).invoke();
                    RealInstrumentLinkingOptionManager realInstrumentLinkingOptionManager2 = (RealInstrumentLinkingOptionManager) ((Provider) imageLoader$Builder.diskCacheLazy).invoke();
                    RealProfileManager realProfileManager2 = (RealProfileManager) ((DelegateFactory) imageLoader$Builder.eventListenerFactory).invoke();
                    RealStatusAndLimitsManager realStatusAndLimitsManager2 = (RealStatusAndLimitsManager) ((Provider) imageLoader$Builder.componentRegistry).invoke();
                    LocalizedMoneyFormatter.Factory factory10 = (LocalizedMoneyFormatter.Factory) ((Provider) imageLoader$Builder.extras).invoke();
                    appConfigManager2.getClass();
                    androidStringManager13.getClass();
                    realBalanceSnapshotManager2.getClass();
                    realInstrumentManager2.getClass();
                    realInstrumentLinkingOptionManager2.getClass();
                    realProfileManager2.getClass();
                    realStatusAndLimitsManager2.getClass();
                    factory10.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter(appConfigManager2, androidStringManager13, realBalanceSnapshotManager2, realInstrumentManager2, realInstrumentLinkingOptionManager2, realProfileManager2, realStatusAndLimitsManager2, factory10, (SelectPaymentInstrumentArgs) screen, screenNavigator));
                }
                if (!(screen instanceof TransferOptionPickerScreen)) {
                    return null;
                }
                LocalHomeGeoPresenter.MetroFactory metroFactory11 = ((TransferOptionPickerPresenter$Factory$Impl) obj).delegateFactory;
                AndroidStringManager androidStringManager14 = (AndroidStringManager) metroFactory11.clock.lambda.invoke();
                RealBalanceSnapshotManager realBalanceSnapshotManager3 = (RealBalanceSnapshotManager) metroFactory11.store.invoke();
                RealInstrumentManager realInstrumentManager3 = (RealInstrumentManager) metroFactory11.cashMapPresenterFactory.invoke();
                SyncValueReader syncValueReader2 = (SyncValueReader) metroFactory11.syncer.getValue();
                TransferOptionPickerResolver transferOptionPickerResolver = (TransferOptionPickerResolver) metroFactory11.tabContentPresenterFactory.invoke();
                FlowStarter flowStarter2 = (FlowStarter) metroFactory11.featureFlagManager.getValue();
                ErrorReporter errorReporter3 = (ErrorReporter) metroFactory11.stringManager.lambda.invoke();
                SampleStrategy sampleStrategy2 = (SampleStrategy) metroFactory11.brandProfilePresenterFactory.invoke();
                androidStringManager14.getClass();
                realBalanceSnapshotManager3.getClass();
                realInstrumentManager3.getClass();
                syncValueReader2.getClass();
                transferOptionPickerResolver.getClass();
                flowStarter2.getClass();
                errorReporter3.getClass();
                sampleStrategy2.getClass();
                return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(androidStringManager14, realBalanceSnapshotManager3, realInstrumentManager3, syncValueReader2, transferOptionPickerResolver, flowStarter2, errorReporter3, sampleStrategy2, (TransferOptionPickerScreen) screen, screenNavigator));
        }
    }

    public /* synthetic */ CheckDepositsPresenterFactory(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.confirmBack = obj;
        this.confirmFront = obj2;
        this.verifyCheckDeposit = obj3;
        this.checkDepositAmountPresenter = obj4;
        this.captureCheckFacePresenter = obj5;
    }
}
