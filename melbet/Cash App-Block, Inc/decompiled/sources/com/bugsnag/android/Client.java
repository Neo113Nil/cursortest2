package com.bugsnag.android;

import android.app.Activity;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.ToolbarActionBar;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.BiometricViewModel;
import androidx.biometric.FingerprintDialogFragment;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ListFuture;
import androidx.camera.core.processing.Edge;
import androidx.camera.video.Recorder;
import androidx.compose.runtime.ComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.AutoScrollHelper$ClampedScroller;
import androidx.core.widget.ListViewAutoScrollHelper;
import androidx.customview.widget.ViewDragHelper;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import androidx.loader.app.LoaderManagerImpl;
import androidx.loader.content.AsyncTaskLoader$LoadTask;
import androidx.media3.exoplayer.source.ProgressiveMediaPeriod;
import androidx.media3.exoplayer.source.SampleQueue;
import androidx.media3.extractor.Extractor;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.work.Constraints;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import coil3.Extras;
import coil3.memory.MemoryCacheService;
import com.android.volley.CacheDispatcher;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.ForegroundDetector;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.InternalMetrics;
import com.bugsnag.android.internal.InternalMetricsImpl;
import com.bugsnag.android.internal.StateObserver;
import com.bugsnag.android.internal.TaskType;
import com.bugsnag.android.internal.dag.ContextModule;
import com.bugsnag.android.internal.dag.Provider;
import com.bugsnag.android.internal.dag.ValueProvider;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.ActiveResources$ResourceWeakReference;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.caverock.androidsvg.SVG;
import com.datadog.android.Datadog$getInstance$1$1;
import com.datadog.trace.core.LongRunningTracesTracker;
import com.datadog.trace.core.PendingTrace;
import com.datadog.trace.core.PendingTraceBuffer;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.model.AutofillPrompt;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.e0;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.m1;
import com.fillr.profile.ProfileDetailedViewFragment;
import com.fillr.profile.adapter.HelperElement;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.filament.Box;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.cloudmessaging.zzj;
import com.google.android.gms.cloudmessaging.zzp;
import com.google.android.gms.cloudmessaging.zzr;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.api.internal.zabk;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.api.internal.zax;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.appset.zzl;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbs;
import com.google.android.gms.internal.measurement.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzba;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbm;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzew;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxg;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxk;
import com.google.android.gms.internal.mlkit_vision_face.zzaj;
import com.google.android.gms.internal.mlkit_vision_face.zzak;
import com.google.android.gms.internal.mlkit_vision_face.zzao;
import com.google.android.gms.internal.mlkit_vision_face.zzar;
import com.google.android.gms.internal.mlkit_vision_face.zzas;
import com.google.android.gms.internal.mlkit_vision_face.zzbd;
import com.google.android.gms.internal.mlkit_vision_face.zzdn;
import com.google.android.gms.internal.mlkit_vision_face.zzdp;
import com.google.android.gms.internal.mlkit_vision_face.zzjt;
import com.google.android.gms.internal.mlkit_vision_face.zzjv;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzab;
import com.google.android.gms.internal.mlkit_vision_text_common.zzag;
import com.google.android.gms.internal.mlkit_vision_text_common.zzan;
import com.google.android.gms.internal.mlkit_vision_text_common.zzdb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeu;
import com.google.android.gms.internal.mlkit_vision_text_common.zznw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.maps.zzah;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzad;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgi;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgz;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhh;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzmb;
import com.google.android.gms.measurement.internal.zzmh;
import com.google.android.gms.measurement.internal.zznd;
import com.google.android.gms.measurement.internal.zznl;
import com.google.android.gms.measurement.internal.zznn;
import com.google.android.gms.measurement.internal.zzok;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.measurement.internal.zzpp;
import com.google.android.gms.measurement.internal.zzx;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.sdkinternal.zzh;
import com.google.mlkit.vision.text.internal.TextRecognizerTaskWithResource;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.CashApp;
import com.squareup.cash.R;
import com.squareup.cash.VariantSandboxedComponent;
import com.squareup.cash.db.WireAdapter;
import com.squareup.workflow1.internal.SubtreeManager;
import curtains.internal.NextDrawListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import net.oneformapp.PopEncryptorV2_;
import net.oneformapp.schema.Element;
import nl.dionsegijn.konfetti.modules.LocationModule;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskLoggerKt;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import org.apache.commons.io.FileUtils;
import org.brotli.dec.HuffmanTreeGroup;
import org.jctools.queues.MpscBlockingConsumerArrayQueue;

/* loaded from: classes.dex */
public final class Client {
    public final Context appContext;
    public final AppDataCollector appDataCollector;
    public final BackgroundTaskService bgTaskService;
    public final BreadcrumbState breadcrumbState;
    public final CallbackState callbackState;
    public final ClientObservable clientObservable;
    public final Map configDifferences;
    public final Extras.Key connectivity;
    public final ContextState contextState;
    public final DeliveryDelegate deliveryDelegate;
    public final DeviceDataCollector deviceDataCollector;
    public final EventStorageModule$special$$inlined$provider$2 eventStore;
    public final ExceptionHandler exceptionHandler;
    public final FeatureFlagState featureFlagState;
    public final GroupingDiscriminatorState groupingDiscriminatorState;
    public final ImmutableConfig immutableConfig;
    public final InternalMetrics internalMetrics;
    public final LastRunInfo lastRunInfo;
    public final LastRunInfoStore lastRunInfoStore;
    public final LaunchCrashTracker launchCrashTracker;
    public final Logger logger;
    public final MemoryTrimState memoryTrimState;
    public final MetadataState metadataState;
    public final Notifier notifier;
    public final ComponentRegistry.Builder pluginClient;
    public final SessionTracker sessionTracker;
    public final SystemBroadcastReceiver systemBroadcastReceiver;
    public final StorageModule$special$$inlined$provider$3 userState;

    /* renamed from: com.bugsnag.android.Client$1, reason: invalid class name */
    public final class AnonymousClass1 implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object this$0;

        public /* synthetic */ AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            int i = this.$r8$classId;
            Object obj3 = this.this$0;
            switch (i) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    HashMap hashMap = new HashMap();
                    hashMap.put("hasConnection", bool);
                    hashMap.put("networkState", (String) obj2);
                    Client client = (Client) obj3;
                    client.leaveAutoBreadcrumb(BreadcrumbType.STATE, "Connectivity changed", hashMap);
                    if (bool.booleanValue()) {
                        ((EventStore) client.eventStore.get()).flushAsync();
                        client.sessionTracker.flushAsync();
                    }
                    return null;
                case 1:
                    ((Client) obj3).leaveBreadcrumb(BreadcrumbType.STATE, (String) obj, (Map) obj2);
                    return null;
                case 2:
                    String str = (String) obj2;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("from", (String) obj);
                    hashMap2.put("to", str);
                    Client client2 = (Client) obj3;
                    client2.leaveAutoBreadcrumb(BreadcrumbType.STATE, "Orientation changed", hashMap2);
                    ClientObservable clientObservable = client2.clientObservable;
                    if (!clientObservable.getObservers$bugsnag_android_core_release().isEmpty()) {
                        StateEvent.UpdateOrientation updateOrientation = new StateEvent.UpdateOrientation(str);
                        Iterator<T> it = clientObservable.getObservers$bugsnag_android_core_release().iterator();
                        while (it.hasNext()) {
                            ((StateObserver) it.next()).onStateChange(updateOrientation);
                        }
                    }
                    return null;
                case 3:
                    Integer num = (Integer) obj2;
                    Client client3 = (Client) obj3;
                    MemoryTrimState memoryTrimState = client3.memoryTrimState;
                    memoryTrimState.isLowMemory = Boolean.TRUE.equals((Boolean) obj);
                    if (!Intrinsics.areEqual(memoryTrimState.memoryTrimLevel, num)) {
                        memoryTrimState.memoryTrimLevel = num;
                        client3.leaveAutoBreadcrumb(BreadcrumbType.STATE, "Trim Memory", Collections.singletonMap("trimLevel", memoryTrimState.getTrimLevelDescription()));
                    }
                    memoryTrimState.emitObservableEvent();
                    return null;
                default:
                    CoroutineScope coroutineScope = (CoroutineScope) obj;
                    VariantSandboxedComponent variantSandboxedComponent = (VariantSandboxedComponent) obj2;
                    coroutineScope.getClass();
                    variantSandboxedComponent.getClass();
                    ((ComposerKt$$ExternalSyntheticLambda0) obj3).invoke(coroutineScope, variantSandboxedComponent);
                    return Unit.INSTANCE;
            }
        }
    }

    public Client(CashApp cashApp, MemoryCacheService memoryCacheService) {
        ConnectivityManager connectivityManager;
        boolean z;
        boolean z2;
        boolean z3;
        Object failure;
        Object failure2;
        Provider provider;
        ErrorTypes errorTypes;
        boolean z4;
        EndpointConfiguration endpointConfiguration;
        Pair pair;
        Method method;
        MemoryTrimState memoryTrimState = new MemoryTrimState();
        this.memoryTrimState = memoryTrimState;
        BackgroundTaskService backgroundTaskService = new BackgroundTaskService();
        this.bgTaskService = backgroundTaskService;
        this.groupingDiscriminatorState = new GroupingDiscriminatorState();
        ContextModule contextModule = new ContextModule(cashApp);
        Context context = contextModule.ctx;
        this.appContext = context;
        Notifier notifier = ((ConfigInternal) memoryCacheService.imageLoader).notifier;
        this.notifier = notifier;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, 0);
        Extras.Key key = new Extras.Key();
        try {
            Object systemService = context.getSystemService("connectivity");
            connectivityManager = (ConnectivityManager) (systemService instanceof ConnectivityManager ? systemService : null);
        } catch (RuntimeException unused) {
            connectivityManager = null;
        }
        key.f61default = connectivityManager == null ? UnknownConnectivity.INSTANCE : new DeliveryParams(connectivityManager, anonymousClass1);
        this.connectivity = key;
        Extras.Key key2 = new Extras.Key();
        Context context2 = contextModule.ctx;
        NoopLogger noopLogger = NoopLogger.INSTANCE$1;
        ConfigInternal configInternal = (ConfigInternal) memoryCacheService.imageLoader;
        String str = configInternal.apiKey;
        String str2 = configInternal.apiKey;
        if (str.length() == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("No Bugsnag API Key set");
            throw null;
        }
        if (str.length() != 32) {
            z3 = true;
            z = true;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                z = true;
                if (!Character.isDigit(charAt) && ('a' > charAt || charAt >= 'g')) {
                    z2 = false;
                    break;
                }
            }
            z = true;
            z2 = true;
            z3 = !z2;
        }
        if (z3) {
            Log.w("Bugsnag", "Invalid configuration. apiKey should be a 32-character hexademical string, got ".concat(str));
        }
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        try {
            Result.Companion companion = Result.Companion;
            failure = packageManager.getPackageInfo(packageName, 0);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        PackageInfo packageInfo = (PackageInfo) (failure instanceof Result.Failure ? null : failure);
        try {
            failure2 = packageManager.getApplicationInfo(packageName, 128);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            failure2 = new Result.Failure(th2);
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) (failure2 instanceof Result.Failure ? null : failure2);
        if (configInternal.releaseStage == null) {
            configInternal.releaseStage = (applicationInfo == null || (applicationInfo.flags & 2) == 0) ? "production" : "development";
        }
        Logger logger = configInternal.logger;
        if (logger == null || logger.equals(noopLogger)) {
            if ("production".equals(configInternal.releaseStage)) {
                NoopLogger noopLogger2 = NoopLogger.INSTANCE;
                configInternal.getClass();
                configInternal.logger = noopLogger2;
            } else {
                configInternal.getClass();
                configInternal.logger = noopLogger;
            }
        }
        Integer num = configInternal.versionCode;
        if (num == null || num.intValue() == 0) {
            configInternal.versionCode = packageInfo != null ? Integer.valueOf(packageInfo.versionCode) : null;
        }
        if (configInternal.projectPackages.isEmpty()) {
            Set of = SetsKt__SetsJVMKt.setOf(packageName);
            if (of != null) {
                Iterator it = of.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                    }
                }
                configInternal.projectPackages = of;
            }
            configInternal.logger.e("Invalid null value supplied to config.projectPackages, ignoring");
            break;
        }
        Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
        int i2 = 3;
        if (bundle != null && bundle.containsKey("com.bugsnag.android.BUILD_UUID") == z) {
            String string2 = bundle.getString("com.bugsnag.android.BUILD_UUID");
            string2 = string2 == null ? String.valueOf(bundle.getInt("com.bugsnag.android.BUILD_UUID")) : string2;
            provider = new ValueProvider(string2.length() <= 0 ? null : string2);
        } else if (applicationInfo != null) {
            TaskType taskType = TaskType.IO;
            StorageModule$special$$inlined$provider$2 storageModule$special$$inlined$provider$2 = new StorageModule$special$$inlined$provider$2(applicationInfo, i2);
            backgroundTaskService.execute(taskType, storageModule$special$$inlined$provider$2);
            provider = storageModule$special$$inlined$provider$2;
        } else {
            provider = null;
        }
        if (configInternal.delivery == null) {
            Logger logger2 = configInternal.logger;
            logger2.getClass();
            configInternal.delivery = new DeliveryParams(key, logger2);
        }
        Lazy lazy = LazyKt.lazy(new Datadog$getInstance$1$1(9, memoryCacheService, context2));
        boolean z5 = configInternal.autoDetectErrors;
        if (z5) {
            ErrorTypes errorTypes2 = configInternal.enabledErrorTypes;
            errorTypes = new ErrorTypes(errorTypes2.anrs, errorTypes2.ndkCrashes, errorTypes2.unhandledExceptions, errorTypes2.unhandledRejections);
        } else {
            errorTypes = new ErrorTypes(false, false, false, false);
        }
        ErrorTypes errorTypes3 = errorTypes;
        boolean z6 = configInternal.autoTrackSessions;
        ThreadSendPolicy threadSendPolicy = configInternal.sendThreads;
        Set set = CollectionsKt.toSet(configInternal.discardClasses);
        Set set2 = CollectionsKt.toSet(configInternal.projectPackages);
        String str3 = configInternal.releaseStage;
        Integer num2 = configInternal.versionCode;
        String str4 = configInternal.appType;
        DeliveryParams deliveryParams = configInternal.delivery;
        if (StringsKt__StringsJVMKt.startsWith(str2, "00000", false)) {
            z4 = z5;
            endpointConfiguration = new EndpointConfiguration("https://notify.bugsnag.smartbear.com", "https://sessions.bugsnag.smartbear.com");
        } else {
            z4 = z5;
            endpointConfiguration = new EndpointConfiguration("https://notify.bugsnag.com", "https://sessions.bugsnag.com");
        }
        EndpointConfiguration endpointConfiguration2 = endpointConfiguration;
        boolean z7 = configInternal.persistUser;
        boolean z8 = configInternal.generateAnonymousId;
        long j = configInternal.launchDurationMillis;
        Logger logger3 = configInternal.logger;
        logger3.getClass();
        key2.f61default = new ImmutableConfig(str2, z4, errorTypes3, z6, threadSendPolicy, set, set2, CollectionsKt.toSet(configInternal.telemetry), str3, provider, num2, str4, deliveryParams, endpointConfiguration2, z7, j, logger3, configInternal.maxBreadcrumbs, configInternal.maxPersistedEvents, configInternal.maxPersistedSessions, configInternal.maxReportedThreads, configInternal.maxStringValueLength, configInternal.threadCollectionTimeLimitMillis, lazy, configInternal.sendLaunchCrashesSynchronously, z8, packageInfo, applicationInfo, CollectionsKt.toSet(configInternal.metadataState.metadata.jsonStreamer.redactedKeys));
        ImmutableConfig immutableConfig = (ImmutableConfig) key2.f61default;
        this.immutableConfig = immutableConfig;
        Logger logger4 = immutableConfig.logger;
        this.logger = logger4;
        StorageModule storageModule = new StorageModule(context, immutableConfig, backgroundTaskService);
        ClientObservable clientObservable = new ClientObservable();
        CallbackState callbackState = ((ConfigInternal) memoryCacheService.imageLoader).callbackState;
        ContextState contextState = new ContextState();
        ((ConfigInternal) memoryCacheService.imageLoader).getClass();
        BreadcrumbState breadcrumbState = new BreadcrumbState(immutableConfig.maxBreadcrumbs, callbackState, immutableConfig.logger);
        ConfigInternal configInternal2 = (ConfigInternal) memoryCacheService.imageLoader;
        MetadataState metadataState = new MetadataState(configInternal2.metadataState.metadata.copy());
        FeatureFlagState featureFlagState = new FeatureFlagState(new FeatureFlags(configInternal2.featureFlagState.featureFlags.flags));
        this.clientObservable = clientObservable;
        this.callbackState = callbackState;
        this.breadcrumbState = breadcrumbState;
        this.contextState = contextState;
        this.metadataState = metadataState;
        this.featureFlagState = featureFlagState;
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(contextModule);
        TrackerModule trackerModule = new TrackerModule(key2, storageModule, this, backgroundTaskService, callbackState);
        StorageModule storageModule2 = new StorageModule(contextModule, key2, workLauncherImpl, trackerModule, backgroundTaskService, key, (StorageModule$special$$inlined$provider$2) storageModule.deviceId, memoryTrimState, clientObservable);
        User user = ((ConfigInternal) memoryCacheService.imageLoader).user;
        TaskType taskType2 = TaskType.IO;
        StorageModule$special$$inlined$provider$3 storageModule$special$$inlined$provider$3 = new StorageModule$special$$inlined$provider$3(storageModule, user, 1);
        backgroundTaskService.execute(taskType2, storageModule$special$$inlined$provider$3);
        this.userState = storageModule$special$$inlined$provider$3;
        EventStorageModule$special$$inlined$provider$2 eventStorageModule$special$$inlined$provider$2 = (EventStorageModule$special$$inlined$provider$2) new TrackerModule(contextModule, key2, storageModule2, backgroundTaskService, trackerModule, workLauncherImpl, notifier, callbackState).sessionTracker;
        this.eventStore = eventStorageModule$special$$inlined$provider$2;
        this.deliveryDelegate = new DeliveryDelegate(logger4, eventStorageModule$special$$inlined$provider$2, immutableConfig, callbackState, notifier, backgroundTaskService);
        ExceptionHandler exceptionHandler = new ExceptionHandler(this, logger4);
        this.exceptionHandler = exceptionHandler;
        this.lastRunInfoStore = (LastRunInfoStore) ((StorageModule$special$$inlined$provider$1) storageModule.lastRunInfoStore).getOrNull();
        this.lastRunInfo = (LastRunInfo) ((StorageModule$special$$inlined$provider$2) storageModule.lastRunInfo).getOrNull();
        this.launchCrashTracker = (LaunchCrashTracker) trackerModule.launchCrashTracker;
        this.sessionTracker = (SessionTracker) ((TrackerModule$special$$inlined$provider$1) trackerModule.sessionTracker).get();
        this.appDataCollector = (AppDataCollector) ((EventStorageModule$special$$inlined$provider$2) storageModule2.lastRunInfoStore).get();
        this.deviceDataCollector = (DeviceDataCollector) ((EventStorageModule$special$$inlined$provider$2) storageModule2.lastRunInfo).get();
        HashSet hashSet = ((ConfigInternal) memoryCacheService.imageLoader).plugins;
        ComponentRegistry.Builder builder = new ComponentRegistry.Builder();
        builder.interceptors = immutableConfig;
        builder.mappers = logger4;
        Plugin instantiatePlugin = builder.instantiatePlugin("com.bugsnag.android.NdkPlugin", immutableConfig.enabledErrorTypes.ndkCrashes);
        builder.lazyFetcherFactories = instantiatePlugin;
        ErrorTypes errorTypes4 = immutableConfig.enabledErrorTypes;
        Plugin instantiatePlugin2 = builder.instantiatePlugin("com.bugsnag.android.AnrPlugin", errorTypes4.anrs);
        builder.lazyDecoderFactories = instantiatePlugin2;
        Plugin instantiatePlugin3 = builder.instantiatePlugin("com.bugsnag.android.BugsnagReactNativePlugin", errorTypes4.unhandledRejections);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(hashSet);
        if (instantiatePlugin != null) {
            linkedHashSet.add(instantiatePlugin);
        }
        if (instantiatePlugin2 != null) {
            linkedHashSet.add(instantiatePlugin2);
        }
        if (instantiatePlugin3 != null) {
            linkedHashSet.add(instantiatePlugin3);
        }
        builder.keyers = CollectionsKt.toSet(linkedHashSet);
        this.pluginClient = builder;
        EnumSet enumSet = ((ConfigInternal) memoryCacheService.imageLoader).telemetry;
        Telemetry telemetry = Telemetry.USAGE;
        int i3 = 10;
        if (enumSet.contains(telemetry)) {
            this.internalMetrics = new InternalMetricsImpl(null);
        } else {
            this.internalMetrics = new zzg(i3);
        }
        ConfigInternal configInternal3 = (ConfigInternal) memoryCacheService.imageLoader;
        ErrorTypes errorTypes5 = configInternal3.enabledErrorTypes;
        EmptySet emptySet = configInternal3.discardClasses;
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        new MetadataState(new Metadata(0));
        new FeatureFlagState(new FeatureFlags());
        ThreadSendPolicy threadSendPolicy2 = ThreadSendPolicy.ALWAYS;
        ErrorTypes errorTypes6 = new ErrorTypes(true, true, true, true);
        EnumSet.of(Telemetry.INTERNAL_ERRORS, telemetry);
        new HashSet();
        HashSet hashSet2 = configInternal3.plugins;
        Pair pair2 = hashSet2.size() > 0 ? new Pair("pluginCount", Integer.valueOf(hashSet2.size())) : null;
        boolean z9 = configInternal3.autoDetectErrors;
        Pair pair3 = !z9 ? new Pair("autoDetectErrors", Boolean.valueOf(z9)) : null;
        boolean z10 = configInternal3.autoTrackSessions;
        Pair pair4 = !z10 ? new Pair("autoTrackSessions", Boolean.valueOf(z10)) : null;
        emptySet.getClass();
        if (Intrinsics.areEqual(errorTypes5, errorTypes6)) {
            pair = null;
        } else {
            List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new String[]{errorTypes5.anrs ? "anrs" : null, errorTypes5.ndkCrashes ? "ndkCrashes" : null, errorTypes5.unhandledExceptions ? "unhandledExceptions" : null, errorTypes5.unhandledRejections ? "unhandledRejections" : null});
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterNotNull, 10));
            Iterator it2 = filterNotNull.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().toString());
            }
            List sorted = CollectionsKt.sorted(arrayList);
            pair = new Pair("enabledErrorTypes", sorted != null ? CollectionsKt.joinToString$default(sorted, ",", null, null, 0, null, null, 62) : "");
        }
        long j2 = configInternal3.launchDurationMillis;
        Pair pair5 = j2 != 0 ? new Pair("launchDurationMillis", Long.valueOf(j2)) : null;
        Pair pair6 = !Intrinsics.areEqual(configInternal3.logger, NoopLogger.INSTANCE) ? new Pair("logger", Boolean.TRUE) : null;
        int i4 = configInternal3.maxBreadcrumbs;
        Pair pair7 = i4 != 100 ? new Pair("maxBreadcrumbs", Integer.valueOf(i4)) : null;
        int i5 = configInternal3.maxPersistedEvents;
        Pair pair8 = i5 != 32 ? new Pair("maxPersistedEvents", Integer.valueOf(i5)) : null;
        int i6 = configInternal3.maxPersistedSessions;
        Pair pair9 = i6 != 128 ? new Pair("maxPersistedSessions", Integer.valueOf(i6)) : null;
        int i7 = configInternal3.maxReportedThreads;
        Pair pair10 = i7 != 200 ? new Pair("maxReportedThreads", Integer.valueOf(i7)) : null;
        long j3 = configInternal3.threadCollectionTimeLimitMillis;
        Pair pair11 = j3 != 5000 ? new Pair("threadCollectionTimeLimitMillis", Long.valueOf(j3)) : null;
        ThreadSendPolicy threadSendPolicy3 = configInternal3.sendThreads;
        this.configDifferences = MapsKt__MapsKt.toMap(ArraysKt___ArraysKt.filterNotNull(new Pair[]{pair2, pair3, pair4, null, null, pair, pair5, pair6, pair7, pair8, pair9, pair10, pair11, null, threadSendPolicy3 != threadSendPolicy2 ? new Pair("sendThreads", threadSendPolicy3) : null, null}));
        this.systemBroadcastReceiver = new SystemBroadcastReceiver(this, logger4);
        if (immutableConfig.enabledErrorTypes.unhandledExceptions) {
            exceptionHandler.enabled = true;
            java.lang.Thread.setDefaultUncaughtExceptionHandler(exceptionHandler);
        }
        NativeInterface.setClient(this);
        for (Plugin plugin : (Set) builder.keyers) {
            try {
                String name = plugin.getClass().getName();
                ErrorTypes errorTypes7 = ((ImmutableConfig) builder.interceptors).enabledErrorTypes;
                if (name.equals("com.bugsnag.android.NdkPlugin")) {
                    if (errorTypes7.ndkCrashes) {
                        plugin.load(this);
                    }
                } else if (!name.equals("com.bugsnag.android.AnrPlugin")) {
                    plugin.load(this);
                } else if (errorTypes7.anrs) {
                    plugin.load(this);
                }
            } catch (Throwable th3) {
                ((Logger) builder.mappers).e("Failed to load plugin " + plugin + ", continuing with initialisation.", th3);
            }
        }
        Plugin plugin2 = (Plugin) this.pluginClient.lazyFetcherFactories;
        if (plugin2 != null) {
            Bugsnag.ndkPlugin = plugin2;
            Bugsnag.setInternalMetricsEnabled = Bugsnag.getMethod("setInternalMetricsEnabled", Boolean.TYPE);
            Bugsnag.setStaticData = Bugsnag.getMethod("setStaticData", Map.class);
            Bugsnag.getMethod("getSignalUnwindStackFunction", new Class[0]);
            Bugsnag.getCurrentCallbackSetCounts = Bugsnag.getMethod("getCurrentCallbackSetCounts", new Class[0]);
            Bugsnag.getCurrentNativeApiCallUsage = Bugsnag.getMethod("getCurrentNativeApiCallUsage", new Class[0]);
            Bugsnag.initCallbackCounts = Bugsnag.getMethod("initCallbackCounts", Map.class);
            Bugsnag.notifyAddCallback = Bugsnag.getMethod("notifyAddCallback", String.class);
            Bugsnag.getMethod("notifyRemoveCallback", String.class);
        }
        if (this.immutableConfig.telemetry.contains(Telemetry.USAGE) && (method = Bugsnag.setInternalMetricsEnabled) != null) {
            method.invoke(Bugsnag.ndkPlugin, Boolean.TRUE);
        }
        EventStore eventStore = (EventStore) this.eventStore.get();
        LastRunInfo lastRunInfo = this.lastRunInfo;
        Logger logger5 = eventStore.logger;
        if (eventStore.config.sendLaunchCrashesSynchronously) {
            try {
                BackgroundTaskService.SafeFuture submitTask = eventStore.bgTaskService.submitTask(TaskType.ERROR_REQUEST, new EventStore$$ExternalSyntheticLambda2(eventStore, 0));
                if (lastRunInfo != null && lastRunInfo.crashedDuringLaunch) {
                    try {
                        long elapsedRealtime = 2000 - (SystemClock.elapsedRealtime() - ForegroundDetector.startupTime);
                        if (0 <= elapsedRealtime && elapsedRealtime < 2001) {
                            submitTask.get(elapsedRealtime, TimeUnit.MILLISECONDS);
                        }
                    } catch (InterruptedException e) {
                        logger5.d("Failed to send launch crash reports within timeout, continuing.", e);
                    } catch (ExecutionException e2) {
                        logger5.d("Failed to send launch crash reports within timeout, continuing.", e2);
                    } catch (TimeoutException e3) {
                        logger5.d("Failed to send launch crash reports within timeout, continuing.", e3);
                    }
                }
            } catch (RejectedExecutionException e4) {
                logger5.d("Failed to flush launch crash reports, continuing.", e4);
            }
        }
        ((EventStore) this.eventStore.get()).flushAsync();
        this.sessionTracker.flushAsync();
        this.internalMetrics.setConfigDifferences(this.configDifferences);
        CallbackState callbackState2 = this.callbackState;
        InternalMetrics internalMetrics = this.internalMetrics;
        callbackState2.internalMetrics = internalMetrics;
        CopyOnWriteArrayList copyOnWriteArrayList = callbackState2.onSessionTasks;
        CopyOnWriteArrayList copyOnWriteArrayList2 = callbackState2.onSendTasks;
        CopyOnWriteArrayList copyOnWriteArrayList3 = callbackState2.onErrorTasks;
        HashMap hashMap = new HashMap();
        CopyOnWriteArrayList copyOnWriteArrayList4 = callbackState2.onBreadcrumbTasks;
        if (copyOnWriteArrayList4.size() > 0) {
            hashMap.put("onBreadcrumb", Integer.valueOf(copyOnWriteArrayList4.size()));
        }
        if (copyOnWriteArrayList3.size() > 0) {
            hashMap.put("onError", Integer.valueOf(copyOnWriteArrayList3.size()));
        }
        if (copyOnWriteArrayList2.size() > 0) {
            hashMap.put("onSendError", Integer.valueOf(copyOnWriteArrayList2.size()));
        }
        if (copyOnWriteArrayList.size() > 0) {
            hashMap.put("onSession", Integer.valueOf(copyOnWriteArrayList.size()));
        }
        internalMetrics.setCallbackCounts(hashMap);
        Context context3 = this.appContext;
        if (context3 instanceof Application) {
            Application application = (Application) context3;
            ForegroundDetector foregroundDetector = ForegroundDetector.INSTANCE;
            Application application2 = ForegroundDetector.observedApplication;
            if (application != application2) {
                if (application2 != null) {
                    application2.unregisterActivityLifecycleCallbacks(foregroundDetector);
                }
                ForegroundDetector.observedApplication = application;
                application.registerActivityLifecycleCallbacks(foregroundDetector);
            }
            SessionTracker sessionTracker = this.sessionTracker;
            ArrayList arrayList2 = ForegroundDetector.listeners;
            synchronized (arrayList2) {
                arrayList2.add(new WeakReference(sessionTracker));
            }
            boolean z11 = ForegroundDetector.isInForeground;
            sessionTracker.onForegroundStatus(z11 ? ForegroundDetector.lastEnteredForegroundMs : ForegroundDetector.lastExitedForegroundMs, z11);
            ImmutableConfig immutableConfig2 = this.immutableConfig;
            BreadcrumbType.Companion companion4 = BreadcrumbType.INSTANCE;
            immutableConfig2.getClass();
            application.registerActivityLifecycleCallbacks(new ActivityBreadcrumbCollector(new AnonymousClass1(this, 1)));
        }
        this.appContext.registerComponentCallbacks(new ClientComponentCallbacks(this.deviceDataCollector, new AnonymousClass1(this, 2), new AnonymousClass1(this, 3)));
        try {
            this.bgTaskService.submitTask(TaskType.DEFAULT, new AnonymousClass3(this, 0));
        } catch (RejectedExecutionException e5) {
            this.logger.w("Failed to register for system events", e5);
        }
        leaveAutoBreadcrumb(BreadcrumbType.STATE, "Bugsnag loaded", new HashMap());
        this.logger.d("Bugsnag loaded");
    }

    public final void finalize() {
        Logger logger = this.logger;
        SystemBroadcastReceiver systemBroadcastReceiver = this.systemBroadcastReceiver;
        if (systemBroadcastReceiver != null) {
            try {
                try {
                    try {
                        try {
                            this.appContext.unregisterReceiver(systemBroadcastReceiver);
                        } catch (IllegalArgumentException e) {
                            if (logger != null) {
                                logger.w("Failed to register receiver", e);
                            }
                        }
                    } catch (SecurityException e2) {
                        if (logger != null) {
                            logger.w("Failed to register receiver", e2);
                        }
                    }
                } catch (RemoteException e3) {
                    if (logger != null) {
                        logger.w("Failed to register receiver", e3);
                    }
                }
            } catch (IllegalArgumentException unused) {
                logger.w("Receiver not registered");
            }
        }
        super.finalize();
    }

    public final void leaveAutoBreadcrumb(BreadcrumbType breadcrumbType, String str, Map map) {
        this.immutableConfig.getClass();
        this.breadcrumbState.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.logger));
    }

    public final void leaveBreadcrumb(BreadcrumbType breadcrumbType, String str, Map map) {
        if (str == null || breadcrumbType == null) {
            logNull("leaveBreadcrumb");
        } else {
            this.breadcrumbState.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.logger));
        }
    }

    public final void logNull(String str) {
        this.logger.e("Invalid null value supplied to client." + str + ", ignoring");
    }

    public final void notify(Throwable th, OnErrorCallback onErrorCallback) {
        if (th == null) {
            logNull("notify");
            return;
        }
        if (this.immutableConfig.shouldDiscardError(th)) {
            return;
        }
        EventInternal eventInternal = new EventInternal(th, this.immutableConfig, SeverityReason.newInstance(null, "handledException", null), this.metadataState.metadata, this.featureFlagState.featureFlags);
        Event event = new Event(eventInternal, this.logger);
        eventInternal.groupingDiscriminator = (String) this.groupingDiscriminatorState.groupingDiscriminator.get();
        populateAndNotifyAndroidEvent(event, onErrorCallback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void notifyUnhandledException(Throwable th, Metadata metadata, String str, String str2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BackgroundTaskService backgroundTaskService = this.bgTaskService;
        SeverityReason newInstance = SeverityReason.newInstance(Severity.ERROR, str, str2);
        Metadata[] metadataArr = {this.metadataState.metadata, metadata};
        ArrayList arrayList = new ArrayList(2);
        boolean z = false;
        Object[] objArr = 0;
        for (int i = 0; i < 2; i++) {
            arrayList.add(metadataArr[i].toMap());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            CollectionsKt__MutableCollectionsKt.addAll(metadataArr[i2].jsonStreamer.redactedKeys, arrayList2);
        }
        Metadata metadata2 = new Metadata(TypeIntrinsics.asMutableMap(Bugsnag.mergeMaps$bugsnag_android_core_release(arrayList)));
        metadata2.jsonStreamer.redactedKeys = CollectionsKt.toSet(arrayList2);
        Event event = new Event(th, this.immutableConfig, newInstance, metadata2, this.featureFlagState.featureFlags, this.logger);
        String str3 = (String) this.groupingDiscriminatorState.groupingDiscriminator.get();
        EventInternal eventInternal = event.impl;
        String str4 = eventInternal.groupingDiscriminator;
        eventInternal.groupingDiscriminator = str3;
        populateAndNotifyAndroidEvent(event, null);
        LastRunInfo lastRunInfo = this.lastRunInfo;
        int i3 = lastRunInfo == null ? 0 : lastRunInfo.consecutiveLaunchCrashes;
        boolean z2 = this.launchCrashTracker.launching.get();
        if (z2) {
            i3++;
        }
        try {
            backgroundTaskService.submitTask(TaskType.IO, new AnonymousClass4(this, new LastRunInfo(i3, true, z2), z, objArr == true ? 1 : 0));
        } catch (RejectedExecutionException e) {
            this.logger.w("Failed to persist last run info", e);
        }
        backgroundTaskService.internalReportExecutor.shutdownNow();
        backgroundTaskService.defaultExecutor.shutdownNow();
        ThreadPoolExecutor threadPoolExecutor = backgroundTaskService.errorExecutor;
        threadPoolExecutor.shutdown();
        ThreadPoolExecutor threadPoolExecutor2 = backgroundTaskService.sessionExecutor;
        threadPoolExecutor2.shutdown();
        ThreadPoolExecutor threadPoolExecutor3 = backgroundTaskService.ioExecutor;
        threadPoolExecutor3.shutdown();
        try {
            threadPoolExecutor.awaitTermination(1500L, timeUnit);
        } catch (InterruptedException unused) {
        }
        try {
            threadPoolExecutor2.awaitTermination(1500L, timeUnit);
        } catch (InterruptedException unused2) {
        }
        try {
            threadPoolExecutor3.awaitTermination(1500L, timeUnit);
        } catch (InterruptedException unused3) {
        }
    }

    public final void populateAndNotifyAndroidEvent(Event event, OnErrorCallback onErrorCallback) {
        DeviceDataCollector deviceDataCollector = this.deviceDataCollector;
        event.impl.device = deviceDataCollector.generateDeviceWithState(new Date().getTime());
        event.impl.metadata.addMetadata("device", deviceDataCollector.getDeviceMetadata());
        AppDataCollector appDataCollector = this.appDataCollector;
        event.impl.f940app = appDataCollector.generateAppWithState();
        event.impl.metadata.addMetadata("app", appDataCollector.getAppDataMetadata());
        event.impl.breadcrumbs = this.breadcrumbState.copy();
        User user = ((UserState) this.userState.get()).user;
        String str = user.id;
        String str2 = user.email;
        String str3 = user.name;
        EventInternal eventInternal = event.impl;
        eventInternal.getClass();
        eventInternal.userImpl = new User(str, str2, str3);
        ContextState contextState = this.contextState;
        String str4 = contextState.automaticContext;
        Session session = null;
        if (str4 == "__BUGSNAG_MANUAL_CONTEXT__") {
            str4 = null;
        }
        if (str4 == null) {
            str4 = contextState.manualContext;
        }
        EventInternal eventInternal2 = event.impl;
        eventInternal2.context = str4;
        eventInternal2.internalMetrics = this.internalMetrics;
        String str5 = (String) this.groupingDiscriminatorState.groupingDiscriminator.get();
        EventInternal eventInternal3 = event.impl;
        String str6 = eventInternal3.groupingDiscriminator;
        eventInternal3.groupingDiscriminator = str5;
        Set set = this.metadataState.metadata.jsonStreamer.redactedKeys;
        eventInternal3.jsonStreamer.redactedKeys = CollectionsKt.toSet(set);
        eventInternal3.metadata.jsonStreamer.redactedKeys = CollectionsKt.toSet(set);
        Session session2 = this.sessionTracker.currentSession;
        if (session2 != null && !session2.isPaused.get()) {
            session = session2;
        }
        if (session != null && (this.immutableConfig.autoTrackSessions || !session.autoCaptured)) {
            event.impl.session = session;
        }
        CallbackState callbackState = this.callbackState;
        Logger logger = this.logger;
        CopyOnWriteArrayList copyOnWriteArrayList = callbackState.onErrorTasks;
        if (!copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                try {
                } catch (Throwable th) {
                    logger.w("OnBreadcrumbCallback threw an Exception", th);
                }
                if (!((OnErrorCallback) it.next()).onError(event)) {
                    break;
                }
            }
        }
        if (onErrorCallback == null || onErrorCallback.onError(event)) {
            ArrayList arrayList = event.impl.errors;
            if (arrayList.size() > 0) {
                String str7 = ((Error) arrayList.get(0)).impl.errorClass;
                String str8 = ((Error) arrayList.get(0)).impl.errorMessage;
                HashMap hashMap = new HashMap();
                hashMap.put("errorClass", str7);
                hashMap.put("message", str8);
                hashMap.put("unhandled", String.valueOf(event.impl.severityReason.unhandled));
                hashMap.put("severity", event.impl.severityReason.currentSeverity.toString());
                this.breadcrumbState.add(new Breadcrumb(str7, BreadcrumbType.ERROR, hashMap, new Date(), this.logger));
            }
            setGroupingDiscriminator((String) this.groupingDiscriminatorState.groupingDiscriminator.get());
            this.deliveryDelegate.deliver(event);
            return;
        }
        this.logger.d("Skipping notification - onError task returned false");
    }

    public final String setGroupingDiscriminator(String str) {
        GroupingDiscriminatorState groupingDiscriminatorState = this.groupingDiscriminatorState;
        String str2 = (String) groupingDiscriminatorState.groupingDiscriminator.getAndSet(str);
        if (!groupingDiscriminatorState.getObservers$bugsnag_android_core_release().isEmpty()) {
            StateEvent.UpdateGroupingDiscriminator updateGroupingDiscriminator = new StateEvent.UpdateGroupingDiscriminator(str);
            Iterator<T> it = groupingDiscriminatorState.getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((StateObserver) it.next()).onStateChange(updateGroupingDiscriminator);
            }
        }
        return str2;
    }

    /* renamed from: com.bugsnag.android.Client$3, reason: invalid class name */
    public final class AnonymousClass3 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(zzmb zzmbVar) {
            this.$r8$classId = 5;
            Objects.requireNonNull(zzmbVar);
            this.this$0 = zzmbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int actionMasked;
            Task awaitTaskToRun;
            long j;
            int i = 1;
            switch (this.$r8$classId) {
                case 0:
                    Client client = (Client) this.this$0;
                    client.connectivity.registerForNetworkChanges();
                    Context context = client.appContext;
                    SystemBroadcastReceiver systemBroadcastReceiver = client.systemBroadcastReceiver;
                    Logger logger = client.logger;
                    if (systemBroadcastReceiver.actions.isEmpty()) {
                        return;
                    }
                    IntentFilter intentFilter = new IntentFilter();
                    Iterator it = systemBroadcastReceiver.actions.keySet().iterator();
                    while (it.hasNext()) {
                        intentFilter.addAction((String) it.next());
                    }
                    Bugsnag.registerReceiverSafe(context, systemBroadcastReceiver, intentFilter, logger);
                    return;
                case 1:
                    AppCompatDelegateImpl appCompatDelegateImpl = (AppCompatDelegateImpl) this.this$0;
                    if ((appCompatDelegateImpl.mInvalidatePanelMenuFeatures & 1) != 0) {
                        appCompatDelegateImpl.doInvalidatePanelMenu(0);
                    }
                    if ((appCompatDelegateImpl.mInvalidatePanelMenuFeatures & 4096) != 0) {
                        appCompatDelegateImpl.doInvalidatePanelMenu(108);
                    }
                    appCompatDelegateImpl.mInvalidatePanelMenuPosted = false;
                    appCompatDelegateImpl.mInvalidatePanelMenuFeatures = 0;
                    return;
                case 2:
                    AndroidComposeView androidComposeView = (AndroidComposeView) this.this$0;
                    androidComposeView.removeCallbacks(this);
                    MotionEvent motionEvent = androidComposeView.previousMotionEvent;
                    if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                        return;
                    }
                    androidComposeView.sendSimulatedEvent(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, androidComposeView.relayoutTime, false);
                    return;
                case 3:
                    SessionTracker sessionTracker = (SessionTracker) this.this$0;
                    Provider provider = sessionTracker.sessionStore;
                    Iterator it2 = ((SessionStore) provider.get()).findStoredFiles().iterator();
                    while (it2.hasNext()) {
                        File file = (File) it2.next();
                        Logger logger2 = sessionTracker.logger;
                        logger2.d("SessionTracker#flushStoredSession() - attempting delivery");
                        Client client2 = sessionTracker.client;
                        Session session = new Session(file, client2.notifier, logger2, sessionTracker.configuration.apiKey);
                        if (session.isLegacyPayload()) {
                            AppDataCollector appDataCollector = client2.appDataCollector;
                            ImmutableConfig immutableConfig = appDataCollector.config;
                            session.f942app = new App(appDataCollector.binaryArch, appDataCollector.packageName, appDataCollector.releaseStage, appDataCollector.versionName, null, immutableConfig.buildUuid, immutableConfig.appType, immutableConfig.versionCode);
                            session.device = client2.deviceDataCollector.generateDevice();
                        }
                        DeliveryStatus deliverSessionPayload = sessionTracker.deliverSessionPayload(session);
                        SessionStore sessionStore = (SessionStore) provider.get();
                        int ordinal = deliverSessionPayload.ordinal();
                        if (ordinal == 0) {
                            sessionStore.deleteStoredFiles(Collections.singletonList(file));
                            logger2.d("Sent 1 new session to Bugsnag");
                        } else if (ordinal == 1) {
                            sessionStore.getClass();
                            Calendar calendar = Calendar.getInstance();
                            calendar.add(5, -60);
                            file.getClass();
                            if (Bugsnag.findTimestampInFilename(file) < calendar.getTimeInMillis()) {
                                logger2.w("Discarding historical session (from {" + new Date(Bugsnag.findTimestampInFilename(file)) + "}) after failed delivery");
                                sessionStore.deleteStoredFiles(Collections.singletonList(file));
                            } else {
                                sessionStore.cancelQueuedFiles(Collections.singletonList(file));
                                logger2.w("Leaving session payload for future delivery");
                            }
                        } else if (ordinal == 2) {
                            logger2.w("Deleting invalid session tracking payload");
                            sessionStore.deleteStoredFiles(Collections.singletonList(file));
                        }
                    }
                    return;
                case 4:
                    Process.setThreadPriority(0);
                    ((Runnable) this.this$0).run();
                    return;
                case 5:
                    ((zzmb) this.this$0).zzh = null;
                    return;
                case 6:
                    zzpg zzpgVar = (zzpg) this.this$0;
                    zzpgVar.zzaX().zzg();
                    zzpgVar.zzm = new zzx(zzpgVar);
                    zzaw zzawVar = new zzaw(zzpgVar);
                    zzawVar.zzaz();
                    zzpgVar.zze = zzawVar;
                    zzht zzhtVar = zzpgVar.zzc;
                    zzal zzd = zzpgVar.zzd();
                    zzae.checkNotNull(zzhtVar);
                    zzd.zzc = zzhtVar;
                    zznn zznnVar = new zznn(zzpgVar);
                    zznnVar.zzaz();
                    zzpgVar.zzk = zznnVar;
                    zzad zzadVar = new zzad(zzpgVar);
                    zzadVar.zzaz();
                    zzpgVar.zzh = zzadVar;
                    zzgz zzgzVar = new zzgz(zzpgVar, i);
                    zzgzVar.zzaz();
                    zzpgVar.zzj = zzgzVar;
                    zzok zzokVar = new zzok(zzpgVar);
                    zzokVar.zzaz();
                    zzpgVar.zzg = zzokVar;
                    zzpgVar.zzf = new zzhb(zzpgVar);
                    if (zzpgVar.zzs != zzpgVar.zzt) {
                        zzpgVar.zzaW().zzd.zzc("Not all upload components initialized", Integer.valueOf(zzpgVar.zzs), Integer.valueOf(zzpgVar.zzt));
                    }
                    zzpgVar.zzo.set(true);
                    zzpgVar.zzaW().zzl.zza("UploadController is now fully initialized");
                    zzpgVar.zzaX().zzg();
                    zzaw zzawVar2 = zzpgVar.zze;
                    zzpg.zzaT(zzawVar2);
                    zzawVar2.zzI();
                    zzaw zzawVar3 = zzpgVar.zze;
                    zzpg.zzaT(zzawVar3);
                    zzawVar3.zzg();
                    zzawVar3.zzay();
                    if (zzawVar3.zzai()) {
                        zzfx zzfxVar = zzfy.zzau;
                        if (((Long) zzfxVar.zzb(null)).longValue() != 0) {
                            SQLiteDatabase zze = zzawVar3.zze();
                            zzic zzicVar = (zzic) zzawVar3.$$delegate_0;
                            zzicVar.zzn.getClass();
                            int delete = zze.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(zzfxVar.zzb(null))});
                            if (delete > 0) {
                                zzgu zzguVar = zzicVar.zzi;
                                zzic.zzP(zzguVar);
                                zzguVar.zzl.zzb(Integer.valueOf(delete), "Deleted stale trigger uris. rowsDeleted");
                            }
                        }
                    }
                    if (zzpgVar.zzk.zzd.zza() == 0) {
                        zzhe zzheVar = zzpgVar.zzk.zzd;
                        zzpgVar.zzba().getClass();
                        zzheVar.zzb(System.currentTimeMillis());
                    }
                    zzpgVar.zzaM();
                    return;
                case 7:
                    NextDrawListener nextDrawListener = (NextDrawListener) this.this$0;
                    ViewTreeObserver viewTreeObserver = nextDrawListener.view.getViewTreeObserver();
                    viewTreeObserver.getClass();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnDrawListener(nextDrawListener);
                        return;
                    }
                    return;
                default:
                    TaskRunner taskRunner = (TaskRunner) this.this$0;
                    synchronized (taskRunner) {
                        taskRunner.runCallCount++;
                        awaitTaskToRun = taskRunner.awaitTaskToRun();
                    }
                    if (awaitTaskToRun == null) {
                        return;
                    }
                    java.lang.Thread currentThread = java.lang.Thread.currentThread();
                    String name = currentThread.getName();
                    do {
                        Task task = awaitTaskToRun;
                        try {
                            currentThread.setName(task.name);
                            java.util.logging.Logger logger3 = ((TaskRunner) this.this$0).logger$1;
                            TaskQueue taskQueue = task.queue;
                            taskQueue.getClass();
                            boolean isLoggable = logger3.isLoggable(Level.FINE);
                            if (isLoggable) {
                                WireAdapter wireAdapter = taskQueue.taskRunner.backend;
                                j = System.nanoTime();
                                logger3.fine(taskQueue.name + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{"starting"}, 1)) + ": " + task.name);
                            } else {
                                j = -1;
                            }
                            try {
                                long runOnce = task.runOnce();
                                if (isLoggable) {
                                    WireAdapter wireAdapter2 = taskQueue.taskRunner.backend;
                                    logger3.fine(taskQueue.name + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{"finished run in " + TaskLoggerKt.formatDuration(System.nanoTime() - j)}, 1)) + ": " + task.name);
                                }
                                TaskRunner taskRunner2 = (TaskRunner) this.this$0;
                                synchronized (taskRunner2) {
                                    TaskRunner.access$afterRun(taskRunner2, task, runOnce, true);
                                    awaitTaskToRun = taskRunner2.awaitTaskToRun();
                                }
                            } catch (Throwable th) {
                                if (isLoggable) {
                                    WireAdapter wireAdapter3 = taskQueue.taskRunner.backend;
                                    logger3.fine(taskQueue.name + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{"failed a run in " + TaskLoggerKt.formatDuration(System.nanoTime() - j)}, 1)) + ": " + task.name);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            try {
                                TaskRunner taskRunner3 = (TaskRunner) this.this$0;
                                synchronized (taskRunner3) {
                                    TaskRunner.access$afterRun(taskRunner3, task, -1L, false);
                                    if (!(th2 instanceof InterruptedException)) {
                                        throw th2;
                                    }
                                    java.lang.Thread.currentThread().interrupt();
                                }
                            } catch (Throwable th3) {
                                currentThread.setName(name);
                                throw th3;
                            }
                        }
                    } while (awaitTaskToRun != null);
                    currentThread.setName(name);
                    return;
            }
        }

        public /* synthetic */ AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        public AnonymousClass3(zzpg zzpgVar, ContextModule contextModule) {
            this.$r8$classId = 6;
            this.this$0 = zzpgVar;
        }
    }

    /* renamed from: com.bugsnag.android.Client$7, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass7 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;

        public AnonymousClass7(zacm zacmVar) {
            this.$r8$classId = 25;
            Objects.requireNonNull(zacmVar);
            this.this$0 = zacmVar;
        }

        /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
        /* JADX WARN: Removed duplicated region for block: B:207:0x048c  */
        /* JADX WARN: Removed duplicated region for block: B:209:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            PendingTraceBuffer.Element element;
            ScheduledFuture scheduledFuture;
            switch (this.$r8$classId) {
                case 0:
                    Client client = (Client) this.this$0;
                    client.immutableConfig.buildUuid.getOrNull();
                    client.clientObservable.postSynchronizeState();
                    return;
                case 1:
                    ToolbarActionBar toolbarActionBar = (ToolbarActionBar) this.this$0;
                    Window.Callback callback = toolbarActionBar.mWindowCallback;
                    MenuBuilder menu = toolbarActionBar.getMenu();
                    MenuBuilder menuBuilder = menu != null ? menu : null;
                    if (menuBuilder != null) {
                        menuBuilder.stopDispatchingItemsChanged();
                    }
                    try {
                        menu.clear();
                        if (callback.onCreatePanelMenu(0, menu)) {
                            if (!callback.onPreparePanel(0, null, menu)) {
                            }
                            if (menuBuilder == null) {
                                menuBuilder.startDispatchingItemsChanged();
                                return;
                            }
                            return;
                        }
                        menu.clear();
                        if (menuBuilder == null) {
                        }
                    } catch (Throwable th) {
                        if (menuBuilder != null) {
                            menuBuilder.startDispatchingItemsChanged();
                        }
                        throw th;
                    }
                case 2:
                    DropDownListView dropDownListView = (DropDownListView) this.this$0;
                    dropDownListView.mResolveHoverRunnable = null;
                    dropDownListView.drawableStateChanged();
                    return;
                case 3:
                    ((Toolbar) this.this$0).showOverflowMenu();
                    return;
                case 4:
                    BiometricViewModel biometricViewModel = ((BiometricFragment) this.this$0).mViewModel;
                    if (biometricViewModel.mClientCallback == null) {
                        biometricViewModel.mClientCallback = new BiometricViewModel.AnonymousClass1();
                    }
                    biometricViewModel.mClientCallback.onAuthenticationFailed();
                    return;
                case 5:
                    FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) this.this$0;
                    Context context = fingerprintDialogFragment.getContext();
                    if (context == null) {
                        Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                        return;
                    } else {
                        fingerprintDialogFragment.mViewModel.setFingerprintDialogState(1);
                        fingerprintDialogFragment.mViewModel.setFingerprintDialogHelpMessage(context.getString(R.string.fingerprint_dialog_touch_sensor));
                        return;
                    }
                case 6:
                    Recorder.AnonymousClass3 anonymousClass3 = (Recorder.AnonymousClass3) this.this$0;
                    HandlerScheduledExecutorService.HandlerScheduledFuture handlerScheduledFuture = (HandlerScheduledExecutorService.HandlerScheduledFuture) anonymousClass3.this$0;
                    if (handlerScheduledFuture.mCompleter.getAndSet(null) != null) {
                        ((Handler) anonymousClass3.val$completer).removeCallbacks(handlerScheduledFuture);
                        return;
                    }
                    return;
                case 7:
                    try {
                        workOnQueue();
                        return;
                    } catch (java.lang.Error e) {
                        synchronized (((SequentialExecutor) this.this$0).mQueue) {
                            ((SequentialExecutor) this.this$0).mWorkerRunningState = 1;
                            throw e;
                        }
                    }
                case 8:
                    ((ListenableFuture) this.this$0).cancel(true);
                    return;
                case 9:
                    ListFuture listFuture = (ListFuture) this.this$0;
                    listFuture.mValues = null;
                    listFuture.mFutures = null;
                    return;
                case 10:
                    ListViewAutoScrollHelper listViewAutoScrollHelper = (ListViewAutoScrollHelper) this.this$0;
                    DropDownListView dropDownListView2 = listViewAutoScrollHelper.mTarget$1;
                    AutoScrollHelper$ClampedScroller autoScrollHelper$ClampedScroller = listViewAutoScrollHelper.mScroller;
                    if (listViewAutoScrollHelper.mAnimating) {
                        if (listViewAutoScrollHelper.mNeedsReset) {
                            listViewAutoScrollHelper.mNeedsReset = false;
                            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                            autoScrollHelper$ClampedScroller.mStartTime = currentAnimationTimeMillis;
                            autoScrollHelper$ClampedScroller.mStopTime = -1L;
                            autoScrollHelper$ClampedScroller.mDeltaTime = currentAnimationTimeMillis;
                            autoScrollHelper$ClampedScroller.mStopValue = 0.5f;
                        }
                        if ((autoScrollHelper$ClampedScroller.mStopTime > 0 && AnimationUtils.currentAnimationTimeMillis() > autoScrollHelper$ClampedScroller.mStopTime + autoScrollHelper$ClampedScroller.mEffectiveRampDown) || !listViewAutoScrollHelper.shouldAnimate()) {
                            listViewAutoScrollHelper.mAnimating = false;
                            return;
                        }
                        if (listViewAutoScrollHelper.mNeedsCancel) {
                            listViewAutoScrollHelper.mNeedsCancel = false;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0);
                            dropDownListView2.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (autoScrollHelper$ClampedScroller.mDeltaTime == 0) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1("Cannot compute scroll delta before calling start()");
                            return;
                        }
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float valueAt = autoScrollHelper$ClampedScroller.getValueAt(currentAnimationTimeMillis2);
                        long j = currentAnimationTimeMillis2 - autoScrollHelper$ClampedScroller.mDeltaTime;
                        autoScrollHelper$ClampedScroller.mDeltaTime = currentAnimationTimeMillis2;
                        listViewAutoScrollHelper.mTarget.scrollListBy((int) (j * ((valueAt * 4.0f) + ((-4.0f) * valueAt * valueAt)) * autoScrollHelper$ClampedScroller.mTargetVelocityY));
                        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                        dropDownListView2.postOnAnimation(this);
                        return;
                    }
                    return;
                case 11:
                    ((ViewDragHelper) this.this$0).setDragState(0);
                    return;
                case 12:
                    ProgressiveMediaPeriod progressiveMediaPeriod = (ProgressiveMediaPeriod) this.this$0;
                    for (SampleQueue sampleQueue : progressiveMediaPeriod.sampleQueues) {
                        sampleQueue.reset(true);
                        Toolbar.AnonymousClass1 anonymousClass1 = sampleQueue.currentDrmSession;
                        if (anonymousClass1 != null) {
                            anonymousClass1.release(sampleQueue.drmEventDispatcher);
                            sampleQueue.currentDrmSession = null;
                            sampleQueue.downstreamFormat = null;
                        }
                    }
                    Recorder.AnonymousClass3 anonymousClass32 = progressiveMediaPeriod.progressiveMediaExtractor;
                    Extractor extractor = (Extractor) anonymousClass32.val$recordingToStart;
                    if (extractor != null) {
                        extractor.release();
                        anonymousClass32.val$recordingToStart = null;
                    }
                    anonymousClass32.this$0 = null;
                    return;
                case 13:
                    ViewPager viewPager = (ViewPager) this.this$0;
                    viewPager.setScrollState(0);
                    viewPager.populate();
                    return;
                case 14:
                    FragmentStateAdapter fragmentStateAdapter = (FragmentStateAdapter) this.this$0;
                    fragmentStateAdapter.mIsInGracePeriod = false;
                    fragmentStateAdapter.gcFragments();
                    return;
                case 15:
                    RequestManager requestManager = (RequestManager) this.this$0;
                    requestManager.lifecycle.addListener(requestManager);
                    return;
                case 16:
                    UnleashContext unleashContext = (UnleashContext) this.this$0;
                    while (true) {
                        try {
                            unleashContext.cleanupActiveReference((ActiveResources$ResourceWeakReference) ((ReferenceQueue) unleashContext.sessionId).remove());
                        } catch (InterruptedException unused) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                    }
                case 17:
                    break;
                case 18:
                    ((AutofillPrompt) this.this$0).fieldFocusedListenerFlag = false;
                    return;
                case 19:
                    ((FillrWidget.WidgetType) this.this$0).name();
                    SVG svg = Fillr.getInstance().fillrConfig;
                    return;
                case 20:
                    ProfileDetailedViewFragment profileDetailedViewFragment = (ProfileDetailedViewFragment) this.this$0;
                    Element element2 = profileDetailedViewFragment.root;
                    if (element2 != null && !element2.isAddress() && profileDetailedViewFragment.isParentArray && profileDetailedViewFragment.readAllArrayElements() == 0 && profileDetailedViewFragment.isAdded()) {
                        profileDetailedViewFragment.onArrayClicked.onClick(profileDetailedViewFragment.btnAddArray);
                        return;
                    }
                    return;
                case 21:
                    if (((TaskCompletionSource) this.this$0).trySetException(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                        return;
                    }
                    return;
                case 22:
                    zaar zaarVar = (zaar) this.this$0;
                    GoogleApiAvailabilityLight googleApiAvailabilityLight = zaarVar.zad;
                    Context context2 = zaarVar.zac;
                    googleApiAvailabilityLight.getClass();
                    if (GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.getAndSet(true)) {
                        return;
                    }
                    try {
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
                        if (notificationManager != null) {
                            notificationManager.cancel(10436);
                            return;
                        }
                        return;
                    } catch (SecurityException e2) {
                        Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e2);
                        return;
                    }
                case 23:
                    ((zabk) this.this$0).zaC();
                    return;
                case 24:
                    zabk zabkVar = (zabk) ((m1) this.this$0).a;
                    zabkVar.zac.disconnect(zabkVar.zac.getClass().getName().concat(" disconnecting because it was signed out."));
                    return;
                case 25:
                    ((zacm) this.this$0).zah.zaa(new ConnectionResult(4, null, null));
                    return;
                case 26:
                    zax zaxVar = (zax) this.this$0;
                    zaxVar.zam.lock();
                    try {
                        zaxVar.zao();
                        return;
                    } finally {
                        zaxVar.zam.unlock();
                    }
                case 27:
                    Context context3 = ((zzl) this.this$0).zzb;
                    long j2 = zzl.zzf(context3).getLong("app_set_id_last_used_time", -1L);
                    long j3 = j2 != -1 ? j2 + 33696000000L : -1L;
                    if (j3 == -1 || System.currentTimeMillis() <= j3) {
                        return;
                    }
                    if (!zzl.zzf(context3).edit().remove("app_set_id").commit()) {
                        String valueOf = String.valueOf(context3.getPackageName());
                        Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                    }
                    if (context3.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                        return;
                    }
                    String valueOf2 = String.valueOf(context3.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                    return;
                case 28:
                    zzxk zzxkVar = (zzxk) this.this$0;
                    synchronized (zzxkVar.zzh) {
                        try {
                            if (zzxkVar.zze == 2 && !zzxkVar.zzg.get() && (scheduledFuture = zzxkVar.zzc) != null && !scheduledFuture.isCancelled()) {
                                if (zzxkVar.zzn > 1.0f && zzxkVar.zza() >= zzxkVar.zza.zzj) {
                                    zzxk.zzf.i("Reset zoom = 1");
                                    zzxkVar.zzl(1.0f, zzrc.SCANNER_AUTO_ZOOM_AUTO_RESET, null);
                                }
                                return;
                            }
                            return;
                        } finally {
                        }
                    }
                default:
                    zzaw zzawVar = (zzaw) this.this$0;
                    try {
                        SQLiteDatabase zze = zzawVar.zze();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("elapsed_time", (Long) 0L);
                        zze.update("raw_events", contentValues, null, null);
                        return;
                    } catch (SQLiteException e3) {
                        zzgu zzguVar = ((zzic) zzawVar.$$delegate_0).zzi;
                        zzic.zzP(zzguVar);
                        zzguVar.zzd.zzb(e3, "Failed to remove elapsed times from raw events table");
                        return;
                    }
            }
            while (!((PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0).closed && !java.lang.Thread.currentThread().isInterrupted()) {
                try {
                    boolean longRunningSpansEnabled = ((PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0).longRunningSpansEnabled();
                    MpscBlockingConsumerArrayQueue mpscBlockingConsumerArrayQueue = ((PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0).queue;
                    if (longRunningSpansEnabled) {
                        element = (PendingTraceBuffer.Element) mpscBlockingConsumerArrayQueue.poll(1L, TimeUnit.SECONDS);
                        PendingTraceBuffer.DelayingPendingTraceBuffer delayingPendingTraceBuffer = (PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0;
                        LongRunningTracesTracker longRunningTracesTracker = delayingPendingTraceBuffer.runningTracesTracker;
                        delayingPendingTraceBuffer.timeSource.getClass();
                        longRunningTracesTracker.flushAndCompact(System.currentTimeMillis());
                        if (element == null) {
                        }
                    } else {
                        element = (PendingTraceBuffer.Element) mpscBlockingConsumerArrayQueue.take();
                    }
                    if (element instanceof PendingTraceBuffer.DelayingPendingTraceBuffer.FlushElement) {
                        ((PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0).queue.drain(PendingTraceBuffer.DelayingPendingTraceBuffer.WriteDrain.WRITE_DRAIN);
                        ((PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0).flushCounter.incrementAndGet();
                    } else {
                        element.setEnqueued(false);
                        if (((PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0).longRunningSpansEnabled()) {
                            LongRunningTracesTracker longRunningTracesTracker2 = ((PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0).runningTracesTracker;
                            longRunningTracesTracker2.getClass();
                            if (element instanceof PendingTrace) {
                                PendingTrace pendingTrace = (PendingTrace) element;
                                if (PendingTrace.LONG_RUNNING_STATE.compareAndSet(pendingTrace, 1, 2)) {
                                    ArrayList arrayList = (ArrayList) longRunningTracesTracker2.traceArray;
                                    if (!(PendingTrace.PENDING_REFERENCE_COUNT.get(pendingTrace) + PendingTrace.COMPLETED_SPAN_COUNT.get(pendingTrace) <= 0) && arrayList.size() != longRunningTracesTracker2.maxTrackedTraces) {
                                        arrayList.add(pendingTrace);
                                    }
                                }
                            }
                        }
                        long oldestFinishedTime = element.oldestFinishedTime() / 1000000;
                        ((PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0).timeSource.getClass();
                        if (oldestFinishedTime <= System.currentTimeMillis() - 5000) {
                            element.write();
                        } else if (element.lastReferencedNanosAgo()) {
                            element.write();
                        } else {
                            ((PendingTraceBuffer.DelayingPendingTraceBuffer) this.this$0).enqueue(element);
                            java.lang.Thread.sleep(100L);
                        }
                    }
                } catch (InterruptedException unused2) {
                    java.lang.Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
        
            r4.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            utils.StringUtilsKt.e("SequentialExecutor", "Exception while executing runnable " + r4, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        
            if (r1 == false) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void workOnQueue() {
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    synchronized (((SequentialExecutor) this.this$0).mQueue) {
                        if (!z) {
                            SequentialExecutor sequentialExecutor = (SequentialExecutor) this.this$0;
                            if (sequentialExecutor.mWorkerRunningState != 4) {
                                sequentialExecutor.mWorkerRunCount++;
                                sequentialExecutor.mWorkerRunningState = 4;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) ((SequentialExecutor) this.this$0).mQueue.poll();
                        if (runnable == null) {
                            ((SequentialExecutor) this.this$0).mWorkerRunningState = 1;
                        }
                    }
                    if (!z2) {
                        return;
                    }
                } finally {
                    if (z2) {
                        java.lang.Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public /* synthetic */ AnonymousClass7(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }

    /* renamed from: com.bugsnag.android.Client$4, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass4 implements Runnable {
        public final /* synthetic */ int $r8$classId;
        public final Object this$0;
        public final Object val$runInfo;

        public AnonymousClass4(zzlj zzljVar, zzcs zzcsVar) {
            this.$r8$classId = 25;
            this.val$runInfo = zzcsVar;
            Objects.requireNonNull(zzljVar);
            this.this$0 = zzljVar;
        }

        private final void run$com$google$android$gms$internal$mlkit_vision_barcode$zzei() {
            Object obj;
            Object obj2 = ((zzew) this.val$runInfo).value;
            Throwable th = obj2 instanceof zzdz.zzc ? ((zzdz.zzc) obj2).zzb : null;
            if (th != null) {
                ((LocationModule) this.this$0).zza(th);
                return;
            }
            try {
                zzew zzewVar = (zzew) this.val$runInfo;
                if (!zzewVar.isDone()) {
                    throw new IllegalStateException(zzba.zzb("Future was expected to be done: %s", zzewVar));
                }
                boolean z = false;
                while (true) {
                    try {
                        obj = zzewVar.get();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (Throwable th2) {
                        if (z) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                }
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                LocationModule locationModule = (LocationModule) this.this$0;
                Float f = (Float) obj;
                if (f.floatValue() >= 1.0f) {
                    zzxk zzxkVar = (zzxk) locationModule.random;
                    float floatValue = f.floatValue();
                    synchronized (zzxkVar.zzh) {
                        zzxkVar.zzn = floatValue;
                        zzxkVar.zzr(false);
                    }
                    ((zzxk) locationModule.random).zzq((zzrc) locationModule.maxX, locationModule.minX, f.floatValue(), (zzxg) locationModule.maxY);
                }
                ((zzxk) locationModule.random).zzg.set(false);
            } catch (ExecutionException e) {
                ((LocationModule) this.this$0).zza(e.getCause());
            } catch (Throwable th3) {
                ((LocationModule) this.this$0).zza(th3);
            }
        }

        private final void run$com$google$android$gms$measurement$internal$zzl() {
            zzlj zzljVar = ((AppMeasurementDynamiteService) this.this$0).zza.zzp;
            zzic.zzO(zzljVar);
            zbc zbcVar = (zbc) this.val$runInfo;
            zzljVar.zzg();
            zzljVar.zzb$1();
            zbc zbcVar2 = zzljVar.zzd;
            if (zbcVar != zbcVar2) {
                zzae.checkState("EventInterceptor already set.", zbcVar2 == null);
            }
            zzljVar.zzd = zbcVar;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:239|240|241|(5:243|244|(5:251|252|254|255|(3:257|258|(1:260)(5:261|262|(1:264)|265|266)))(1:248)|249|250)|291|244|(1:246)|251|252|254|255|(4:257|258|(0)(0)|260)) */
        /* JADX WARN: Code restructure failed: missing block: B:272:0x078a, code lost:
        
            if (r2 != null) goto L226;
         */
        /* JADX WARN: Code restructure failed: missing block: B:283:0x076b, code lost:
        
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:284:0x0768, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:285:0x0769, code lost:
        
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:286:0x0761, code lost:
        
            r1 = com.fillr.browsersdk.Fillr.getInstance().fillrConfig;
         */
        /* JADX WARN: Code restructure failed: missing block: B:287:0x0770, code lost:
        
            r1 = null;
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:288:0x076d, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:289:0x076e, code lost:
        
            r2 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:260:0x074a A[Catch: all -> 0x074e, Exception -> 0x0785, LOOP:6: B:257:0x0744->B:260:0x074a, LOOP_END, TryCatch #20 {Exception -> 0x0785, all -> 0x074e, blocks: (B:258:0x0744, B:260:0x074a, B:262:0x0751), top: B:257:0x0744 }] */
        /* JADX WARN: Removed duplicated region for block: B:261:0x0751 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x014c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r15v0, types: [com.google.common.util.concurrent.ListenableFuture] */
        /* JADX WARN: Type inference failed for: r15v15 */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            String str;
            BufferedReader bufferedReader;
            StringBuilder sb;
            String readLine;
            File file;
            String stringExtra;
            HelperElement helperElement;
            AppCompatEditText appCompatEditText;
            HelperElement helperElement2;
            Long valueOf;
            int i = 3;
            WorkSpec workSpec = 0;
            r15 = null;
            r15 = null;
            InputStream inputStream = null;
            String str2 = null;
            try {
                switch (this.$r8$classId) {
                    case 0:
                        ((Client) this.this$0).lastRunInfoStore.persist((LastRunInfo) this.val$runInfo);
                        return;
                    case 1:
                        FutureCallback futureCallback = (FutureCallback) this.this$0;
                        try {
                            futureCallback.onSuccess(Futures.getDone((Future) this.val$runInfo));
                            return;
                        } catch (java.lang.Error | RuntimeException e) {
                            futureCallback.onFailure(e);
                            return;
                        } catch (ExecutionException e2) {
                            Throwable cause = e2.getCause();
                            if (cause == null) {
                                futureCallback.onFailure(e2);
                                return;
                            } else {
                                futureCallback.onFailure(cause);
                                return;
                            }
                        }
                    case 2:
                        BiometricViewModel biometricViewModel = ((BiometricFragment) this.this$0).mViewModel;
                        if (biometricViewModel.mClientCallback == null) {
                            biometricViewModel.mClientCallback = new BiometricViewModel.AnonymousClass1();
                        }
                        biometricViewModel.mClientCallback.onAuthenticationSucceeded((BiometricPrompt.AuthenticationResult) this.val$runInfo);
                        return;
                    case 3:
                        try {
                            ChainingListenableFuture chainingListenableFuture = (ChainingListenableFuture) this.this$0;
                            Object uninterruptibly = Futures.getUninterruptibly((ListenableFuture) this.val$runInfo);
                            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = chainingListenableFuture.mCompleter;
                            if (callbackToFutureAdapter$Completer != null) {
                                callbackToFutureAdapter$Completer.set(uninterruptibly);
                            }
                        } catch (CancellationException unused) {
                            ((ChainingListenableFuture) this.this$0).cancel(false);
                        } catch (ExecutionException e3) {
                            ChainingListenableFuture chainingListenableFuture2 = (ChainingListenableFuture) this.this$0;
                            Throwable cause2 = e3.getCause();
                            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = chainingListenableFuture2.mCompleter;
                            if (callbackToFutureAdapter$Completer2 != null) {
                                callbackToFutureAdapter$Completer2.setException(cause2);
                            }
                        }
                        return;
                    case 4:
                        Recorder.AnonymousClass6 anonymousClass6 = (Recorder.AnonymousClass6) this.val$runInfo;
                        Typeface typeface = (Typeface) this.this$0;
                        ResourcesCompat.FontCallback fontCallback = (ResourcesCompat.FontCallback) anonymousClass6.this$0;
                        if (fontCallback != null) {
                            fontCallback.onFontRetrieved(typeface);
                            return;
                        }
                        return;
                    case 5:
                        ((Edge) this.val$runInfo).accept(this.this$0);
                        return;
                    case 6:
                        ((Lifecycle) this.val$runInfo).removeObserver((WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) this.this$0);
                        return;
                    case 7:
                        AsyncTaskLoader$LoadTask asyncTaskLoader$LoadTask = (AsyncTaskLoader$LoadTask) this.this$0;
                        Object obj = this.val$runInfo;
                        boolean z = asyncTaskLoader$LoadTask.mCancelled.get();
                        com.google.android.gms.auth.api.signin.internal.zbc zbcVar = asyncTaskLoader$LoadTask.this$0;
                        if (z) {
                            if (zbcVar.mCancellingTask == asyncTaskLoader$LoadTask) {
                                SystemClock.uptimeMillis();
                                zbcVar.mCancellingTask = null;
                                zbcVar.executePendingTask();
                            }
                        } else if (zbcVar.mTask != asyncTaskLoader$LoadTask) {
                            if (zbcVar.mCancellingTask == asyncTaskLoader$LoadTask) {
                                SystemClock.uptimeMillis();
                                zbcVar.mCancellingTask = null;
                                zbcVar.executePendingTask();
                            }
                        } else if (!zbcVar.mAbandoned) {
                            SystemClock.uptimeMillis();
                            zbcVar.mTask = null;
                            LoaderManagerImpl.LoaderInfo loaderInfo = zbcVar.mListener;
                            if (loaderInfo != null) {
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    loaderInfo.setValue(obj);
                                } else {
                                    loaderInfo.postValue(obj);
                                }
                            }
                        }
                        asyncTaskLoader$LoadTask.mStatus = 3;
                        return;
                    case 8:
                        FragmentTransitionImpl.AnonymousClass1 anonymousClass1 = (FragmentTransitionImpl.AnonymousClass1) this.this$0;
                        AsyncListDiffer asyncListDiffer = (AsyncListDiffer) anonymousClass1.val$outNames;
                        if (asyncListDiffer.mMaxScheduledGeneration == anonymousClass1.val$numSharedElements) {
                            List list = (List) anonymousClass1.val$inNames;
                            Recorder.SetupVideoTask setupVideoTask = (Recorder.SetupVideoTask) this.val$runInfo;
                            Runnable runnable = (Runnable) anonymousClass1.val$sharedElementsOut;
                            asyncListDiffer.mList = list;
                            asyncListDiffer.mReadOnlyList = Collections.unmodifiableList(list);
                            setupVideoTask.dispatchUpdatesTo(asyncListDiffer.mUpdateCallback);
                            asyncListDiffer.onCurrentListChanged(runnable);
                            return;
                        }
                        return;
                    case 9:
                        Processor processor = ((SystemForegroundDispatcher) this.this$0).mWorkManagerImpl.mProcessor;
                        String str3 = (String) this.val$runInfo;
                        synchronized (processor.mLock) {
                            try {
                                WorkerWrapper workerWrapperUnsafe = processor.getWorkerWrapperUnsafe(str3);
                                if (workerWrapperUnsafe != null) {
                                }
                            } finally {
                            }
                        }
                        if (workSpec == 0 || Intrinsics.areEqual(Constraints.NONE, workSpec.constraints)) {
                            return;
                        }
                        synchronized (((SystemForegroundDispatcher) this.this$0).mLock) {
                            ((SystemForegroundDispatcher) this.this$0).mWorkSpecById.put(Room.generationalId(workSpec), workSpec);
                            SystemForegroundDispatcher systemForegroundDispatcher = (SystemForegroundDispatcher) this.this$0;
                            ((SystemForegroundDispatcher) this.this$0).mTrackedWorkSpecs.put(Room.generationalId(workSpec), WorkConstraintsTrackerKt.listen(systemForegroundDispatcher.mConstraintsTracker, workSpec, ((WorkManagerTaskExecutor) systemForegroundDispatcher.mTaskExecutor).mTaskDispatcher, systemForegroundDispatcher));
                        }
                        return;
                    case 10:
                        try {
                            ((CacheDispatcher) this.this$0).mNetworkQueue.put((com.android.volley.Request) this.val$runInfo);
                            return;
                        } catch (InterruptedException unused2) {
                            java.lang.Thread.currentThread().interrupt();
                            return;
                        }
                    case 11:
                        EventPayload eventPayload = (EventPayload) this.val$runInfo;
                        InternalReportDelegate internalReportDelegate = (InternalReportDelegate) this.this$0;
                        Logger logger = internalReportDelegate.logger;
                        try {
                            logger.d("InternalReportDelegate - sending internal event");
                            ImmutableConfig immutableConfig = internalReportDelegate.config;
                            DeliveryParams deliveryParams = immutableConfig.delivery;
                            DeliveryParams errorApiDeliveryParams = immutableConfig.getErrorApiDeliveryParams(eventPayload);
                            if (deliveryParams != null) {
                                Map map = (Map) errorApiDeliveryParams.headers;
                                map.put("Bugsnag-Internal-Error", "bugsnag-android");
                                map.remove("Bugsnag-Api-Key");
                                deliveryParams.deliver((String) errorApiDeliveryParams.endpoint, eventPayload.toByteArray(), Bugsnag.getIntegrityToken(eventPayload), map);
                                return;
                            }
                            return;
                        } catch (Exception e4) {
                            logger.w("Failed to report internal event to Bugsnag", e4);
                            return;
                        }
                    case 12:
                        GlideExecutor.DefaultThreadFactory defaultThreadFactory = (GlideExecutor.DefaultThreadFactory) this.this$0;
                        if (defaultThreadFactory.preventNetworkOperations) {
                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                        }
                        try {
                            ((Runnable) this.val$runInfo).run();
                            return;
                        } catch (Throwable th) {
                            defaultThreadFactory.uncaughtThrowableStrategy.getClass();
                            if (Log.isLoggable("GlideExecutor", 6)) {
                                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                                return;
                            }
                            return;
                        }
                    case 13:
                        FillrWidget fillrWidget = (FillrWidget) this.this$0;
                        Fillr.getInstance().getClass();
                        Activity activity = (Activity) this.val$runInfo;
                        PopEncryptorV2_ popEncryptorV2_ = fillrWidget.fillrWidgetParams;
                        try {
                            file = new File(new File(activity.getFilesDir(), "widgets"), (String) popEncryptorV2_.encryptionKey);
                        } catch (Exception unused3) {
                            SVG svg = Fillr.getInstance().fillrConfig;
                        }
                        if (file.exists()) {
                            str = FileUtils.readFileToString(file);
                            ((FillrWidget.WidgetType) popEncryptorV2_.cryptor).toString();
                            SVG svg2 = Fillr.getInstance().fillrConfig;
                            if (str == null && str.contains(((FillrWidget.WidgetType) popEncryptorV2_.cryptor).validator)) {
                                "Successfully read remotely updated local widget ".concat(str);
                                SVG svg3 = Fillr.getInstance().fillrConfig;
                            } else {
                                sb = new StringBuilder();
                                InputStream inputStream2 = activity.getAssets().open((String) popEncryptorV2_.encryptionKey);
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                                while (true) {
                                    try {
                                        readLine = bufferedReader.readLine();
                                    } catch (Exception unused4) {
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                            break;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        inputStream = inputStream2;
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (IOException unused5) {
                                                SVG svg4 = Fillr.getInstance().fillrConfig;
                                                throw th;
                                            }
                                        }
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                        throw th;
                                    }
                                    if (readLine == null) {
                                        sb.append(readLine);
                                    } else {
                                        bufferedReader.close();
                                        str2 = sb.toString();
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        bufferedReader.close();
                                        str = str2;
                                    }
                                }
                            }
                            fillrWidget.mWidgetJavaScript = str;
                            FillrWidget.m1937$$Nest$mnotifyDownloadListeners(fillrWidget);
                            return;
                        }
                        str = null;
                        ((FillrWidget.WidgetType) popEncryptorV2_.cryptor).toString();
                        SVG svg22 = Fillr.getInstance().fillrConfig;
                        if (str == null) {
                        }
                        sb = new StringBuilder();
                        InputStream inputStream22 = activity.getAssets().open((String) popEncryptorV2_.encryptionKey);
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStream22, "UTF-8"));
                        while (true) {
                            readLine = bufferedReader.readLine();
                            if (readLine == null) {
                            }
                            sb.append(readLine);
                        }
                        break;
                    case 14:
                        ((InputMethodManager) ((Context) this.val$runInfo).getSystemService("input_method")).showSoftInput((EditText) this.this$0, 0);
                        return;
                    case 15:
                        View view = (View) this.val$runInfo;
                        view.setFocusableInTouchMode(true);
                        view.requestFocusFromTouch();
                        ((InputMethodManager) this.this$0).showSoftInput(view, 0);
                        return;
                    case 16:
                        ProfileDetailedViewFragment profileDetailedViewFragment = (ProfileDetailedViewFragment) this.this$0;
                        Intent intent = (Intent) this.val$runInfo;
                        if (intent == null || !intent.hasExtra("element.key") || (stringExtra = intent.getStringExtra("element.key")) == null) {
                            return;
                        }
                        String data = profileDetailedViewFragment.profile.getData(stringExtra);
                        ProfileAdapter profileAdapter = profileDetailedViewFragment.viewCreator;
                        if (data != null && (appCompatEditText = profileAdapter.currentEditingTextView) != null && (helperElement2 = profileAdapter.currentElement) != null) {
                            profileAdapter.setInputFieldProperties(helperElement2.element, appCompatEditText, data);
                        }
                        if (!profileAdapter.shouldMoveNext || (helperElement = profileAdapter.currentElement) == null) {
                            return;
                        }
                        if (helperElement.isGroupField && helperElement.groupPos + 1 < profileAdapter.groupElements.size()) {
                            profileAdapter.processNextFieldView((View) profileAdapter.allTitleViews.get(profileAdapter.currentElement.groupPos + 1));
                            return;
                        }
                        HelperElement helperElement3 = profileAdapter.currentElement;
                        if (!helperElement3.isGroupField) {
                            if (helperElement3.childPos + 1 < ((Element) profileAdapter.groupElements.get(helperElement3.groupPos)).getChildrenCount()) {
                                HelperElement helperElement4 = profileAdapter.currentElement;
                                profileAdapter.processNextFieldView((View) ((HashMap) profileAdapter.allChildViews.get(Integer.valueOf(helperElement4.groupPos))).get(Integer.valueOf(helperElement4.childPos + 1)));
                                return;
                            }
                        }
                        profileAdapter.currentElement = null;
                        return;
                    case 17:
                        zzp zzpVar = (zzp) this.val$runInfo;
                        IBinder iBinder = (IBinder) this.this$0;
                        synchronized (zzpVar) {
                            if (iBinder == null) {
                                zzpVar.zza("Null service connection");
                            } else {
                                try {
                                    zzpVar.zzc = new Box(iBinder);
                                    zzpVar.zza = 2;
                                    ((ScheduledExecutorService) zzpVar.zzf.zzc).execute(new zzj(zzpVar, 0));
                                } catch (RemoteException e5) {
                                    zzpVar.zza(e5.getMessage());
                                }
                            }
                        }
                        return;
                    case 18:
                        zzp zzpVar2 = (zzp) this.val$runInfo;
                        int i2 = ((zzr) this.this$0).zza;
                        synchronized (zzpVar2) {
                            zzr zzrVar = (zzr) zzpVar2.zze.get(i2);
                            if (zzrVar != null) {
                                Log.w("MessengerIpcClient", "Timing out request: " + i2);
                                zzpVar2.zze.remove(i2);
                                zzrVar.zzc(new zzt("Timed out waiting for response", null));
                                zzpVar2.zzf();
                            }
                        }
                        return;
                    case 19:
                        run$com$google$android$gms$internal$mlkit_vision_barcode$zzei();
                        return;
                    case 20:
                        zzwp zzwpVar = (zzwp) this.val$runInfo;
                        zzrc zzrcVar = zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
                        JCAContext jCAContext = (JCAContext) this.this$0;
                        HashMap hashMap = zzwpVar.zzl;
                        zzbw zzbwVar = (zzbw) hashMap.get(zzrcVar);
                        if (zzbwVar != null) {
                            Iterator it = ((zzbl) zzbwVar.zzw()).iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                Collection collection = (Collection) zzbwVar.zza.get(next);
                                Collection collection2 = collection;
                                if (collection == null) {
                                    collection2 = new ArrayList(3);
                                }
                                List list2 = (List) collection2;
                                ArrayList arrayList = new ArrayList(list2 instanceof RandomAccess ? new zzbm(zzbwVar, next, list2, null) : new zzao(zzbwVar, next, list2, (zzao) null));
                                Collections.sort(arrayList);
                                zzjt zzjtVar = new zzjt();
                                Iterator it2 = arrayList.iterator();
                                long j = 0;
                                while (it2.hasNext()) {
                                    j += ((Long) it2.next()).longValue();
                                }
                                zzjtVar.zzc = Long.valueOf((j / arrayList.size()) & Long.MAX_VALUE);
                                zzjtVar.zza = Long.valueOf(zzwp.zza(arrayList, 100.0d) & Long.MAX_VALUE);
                                zzjtVar.zzf = Long.valueOf(zzwp.zza(arrayList, 75.0d) & Long.MAX_VALUE);
                                zzjtVar.zze = Long.valueOf(zzwp.zza(arrayList, 50.0d) & Long.MAX_VALUE);
                                zzjtVar.zzd = Long.valueOf(zzwp.zza(arrayList, 25.0d) & Long.MAX_VALUE);
                                zzjtVar.zzb = Long.valueOf(zzwp.zza(arrayList, 0.0d) & Long.MAX_VALUE);
                                zzqd zzqdVar = new zzqd(zzjtVar);
                                int size = arrayList.size();
                                com.google.mlkit.vision.barcode.internal.zzl zzlVar = (com.google.mlkit.vision.barcode.internal.zzl) jCAContext.provider;
                                zzft zzftVar = (zzft) next;
                                SubtreeManager subtreeManager = new SubtreeManager();
                                subtreeManager.emitActionToParent = zzlVar.zzh ? zzra.TYPE_THICK : zzra.TYPE_THIN;
                                zzfi zzfiVar = new zzfi(2);
                                zzfiVar.zzd = Integer.valueOf(size & Integer.MAX_VALUE);
                                zzfiVar.zzc = zzftVar;
                                zzfiVar.zze = zzqdVar;
                                subtreeManager.idCounter = new zzfv(zzfiVar);
                                zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) zzwpVar, (Object) new HuffmanTreeGroup(subtreeManager, 0), (Enum) zzrcVar, zzwpVar.zzj(), 6));
                            }
                            hashMap.remove(zzrcVar);
                            return;
                        }
                        return;
                    case 21:
                        zzoc zzocVar = (zzoc) this.val$runInfo;
                        zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_FACE_DETECTION;
                        JCAContext jCAContext2 = (JCAContext) this.this$0;
                        HashMap hashMap2 = zzocVar.zzl;
                        zzas zzasVar = (zzas) hashMap2.get(zzktVar);
                        if (zzasVar != null) {
                            zzbd zzbdVar = zzasVar.zza;
                            zzaj zzajVar = ((zzar) zzasVar).zza;
                            if (zzajVar == null) {
                                zzajVar = new zzaj(zzasVar, zzbdVar);
                                ((zzar) zzasVar).zza = zzajVar;
                            }
                            Iterator it3 = zzajVar.iterator();
                            while (it3.hasNext()) {
                                Object next2 = it3.next();
                                Collection collection3 = (Collection) zzbdVar.get(next2);
                                Collection collection4 = collection3;
                                if (collection3 == null) {
                                    collection4 = new ArrayList(3);
                                }
                                List list3 = (List) collection4;
                                ArrayList arrayList2 = new ArrayList(list3 instanceof RandomAccess ? new zzak(zzasVar, next2, list3, null) : new zzao(zzasVar, next2, list3, (zzao) null));
                                Collections.sort(arrayList2);
                                zzjt zzjtVar2 = new zzjt();
                                Iterator it4 = arrayList2.iterator();
                                long j2 = 0;
                                while (it4.hasNext()) {
                                    j2 = ((Long) it4.next()).longValue() + j2;
                                }
                                zzjtVar2.zzc = Long.valueOf((j2 / arrayList2.size()) & Long.MAX_VALUE);
                                zzjtVar2.zza = Long.valueOf(zzoc.zza(arrayList2, 100.0d) & Long.MAX_VALUE);
                                zzjtVar2.zzf = Long.valueOf(zzoc.zza(arrayList2, 75.0d) & Long.MAX_VALUE);
                                zzjtVar2.zze = Long.valueOf(zzoc.zza(arrayList2, 50.0d) & Long.MAX_VALUE);
                                zzjtVar2.zzd = Long.valueOf(zzoc.zza(arrayList2, 25.0d) & Long.MAX_VALUE);
                                zzjtVar2.zzb = Long.valueOf(zzoc.zza(arrayList2, 0.0d) & Long.MAX_VALUE);
                                zzjv zzjvVar = new zzjv(zzjtVar2);
                                int size2 = arrayList2.size();
                                com.google.mlkit.vision.face.internal.zzh zzhVar = (com.google.mlkit.vision.face.internal.zzh) jCAContext2.provider;
                                zzdn zzdnVar = (zzdn) next2;
                                e0 e0Var = new e0(19);
                                e0Var.c = zzhVar.zzg ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
                                zzah zzahVar = new zzah(9, false);
                                zzahVar.zzb = Integer.valueOf(size2 & Integer.MAX_VALUE);
                                zzahVar.f68zza = zzdnVar;
                                zzahVar.zzc = zzjvVar;
                                e0Var.h = new zzdp(zzahVar);
                                zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) zzocVar, (Object) new HuffmanTreeGroup(e0Var, 0), (Enum) zzktVar, zzocVar.zzj(), 7));
                            }
                            hashMap2.remove(zzktVar);
                            return;
                        }
                        return;
                    case 22:
                        zzuc zzucVar = (zzuc) this.val$runInfo;
                        zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
                        com.google.mlkit.vision.text.internal.zzr zzrVar2 = (com.google.mlkit.vision.text.internal.zzr) this.this$0;
                        HashMap hashMap3 = zzucVar.zzl;
                        com.google.android.gms.internal.mlkit_vision_text_common.zzao zzaoVar = (com.google.android.gms.internal.mlkit_vision_text_common.zzao) hashMap3.get(zzovVar);
                        if (zzaoVar != null) {
                            com.google.android.gms.internal.mlkit_vision_text_common.zzba zzbaVar = zzaoVar.zza;
                            zzab zzabVar = ((zzan) zzaoVar).zza;
                            if (zzabVar == null) {
                                zzabVar = new zzab(zzaoVar, zzbaVar);
                                ((zzan) zzaoVar).zza = zzabVar;
                            }
                            Iterator it5 = zzabVar.iterator();
                            while (it5.hasNext()) {
                                Object next3 = it5.next();
                                Collection collection5 = (Collection) zzbaVar.get(next3);
                                Collection collection6 = collection5;
                                if (collection5 == null) {
                                    collection6 = new ArrayList(i);
                                }
                                List list4 = (List) collection6;
                                ArrayList arrayList3 = new ArrayList(list4 instanceof RandomAccess ? new zzag(zzaoVar, next3, list4, null) : new zzao(zzaoVar, next3, list4, (zzao) null));
                                Collections.sort(arrayList3);
                                zzjt zzjtVar3 = new zzjt();
                                Iterator it6 = arrayList3.iterator();
                                long j3 = 0;
                                while (it6.hasNext()) {
                                    j3 = ((Long) it6.next()).longValue() + j3;
                                }
                                zzjtVar3.zzc = Long.valueOf((j3 / arrayList3.size()) & Long.MAX_VALUE);
                                zzjtVar3.zza = Long.valueOf(zzuc.zza(arrayList3, 100.0d) & Long.MAX_VALUE);
                                zzjtVar3.zzf = Long.valueOf(zzuc.zza(arrayList3, 75.0d) & Long.MAX_VALUE);
                                zzjtVar3.zze = Long.valueOf(zzuc.zza(arrayList3, 50.0d) & Long.MAX_VALUE);
                                zzjtVar3.zzd = Long.valueOf(zzuc.zza(arrayList3, 25.0d) & Long.MAX_VALUE);
                                zzjtVar3.zzb = Long.valueOf(zzuc.zza(arrayList3, 0.0d) & Long.MAX_VALUE);
                                zznw zznwVar = new zznw(zzjtVar3);
                                int size3 = arrayList3.size();
                                TextRecognizerTaskWithResource textRecognizerTaskWithResource = (TextRecognizerTaskWithResource) zzrVar2.zza;
                                zzes zzesVar = (zzes) next3;
                                e0 e0Var2 = new e0(20);
                                e0Var2.c = textRecognizerTaskWithResource.zzf.getIsThickClient() ? zzot.TYPE_THICK : zzot.TYPE_THIN;
                                zzdb zzdbVar = new zzdb();
                                zzdbVar.zzd = Integer.valueOf(size3 & Integer.MAX_VALUE);
                                zzdbVar.zzc = zzesVar;
                                zzdbVar.zze = zznwVar;
                                e0Var2.h = new zzeu(zzdbVar);
                                zzuc zzucVar2 = zzucVar;
                                zzov zzovVar2 = zzovVar;
                                zzh.zza.execute(new ProfileAdapter.AnonymousClass8((Object) zzucVar2, (Object) new HuffmanTreeGroup(e0Var2, 0, (byte) 0), (Enum) zzovVar2, zzucVar.zzj(), 8));
                                zzovVar = zzovVar2;
                                zzucVar = zzucVar2;
                                i = 3;
                            }
                            hashMap3.remove(zzovVar);
                            return;
                        }
                        return;
                    case 23:
                        zzhj zzhjVar = (zzhj) this.this$0;
                        zzic zzicVar = zzhjVar.zza.zza;
                        zzhz zzhzVar = zzicVar.zzj;
                        zzic.zzP(zzhzVar);
                        zzhzVar.zzg();
                        Bundle bundle = new Bundle();
                        bundle.putString("package_name", zzhjVar.zzb);
                        try {
                            zzbq zzbqVar = (zzbq) ((zzbs) this.val$runInfo);
                            Parcel zza = zzbqVar.zza();
                            zzbn.zzc(zza, bundle);
                            Parcel zzP = zzbqVar.zzP(zza, 1);
                            Bundle bundle2 = (Bundle) zzbn.zzb(zzP, Bundle.CREATOR);
                            zzP.recycle();
                            if (bundle2 == null) {
                                zzgu zzguVar = zzicVar.zzi;
                                zzic.zzP(zzguVar);
                                zzguVar.zzd.zza("Install Referrer Service returned a null response");
                            }
                        } catch (Exception e6) {
                            zzgu zzguVar2 = zzicVar.zzi;
                            zzic.zzP(zzguVar2);
                            zzguVar2.zzd.zzb(e6.getMessage(), "Exception occurred while retrieving the Install Referrer");
                        }
                        zzhz zzhzVar2 = zzicVar.zzj;
                        zzic.zzP(zzhzVar2);
                        zzhzVar2.zzg();
                        throw new IllegalStateException("Unexpected call on client side");
                    case 24:
                        zzjd zzjdVar = (zzjd) this.this$0;
                        zzjdVar.zza.zzaa$1();
                        com.google.android.gms.measurement.internal.zzah zzahVar2 = (com.google.android.gms.measurement.internal.zzah) this.val$runInfo;
                        Object zza2 = zzahVar2.zzc.zza();
                        zzpg zzpgVar = zzjdVar.zza;
                        if (zza2 == null) {
                            zzpgVar.getClass();
                            String str4 = zzahVar2.zza;
                            zzae.checkNotNull(str4);
                            com.google.android.gms.measurement.internal.zzr zzaP = zzpgVar.zzaP(str4);
                            if (zzaP != null) {
                                zzpgVar.zzan(zzahVar2, zzaP);
                                return;
                            }
                            return;
                        }
                        zzpgVar.getClass();
                        String str5 = zzahVar2.zza;
                        zzae.checkNotNull(str5);
                        com.google.android.gms.measurement.internal.zzr zzaP2 = zzpgVar.zzaP(str5);
                        if (zzaP2 != null) {
                            zzpgVar.zzal(zzahVar2, zzaP2);
                            return;
                        }
                        return;
                    case 25:
                        zzcs zzcsVar = (zzcs) this.val$runInfo;
                        zzlj zzljVar = (zzlj) this.this$0;
                        com.google.android.gms.measurement.internal.zzoc zzocVar2 = ((zzic) zzljVar.$$delegate_0).zzk;
                        zzic.zzO(zzocVar2);
                        zzic zzicVar2 = (zzic) zzocVar2.$$delegate_0;
                        zzhh zzhhVar = zzicVar2.zzh;
                        zzhh zzhhVar2 = zzicVar2.zzh;
                        zzic.zzN(zzhhVar);
                        if (zzhhVar.zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                            zzic.zzN(zzhhVar2);
                            zzicVar2.zzn.getClass();
                            if (!zzhhVar2.zzo(System.currentTimeMillis())) {
                                zzic.zzN(zzhhVar2);
                                if (zzhhVar2.zzl.zza() != 0) {
                                    zzic.zzN(zzhhVar2);
                                    valueOf = Long.valueOf(zzhhVar2.zzl.zza());
                                    if (valueOf == null) {
                                        zzpp zzppVar = ((zzic) zzljVar.$$delegate_0).zzl;
                                        zzic.zzN(zzppVar);
                                        zzppVar.zzap(zzcsVar, valueOf.longValue());
                                        return;
                                    } else {
                                        try {
                                            zzcsVar.zzb(null);
                                            return;
                                        } catch (RemoteException e7) {
                                            zzgu zzguVar3 = ((zzic) zzljVar.$$delegate_0).zzi;
                                            zzic.zzP(zzguVar3);
                                            zzguVar3.zzd.zzb(e7, "getSessionId failed with exception");
                                            return;
                                        }
                                    }
                                }
                            }
                        } else {
                            zzgu zzguVar4 = zzicVar2.zzi;
                            zzic.zzP(zzguVar4);
                            zzguVar4.zzi.zza("Analytics storage consent denied; will not get session id");
                        }
                        valueOf = null;
                        if (valueOf == null) {
                        }
                    case 26:
                        ((zzlj) this.this$0).zzaq((Boolean) this.val$runInfo, true);
                        return;
                    case 27:
                        zzlj zzljVar2 = (zzlj) this.this$0;
                        zzic zzicVar3 = (zzic) zzljVar2.$$delegate_0;
                        zzhh zzhhVar3 = zzicVar3.zzh;
                        zzgu zzguVar5 = zzicVar3.zzi;
                        zzic.zzN(zzhhVar3);
                        zzhhVar3.zzg();
                        zzhhVar3.zzg();
                        com.google.android.gms.measurement.internal.zzba zzg = com.google.android.gms.measurement.internal.zzba.zzg(zzhhVar3.zzd().getString("dma_consent_settings", null));
                        com.google.android.gms.measurement.internal.zzba zzbaVar2 = (com.google.android.gms.measurement.internal.zzba) this.val$runInfo;
                        int i3 = zzbaVar2.zzb;
                        if (!zzjl.zzu(i3, zzg.zzb)) {
                            zzic.zzP(zzguVar5);
                            zzguVar5.zzj.zzb(Integer.valueOf(i3), "Lower precedence consent source ignored, proposed source");
                            return;
                        }
                        SharedPreferences.Editor edit = zzhhVar3.zzd().edit();
                        edit.putString("dma_consent_settings", zzbaVar2.zzc);
                        edit.apply();
                        zzic.zzP(zzguVar5);
                        zzguVar5.zzl.zzb(zzbaVar2, "Setting DMA consent(FE)");
                        zzic zzicVar4 = (zzic) zzljVar2.$$delegate_0;
                        if (zzicVar4.zzt().zzP()) {
                            zznl zzt = zzicVar4.zzt();
                            zzt.zzg();
                            zzt.zzb$1();
                            zzt.zzaf(new zznd(zzt, r14));
                            return;
                        }
                        zznl zzt2 = zzicVar4.zzt();
                        zzt2.zzg();
                        zzt2.zzb$1();
                        if (zzt2.zzO()) {
                            zzt2.zzaf(new zzmh(zzt2, zzt2.zzah(false)));
                            return;
                        }
                        return;
                    case 28:
                        run$com$google$android$gms$measurement$internal$zzl();
                        return;
                    default:
                        zzic zzicVar5 = (zzic) ((zzlj) this.val$runInfo).$$delegate_0;
                        zzgi zzv = zzicVar5.zzv();
                        String str6 = (String) this.this$0;
                        String str7 = zzv.zzp;
                        r14 = (str7 == null || str7.equals(str6)) ? 0 : 1;
                        zzv.zzp = str6;
                        if (r14 != 0) {
                            zzicVar5.zzv().zzi$1();
                            return;
                        }
                        return;
                }
            } finally {
                ((ChainingListenableFuture) this.this$0).mOutputFuture = null;
            }
            ((ChainingListenableFuture) this.this$0).mOutputFuture = null;
        }

        public String toString() {
            int i = this.$r8$classId;
            Object obj = this.this$0;
            switch (i) {
                case 1:
                    return AnonymousClass4.class.getSimpleName() + "," + ((FutureCallback) obj);
                case 19:
                    zzfi zzfiVar = new zzfi("zzei");
                    Box box = new Box(16);
                    ((Box) zzfiVar.zze).mHalfExtent = box;
                    zzfiVar.zze = box;
                    box.mCenter = (LocationModule) obj;
                    return zzfiVar.toString();
                default:
                    return super.toString();
            }
        }

        public /* synthetic */ AnonymousClass4(zzwp zzwpVar, JCAContext jCAContext) {
            this.$r8$classId = 20;
            zzrc zzrcVar = zzrc.UNKNOWN_EVENT;
            this.val$runInfo = zzwpVar;
            this.this$0 = jCAContext;
        }

        public /* synthetic */ AnonymousClass4(zzuc zzucVar, com.google.mlkit.vision.text.internal.zzr zzrVar) {
            this.$r8$classId = 22;
            zzov zzovVar = zzov.UNKNOWN_EVENT;
            this.val$runInfo = zzucVar;
            this.this$0 = zzrVar;
        }

        public /* synthetic */ AnonymousClass4(Object obj, Object obj2, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
            this.val$runInfo = obj2;
        }

        public AnonymousClass4(zzhj zzhjVar, zzbs zzbsVar, zzhj zzhjVar2) {
            this.$r8$classId = 23;
            this.val$runInfo = zzbsVar;
            this.this$0 = zzhjVar;
        }

        public /* synthetic */ AnonymousClass4(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$runInfo = obj;
            this.this$0 = obj2;
        }
    }
}
