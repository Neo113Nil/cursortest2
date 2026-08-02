package com.squareup.cash.braze;

import android.app.Application;
import android.content.SharedPreferences;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import app.cash.broadway.navigation.Navigator;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.db.SqlDriver;
import com.appsflyer.AppsFlyerLib;
import com.braze.Braze;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.account.backend.AccountSwitchScreenStateRelay;
import com.squareup.cash.account.backend.RealAccountSwitcher;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.appmessages.db.InlineMessageQueries$inlineMessagesByPriority$2;
import com.squareup.cash.appmessages.holders.PendingInlineMessageHolder;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.attribution.InstallAttributer;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigator;
import com.squareup.cash.attribution.wrappers.ProductionAppsFlyerClient;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewEvent;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.clientsync.CustomerStreamingSubscriber;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.flags.DatabaseMigrationPhase;
import com.squareup.cash.clientsync.persistence.BootstrappedSyncRangeStore;
import com.squareup.cash.clientsync.persistence.ClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.FlaggedClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.FlaggedSyncEntityStore;
import com.squareup.cash.clientsync.persistence.FlaggedSyncRangeStore;
import com.squareup.cash.clientsync.persistence.ShadowedSyncRangeStore;
import com.squareup.cash.clientsync.persistence.SqlClientSyncTransactor;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.clientsync.persistence.SyncRangeStore;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.e2ee.signature.Signature;
import com.squareup.cash.e2ee.signature.local.RealLocalSignatureStore;
import com.squareup.cash.e2ee.signature.service.SigningCertificateService;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ClientsyncServerPushEnhancedObservability;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader;
import com.squareup.cash.initialscreenloader.backend.RealInitialScreenLoader$Factory$Impl;
import com.squareup.cash.initialscreenloader.backend.RealPreSignInScreenLoader;
import com.squareup.cash.initialscreenloader.backend.RealSquareStaffSwitchAccountContextStore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.IntentHandler;
import com.squareup.cash.localization.RealLanguageManager;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.observability.backend.real.InMemoryReportedErrorCache;
import com.squareup.cash.observability.backend.real.ObservabilitySetupTeardown;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.backend.real.bugsnag.BugsnagClientSandboxSetupTeardown;
import com.squareup.cash.observability.backend.real.sampling.FeatureFlaggedSamplingStrategy$Factory$Impl;
import com.squareup.cash.observability.types.MetadataSection$AdditionalInfoSection;
import com.squareup.cash.observability.types.MetadataSection$AppSection;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.onboarding.backend.RealOnboardingIntegrityChecker;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerRepo;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.profilemigration.real.RealMigratedSyncValueBugsnagMetadata;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.session.backend.RealSessionInitiator;
import com.squareup.cash.session.backend.RealSessionRefresher;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.StorageLinker;
import com.squareup.cash.storage.TempStorageCleaner;
import com.squareup.cash.ui.MainActivity$navigatorSwitcher$1;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.coroutines.Signal;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobImpl;
import okhttp3.HttpUrl;
import okio.internal.DefaultSocket;
import org.slf4j.Marker;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final /* synthetic */ class RealBrazeManager$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ RealBrazeManager$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 3;
        Object[] objArr = 0;
        SyncRangeStore syncRangeStore = null;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Braze.Companion companion = Braze.INSTANCE;
                Application application = ((RealBrazeManager) obj).context;
                application.getClass();
                break;
            case 1:
                AndroidDateFormatManager androidDateFormatManager = ((RealAfterpayEligibleRetroTransactionsProvider) obj).dateFormatManager;
                break;
            case 2:
                break;
            case 3:
                PendingInlineMessageHolder pendingInlineMessageHolder = (PendingInlineMessageHolder) obj;
                LocalTabContentQueries localTabContentQueries = pendingInlineMessageHolder.getCashDatabase().inlineMessageQueries;
                localTabContentQueries.getClass();
                InlineMessageQueries$inlineMessagesByPriority$2 inlineMessageQueries$inlineMessagesByPriority$2 = InlineMessageQueries$inlineMessagesByPriority$2.INSTANCE;
                SqlDriver sqlDriver = localTabContentQueries.driver;
                CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(localTabContentQueries, (byte) (objArr == true ? 1 : 0));
                sqlDriver.getClass();
                break;
            case 4:
                break;
            case 5:
                ProductionAppsFlyerClient productionAppsFlyerClient = (ProductionAppsFlyerClient) ((InstallAttributer) obj).appsFlyerClient;
                productionAppsFlyerClient.getAppsFlyerLib().stop(true, productionAppsFlyerClient.getActiveContext());
                productionAppsFlyerClient.getAppsFlyerLib().unregisterConversionListener();
                break;
            case 6:
                AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                appsFlyerLib.setOneLinkCustomDomain("click.cash.app");
                appsFlyerLib.setResolveDeepLinkURLs("clicks.cash.app");
                appsFlyerLib.setDebugLog(((ProductionAppsFlyerClient) obj).isDebug);
                break;
            case 7:
                RegisterAliasViewModel registerAliasViewModel = (RegisterAliasViewModel) obj;
                String str = registerAliasViewModel.prefillCountryCode;
                String concat = (str == null || registerAliasViewModel.mode != RegisterAliasViewModel.Mode.SMS) ? "" : Marker.ANY_NON_NULL_MARKER.concat(str);
                int length = concat.length();
                break;
            case 8:
                ((Function1) obj).invoke(new RegisterAliasViewEvent.HelpClick(true));
                break;
            case 9:
                break;
            case 10:
                FeatureFlaggedSamplingStrategy$Factory$Impl featureFlaggedSamplingStrategy$Factory$Impl = ((CustomerStreamingSubscriber) obj).sampleStrategyFactory;
                LaunchDarklyFeatureFlags$ClientsyncServerPushEnhancedObservability launchDarklyFeatureFlags$ClientsyncServerPushEnhancedObservability = LaunchDarklyFeatureFlags$ClientsyncServerPushEnhancedObservability.INSTANCE;
                SyncRangeQueries$$ExternalSyntheticLambda1 syncRangeQueries$$ExternalSyntheticLambda1 = new SyncRangeQueries$$ExternalSyntheticLambda1(8);
                launchDarklyFeatureFlags$ClientsyncServerPushEnhancedObservability.getClass();
                ProfileCropView.MetroFactory metroFactory = featureFlaggedSamplingStrategy$Factory$Impl.delegateFactory;
                InMemoryReportedErrorCache inMemoryReportedErrorCache = (InMemoryReportedErrorCache) metroFactory.imageLoader.invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.cropResultManager.invoke();
                inMemoryReportedErrorCache.getClass();
                featureFlagManager.getClass();
                break;
            case 11:
                FlaggedClientSyncTransactor flaggedClientSyncTransactor = (FlaggedClientSyncTransactor) obj;
                SqlClientSyncTransactor sqlClientSyncTransactor = flaggedClientSyncTransactor.nativeTransactor;
                SqlClientSyncTransactor sqlClientSyncTransactor2 = flaggedClientSyncTransactor.multiplatformTransactor;
                int ordinal = ((DatabaseMigrationPhase) flaggedClientSyncTransactor.flags._syncRangeDatabaseMigrationPhase$delegate.getValue()).ordinal();
                if (ordinal == 0) {
                    break;
                } else if (ordinal == 1) {
                    break;
                } else if (ordinal == 2) {
                    break;
                } else if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    break;
                }
            case 12:
                FlaggedSyncEntityStore flaggedSyncEntityStore = (FlaggedSyncEntityStore) obj;
                ClientSyncTransactor clientSyncTransactor = flaggedSyncEntityStore.transactor;
                RealClientSyncErrorReporter realClientSyncErrorReporter = flaggedSyncEntityStore.errorReporter;
                SyncEntityStore syncEntityStore = flaggedSyncEntityStore.nativeStore;
                int ordinal2 = ((DatabaseMigrationPhase) flaggedSyncEntityStore.flags._syncRangeDatabaseMigrationPhase$delegate.getValue()).ordinal();
                if (ordinal2 == 0) {
                    flaggedSyncEntityStore.componentMigrationStore.deleteMigrationVersion("sync_entity_store");
                    break;
                } else if (ordinal2 == 1) {
                    break;
                } else if (ordinal2 == 2) {
                    break;
                } else if (ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    break;
                }
            case 13:
                FlaggedSyncRangeStore flaggedSyncRangeStore = (FlaggedSyncRangeStore) obj;
                SyncRangeStore syncRangeStore2 = flaggedSyncRangeStore.nativeStore;
                SyncRangeStore syncRangeStore3 = flaggedSyncRangeStore.multiplatformStore;
                DatabaseMigrationPhase databaseMigrationPhase = (DatabaseMigrationPhase) flaggedSyncRangeStore.flags._syncRangeDatabaseMigrationPhase$delegate.getValue();
                int ordinal3 = databaseMigrationPhase.ordinal();
                if (ordinal3 == 0) {
                    flaggedSyncRangeStore.componentMigrationStore.deleteMigrationVersion("sync_range_store");
                    syncRangeStore = syncRangeStore2;
                } else if (ordinal3 == 1) {
                    SyncRangeStore syncRangeStore4 = flaggedSyncRangeStore.nativeStore;
                    syncRangeStore = new ShadowedSyncRangeStore(syncRangeStore4, new BootstrappedSyncRangeStore(syncRangeStore4, flaggedSyncRangeStore.multiplatformStore, flaggedSyncRangeStore.componentMigrationStore, flaggedSyncRangeStore.auditLog, flaggedSyncRangeStore.transactor, flaggedSyncRangeStore.logger), flaggedSyncRangeStore.auditLog, flaggedSyncRangeStore.errorReporter, flaggedSyncRangeStore.transactor);
                } else if (ordinal3 == 2) {
                    syncRangeStore = new ShadowedSyncRangeStore(new BootstrappedSyncRangeStore(flaggedSyncRangeStore.nativeStore, flaggedSyncRangeStore.multiplatformStore, flaggedSyncRangeStore.componentMigrationStore, flaggedSyncRangeStore.auditLog, flaggedSyncRangeStore.transactor, flaggedSyncRangeStore.logger), flaggedSyncRangeStore.nativeStore, flaggedSyncRangeStore.auditLog, flaggedSyncRangeStore.errorReporter, flaggedSyncRangeStore.transactor);
                } else if (ordinal3 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    syncRangeStore = syncRangeStore3;
                }
                KeysetHandle keysetHandle = flaggedSyncRangeStore.auditLog;
                Class<?> cls = syncRangeStore2.getClass();
                ReflectionFactory reflectionFactory = Reflection.factory;
                keysetHandle.appendMessage(StringsKt__IndentKt.replaceIndent("\n          Initializing range store with [\n            databaseMigrationPhase: " + databaseMigrationPhase + ",\n            nativeStore: " + reflectionFactory.getOrCreateKotlinClass(cls).getSimpleName() + ",\n            multiplatformStore: " + reflectionFactory.getOrCreateKotlinClass(syncRangeStore3.getClass()).getSimpleName() + ",\n            delegate: " + reflectionFactory.getOrCreateKotlinClass(syncRangeStore.getClass()).getSimpleName() + ",\n          ]\n        "));
                break;
            case 14:
                break;
            case 15:
                KeysetHandle keysetHandle2 = ((RealLocalSignatureStore) obj).factory;
                SharedPreferences sharedPreferences = (SharedPreferences) keysetHandle2.entries;
                Moshi moshi = (Moshi) keysetHandle2.annotationsMap;
                KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Throw;
                JsonAdapter adapter = moshi.adapter(Signature.class, Util.NO_ANNOTATIONS, null);
                break;
            case 16:
                Object create = ((Retrofit) obj).create(SigningCertificateService.class);
                create.getClass();
                break;
            case 17:
                RealFilamentSupportProvider realFilamentSupportProvider = (RealFilamentSupportProvider) obj;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr2 = new int[1];
                    if (!EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0)) {
                        EGL14.eglTerminate(eglGetDisplay);
                        break;
                    } else if (iArr2[0] != 0) {
                        EGLConfig eGLConfig = eGLConfigArr[0];
                        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                        if (!EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                            EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                            EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                            EGL14.eglTerminate(eglGetDisplay);
                            break;
                        } else {
                            String glGetString = GLES20.glGetString(7937);
                            realFilamentSupportProvider.bugsnagClient.leaveManualBreadcrumb("Gpu Info", MapsKt__MapsKt.mapOf(new Pair("renderer", glGetString), new Pair("supportsVulkan", Boolean.valueOf(realFilamentSupportProvider.context.getPackageManager().hasSystemFeature("android.hardware.vulkan.version")))));
                            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                            EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
                            EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
                            EGL14.eglTerminate(eglGetDisplay);
                            break;
                        }
                    } else {
                        EGL14.eglTerminate(eglGetDisplay);
                        break;
                    }
                }
                break;
            case 18:
                RealFillrWebManager realFillrWebManager = ((FillrInitializer) obj).fillrManager;
                if (realFillrWebManager.initialized) {
                    realFillrWebManager.getFillr().onDestroy();
                    Object obj2 = realFillrWebManager.lockOwner;
                    if (obj2 != null) {
                        realFillrWebManager.fillrSingletonLock.unlock(obj2);
                    }
                }
                break;
            case 19:
                break;
            case 20:
                PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0 = (PrimitiveRegistry$$ExternalSyntheticLambda0) obj;
                RealInitialScreenLoader$Factory$Impl realInitialScreenLoader$Factory$Impl = (RealInitialScreenLoader$Factory$Impl) primitiveRegistry$$ExternalSyntheticLambda0.f$0;
                Navigator navigator = (Navigator) primitiveRegistry$$ExternalSyntheticLambda0.f$1;
                RealInitialScreenLoader.MetroFactory metroFactory2 = realInitialScreenLoader$Factory$Impl.delegateFactory;
                HttpUrl.Builder builder = (HttpUrl.Builder) metroFactory2.versionUpdater.invoke();
                DeepLinkCompletableNavigator deepLinkCompletableNavigator = (DeepLinkCompletableNavigator) metroFactory2.deepLinkCompletableNavigator.invoke();
                BooleanPreference booleanPreference = (BooleanPreference) metroFactory2.accountPickerSessionExpired.invoke();
                EnumPreference enumPreference = (EnumPreference) metroFactory2.onboardingFlowTypePreference.invoke();
                RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = (RealOnboardingFlowTokenManager) metroFactory2.onboardingFlowTokenManager.invoke();
                IntentHandler intentHandler = (IntentHandler) metroFactory2.intentHandler.invoke();
                MainActivity$navigatorSwitcher$1 mainActivity$navigatorSwitcher$1 = (MainActivity$navigatorSwitcher$1) metroFactory2.navigatorSwitcher.value;
                SessionManager sessionManager = (SessionManager) metroFactory2.sessionManager.invoke();
                Provider provider = metroFactory2.onSessionChangeActionsExecutorProvider;
                FlowStarter flowStarter = (FlowStarter) metroFactory2.flowStarter.invoke();
                JanusService janusService = (JanusService) metroFactory2.appService.invoke();
                AppService appService = (AppService) metroFactory2.franklinAppService.invoke();
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) metroFactory2.cashDatabase.invoke();
                RealColdStartIntegrityChecker realColdStartIntegrityChecker = (RealColdStartIntegrityChecker) metroFactory2.coldStartIntegrityChecker.invoke();
                RealOnboardingIntegrityChecker realOnboardingIntegrityChecker = (RealOnboardingIntegrityChecker) metroFactory2.onboardingIntegrityChecker.invoke();
                JobImpl jobImpl = (JobImpl) metroFactory2.initialScreenLoaded.invoke();
                RealSessionInitiator realSessionInitiator = (RealSessionInitiator) metroFactory2.sessionInitiator.invoke();
                RealSessionRefresher realSessionRefresher = (RealSessionRefresher) metroFactory2.sessionRefresher.invoke();
                AndroidActivityFinisher androidActivityFinisher = (AndroidActivityFinisher) metroFactory2.activityFinisher.invoke();
                RealBackupService realBackupService = (RealBackupService) metroFactory2.backupService.invoke();
                Analytics analytics = (Analytics) metroFactory2.analytics.invoke();
                SignedInStateManager signedInStateManager = (SignedInStateManager) metroFactory2.signedInStateManager.invoke();
                Signal signal = (Signal) metroFactory2.signOutSignal.invoke();
                CoroutineContext coroutineContext = (CoroutineContext) metroFactory2.ioDispatcher.invoke();
                CoroutineContext coroutineContext2 = (CoroutineContext) metroFactory2.computationDispatcher.invoke();
                CoroutineContext coroutineContext3 = (CoroutineContext) metroFactory2.uiDispatcher.invoke();
                RealDeviceManagerRepo realDeviceManagerRepo = (RealDeviceManagerRepo) metroFactory2.deviceUpdater.invoke();
                CoroutineScope coroutineScope = (CoroutineScope) metroFactory2.coroutineScope.value;
                StorageLink storageLink = (StorageLink) metroFactory2.storageLink.value;
                StorageLinker storageLinker = (StorageLinker) metroFactory2.storageLinker.invoke();
                RealAccountSwitcher realAccountSwitcher = (RealAccountSwitcher) metroFactory2.accountSwitcher.invoke();
                AccountSwitchScreenStateRelay accountSwitchScreenStateRelay = (AccountSwitchScreenStateRelay) metroFactory2.accountSwitchScreenStateRelay.value;
                UserJourneyTracker userJourneyTracker = (UserJourneyTracker) metroFactory2.journeyTracker.invoke();
                OpenTheAppUserJourney openTheAppUserJourney = (OpenTheAppUserJourney) metroFactory2.openTheAppUserJourney.invoke();
                RealPreSignInScreenLoader realPreSignInScreenLoader = (RealPreSignInScreenLoader) metroFactory2.preSignInScreenLoader.invoke();
                DefaultSocket defaultSocket = (DefaultSocket) metroFactory2.forcedLogoutNotifier.invoke();
                RealSquareStaffSwitchAccountContextStore realSquareStaffSwitchAccountContextStore = (RealSquareStaffSwitchAccountContextStore) metroFactory2.squareStaffSwitchAccountContextStore.invoke();
                DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 = (DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0) metroFactory2.deferredDeepLinkEmitter.invoke();
                RealClientRouteFormatter realClientRouteFormatter = (RealClientRouteFormatter) metroFactory2.clientRouteFormatter.invoke();
                KeyValue keyValue = (KeyValue) metroFactory2.principalAccountToken.invoke();
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory2.featureFlagManager.invoke();
                deepLinkCompletableNavigator.getClass();
                booleanPreference.getClass();
                realOnboardingFlowTokenManager.getClass();
                intentHandler.getClass();
                mainActivity$navigatorSwitcher$1.getClass();
                sessionManager.getClass();
                provider.getClass();
                flowStarter.getClass();
                janusService.getClass();
                appService.getClass();
                cashAccountDatabaseImpl.getClass();
                realColdStartIntegrityChecker.getClass();
                realOnboardingIntegrityChecker.getClass();
                jobImpl.getClass();
                realSessionInitiator.getClass();
                realSessionRefresher.getClass();
                androidActivityFinisher.getClass();
                realBackupService.getClass();
                analytics.getClass();
                signedInStateManager.getClass();
                signal.getClass();
                coroutineContext.getClass();
                coroutineContext2.getClass();
                coroutineContext3.getClass();
                realDeviceManagerRepo.getClass();
                coroutineScope.getClass();
                storageLink.getClass();
                storageLinker.getClass();
                realAccountSwitcher.getClass();
                accountSwitchScreenStateRelay.getClass();
                userJourneyTracker.getClass();
                openTheAppUserJourney.getClass();
                realPreSignInScreenLoader.getClass();
                realSquareStaffSwitchAccountContextStore.getClass();
                deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0.getClass();
                realClientRouteFormatter.getClass();
                keyValue.getClass();
                featureFlagManager2.getClass();
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                RealLanguageManager realLanguageManager = (RealLanguageManager) obj;
                break;
            case 24:
                RealLocaleManager realLocaleManager = (RealLocaleManager) obj;
                break;
            case 25:
                ObservabilitySetupTeardown observabilitySetupTeardown = (ObservabilitySetupTeardown) obj;
                RealObservabilityManager realObservabilityManager = observabilitySetupTeardown.observabilityManager;
                realObservabilityManager.stopMonitoring();
                ((RealFeatureFlagManager) observabilitySetupTeardown.featureFlagManager).interceptors.remove(realObservabilityManager);
                break;
            case 26:
                ReportedError reportedError = (ReportedError) obj;
                Map metadata = reportedError.getMetadata();
                MetadataSection$AdditionalInfoSection metadataSection$AdditionalInfoSection = MetadataSection$AdditionalInfoSection.INSTANCE;
                break;
            case 27:
                ((InMemoryReportedErrorCache) ((TempStorageCleaner) obj).storage).reportedErrorSamplingKeys.clear();
                break;
            case 28:
                ((BugsnagClientSandboxSetupTeardown) obj).bugsnagClient.clearMetadata(MetadataSection$AdditionalInfoSection.INSTANCE, MetadataSection$AdditionalInfoSection.ActiveStorageLinkKey.INSTANCE);
                break;
            default:
                ((RealMigratedSyncValueBugsnagMetadata) obj).bugsnagClient.clearMetadata(MetadataSection$AppSection.INSTANCE, MetadataSection$AppSection.MigratedSyncValuesKey.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
