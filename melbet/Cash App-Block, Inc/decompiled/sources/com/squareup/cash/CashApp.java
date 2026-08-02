package com.squareup.cash;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.strictmode.LeakedClosableViolation;
import android.os.strictmode.Violation;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.animation.core.MutatorMutex$mutate$2;
import androidx.compose.ui.platform.GlobalSnapshotManager;
import androidx.core.os.BundleKt;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.impl.WorkManagerImpl;
import app.cash.cdp.integration.AppLifecycleEventEmitter;
import app.cash.util.leakdetector.api.LeakDetector;
import app.cash.util.leakdetector.api.NoOpLeakDetector;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import coil3.size.DimensionKt;
import com.bugsnag.android.Bugsnag;
import com.bugsnag.android.BugsnagExitInfoPlugin;
import com.bugsnag.android.CallbackState;
import com.bugsnag.android.Client;
import com.bugsnag.android.ConfigInternal;
import com.bugsnag.android.ExitInfoPluginConfiguration;
import com.bugsnag.android.MetadataState;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.android.AndroidModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.braze.BrazeInitializer;
import com.squareup.cash.clientroutes.DeepLinksConfig;
import com.squareup.cash.clientrouting.DeepLinkURLStreamHandlerFactory;
import com.squareup.cash.data.ClearAppUserDataApplicationWorker;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.backend.RealOpenTheAppUserJourney;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.firebase.FirebaseInitializer;
import com.squareup.cash.interaction.UiInteractionLatencyAnalyzer;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.observability.backend.api.BugsnagClient;
import com.squareup.cash.observability.backend.real.LogOnlyBugsnagClient;
import com.squareup.cash.observability.backend.real.WeakThrowableScribe;
import com.squareup.cash.observability.backend.real.bugsnag.BugsnagTree;
import com.squareup.cash.observability.backend.real.bugsnag.ErrorReportingWorker;
import com.squareup.cash.observability.backend.real.bugsnag.RealBugsnagClient;
import com.squareup.cash.observability.backend.real.bugsnag.RealBugsnagClient$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ThrowableScribe;
import com.squareup.cash.performance.StartupPerformanceAnalyzer;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.qrcodes.QrShortcutsOnboardingAppStartWorker;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.RealAppDataWiper;
import com.squareup.cash.storage.SandboxingAnalyticsLogger;
import com.squareup.cash.storage.SessionedLink$Store;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.ui.gcm.CashWorkerFactory;
import com.squareup.cash.ui.gcm.SandboxedCashWorkerFactory;
import com.squareup.cash.userjourneys.tracker.UserJourney$Tag$OpenTheApp$ApplicationStart;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import com.squareup.cash.worker.ApplicationWorker;
import com.squareup.preferences.KeyValue;
import com.squareup.util.coroutines.SetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import java.lang.Thread;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import papa.internal.LaunchTracker;
import papa.internal.Perfs$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class CashApp extends BaseApplication {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    private static final long START_TIME = System.currentTimeMillis();
    public DeepLinkURLStreamHandlerFactory deepLinkURLStreamHandlerFactory;
    public ErrorReporter errorReporter;
    public CoroutineContext ioContext;
    public OpenTheAppUserJourney openTheAppUserJourney;
    public SandboxingAnalyticsLogger sandboxingAnalyticsLogger;
    public SessionManager sessionManager;
    public SessionedLink$Store sessionedLinkStore;
    public ThrowableScribe throwableScribe;
    public CoroutineContext uiContext;
    public Configuration workManagerConfig;
    private final CoroutineScope scope = JobKt.plus(new CoroutineName("CashApp"), JobKt.MainScope());
    private final MutableSharedFlow events = FlowKt.MutableSharedFlow$default(0, 20, null, 5);

    public final class Companion {
    }

    public static /* synthetic */ void getUiContext$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(CashApp cashApp, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread thread, Throwable th) {
        ThrowableScribe throwableScribe = cashApp.getThrowableScribe();
        th.getClass();
        WeakThrowableScribe weakThrowableScribe = (WeakThrowableScribe) throwableScribe;
        weakThrowableScribe.getClass();
        Map map = (Map) weakThrowableScribe.annotations.remove(th);
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Map map2 = (Map) entry.getValue();
                sb.append(str + ":");
                sb.append('\n');
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    sb.append("    " + str2 + ":  ");
                    sb.append(value);
                    sb.append('\n');
                }
            }
            String sb2 = sb.toString();
            Timber.Forest.e("Bugsnag annotations for " + th + ": \n" + sb2, new Object[0]);
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SandboxedCashWorkerFactory onCreate$lambda$1(CashApp cashApp) {
        return (SandboxedCashWorkerFactory) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new CashApp$onCreate$5(cashApp, null, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(CashApp cashApp, CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        VariantAppComponent.Impl impl = (VariantAppComponent.Impl) cashApp.appComponent();
        FirebaseInitializer firebaseInitializer = (FirebaseInitializer) impl.firebaseInitializerProvider.getValue();
        Application application = impl.applicationInstance;
        AndroidConnectivityManager androidConnectivityManager = (AndroidConnectivityManager) impl.androidConnectivityManagerProvider.invoke();
        String str = (String) impl.provideBaseEndpointProvider.getValue();
        AndroidModule$Companion$$ExternalSyntheticLambda0 androidModule$Companion$$ExternalSyntheticLambda0 = new AndroidModule$Companion$$ExternalSyntheticLambda0();
        AndroidAccessibilityManager androidAccessibilityManager = new AndroidAccessibilityManager(application);
        Analytics analytics = (Analytics) impl.appAnalyticsQueueProvider.getValue();
        AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) impl.realAppForegroundStateProvider.getValue();
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
        AndroidNotificationManager androidNotificationManager = new AndroidNotificationManager(application);
        PermissionChecker permissionChecker = (PermissionChecker) impl.androidPermissionCheckerProvider.getValue();
        PermissionChecker permissionChecker2 = (PermissionChecker) impl.androidPermissionCheckerProvider.getValue();
        permissionChecker2.getClass();
        AppLifecycleEventEmitter appLifecycleEventEmitter = new AppLifecycleEventEmitter(application, androidConnectivityManager, str, androidModule$Companion$$ExternalSyntheticLambda0, androidAccessibilityManager, analytics, appForegroundStateProvider, defaultIoScheduler, androidNotificationManager, permissionChecker, permissionChecker2.create("android.permission.READ_CONTACTS"), (KeyValue) impl.provideContactsPermissionPromptRespondedProvider.getValue());
        RealAppForegroundStateProvider realAppForegroundStateProvider = (RealAppForegroundStateProvider) impl.realAppForegroundStateProvider.getValue();
        ClearAppUserDataApplicationWorker clearAppUserDataApplicationWorker = new ClearAppUserDataApplicationWorker(impl.getProvideClearAppUserDataOnNextLaunch(), application, new RealAppDataWiper());
        BrazeInitializer brazeInitializer = (BrazeInitializer) impl.brazeInitializerProvider.getValue();
        StartupPerformanceAnalyzer startupPerformanceAnalyzer = (StartupPerformanceAnalyzer) impl.startupPerformanceAnalyzerProvider.getValue();
        ErrorReportingWorker errorReportingWorker = (ErrorReportingWorker) impl.errorReportingWorkerProvider.getValue();
        UiInteractionLatencyAnalyzer uiInteractionLatencyAnalyzer = (UiInteractionLatencyAnalyzer) impl.uiInteractionLatencyAnalyzerProvider.getValue();
        ClearAppUserDataApplicationWorker clearAppUserDataApplicationWorker2 = new ClearAppUserDataApplicationWorker(application, defaultIoScheduler);
        QrShortcutsOnboardingAppStartWorker qrShortcutsOnboardingAppStartWorker = new QrShortcutsOnboardingAppStartWorker((AppForegroundStateProvider) impl.realAppForegroundStateProvider.getValue(), (KeyValue) impl.provideQrShortcutsOnboardingAppStartsProvider.getValue(), defaultIoScheduler);
        firebaseInitializer.getClass();
        realAppForegroundStateProvider.getClass();
        brazeInitializer.getClass();
        startupPerformanceAnalyzer.getClass();
        errorReportingWorker.getClass();
        uiInteractionLatencyAnalyzer.getClass();
        int i = 0;
        Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new ApplicationWorker[]{firebaseInitializer, appLifecycleEventEmitter, realAppForegroundStateProvider, clearAppUserDataApplicationWorker, brazeInitializer, startupPerformanceAnalyzer, errorReportingWorker, uiInteractionLatencyAnalyzer, clearAppUserDataApplicationWorker2, qrShortcutsOnboardingAppStartWorker}).iterator();
        while (it.hasNext()) {
            JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new CashApp$onCreate$4$1$1((ApplicationWorker) it.next(), null, i), 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4() {
        StrictMode.VmPolicy.Builder penaltyLog = new StrictMode.VmPolicy.Builder().detectActivityLeaks().detectFileUriExposure().detectLeakedClosableObjects().detectLeakedRegistrationObjects().detectLeakedSqlLiteObjects().penaltyLog();
        penaltyLog.getClass();
        penaltyLog.detectContentUriWithoutPermission();
        if (Build.VERSION.SDK_INT < 30) {
            penaltyLog.penaltyDeath();
        } else {
            penaltyLog.penaltyListener(Executors.newSingleThreadExecutor(), new StrictMode.OnVmViolationListener() { // from class: com.squareup.cash.CashApp$$ExternalSyntheticLambda5
                @Override // android.os.StrictMode.OnVmViolationListener
                public final void onVmViolation(Violation violation) {
                    CashApp.onCreate$lambda$4$0(violation);
                }
            });
        }
        StrictMode.setVmPolicy(penaltyLog.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4$0(Violation violation) {
        if (violation instanceof LeakedClosableViolation) {
            return;
        }
        violation.getClass();
        throw violation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VariantSandboxedComponent runSandboxedComponentStateFlow$lambda$0(CashApp cashApp, Application application, LeakDetector leakDetector, CoroutineScope coroutineScope, StorageLink storageLink) {
        coroutineScope.getClass();
        storageLink.getClass();
        Timber.Forest.i("Sandbox: Standing up new sandboxed component for " + storageLink, new Object[0]);
        VariantSandboxedComponent buildSandboxedComponent = cashApp.buildSandboxedComponent(JobKt.plus(cashApp.getIoContext(), coroutineScope), storageLink, application);
        JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new DataStoreImpl$data$1(buildSandboxedComponent, leakDetector, storageLink, null, 17), 1);
        return buildSandboxedComponent;
    }

    public final DeepLinkURLStreamHandlerFactory getDeepLinkURLStreamHandlerFactory() {
        DeepLinkURLStreamHandlerFactory deepLinkURLStreamHandlerFactory = this.deepLinkURLStreamHandlerFactory;
        if (deepLinkURLStreamHandlerFactory != null) {
            return deepLinkURLStreamHandlerFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deepLinkURLStreamHandlerFactory");
        throw null;
    }

    public final ErrorReporter getErrorReporter() {
        ErrorReporter errorReporter = this.errorReporter;
        if (errorReporter != null) {
            return errorReporter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("errorReporter");
        throw null;
    }

    public final CoroutineContext getIoContext() {
        CoroutineContext coroutineContext = this.ioContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ioContext");
        throw null;
    }

    public final OpenTheAppUserJourney getOpenTheAppUserJourney() {
        OpenTheAppUserJourney openTheAppUserJourney = this.openTheAppUserJourney;
        if (openTheAppUserJourney != null) {
            return openTheAppUserJourney;
        }
        Intrinsics.throwUninitializedPropertyAccessException("openTheAppUserJourney");
        throw null;
    }

    public Deferred getSandboxedComponentExtFlow() {
        return getSandboxedComponentFlow();
    }

    public final SandboxingAnalyticsLogger getSandboxingAnalyticsLogger() {
        SandboxingAnalyticsLogger sandboxingAnalyticsLogger = this.sandboxingAnalyticsLogger;
        if (sandboxingAnalyticsLogger != null) {
            return sandboxingAnalyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sandboxingAnalyticsLogger");
        throw null;
    }

    public final SessionManager getSessionManager() {
        SessionManager sessionManager = this.sessionManager;
        if (sessionManager != null) {
            return sessionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionManager");
        throw null;
    }

    public final SessionedLink$Store getSessionedLinkStore() {
        SessionedLink$Store sessionedLink$Store = this.sessionedLinkStore;
        if (sessionedLink$Store != null) {
            return sessionedLink$Store;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionedLinkStore");
        throw null;
    }

    public final ThrowableScribe getThrowableScribe() {
        ThrowableScribe throwableScribe = this.throwableScribe;
        if (throwableScribe != null) {
            return throwableScribe;
        }
        Intrinsics.throwUninitializedPropertyAccessException("throwableScribe");
        throw null;
    }

    public final CoroutineContext getUiContext() {
        CoroutineContext coroutineContext = this.uiContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uiContext");
        throw null;
    }

    public final Configuration getWorkManagerConfig() {
        Configuration configuration = this.workManagerConfig;
        if (configuration != null) {
            return configuration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("workManagerConfig");
        throw null;
    }

    public final Deferred launchSandboxedComponentStateFlow(CoroutineScope coroutineScope, LeakDetector leakDetector, Application application) {
        coroutineScope.getClass();
        leakDetector.getClass();
        application.getClass();
        CompletableDeferredImpl completableDeferredImpl = new CompletableDeferredImpl();
        JobKt.launch$default(coroutineScope, getIoContext(), null, new MutatorMutex$mutate$2(completableDeferredImpl, this, leakDetector, application, (Continuation) null, 2), 2);
        return completableDeferredImpl;
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(final android.content.res.Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        StateFlowKt.emitOrThrow(this.events, new Object(configuration) { // from class: com.squareup.cash.lifecycle.ApplicationEvent$ConfigChanged
            public final android.content.res.Configuration newConfig;

            {
                configuration.getClass();
                this.newConfig = configuration;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ApplicationEvent$ConfigChanged) && Intrinsics.areEqual(this.newConfig, ((ApplicationEvent$ConfigChanged) obj).newConfig);
            }

            public final int hashCode() {
                return this.newConfig.hashCode();
            }

            public final String toString() {
                return "ConfigChanged(newConfig=" + this.newConfig + ")";
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02e2  */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate() {
        BugsnagClient logOnlyBugsnagClient;
        Result.Failure failure;
        Object obj;
        Throwable m4120exceptionOrNullimpl;
        int myPid;
        RealBugsnagClient$Companion$$ExternalSyntheticLambda0 realBugsnagClient$Companion$$ExternalSyntheticLambda0;
        CallbackState callbackState;
        Duration.Companion companion = Duration.Companion;
        long currentTimeMillis = System.currentTimeMillis();
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long duration = DurationKt.toDuration(currentTimeMillis, durationUnit);
        long duration2 = DurationKt.toDuration(SystemClock.elapsedRealtime(), durationUnit);
        super.onCreate();
        CoroutineScope coroutineScope = this.scope;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        int i = 0;
        JobKt.launch$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new CashApp$onCreate$1(this, null, i), 2);
        boolean z = true;
        if (shouldReportToRealBugsnag(this)) {
            CoroutineScope coroutineScope2 = this.scope;
            String string2 = getResources().getString(R.string.commit_sha);
            string2.getClass();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm a", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            String string3 = getResources().getString(R.string.commit_timestamp_millis);
            string3.getClass();
            String format2 = simpleDateFormat.format(new Date(Long.parseLong(string3)));
            format2.getClass();
            coroutineScope2.getClass();
            BugsnagTree bugsnagTree = new BugsnagTree();
            MemoryCacheService memoryCacheService = new MemoryCacheService(23);
            ((ConfigInternal) memoryCacheService.imageLoader).releaseStage = "store";
            Set set = ArraysKt___ArraysKt.toSet(new String[]{"com.squareup.cash", "com.squareup.common.thing"});
            ConfigInternal configInternal = (ConfigInternal) memoryCacheService.imageLoader;
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                    }
                }
                configInternal.projectPackages = set;
                MetadataState metadataState = ((ConfigInternal) memoryCacheService.imageLoader).metadataState;
                metadataState.metadata.addMetadata("App", "SHA", string2);
                metadataState.notifyMetadataAdded("App", "SHA", string2);
                MetadataState metadataState2 = ((ConfigInternal) memoryCacheService.imageLoader).metadataState;
                metadataState2.metadata.addMetadata("App", "Build Time", format2);
                metadataState2.notifyMetadataAdded("App", "Build Time", format2);
                realBugsnagClient$Companion$$ExternalSyntheticLambda0 = new RealBugsnagClient$Companion$$ExternalSyntheticLambda0(bugsnagTree, i);
                callbackState = ((ConfigInternal) memoryCacheService.imageLoader).callbackState;
                if (callbackState.onErrorTasks.add(realBugsnagClient$Companion$$ExternalSyntheticLambda0)) {
                    callbackState.internalMetrics.notifyAddCallback("onError");
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    ExitInfoPluginConfiguration exitInfoPluginConfiguration = new ExitInfoPluginConfiguration(true, false, false);
                    exitInfoPluginConfiguration.includeLogcat = true;
                    exitInfoPluginConfiguration.reportUnmatchedANR = true;
                    ((ConfigInternal) memoryCacheService.imageLoader).plugins.add(new BugsnagExitInfoPlugin(exitInfoPluginConfiguration));
                }
                synchronized (Bugsnag.lock) {
                    try {
                        if (Bugsnag.client == null) {
                            Bugsnag.client = new Client(this, memoryCacheService);
                        } else {
                            Bugsnag.getClient().logger.w("Multiple Bugsnag.start calls detected. Ignoring.");
                        }
                    } finally {
                    }
                }
                Timber.Forest forest = Timber.Forest;
                forest.getClass();
                if (bugsnagTree == forest) {
                    a$$ExternalSyntheticBUOutline0.m$3("Cannot plant Timber into itself.");
                    return;
                }
                ArrayList arrayList = Timber.trees;
                synchronized (arrayList) {
                    arrayList.add(bugsnagTree);
                    Object[] array2 = arrayList.toArray(new Timber.Tree[0]);
                    if (array2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    Timber.treeArray = (Timber.Tree[]) array2;
                }
                logOnlyBugsnagClient = new RealBugsnagClient(coroutineScope2);
            }
            configInternal.logger.e("Invalid null value supplied to config.projectPackages, ignoring");
            MetadataState metadataState3 = ((ConfigInternal) memoryCacheService.imageLoader).metadataState;
            metadataState3.metadata.addMetadata("App", "SHA", string2);
            metadataState3.notifyMetadataAdded("App", "SHA", string2);
            MetadataState metadataState22 = ((ConfigInternal) memoryCacheService.imageLoader).metadataState;
            metadataState22.metadata.addMetadata("App", "Build Time", format2);
            metadataState22.notifyMetadataAdded("App", "Build Time", format2);
            realBugsnagClient$Companion$$ExternalSyntheticLambda0 = new RealBugsnagClient$Companion$$ExternalSyntheticLambda0(bugsnagTree, i);
            callbackState = ((ConfigInternal) memoryCacheService.imageLoader).callbackState;
            if (callbackState.onErrorTasks.add(realBugsnagClient$Companion$$ExternalSyntheticLambda0)) {
            }
            if (Build.VERSION.SDK_INT >= 30) {
            }
            synchronized (Bugsnag.lock) {
            }
        } else {
            Thread.setDefaultUncaughtExceptionHandler(new CashApp$$ExternalSyntheticLambda0(this, Thread.getDefaultUncaughtExceptionHandler(), i));
            logOnlyBugsnagClient = new LogOnlyBugsnagClient();
        }
        BugsnagClient bugsnagClient = logOnlyBugsnagClient;
        GlobalSnapshotManager.ensureStarted();
        System.setProperty("app.cash.molecule.snapshotNotifier", "External");
        NoOpLeakDetector noOpLeakDetector = new NoOpLeakDetector();
        initializeAppComponent(this, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(this, 6), this.events, bugsnagClient, noOpLeakDetector);
        RealBugsnagClient realBugsnagClient = bugsnagClient instanceof RealBugsnagClient ? (RealBugsnagClient) bugsnagClient : null;
        int i2 = 3;
        if (realBugsnagClient != null) {
            VariantAppComponent appComponent = appComponent();
            appComponent.getClass();
            JobKt.launch$default(realBugsnagClient.scope, null, null, new RealBoostSelector.AnonymousClass1(realBugsnagClient, appComponent, null, 24), 3);
        }
        VariantAppComponent.Impl impl = (VariantAppComponent.Impl) appComponent();
        impl.getClass();
        CashWorkerFactory cashWorkerFactory = new CashWorkerFactory(impl.sandboxedCashWorkerFactoryProviderInstance);
        Data.Builder builder = new Data.Builder();
        builder.values = cashWorkerFactory;
        this.workManagerConfig = new Configuration(builder);
        this.deepLinkURLStreamHandlerFactory = new DeepLinkURLStreamHandlerFactory(DeepLinksConfig.production);
        this.errorReporter = (ErrorReporter) impl.realErrorReporterProvider.invoke();
        ThrowableScribe throwableScribe = (ThrowableScribe) impl.weakThrowableScribeProvider.getValue();
        throwableScribe.getClass();
        this.throwableScribe = throwableScribe;
        DefaultScheduler defaultScheduler2 = Dispatchers.Default;
        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
        defaultIoScheduler.getClass();
        this.ioContext = defaultIoScheduler;
        HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
        handlerContext.getClass();
        this.uiContext = handlerContext;
        OpenTheAppUserJourney openTheAppUserJourney = (OpenTheAppUserJourney) impl.realOpenTheAppUserJourneyProvider.getValue();
        openTheAppUserJourney.getClass();
        this.openTheAppUserJourney = openTheAppUserJourney;
        SessionManager sessionManager = (SessionManager) impl.doubleWriteSessionManagerProvider.getValue();
        sessionManager.getClass();
        this.sessionManager = sessionManager;
        SandboxingAnalyticsLogger sandboxingAnalyticsLogger = (SandboxingAnalyticsLogger) impl.sandboxingAnalyticsLoggerProvider.getValue();
        sandboxingAnalyticsLogger.getClass();
        this.sandboxingAnalyticsLogger = sandboxingAnalyticsLogger;
        SessionedLink$Store sessionedLink$Store = (SessionedLink$Store) impl.realSessionedLinkStoreProvider.getValue();
        sessionedLink$Store.getClass();
        this.sessionedLinkStore = sessionedLink$Store;
        ErrorReporter.Companion companion2 = ErrorReporter.Companion.$$INSTANCE;
        ErrorReporter errorReporter = getErrorReporter();
        errorReporter.getClass();
        Timber.Forest.d("Setting ErrorReporter singleton instance to " + companion2 + "; previous instance: " + ErrorReporter.Companion.INSTANCE, new Object[0]);
        ErrorReporter.Companion.INSTANCE = errorReporter;
        RealOpenTheAppUserJourney realOpenTheAppUserJourney = (RealOpenTheAppUserJourney) getOpenTheAppUserJourney();
        try {
            Object systemService = ((Application) realOpenTheAppUserJourney.appProcessInfo.delegate).getSystemService("activity");
            systemService.getClass();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            myPid = Process.myPid();
        } catch (Exception e) {
            Result.Companion companion3 = Result.Companion;
            failure = new Result.Failure(e);
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                Result.Companion companion4 = Result.Companion;
                if (runningAppProcessInfo.importance != 100) {
                    z = false;
                }
                obj = Boolean.valueOf(z);
                if (!(obj instanceof Result.Failure)) {
                    if (((Boolean) obj).booleanValue()) {
                        realOpenTheAppUserJourney.m3574startJourneyNqJ4yvY(duration, duration2, UserJourney$Tag$OpenTheApp$ApplicationStart.INSTANCE);
                    } else {
                        Timber.Forest.d("App launched in the background. Skipping open-the-app journey start.", new Object[0]);
                    }
                }
                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
                if (m4120exceptionOrNullimpl != null) {
                    Timber.Forest.e("Unable to retrieve app process info: " + m4120exceptionOrNullimpl.getCause(), new Object[0]);
                }
                setSandboxedComponentFlow(launchSandboxedComponentStateFlow(this.scope, noOpLeakDetector, this));
                Configuration workManagerConfig = getWorkManagerConfig();
                workManagerConfig.getClass();
                WorkManagerImpl.initialize(this, workManagerConfig);
                CoroutineScope coroutineScope3 = this.scope;
                CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2 = new CashApp$$ExternalSyntheticLambda2(this, i);
                coroutineScope3.getClass();
                LaunchTracker.launch$default(new LaunchTracker((Function1) cashApp$$ExternalSyntheticLambda2, (SetupTeardown) null, coroutineScope3), null, 3);
                DimensionKt.initialize(this);
                URL.setURLStreamHandlerFactory(getDeepLinkURLStreamHandlerFactory());
                JobKt.launch$default(this.scope, null, null, new CashApp$onCreate$5(this, null, i), 3);
                if (getResources().getBoolean(R.bool.is_developer_build) || isRunningInTestMode()) {
                }
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Perfs$$ExternalSyntheticLambda0(i2));
                return;
            }
        }
        Result.Companion companion5 = Result.Companion;
        failure = new Result.Failure(new IllegalStateException("Process not found to inspect importance"));
        obj = failure;
        if (!(obj instanceof Result.Failure)) {
        }
        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        if (m4120exceptionOrNullimpl != null) {
        }
        setSandboxedComponentFlow(launchSandboxedComponentStateFlow(this.scope, noOpLeakDetector, this));
        Configuration workManagerConfig2 = getWorkManagerConfig();
        workManagerConfig2.getClass();
        WorkManagerImpl.initialize(this, workManagerConfig2);
        CoroutineScope coroutineScope32 = this.scope;
        CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda22 = new CashApp$$ExternalSyntheticLambda2(this, i);
        coroutineScope32.getClass();
        LaunchTracker.launch$default(new LaunchTracker((Function1) cashApp$$ExternalSyntheticLambda22, (SetupTeardown) null, coroutineScope32), null, 3);
        DimensionKt.initialize(this);
        URL.setURLStreamHandlerFactory(getDeepLinkURLStreamHandlerFactory());
        JobKt.launch$default(this.scope, null, null, new CashApp$onCreate$5(this, null, i), 3);
        if (getResources().getBoolean(R.bool.is_developer_build)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runSandboxedComponentStateFlow(CoroutineScope coroutineScope, LeakDetector leakDetector, Application application, Continuation<? super StateFlow> continuation) {
        CashApp$runSandboxedComponentStateFlow$1 cashApp$runSandboxedComponentStateFlow$1;
        int i;
        CoroutineScope coroutineScope2;
        if (continuation instanceof CashApp$runSandboxedComponentStateFlow$1) {
            cashApp$runSandboxedComponentStateFlow$1 = (CashApp$runSandboxedComponentStateFlow$1) continuation;
            int i2 = cashApp$runSandboxedComponentStateFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cashApp$runSandboxedComponentStateFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                CashApp$runSandboxedComponentStateFlow$1 cashApp$runSandboxedComponentStateFlow$12 = cashApp$runSandboxedComponentStateFlow$1;
                Object obj = cashApp$runSandboxedComponentStateFlow$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cashApp$runSandboxedComponentStateFlow$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SessionManager sessionManager = getSessionManager();
                    CoroutineContext ioContext = getIoContext();
                    SandboxingAnalyticsLogger sandboxingAnalyticsLogger = getSandboxingAnalyticsLogger();
                    SessionedLink$Store sessionedLinkStore = getSessionedLinkStore();
                    cashApp$runSandboxedComponentStateFlow$12.L$0 = coroutineScope;
                    cashApp$runSandboxedComponentStateFlow$12.L$1 = leakDetector;
                    cashApp$runSandboxedComponentStateFlow$12.L$2 = application;
                    cashApp$runSandboxedComponentStateFlow$12.label = 1;
                    obj = BundleKt.activeStorageLinkFlow(coroutineScope, sessionManager, ioContext, sandboxingAnalyticsLogger, sessionedLinkStore, cashApp$runSandboxedComponentStateFlow$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    coroutineScope2 = coroutineScope;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    application = cashApp$runSandboxedComponentStateFlow$12.L$2;
                    leakDetector = cashApp$runSandboxedComponentStateFlow$12.L$1;
                    coroutineScope2 = cashApp$runSandboxedComponentStateFlow$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return StateFlowKt.stateInScoped((StateFlow) obj, coroutineScope2, new CashApp$$ExternalSyntheticLambda4(0, this, application, leakDetector));
            }
        }
        cashApp$runSandboxedComponentStateFlow$1 = new CashApp$runSandboxedComponentStateFlow$1(this, continuation);
        CashApp$runSandboxedComponentStateFlow$1 cashApp$runSandboxedComponentStateFlow$122 = cashApp$runSandboxedComponentStateFlow$1;
        Object obj2 = cashApp$runSandboxedComponentStateFlow$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cashApp$runSandboxedComponentStateFlow$122.label;
        if (i != 0) {
        }
        return StateFlowKt.stateInScoped((StateFlow) obj2, coroutineScope2, new CashApp$$ExternalSyntheticLambda4(0, this, application, leakDetector));
    }

    public final void setDeepLinkURLStreamHandlerFactory(DeepLinkURLStreamHandlerFactory deepLinkURLStreamHandlerFactory) {
        deepLinkURLStreamHandlerFactory.getClass();
        this.deepLinkURLStreamHandlerFactory = deepLinkURLStreamHandlerFactory;
    }

    public final void setErrorReporter(ErrorReporter errorReporter) {
        errorReporter.getClass();
        this.errorReporter = errorReporter;
    }

    public final void setIoContext(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.ioContext = coroutineContext;
    }

    public final void setOpenTheAppUserJourney(OpenTheAppUserJourney openTheAppUserJourney) {
        openTheAppUserJourney.getClass();
        this.openTheAppUserJourney = openTheAppUserJourney;
    }

    public final void setSandboxingAnalyticsLogger(SandboxingAnalyticsLogger sandboxingAnalyticsLogger) {
        sandboxingAnalyticsLogger.getClass();
        this.sandboxingAnalyticsLogger = sandboxingAnalyticsLogger;
    }

    public final void setSessionManager(SessionManager sessionManager) {
        sessionManager.getClass();
        this.sessionManager = sessionManager;
    }

    public final void setSessionedLinkStore(SessionedLink$Store sessionedLink$Store) {
        sessionedLink$Store.getClass();
        this.sessionedLinkStore = sessionedLink$Store;
    }

    public final void setThrowableScribe(ThrowableScribe throwableScribe) {
        throwableScribe.getClass();
        this.throwableScribe = throwableScribe;
    }

    public final void setUiContext(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.uiContext = coroutineContext;
    }

    public final void setWorkManagerConfig(Configuration configuration) {
        configuration.getClass();
        this.workManagerConfig = configuration;
    }
}
