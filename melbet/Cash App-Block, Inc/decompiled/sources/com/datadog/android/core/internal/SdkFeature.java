package com.datadog.android.core.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.glance.appwidget.ApplyModifiersKt$applyModifiers$1;
import androidx.media3.extractor.text.CueEncoder;
import androidx.room.CoroutinesRoom;
import androidx.room.util.DBUtil;
import app.cash.trifle.KeyHandle$keyPair$2;
import com.bumptech.glide.GlideBuilder$1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.feature.Feature;
import com.datadog.android.api.feature.FeatureEventReceiver;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.datastore.DataStoreHandler;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.feature.event.JvmCrash$Rum;
import com.datadog.android.core.internal.data.upload.DataUploader;
import com.datadog.android.core.internal.data.upload.UploadScheduler;
import com.datadog.android.core.internal.lifecycle.ProcessLifecycleMonitor;
import com.datadog.android.core.internal.metrics.MetricsDispatcher;
import com.datadog.android.core.internal.persistence.Storage;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.DatadogLateCrashReporter;
import com.datadog.android.rum.internal.LateCrashReporter;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.RumFeature$onInitialize$1;
import com.datadog.android.rum.internal.RumFeature$onReceive$1;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.monitor.DatadogRumMonitor;
import com.datadog.android.rum.model.ViewEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sqip.internal.CardEntryActivityController$$ExternalSyntheticLambda1;

/* loaded from: classes4.dex */
public final class SdkFeature {
    public final ContextProvider contextProvider;
    public final CoreFeature coreFeature;
    public DataStoreHandler dataStore;
    public final AtomicReference eventReceiver;
    public final LinkedHashMap featureContext;
    public final ReentrantReadWriteLock featureContextLock;
    public final AtomicBoolean initialized;
    public final InternalLogger internalLogger;
    public MetricsDispatcher metricsDispatcher;
    public ProcessLifecycleMonitor processLifecycleMonitor;
    public Storage storage;
    public UploadScheduler uploadScheduler;
    public DataUploader uploader;
    public final Feature wrappedFeature;

    public SdkFeature(CoreFeature coreFeature, ContextProvider contextProvider, Feature feature, InternalLogger internalLogger) {
        contextProvider.getClass();
        internalLogger.getClass();
        this.coreFeature = coreFeature;
        this.contextProvider = contextProvider;
        this.wrappedFeature = feature;
        this.internalLogger = internalLogger;
        int i = 24;
        this.dataStore = new CoroutinesRoom.Companion(i);
        this.initialized = new AtomicBoolean(false);
        this.eventReceiver = new AtomicReference(null);
        this.storage = new CueEncoder(i);
        int i2 = 23;
        this.uploader = new CueEncoder(i2);
        this.uploadScheduler = new CoroutinesRoom.Companion(i2);
        this.metricsDispatcher = new GlideBuilder$1();
        this.featureContextLock = new ReentrantReadWriteLock();
        this.featureContext = new LinkedHashMap();
    }

    public final void sendEvent(Object obj) {
        BlockingQueue<Runnable> queue;
        FeatureEventReceiver featureEventReceiver = (FeatureEventReceiver) this.eventReceiver.get();
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (featureEventReceiver == null) {
            DBUtil.log$default(this.internalLogger, 3, target, new SdkFeature$sendEvent$1(this, 0), null, false, 56);
            return;
        }
        RumFeature rumFeature = (RumFeature) featureEventReceiver;
        InternalSdkCore internalSdkCore = rumFeature.sdkCore;
        r7 = null;
        ViewEvent viewEvent = null;
        if (!(obj instanceof Map)) {
            if (obj instanceof JvmCrash$Rum) {
                JvmCrash$Rum jvmCrash$Rum = (JvmCrash$Rum) obj;
                RumMonitor rumMonitor = GlobalRumMonitor.get(internalSdkCore);
                AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
                if (advancedRumMonitor != null) {
                    advancedRumMonitor.addCrash(jvmCrash$Rum.message, jvmCrash$Rum.throwable, jvmCrash$Rum.threads);
                    return;
                }
                return;
            }
            if (!(obj instanceof InternalTelemetryEvent)) {
                DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, target, new RumFeature$onReceive$1(obj, 0), null, false, 56);
                return;
            }
            InternalTelemetryEvent internalTelemetryEvent = (InternalTelemetryEvent) obj;
            RumMonitor rumMonitor2 = GlobalRumMonitor.get(internalSdkCore);
            AdvancedRumMonitor advancedRumMonitor2 = rumMonitor2 instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor2 : null;
            if (advancedRumMonitor2 == null) {
                return;
            }
            advancedRumMonitor2.sendTelemetryEvent(internalTelemetryEvent);
            return;
        }
        Map map = (Map) obj;
        Object obj2 = map.get("type");
        if (Intrinsics.areEqual(obj2, "ndk_crash")) {
            LateCrashReporter lateCrashReporter = (LateCrashReporter) rumFeature.lateCrashEventHandler$delegate.getValue();
            DataWriter dataWriter = rumFeature.dataWriter;
            DatadogLateCrashReporter datadogLateCrashReporter = (DatadogLateCrashReporter) lateCrashReporter;
            datadogLateCrashReporter.getClass();
            dataWriter.getClass();
            InternalSdkCore internalSdkCore2 = datadogLateCrashReporter.sdkCore;
            SdkFeature feature = internalSdkCore2.getFeature("rum");
            if (feature == null) {
                DBUtil.log$default(internalSdkCore2.getInternalLogger(), 3, target, RumFeature$onInitialize$1.INSTANCE$2, null, false, 56);
                return;
            }
            Object obj3 = map.get("sourceType");
            String str = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = map.get("timestamp");
            Long l = obj4 instanceof Long ? (Long) obj4 : null;
            Object obj5 = map.get("timeSinceAppStartMs");
            Long l2 = obj5 instanceof Long ? (Long) obj5 : null;
            Object obj6 = map.get("signalName");
            String str2 = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = map.get("stacktrace");
            String str3 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = map.get("message");
            String str4 = obj8 instanceof String ? (String) obj8 : null;
            Object obj9 = map.get("lastViewEvent");
            JsonObject jsonObject = obj9 instanceof JsonObject ? (JsonObject) obj9 : null;
            if (jsonObject != null) {
                Object deserialize = datadogLateCrashReporter.rumEventDeserializer.deserialize(jsonObject);
                if (deserialize instanceof ViewEvent) {
                    viewEvent = (ViewEvent) deserialize;
                }
            }
            ViewEvent viewEvent2 = viewEvent;
            if (l == null || str2 == null || str3 == null || str4 == null || viewEvent2 == null) {
                DBUtil.log$default(internalSdkCore2.getInternalLogger(), 4, target, RumFeature$onInitialize$1.INSTANCE$3, null, false, 56);
                return;
            } else {
                feature.withWriteContext(EmptySet.INSTANCE, new ApplyModifiersKt$applyModifiers$1(datadogLateCrashReporter, str, str4, l, l2, str3, str2, viewEvent2, dataWriter));
                return;
            }
        }
        boolean areEqual = Intrinsics.areEqual(obj2, "logger_error");
        InternalLogger.Target target2 = InternalLogger.Target.TELEMETRY;
        if (areEqual) {
            Object obj10 = map.get("throwable");
            Throwable th = obj10 instanceof Throwable ? (Throwable) obj10 : null;
            Object obj11 = map.get("message");
            String str5 = obj11 instanceof String ? (String) obj11 : null;
            Object obj12 = map.get("attributes");
            Map map2 = obj12 instanceof Map ? (Map) obj12 : null;
            if (str5 == null) {
                DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, target2}), RumFeature$onInitialize$1.INSTANCE$6, null, 56);
                return;
            }
            RumMonitor rumMonitor3 = GlobalRumMonitor.get(internalSdkCore);
            AdvancedRumMonitor advancedRumMonitor3 = rumMonitor3 instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor3 : null;
            if (advancedRumMonitor3 != null) {
                if (map2 == null) {
                    map2 = EmptyMap.INSTANCE;
                    map2.getClass();
                }
                advancedRumMonitor3.addError(str5, 4, th, map2);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(obj2, "logger_error_with_stacktrace")) {
            Object obj13 = map.get("stacktrace");
            String str6 = obj13 instanceof String ? (String) obj13 : null;
            Object obj14 = map.get("message");
            String str7 = obj14 instanceof String ? (String) obj14 : null;
            Object obj15 = map.get("attributes");
            Map map3 = obj15 instanceof Map ? (Map) obj15 : null;
            if (str7 == null) {
                DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, target2}), RumFeature$onInitialize$1.INSTANCE$7, null, 56);
                return;
            }
            RumMonitor rumMonitor4 = GlobalRumMonitor.get(internalSdkCore);
            AdvancedRumMonitor advancedRumMonitor4 = rumMonitor4 instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor4 : null;
            if (advancedRumMonitor4 != null) {
                if (map3 == null) {
                    map3 = EmptyMap.INSTANCE;
                    map3.getClass();
                }
                advancedRumMonitor4.addErrorWithStacktrace(str7, str6, map3);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(obj2, "web_view_ingested_notification")) {
            RumMonitor rumMonitor5 = GlobalRumMonitor.get(internalSdkCore);
            AdvancedRumMonitor advancedRumMonitor5 = rumMonitor5 instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor5 : null;
            if (advancedRumMonitor5 != null) {
                advancedRumMonitor5.sendWebViewEvent();
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(obj2, "sr_skipped_frame")) {
            RumMonitor rumMonitor6 = GlobalRumMonitor.get(internalSdkCore);
            AdvancedRumMonitor advancedRumMonitor6 = rumMonitor6 instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor6 : null;
            if (advancedRumMonitor6 != null) {
                advancedRumMonitor6.addSessionReplaySkippedFrame();
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(obj2, "flush_and_stop_monitor")) {
            DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, target, new KeyHandle$keyPair$2(map, 23), null, false, 56);
            return;
        }
        RumMonitor rumMonitor7 = GlobalRumMonitor.get(internalSdkCore);
        DatadogRumMonitor datadogRumMonitor = rumMonitor7 instanceof DatadogRumMonitor ? (DatadogRumMonitor) rumMonitor7 : null;
        if (datadogRumMonitor != null) {
            datadogRumMonitor.handler.removeCallbacks(datadogRumMonitor.keepAliveRunnable);
            ArrayList arrayList = new ArrayList();
            ExecutorService executorService = datadogRumMonitor.executorService;
            ThreadPoolExecutor threadPoolExecutor = executorService instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorService : null;
            if (threadPoolExecutor != null && (queue = threadPoolExecutor.getQueue()) != null) {
                queue.drainTo(arrayList);
            }
            executorService.shutdown();
            executorService.awaitTermination(10L, TimeUnit.SECONDS);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public final void withWriteContext(Set set, Function2 function2) {
        set.getClass();
        zzho.executeSafe(this.coreFeature.getContextExecutorService$dd_sdk_android_core_release(), Recorder$$ExternalSyntheticOutline2.m("withWriteContext-", this.wrappedFeature.getName()), this.internalLogger, new CardEntryActivityController$$ExternalSyntheticLambda1(3, this, set, function2));
    }
}
