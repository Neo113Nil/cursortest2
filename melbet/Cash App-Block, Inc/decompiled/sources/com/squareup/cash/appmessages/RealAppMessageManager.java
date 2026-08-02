package com.squareup.cash.appmessages;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.api.ApiResult;
import app.cash.zipline.loader.ZiplineHttpClient;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.KeysetHandle;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.attribution.wrappers.ProductionAppsFlyerClient;
import com.squareup.cash.banking.applets.presenters.LiteBalanceAppletTileRepository;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.flags.RealClientSyncFlags;
import com.squareup.cash.clientsync.logging.RealClientSyncLogger;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.persistence.ClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.FlaggedSyncRangeStore;
import com.squareup.cash.clientsync.persistence.SqlComponentMigrationStore;
import com.squareup.cash.clientsync.persistence.SyncRangeStore;
import com.squareup.cash.clientsync.pipeline.MutableClientSyncCompletionTracker;
import com.squareup.cash.clientsync.pipeline.RealClientSyncRequestExecutor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncResponseProcessor;
import com.squareup.cash.clientsync.pipeline.SessionAwareClientSyncRequestExecutor;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.balance.RealRestrictedBalanceStore;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.exchangedata.real.RealFxExchangeRateStreamingSubscriber;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$AppMessageV_2Api;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fileupload.real.RealFileUploadService;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTilePriceMovementRepository;
import com.squareup.cash.investing.applets.presenters.RealStocksAppletTileRepository;
import com.squareup.cash.investing.applets.presenters.StocksAppletTilePriceMovementRepository;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.notifications.channels.RealNotificationChannelMigrationManager;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.support.chat.backend.real.SupportChatApi;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence;
import com.squareup.cash.support.chat.backend.real.TransactionBodyResolver;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import com.squareup.cash.wallet.presenters.CardAppletTileRepository;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.applets.presenters.RealShiftsTileDataLoader;
import com.squareup.cash.work.data.real.RealBrandDetailsDataLoader;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.cash.work.session.RealSelectedMerchantSetter;
import com.squareup.cash.work.tinygraph.real.RealLoginEssentialsRepository;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.preferences.IntPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.GetAppMessagesV2Response;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.task.RepeatTaskExecutor;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import dev.zacsweers.metro.internal.SetFactory;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import okhttp3.ConnectionPool;
import okhttp3.HttpUrl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealAppMessageManager {
    public final AppMessageClientService appService;
    public final RealClientSyncer clientSyncer;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final SessionQueries messageDeliveredQueries;
    public final RealAppMessageRepositoryWriter repository;
    public final CoroutineScope scope;
    public final Signal signOut;

    public RealAppMessageManager(AppMessageClientService appMessageClientService, RealAppMessageRepositoryWriter realAppMessageRepositoryWriter, Signal signal, RealClientSyncer realClientSyncer, FeatureFlagManager featureFlagManager, CoroutineScope coroutineScope, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.appService = appMessageClientService;
        this.repository = realAppMessageRepositoryWriter;
        this.signOut = signal;
        this.clientSyncer = realClientSyncer;
        this.featureFlagManager = featureFlagManager;
        this.scope = coroutineScope;
        this.ioDispatcher = coroutineContext;
        this.messageDeliveredQueries = cashAccountDatabaseImpl.messageDeliveredQueries;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0198, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r13.ioDispatcher, r2, r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x012d, code lost:
    
        if (r14.awaitInternal(r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0164, code lost:
    
        if (r14 == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
    
        if (r14.awaitInternal(r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0082, code lost:
    
        if (r14 == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ea, code lost:
    
        if (r14 == r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshAll(ContinuationImpl continuationImpl) {
        RealAppMessageManager$refreshAll$1 realAppMessageManager$refreshAll$1;
        int i;
        List list;
        if (continuationImpl instanceof RealAppMessageManager$refreshAll$1) {
            realAppMessageManager$refreshAll$1 = (RealAppMessageManager$refreshAll$1) continuationImpl;
            int i2 = realAppMessageManager$refreshAll$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAppMessageManager$refreshAll$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAppMessageManager$refreshAll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAppMessageManager$refreshAll$1.label;
                SyncScope.Global global = SyncScope.Global.INSTANCE;
                RealClientSyncer realClientSyncer = this.clientSyncer;
                int i3 = 0;
                Continuation continuation = null;
                switch (i) {
                    case 0:
                        SafeTrace.throwOnFailure(obj);
                        boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$AppMessageV_2Api.INSTANCE)).enabled();
                        int i4 = 1;
                        Signal signal = this.signOut;
                        if (!enabled) {
                            RealAppMessageManager$refreshAll$appMessages$result$1 realAppMessageManager$refreshAll$appMessages$result$1 = new RealAppMessageManager$refreshAll$appMessages$result$1(this, continuation, i4);
                            realAppMessageManager$refreshAll$1.label = 3;
                            obj = StateFlowKt.until(signal, realAppMessageManager$refreshAll$appMessages$result$1, realAppMessageManager$refreshAll$1);
                            break;
                        } else {
                            RealAppMessageManager$refreshAll$appMessages$result$1 realAppMessageManager$refreshAll$appMessages$result$12 = new RealAppMessageManager$refreshAll$appMessages$result$1(this, continuation, i3);
                            realAppMessageManager$refreshAll$1.label = 1;
                            obj = StateFlowKt.until(signal, realAppMessageManager$refreshAll$appMessages$result$12, realAppMessageManager$refreshAll$1);
                            break;
                        }
                        return coroutineSingletons;
                    case 1:
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult = (ApiResult) obj;
                        if (apiResult instanceof ApiResult.Success) {
                            list = ((GetAppMessagesV2Response) ((ApiResult.Success) apiResult).response).messages;
                            Timber.Forest forest = Timber.Forest;
                            forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "App Message Refresher: refresh succeeded with ", " messages"), new Object[0]);
                            if (!list.isEmpty()) {
                                forest.d("Triggering client sync because new app messages were delivered", new Object[0]);
                                CompletableDeferredImpl sync = realClientSyncer.sync(SyncTrigger.PUSH_NOTIFICATION, global);
                                realAppMessageManager$refreshAll$1.L$0 = null;
                                realAppMessageManager$refreshAll$1.L$4 = list;
                                realAppMessageManager$refreshAll$1.label = 2;
                                break;
                            }
                            if (list == null) {
                                return Unit.INSTANCE;
                            }
                            realAppMessageManager$refreshAll$1.L$0 = list;
                            realAppMessageManager$refreshAll$1.L$4 = null;
                            realAppMessageManager$refreshAll$1.label = 5;
                            RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = this.repository;
                            Object withContext = JobKt.withContext(realAppMessageRepositoryWriter.ioDispatcher, new SearchBarBinding$Content$1$1(realAppMessageRepositoryWriter, list, continuation, 21), realAppMessageManager$refreshAll$1);
                            if (withContext != coroutineSingletons) {
                                withContext = Unit.INSTANCE;
                                break;
                            }
                        } else {
                            if (apiResult instanceof ApiResult.Failure) {
                                Timber.Forest.d("App Message Refresher: refresh failed", new Object[0]);
                            } else {
                                Timber.Forest.d("[Growth Diagnosis] aborting app message refresh because of signout trigger", new Object[0]);
                            }
                            list = null;
                            if (list == null) {
                            }
                        }
                        break;
                    case 2:
                    case 4:
                        list = realAppMessageManager$refreshAll$1.L$4;
                        SafeTrace.throwOnFailure(obj);
                        if (list == null) {
                        }
                        break;
                    case 3:
                        SafeTrace.throwOnFailure(obj);
                        ApiResult apiResult2 = (ApiResult) obj;
                        if (apiResult2 instanceof ApiResult.Success) {
                            list = ((GetAppMessagesResponse) ((ApiResult.Success) apiResult2).response).messages;
                            Timber.Forest forest2 = Timber.Forest;
                            forest2.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(list.size(), "App Message Refresher: refresh succeeded with ", " messages"), new Object[0]);
                            if (!list.isEmpty()) {
                                forest2.d("Triggering client sync because new app messages were delivered", new Object[0]);
                                CompletableDeferredImpl sync2 = realClientSyncer.sync(SyncTrigger.PUSH_NOTIFICATION, global);
                                realAppMessageManager$refreshAll$1.L$0 = null;
                                realAppMessageManager$refreshAll$1.L$4 = list;
                                realAppMessageManager$refreshAll$1.label = 4;
                                break;
                            }
                            if (list == null) {
                            }
                        } else {
                            if (apiResult2 instanceof ApiResult.Failure) {
                                Timber.Forest.d("App Message Refresher: refresh failed", new Object[0]);
                            } else {
                                Timber.Forest.d("[Growth Diagnosis] aborting app message refresh because of signout trigger", new Object[0]);
                            }
                            list = null;
                            if (list == null) {
                            }
                        }
                        break;
                    case 5:
                        list = realAppMessageManager$refreshAll$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String str = ((AppMessage) it.next()).message_token;
                            if (str != null) {
                                linkedHashSet.add(str);
                            }
                        }
                        SearchBarBinding$Content$1$1 searchBarBinding$Content$1$1 = new SearchBarBinding$Content$1$1(this, linkedHashSet, continuation, 19);
                        realAppMessageManager$refreshAll$1.L$0 = null;
                        realAppMessageManager$refreshAll$1.label = 6;
                        break;
                    case 6:
                        List list2 = realAppMessageManager$refreshAll$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        realAppMessageManager$refreshAll$1 = new RealAppMessageManager$refreshAll$1(this, continuationImpl);
        Object obj2 = realAppMessageManager$refreshAll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAppMessageManager$refreshAll$1.label;
        SyncScope.Global global2 = SyncScope.Global.INSTANCE;
        RealClientSyncer realClientSyncer2 = this.clientSyncer;
        int i32 = 0;
        Continuation continuation2 = null;
        switch (i) {
        }
    }

    public final void reportMessageDelivery(String str) {
        str.getClass();
        JobKt.launch$default(this.scope, this.ioDispatcher, null, new RealAppMessageManager$reportMessageView$1(this, str, null, 2), 2);
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 8;
        public final Provider appService;
        public final Provider cashAccountDatabase;
        public final Provider clientSyncer;
        public final Provider featureFlagManager;
        public final Provider ioDispatcher;
        public final Provider repository;
        public final Provider scope;
        public final Provider signOut;

        public MetroFactory(NavigationSideEffects.MetroFactory metroFactory, DelegateFactory delegateFactory, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4, InstanceFactory instanceFactory2) {
            this.appService = metroFactory;
            this.repository = delegateFactory;
            this.scope = instanceFactory;
            this.signOut = lambdaProvider;
            this.clientSyncer = lambdaProvider2;
            this.featureFlagManager = lambdaProvider3;
            this.cashAccountDatabase = lambdaProvider4;
            this.ioDispatcher = instanceFactory2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.scope;
            Provider provider2 = this.ioDispatcher;
            Provider provider3 = this.repository;
            Provider provider4 = this.cashAccountDatabase;
            Provider provider5 = this.featureFlagManager;
            Provider provider6 = this.clientSyncer;
            Provider provider7 = this.appService;
            Provider provider8 = this.signOut;
            switch (i) {
                case 0:
                    AppMessageClientService appMessageClientService = (AppMessageClientService) ((DoubleCheck) provider7).getValue();
                    RealAppMessageRepositoryWriter realAppMessageRepositoryWriter = (RealAppMessageRepositoryWriter) ((TreehouseFlows.MetroFactory) provider3).invoke();
                    Signal signal = (Signal) provider8.invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) provider6.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider5.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider).value;
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider2.invoke();
                    appMessageClientService.getClass();
                    signal.getClass();
                    realClientSyncer.getClass();
                    featureFlagManager.getClass();
                    coroutineScope.getClass();
                    cashAccountDatabaseImpl.getClass();
                    coroutineContext.getClass();
                    return new RealAppMessageManager(appMessageClientService, realAppMessageRepositoryWriter, signal, realClientSyncer, featureFlagManager, coroutineScope, cashAccountDatabaseImpl, coroutineContext);
                case 1:
                    Application application = (Application) provider8.invoke();
                    boolean booleanValue = ((Boolean) provider6.invoke()).booleanValue();
                    DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 = (DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0) provider5.invoke();
                    Analytics analytics = (Analytics) ((DoubleCheck) provider7).getValue();
                    AndroidConnectivityManager androidConnectivityManager = (AndroidConnectivityManager) provider4.invoke();
                    ConnectionPool connectionPool = (ConnectionPool) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider3).invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider.invoke();
                    application.getClass();
                    deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0.getClass();
                    analytics.getClass();
                    androidConnectivityManager.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    return new ProductionAppsFlyerClient(application, booleanValue, deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0, analytics, androidConnectivityManager, connectionPool, errorReporter, sampleStrategy);
                case 2:
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) provider8.invoke();
                    RealDemandDepositAccountManager realDemandDepositAccountManager = (RealDemandDepositAccountManager) provider6.invoke();
                    RealStatusAndLimitsManager realStatusAndLimitsManager = (RealStatusAndLimitsManager) ((RealSessionFlags.MetroFactory) provider7).invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider5.invoke();
                    CardAppletTileRepository cardAppletTileRepository = (CardAppletTileRepository) provider4.invoke();
                    RealFxExchangeRateStreamingSubscriber realFxExchangeRateStreamingSubscriber = (RealFxExchangeRateStreamingSubscriber) provider2.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) provider).value;
                    TransferManager transferManager = (TransferManager) provider3.invoke();
                    realBalanceSnapshotManager.getClass();
                    realDemandDepositAccountManager.getClass();
                    realFeatureEligibilityRepository.getClass();
                    cardAppletTileRepository.getClass();
                    realFxExchangeRateStreamingSubscriber.getClass();
                    coroutineScope2.getClass();
                    transferManager.getClass();
                    return new LiteBalanceAppletTileRepository(realBalanceSnapshotManager, realDemandDepositAccountManager, realStatusAndLimitsManager, realFeatureEligibilityRepository, cardAppletTileRepository, realFxExchangeRateStreamingSubscriber, coroutineScope2, transferManager);
                case 3:
                    CoroutineScope coroutineScope3 = (CoroutineScope) ((InstanceFactory) provider).value;
                    MutableClientSyncCompletionTracker mutableClientSyncCompletionTracker = (MutableClientSyncCompletionTracker) provider8.invoke();
                    RealClientSyncResponseProcessor realClientSyncResponseProcessor = (RealClientSyncResponseProcessor) provider6.invoke();
                    WireAdapter wireAdapter = (WireAdapter) ((RealClipboardManager.MetroFactory) provider7).invoke();
                    SyncRangeStore syncRangeStore = (SyncRangeStore) provider5.invoke();
                    Set set = (Set) ((SetFactory) provider3).invoke();
                    KeysetHandle keysetHandle = (KeysetHandle) ((RealClipboardManager.MetroFactory) provider2).invoke();
                    SessionManager sessionManager = (SessionManager) provider4.invoke();
                    coroutineScope3.getClass();
                    mutableClientSyncCompletionTracker.getClass();
                    realClientSyncResponseProcessor.getClass();
                    syncRangeStore.getClass();
                    set.getClass();
                    sessionManager.getClass();
                    return new SessionAwareClientSyncRequestExecutor(coroutineScope3, new RealClientSyncRequestExecutor(coroutineScope3, mutableClientSyncCompletionTracker, realClientSyncResponseProcessor, wireAdapter, syncRangeStore, CollectionsKt.toList(set), keysetHandle), sessionManager);
                case 4:
                    SyncRangeStore syncRangeStore2 = (SyncRangeStore) ((RealClipboardManager.MetroFactory) provider7).invoke();
                    SyncRangeStore syncRangeStore3 = (SyncRangeStore) ((RealBrazeConfigurator.MetroFactory) provider3).invoke();
                    SqlComponentMigrationStore sqlComponentMigrationStore = (SqlComponentMigrationStore) provider8.invoke();
                    KeysetHandle keysetHandle2 = (KeysetHandle) ((RealBrazeConfigurator.MetroFactory) provider).invoke();
                    RealClientSyncErrorReporter realClientSyncErrorReporter = (RealClientSyncErrorReporter) provider6.invoke();
                    RealClientSyncFlags realClientSyncFlags = (RealClientSyncFlags) provider5.invoke();
                    RealClientSyncLogger realClientSyncLogger = (RealClientSyncLogger) provider4.invoke();
                    ClientSyncTransactor clientSyncTransactor = (ClientSyncTransactor) provider2.invoke();
                    sqlComponentMigrationStore.getClass();
                    realClientSyncErrorReporter.getClass();
                    realClientSyncFlags.getClass();
                    realClientSyncLogger.getClass();
                    clientSyncTransactor.getClass();
                    return new FlaggedSyncRangeStore(syncRangeStore2, syncRangeStore3, sqlComponentMigrationStore, keysetHandle2, realClientSyncErrorReporter, realClientSyncFlags, realClientSyncLogger, clientSyncTransactor);
                case 5:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider8.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider6.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider5.invoke();
                    RealStablecoinCapabilityHelper realStablecoinCapabilityHelper = (RealStablecoinCapabilityHelper) ((RetroUiFactory.MetroFactory) provider7).invoke();
                    RealRestrictedBalanceStore realRestrictedBalanceStore = (RealRestrictedBalanceStore) provider4.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider2.invoke();
                    Signal signal2 = (Signal) provider3.invoke();
                    KeyValue keyValue = (KeyValue) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    syncValueReader.getClass();
                    featureFlagManager2.getClass();
                    realRestrictedBalanceStore.getClass();
                    coroutineContext2.getClass();
                    signal2.getClass();
                    keyValue.getClass();
                    return new RealCryptoBalanceRepo(cashAccountDatabaseImpl2, syncValueReader, featureFlagManager2, realStablecoinCapabilityHelper, realRestrictedBalanceStore, coroutineContext2, signal2, keyValue);
                case 6:
                    Context context = (Context) ((DoubleCheck) provider7).getValue();
                    SharedPreferences sharedPreferences = (SharedPreferences) ((DoubleCheck) provider3).getValue();
                    IntPreference intPreference = (IntPreference) ((DoubleCheck) provider8).getValue();
                    WireAdapter wireAdapter2 = (WireAdapter) ((RealMarketAttributesProvider.MetroFactory) provider6).invoke();
                    RealNotificationChannelMigrationManager realNotificationChannelMigrationManager = (RealNotificationChannelMigrationManager) ((BroadwayModule$ProvideBroadwayMetroFactory) provider5).invoke();
                    StringPreference stringPreference = (StringPreference) ((DoubleCheck) provider4).getValue();
                    int intValue = ((Number) ((LambdaProvider) provider2).lambda.invoke()).intValue();
                    Storage storage = (Storage) ((LambdaProvider) provider).lambda.invoke();
                    context.getClass();
                    sharedPreferences.getClass();
                    intPreference.getClass();
                    stringPreference.getClass();
                    storage.getClass();
                    return new HttpUrl.Builder(context, sharedPreferences, intPreference, wireAdapter2, realNotificationChannelMigrationManager, stringPreference, intValue, storage);
                case 7:
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider8.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider6.invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider5.invoke();
                    StocksAppletTilePriceMovementRepository stocksAppletTilePriceMovementRepository = (StocksAppletTilePriceMovementRepository) ((RealStocksAppletTilePriceMovementRepository.MetroFactory) provider7).invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider4.invoke();
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) provider2.invoke();
                    CoroutineScope coroutineScope4 = (CoroutineScope) ((InstanceFactory) provider).value;
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository2 = (RealFeatureEligibilityRepository) provider3.invoke();
                    androidStringManager.getClass();
                    featureFlagManager3.getClass();
                    syncValueReader2.getClass();
                    realFamilyAccountsManager.getClass();
                    realFamilyProfileManager.getClass();
                    coroutineScope4.getClass();
                    realFeatureEligibilityRepository2.getClass();
                    return new RealStocksAppletTileRepository(androidStringManager, featureFlagManager3, syncValueReader2, stocksAppletTilePriceMovementRepository, realFamilyAccountsManager, realFamilyProfileManager, coroutineScope4, realFeatureEligibilityRepository2);
                case 8:
                    HCaptcha hCaptcha = (HCaptcha) ((NavigationSideEffects.MetroFactory) provider7).invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) provider3).invoke();
                    Activity activity = (Activity) ((InstanceFactory) provider).value;
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) provider8).lambda.invoke();
                    RealClipboardManager realClipboardManager = (RealClipboardManager) ((LambdaProvider) provider6).lambda.invoke();
                    AndroidPackageManager androidPackageManager = (AndroidPackageManager) ((LambdaProvider) provider5).lambda.invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) ((LambdaProvider) provider4).lambda.invoke();
                    CoroutineScope coroutineScope5 = (CoroutineScope) ((InstanceFactory) provider2).value;
                    realProfileManager.getClass();
                    activity.getClass();
                    androidStringManager2.getClass();
                    realClipboardManager.getClass();
                    androidPackageManager.getClass();
                    coroutineContext3.getClass();
                    coroutineScope5.getClass();
                    return new StuckPlayerDetector(hCaptcha, realProfileManager, activity, androidStringManager2, realClipboardManager, androidPackageManager, coroutineContext3, coroutineScope5);
                case 9:
                    SupportalAppService supportalAppService = (SupportalAppService) provider8.invoke();
                    Analytics analytics2 = (Analytics) provider6.invoke();
                    RealFileUploadService realFileUploadService = (RealFileUploadService) provider5.invoke();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) provider4.invoke();
                    TransactionBodyResolver transactionBodyResolver = (TransactionBodyResolver) ((WalletUiFactory$MetroFactory) provider7).invoke();
                    SupportConversationPersistence supportConversationPersistence = (SupportConversationPersistence) ((RepeatTaskExecutor.MetroFactory) provider3).invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider2.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider.invoke();
                    supportalAppService.getClass();
                    analytics2.getClass();
                    realFileUploadService.getClass();
                    realClientRouteParser.getClass();
                    errorReporter2.getClass();
                    featureFlagManager4.getClass();
                    return new SupportChatApi(supportalAppService, analytics2, realFileUploadService, realClientRouteParser, transactionBodyResolver, supportConversationPersistence, errorReporter2, featureFlagManager4);
                case 10:
                    AndroidClock androidClock = (AndroidClock) provider8.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider6.invoke();
                    ZiplineHttpClient ziplineHttpClient = (ZiplineHttpClient) provider5.invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider4.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider2.invoke();
                    KeyValue keyValue2 = (KeyValue) ((DoubleCheck) provider7).getValue();
                    BugsnagClient bugsnagClient = (BugsnagClient) provider3.invoke();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider.invoke();
                    androidClock.getClass();
                    appConfigManager.getClass();
                    ziplineHttpClient.getClass();
                    coroutineContext4.getClass();
                    cashAccountDatabaseImpl3.getClass();
                    keyValue2.getClass();
                    bugsnagClient.getClass();
                    realObservabilityManager.getClass();
                    return new RealTreehouseConfigurationStore(androidClock, appConfigManager, ziplineHttpClient, coroutineContext4, cashAccountDatabaseImpl3, keyValue2, bugsnagClient, realObservabilityManager);
                default:
                    RealMerchantRepository realMerchantRepository = (RealMerchantRepository) provider8.invoke();
                    RealMembershipRepository realMembershipRepository = (RealMembershipRepository) ((DoubleCheck) provider7).getValue();
                    RealSelectedMerchantSetter realSelectedMerchantSetter = (RealSelectedMerchantSetter) provider6.invoke();
                    RealBrandDetailsDataLoader realBrandDetailsDataLoader = (RealBrandDetailsDataLoader) provider5.invoke();
                    RealLoginEssentialsRepository realLoginEssentialsRepository = (RealLoginEssentialsRepository) provider4.invoke();
                    JCAContext jCAContext = (JCAContext) ((RealDrawerOpener$MetroFactory) provider3).invoke();
                    RealCurrentUserSetter realCurrentUserSetter = (RealCurrentUserSetter) provider2.invoke();
                    CoroutineScope coroutineScope6 = (CoroutineScope) ((InstanceFactory) provider).value;
                    realMerchantRepository.getClass();
                    realMembershipRepository.getClass();
                    realSelectedMerchantSetter.getClass();
                    realBrandDetailsDataLoader.getClass();
                    realLoginEssentialsRepository.getClass();
                    realCurrentUserSetter.getClass();
                    coroutineScope6.getClass();
                    return new RealShiftsTileDataLoader(realMerchantRepository, realMembershipRepository, realSelectedMerchantSetter, realBrandDetailsDataLoader, realLoginEssentialsRepository, jCAContext, realCurrentUserSetter, coroutineScope6);
            }
        }

        public MetroFactory(RealClipboardManager.MetroFactory metroFactory, RealBrazeConfigurator.MetroFactory metroFactory2, RealBrazeConfigurator.MetroFactory metroFactory3, RealBrazeConfigurator.MetroFactory metroFactory4, DelegateFactory delegateFactory, DoubleCheck doubleCheck, RealClientSyncLogger.MetroFactory metroFactory5, DoubleCheck doubleCheck2) {
            this.appService = metroFactory;
            this.repository = metroFactory2;
            this.signOut = metroFactory3;
            this.scope = metroFactory4;
            this.clientSyncer = delegateFactory;
            this.featureFlagManager = doubleCheck;
            this.cashAccountDatabase = metroFactory5;
            this.ioDispatcher = doubleCheck2;
        }

        public MetroFactory(RealSessionFlags.MetroFactory metroFactory, DoubleCheck doubleCheck, RealSessionFlags.MetroFactory metroFactory2, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, InstanceFactory instanceFactory, RealTransferManager.MetroFactory metroFactory3) {
            this.signOut = metroFactory;
            this.clientSyncer = doubleCheck;
            this.appService = metroFactory2;
            this.featureFlagManager = doubleCheck2;
            this.cashAccountDatabase = doubleCheck3;
            this.ioDispatcher = doubleCheck4;
            this.scope = instanceFactory;
            this.repository = metroFactory3;
        }

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck, LambdaProvider lambdaProvider4, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, LambdaProvider lambdaProvider5, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
            this.signOut = lambdaProvider;
            this.clientSyncer = lambdaProvider2;
            this.featureFlagManager = lambdaProvider3;
            this.appService = doubleCheck;
            this.cashAccountDatabase = lambdaProvider4;
            this.repository = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.ioDispatcher = lambdaProvider5;
            this.scope = musicViewFactory$MetroFactory;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealStocksAppletTilePriceMovementRepository.MetroFactory metroFactory, RealKeyStoreProvider.MetroFactory metroFactory2, Provider provider, InstanceFactory instanceFactory, DoubleCheck doubleCheck3) {
            this.signOut = lambdaProvider;
            this.clientSyncer = doubleCheck;
            this.featureFlagManager = doubleCheck2;
            this.appService = metroFactory;
            this.cashAccountDatabase = metroFactory2;
            this.ioDispatcher = provider;
            this.scope = instanceFactory;
            this.repository = doubleCheck3;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4) {
            this.signOut = lambdaProvider;
            this.clientSyncer = doubleCheck;
            this.featureFlagManager = doubleCheck2;
            this.cashAccountDatabase = lambdaProvider2;
            this.ioDispatcher = doubleCheck3;
            this.appService = doubleCheck4;
            this.repository = lambdaProvider3;
            this.scope = lambdaProvider4;
        }

        public MetroFactory(DoubleCheck doubleCheck, TreehouseFlows.MetroFactory metroFactory, DoubleCheck doubleCheck2, RealKnotLauncher.MetroFactory metroFactory2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider) {
            this.appService = doubleCheck;
            this.repository = metroFactory;
            this.signOut = doubleCheck2;
            this.clientSyncer = metroFactory2;
            this.featureFlagManager = doubleCheck3;
            this.scope = instanceFactory;
            this.cashAccountDatabase = doubleCheck4;
            this.ioDispatcher = lambdaProvider;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RealMarketAttributesProvider.MetroFactory metroFactory, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
            this.appService = doubleCheck;
            this.repository = doubleCheck2;
            this.signOut = doubleCheck3;
            this.clientSyncer = metroFactory;
            this.featureFlagManager = broadwayModule$ProvideBroadwayMetroFactory;
            this.cashAccountDatabase = doubleCheck4;
            this.ioDispatcher = lambdaProvider;
            this.scope = lambdaProvider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, RetroUiFactory.MetroFactory metroFactory, TemporaryStorage.MetroFactory metroFactory2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck4, ScoreUiFactory.MetroFactory metroFactory3) {
            this.signOut = doubleCheck;
            this.clientSyncer = doubleCheck2;
            this.featureFlagManager = doubleCheck3;
            this.appService = metroFactory;
            this.cashAccountDatabase = metroFactory2;
            this.ioDispatcher = lambdaProvider;
            this.repository = doubleCheck4;
            this.scope = metroFactory3;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, RepeatTaskExecutor.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck5) {
            this.signOut = doubleCheck;
            this.clientSyncer = doubleCheck2;
            this.featureFlagManager = doubleCheck3;
            this.cashAccountDatabase = doubleCheck4;
            this.appService = walletUiFactory$MetroFactory;
            this.repository = metroFactory;
            this.ioDispatcher = lambdaProvider;
            this.scope = doubleCheck5;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, DoubleCheck doubleCheck6, InstanceFactory instanceFactory) {
            this.signOut = doubleCheck;
            this.appService = doubleCheck2;
            this.clientSyncer = doubleCheck3;
            this.featureFlagManager = doubleCheck4;
            this.cashAccountDatabase = doubleCheck5;
            this.repository = realDrawerOpener$MetroFactory;
            this.ioDispatcher = doubleCheck6;
            this.scope = instanceFactory;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealClipboardManager.MetroFactory metroFactory, DoubleCheck doubleCheck3, SetFactory setFactory, RealClipboardManager.MetroFactory metroFactory2, LambdaProvider lambdaProvider) {
            this.scope = instanceFactory;
            this.signOut = doubleCheck;
            this.clientSyncer = doubleCheck2;
            this.appService = metroFactory;
            this.featureFlagManager = doubleCheck3;
            this.repository = setFactory;
            this.ioDispatcher = metroFactory2;
            this.cashAccountDatabase = lambdaProvider;
        }
    }
}
