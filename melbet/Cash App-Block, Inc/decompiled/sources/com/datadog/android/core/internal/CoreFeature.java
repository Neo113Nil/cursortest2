package com.datadog.android.core.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.StrictMode;
import androidx.compose.material.AnchoredDraggableState;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.media3.extractor.text.CueEncoder;
import androidx.room.CoroutinesRoom;
import androidx.room.util.DBUtil;
import androidx.transition.Transition;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.q4$$ExternalSyntheticLambda0;
import coil3.request.OneShotDisposable;
import coil3.request.ViewTargetDisposable;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.bumptech.glide.GlideBuilder$1;
import com.datadog.android.DatadogSite;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.core.configuration.BackPressureStrategy;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.internal.DatadogCore;
import com.datadog.android.core.internal.account.MutableAccountInfoProvider;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider;
import com.datadog.android.core.internal.net.info.NetworkInfoProvider;
import com.datadog.android.core.internal.privacy.ConsentProvider;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.core.internal.system.AppVersionProvider;
import com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider;
import com.datadog.android.core.internal.system.SystemInfoProvider;
import com.datadog.android.core.internal.thread.BackPressureExecutorService;
import com.datadog.android.core.internal.thread.BackPressuredBlockingQueue;
import com.datadog.android.core.internal.thread.DatadogThreadFactory;
import com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor;
import com.datadog.android.core.internal.time.DefaultAppStartTimeProvider;
import com.datadog.android.core.internal.user.DatadogUserInfoProvider;
import com.datadog.android.core.internal.user.MutableUserInfoProvider;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.datadog.android.internal.time.DefaultTimeProvider;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.datadog.android.ndk.internal.NdkCrashLogDeserializer;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.android.gms.tasks.zzb;
import com.lyft.kronos.internal.KronosClockImpl;
import com.squareup.util.Strings;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import com.stripe.hcaptcha.HCaptcha;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.CipherSuite;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;

/* loaded from: classes4.dex */
public final class CoreFeature {
    public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 DEFAULT_FLUSHABLE_EXECUTOR_SERVICE_FACTORY = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(17);
    public static final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY = new LocalPresenterModule$Companion$$ExternalSyntheticLambda0(18);
    public static final CipherSuite[] RESTRICTED_CIPHER_SUITES = {CipherSuite.TLS_AES_128_GCM_SHA256, CipherSuite.TLS_AES_256_GCM_SHA384, CipherSuite.TLS_CHACHA20_POLY1305_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384};
    public MutableAccountInfoProvider accountInfoProvider;
    public AndroidInfoProvider androidInfoProvider;
    public volatile String appBuildId;
    public final DefaultAppStartTimeProvider appStartTimeProvider;
    public BackPressureStrategy backpressureStrategy;
    public final int batchProcessingLevel;
    public int batchSize;
    public final BuildSdkVersionProvider buildSdkVersionProvider;
    public OkHttpCallFactory callFactory;
    public volatile String clientToken;
    public ThreadPoolExecutor contextExecutorService;
    public WeakReference contextRef;
    public volatile String envName;
    public final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 executorServiceFactory;
    public OneShotDisposable firstPartyHostHeaderTypeResolver;
    public final AtomicBoolean initialized;
    public final InternalLogger internalLogger;
    public volatile boolean isMainProcess;
    public KronosClockImpl kronosClock;
    public final Lazy lastViewEvent$delegate;
    public final Lazy lastViewEventFile$delegate;
    public final Lazy lastViewEventFileWriter$delegate;
    public final Lazy lazySharedOkHttpClient$delegate;
    public NdkCrashHandler ndkCrashHandler;
    public NetworkInfoProvider networkInfoProvider;
    public AppVersionProvider packageVersionProvider;
    public BackPressureExecutorService persistenceExecutorService;
    public final LocalPresenterModule$Companion$$ExternalSyntheticLambda0 scheduledExecutorServiceFactory;
    public volatile String sdkVersion;
    public volatile String serviceName;
    public volatile DatadogSite site;
    public volatile String sourceName;
    public File storageDir;
    public SystemInfoProvider systemInfoProvider;
    public Strings timeProvider;
    public ConsentProvider trackingConsentProvider;
    public LoggingScheduledThreadPoolExecutor uploadExecutorService;
    public int uploadFrequency;
    public MutableUserInfoProvider userInfoProvider;
    public volatile String variant;

    public final class OkHttpCallFactory implements Call.Factory {
        public final Lazy okhttpClient$delegate;

        public OkHttpCallFactory(ViewRegistryKt$buildView$1$2$1$1 viewRegistryKt$buildView$1$2$1$1) {
            this.okhttpClient$delegate = LazyKt.lazy(viewRegistryKt$buildView$1$2$1$1);
        }

        @Override // okhttp3.Call.Factory
        public final Call newCall(Request request) {
            request.getClass();
            return ((OkHttpClient) this.okhttpClient$delegate.getValue()).newCall(request);
        }
    }

    public CoreFeature(InternalLogger internalLogger, DefaultAppStartTimeProvider defaultAppStartTimeProvider, LocalPresenterModule$Companion$$ExternalSyntheticLambda0 localPresenterModule$Companion$$ExternalSyntheticLambda0) {
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0 localPresenterModule$Companion$$ExternalSyntheticLambda02 = DEFAULT_SCHEDULED_EXECUTOR_SERVICE_FACTORY;
        BuildSdkVersionProvider.Companion.getClass();
        BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = BuildSdkVersionProvider.Companion.DEFAULT;
        internalLogger.getClass();
        this.internalLogger = internalLogger;
        this.appStartTimeProvider = defaultAppStartTimeProvider;
        this.executorServiceFactory = localPresenterModule$Companion$$ExternalSyntheticLambda0;
        this.scheduledExecutorServiceFactory = localPresenterModule$Companion$$ExternalSyntheticLambda02;
        this.buildSdkVersionProvider = buildSdkVersionProvider$Companion$DEFAULT$1;
        this.lazySharedOkHttpClient$delegate = LazyKt.lazy(new CoreFeature$lastViewEvent$2(this, 3));
        this.initialized = new AtomicBoolean(false);
        this.contextRef = new WeakReference(null);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.firstPartyHostHeaderTypeResolver = new OneShotDisposable(emptyMap);
        this.networkInfoProvider = new Transition.AnonymousClass1();
        int i = 25;
        this.systemInfoProvider = new CueEncoder(i);
        this.timeProvider = new DefaultTimeProvider();
        this.trackingConsentProvider = new GlideBuilder$1();
        this.userInfoProvider = new CoroutinesRoom.Companion(i);
        this.accountInfoProvider = new Transition.AnonymousClass1();
        this.packageVersionProvider = new Transition.AnonymousClass1();
        this.androidInfoProvider = new zzb(6);
        this.clientToken = "";
        this.serviceName = "";
        this.sourceName = "android";
        this.sdkVersion = "3.6.0";
        this.isMainProcess = true;
        this.envName = "";
        this.variant = "";
        this.batchSize = 2;
        this.uploadFrequency = 2;
        this.batchProcessingLevel = 2;
        this.ndkCrashHandler = new Transition.AnonymousClass1();
        this.site = DatadogSite.US1;
        this.lastViewEvent$delegate = LazyKt.lazy(new CoreFeature$lastViewEvent$2(this, 0));
        this.lastViewEventFile$delegate = LazyKt.lazy(new CoreFeature$lastViewEvent$2(this, 1));
        this.lastViewEventFileWriter$delegate = LazyKt.lazy(new CoreFeature$lastViewEvent$2(this, 2));
    }

    public final ThreadPoolExecutor getContextExecutorService$dd_sdk_android_core_release() {
        ThreadPoolExecutor threadPoolExecutor = this.contextExecutorService;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contextExecutorService");
        throw null;
    }

    public final BackPressureExecutorService getPersistenceExecutorService$dd_sdk_android_core_release() {
        BackPressureExecutorService backPressureExecutorService = this.persistenceExecutorService;
        if (backPressureExecutorService != null) {
            return backPressureExecutorService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("persistenceExecutorService");
        throw null;
    }

    public final File getStorageDir$dd_sdk_android_core_release() {
        File file = this.storageDir;
        if (file != null) {
            return file;
        }
        Intrinsics.throwUninitializedPropertyAccessException("storageDir");
        throw null;
    }

    public final ConsentProvider getTrackingConsentProvider$dd_sdk_android_core_release() {
        return this.trackingConsentProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void initialize(Context context, String str, Configuration configuration) {
        PackageInfo packageInfo;
        String str2;
        ActivityManager activityManager;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        BackPressureStrategy backPressureStrategy;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object obj;
        InternalLogger.Target target = InternalLogger.Target.USER;
        context.getClass();
        str.getClass();
        if (this.initialized.get()) {
            return;
        }
        Configuration.Core core = configuration.coreConfig;
        this.batchSize = core.batchSize;
        this.uploadFrequency = core.uploadFrequency;
        this.site = core.site;
        this.backpressureStrategy = core.backpressureStrategy;
        int i = 0;
        try {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            packageInfo = ((BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider).isAtLeastTiramisu ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            DBUtil.log$default(this.internalLogger, 5, target, CoreFeature$stop$2.INSTANCE$1, e, false, 48);
            packageInfo = null;
        }
        Integer valueOf = packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null;
        String str3 = configuration.version;
        if (str3 == null) {
            str3 = packageInfo != null ? packageInfo.versionName : null;
            if (str3 == null) {
                str3 = valueOf != null ? valueOf.toString() : null;
                if (str3 == null) {
                    str3 = "?";
                }
            }
        }
        this.packageVersionProvider = new Sniffer(str3, valueOf != null ? valueOf.intValue() : 0);
        this.clientToken = configuration.clientToken;
        String str4 = configuration.service;
        if (str4 == null) {
            str4 = context.getPackageName();
            str4.getClass();
        }
        this.serviceName = str4;
        this.envName = configuration.env;
        this.variant = configuration.variant;
        try {
            InputStream open = context.getAssets().open("datadog.buildId");
            open.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                str2 = StringsKt.trim(AppUpdateData.readText(bufferedReader)).toString();
                bufferedReader.close();
            } finally {
            }
        } catch (FileNotFoundException unused) {
            DBUtil.log$default(this.internalLogger, 3, target, CoreFeature$stop$2.INSTANCE$3, null, false, 56);
            str2 = null;
            this.appBuildId = str2;
            this.contextRef = new WeakReference(context);
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
            }
            if (activityManager != null) {
            }
            runningAppProcessInfo = null;
            this.isMainProcess = runningAppProcessInfo == null ? true : Intrinsics.areEqual(context.getPackageName(), runningAppProcessInfo.processName);
            if (!this.isMainProcess) {
            }
            InternalLogger internalLogger = this.internalLogger;
            backPressureStrategy = this.backpressureStrategy;
            if (backPressureStrategy == null) {
            }
        } catch (Exception e2) {
            DBUtil.log$default(this.internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), CoreFeature$stop$2.INSTANCE$4, e2, 48);
            str2 = null;
            this.appBuildId = str2;
            this.contextRef = new WeakReference(context);
            int myPid2 = Process.myPid();
            Object systemService2 = context.getSystemService("activity");
            if (systemService2 instanceof ActivityManager) {
            }
            if (activityManager != null) {
            }
            runningAppProcessInfo = null;
            this.isMainProcess = runningAppProcessInfo == null ? true : Intrinsics.areEqual(context.getPackageName(), runningAppProcessInfo.processName);
            if (!this.isMainProcess) {
            }
            InternalLogger internalLogger2 = this.internalLogger;
            backPressureStrategy = this.backpressureStrategy;
            if (backPressureStrategy == null) {
            }
        }
        this.appBuildId = str2;
        this.contextRef = new WeakReference(context);
        int myPid22 = Process.myPid();
        Object systemService22 = context.getSystemService("activity");
        activityManager = systemService22 instanceof ActivityManager ? (ActivityManager) systemService22 : null;
        if (activityManager != null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcessInfo = null;
        } else {
            Iterator<T> it = runningAppProcesses.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid22) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        }
        this.isMainProcess = runningAppProcessInfo == null ? true : Intrinsics.areEqual(context.getPackageName(), runningAppProcessInfo.processName);
        if (!this.isMainProcess) {
            DBUtil.log$default(this.internalLogger, 4, target, CoreFeature$stop$2.INSTANCE$5, null, false, 56);
        }
        InternalLogger internalLogger22 = this.internalLogger;
        backPressureStrategy = this.backpressureStrategy;
        if (backPressureStrategy == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backpressureStrategy");
            throw null;
        }
        this.uploadExecutorService = new LoggingScheduledThreadPoolExecutor(internalLogger22, backPressureStrategy, "upload");
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0 localPresenterModule$Companion$$ExternalSyntheticLambda0 = this.executorServiceFactory;
        BackPressureStrategy backPressureStrategy2 = this.backpressureStrategy;
        if (backPressureStrategy2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backpressureStrategy");
            throw null;
        }
        Strings strings = this.timeProvider;
        localPresenterModule$Companion$$ExternalSyntheticLambda0.getClass();
        strings.getClass();
        this.persistenceExecutorService = new BackPressureExecutorService(internalLogger22, "storage", backPressureStrategy2, strings);
        this.contextExecutorService = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new BackPressuredBlockingQueue(this.internalLogger, "context", Integer.MAX_VALUE, CoreFeature$stop$2.INSTANCE$6, DatadogCore.AnonymousClass1.INSTANCE$1, 0, this.timeProvider), new DatadogThreadFactory("context"));
        zzho.executeSafe(getPersistenceExecutorService$dd_sdk_android_core_release(), "NTP Sync initialization", RuntimeUtilsKt.unboundInternalLogger, new q4$$ExternalSyntheticLambda0(15, this, context));
        this.callFactory = new OkHttpCallFactory(new ViewRegistryKt$buildView$1$2$1$1(7, this, configuration.coreConfig));
        OneShotDisposable oneShotDisposable = this.firstPartyHostHeaderTypeResolver;
        Map map = configuration.coreConfig.firstPartyHostsWithHeaderTypes;
        oneShotDisposable.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) oneShotDisposable.job;
        Set<Map.Entry> entrySet = map.entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
        for (Map.Entry entry : entrySet) {
            String str5 = (String) entry.getKey();
            Locale locale = Locale.US;
            linkedHashMap2.put(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str5, locale), entry.getValue());
        }
        oneShotDisposable.job = MapsKt__MapsKt.plus(linkedHashMap, linkedHashMap2);
        this.androidInfoProvider = new AnchoredDraggableState(context);
        CoreFeature$initialize$2 coreFeature$initialize$2 = new CoreFeature$initialize$2(context, i, str);
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Object invoke = coreFeature$initialize$2.invoke();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            this.storageDir = (File) invoke;
            Object obj2 = configuration.additionalConfig.get("_dd.native_source_type");
            String str6 = obj2 instanceof String ? (String) obj2 : null;
            if (this.isMainProcess) {
                File storageDir$dd_sdk_android_core_release = getStorageDir$dd_sdk_android_core_release();
                BackPressureExecutorService persistenceExecutorService$dd_sdk_android_core_release = getPersistenceExecutorService$dd_sdk_android_core_release();
                NdkCrashLogDeserializer ndkCrashLogDeserializer = new NdkCrashLogDeserializer(this.internalLogger, 0);
                InternalLogger internalLogger3 = this.internalLogger;
                CoreFeature$lastViewEvent$2 coreFeature$lastViewEvent$2 = new CoreFeature$lastViewEvent$2(this, 4);
                if (str6 == null) {
                    str6 = "ndk";
                }
                internalLogger3.getClass();
                HCaptcha hCaptcha = new HCaptcha();
                hCaptcha.result = persistenceExecutorService$dd_sdk_android_core_release;
                hCaptcha.exception = ndkCrashLogDeserializer;
                hCaptcha.onSuccessListeners = internalLogger3;
                hCaptcha.onFailureListeners = coreFeature$lastViewEvent$2;
                hCaptcha.onOpenListeners = str6;
                hCaptcha.handler = new File(storageDir$dd_sdk_android_core_release, "ndk_crash_reports_v2");
                this.ndkCrashHandler = hCaptcha;
                zzho.executeSafe(persistenceExecutorService$dd_sdk_android_core_release, "NDK crash check", internalLogger3, new AFd1lSDK$$ExternalSyntheticLambda0(hCaptcha, 28));
            }
            this.trackingConsentProvider = new ViewTargetDisposable();
            BroadcastReceiverSystemInfoProvider broadcastReceiverSystemInfoProvider = new BroadcastReceiverSystemInfoProvider(this.internalLogger);
            this.systemInfoProvider = broadcastReceiverSystemInfoProvider;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            Intent registerReceiver = broadcastReceiverSystemInfoProvider.registerReceiver(context, intentFilter);
            if (registerReceiver != null) {
                broadcastReceiverSystemInfoProvider.onReceive(context, registerReceiver);
            }
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            Intent registerReceiver2 = broadcastReceiverSystemInfoProvider.registerReceiver(context, intentFilter2);
            if (registerReceiver2 != null) {
                broadcastReceiverSystemInfoProvider.onReceive(context, registerReceiver2);
            }
            NetworkInfoProvider callbackNetworkInfoProvider = ((BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider).isAtLeastN ? new CallbackNetworkInfoProvider(this.internalLogger) : new BroadcastReceiverNetworkInfoProvider();
            this.networkInfoProvider = callbackNetworkInfoProvider;
            callbackNetworkInfoProvider.register(context);
            DatadogUserInfoProvider datadogUserInfoProvider = new DatadogUserInfoProvider();
            datadogUserInfoProvider.internalUserInfo = new UserInfo();
            this.userInfoProvider = datadogUserInfoProvider;
            this.internalLogger.getClass();
            this.accountInfoProvider = new GlideBuilder$1();
            this.initialized.set(true);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }
}
