package com.datadog.android.rum.internal.monitor;

import android.os.Handler;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1;
import androidx.room.util.DBUtil;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.q4$$ExternalSyntheticLambda0;
import coil3.request.OneShotDisposable;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import com.appsflyer.internal.AFd1lSDK$$ExternalSyntheticLambda0;
import com.bugsnag.android.TraceParser$parse$1;
import com.bumptech.glide.GlideBuilder$1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.TimeInfo;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.SdkFeature$$ExternalSyntheticLambda0;
import com.datadog.android.core.internal.logger.SdkInternalLogger$WhenMappings;
import com.datadog.android.core.internal.metrics.MethodCalledTelemetry$stopAndSend$1;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent$ApiUsage$AddViewLoadingTime;
import com.datadog.android.internal.telemetry.TracingHeaderType;
import com.datadog.android.internal.telemetry.TracingHeaderTypesSet;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.RumSessionListener;
import com.datadog.android.rum._RumInternalProxy;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.domain.scope.RumApplicationScope;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.internal.startup.RumStartupScenario;
import com.datadog.android.rum.internal.startup.RumTTIDInfo;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.resource.ResourceId;
import com.datadog.android.rum.tracking.ActivityViewTrackingStrategy;
import com.datadog.android.telemetry.internal.TelemetryEventHandler;
import com.datadog.android.telemetry.internal.TelemetryEventHandler$canWrite$2;
import com.datadog.android.telemetry.internal.TelemetryEventId;
import com.datadog.android.telemetry.model.TelemetryConfigurationEvent;
import com.datadog.android.telemetry.model.TelemetryErrorEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent;
import com.datadog.android.telemetry.model.TelemetryUsageEvent$Usage$AddViewLoadingTime;
import com.datadog.android.trace.GlobalDatadogTracer;
import com.datadog.android.trace.internal.data.CoreTraceWriter$write$1;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzho;
import com.google.android.gms.internal.mlkit_vision_common.zzia;
import com.google.mlkit.vision.text.zza;
import com.google.mlkit.vision.text.zzc;
import com.google.mlkit.vision.text.zzd;
import com.squareup.wire.internal.GrpcDecoderKt;
import com.squareup.workflow1.Workflows__WorkflowActionKt$action$1;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/monitor/DatadogRumMonitor;", "Lcom/datadog/android/rum/RumMonitor;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DatadogRumMonitor implements RumMonitor, AdvancedRumMonitor {
    public final ExecutorService executorService;
    public final ConcurrentHashMap globalAttributes;
    public final Handler handler;
    public final _RumInternalProxy internalProxy;
    public final AFd1lSDK$$ExternalSyntheticLambda0 keepAliveRunnable;
    public final RumApplicationScope rootScope;
    public final InternalSdkCore sdkCore;
    public final SessionEndedMetricDispatcher sessionEndedMetricDispatcher;
    public final TelemetryEventHandler telemetryEventHandler;
    public final DataWriter writer;

    public DatadogRumMonitor(String str, InternalSdkCore internalSdkCore, float f, boolean z, boolean z2, DataWriter dataWriter, Handler handler, TelemetryEventHandler telemetryEventHandler, SessionEndedMetricDispatcher sessionEndedMetricDispatcher, OneShotDisposable oneShotDisposable, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, RumSessionListener rumSessionListener, ExecutorService executorService, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier, DefaultSlowFramesListener defaultSlowFramesListener, GlideBuilder$1 glideBuilder$1, InfoProvider infoProvider, InfoProvider infoProvider2, Rum$createMonitor$1 rum$createMonitor$1, HurlStack hurlStack) {
        str.getClass();
        dataWriter.getClass();
        oneShotDisposable.getClass();
        vitalMonitor.getClass();
        vitalMonitor2.getClass();
        vitalMonitor3.getClass();
        rumSessionListener.getClass();
        executorService.getClass();
        initialResourceIdentifier.getClass();
        glideBuilder$1.getClass();
        infoProvider.getClass();
        infoProvider2.getClass();
        hurlStack.getClass();
        this.sdkCore = internalSdkCore;
        this.writer = dataWriter;
        this.handler = handler;
        this.telemetryEventHandler = telemetryEventHandler;
        this.sessionEndedMetricDispatcher = sessionEndedMetricDispatcher;
        this.executorService = executorService;
        this.rootScope = new RumApplicationScope(str, internalSdkCore, f, z, z2, oneShotDisposable, vitalMonitor, vitalMonitor2, vitalMonitor3, sessionEndedMetricDispatcher, new OneShotDisposable(new RumSessionListener[]{rumSessionListener, telemetryEventHandler}, 12), initialResourceIdentifier, lastInteractionIdentifier, defaultSlowFramesListener, glideBuilder$1, infoProvider, infoProvider2, rum$createMonitor$1, hurlStack);
        AFd1lSDK$$ExternalSyntheticLambda0 aFd1lSDK$$ExternalSyntheticLambda0 = new AFd1lSDK$$ExternalSyntheticLambda0(this, 29);
        this.keepAliveRunnable = aFd1lSDK$$ExternalSyntheticLambda0;
        this.internalProxy = new _RumInternalProxy(this);
        handler.postDelayed(aFd1lSDK$$ExternalSyntheticLambda0, 300000L);
        this.globalAttributes = new ConcurrentHashMap();
        new AtomicBoolean(false);
    }

    public static final void access$handleEventWithMethodCallPerf(DatadogRumMonitor datadogRumMonitor, RumRawEvent rumRawEvent, DatadogContext datadogContext, Function1 function1) {
        FocusMeteringAction focusMeteringAction;
        InternalLogger internalLogger = datadogRumMonitor.sdkCore.getInternalLogger();
        String simpleName = Reflection.factory.getOrCreateKotlinClass(rumRawEvent.getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "Unknown";
        }
        String concat = "RUM event - ".concat(simpleName);
        AndroidPopup_androidKt$Popup$3$1 androidPopup_androidKt$Popup$3$1 = new AndroidPopup_androidKt$Popup$3$1(datadogRumMonitor, rumRawEvent, datadogContext, function1, 5);
        internalLogger.getClass();
        String name = DatadogRumMonitor.class.getName();
        zzlj zzljVar = (zzlj) internalLogger;
        boolean z = true;
        if (!new AndroidSvg(0.001f).sample(Unit.INSTANCE)) {
            focusMeteringAction = null;
        } else {
            if (SdkInternalLogger$WhenMappings.$EnumSwitchMapping$1[0] != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            InternalSdkCore internalSdkCore = (InternalSdkCore) zzljVar.zza;
            if (internalSdkCore != null) {
                internalSdkCore.getTimeProvider();
            }
            FocusMeteringAction focusMeteringAction2 = new FocusMeteringAction();
            focusMeteringAction2.mMeteringPointsAf = zzljVar;
            focusMeteringAction2.mMeteringPointsAe = concat;
            focusMeteringAction2.mMeteringPointsAwb = name;
            focusMeteringAction2.mAutoCancelDurationInMillis = System.nanoTime();
            focusMeteringAction = focusMeteringAction2;
        }
        Object invoke = androidPopup_androidKt$Popup$3$1.invoke();
        if ((invoke instanceof Collection) && ((Collection) invoke).isEmpty()) {
            z = false;
        }
        if (focusMeteringAction != null) {
            long nanoTime = System.nanoTime() - focusMeteringAction.mAutoCancelDurationInMillis;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("execution_time", Long.valueOf(nanoTime));
            linkedHashMap.put("operation_name", (String) focusMeteringAction.mMeteringPointsAe);
            linkedHashMap.put("caller_class", (String) focusMeteringAction.mMeteringPointsAwb);
            linkedHashMap.put("is_successful", Boolean.valueOf(z));
            linkedHashMap.put("metric_type", "method called");
            ((zzlj) focusMeteringAction.mMeteringPointsAf).logMetric(MethodCalledTelemetry$stopAndSend$1.INSTANCE, linkedHashMap, 100.0f, Float.valueOf(0.001f));
        }
    }

    public static Time getEventTime(Map map) {
        Object obj = map.get("_dd.timestamp");
        Long l = obj instanceof Long ? (Long) obj : null;
        if (l == null) {
            return new Time();
        }
        long longValue = l.longValue();
        return new Time(longValue, TimeUnit.MILLISECONDS.toNanos(longValue - System.currentTimeMillis()) + System.nanoTime());
    }

    @Override // com.datadog.android.rum.RumMonitor
    /* renamed from: _getInternal, reason: from getter */
    public final _RumInternalProxy getInternalProxy() {
        return this.internalProxy;
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAction(RumActionType rumActionType, String str, Map map) {
        str.getClass();
        map.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartAction(rumActionType, str, false, MapsKt__MapsKt.toMap(map), getEventTime(map)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addAttribute(Object obj, String str) {
        str.getClass();
        ConcurrentHashMap concurrentHashMap = this.globalAttributes;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addCrash(String str, Throwable th, ArrayList arrayList) {
        Time time = new Time();
        long appStartTimeNs = time.nanoTime - this.sdkCore.getAppStartTimeNs();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddError(str, 2, th, null, true, emptyMap, time, null, 0, arrayList, Long.valueOf(appStartTimeNs), MLKEMEngine.KyberPolyBytes));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addError(String str, int i, Throwable th, Map map) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        map.getClass();
        Time eventTime = getEventTime(map);
        Object obj = map.get("_dd.error_type");
        String str2 = obj instanceof String ? (String) obj : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Object remove = linkedHashMap.remove("_dd.error.threads");
        List list = remove instanceof List ? (List) remove : null;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddError(str, i, th, null, false, linkedHashMap, eventTime, str2, 0, list, null, 1280));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.datadog.android.rum.RumMonitor
    public final void addErrorWithStacktrace(String str, String str2, Map map) {
        Time eventTime = getEventTime(map);
        Object obj = map.get("_dd.error_type");
        String str3 = null;
        String str4 = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("_dd.error.source_type");
        String str5 = obj2 instanceof String ? (String) obj2 : null;
        if (str5 != null) {
            Locale locale = Locale.US;
            str3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str5, locale);
        }
        int i = 1;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -861391249:
                    str3.equals("android");
                    break;
                case -760334308:
                    if (str3.equals("flutter")) {
                        i = 4;
                        break;
                    }
                    break;
                case -380982102:
                    if (str3.equals("ndk+il2cpp")) {
                        i = 6;
                        break;
                    }
                    break;
                case 108917:
                    if (str3.equals("ndk")) {
                        i = 5;
                        break;
                    }
                    break;
                case 150940456:
                    if (str3.equals("browser")) {
                        i = 2;
                        break;
                    }
                    break;
                case 828638245:
                    if (str3.equals("react-native")) {
                        i = 3;
                        break;
                    }
                    break;
            }
        }
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddError(str, 4, null, str2, false, MapsKt__MapsKt.toMap(map), eventTime, str4, i, EmptyList.INSTANCE, null, 1024));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addFeatureFlagEvaluation(String str, String str2) {
        str2.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddFeatureFlagEvaluation(str, str2));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addLongTask(long j, String str) {
        str.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddLongTask(j, str));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addResourceTiming(Object obj, ResourceTiming resourceTiming) {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddResourceTiming(obj, resourceTiming));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void addSessionReplaySkippedFrame() {
        BoundsAnimation$animate$1 boundsAnimation$animate$1 = new BoundsAnimation$animate$1(this, 29);
        zzho.executeSafe(this.executorService, "Get current session ID", this.sdkCore.getInternalLogger(), new q4$$ExternalSyntheticLambda0(21, this, boundsAnimation$animate$1));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addTiming(String str) {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddCustomTiming(str));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewAttributes(Map map) {
        map.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddViewAttributes(map));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void addViewLoadingTime() {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AddViewLoadingTime());
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void eventDropped(String str, StorageEvent storageEvent) {
        if (storageEvent instanceof StorageEvent.Action) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ActionDropped(str));
            return;
        }
        if (storageEvent instanceof StorageEvent.Resource) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ResourceDropped(str, ((StorageEvent.Resource) storageEvent).resourceId));
            return;
        }
        if (storageEvent instanceof StorageEvent.Error) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ErrorDropped(str, ((StorageEvent.Error) storageEvent).resourceId));
        } else if (storageEvent instanceof StorageEvent.LongTask) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.LongTaskDropped(str, false));
        } else if (storageEvent instanceof StorageEvent.FrozenFrame) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.LongTaskDropped(str, true));
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void eventSent(String str, StorageEvent storageEvent) {
        if (storageEvent instanceof StorageEvent.Action) {
            StorageEvent.Action action = (StorageEvent.Action) storageEvent;
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ActionSent(str, action.frustrationCount, action.f954type, action.eventEndTimestampInNanos));
            return;
        }
        if (storageEvent instanceof StorageEvent.Resource) {
            StorageEvent.Resource resource = (StorageEvent.Resource) storageEvent;
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ResourceSent(str, resource.resourceId, resource.resourceStopTimestampInNanos));
            return;
        }
        if (storageEvent instanceof StorageEvent.Error) {
            StorageEvent.Error error = (StorageEvent.Error) storageEvent;
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.ErrorSent(error.resourceStopTimestampInNanos, str, error.resourceId));
        } else if (storageEvent instanceof StorageEvent.LongTask) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.LongTaskSent(str, false));
        } else if (storageEvent instanceof StorageEvent.FrozenFrame) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.LongTaskSent(str, true));
        }
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final Map getAttributes() {
        return this.globalAttributes;
    }

    public final void handleEvent$dd_sdk_android_rum_release(RumRawEvent rumRawEvent) {
        Pair pair;
        RumViewScope activeView$dd_sdk_android_rum_release;
        if ((rumRawEvent instanceof RumRawEvent.AddError) && ((RumRawEvent.AddError) rumRawEvent).isFatal) {
            synchronized (this.rootScope) {
                try {
                    SdkFeature feature = this.sdkCore.getFeature("rum");
                    int i = 0;
                    if (feature != null) {
                        Set of = SetsKt__SetsJVMKt.setOf("session-replay");
                        of.getClass();
                        String m = Recorder$$ExternalSyntheticOutline2.m("getWriteContextSync-", feature.wrappedFeature.getName());
                        ThreadPoolExecutor contextExecutorService$dd_sdk_android_core_release = feature.coreFeature.getContextExecutorService$dd_sdk_android_core_release();
                        InternalLogger internalLogger = feature.internalLogger;
                        pair = (Pair) zzho.getSafe(zzho.submitSafe(contextExecutorService$dd_sdk_android_core_release, m, internalLogger, new SdkFeature$$ExternalSyntheticLambda0(feature, of, i)), m, internalLogger);
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        this.rootScope.handleEvent(rumRawEvent, (DatadogContext) pair.first, (Function1) pair.second, this.writer);
                        RumApplicationScope rumApplicationScope = this.rootScope;
                        RumSessionScope activeSession = rumApplicationScope.getActiveSession();
                        this.sdkCore.updateFeatureContext("rum", new DatadogRumMonitor$handleEvent$1$1((activeSession == null || (activeView$dd_sdk_android_rum_release = activeSession.getActiveView$dd_sdk_android_rum_release()) == null) ? activeSession != null ? activeSession.getRumContext() : rumApplicationScope.rumContext : activeView$dd_sdk_android_rum_release.getRumContext(), i), true);
                    } else {
                        DBUtil.log$default(this.sdkCore.getInternalLogger(), 4, InternalLogger.Target.USER, DatadogRumMonitor$handleEvent$1$2.INSTANCE, null, false, 56);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!(rumRawEvent instanceof RumRawEvent.TelemetryEventWrapper)) {
            this.handler.removeCallbacks(this.keepAliveRunnable);
            SdkFeature feature2 = this.sdkCore.getFeature("rum");
            if (feature2 != null) {
                feature2.withWriteContext(ArraysKt___ArraysKt.toSet(new String[]{"session-replay", "profiling"}), new CoreTraceWriter$write$1(3, this, rumRawEvent));
                return;
            }
            return;
        }
        final TelemetryEventHandler telemetryEventHandler = this.telemetryEventHandler;
        final RumRawEvent.TelemetryEventWrapper telemetryEventWrapper = (RumRawEvent.TelemetryEventWrapper) rumRawEvent;
        final DataWriter dataWriter = this.writer;
        LinkedHashSet linkedHashSet = telemetryEventHandler.eventIDsSeenInCurrentSession;
        dataWriter.getClass();
        final InternalTelemetryEvent internalTelemetryEvent = telemetryEventWrapper.event;
        InternalLogger.Target target = InternalLogger.Target.MAINTAINER;
        InternalSdkCore internalSdkCore = telemetryEventHandler.sdkCore;
        if (telemetryEventHandler.eventSampler.sample(internalTelemetryEvent)) {
            if (!(internalTelemetryEvent instanceof InternalTelemetryEvent.Configuration) || telemetryEventHandler.configurationExtraSampler.sample(internalTelemetryEvent)) {
                TelemetryEventId identity = GrpcDecoderKt.getIdentity(internalTelemetryEvent);
                if ((internalTelemetryEvent instanceof InternalTelemetryEvent.Log) && linkedHashSet.contains(identity)) {
                    DBUtil.log$default(internalSdkCore.getInternalLogger(), 3, target, new KeyHandle$keyPair$2(identity, 27), null, false, 56);
                    return;
                }
                if (telemetryEventHandler.totalEventsSeenInCurrentSession >= telemetryEventHandler.maxEventCountPerSession) {
                    DBUtil.log$default(internalSdkCore.getInternalLogger(), 3, target, TelemetryEventHandler$canWrite$2.INSTANCE, null, false, 56);
                    return;
                }
                linkedHashSet.add(GrpcDecoderKt.getIdentity(internalTelemetryEvent));
                telemetryEventHandler.totalEventsSeenInCurrentSession++;
                SdkFeature feature3 = internalSdkCore.getFeature("rum");
                if (feature3 != null) {
                    feature3.withWriteContext(ArraysKt___ArraysKt.toSet(new String[]{"session-replay", "tracing", "rum"}), new Function2() { // from class: com.datadog.android.telemetry.internal.TelemetryEventHandler$handleEvent$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        /* JADX WARN: Can't wrap try/catch for region: R(49:73|(1:75)(1:297)|76|77|(1:79)|80|(1:82)(1:296)|83|(1:85)(1:295)|86|(1:88)(1:294)|89|(1:91)(1:293)|92|(1:94)(1:292)|95|(1:97)(1:291)|98|(1:100)|101|(1:103)(1:290)|(1:105)(1:289)|(1:107)(12:256|257|259|260|261|262|263|264|265|266|(1:268)|269)|108|(2:110|(23:112|(1:254)(1:115)|116|(1:118)(1:253)|119|(1:121)(1:252)|122|(1:124)(1:251)|(1:126)|(1:128)(1:250)|129|(1:131)(1:249)|132|133|(1:135)(1:248)|(1:137)(1:247)|138|139|140|(2:142|(30:145|146|(1:148)(1:239)|149|(1:151)(1:238)|152|(1:154)(1:237)|155|(1:157)(1:236)|158|(1:160)(1:235)|161|(1:163)(1:234)|164|(1:166)(1:233)|167|(1:169)(1:232)|(1:171)(1:231)|172|(1:174)(1:230)|(1:176)|177|(1:229)(1:181)|(3:183|(2:185|(1:187)(2:225|226))(1:227)|188)(1:228)|189|190|(1:192)(1:224)|(1:194)(1:223)|(4:196|(4:199|(2:201|(2:203|(2:205|(2:207|208)(3:210|211|212))(2:213|214))(2:215|216))(2:217|218)|209|197)|219|220)(1:222)|221)(1:144))|240|241|242))|255|(0)|254|116|(0)(0)|119|(0)(0)|122|(0)(0)|(0)|(0)(0)|129|(0)(0)|132|133|(0)(0)|(0)(0)|138|139|140|(0)|240|241|242) */
                        /* JADX WARN: Code restructure failed: missing block: B:244:0x03b6, code lost:
                        
                            r0 = move-exception;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:246:0x03b8, code lost:
                        
                            androidx.room.util.DBUtil.log$default(r21, r22, r23, new com.squareup.workflow1.Workflows__WorkflowActionKt$action$1(r5, 8), r0, false, 48);
                            r24 = 0;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:110:0x030a  */
                        /* JADX WARN: Removed duplicated region for block: B:114:0x031d A[ADDED_TO_REGION] */
                        /* JADX WARN: Removed duplicated region for block: B:118:0x032d  */
                        /* JADX WARN: Removed duplicated region for block: B:121:0x033c  */
                        /* JADX WARN: Removed duplicated region for block: B:124:0x0347  */
                        /* JADX WARN: Removed duplicated region for block: B:126:0x034e  */
                        /* JADX WARN: Removed duplicated region for block: B:128:0x0351  */
                        /* JADX WARN: Removed duplicated region for block: B:131:0x0362  */
                        /* JADX WARN: Removed duplicated region for block: B:135:0x036d  */
                        /* JADX WARN: Removed duplicated region for block: B:137:0x0373  */
                        /* JADX WARN: Removed duplicated region for block: B:142:0x039b A[Catch: NoSuchElementException -> 0x03b6, TryCatch #5 {NoSuchElementException -> 0x03b6, blocks: (B:140:0x0390, B:142:0x039b, B:144:0x03aa, B:241:0x03ad, B:242:0x03b2), top: B:139:0x0390 }] */
                        /* JADX WARN: Removed duplicated region for block: B:247:0x037c  */
                        /* JADX WARN: Removed duplicated region for block: B:248:0x0370  */
                        /* JADX WARN: Removed duplicated region for block: B:249:0x0367  */
                        /* JADX WARN: Removed duplicated region for block: B:250:0x035a  */
                        /* JADX WARN: Removed duplicated region for block: B:251:0x034a  */
                        /* JADX WARN: Removed duplicated region for block: B:252:0x0340  */
                        /* JADX WARN: Removed duplicated region for block: B:253:0x0331  */
                        /* JADX WARN: Type inference failed for: r0v10, types: [int[]] */
                        /* JADX WARN: Type inference failed for: r0v86, types: [int[]] */
                        /* JADX WARN: Type inference failed for: r21v1 */
                        /* JADX WARN: Type inference failed for: r21v2, types: [int] */
                        /* JADX WARN: Type inference failed for: r21v3 */
                        /* JADX WARN: Type inference failed for: r22v6 */
                        /* JADX WARN: Type inference failed for: r22v7, types: [int] */
                        /* JADX WARN: Type inference failed for: r22v8 */
                        /* JADX WARN: Type inference failed for: r24v17, types: [int] */
                        /* JADX WARN: Type inference failed for: r24v2, types: [int] */
                        /* JADX WARN: Type inference failed for: r49v5, types: [int] */
                        /* JADX WARN: Type inference failed for: r49v6 */
                        /* JADX WARN: Type inference failed for: r49v7 */
                        /* JADX WARN: Type inference failed for: r49v8 */
                        @Override // kotlin.jvm.functions.Function2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj, Object obj2) {
                            Object obj3;
                            Object telemetryUsageEvent;
                            ?? values;
                            int length;
                            int i2;
                            TelemetryEventHandler telemetryEventHandler2;
                            boolean z;
                            char c;
                            ?? r49;
                            String str;
                            TimeBasedInteractionIdentifier timeBasedInteractionIdentifier;
                            String str2;
                            long j;
                            ArrayList arrayList;
                            TelemetryConfigurationEvent.SelectedTracingPropagator selectedTracingPropagator;
                            String str3;
                            int i3;
                            int length2;
                            int i4;
                            InternalSdkCore internalSdkCore2;
                            Unit unit;
                            ?? values2;
                            int length3;
                            int i5;
                            DatadogContext datadogContext = (DatadogContext) obj;
                            Function1 function1 = (Function1) obj2;
                            TelemetryEventHandler telemetryEventHandler3 = telemetryEventHandler;
                            InternalSdkCore internalSdkCore3 = telemetryEventHandler3.sdkCore;
                            datadogContext.getClass();
                            function1.getClass();
                            long j2 = RumRawEvent.TelemetryEventWrapper.this.eventTime.timestamp;
                            TimeInfo timeInfo = datadogContext.time;
                            Map map = datadogContext.featuresContext;
                            DeviceInfo deviceInfo = datadogContext.deviceInfo;
                            String str4 = deviceInfo.osName;
                            String str5 = deviceInfo.osVersion;
                            String str6 = deviceInfo.deviceBuildId;
                            String str7 = deviceInfo.deviceModel;
                            String str8 = deviceInfo.deviceBrand;
                            String str9 = deviceInfo.architecture;
                            String str10 = datadogContext.source;
                            long j3 = j2 + timeInfo.serverTimeOffsetMs;
                            InternalTelemetryEvent internalTelemetryEvent2 = internalTelemetryEvent;
                            if (internalTelemetryEvent2 instanceof InternalTelemetryEvent.Log.Debug) {
                                InternalTelemetryEvent.Log.Debug debug = (InternalTelemetryEvent.Log.Debug) internalTelemetryEvent2;
                                String str11 = debug.message;
                                Map map2 = debug.additionalProperties;
                                obj3 = TelemetryEventHandler.access$createDebugEvent(telemetryEventHandler3, datadogContext, j3, str11, map2, TelemetryEventHandler.computeEffectiveSampleRate$default(telemetryEventHandler3, map2, null, 2));
                            } else if (internalTelemetryEvent2 instanceof InternalTelemetryEvent.Metric) {
                                InternalTelemetryEvent.Metric metric = (InternalTelemetryEvent.Metric) internalTelemetryEvent2;
                                String str12 = metric.message;
                                Map map3 = metric.additionalProperties;
                                obj3 = TelemetryEventHandler.access$createDebugEvent(telemetryEventHandler3, datadogContext, j3, str12, map3, TelemetryEventHandler.computeEffectiveSampleRate$default(telemetryEventHandler3, map3, null, 2));
                            } else {
                                boolean z2 = internalTelemetryEvent2 instanceof InternalTelemetryEvent.Log.Error;
                                InternalLogger.Target target2 = InternalLogger.Target.USER;
                                int i6 = 5;
                                if (z2) {
                                    SessionEndedMetricDispatcher sessionEndedMetricDispatcher = telemetryEventHandler3.sessionEndedMetricDispatcher;
                                    String str13 = TelemetryEventHandler.rumContext(datadogContext).sessionId;
                                    InternalTelemetryEvent.Log.Error error = (InternalTelemetryEvent.Log.Error) internalTelemetryEvent2;
                                    Throwable th2 = error.error;
                                    sessionEndedMetricDispatcher.getClass();
                                    str13.getClass();
                                    SessionEndedMetric sessionEndedMetric = (SessionEndedMetric) sessionEndedMetricDispatcher.metricsBySessionId.get(str13);
                                    if (sessionEndedMetric != null) {
                                        LinkedHashMap linkedHashMap = sessionEndedMetric.errorKindFrequencies;
                                        Integer num = (Integer) linkedHashMap.get("Empty error kind");
                                        internalSdkCore2 = internalSdkCore3;
                                        linkedHashMap.put("Empty error kind", Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                        unit = Unit.INSTANCE;
                                    } else {
                                        internalSdkCore2 = internalSdkCore3;
                                        unit = null;
                                    }
                                    if (unit == null) {
                                        DBUtil.log$default(sessionEndedMetricDispatcher.internalLogger, 3, InternalLogger.Target.MAINTAINER, new ViewRegistryKt$buildView$1$2$1$1(12, sessionEndedMetricDispatcher, str13), null, false, 56);
                                    }
                                    String str14 = error.message;
                                    String loggableStackTrace = th2 != null ? MapUtilsKt.loggableStackTrace(th2) : null;
                                    String canonicalName = th2 != null ? th2.getClass().getCanonicalName() : null;
                                    if (canonicalName == null) {
                                        canonicalName = th2 != null ? th2.getClass().getSimpleName() : null;
                                    }
                                    Map map4 = error.additionalProperties;
                                    float computeEffectiveSampleRate$default = TelemetryEventHandler.computeEffectiveSampleRate$default(telemetryEventHandler3, map4, null, 2);
                                    RumContext rumContext = TelemetryEventHandler.rumContext(datadogContext);
                                    if (map4 == null) {
                                        map4 = EmptyMap.INSTANCE;
                                        map4.getClass();
                                    }
                                    LinkedHashMap cleanUpInternalAttributes = TelemetryEventHandler.cleanUpInternalAttributes(new LinkedHashMap(map4));
                                    cleanUpInternalAttributes.put("process_uptime", Long.valueOf(internalSdkCore2.getAppUptimeNs() / 1000000));
                                    zzc zzcVar = new zzc(1);
                                    InternalLogger internalLogger2 = internalSdkCore2.getInternalLogger();
                                    str10.getClass();
                                    internalLogger2.getClass();
                                    try {
                                        values2 = CameraSelector$$ExternalSyntheticOutline0.values(7);
                                        length3 = values2.length;
                                        i5 = 0;
                                    } catch (NoSuchElementException e) {
                                        DBUtil.log$default(internalLogger2, 5, target2, new Workflows__WorkflowActionKt$action$1(str10, 6), e, false, 48);
                                    }
                                    while (i5 < length3) {
                                        ?? r24 = values2[i5];
                                        int i7 = i5;
                                        if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$21(r24).equals(str10)) {
                                            r17 = r24;
                                            ?? r22 = !r17 ? 1 : r17;
                                            String str15 = datadogContext.sdkVersion;
                                            TelemetryErrorEvent.Application application = new TelemetryErrorEvent.Application(rumContext.applicationId);
                                            TelemetryErrorEvent.Session session = new TelemetryErrorEvent.Session(rumContext.sessionId);
                                            String str16 = rumContext.viewId;
                                            TelemetryErrorEvent.View view = str16 != null ? new TelemetryErrorEvent.View(str16) : null;
                                            String str17 = rumContext.actionId;
                                            telemetryUsageEvent = new TelemetryErrorEvent(zzcVar, j3, "dd-sdk-android", r22, str15, application, session, view, str17 != null ? new TelemetryErrorEvent.Action(str17) : null, Float.valueOf(computeEffectiveSampleRate$default), null, new TelemetryErrorEvent.Telemetry(new TelemetryErrorEvent.Device(str9, str8, str7), new TelemetryErrorEvent.Os(str6, str4, str5), str14, (loggableStackTrace == null && canonicalName == null) ? null : new TelemetryErrorEvent.Error(loggableStackTrace, canonicalName), cleanUpInternalAttributes));
                                        } else {
                                            i5 = i7 + 1;
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                } else {
                                    if (internalTelemetryEvent2 instanceof InternalTelemetryEvent.Configuration) {
                                        InternalTelemetryEvent.Configuration configuration = (InternalTelemetryEvent.Configuration) internalTelemetryEvent2;
                                        RumFeature.Configuration rumConfig = telemetryEventHandler3.getRumConfig();
                                        float computeEffectiveSampleRate$default2 = TelemetryEventHandler.computeEffectiveSampleRate$default(telemetryEventHandler3, null, rumConfig != null ? Float.valueOf(rumConfig.telemetryConfigurationSampleRate) : null, 1);
                                        SdkFeature feature4 = internalSdkCore3.getFeature("tracing");
                                        Map map5 = (Map) map.get("session-replay");
                                        if (map5 == null) {
                                            map5 = EmptyMap.INSTANCE;
                                            map5.getClass();
                                        }
                                        Object obj4 = map5.get("session_replay_sample_rate");
                                        Long l = obj4 instanceof Long ? (Long) obj4 : null;
                                        Object obj5 = map5.get("session_replay_start_immediate_recording");
                                        Boolean bool = obj5 instanceof Boolean ? (Boolean) obj5 : null;
                                        Object obj6 = map5.get("session_replay_image_privacy");
                                        String str18 = obj6 instanceof String ? (String) obj6 : null;
                                        Object obj7 = map5.get("session_replay_touch_privacy");
                                        String str19 = obj7 instanceof String ? (String) obj7 : null;
                                        Object obj8 = map5.get("session_replay_text_and_input_privacy");
                                        String str20 = obj8 instanceof String ? (String) obj8 : null;
                                        RumFeature.Configuration rumConfig2 = telemetryEventHandler3.getRumConfig();
                                        boolean z3 = (rumConfig2 != null ? rumConfig2.viewTrackingStrategy : null) instanceof ActivityViewTrackingStrategy;
                                        RumContext rumContext2 = TelemetryEventHandler.rumContext(datadogContext);
                                        Map map6 = (Map) map.get("tracing");
                                        if (map6 == null) {
                                            map6 = EmptyMap.INSTANCE;
                                            map6.getClass();
                                        }
                                        Map map7 = map6;
                                        Object obj9 = map7.get("is_opentelemetry_enabled");
                                        Boolean bool2 = obj9 instanceof Boolean ? (Boolean) obj9 : null;
                                        if (bool2 != null ? bool2.booleanValue() : false) {
                                            telemetryEventHandler2 = telemetryEventHandler3;
                                            r49 = z3;
                                            c = 1;
                                        } else {
                                            try {
                                                GlobalDatadogTracer globalDatadogTracer = GlobalDatadogTracer.INSTANCE;
                                                try {
                                                    z = z3;
                                                    try {
                                                        telemetryEventHandler2 = telemetryEventHandler3;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        telemetryEventHandler2 = telemetryEventHandler3;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    telemetryEventHandler2 = telemetryEventHandler3;
                                                    z = z3;
                                                }
                                            } catch (Throwable unused) {
                                                telemetryEventHandler2 = telemetryEventHandler3;
                                                z = z3;
                                            }
                                            try {
                                                if (GlobalDatadogTracer.class.getDeclaredMethod("getOrNull", null).invoke(GlobalDatadogTracer.class.getDeclaredField("INSTANCE").get(null), null) != null) {
                                                    c = 2;
                                                    r49 = z;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                try {
                                                    try {
                                                        DBUtil.log$default(internalSdkCore3.getInternalLogger(), 5, InternalLogger.Target.TELEMETRY, TelemetryEventHandler$canWrite$2.INSTANCE$1, th, false, 48);
                                                    } catch (Throwable unused2) {
                                                        i6 = 5;
                                                    }
                                                } catch (Throwable unused3) {
                                                }
                                                c = 0;
                                                r49 = z;
                                                if (c == 1) {
                                                }
                                                str = null;
                                                if (feature4 == null) {
                                                }
                                                Object obj10 = map7.get("okhttp_interceptor_sample_rate");
                                                if (obj10 instanceof Float) {
                                                }
                                                Object obj11 = map7.get("okhttp_interceptor_header_types");
                                                if (obj11 instanceof TracingHeaderTypesSet) {
                                                }
                                                RumFeature.Configuration rumConfig3 = telemetryEventHandler2.getRumConfig();
                                                if (rumConfig3 != null) {
                                                }
                                                if (timeBasedInteractionIdentifier == null) {
                                                }
                                                if (timeBasedInteractionIdentifier != null) {
                                                }
                                                RumFeature.Configuration rumConfig4 = telemetryEventHandler2.getRumConfig();
                                                if (rumConfig4 != null) {
                                                }
                                                boolean z4 = r4;
                                                if ((r0 instanceof TimeBasedInitialResourceIdentifier ? (TimeBasedInitialResourceIdentifier) r0 : null) != null) {
                                                }
                                                Float f = r8;
                                                zza zzaVar = new zza(1);
                                                InternalLogger internalLogger3 = internalSdkCore3.getInternalLogger();
                                                str10.getClass();
                                                internalLogger3.getClass();
                                                int[] values3 = CameraSelector$$ExternalSyntheticOutline0.values(7);
                                                length2 = values3.length;
                                                i4 = 0;
                                                while (i4 < length2) {
                                                }
                                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                                            }
                                            c = 0;
                                            r49 = z;
                                        }
                                        if (c == 1) {
                                            Object obj12 = map7.get("opentelemetry_api_version");
                                            if (obj12 instanceof String) {
                                                str = (String) obj12;
                                                boolean z5 = feature4 == null && c != 0;
                                                Object obj102 = map7.get("okhttp_interceptor_sample_rate");
                                                Float f2 = obj102 instanceof Float ? (Float) obj102 : null;
                                                Object obj112 = map7.get("okhttp_interceptor_header_types");
                                                TracingHeaderTypesSet tracingHeaderTypesSet = obj112 instanceof TracingHeaderTypesSet ? (TracingHeaderTypesSet) obj112 : null;
                                                RumFeature.Configuration rumConfig32 = telemetryEventHandler2.getRumConfig();
                                                timeBasedInteractionIdentifier = rumConfig32 != null ? rumConfig32.lastInteractionIdentifier : null;
                                                if (timeBasedInteractionIdentifier == null) {
                                                    timeBasedInteractionIdentifier = null;
                                                }
                                                Long l2 = timeBasedInteractionIdentifier != null ? 3000L : null;
                                                RumFeature.Configuration rumConfig42 = telemetryEventHandler2.getRumConfig();
                                                InitialResourceIdentifier initialResourceIdentifier = rumConfig42 != null ? rumConfig42.initialResourceIdentifier : null;
                                                boolean z42 = z5;
                                                Long l3 = (initialResourceIdentifier instanceof TimeBasedInitialResourceIdentifier ? (TimeBasedInitialResourceIdentifier) initialResourceIdentifier : null) != null ? 100L : null;
                                                Float f3 = f2;
                                                zza zzaVar2 = new zza(1);
                                                InternalLogger internalLogger32 = internalSdkCore3.getInternalLogger();
                                                str10.getClass();
                                                internalLogger32.getClass();
                                                int[] values32 = CameraSelector$$ExternalSyntheticOutline0.values(7);
                                                length2 = values32.length;
                                                i4 = 0;
                                                while (i4 < length2) {
                                                    int i8 = values32[i4];
                                                    int i9 = i4;
                                                    if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$18(i8).equals(str10)) {
                                                        int i10 = i8 == 0 ? 1 : i8;
                                                        String str21 = datadogContext.sdkVersion;
                                                        TelemetryConfigurationEvent.Application application2 = new TelemetryConfigurationEvent.Application(rumContext2.applicationId);
                                                        TelemetryConfigurationEvent.Session session2 = new TelemetryConfigurationEvent.Session(rumContext2.sessionId);
                                                        String str22 = rumContext2.viewId;
                                                        TelemetryConfigurationEvent.View view2 = str22 != null ? new TelemetryConfigurationEvent.View(str22) : null;
                                                        String str23 = rumContext2.actionId;
                                                        TelemetryConfigurationEvent.Action action = str23 != null ? new TelemetryConfigurationEvent.Action(str23) : null;
                                                        TelemetryConfigurationEvent.Device device = new TelemetryConfigurationEvent.Device(str9, str8, str7);
                                                        TelemetryConfigurationEvent.Os os = new TelemetryConfigurationEvent.Os(str6, str4, str5);
                                                        RumFeature.Configuration rumConfig5 = telemetryEventHandler2.getRumConfig();
                                                        Long valueOf = rumConfig5 != null ? Long.valueOf((long) rumConfig5.sampleRate) : null;
                                                        RumFeature.Configuration rumConfig6 = telemetryEventHandler2.getRumConfig();
                                                        Long valueOf2 = rumConfig6 != null ? Long.valueOf((long) rumConfig6.telemetrySampleRate) : null;
                                                        boolean z6 = configuration.useProxy;
                                                        RumFeature.Configuration rumConfig7 = telemetryEventHandler2.getRumConfig();
                                                        Boolean valueOf3 = rumConfig7 != null ? Boolean.valueOf(rumConfig7.trackFrustrations) : null;
                                                        RumFeature.Configuration rumConfig8 = telemetryEventHandler2.getRumConfig();
                                                        Boolean valueOf4 = rumConfig8 != null ? Boolean.valueOf(rumConfig8.backgroundEventTracking) : null;
                                                        boolean z7 = (telemetryEventHandler2.getRumConfig() != null ? Boolean.TRUE : null) != null;
                                                        boolean z8 = configuration.trackErrors;
                                                        RumFeature.Configuration rumConfig9 = telemetryEventHandler2.getRumConfig();
                                                        r17 = (rumConfig9 != null ? rumConfig9.longTaskTrackingStrategy : null) != null;
                                                        long j4 = configuration.batchSize;
                                                        long j5 = configuration.batchUploadFrequency;
                                                        RumFeature.Configuration rumConfig10 = telemetryEventHandler2.getRumConfig();
                                                        Long valueOf5 = (rumConfig10 == null || (i3 = rumConfig10.vitalsMonitorUpdateFrequency) == 0) ? null : Long.valueOf(RumErrorSource$EnumUnboxingLocalUtility.getPeriodInMs(i3));
                                                        if (c != 0) {
                                                            if (c == 1) {
                                                                str3 = "OpenTelemetry";
                                                            } else {
                                                                if (c != 2) {
                                                                    throw null;
                                                                }
                                                                str3 = "OpenTracing";
                                                            }
                                                            str2 = str3;
                                                        } else {
                                                            str2 = null;
                                                        }
                                                        boolean z9 = telemetryEventHandler2.trackNetworkRequests;
                                                        long j6 = configuration.batchProcessingLevel;
                                                        boolean z10 = datadogContext.processInfo.isMainProcess;
                                                        Long valueOf6 = deviceInfo.numberOfDisplays != null ? Long.valueOf(r1.intValue()) : null;
                                                        Long valueOf7 = f3 != null ? Long.valueOf((long) f3.floatValue()) : null;
                                                        if (tracingHeaderTypesSet != null) {
                                                            Set set = tracingHeaderTypesSet.types;
                                                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
                                                            Iterator it = set.iterator();
                                                            while (it.hasNext()) {
                                                                int ordinal = ((TracingHeaderType) it.next()).ordinal();
                                                                Iterator it2 = it;
                                                                if (ordinal == 0) {
                                                                    selectedTracingPropagator = TelemetryConfigurationEvent.SelectedTracingPropagator.DATADOG;
                                                                } else if (ordinal == 1) {
                                                                    selectedTracingPropagator = TelemetryConfigurationEvent.SelectedTracingPropagator.B3;
                                                                } else if (ordinal == 2) {
                                                                    selectedTracingPropagator = TelemetryConfigurationEvent.SelectedTracingPropagator.B3MULTI;
                                                                } else {
                                                                    if (ordinal != 3) {
                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                        return null;
                                                                    }
                                                                    selectedTracingPropagator = TelemetryConfigurationEvent.SelectedTracingPropagator.TRACECONTEXT;
                                                                }
                                                                arrayList2.add(selectedTracingPropagator);
                                                                it = it2;
                                                            }
                                                            arrayList = arrayList2;
                                                            j = j6;
                                                        } else {
                                                            j = j6;
                                                            arrayList = null;
                                                        }
                                                        telemetryUsageEvent = new TelemetryConfigurationEvent(zzaVar2, j3, i10, str21, application2, session2, view2, action, Float.valueOf(computeEffectiveSampleRate$default2), new TelemetryConfigurationEvent.Telemetry(device, os, new TelemetryConfigurationEvent.Configuration(valueOf, valueOf2, valueOf7, l, bool, Boolean.valueOf(z6), arrayList, str20, str18, str19, valueOf3, Boolean.valueOf(z7), valueOf6, r49, valueOf4, valueOf5, Boolean.valueOf(z8), Boolean.valueOf(z9), Boolean.valueOf(z42), Boolean.valueOf(r17), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j), str2, str, Boolean.valueOf(z10), l2, l3)));
                                                    } else {
                                                        i4 = i9 + 1;
                                                    }
                                                }
                                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                                            }
                                        }
                                        str = null;
                                        if (feature4 == null) {
                                        }
                                        Object obj1022 = map7.get("okhttp_interceptor_sample_rate");
                                        if (obj1022 instanceof Float) {
                                        }
                                        Object obj1122 = map7.get("okhttp_interceptor_header_types");
                                        if (obj1122 instanceof TracingHeaderTypesSet) {
                                        }
                                        RumFeature.Configuration rumConfig322 = telemetryEventHandler2.getRumConfig();
                                        if (rumConfig322 != null) {
                                        }
                                        if (timeBasedInteractionIdentifier == null) {
                                        }
                                        if (timeBasedInteractionIdentifier != null) {
                                        }
                                        RumFeature.Configuration rumConfig422 = telemetryEventHandler2.getRumConfig();
                                        if (rumConfig422 != null) {
                                        }
                                        boolean z422 = z5;
                                        if ((initialResourceIdentifier instanceof TimeBasedInitialResourceIdentifier ? (TimeBasedInitialResourceIdentifier) initialResourceIdentifier : null) != null) {
                                        }
                                        Float f32 = f2;
                                        zza zzaVar22 = new zza(1);
                                        InternalLogger internalLogger322 = internalSdkCore3.getInternalLogger();
                                        str10.getClass();
                                        internalLogger322.getClass();
                                        int[] values322 = CameraSelector$$ExternalSyntheticOutline0.values(7);
                                        length2 = values322.length;
                                        i4 = 0;
                                        while (i4 < length2) {
                                        }
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    if (internalTelemetryEvent2 instanceof InternalTelemetryEvent$ApiUsage$AddViewLoadingTime) {
                                        InternalTelemetryEvent$ApiUsage$AddViewLoadingTime internalTelemetryEvent$ApiUsage$AddViewLoadingTime = (InternalTelemetryEvent$ApiUsage$AddViewLoadingTime) internalTelemetryEvent2;
                                        Map map8 = internalTelemetryEvent$ApiUsage$AddViewLoadingTime.additionalProperties;
                                        float computeEffectiveSampleRate$default3 = TelemetryEventHandler.computeEffectiveSampleRate$default(telemetryEventHandler3, map8, null, 2);
                                        RumContext rumContext3 = TelemetryEventHandler.rumContext(datadogContext);
                                        LinkedHashMap cleanUpInternalAttributes2 = TelemetryEventHandler.cleanUpInternalAttributes(map8);
                                        if (!(internalTelemetryEvent$ApiUsage$AddViewLoadingTime instanceof InternalTelemetryEvent$ApiUsage$AddViewLoadingTime)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        TelemetryUsageEvent$Usage$AddViewLoadingTime telemetryUsageEvent$Usage$AddViewLoadingTime = new TelemetryUsageEvent$Usage$AddViewLoadingTime(internalTelemetryEvent$ApiUsage$AddViewLoadingTime.noView, internalTelemetryEvent$ApiUsage$AddViewLoadingTime.noActiveView, internalTelemetryEvent$ApiUsage$AddViewLoadingTime.overwrite);
                                        zzd zzdVar = new zzd(2);
                                        InternalLogger internalLogger4 = internalSdkCore3.getInternalLogger();
                                        str10.getClass();
                                        internalLogger4.getClass();
                                        try {
                                            values = CameraSelector$$ExternalSyntheticOutline0.values(7);
                                            length = values.length;
                                            i2 = 0;
                                        } catch (NoSuchElementException e2) {
                                            DBUtil.log$default(internalLogger4, 5, target2, new Workflows__WorkflowActionKt$action$1(str10, 7), e2, false, 48);
                                        }
                                        while (i2 < length) {
                                            ?? r242 = values[i2];
                                            int i11 = i2;
                                            if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$22(r242).equals(str10)) {
                                                r17 = r242;
                                                ?? r21 = !r17 ? 1 : r17;
                                                String str24 = datadogContext.sdkVersion;
                                                TelemetryUsageEvent.Application application3 = new TelemetryUsageEvent.Application(rumContext3.applicationId);
                                                TelemetryUsageEvent.Session session3 = new TelemetryUsageEvent.Session(rumContext3.sessionId);
                                                String str25 = rumContext3.viewId;
                                                TelemetryUsageEvent.View view3 = str25 != null ? new TelemetryUsageEvent.View(str25) : null;
                                                String str26 = rumContext3.actionId;
                                                telemetryUsageEvent = new TelemetryUsageEvent(zzdVar, j3, r21, str24, application3, session3, view3, str26 != null ? new TelemetryUsageEvent.Action(str26) : null, Float.valueOf(computeEffectiveSampleRate$default3), new TelemetryUsageEvent.Telemetry(new TelemetryUsageEvent.Device(str9, str8, str7), new TelemetryUsageEvent.Os(str6, str4, str5), telemetryUsageEvent$Usage$AddViewLoadingTime, cleanUpInternalAttributes2));
                                            } else {
                                                i2 = i11 + 1;
                                            }
                                        }
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    } else {
                                        if (!(internalTelemetryEvent2 instanceof InternalTelemetryEvent.InterceptorInstantiated)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        telemetryEventHandler3.trackNetworkRequests = true;
                                        obj3 = null;
                                    }
                                }
                                obj3 = telemetryUsageEvent;
                            }
                            if (obj3 != null) {
                                function1.invoke(new TraceParser$parse$1(11, dataWriter, obj3));
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
        }
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void notifyInterceptorInstantiated() {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.TelemetryEventWrapper(InternalTelemetryEvent.InterceptorInstantiated.INSTANCE));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void removeAttribute(String str) {
        str.getClass();
        this.globalAttributes.remove(str);
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void reportAppFullyDisplayed() {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AppStartTTFDEvent());
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendAppStartEvent(RumStartupScenario rumStartupScenario) {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AppStartEvent(rumStartupScenario));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendTTIDEvent(RumTTIDInfo rumTTIDInfo) {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.AppStartTTIDEvent(rumTTIDInfo));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendTelemetryEvent(InternalTelemetryEvent internalTelemetryEvent) {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.TelemetryEventWrapper(internalTelemetryEvent));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void sendWebViewEvent() {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.WebViewEvent());
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startAction(LinkedHashMap linkedHashMap) {
        Time eventTime = getEventTime(linkedHashMap);
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartAction(RumActionType.SCROLL, "", true, MapsKt__MapsKt.toMap(linkedHashMap), eventTime));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void startResource(ResourceId resourceId, int i, String str, Map map) {
        if (i == 0) {
            throw null;
        }
        map.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartResource(resourceId, str, i, MapsKt__MapsKt.toMap(map), getEventTime(map)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startView(String str, Object obj, Map map) {
        obj.getClass();
        map.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartView(zzia.from(obj, str), MapsKt__MapsKt.toMap(map), getEventTime(map)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopAction(RumActionType rumActionType, LinkedHashMap linkedHashMap) {
        rumActionType.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopAction(rumActionType, MapsKt__MapsKt.toMap(linkedHashMap), getEventTime(linkedHashMap)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResource(String str, Integer num, EmptyMap emptyMap) {
        str.getClass();
        emptyMap.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResource(str, Long.valueOf(num.intValue()), null, 5, MapsKt__MapsKt.toMap(emptyMap), getEventTime(emptyMap)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopResourceWithError(String str, String str2, Throwable th, Map map) {
        str.getClass();
        map.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResourceWithError(str, null, str2, th, MapsKt__MapsKt.toMap(map)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void stopView(Map map, Object obj) {
        map.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopView(zzia.from(obj, null), MapsKt__MapsKt.toMap(map), getEventTime(map)));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void waitForResourceTiming(Object obj) {
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.WaitForResourceTiming(obj));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void stopResourceWithError(ResourceId resourceId, String str, Throwable th, Map map) {
        map.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResourceWithError(resourceId, null, str, th, MapsKt__MapsKt.toMap(map)));
    }

    @Override // com.datadog.android.rum.RumMonitor
    public final void startResource(String str, String str2, Map map) {
        str.getClass();
        map.getClass();
        handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StartResource(str, str2, 1, MapsKt__MapsKt.toMap(map), getEventTime(map)));
    }

    @Override // com.datadog.android.rum.internal.monitor.AdvancedRumMonitor
    public final void stopResource(ResourceId resourceId, Integer num, Long l, int i, LinkedHashMap linkedHashMap) {
        if (i != 0) {
            handleEvent$dd_sdk_android_rum_release(new RumRawEvent.StopResource(resourceId, Long.valueOf(num.intValue()), l, i, MapsKt__MapsKt.toMap(linkedHashMap), getEventTime(linkedHashMap)));
            return;
        }
        throw null;
    }
}
