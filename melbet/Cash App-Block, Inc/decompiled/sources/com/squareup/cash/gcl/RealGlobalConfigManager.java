package com.squareup.cash.gcl;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.GeometryUtilsKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.media3.exoplayer.source.MediaLoadData;
import app.cash.badging.backend.RealBadger2;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import coil3.ComponentRegistry;
import coil3.RealImageLoader;
import coil3.gif.AnimatedImageDecoder;
import coil3.map.FileMapper;
import coil3.svg.SvgDecoder;
import com.fillr.e0;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.n;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.internal.mlkit_genai_prompt.zzado;
import com.google.android.gms.internal.mlkit_genai_prompt.zzhw;
import com.google.android.gms.internal.mlkit_genai_prompt.zzje;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.ActivityManagerModule;
import com.squareup.cash.activity.backend.loader.ActivityTabCache;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.benefits.applets.presenters.BankingBenefitsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.biometrics.RealBiometricsService;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelCache;
import com.squareup.cash.bitcoin.presenters.applet.disabled.BitcoinDisabledWidgetPlugin;
import com.squareup.cash.bitcoin.presenters.limits.util.NonCustodialBitcoinLimitsProvider;
import com.squareup.cash.bitcoin.presenters.limits.util.RealBitcoinLimitsProvider;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.RealPaidInBitcoinStateManager;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.flags.RealClientSyncFlags;
import com.squareup.cash.clientsync.persistence.ClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.FlaggedClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.SqlClientSyncTransactor;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.crypto.backend.payroll.RealCryptoPayrollProvider;
import com.squareup.cash.data.profile.RealAddressManager;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.profile.documents.RealLegalDocumentManager$MetroFactory;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.earningstracker.applets.presenters.EarningsAppletTilePresenter$Factory$Impl;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.exchangedata.real.RealFxExchangeRateStreamingSubscriber;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealLoginFeatureFlagsHandler;
import com.squareup.cash.fileupload.real.RealAndroidFileParser;
import com.squareup.cash.fileupload.real.RealFileUploadService;
import com.squareup.cash.fileupload.service.api.HttpFileUploadService;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.genie.backend.api.GenieAppConfig;
import com.squareup.cash.google.pay.CashLiteGooglePayProvisioningGateway$MetroFactory;
import com.squareup.cash.google.pay.GooglePayLoadingViewKt;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.api.Endpoints;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.money.applets.sections.PromotedAppletTileLocaleChangeIoSetupTeardown;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.moneybot.genie.MoneybotGenieModule$Companion$ProvideMoneybotGenieAppConfigMetroFactory;
import com.squareup.cash.observability.backend.api.ObservabilityExecutionContext;
import com.squareup.cash.payments.views.PaymentsViewFactory;
import com.squareup.cash.portfolio.graphs.RealInvestingGraphSmoother;
import com.squareup.cash.profile.views.ProfilePhotoInterceptor;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.ui.gcm.RealGcmRegistrar;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.work.data.real.RealTaxFormDownloader$MetroFactory;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.semaphore.api.SemaphoreService;
import com.squareup.protos.cash.ui.Image;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.coil.FastlyInterceptor;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.UiActivitySetupTeardown;
import com.squareup.util.logging.NoOpRetrofitLogger;
import com.squareup.wire.GrpcMethod;
import com.squareup.workflow1.internal.SubtreeManager;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import dev.zacsweers.metro.internal.MapProviderFactory;
import dev.zacsweers.metro.internal.SetFactory;
import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.HttpUrl;
import radiography.internal.RenderTreeStringKt;
import retrofit2.BuiltInConverters;
import retrofit2.CompletableFutureCallAdapterFactory;
import retrofit2.DefaultCallAdapterFactory;
import retrofit2.Retrofit;
import squareup.cash.savings.ArcadeElement;

/* loaded from: classes.dex */
public final class RealGlobalConfigManager implements UiActivitySetupTeardown {
    public static final long globalConfigTimeout;
    public final CoroutineContext ioDispatcher;
    public final GrpcMethod onboardingConfigManager;
    public final SessionManager sessionManager;

    static {
        Duration.Companion companion = Duration.Companion;
        globalConfigTimeout = DurationKt.toDuration(20, DurationUnit.SECONDS);
    }

    public RealGlobalConfigManager(CoroutineContext coroutineContext, SessionManager sessionManager, GrpcMethod grpcMethod) {
        this.ioDispatcher = coroutineContext;
        this.sessionManager = sessionManager;
        this.onboardingConfigManager = grpcMethod;
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new RealGlobalConfigManager$setup$$inlined$setupSingleCoroutine$default$1(null, this, 0), 1);
        return StateFlowKt.noOpTeardown;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider ioDispatcher;
        public final Provider onboardingConfigManager;
        public final Provider sessionManager;

        public MetroFactory(ActivityManagerModule activityManagerModule, InstanceFactory instanceFactory, DoubleCheck doubleCheck, RealPasscodeFlowStarter.MetroFactory metroFactory) {
            this.$r8$classId = 2;
            this.ioDispatcher = instanceFactory;
            this.sessionManager = doubleCheck;
            this.onboardingConfigManager = metroFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 3;
            int i3 = 2;
            int i4 = 0;
            int i5 = 1;
            Provider provider = this.onboardingConfigManager;
            Provider provider2 = this.sessionManager;
            Provider provider3 = this.ioDispatcher;
            switch (i) {
                case 0:
                    CoroutineContext coroutineContext = (CoroutineContext) provider3.invoke();
                    SessionManager sessionManager = (SessionManager) provider2.invoke();
                    GrpcMethod grpcMethod = (GrpcMethod) ((MetroFactory) provider).invoke();
                    coroutineContext.getClass();
                    sessionManager.getClass();
                    return new RealGlobalConfigManager(coroutineContext, sessionManager, grpcMethod);
                case 1:
                    SemaphoreService semaphoreService = (SemaphoreService) provider3.invoke();
                    RealRegionProvider realRegionProvider = (RealRegionProvider) provider2.invoke();
                    RealLoginFeatureFlagsHandler realLoginFeatureFlagsHandler = (RealLoginFeatureFlagsHandler) ((RealTrifleService.MetroFactory) provider).invoke();
                    semaphoreService.getClass();
                    realRegionProvider.getClass();
                    return new GrpcMethod(semaphoreService, realRegionProvider, realLoginFeatureFlagsHandler);
                case 2:
                    ActivitiesManager.Factory factory = (ActivitiesManager.Factory) provider3.invoke();
                    ActivityTabCache activityTabCache = (ActivityTabCache) provider2.invoke();
                    ActivityToken activityToken = (ActivityToken) ((RealPasscodeFlowStarter.MetroFactory) provider).invoke();
                    factory.getClass();
                    activityTabCache.getClass();
                    return factory.create(new ActivitiesManager.ActivityContext(activityToken, ActivityScope.MY_ACTIVITY, (ActivitiesManager.ActivityPageHandler) null, 12), activityTabCache);
                case 3:
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) ((InstanceFactory) provider3).value;
                    BankingBenefitsAppletTilePresenter$Factory$Impl bankingBenefitsAppletTilePresenter$Factory$Impl = (BankingBenefitsAppletTilePresenter$Factory$Impl) ((InstanceFactory) provider2).value;
                    UnleashContext unleashContext = (UnleashContext) ((RealGcmRegistrar.MetroFactory) provider).invoke();
                    lifecycleOwner.getClass();
                    bankingBenefitsAppletTilePresenter$Factory$Impl.getClass();
                    return zzado.bankingBenefitsApplet(lifecycleOwner, bankingBenefitsAppletTilePresenter$Factory$Impl, unleashContext);
                case 4:
                    AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) ((TreehouseFlows.MetroFactory) provider).invoke();
                    Context context = (Context) provider3.invoke();
                    RealIntentFactory realIntentFactory = (RealIntentFactory) provider2.invoke();
                    context.getClass();
                    realIntentFactory.getClass();
                    return new RealBiometricsService(androidBiometricsStore, context, realIntentFactory);
                case 5:
                    RealInvestingGraphSmoother realInvestingGraphSmoother = (RealInvestingGraphSmoother) ((ScoreUiFactory.MetroFactory) provider).invoke();
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) provider2.invoke();
                    androidClock.getClass();
                    androidDateFormatManager.getClass();
                    return new RealBitcoinGraphModelCache(realInvestingGraphSmoother, androidClock, androidDateFormatManager);
                case 6:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider3.invoke();
                    SubtreeManager subtreeManager = (SubtreeManager) ((RealBadger2.MetroFactory) provider).invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider2.invoke();
                    realBitcoinCapabilityProvider.getClass();
                    featureFlagManager.getClass();
                    return new BitcoinDisabledWidgetPlugin(realBitcoinCapabilityProvider, subtreeManager, featureFlagManager, i5);
                case 7:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider2 = (RealBitcoinCapabilityProvider) provider3.invoke();
                    n nVar = (n) ((RealFileDownloader.MetroFactory) provider).invoke();
                    RealDependentCustomerTokenRepository realDependentCustomerTokenRepository = (RealDependentCustomerTokenRepository) provider2.invoke();
                    realBitcoinCapabilityProvider2.getClass();
                    realDependentCustomerTokenRepository.getClass();
                    return new BitcoinDisabledWidgetPlugin(realBitcoinCapabilityProvider2, nVar, realDependentCustomerTokenRepository, i3);
                case 8:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider3 = (RealBitcoinCapabilityProvider) provider3.invoke();
                    Result result = (Result) ((BorrowUiFactory.MetroFactory) provider).invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    realBitcoinCapabilityProvider3.getClass();
                    featureFlagManager2.getClass();
                    return new BitcoinDisabledWidgetPlugin(realBitcoinCapabilityProvider3, result, featureFlagManager2, i4);
                case 9:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider4 = (RealBitcoinCapabilityProvider) provider3.invoke();
                    e0 e0Var = (e0) ((RealBrazeManager.MetroFactory) provider).invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider2.invoke();
                    realBitcoinCapabilityProvider4.getClass();
                    featureFlagManager3.getClass();
                    return new BitcoinDisabledWidgetPlugin(realBitcoinCapabilityProvider4, e0Var, featureFlagManager3, i2);
                case 10:
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider3.invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                    return ShadowKt.provideLightningInvoiceGenerator$real((ArcadeModule$ProvideHapticVibratorMetroFactory) provider2, (ArcadeModule$ProvideHapticVibratorMetroFactory) provider, cashAppLiteReleaseModule$$ExternalSyntheticLambda0);
                case 11:
                    RealBitcoinLimitsProvider realBitcoinLimitsProvider = (RealBitcoinLimitsProvider) ((MoneyUiFactory.MetroFactory) provider2).invoke();
                    NonCustodialBitcoinLimitsProvider nonCustodialBitcoinLimitsProvider = (NonCustodialBitcoinLimitsProvider) ((TreehouseFlows.MetroFactory) provider).invoke();
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda02 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider3.invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda02.getClass();
                    return GeometryUtilsKt.provideBitcoinLimitsProvider(realBitcoinLimitsProvider, nonCustodialBitcoinLimitsProvider, cashAppLiteReleaseModule$$ExternalSyntheticLambda02);
                case 12:
                    RealCryptoPayrollProvider realCryptoPayrollProvider = (RealCryptoPayrollProvider) ((RealClipboardManager.MetroFactory) provider).invoke();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) provider3.invoke();
                    RealDemandDepositAccountManager realDemandDepositAccountManager = (RealDemandDepositAccountManager) provider2.invoke();
                    issuedCardManager.getClass();
                    realDemandDepositAccountManager.getClass();
                    return new RealPaidInBitcoinStateManager(realCryptoPayrollProvider, issuedCardManager, realDemandDepositAccountManager);
                case 13:
                    Instrument$Adapter instrument$Adapter = (Instrument$Adapter) ((RealTaxFormDownloader$MetroFactory) provider3).invoke();
                    ConnectionPool connectionPool = (ConnectionPool) ((RealLocaleAssetProvider$MetroFactory) provider2).invoke();
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda03 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) ((LambdaProvider) provider).invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda03.getClass();
                    return cashAppLiteReleaseModule$$ExternalSyntheticLambda03.f$0 ? connectionPool : instrument$Adapter;
                case 14:
                    SyncValueReader syncValueReader = (SyncValueReader) provider3.invoke();
                    RealAddressManager realAddressManager = (RealAddressManager) ((LocalViewFactory.MetroFactory) provider).invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider2.invoke();
                    syncValueReader.getClass();
                    realFeatureEligibilityRepository.getClass();
                    return new com.miteksystems.misnap.camera.a.n(27, syncValueReader, realAddressManager, realFeatureEligibilityRepository);
                case 15:
                    ClientSyncTransactor clientSyncTransactor = (ClientSyncTransactor) ((RealClipboardManager.MetroFactory) provider2).invoke();
                    ClientSyncTransactor clientSyncTransactor2 = (ClientSyncTransactor) ((RealBrazeConfigurator.MetroFactory) provider).invoke();
                    RealClientSyncFlags realClientSyncFlags = (RealClientSyncFlags) provider3.invoke();
                    realClientSyncFlags.getClass();
                    return new FlaggedClientSyncTransactor(new SqlClientSyncTransactor(clientSyncTransactor, i5), new SqlClientSyncTransactor(clientSyncTransactor2, i5), realClientSyncFlags);
                case 16:
                    RealClientSyncErrorReporter realClientSyncErrorReporter = (RealClientSyncErrorReporter) ((DelegateFactory) provider2).invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) provider).getValue();
                    ObservabilityExecutionContext observabilityExecutionContext = (ObservabilityExecutionContext) provider3.invoke();
                    realClientSyncErrorReporter.getClass();
                    featureFlagManager4.getClass();
                    observabilityExecutionContext.getClass();
                    return new RealClientSyncFlags(realClientSyncErrorReporter, featureFlagManager4, observabilityExecutionContext);
                case 17:
                    Instrument$Adapter instrument$Adapter2 = (Instrument$Adapter) ((RealTrifleService.MetroFactory) provider).invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider3.invoke();
                    Analytics analytics = (Analytics) provider2.invoke();
                    featureFlagManager5.getClass();
                    analytics.getClass();
                    return new RealCryptoInvoiceParser(instrument$Adapter2, featureFlagManager5, analytics);
                case 18:
                    RealImageLoader realImageLoader = (RealImageLoader) provider3.invoke();
                    Map map = ((MapProviderFactory) provider).contributingMap;
                    CashTreehouseLayout.Factory factory2 = (CashTreehouseLayout.Factory) provider2.invoke();
                    realImageLoader.getClass();
                    map.getClass();
                    factory2.getClass();
                    return new PaymentsViewFactory(i2, realImageLoader, map, factory2);
                case 19:
                    JCAContext jCAContext = (JCAContext) ((IntentLauncher.MetroFactory) provider3).invoke();
                    EarningsAppletTilePresenter$Factory$Impl earningsAppletTilePresenter$Factory$Impl = (EarningsAppletTilePresenter$Factory$Impl) ((InstanceFactory) provider2).value;
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) ((InstanceFactory) provider).value;
                    earningsAppletTilePresenter$Factory$Impl.getClass();
                    lifecycleOwner2.getClass();
                    return zzhw.earningsApplet(jCAContext, earningsAppletTilePresenter$Factory$Impl, lifecycleOwner2);
                case 20:
                    StateFlow stateFlow = (StateFlow) ((AttestedKeyMetrics$MetroFactory) provider).invoke();
                    MediaLoadData provideExponentialBackoff$real = zzje.provideExponentialBackoff$real();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider3.invoke();
                    coroutineContext2.getClass();
                    return new RealFxExchangeRateStreamingSubscriber((DoubleCheck) provider2, stateFlow, provideExponentialBackoff$real, coroutineContext2);
                case 21:
                    HttpFileUploadService httpFileUploadService = (HttpFileUploadService) provider3.invoke();
                    RealAndroidFileParser realAndroidFileParser = (RealAndroidFileParser) ((FillrInitializer.MetroFactory) provider).invoke();
                    String str = (String) provider2.invoke();
                    httpFileUploadService.getClass();
                    str.getClass();
                    return new RealFileUploadService(httpFileUploadService, realAndroidFileParser, str);
                case 22:
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda04 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) ((LambdaProvider) provider).lambda.invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda04.getClass();
                    return GooglePayLoadingViewKt.provideGooglePayProvisioningGateway$presenters((RealLegalDocumentManager$MetroFactory) provider3, (CashLiteGooglePayProvisioningGateway$MetroFactory) provider2, cashAppLiteReleaseModule$$ExternalSyntheticLambda04);
                case 23:
                    BinaryBitmap binaryBitmap = (BinaryBitmap) ((RealLiteCashInRepo$MetroFactory) provider3).invoke();
                    Activity activity = (Activity) ((InstanceFactory) provider2).value;
                    Analytics analytics2 = (Analytics) ((DoubleCheck) provider).getValue();
                    activity.getClass();
                    analytics2.getClass();
                    return new EglCore(15, binaryBitmap, activity, analytics2);
                case 24:
                    Call.Factory factory3 = (Call.Factory) ((DelegateFactory) provider).invoke();
                    Endpoints endpoints = (Endpoints) provider3.invoke();
                    NoOpRetrofitLogger noOpRetrofitLogger = (NoOpRetrofitLogger) provider2.invoke();
                    factory3.getClass();
                    endpoints.getClass();
                    noOpRetrofitLogger.getClass();
                    Retrofit.Builder builder = new Retrofit.Builder();
                    builder.callFactory = factory3;
                    builder.baseUrl("https://internal.cashappapi.com");
                    ((ArrayList) builder.converterFactories).add(new BuiltInConverters(i3));
                    DefaultCallAdapterFactory defaultCallAdapterFactory = new DefaultCallAdapterFactory(noOpRetrofitLogger, i5);
                    ArrayList arrayList = (ArrayList) builder.callAdapterFactories;
                    arrayList.add(defaultCallAdapterFactory);
                    arrayList.add(new CompletableFutureCallAdapterFactory(i5));
                    return builder.build();
                case 25:
                    FastlyInterceptor fastlyInterceptor = new FastlyInterceptor();
                    ProfilePhotoInterceptor profilePhotoInterceptor = (ProfilePhotoInterceptor) ((RealClipboardManager.MetroFactory) provider3).invoke();
                    ProfilePhotoInterceptor profilePhotoInterceptor2 = (ProfilePhotoInterceptor) ((RealTrifleService.MetroFactory) provider2).invoke();
                    ProfilePhotoInterceptor profilePhotoInterceptor3 = (ProfilePhotoInterceptor) ((RealTrifleService.MetroFactory) provider).invoke();
                    ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder(0);
                    builder2.add(fastlyInterceptor);
                    builder2.add(profilePhotoInterceptor);
                    builder2.add(profilePhotoInterceptor2);
                    builder2.add(profilePhotoInterceptor3);
                    FileMapper fileMapper = new FileMapper(5);
                    ReflectionFactory reflectionFactory = Reflection.factory;
                    builder2.add(fileMapper, reflectionFactory.getOrCreateKotlinClass(HttpUrl.class));
                    builder2.add(new FileMapper(6), reflectionFactory.getOrCreateKotlinClass(Image.class));
                    builder2.add(new SvgDecoder.Factory());
                    builder2.add(new AnimatedImageDecoder.Factory());
                    return builder2.build();
                case 26:
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda05 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider3.invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda05.getClass();
                    return RenderTreeStringKt.provideMoneyTabApplets$sections((SetFactory) provider2, (SetFactory) provider, cashAppLiteReleaseModule$$ExternalSyntheticLambda05);
                case 27:
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider3.invoke();
                    RealPromotedAppletTileStore realPromotedAppletTileStore = (RealPromotedAppletTileStore) ((RetroUiFactory.MetroFactory) provider).invoke();
                    KeyValue keyValue = (KeyValue) provider2.invoke();
                    realLocaleManager.getClass();
                    keyValue.getClass();
                    return new PromotedAppletTileLocaleChangeIoSetupTeardown(realLocaleManager, realPromotedAppletTileStore, keyValue);
                case 28:
                    CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda06 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) ((LambdaProvider) provider).lambda.invoke();
                    cashAppLiteReleaseModule$$ExternalSyntheticLambda06.getClass();
                    return ArcadeElement.Element.provideMoneyTabSectionProviders$presenters((SetFactory) provider3, (SetFactory) provider2, cashAppLiteReleaseModule$$ExternalSyntheticLambda06);
                default:
                    GenieAppConfig genieAppConfig = (GenieAppConfig) MoneybotGenieModule$Companion$ProvideMoneybotGenieAppConfigMetroFactory.INSTANCE.invoke();
                    String str2 = (String) provider3.invoke();
                    String str3 = (String) provider2.invoke();
                    SizeMap sizeMap = (SizeMap) ((RealMarketAttributesProvider.MetroFactory) provider).invoke();
                    str2.getClass();
                    str3.getClass();
                    return zzabp.provideMoneybotGenieSceneLoader(genieAppConfig, str2, str3, sizeMap);
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.ioDispatcher = provider;
            this.sessionManager = provider2;
            this.onboardingConfigManager = provider3;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, int i, boolean z) {
            this.$r8$classId = i;
            this.sessionManager = provider;
            this.onboardingConfigManager = provider2;
            this.ioDispatcher = provider3;
        }

        public /* synthetic */ MetroFactory(Provider provider, Factory factory, Provider provider2, int i) {
            this.$r8$classId = i;
            this.ioDispatcher = provider;
            this.onboardingConfigManager = factory;
            this.sessionManager = provider2;
        }

        public /* synthetic */ MetroFactory(Factory factory, Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.onboardingConfigManager = factory;
            this.ioDispatcher = provider;
            this.sessionManager = provider2;
        }
    }
}
