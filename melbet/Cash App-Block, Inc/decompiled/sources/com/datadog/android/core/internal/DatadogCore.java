package com.datadog.android.core.internal;

import android.app.Application;
import android.content.Context;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.exoplayer.ExoPlayerImplInternal$$ExternalSyntheticLambda2;
import androidx.media3.extractor.text.CueEncoder;
import androidx.room.CoroutinesRoom;
import androidx.room.util.DBUtil;
import androidx.transition.Transition;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import app.cash.trifle.KeyHandle$keyPair$2;
import app.cash.zipline.CallResult;
import app.cash.zipline.loader.ZiplineLoader;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q4$$ExternalSyntheticLambda0;
import coil3.request.OneShotDisposable;
import coil3.svg.internal.AndroidSvg;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.bugsnag.android.EventStore$$ExternalSyntheticLambda1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.bugsnag.android.TraceParser$parse$1;
import com.bumptech.glide.GlideBuilder$1;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.api.feature.StorageBackedFeature;
import com.datadog.android.api.net.RequestFactory;
import com.datadog.android.api.storage.FeatureStorageConfiguration;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.core.internal.configuration.DataUploadConfiguration;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.datadog.android.core.internal.data.upload.DataUploadRunnable;
import com.datadog.android.core.internal.data.upload.DataUploader;
import com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.net.info.NetworkInfoProvider;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.core.internal.persistence.datastore.DatastoreFileWriter;
import com.datadog.android.core.internal.persistence.file.FileMover;
import com.datadog.android.core.internal.persistence.file.FilePersistenceConfig;
import com.datadog.android.core.internal.persistence.file.FileWriter;
import com.datadog.android.core.internal.persistence.file.PlainFileReaderWriter;
import com.datadog.android.core.internal.persistence.file.advanced.ConsentAwareFileOrchestrator;
import com.datadog.android.core.internal.persistence.file.advanced.FeatureFileOrchestrator;
import com.datadog.android.core.internal.persistence.file.batch.BatchFileOrchestrator;
import com.datadog.android.core.internal.persistence.file.batch.PlainBatchFileReaderWriter;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.core.internal.system.SystemInfoProvider;
import com.datadog.android.core.internal.thread.BackPressureExecutorService;
import com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor;
import com.datadog.android.core.internal.time.DefaultAppStartTimeProvider;
import com.datadog.android.error.internal.CrashReportsFeature;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.datadog.android.internal.time.DefaultTimeProvider;
import com.datadog.android.ndk.internal.NdkCrashLogDeserializer;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.vitals.VitalReaderRunnable;
import com.fillr.e0;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.filament.Box;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import com.google.android.gms.internal.mlkit_vision_common.zzhm;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.android.gms.internal.mlkit_vision_common.zzhw;
import com.google.android.gms.tasks.zzb;
import com.google.gson.JsonObject;
import com.lyft.kronos.internal.KronosClockImpl;
import com.lyft.kronos.internal.ntp.SntpServiceImpl;
import com.squareup.util.Strings;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public final class DatadogCore implements InternalSdkCore {
    public final Context appContext;
    public final BuildSdkVersionProvider buildSdkVersionProvider;
    public ContextProvider contextProvider;
    public CoreFeature coreFeature;
    public final Set featureContextUpdateReceivers;
    public final ConcurrentHashMap features;
    public final String instanceId;
    public final InternalLogger internalLogger;
    public boolean isDeveloperModeEnabled;
    public final String name;
    public ProcessLifecycleMonitor processLifecycleMonitor;
    public Thread shutdownHook;

    /* renamed from: com.datadog.android.core.internal.DatadogCore$1, reason: invalid class name */
    public final class AnonymousClass1 extends Lambda implements Function1 {
        public static final AnonymousClass1 INSTANCE;
        public static final AnonymousClass1 INSTANCE$1;
        public static final AnonymousClass1 INSTANCE$2;
        public final /* synthetic */ int $r8$classId;

        static {
            int i = 1;
            INSTANCE$1 = new AnonymousClass1(i, 1);
            INSTANCE = new AnonymousClass1(i, 0);
            INSTANCE$2 = new AnonymousClass1(i, 2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(int i, int i2) {
            super(i);
            this.$r8$classId = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    InternalSdkCore internalSdkCore = (InternalSdkCore) obj;
                    internalSdkCore.getClass();
                    return new zzlj(internalSdkCore);
                case 1:
                    obj.getClass();
                    return Unit.INSTANCE;
                default:
                    return String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            }
        }
    }

    public DatadogCore(Context context, String str, String str2) {
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        BuildSdkVersionProvider.Companion.getClass();
        BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = BuildSdkVersionProvider.Companion.DEFAULT;
        this.instanceId = str;
        this.name = str2;
        this.buildSdkVersionProvider = buildSdkVersionProvider$Companion$DEFAULT$1;
        this.features = new ConcurrentHashMap();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.appContext = applicationContext;
        this.contextProvider = new NoOpContextProvider();
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        newSetFromMap.getClass();
        this.featureContextUpdateReceivers = newSetFromMap;
        this.internalLogger = (InternalLogger) anonymousClass1.invoke(this);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final ScheduledExecutorService createScheduledExecutorService(String str) {
        CoreFeature coreFeature$dd_sdk_android_core_release = getCoreFeature$dd_sdk_android_core_release();
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0 localPresenterModule$Companion$$ExternalSyntheticLambda0 = coreFeature$dd_sdk_android_core_release.scheduledExecutorServiceFactory;
        InternalLogger internalLogger = coreFeature$dd_sdk_android_core_release.internalLogger;
        BackPressureStrategy backPressureStrategy = coreFeature$dd_sdk_android_core_release.backpressureStrategy;
        if (backPressureStrategy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backpressureStrategy");
            throw null;
        }
        localPresenterModule$Companion$$ExternalSyntheticLambda0.getClass();
        internalLogger.getClass();
        return new LoggingScheduledThreadPoolExecutor(internalLogger, backPressureStrategy, str);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final ExecutorService createSingleThreadExecutorService(String str) {
        CoreFeature coreFeature$dd_sdk_android_core_release = getCoreFeature$dd_sdk_android_core_release();
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0 localPresenterModule$Companion$$ExternalSyntheticLambda0 = coreFeature$dd_sdk_android_core_release.executorServiceFactory;
        InternalLogger internalLogger = coreFeature$dd_sdk_android_core_release.internalLogger;
        BackPressureStrategy backPressureStrategy = coreFeature$dd_sdk_android_core_release.backpressureStrategy;
        if (backPressureStrategy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backpressureStrategy");
            throw null;
        }
        Strings strings = coreFeature$dd_sdk_android_core_release.timeProvider;
        localPresenterModule$Companion$$ExternalSyntheticLambda0.getClass();
        internalLogger.getClass();
        strings.getClass();
        return new BackPressureExecutorService(internalLogger, str, backPressureStrategy, strings);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final List getAllFeatures() {
        return CollectionsKt.toList(this.features.values());
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final long getAppStartTimeNs() {
        return ((Number) getCoreFeature$dd_sdk_android_core_release().appStartTimeProvider.appStartTimeNs$delegate.getValue()).longValue();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final long getAppUptimeNs() {
        DefaultAppStartTimeProvider defaultAppStartTimeProvider = getCoreFeature$dd_sdk_android_core_release().appStartTimeProvider;
        ((Strings) defaultAppStartTimeProvider.timeProviderFactory.invoke()).getClass();
        return System.nanoTime() - ((Number) defaultAppStartTimeProvider.appStartTimeNs$delegate.getValue()).longValue();
    }

    public final CoreFeature getCoreFeature$dd_sdk_android_core_release() {
        CoreFeature coreFeature = this.coreFeature;
        if (coreFeature != null) {
            return coreFeature;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coreFeature");
        throw null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final DatadogContext getDatadogContext(Set set) {
        set.getClass();
        ThreadPoolExecutor contextExecutorService$dd_sdk_android_core_release = getCoreFeature$dd_sdk_android_core_release().getContextExecutorService$dd_sdk_android_core_release();
        EventStore$$ExternalSyntheticLambda1 eventStore$$ExternalSyntheticLambda1 = new EventStore$$ExternalSyntheticLambda1(1, this, set);
        InternalLogger internalLogger = this.internalLogger;
        return (DatadogContext) zzho.getSafe(zzho.submitSafe(contextExecutorService$dd_sdk_android_core_release, "getDatadogContext", internalLogger, eventStore$$ExternalSyntheticLambda1), "getDatadogContext", internalLogger);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final SdkFeature getFeature(String str) {
        str.getClass();
        return (SdkFeature) this.features.get(str);
    }

    public final Map getFeatureContext(String str) {
        str.getClass();
        return (Map) new EventStore$$ExternalSyntheticLambda1(2, this, str).call();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final OneShotDisposable getFirstPartyHostResolver() {
        return getCoreFeature$dd_sdk_android_core_release().firstPartyHostHeaderTypeResolver;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final Long getLastFatalAnrSent() {
        String readTextSafe;
        CoreFeature coreFeature$dd_sdk_android_core_release = getCoreFeature$dd_sdk_android_core_release();
        File file = new File(coreFeature$dd_sdk_android_core_release.getStorageDir$dd_sdk_android_core_release(), "last_fatal_anr_sent");
        InternalLogger internalLogger = coreFeature$dd_sdk_android_core_release.internalLogger;
        if (!zzhk.existsSafe(file, internalLogger) || (readTextSafe = zzhk.readTextSafe(file, Charsets.UTF_8, internalLogger)) == null) {
            return null;
        }
        return StringsKt.toLongOrNull(10, readTextSafe);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final JsonObject getLastViewEvent() {
        return (JsonObject) getCoreFeature$dd_sdk_android_core_release().lastViewEvent$delegate.getValue();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final String getName() {
        return this.name;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final NetworkInfo getNetworkInfo() {
        return getCoreFeature$dd_sdk_android_core_release().networkInfoProvider.getLatestNetworkInfo();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final String getService() {
        return getCoreFeature$dd_sdk_android_core_release().serviceName;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final TimeInfo getTime() {
        return zzhm.composeTimeInfo(getCoreFeature$dd_sdk_android_core_release().timeProvider);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final Strings getTimeProvider() {
        return getCoreFeature$dd_sdk_android_core_release().timeProvider;
    }

    public final void initialize$dd_sdk_android_core_release(Configuration configuration) {
        Runtime runtime;
        Thread thread;
        if (!new Regex("[a-zA-Z0-9_:./-]{0,195}[a-zA-Z0-9_./-]").matches(configuration.env)) {
            a$$ExternalSyntheticBUOutline0.m$3("The environment name should contain maximum 196 of the following allowed characters [a-zA-Z0-9_:./-] and should never finish with a semicolon.In this case the Datadog SDK will not be initialised.");
            return;
        }
        int i = this.appContext.getApplicationInfo().flags;
        configuration.coreConfig.getClass();
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0 localPresenterModule$Companion$$ExternalSyntheticLambda0 = CoreFeature.DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY;
        InternalLogger internalLogger = this.internalLogger;
        DefaultAppStartTimeProvider defaultAppStartTimeProvider = new DefaultAppStartTimeProvider(new KeyHandle$keyPair$2(this, 10));
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0 localPresenterModule$Companion$$ExternalSyntheticLambda02 = CoreFeature.DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY;
        this.coreFeature = new CoreFeature(internalLogger, defaultAppStartTimeProvider, localPresenterModule$Companion$$ExternalSyntheticLambda0);
        getCoreFeature$dd_sdk_android_core_release().initialize(this.appContext, this.instanceId, configuration);
        this.contextProvider = new CallResult(getCoreFeature$dd_sdk_android_core_release(), new ExoPlayerImplInternal$$ExternalSyntheticLambda2(this, 23));
        Map map = configuration.additionalConfig;
        Object obj = map.get("_dd.source");
        if (obj != null && (obj instanceof String) && !StringsKt.isBlank((CharSequence) obj)) {
            getCoreFeature$dd_sdk_android_core_release().sourceName = (String) obj;
        }
        Object obj2 = map.get("_dd.sdk_version");
        if (obj2 != null && (obj2 instanceof String) && !StringsKt.isBlank((CharSequence) obj2)) {
            getCoreFeature$dd_sdk_android_core_release().sdkVersion = (String) obj2;
        }
        Object obj3 = map.get("_dd.version");
        if (obj3 != null && (obj3 instanceof String) && !StringsKt.isBlank((CharSequence) obj3)) {
            getCoreFeature$dd_sdk_android_core_release().packageVersionProvider.setVersion((String) obj3);
        }
        if (configuration.crashReportsEnabled) {
            registerFeature(new CrashReportsFeature(this));
        }
        Context context = this.appContext;
        if (context instanceof Application) {
            ProcessLifecycleMonitor processLifecycleMonitor = new ProcessLifecycleMonitor(new SVG(context, this.name, this.internalLogger));
            ((Application) context).registerActivityLifecycleCallbacks(processLifecycleMonitor);
            this.processLifecycleMonitor = processLifecycleMonitor;
        }
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        try {
            this.shutdownHook = new Thread(new AFd1lSDK$$ExternalSyntheticLambda0(this, 27), "datadog_shutdown");
            runtime = Runtime.getRuntime();
            thread = this.shutdownHook;
        } catch (IllegalArgumentException e) {
            DBUtil.log$default(this.internalLogger, 5, target, CoreFeature$stop$2.INSTANCE$11, e, false, 48);
        } catch (IllegalStateException e2) {
            DBUtil.log$default(this.internalLogger, 5, target, CoreFeature$stop$2.INSTANCE$10, e2, false, 48);
            stop$dd_sdk_android_core_release();
        } catch (SecurityException e3) {
            DBUtil.log$default(this.internalLogger, 5, target, CoreFeature$stop$2.INSTANCE$12, e3, false, 48);
        }
        if (thread == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shutdownHook");
            throw null;
        }
        runtime.addShutdownHook(thread);
        q4$$ExternalSyntheticLambda0 q4__externalsyntheticlambda0 = new q4$$ExternalSyntheticLambda0(17, this, configuration);
        LoggingScheduledThreadPoolExecutor loggingScheduledThreadPoolExecutor = getCoreFeature$dd_sdk_android_core_release().uploadExecutorService;
        if (loggingScheduledThreadPoolExecutor != null) {
            zzho.scheduleSafe(loggingScheduledThreadPoolExecutor, "Configuration telemetry", 5000L, this.internalLogger, q4__externalsyntheticlambda0);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("uploadExecutorService");
            throw null;
        }
    }

    public final boolean isActive$dd_sdk_android_core_release() {
        return getCoreFeature$dd_sdk_android_core_release().initialized.get();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final boolean isDeveloperModeEnabled() {
        return this.isDeveloperModeEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    @Override // com.datadog.android.core.InternalSdkCore
    public final void registerFeature(Feature feature) {
        ?? r0;
        boolean z;
        CoroutinesRoom.Companion companion;
        CoreFeature coreFeature$dd_sdk_android_core_release = getCoreFeature$dd_sdk_android_core_release();
        ContextProvider contextProvider = this.contextProvider;
        InternalLogger internalLogger = this.internalLogger;
        SdkFeature sdkFeature = new SdkFeature(coreFeature$dd_sdk_android_core_release, contextProvider, feature, internalLogger);
        this.features.put(feature.getName(), sdkFeature);
        Context context = this.appContext;
        String str = this.instanceId;
        context.getClass();
        str.getClass();
        if (!sdkFeature.initialized.get()) {
            if (feature instanceof StorageBackedFeature) {
                int i = coreFeature$dd_sdk_android_core_release.uploadFrequency;
                int maxBatchesPerUploadJob = Thread$State$EnumUnboxingLocalUtility.getMaxBatchesPerUploadJob(coreFeature$dd_sdk_android_core_release.batchProcessingLevel);
                DataUploadConfiguration dataUploadConfiguration = new DataUploadConfiguration(i, maxBatchesPerUploadJob);
                AndroidSvg androidSvg = new AndroidSvg(dataUploadConfiguration);
                StorageBackedFeature storageBackedFeature = (StorageBackedFeature) feature;
                FeatureStorageConfiguration storageConfiguration = storageBackedFeature.getStorageConfiguration();
                FilePersistenceConfig filePersistenceConfig = new FilePersistenceConfig(Thread$State$EnumUnboxingLocalUtility.getWindowDurationMs(coreFeature$dd_sdk_android_core_release.batchSize), storageConfiguration.maxBatchSize, storageConfiguration.maxItemSize, storageConfiguration.maxItemsPerBatch, storageConfiguration.oldBatchThreshold, 536870912L, 5000L);
                e0 e0Var = new e0(feature.getName(), dataUploadConfiguration, filePersistenceConfig, internalLogger, coreFeature$dd_sdk_android_core_release.timeProvider);
                if (context instanceof Application) {
                    ProcessLifecycleMonitor processLifecycleMonitor = new ProcessLifecycleMonitor(e0Var);
                    sdkFeature.processLifecycleMonitor = processLifecycleMonitor;
                    ((Application) context).registerActivityLifecycleCallbacks(processLifecycleMonitor);
                }
                sdkFeature.metricsDispatcher = e0Var;
                String name = storageBackedFeature.getName();
                ConsentProvider consentProvider = coreFeature$dd_sdk_android_core_release.trackingConsentProvider;
                File storageDir$dd_sdk_android_core_release = coreFeature$dd_sdk_android_core_release.getStorageDir$dd_sdk_android_core_release();
                BackPressureExecutorService persistenceExecutorService$dd_sdk_android_core_release = coreFeature$dd_sdk_android_core_release.getPersistenceExecutorService$dd_sdk_android_core_release();
                MetricsDispatcher metricsDispatcher = sdkFeature.metricsDispatcher;
                Strings strings = coreFeature$dd_sdk_android_core_release.timeProvider;
                consentProvider.getClass();
                name.getClass();
                metricsDispatcher.getClass();
                strings.getClass();
                Locale locale = Locale.US;
                BatchFileOrchestrator batchFileOrchestrator = new BatchFileOrchestrator(new File(storageDir$dd_sdk_android_core_release, String.format(locale, "%s-pending-v2", Arrays.copyOf(new Object[]{name}, 1))), filePersistenceConfig, internalLogger, metricsDispatcher, strings);
                BatchFileOrchestrator batchFileOrchestrator2 = new BatchFileOrchestrator(new File(storageDir$dd_sdk_android_core_release, String.format(locale, "%s-v2", Arrays.copyOf(new Object[]{name}, 1))), filePersistenceConfig, internalLogger, metricsDispatcher, strings);
                new FeatureFileOrchestrator(consentProvider, batchFileOrchestrator, batchFileOrchestrator2, new SVG(new FileMover(internalLogger), internalLogger, strings), persistenceExecutorService$dd_sdk_android_core_release, internalLogger);
                ZiplineLoader ziplineLoader = new ZiplineLoader(coreFeature$dd_sdk_android_core_release.getPersistenceExecutorService$dd_sdk_android_core_release(), batchFileOrchestrator2, batchFileOrchestrator, new PlainBatchFileReaderWriter(internalLogger), new PlainFileReaderWriter(internalLogger), new FileMover(internalLogger), internalLogger, filePersistenceConfig, sdkFeature.metricsDispatcher, name);
                internalLogger = internalLogger;
                sdkFeature.storage = ziplineLoader;
                feature.onInitialize(context);
                if (coreFeature$dd_sdk_android_core_release.isMainProcess) {
                    RequestFactory requestFactory = storageBackedFeature.getRequestFactory();
                    CoreFeature.OkHttpCallFactory okHttpCallFactory = coreFeature$dd_sdk_android_core_release.callFactory;
                    if (okHttpCallFactory == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("callFactory");
                        throw null;
                    }
                    String str2 = coreFeature$dd_sdk_android_core_release.sdkVersion;
                    AndroidInfoProvider androidInfoProvider = coreFeature$dd_sdk_android_core_release.androidInfoProvider;
                    String name2 = feature.getName();
                    Strings strings2 = coreFeature$dd_sdk_android_core_release.timeProvider;
                    name2.getClass();
                    strings2.getClass();
                    DataOkHttpUploader dataOkHttpUploader = new DataOkHttpUploader(requestFactory, internalLogger, okHttpCallFactory, str2, androidInfoProvider, new GlideBuilder$1());
                    internalLogger = internalLogger;
                    sdkFeature.uploader = dataOkHttpUploader;
                    String name3 = storageBackedFeature.getName();
                    Storage storage = sdkFeature.storage;
                    DataUploader dataUploader = sdkFeature.uploader;
                    NetworkInfoProvider networkInfoProvider = coreFeature$dd_sdk_android_core_release.networkInfoProvider;
                    SystemInfoProvider systemInfoProvider = coreFeature$dd_sdk_android_core_release.systemInfoProvider;
                    LoggingScheduledThreadPoolExecutor loggingScheduledThreadPoolExecutor = coreFeature$dd_sdk_android_core_release.uploadExecutorService;
                    if (loggingScheduledThreadPoolExecutor == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("uploadExecutorService");
                        throw null;
                    }
                    name3.getClass();
                    storage.getClass();
                    dataUploader.getClass();
                    contextProvider.getClass();
                    networkInfoProvider.getClass();
                    systemInfoProvider.getClass();
                    internalLogger.getClass();
                    MetadataRepo metadataRepo = new MetadataRepo();
                    metadataRepo.mMetadataList = name3;
                    metadataRepo.mEmojiCharArray = loggingScheduledThreadPoolExecutor;
                    metadataRepo.mRootNode = internalLogger;
                    z = true;
                    metadataRepo.mTypeface = new DataUploadRunnable(name3, loggingScheduledThreadPoolExecutor, storage, dataUploader, contextProvider, networkInfoProvider, systemInfoProvider, androidSvg, maxBatchesPerUploadJob, internalLogger);
                    companion = metadataRepo;
                } else {
                    z = true;
                    companion = new CoroutinesRoom.Companion(23);
                }
                sdkFeature.uploadScheduler = companion;
                r0 = z;
            } else {
                r0 = 1;
                feature.onInitialize(context);
            }
            if (feature instanceof ConsentAwareFileOrchestrator) {
                coreFeature$dd_sdk_android_core_release.trackingConsentProvider.registerCallback((ConsentAwareFileOrchestrator) feature);
            }
            PlainFileReaderWriter plainFileReaderWriter = new PlainFileReaderWriter(internalLogger);
            NdkCrashLogDeserializer ndkCrashLogDeserializer = new NdkCrashLogDeserializer(internalLogger, r0);
            String name4 = feature.getName();
            File storageDir$dd_sdk_android_core_release2 = coreFeature$dd_sdk_android_core_release.getStorageDir$dd_sdk_android_core_release();
            DatastoreFileWriter datastoreFileWriter = new DatastoreFileWriter(ndkCrashLogDeserializer, name4, storageDir$dd_sdk_android_core_release2, internalLogger, new Box(internalLogger, plainFileReaderWriter));
            DatastoreFileWriter datastoreFileWriter2 = new DatastoreFileWriter(ndkCrashLogDeserializer, name4, storageDir$dd_sdk_android_core_release2, internalLogger, plainFileReaderWriter);
            BackPressureExecutorService persistenceExecutorService$dd_sdk_android_core_release2 = coreFeature$dd_sdk_android_core_release.getPersistenceExecutorService$dd_sdk_android_core_release();
            internalLogger.getClass();
            UnleashContext unleashContext = new UnleashContext();
            unleashContext.userId = persistenceExecutorService$dd_sdk_android_core_release2;
            unleashContext.sessionId = internalLogger;
            unleashContext.remoteAddress = datastoreFileWriter;
            unleashContext.properties = datastoreFileWriter2;
            sdkFeature.dataStore = unleashContext;
            MapsKt__MapsJVMKt.mapOf(new Pair("track", feature.getName())).getClass();
            sdkFeature.initialized.set(r0);
            sdkFeature.uploadScheduler.startScheduling();
        }
        if (Intrinsics.areEqual(feature.getName(), "rum")) {
            getCoreFeature$dd_sdk_android_core_release().ndkCrashHandler.handleNdkCrash(this);
        }
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void removeContextUpdateReceiver(VitalReaderRunnable vitalReaderRunnable) {
        vitalReaderRunnable.getClass();
        this.featureContextUpdateReceivers.remove(vitalReaderRunnable);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void removeEventReceiver(String str) {
        AtomicReference atomicReference;
        str.getClass();
        SdkFeature sdkFeature = (SdkFeature) this.features.get(str);
        if (sdkFeature == null || (atomicReference = sdkFeature.eventReceiver) == null) {
            return;
        }
        atomicReference.set(null);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void setAnonymousId(UUID uuid) {
        zzho.executeSafe(getCoreFeature$dd_sdk_android_core_release().getContextExecutorService$dd_sdk_android_core_release(), "DatadogCore.setAnonymousId", this.internalLogger, new q4$$ExternalSyntheticLambda0(16, this, uuid));
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void setContextUpdateReceiver(VitalReaderRunnable vitalReaderRunnable) {
        Set set = this.featureContextUpdateReceivers;
        if (set.contains(vitalReaderRunnable)) {
            DBUtil.log$default(this.internalLogger, 4, InternalLogger.Target.USER, new KeyHandle$keyPair$2(vitalReaderRunnable, 11), null, false, 56);
        }
        for (Map.Entry entry : this.features.entrySet()) {
            Map featureContext = getFeatureContext((String) entry.getKey());
            if (!featureContext.isEmpty()) {
                String str = (String) entry.getKey();
                str.getClass();
                if (str.equals("rum")) {
                    String str2 = RumContext.NULL_UUID;
                    vitalReaderRunnable.currentRumContext = zzhw.fromFeatureContext(featureContext);
                }
            }
        }
        set.add(vitalReaderRunnable);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void setEventReceiver(String str, RumFeature rumFeature) {
        str.getClass();
        SdkFeature sdkFeature = (SdkFeature) this.features.get(str);
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (sdkFeature == null) {
            DBUtil.log$default(this.internalLogger, 4, target, new DatadogInterceptor$intercept$1(str, 2), null, false, 56);
            return;
        }
        AtomicReference atomicReference = sdkFeature.eventReceiver;
        if (atomicReference.get() != null) {
            DBUtil.log$default(this.internalLogger, 4, target, new DatadogInterceptor$intercept$1(str, 3), null, false, 56);
        }
        atomicReference.set(rumFeature);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void setUserInfo(String str, Map map) {
        map.getClass();
        Map map2 = MapsKt__MapsKt.toMap(map);
        zzho.executeSafe(getCoreFeature$dd_sdk_android_core_release().getContextExecutorService$dd_sdk_android_core_release(), "DatadogCore.setUserInfo", this.internalLogger, new CardEntryActivityController$$ExternalSyntheticLambda1(2, this, str, map2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void stop$dd_sdk_android_core_release() {
        int i;
        int i2;
        IllegalStateException illegalStateException;
        LoggingScheduledThreadPoolExecutor loggingScheduledThreadPoolExecutor;
        ProcessLifecycleMonitor processLifecycleMonitor;
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        Iterator it = this.features.keySet().iterator();
        while (it.hasNext()) {
            SdkFeature sdkFeature = (SdkFeature) this.features.remove((String) it.next());
            if (sdkFeature != null) {
                CoreFeature coreFeature = sdkFeature.coreFeature;
                Feature feature = sdkFeature.wrappedFeature;
                AtomicBoolean atomicBoolean = sdkFeature.initialized;
                if (atomicBoolean.get()) {
                    feature.onStop();
                    if (feature instanceof ConsentAwareFileOrchestrator) {
                        coreFeature.trackingConsentProvider.unregisterCallback((ConsentAwareFileOrchestrator) feature);
                    }
                    sdkFeature.uploadScheduler.stopScheduling();
                    int i3 = 23;
                    sdkFeature.uploadScheduler = new CoroutinesRoom.Companion(i3);
                    int i4 = 24;
                    sdkFeature.storage = new CueEncoder(i4);
                    sdkFeature.dataStore = new CoroutinesRoom.Companion(i4);
                    sdkFeature.uploader = new CueEncoder(i3);
                    sdkFeature.metricsDispatcher = new GlideBuilder$1();
                    Object obj = coreFeature.contextRef.get();
                    Application application = obj instanceof Application ? (Application) obj : null;
                    if (application != null) {
                        application.unregisterActivityLifecycleCallbacks(sdkFeature.processLifecycleMonitor);
                    }
                    sdkFeature.processLifecycleMonitor = null;
                    sdkFeature.featureContext.clear();
                    atomicBoolean.set(false);
                }
            }
        }
        Context context = this.appContext;
        if ((context instanceof Application) && (processLifecycleMonitor = this.processLifecycleMonitor) != null) {
            ((Application) context).unregisterActivityLifecycleCallbacks(processLifecycleMonitor);
        }
        this.contextProvider = new NoOpContextProvider();
        CoreFeature coreFeature$dd_sdk_android_core_release = getCoreFeature$dd_sdk_android_core_release();
        if (coreFeature$dd_sdk_android_core_release.initialized.get()) {
            Context context2 = (Context) coreFeature$dd_sdk_android_core_release.contextRef.get();
            if (context2 != null) {
                coreFeature$dd_sdk_android_core_release.networkInfoProvider.unregister(context2);
                coreFeature$dd_sdk_android_core_release.systemInfoProvider.unregister(context2);
            }
            coreFeature$dd_sdk_android_core_release.contextRef.clear();
            coreFeature$dd_sdk_android_core_release.trackingConsentProvider.unregisterAllCallbacks();
            coreFeature$dd_sdk_android_core_release.clientToken = "";
            coreFeature$dd_sdk_android_core_release.packageVersionProvider = new Transition.AnonymousClass1();
            coreFeature$dd_sdk_android_core_release.serviceName = "";
            coreFeature$dd_sdk_android_core_release.sourceName = "android";
            coreFeature$dd_sdk_android_core_release.sdkVersion = "3.6.0";
            coreFeature$dd_sdk_android_core_release.isMainProcess = true;
            coreFeature$dd_sdk_android_core_release.envName = "";
            coreFeature$dd_sdk_android_core_release.variant = "";
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            coreFeature$dd_sdk_android_core_release.firstPartyHostHeaderTypeResolver = new OneShotDisposable(emptyMap);
            coreFeature$dd_sdk_android_core_release.networkInfoProvider = new Transition.AnonymousClass1();
            int i5 = 25;
            coreFeature$dd_sdk_android_core_release.systemInfoProvider = new CueEncoder(i5);
            coreFeature$dd_sdk_android_core_release.timeProvider = new DefaultTimeProvider();
            coreFeature$dd_sdk_android_core_release.trackingConsentProvider = new GlideBuilder$1();
            coreFeature$dd_sdk_android_core_release.userInfoProvider = new CoroutinesRoom.Companion(i5);
            coreFeature$dd_sdk_android_core_release.androidInfoProvider = new zzb(6);
            LoggingScheduledThreadPoolExecutor loggingScheduledThreadPoolExecutor2 = coreFeature$dd_sdk_android_core_release.uploadExecutorService;
            if (loggingScheduledThreadPoolExecutor2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uploadExecutorService");
                throw null;
            }
            loggingScheduledThreadPoolExecutor2.shutdownNow();
            coreFeature$dd_sdk_android_core_release.getContextExecutorService$dd_sdk_android_core_release().shutdownNow();
            coreFeature$dd_sdk_android_core_release.getPersistenceExecutorService$dd_sdk_android_core_release().shutdownNow();
            try {
                try {
                    loggingScheduledThreadPoolExecutor = coreFeature$dd_sdk_android_core_release.uploadExecutorService;
                } catch (SecurityException e) {
                    DBUtil.log$default(coreFeature$dd_sdk_android_core_release.internalLogger, 5, target, CoreFeature$stop$2.INSTANCE$7, e, false, 48);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (loggingScheduledThreadPoolExecutor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("uploadExecutorService");
                throw null;
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            loggingScheduledThreadPoolExecutor.awaitTermination(1L, timeUnit);
            coreFeature$dd_sdk_android_core_release.getContextExecutorService$dd_sdk_android_core_release().awaitTermination(1L, timeUnit);
            coreFeature$dd_sdk_android_core_release.getPersistenceExecutorService$dd_sdk_android_core_release().awaitTermination(1L, timeUnit);
            i = 5;
            try {
                KronosClockImpl kronosClockImpl = coreFeature$dd_sdk_android_core_release.kronosClock;
                if (kronosClockImpl != null) {
                    SntpServiceImpl sntpServiceImpl = kronosClockImpl.ntpService;
                    sntpServiceImpl.ensureServiceIsRunning();
                    sntpServiceImpl.state.set(SntpServiceImpl.State.STOPPED);
                    sntpServiceImpl.executor.shutdown();
                }
            } catch (IllegalStateException e2) {
                DBUtil.log$default(coreFeature$dd_sdk_android_core_release.internalLogger, 4, target, CoreFeature$stop$2.INSTANCE, e2, false, 48);
            }
            coreFeature$dd_sdk_android_core_release.initialized.set(false);
            coreFeature$dd_sdk_android_core_release.ndkCrashHandler = new Transition.AnonymousClass1();
            coreFeature$dd_sdk_android_core_release.trackingConsentProvider = new GlideBuilder$1();
        } else {
            i = 5;
        }
        this.isDeveloperModeEnabled = false;
        if (this.shutdownHook == null) {
            return;
        }
        try {
            try {
                Runtime runtime = Runtime.getRuntime();
                try {
                    Thread thread = this.shutdownHook;
                    if (thread != null) {
                        runtime.removeShutdownHook(thread);
                    } else {
                        Intrinsics.throwUninitializedPropertyAccessException("shutdownHook");
                        throw null;
                    }
                } catch (IllegalStateException e3) {
                    illegalStateException = e3;
                    i2 = i;
                    DBUtil.log$default(this.internalLogger, i2, target, CoreFeature$stop$2.INSTANCE$8, illegalStateException, false, 48);
                }
            } catch (IllegalStateException e4) {
                i2 = i;
                illegalStateException = e4;
            }
        } catch (SecurityException e5) {
            DBUtil.log$default(this.internalLogger, i, target, CoreFeature$stop$2.INSTANCE$9, e5, false, 48);
        }
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void updateFeatureContext(String str, Function1 function1, boolean z) {
        Rum$createMonitor$1 rum$createMonitor$1 = new Rum$createMonitor$1(3, this, str, function1);
        if (!z) {
            rum$createMonitor$1.invoke();
            return;
        }
        zzho.executeSafe(getCoreFeature$dd_sdk_android_core_release().getContextExecutorService$dd_sdk_android_core_release(), "DatadogCore.updateFeatureContext-".concat(str), this.internalLogger, new AFd1lSDK$$ExternalSyntheticLambda0(rum$createMonitor$1, 26));
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void writeLastFatalAnrSent(long j) {
        CoreFeature coreFeature$dd_sdk_android_core_release = getCoreFeature$dd_sdk_android_core_release();
        File file = new File(coreFeature$dd_sdk_android_core_release.getStorageDir$dd_sdk_android_core_release(), "last_fatal_anr_sent");
        String valueOf = String.valueOf(j);
        Charset charset = Charsets.UTF_8;
        InternalLogger internalLogger = coreFeature$dd_sdk_android_core_release.internalLogger;
        valueOf.getClass();
        charset.getClass();
        internalLogger.getClass();
        if (zzhk.existsSafe(file, internalLogger) && zzhk.canWriteSafe(file, internalLogger)) {
            zzhk.safeCall(file, null, internalLogger, new TraceParser$parse$1(7, valueOf, charset));
        }
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void writeLastViewEvent(byte[] bArr) {
        if (((BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider).isAtLeastR || this.features.containsKey("ndk-crash-reporting")) {
            CoreFeature coreFeature$dd_sdk_android_core_release = getCoreFeature$dd_sdk_android_core_release();
            ((FileWriter) coreFeature$dd_sdk_android_core_release.lastViewEventFileWriter$delegate.getValue()).writeData((File) coreFeature$dd_sdk_android_core_release.lastViewEventFile$delegate.getValue(), new RawBatchEvent(bArr, RawBatchEvent.EMPTY_BYTE_ARRAY), false);
        } else {
            DBUtil.log$default(this.internalLogger, 3, InternalLogger.Target.MAINTAINER, CoreFeature$stop$2.INSTANCE$13, null, false, 56);
        }
    }
}
