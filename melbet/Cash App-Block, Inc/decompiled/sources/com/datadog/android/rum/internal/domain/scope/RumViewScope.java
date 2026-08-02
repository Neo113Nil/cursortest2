package com.datadog.android.rum.internal.domain.scope;

import android.util.Log;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.media3.extractor.text.CueEncoder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import coil3.request.OneShotDisposable;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.bumptech.glide.GlideBuilder$1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.LocaleInfo;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.feature.event.ThreadDump;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.internal.attributes.ViewScopeInstrumentationType;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent$ApiUsage$AddViewLoadingTime;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.datadog.android.rum.RumActionType;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumPerformanceMetric;
import com.datadog.android.rum.internal.anr.ANRException;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.battery.BatteryInfo;
import com.datadog.android.rum.internal.domain.display.DisplayInfo;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.domain.state.SlowFrameRecord;
import com.datadog.android.rum.internal.domain.state.ViewUIPerformanceReport;
import com.datadog.android.rum.internal.metric.NoValueReason;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher$Companion$WhenMappings;
import com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher$sendViewEnded$1;
import com.datadog.android.rum.internal.metric.ViewInitializationMetricsState;
import com.datadog.android.rum.internal.metric.interactiontonextview.ActionTypeInteractionValidator;
import com.datadog.android.rum.internal.metric.interactiontonextview.InternalInteractionContext;
import com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver;
import com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener;
import com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher$SlowFramesTelemetry;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.datadog.android.rum.internal.vitals.VitalInfo;
import com.datadog.android.rum.internal.vitals.VitalListener;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier;
import com.datadog.android.rum.model.ActionEvent;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.LongTaskEvent;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.fillr.n;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzhs;
import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import com.google.android.gms.internal.mlkit_vision_common.zzic;
import com.google.mlkit.vision.face.internal.zzm;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.nimbusds.jose.JWECryptoParts;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class RumViewScope implements RumScope {
    public final GlideBuilder$1 accessibilitySnapshotManager;
    public long actionCount;
    public RumActionScope activeActionScope;
    public final LinkedHashMap activeResourceScopes;
    public final InfoProvider batteryInfoProvider;
    public Double cpuTicks;
    public final RumViewScope$cpuVitalListener$1 cpuVitalListener;
    public final VitalMonitor cpuVitalMonitor;
    public long crashCount;
    public final LinkedHashMap customTimings;
    public final InfoProvider displayInfoProvider;
    public long errorCount;
    public final long eventTimestamp;
    public final LinkedHashMap featureFlags;
    public final CueEncoder featuresContextResolver;
    public final OneShotDisposable firstPartyHostHeaderTypeResolver;
    public final RumViewScope$memoryVitalListener$1 frameRateVitalListener;
    public final VitalMonitor frameRateVitalMonitor;
    public long frozenFrameCount;
    public int frustrationCount;
    public boolean hasReplay;
    public final Map initialAttributes;
    public final HurlStack insightsCollector;
    public final JWECryptoParts interactionToNextViewMetricResolver;
    public final LinkedHashMap internalAttributes;
    public final RumScopeKey key;
    public VitalInfo lastFrameRateInfo;
    public VitalInfo lastMemoryInfo;
    public long longTaskCount;
    public Map memoizedParentAttributes;
    public final RumViewScope$memoryVitalListener$1 memoryVitalListener;
    public final VitalMonitor memoryVitalMonitor;
    public final NetworkSettledMetricResolver networkSettledMetricResolver;
    public final RumScope parentScope;
    public long pendingActionCount;
    public long pendingErrorCount;
    public long pendingLongTaskCount;
    public long pendingResourceCount;
    public final LinkedHashMap performanceMetrics;
    public long resourceCount;
    public final float sampleRate;
    public final InternalSdkCore sdkCore;
    public final long serverTimeOffsetInMs;
    public final SessionEndedMetricDispatcher sessionEndedMetricDispatcher;
    public final String sessionId;
    public final DefaultSlowFramesListener slowFramesListener;
    public final long startedNanos;
    public boolean stopped;
    public long stoppedNanos;
    public final boolean trackFrustrations;

    /* renamed from: type, reason: collision with root package name */
    public final int f953type;
    public final String url;
    public long version;
    public final LinkedHashMap viewAttributes;
    public final RumViewChangedListener viewChangedListener;
    public final zzm viewEndedMetricDispatcher;
    public final String viewId;
    public Long viewLoadingTime;

    public final class Companion {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.datadog.android.rum.internal.domain.scope.RumViewScope$memoryVitalListener$1, com.datadog.android.rum.internal.vitals.VitalListener] */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.datadog.android.rum.internal.domain.scope.RumViewScope$memoryVitalListener$1, com.datadog.android.rum.internal.vitals.VitalListener] */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.datadog.android.rum.internal.domain.scope.RumViewScope$cpuVitalListener$1, com.datadog.android.rum.internal.vitals.VitalListener] */
    public RumViewScope(RumScope rumScope, InternalSdkCore internalSdkCore, SessionEndedMetricDispatcher sessionEndedMetricDispatcher, RumScopeKey rumScopeKey, Time time, Map map, RumViewChangedListener rumViewChangedListener, OneShotDisposable oneShotDisposable, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, CueEncoder cueEncoder, int i, boolean z, float f, JWECryptoParts jWECryptoParts, NetworkSettledMetricResolver networkSettledMetricResolver, DefaultSlowFramesListener defaultSlowFramesListener, zzm zzmVar, GlideBuilder$1 glideBuilder$1, InfoProvider infoProvider, InfoProvider infoProvider2, HurlStack hurlStack) {
        internalSdkCore.getClass();
        sessionEndedMetricDispatcher.getClass();
        rumScopeKey.getClass();
        time.getClass();
        map.getClass();
        oneShotDisposable.getClass();
        vitalMonitor.getClass();
        vitalMonitor2.getClass();
        vitalMonitor3.getClass();
        cueEncoder.getClass();
        if (i == 0) {
            throw null;
        }
        jWECryptoParts.getClass();
        networkSettledMetricResolver.getClass();
        zzmVar.getClass();
        glideBuilder$1.getClass();
        infoProvider.getClass();
        infoProvider2.getClass();
        hurlStack.getClass();
        this.parentScope = rumScope;
        this.sdkCore = internalSdkCore;
        this.sessionEndedMetricDispatcher = sessionEndedMetricDispatcher;
        this.key = rumScopeKey;
        this.initialAttributes = map;
        this.viewChangedListener = rumViewChangedListener;
        this.firstPartyHostHeaderTypeResolver = oneShotDisposable;
        this.cpuVitalMonitor = vitalMonitor;
        this.memoryVitalMonitor = vitalMonitor2;
        this.frameRateVitalMonitor = vitalMonitor3;
        this.featuresContextResolver = cueEncoder;
        this.f953type = i;
        this.trackFrustrations = z;
        this.sampleRate = f;
        this.interactionToNextViewMetricResolver = jWECryptoParts;
        this.networkSettledMetricResolver = networkSettledMetricResolver;
        this.slowFramesListener = defaultSlowFramesListener;
        this.viewEndedMetricDispatcher = zzmVar;
        this.accessibilitySnapshotManager = glideBuilder$1;
        this.batteryInfoProvider = infoProvider;
        this.displayInfoProvider = infoProvider2;
        this.insightsCollector = hurlStack;
        final int i2 = 0;
        this.url = StringsKt__StringsJVMKt.replace(rumScopeKey.url, '.', '/', false);
        this.viewAttributes = new LinkedHashMap(map);
        this.internalAttributes = new LinkedHashMap();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.memoizedParentAttributes = emptyMap;
        this.sessionId = rumScope.getRumContext().sessionId;
        String m = Boxes$$ExternalSyntheticOutline1.m();
        this.viewId = m;
        long j = time.nanoTime;
        this.startedNanos = j;
        this.stoppedNanos = j;
        long j2 = internalSdkCore.getTime().serverTimeOffsetMs;
        this.serverTimeOffsetInMs = j2;
        this.eventTimestamp = time.timestamp + j2;
        this.activeResourceScopes = new LinkedHashMap();
        this.version = 1L;
        this.customTimings = new LinkedHashMap();
        this.featureFlags = new LinkedHashMap();
        ?? r7 = new VitalListener() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$cpuVitalListener$1
            public double initialTickCount = Double.NaN;

            @Override // com.datadog.android.rum.internal.vitals.VitalListener
            public final void onVitalUpdate(VitalInfo vitalInfo) {
                boolean isNaN = Double.isNaN(this.initialTickCount);
                double d = vitalInfo.maxValue;
                if (isNaN) {
                    this.initialTickCount = d;
                    return;
                }
                Double valueOf = Double.valueOf(d - this.initialTickCount);
                RumViewScope rumViewScope = RumViewScope.this;
                rumViewScope.cpuTicks = valueOf;
                rumViewScope.insightsCollector.getClass();
            }
        };
        this.cpuVitalListener = r7;
        ?? r11 = new VitalListener(this) { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$memoryVitalListener$1
            public final /* synthetic */ RumViewScope this$0;

            {
                this.this$0 = this;
            }

            @Override // com.datadog.android.rum.internal.vitals.VitalListener
            public final void onVitalUpdate(VitalInfo vitalInfo) {
                int i3 = i2;
                RumViewScope rumViewScope = this.this$0;
                switch (i3) {
                    case 0:
                        rumViewScope.lastMemoryInfo = vitalInfo;
                        rumViewScope.insightsCollector.getClass();
                        break;
                    default:
                        rumViewScope.lastFrameRateInfo = vitalInfo;
                        break;
                }
            }
        };
        this.memoryVitalListener = r11;
        final int i3 = 1;
        ?? r12 = new VitalListener(this) { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$memoryVitalListener$1
            public final /* synthetic */ RumViewScope this$0;

            {
                this.this$0 = this;
            }

            @Override // com.datadog.android.rum.internal.vitals.VitalListener
            public final void onVitalUpdate(VitalInfo vitalInfo) {
                int i32 = i3;
                RumViewScope rumViewScope = this.this$0;
                switch (i32) {
                    case 0:
                        rumViewScope.lastMemoryInfo = vitalInfo;
                        rumViewScope.insightsCollector.getClass();
                        break;
                    default:
                        rumViewScope.lastFrameRateInfo = vitalInfo;
                        break;
                }
            }
        };
        this.frameRateVitalListener = r12;
        this.performanceMetrics = new LinkedHashMap();
        vitalMonitor.register(r7);
        vitalMonitor2.register(r11);
        vitalMonitor3.register(r12);
        RumContext rumContext = rumScope.getRumContext();
        if (rumContext.syntheticsTestId != null) {
            logSynthetics("_dd.application.id", rumContext.applicationId);
            logSynthetics("_dd.session.id", rumContext.sessionId);
            logSynthetics("_dd.view.id", m);
        }
        networkSettledMetricResolver.viewCreatedTimestamp = Long.valueOf(time.nanoTime);
        networkSettledMetricResolver.currentViewDiagnostic = new n(11);
        long j3 = time.nanoTime;
        if (((LastInteractionIdentifier) jWECryptoParts.iv) != null) {
            ((LinkedHashMap) jWECryptoParts.authenticationTag).put(m, Long.valueOf(j3));
            jWECryptoParts.purgeOldEntries();
        }
        if (defaultSlowFramesListener != null) {
            defaultSlowFramesListener.currentViewId = m;
            defaultSlowFramesListener.currentViewStartedTimestampNs = j;
            ((ConcurrentHashMap) defaultSlowFramesListener.metricDispatcher.mHalfExtent).putIfAbsent(m, new DefaultUISlownessMetricDispatcher$SlowFramesTelemetry());
        }
        rumScopeKey.url.getClass();
    }

    public static void logSynthetics(String str, String str2) {
        Log.i("DatadogSynthetics", str + "=" + str2);
    }

    public final void delegateEventToChildren(RumRawEvent rumRawEvent, DatadogContext datadogContext, Function1 function1, DataWriter dataWriter) {
        Iterator it = this.activeResourceScopes.entrySet().iterator();
        while (it.hasNext()) {
            if (((RumScope) ((Map.Entry) it.next()).getValue()).handleEvent(rumRawEvent, datadogContext, function1, dataWriter) == null) {
                if (rumRawEvent instanceof RumRawEvent.StopResourceWithError) {
                    this.pendingResourceCount--;
                    this.pendingErrorCount++;
                }
                it.remove();
            }
        }
        RumActionScope rumActionScope = this.activeActionScope;
        if (rumActionScope == null || rumActionScope.handleEvent(rumRawEvent, datadogContext, function1, dataWriter) != null) {
            return;
        }
        this.activeActionScope = null;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final Map getCustomAttributes() {
        boolean z = this.stopped;
        LinkedHashMap linkedHashMap = this.viewAttributes;
        return !z ? MapsKt__MapsKt.plus(this.parentScope.getCustomAttributes(), linkedHashMap) : MapsKt__MapsKt.plus(this.memoizedParentAttributes, linkedHashMap);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumScope getParentScope() {
        return this.parentScope;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumContext getRumContext() {
        RumContext rumContext = this.parentScope.getRumContext();
        String str = this.key.name;
        RumActionScope rumActionScope = this.activeActionScope;
        if (rumActionScope == null) {
            rumActionScope = null;
        }
        return RumContext.copy$default(rumContext, null, false, this.viewId, str, this.url, rumActionScope != null ? rumActionScope.actionId : null, 0, 0, this.f953type, null, null, this.eventTimestamp, this.serverTimeOffsetInMs, this.hasReplay, 3463);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x051c  */
    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RumScope handleEvent(RumRawEvent rumRawEvent, final DatadogContext datadogContext, Function1 function1, DataWriter dataWriter) {
        RumViewScope rumViewScope;
        InternalSdkCore internalSdkCore;
        SdkFeature feature;
        boolean z;
        final String str;
        String str2;
        boolean z2;
        boolean z3;
        Long l;
        long longValue;
        final RumViewScope rumViewScope2 = this;
        rumRawEvent.getClass();
        datadogContext.getClass();
        function1.getClass();
        dataWriter.getClass();
        if (rumRawEvent instanceof RumRawEvent.ResourceSent) {
            RumRawEvent.ResourceSent resourceSent = (RumRawEvent.ResourceSent) rumRawEvent;
            if (Intrinsics.areEqual(resourceSent.viewId, rumViewScope2.viewId)) {
                rumViewScope2.pendingResourceCount--;
                rumViewScope2.resourceCount++;
                NetworkSettledMetricResolver networkSettledMetricResolver = rumViewScope2.networkSettledMetricResolver;
                String str3 = resourceSent.resourceId;
                long j = resourceSent.resourceEndTimestampInNanos;
                str3.getClass();
                networkSettledMetricResolver.getClass();
                if (!networkSettledMetricResolver.viewWasStopped) {
                    Long l2 = networkSettledMetricResolver.viewCreatedTimestamp;
                    Long l3 = networkSettledMetricResolver.networkSettleMaxValue;
                    longValue = l3 != null ? l3.longValue() : 0L;
                    boolean remove = networkSettledMetricResolver.resourceStartedTimestamps.remove(str3);
                    if (l2 != null && remove) {
                        ((AtomicInteger) networkSettledMetricResolver.currentViewDiagnostic.c).incrementAndGet();
                        long longValue2 = j - l2.longValue();
                        if (longValue2 > longValue) {
                            networkSettledMetricResolver.networkSettleMaxValue = Long.valueOf(longValue2);
                        }
                    }
                }
                rumViewScope2.sendViewUpdate(resourceSent, datadogContext, function1, dataWriter, 1);
            }
        } else if (rumRawEvent instanceof RumRawEvent.ActionSent) {
            RumRawEvent.ActionSent actionSent = (RumRawEvent.ActionSent) rumRawEvent;
            if (Intrinsics.areEqual(actionSent.viewId, rumViewScope2.viewId)) {
                rumViewScope2.pendingActionCount--;
                rumViewScope2.actionCount++;
                rumViewScope2.frustrationCount += actionSent.frustrationCount;
                JWECryptoParts jWECryptoParts = rumViewScope2.interactionToNextViewMetricResolver;
                String str4 = actionSent.viewId;
                ActionEvent.ActionEventActionType actionEventActionType = actionSent.f949type;
                InternalInteractionContext internalInteractionContext = new InternalInteractionContext(str4, actionEventActionType, actionSent.eventEndTimestampInNanos);
                jWECryptoParts.getClass();
                if (((LastInteractionIdentifier) jWECryptoParts.iv) != null) {
                    ((ActionTypeInteractionValidator) jWECryptoParts.encryptedKey).getClass();
                    if (ActionTypeInteractionValidator.ALLOWED_TYPES.contains(actionEventActionType)) {
                        ((LinkedHashMap) jWECryptoParts.cipherText).put(str4, internalInteractionContext);
                    }
                    jWECryptoParts.purgeOldEntries();
                }
                rumViewScope2.sendViewUpdate(actionSent, datadogContext, function1, dataWriter, 1);
            }
        } else if (rumRawEvent instanceof RumRawEvent.ErrorSent) {
            RumRawEvent.ErrorSent errorSent = (RumRawEvent.ErrorSent) rumRawEvent;
            if (Intrinsics.areEqual(errorSent.viewId, rumViewScope2.viewId)) {
                rumViewScope2.pendingErrorCount--;
                rumViewScope2.errorCount++;
                String str5 = errorSent.resourceId;
                if (str5 != null && (l = errorSent.resourceEndTimestampInNanos) != null) {
                    NetworkSettledMetricResolver networkSettledMetricResolver2 = rumViewScope2.networkSettledMetricResolver;
                    long longValue3 = l.longValue();
                    networkSettledMetricResolver2.getClass();
                    if (!networkSettledMetricResolver2.viewWasStopped) {
                        Long l4 = networkSettledMetricResolver2.viewCreatedTimestamp;
                        Long l5 = networkSettledMetricResolver2.networkSettleMaxValue;
                        longValue = l5 != null ? l5.longValue() : 0L;
                        boolean remove2 = networkSettledMetricResolver2.resourceStartedTimestamps.remove(str5);
                        if (l4 != null && remove2) {
                            ((AtomicInteger) networkSettledMetricResolver2.currentViewDiagnostic.c).incrementAndGet();
                            long longValue4 = longValue3 - l4.longValue();
                            if (longValue4 > longValue) {
                                networkSettledMetricResolver2.networkSettleMaxValue = Long.valueOf(longValue4);
                            }
                        }
                    }
                }
                rumViewScope2.sendViewUpdate(errorSent, datadogContext, function1, dataWriter, 1);
            }
        } else if (rumRawEvent instanceof RumRawEvent.LongTaskSent) {
            RumRawEvent.LongTaskSent longTaskSent = (RumRawEvent.LongTaskSent) rumRawEvent;
            if (Intrinsics.areEqual(longTaskSent.viewId, rumViewScope2.viewId)) {
                rumViewScope2.pendingLongTaskCount--;
                rumViewScope2.longTaskCount++;
                if (longTaskSent.isFrozenFrame) {
                    rumViewScope2.frozenFrameCount++;
                }
                rumViewScope2.sendViewUpdate(longTaskSent, datadogContext, function1, dataWriter, 1);
            }
        } else if (rumRawEvent instanceof RumRawEvent.ResourceDropped) {
            RumRawEvent.ResourceDropped resourceDropped = (RumRawEvent.ResourceDropped) rumRawEvent;
            if (Intrinsics.areEqual(resourceDropped.viewId, rumViewScope2.viewId)) {
                NetworkSettledMetricResolver networkSettledMetricResolver3 = rumViewScope2.networkSettledMetricResolver;
                String str6 = resourceDropped.resourceId;
                networkSettledMetricResolver3.getClass();
                str6.getClass();
                if (!networkSettledMetricResolver3.viewWasStopped) {
                    ((AtomicInteger) networkSettledMetricResolver3.currentViewDiagnostic.d).incrementAndGet();
                    networkSettledMetricResolver3.resourceStartedTimestamps.remove(str6);
                }
                rumViewScope2.pendingResourceCount--;
            }
        } else if (rumRawEvent instanceof RumRawEvent.ActionDropped) {
            if (Intrinsics.areEqual(((RumRawEvent.ActionDropped) rumRawEvent).viewId, rumViewScope2.viewId)) {
                rumViewScope2.pendingActionCount--;
            }
        } else if (rumRawEvent instanceof RumRawEvent.ErrorDropped) {
            RumRawEvent.ErrorDropped errorDropped = (RumRawEvent.ErrorDropped) rumRawEvent;
            if (Intrinsics.areEqual(errorDropped.viewId, rumViewScope2.viewId)) {
                rumViewScope2.pendingErrorCount--;
                String str7 = errorDropped.resourceId;
                if (str7 != null) {
                    NetworkSettledMetricResolver networkSettledMetricResolver4 = rumViewScope2.networkSettledMetricResolver;
                    networkSettledMetricResolver4.getClass();
                    if (!networkSettledMetricResolver4.viewWasStopped) {
                        ((AtomicInteger) networkSettledMetricResolver4.currentViewDiagnostic.d).incrementAndGet();
                        networkSettledMetricResolver4.resourceStartedTimestamps.remove(str7);
                    }
                }
            }
        } else if (rumRawEvent instanceof RumRawEvent.LongTaskDropped) {
            RumRawEvent.LongTaskDropped longTaskDropped = (RumRawEvent.LongTaskDropped) rumRawEvent;
            if (Intrinsics.areEqual(longTaskDropped.viewId, rumViewScope2.viewId)) {
                rumViewScope2.pendingLongTaskCount--;
                boolean z4 = longTaskDropped.isFrozenFrame;
            }
        } else if (rumRawEvent instanceof RumRawEvent.StartView) {
            rumViewScope2.stopScope((RumRawEvent.StartView) rumRawEvent, datadogContext, function1, dataWriter, RumViewScope$stopScope$1.INSTANCE);
        } else if (rumRawEvent instanceof RumRawEvent.StopView) {
            final RumRawEvent.StopView stopView = (RumRawEvent.StopView) rumRawEvent;
            rumViewScope2.delegateEventToChildren(stopView, datadogContext, function1, dataWriter);
            if (Intrinsics.areEqual(stopView.key.id, rumViewScope2.key.id) && !rumViewScope2.stopped) {
                rumViewScope2.stopScope(stopView, datadogContext, function1, dataWriter, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStopView$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        RumViewScope rumViewScope3 = RumViewScope.this;
                        rumViewScope3.viewAttributes.putAll(stopView.attributes);
                        rumViewScope3.memoizedParentAttributes = MapsKt__MapsKt.toMap(rumViewScope3.parentScope.getCustomAttributes());
                        return Unit.INSTANCE;
                    }
                });
            }
        } else if (rumRawEvent instanceof RumRawEvent.StartAction) {
            final RumRawEvent.StartAction startAction = (RumRawEvent.StartAction) rumRawEvent;
            HurlStack hurlStack = rumViewScope2.insightsCollector;
            CueEncoder cueEncoder = rumViewScope2.featuresContextResolver;
            InternalSdkCore internalSdkCore2 = rumViewScope2.sdkCore;
            rumViewScope2.delegateEventToChildren(startAction, datadogContext, function1, dataWriter);
            if (!rumViewScope2.stopped) {
                if (rumViewScope2.activeActionScope == null) {
                    long j2 = rumViewScope2.serverTimeOffsetInMs;
                    boolean z5 = rumViewScope2.trackFrustrations;
                    float f = rumViewScope2.sampleRate;
                    internalSdkCore2.getClass();
                    cueEncoder.getClass();
                    hurlStack.getClass();
                    rumViewScope2 = this;
                    rumViewScope2.activeActionScope = new RumActionScope(this, internalSdkCore2, startAction.waitForStop, startAction.eventTime, startAction.f951type, startAction.name, startAction.attributes, j2, cueEncoder, z5, f, hurlStack);
                    rumViewScope2.pendingActionCount++;
                } else if (startAction.f951type != RumActionType.CUSTOM || startAction.waitForStop) {
                    DBUtil.log$default(internalSdkCore2.getInternalLogger(), 4, InternalLogger.Target.USER, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onStartAction$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Locale locale = Locale.US;
                            RumRawEvent.StartAction startAction2 = RumRawEvent.StartAction.this;
                            return String.format(locale, "RUM Action (%s on %s) was dropped, because another action is still active for the same view", Arrays.copyOf(new Object[]{startAction2.f951type, startAction2.name}, 2));
                        }
                    }, null, false, 56);
                } else {
                    long j3 = rumViewScope2.serverTimeOffsetInMs;
                    boolean z6 = rumViewScope2.trackFrustrations;
                    float f2 = rumViewScope2.sampleRate;
                    internalSdkCore2.getClass();
                    cueEncoder.getClass();
                    hurlStack.getClass();
                    RumActionScope rumActionScope = new RumActionScope(this, internalSdkCore2, startAction.waitForStop, startAction.eventTime, startAction.f951type, startAction.name, startAction.attributes, j3, cueEncoder, z6, f2, hurlStack);
                    rumViewScope2 = this;
                    rumViewScope2.pendingActionCount++;
                    rumActionScope.handleEvent(new RumRawEvent.SendCustomActionNow(), datadogContext, function1, dataWriter);
                }
            }
        } else if (rumRawEvent instanceof RumRawEvent.StartResource) {
            RumRawEvent.StartResource startResource = (RumRawEvent.StartResource) rumRawEvent;
            rumViewScope2.delegateEventToChildren(startResource, datadogContext, function1, dataWriter);
            if (!rumViewScope2.stopped) {
                LinkedHashMap linkedHashMap = rumViewScope2.activeResourceScopes;
                Object obj = startResource.key;
                InternalSdkCore internalSdkCore3 = rumViewScope2.sdkCore;
                OneShotDisposable oneShotDisposable = rumViewScope2.firstPartyHostHeaderTypeResolver;
                long j4 = rumViewScope2.serverTimeOffsetInMs;
                CueEncoder cueEncoder2 = rumViewScope2.featuresContextResolver;
                float f3 = rumViewScope2.sampleRate;
                NetworkSettledMetricResolver networkSettledMetricResolver5 = rumViewScope2.networkSettledMetricResolver;
                HurlStack hurlStack2 = rumViewScope2.insightsCollector;
                internalSdkCore3.getClass();
                oneShotDisposable.getClass();
                cueEncoder2.getClass();
                networkSettledMetricResolver5.getClass();
                hurlStack2.getClass();
                rumViewScope2 = this;
                linkedHashMap.put(obj, new RumResourceScope(this, internalSdkCore3, startResource.url, startResource.method, startResource.key, startResource.eventTime, startResource.attributes, j4, oneShotDisposable, cueEncoder2, f3, networkSettledMetricResolver5, hurlStack2));
                rumViewScope2.pendingResourceCount++;
            }
        } else if (rumRawEvent instanceof RumRawEvent.AddError) {
            final RumRawEvent.AddError addError = (RumRawEvent.AddError) rumRawEvent;
            rumViewScope2.delegateEventToChildren(addError, datadogContext, function1, dataWriter);
            if (!rumViewScope2.stopped) {
                final RumContext rumContext = rumViewScope2.getRumContext();
                final LinkedHashMap linkedHashMap2 = new LinkedHashMap(rumViewScope2.getCustomAttributes());
                Map map = addError.attributes;
                Throwable th = addError.throwable;
                String str8 = addError.message;
                linkedHashMap2.putAll(map);
                Object remove3 = linkedHashMap2.remove("_dd.error.is_crash");
                final boolean z7 = Intrinsics.areEqual(remove3 instanceof Boolean ? (Boolean) remove3 : null, Boolean.TRUE) || addError.isFatal;
                Object remove4 = linkedHashMap2.remove("_dd.error.fingerprint");
                String str9 = remove4 instanceof String ? (String) remove4 : null;
                if (rumViewScope2.crashCount <= 0 || !z7) {
                    String str10 = addError.f950type;
                    if (str10 == null) {
                        if (th != null) {
                            str10 = th.getClass().getCanonicalName();
                        } else {
                            str = null;
                            if (th != null || (str2 = th.getMessage()) == null) {
                                str2 = "";
                            }
                            if (!StringsKt.isBlank(str2) && !Intrinsics.areEqual(str8, str2)) {
                                str8 = Recorder$$ExternalSyntheticOutline2.m(str8, ": ", str2);
                            }
                            final LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(rumViewScope2.featureFlags);
                            int i = !z7 ? 2 : 1;
                            final BatteryInfo batteryInfo = (BatteryInfo) rumViewScope2.batteryInfoProvider.getState();
                            final DisplayInfo displayInfo = (DisplayInfo) rumViewScope2.displayInfoProvider.getState();
                            if (!rumViewScope2.hasReplay) {
                                CueEncoder cueEncoder3 = rumViewScope2.featuresContextResolver;
                                String str11 = rumContext.viewId;
                                if (str11 == null) {
                                    str11 = "";
                                }
                                cueEncoder3.getClass();
                                if (!CueEncoder.resolveViewHasReplay(datadogContext, str11)) {
                                    z2 = false;
                                    rumViewScope2.hasReplay = z2;
                                    InternalSdkCore internalSdkCore4 = rumViewScope2.sdkCore;
                                    final String str12 = str8;
                                    final String str13 = str9;
                                    Function0 function0 = new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i2;
                                            int i3;
                                            int i4;
                                            int i5;
                                            int i6;
                                            int i7;
                                            DatadogContext datadogContext2 = DatadogContext.this;
                                            UserInfo userInfo = datadogContext2.userInfo;
                                            DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                                            RumContext rumContext2 = rumContext;
                                            String str14 = rumContext2.syntheticsResultId;
                                            String str15 = rumContext2.syntheticsTestId;
                                            ErrorEvent.Synthetics synthetics = (str15 == null || StringsKt.isBlank(str15) || str14 == null || StringsKt.isBlank(str14)) ? null : new ErrorEvent.Synthetics(str15, str14, null);
                                            int i8 = synthetics == null ? 1 : 2;
                                            String str16 = datadogContext2.appBuildId;
                                            RumRawEvent.AddError addError2 = addError;
                                            Time time = addError2.eventTime;
                                            Throwable th2 = addError2.throwable;
                                            String str17 = addError2.stacktrace;
                                            long j5 = time.timestamp;
                                            RumViewScope rumViewScope3 = this;
                                            int i9 = i8;
                                            long j6 = j5 + rumViewScope3.serverTimeOffsetInMs;
                                            ErrorEvent.Context context = new ErrorEvent.Context(mutableMap);
                                            String uuid = UUID.randomUUID().toString();
                                            int schemaSource = zzhy.toSchemaSource(addError2.source);
                                            String loggableStackTrace = str17 == null ? th2 != null ? MapUtilsKt.loggableStackTrace(th2) : null : str17;
                                            int i10 = addError2.sourceType;
                                            if (i10 == 0) {
                                                throw null;
                                            }
                                            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i10);
                                            if (ordinal != 0) {
                                                if (ordinal != 1) {
                                                    if (ordinal != 2) {
                                                        i6 = 5;
                                                        if (ordinal != 3) {
                                                            if (ordinal == 4) {
                                                                i7 = 7;
                                                            } else {
                                                                if (ordinal != 5) {
                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                    return null;
                                                                }
                                                                i7 = 9;
                                                            }
                                                        }
                                                    } else {
                                                        i7 = 4;
                                                    }
                                                    i2 = i7;
                                                } else {
                                                    i6 = 2;
                                                }
                                                i2 = i6;
                                            } else {
                                                i2 = 1;
                                            }
                                            if (th2 != null) {
                                                if (th2 instanceof ANRException) {
                                                    i3 = 1;
                                                }
                                                i3 = 3;
                                            } else {
                                                if (str17 == null) {
                                                    i3 = 0;
                                                }
                                                i3 = 3;
                                            }
                                            List list = addError2.threads;
                                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                ThreadDump threadDump = (ThreadDump) it.next();
                                                arrayList.add(new ErrorEvent.Thread(threadDump.name, threadDump.crashed, threadDump.stack, threadDump.state));
                                                it = it;
                                                context = context;
                                            }
                                            ErrorEvent.Context context2 = context;
                                            ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                                            Long l6 = addError2.timeSinceAppStartNs;
                                            ErrorEvent.Error error = new ErrorEvent.Error(uuid, str12, schemaSource, loggableStackTrace, Boolean.valueOf(z7), str13, str, i3, i2, null, arrayList2, l6 != null ? Long.valueOf(l6.longValue() / 1000000) : null, 251408);
                                            String str18 = rumContext2.actionId;
                                            ErrorEvent.Action action = str18 != null ? new ErrorEvent.Action(CollectionsKt__CollectionsJVMKt.listOf(str18)) : null;
                                            String str19 = rumContext2.viewId;
                                            String str20 = str19 == null ? "" : str19;
                                            String str21 = rumContext2.viewName;
                                            String str22 = rumContext2.viewUrl;
                                            ErrorEvent.ErrorEventView errorEventView = new ErrorEvent.ErrorEventView(str20, 18, (String) null, str22 == null ? "" : str22, str21);
                                            ErrorEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ErrorEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                                            ErrorEvent.Connectivity errorConnectivity = zzhy.toErrorConnectivity(datadogContext2.networkInfo);
                                            ErrorEvent.Application application = new ErrorEvent.Application(rumContext2.applicationId, deviceInfo.localeInfo.currentLocale);
                                            ErrorEvent.ErrorEventSession errorEventSession = new ErrorEvent.ErrorEventSession(i9, Boolean.valueOf(rumViewScope3.hasReplay), rumContext2.sessionId);
                                            String str23 = datadogContext2.source;
                                            InternalLogger internalLogger = rumViewScope3.sdkCore.getInternalLogger();
                                            str23.getClass();
                                            internalLogger.getClass();
                                            try {
                                            } catch (NoSuchElementException e) {
                                                DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str23, 26), e, false, 48);
                                                i4 = 0;
                                            }
                                            for (int i11 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                                                if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$12(i11).equals(str23)) {
                                                    i4 = i11;
                                                    ErrorEvent.Os os = new ErrorEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                                    int errorSchemaType = zzhy.toErrorSchemaType(deviceInfo.deviceType);
                                                    String str24 = deviceInfo.deviceName;
                                                    String str25 = deviceInfo.deviceModel;
                                                    String str26 = deviceInfo.deviceBrand;
                                                    String str27 = deviceInfo.architecture;
                                                    LocaleInfo localeInfo = deviceInfo.localeInfo;
                                                    List list2 = localeInfo.locales;
                                                    String str28 = localeInfo.timeZone;
                                                    BatteryInfo batteryInfo2 = batteryInfo;
                                                    return new ErrorEvent(j6, application, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), str16, RumTagsUtilsKt.buildDDTagsString(datadogContext2), errorEventSession, i4, errorEventView, usr, null, errorConnectivity, synthetics, os, new ErrorEvent.Device(errorSchemaType, str24, str25, str26, str27, list2, str28, batteryInfo2.batteryLevel, batteryInfo2.lowPowerMode, displayInfo.screenBrightness, 32), new ErrorEvent.Dd(new ErrorEvent.DdSession(zzhy.toErrorSessionPrecondition(rumContext2.sessionStartReason), 1), new ErrorEvent.Configuration(Float.valueOf(rumViewScope3.sampleRate), null, null), null, null), new ErrorEvent.Context(linkedHashMap2), action, error, context2, 10526720);
                                                }
                                            }
                                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                                        }
                                    };
                                    z3 = z7;
                                    int i2 = i;
                                    WriteOperation newRumEventWriteOperation = SdkCoreExtKt.newRumEventWriteOperation(internalSdkCore4, datadogContext, function1, dataWriter, i2, function0);
                                    if (!z3) {
                                        newRumEventWriteOperation.onError = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$2$1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj2;
                                                advancedRumMonitor.getClass();
                                                String str14 = RumContext.this.viewId;
                                                if (str14 == null) {
                                                    str14 = "";
                                                }
                                                advancedRumMonitor.eventDropped(str14, new StorageEvent.Error(null, null));
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        newRumEventWriteOperation.onSuccess = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$2$2
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj2) {
                                                AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj2;
                                                advancedRumMonitor.getClass();
                                                String str14 = RumContext.this.viewId;
                                                if (str14 == null) {
                                                    str14 = "";
                                                }
                                                advancedRumMonitor.eventSent(str14, new StorageEvent.Error(null, null));
                                                return Unit.INSTANCE;
                                            }
                                        };
                                    }
                                    newRumEventWriteOperation.submit();
                                    if (z3) {
                                        this.errorCount++;
                                        this.crashCount++;
                                        rumViewScope2 = this;
                                        rumViewScope2.sendViewUpdate(addError, datadogContext, function1, dataWriter, i2);
                                    } else {
                                        rumViewScope2 = this;
                                        rumViewScope2.pendingErrorCount++;
                                    }
                                }
                            }
                            z2 = true;
                            rumViewScope2.hasReplay = z2;
                            InternalSdkCore internalSdkCore42 = rumViewScope2.sdkCore;
                            final String str122 = str8;
                            final String str132 = str9;
                            Function0 function02 = new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i22;
                                    int i3;
                                    int i4;
                                    int i5;
                                    int i6;
                                    int i7;
                                    DatadogContext datadogContext2 = DatadogContext.this;
                                    UserInfo userInfo = datadogContext2.userInfo;
                                    DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                                    RumContext rumContext2 = rumContext;
                                    String str14 = rumContext2.syntheticsResultId;
                                    String str15 = rumContext2.syntheticsTestId;
                                    ErrorEvent.Synthetics synthetics = (str15 == null || StringsKt.isBlank(str15) || str14 == null || StringsKt.isBlank(str14)) ? null : new ErrorEvent.Synthetics(str15, str14, null);
                                    int i8 = synthetics == null ? 1 : 2;
                                    String str16 = datadogContext2.appBuildId;
                                    RumRawEvent.AddError addError2 = addError;
                                    Time time = addError2.eventTime;
                                    Throwable th2 = addError2.throwable;
                                    String str17 = addError2.stacktrace;
                                    long j5 = time.timestamp;
                                    RumViewScope rumViewScope3 = this;
                                    int i9 = i8;
                                    long j6 = j5 + rumViewScope3.serverTimeOffsetInMs;
                                    ErrorEvent.Context context = new ErrorEvent.Context(mutableMap);
                                    String uuid = UUID.randomUUID().toString();
                                    int schemaSource = zzhy.toSchemaSource(addError2.source);
                                    String loggableStackTrace = str17 == null ? th2 != null ? MapUtilsKt.loggableStackTrace(th2) : null : str17;
                                    int i10 = addError2.sourceType;
                                    if (i10 == 0) {
                                        throw null;
                                    }
                                    int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i10);
                                    if (ordinal != 0) {
                                        if (ordinal != 1) {
                                            if (ordinal != 2) {
                                                i6 = 5;
                                                if (ordinal != 3) {
                                                    if (ordinal == 4) {
                                                        i7 = 7;
                                                    } else {
                                                        if (ordinal != 5) {
                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                            return null;
                                                        }
                                                        i7 = 9;
                                                    }
                                                }
                                            } else {
                                                i7 = 4;
                                            }
                                            i22 = i7;
                                        } else {
                                            i6 = 2;
                                        }
                                        i22 = i6;
                                    } else {
                                        i22 = 1;
                                    }
                                    if (th2 != null) {
                                        if (th2 instanceof ANRException) {
                                            i3 = 1;
                                        }
                                        i3 = 3;
                                    } else {
                                        if (str17 == null) {
                                            i3 = 0;
                                        }
                                        i3 = 3;
                                    }
                                    List list = addError2.threads;
                                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        ThreadDump threadDump = (ThreadDump) it.next();
                                        arrayList.add(new ErrorEvent.Thread(threadDump.name, threadDump.crashed, threadDump.stack, threadDump.state));
                                        it = it;
                                        context = context;
                                    }
                                    ErrorEvent.Context context2 = context;
                                    ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                                    Long l6 = addError2.timeSinceAppStartNs;
                                    ErrorEvent.Error error = new ErrorEvent.Error(uuid, str122, schemaSource, loggableStackTrace, Boolean.valueOf(z7), str132, str, i3, i22, null, arrayList2, l6 != null ? Long.valueOf(l6.longValue() / 1000000) : null, 251408);
                                    String str18 = rumContext2.actionId;
                                    ErrorEvent.Action action = str18 != null ? new ErrorEvent.Action(CollectionsKt__CollectionsJVMKt.listOf(str18)) : null;
                                    String str19 = rumContext2.viewId;
                                    String str20 = str19 == null ? "" : str19;
                                    String str21 = rumContext2.viewName;
                                    String str22 = rumContext2.viewUrl;
                                    ErrorEvent.ErrorEventView errorEventView = new ErrorEvent.ErrorEventView(str20, 18, (String) null, str22 == null ? "" : str22, str21);
                                    ErrorEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ErrorEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                                    ErrorEvent.Connectivity errorConnectivity = zzhy.toErrorConnectivity(datadogContext2.networkInfo);
                                    ErrorEvent.Application application = new ErrorEvent.Application(rumContext2.applicationId, deviceInfo.localeInfo.currentLocale);
                                    ErrorEvent.ErrorEventSession errorEventSession = new ErrorEvent.ErrorEventSession(i9, Boolean.valueOf(rumViewScope3.hasReplay), rumContext2.sessionId);
                                    String str23 = datadogContext2.source;
                                    InternalLogger internalLogger = rumViewScope3.sdkCore.getInternalLogger();
                                    str23.getClass();
                                    internalLogger.getClass();
                                    try {
                                    } catch (NoSuchElementException e) {
                                        DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str23, 26), e, false, 48);
                                        i4 = 0;
                                    }
                                    for (int i11 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                                        if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$12(i11).equals(str23)) {
                                            i4 = i11;
                                            ErrorEvent.Os os = new ErrorEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                            int errorSchemaType = zzhy.toErrorSchemaType(deviceInfo.deviceType);
                                            String str24 = deviceInfo.deviceName;
                                            String str25 = deviceInfo.deviceModel;
                                            String str26 = deviceInfo.deviceBrand;
                                            String str27 = deviceInfo.architecture;
                                            LocaleInfo localeInfo = deviceInfo.localeInfo;
                                            List list2 = localeInfo.locales;
                                            String str28 = localeInfo.timeZone;
                                            BatteryInfo batteryInfo2 = batteryInfo;
                                            return new ErrorEvent(j6, application, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), str16, RumTagsUtilsKt.buildDDTagsString(datadogContext2), errorEventSession, i4, errorEventView, usr, null, errorConnectivity, synthetics, os, new ErrorEvent.Device(errorSchemaType, str24, str25, str26, str27, list2, str28, batteryInfo2.batteryLevel, batteryInfo2.lowPowerMode, displayInfo.screenBrightness, 32), new ErrorEvent.Dd(new ErrorEvent.DdSession(zzhy.toErrorSessionPrecondition(rumContext2.sessionStartReason), 1), new ErrorEvent.Configuration(Float.valueOf(rumViewScope3.sampleRate), null, null), null, null), new ErrorEvent.Context(linkedHashMap2), action, error, context2, 10526720);
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                            };
                            z3 = z7;
                            int i22 = i;
                            WriteOperation newRumEventWriteOperation2 = SdkCoreExtKt.newRumEventWriteOperation(internalSdkCore42, datadogContext, function1, dataWriter, i22, function02);
                            if (!z3) {
                            }
                            newRumEventWriteOperation2.submit();
                            if (z3) {
                            }
                        }
                    }
                    str = str10;
                    if (th != null) {
                    }
                    str2 = "";
                    if (!StringsKt.isBlank(str2)) {
                        str8 = Recorder$$ExternalSyntheticOutline2.m(str8, ": ", str2);
                    }
                    final LinkedHashMap mutableMap2 = MapsKt__MapsKt.toMutableMap(rumViewScope2.featureFlags);
                    if (!z7) {
                    }
                    final BatteryInfo batteryInfo2 = (BatteryInfo) rumViewScope2.batteryInfoProvider.getState();
                    final DisplayInfo displayInfo2 = (DisplayInfo) rumViewScope2.displayInfoProvider.getState();
                    if (!rumViewScope2.hasReplay) {
                    }
                    z2 = true;
                    rumViewScope2.hasReplay = z2;
                    InternalSdkCore internalSdkCore422 = rumViewScope2.sdkCore;
                    final String str1222 = str8;
                    final String str1322 = str9;
                    Function0 function022 = new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddError$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i222;
                            int i3;
                            int i4;
                            int i5;
                            int i6;
                            int i7;
                            DatadogContext datadogContext2 = DatadogContext.this;
                            UserInfo userInfo = datadogContext2.userInfo;
                            DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                            RumContext rumContext2 = rumContext;
                            String str14 = rumContext2.syntheticsResultId;
                            String str15 = rumContext2.syntheticsTestId;
                            ErrorEvent.Synthetics synthetics = (str15 == null || StringsKt.isBlank(str15) || str14 == null || StringsKt.isBlank(str14)) ? null : new ErrorEvent.Synthetics(str15, str14, null);
                            int i8 = synthetics == null ? 1 : 2;
                            String str16 = datadogContext2.appBuildId;
                            RumRawEvent.AddError addError2 = addError;
                            Time time = addError2.eventTime;
                            Throwable th2 = addError2.throwable;
                            String str17 = addError2.stacktrace;
                            long j5 = time.timestamp;
                            RumViewScope rumViewScope3 = this;
                            int i9 = i8;
                            long j6 = j5 + rumViewScope3.serverTimeOffsetInMs;
                            ErrorEvent.Context context = new ErrorEvent.Context(mutableMap2);
                            String uuid = UUID.randomUUID().toString();
                            int schemaSource = zzhy.toSchemaSource(addError2.source);
                            String loggableStackTrace = str17 == null ? th2 != null ? MapUtilsKt.loggableStackTrace(th2) : null : str17;
                            int i10 = addError2.sourceType;
                            if (i10 == 0) {
                                throw null;
                            }
                            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i10);
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        i6 = 5;
                                        if (ordinal != 3) {
                                            if (ordinal == 4) {
                                                i7 = 7;
                                            } else {
                                                if (ordinal != 5) {
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                                }
                                                i7 = 9;
                                            }
                                        }
                                    } else {
                                        i7 = 4;
                                    }
                                    i222 = i7;
                                } else {
                                    i6 = 2;
                                }
                                i222 = i6;
                            } else {
                                i222 = 1;
                            }
                            if (th2 != null) {
                                if (th2 instanceof ANRException) {
                                    i3 = 1;
                                }
                                i3 = 3;
                            } else {
                                if (str17 == null) {
                                    i3 = 0;
                                }
                                i3 = 3;
                            }
                            List list = addError2.threads;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ThreadDump threadDump = (ThreadDump) it.next();
                                arrayList.add(new ErrorEvent.Thread(threadDump.name, threadDump.crashed, threadDump.stack, threadDump.state));
                                it = it;
                                context = context;
                            }
                            ErrorEvent.Context context2 = context;
                            ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                            Long l6 = addError2.timeSinceAppStartNs;
                            ErrorEvent.Error error = new ErrorEvent.Error(uuid, str1222, schemaSource, loggableStackTrace, Boolean.valueOf(z7), str1322, str, i3, i222, null, arrayList2, l6 != null ? Long.valueOf(l6.longValue() / 1000000) : null, 251408);
                            String str18 = rumContext2.actionId;
                            ErrorEvent.Action action = str18 != null ? new ErrorEvent.Action(CollectionsKt__CollectionsJVMKt.listOf(str18)) : null;
                            String str19 = rumContext2.viewId;
                            String str20 = str19 == null ? "" : str19;
                            String str21 = rumContext2.viewName;
                            String str22 = rumContext2.viewUrl;
                            ErrorEvent.ErrorEventView errorEventView = new ErrorEvent.ErrorEventView(str20, 18, (String) null, str22 == null ? "" : str22, str21);
                            ErrorEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ErrorEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                            ErrorEvent.Connectivity errorConnectivity = zzhy.toErrorConnectivity(datadogContext2.networkInfo);
                            ErrorEvent.Application application = new ErrorEvent.Application(rumContext2.applicationId, deviceInfo.localeInfo.currentLocale);
                            ErrorEvent.ErrorEventSession errorEventSession = new ErrorEvent.ErrorEventSession(i9, Boolean.valueOf(rumViewScope3.hasReplay), rumContext2.sessionId);
                            String str23 = datadogContext2.source;
                            InternalLogger internalLogger = rumViewScope3.sdkCore.getInternalLogger();
                            str23.getClass();
                            internalLogger.getClass();
                            try {
                            } catch (NoSuchElementException e) {
                                DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str23, 26), e, false, 48);
                                i4 = 0;
                            }
                            for (int i11 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                                if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$12(i11).equals(str23)) {
                                    i4 = i11;
                                    ErrorEvent.Os os = new ErrorEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                    int errorSchemaType = zzhy.toErrorSchemaType(deviceInfo.deviceType);
                                    String str24 = deviceInfo.deviceName;
                                    String str25 = deviceInfo.deviceModel;
                                    String str26 = deviceInfo.deviceBrand;
                                    String str27 = deviceInfo.architecture;
                                    LocaleInfo localeInfo = deviceInfo.localeInfo;
                                    List list2 = localeInfo.locales;
                                    String str28 = localeInfo.timeZone;
                                    BatteryInfo batteryInfo22 = batteryInfo2;
                                    return new ErrorEvent(j6, application, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), str16, RumTagsUtilsKt.buildDDTagsString(datadogContext2), errorEventSession, i4, errorEventView, usr, null, errorConnectivity, synthetics, os, new ErrorEvent.Device(errorSchemaType, str24, str25, str26, str27, list2, str28, batteryInfo22.batteryLevel, batteryInfo22.lowPowerMode, displayInfo2.screenBrightness, 32), new ErrorEvent.Dd(new ErrorEvent.DdSession(zzhy.toErrorSessionPrecondition(rumContext2.sessionStartReason), 1), new ErrorEvent.Configuration(Float.valueOf(rumViewScope3.sampleRate), null, null), null, null), new ErrorEvent.Context(linkedHashMap2), action, error, context2, 10526720);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    };
                    z3 = z7;
                    int i222 = i;
                    WriteOperation newRumEventWriteOperation22 = SdkCoreExtKt.newRumEventWriteOperation(internalSdkCore422, datadogContext, function1, dataWriter, i222, function022);
                    if (!z3) {
                    }
                    newRumEventWriteOperation22.submit();
                    if (z3) {
                    }
                }
            }
        } else {
            if (rumRawEvent instanceof RumRawEvent.AddLongTask) {
                final RumRawEvent.AddLongTask addLongTask = (RumRawEvent.AddLongTask) rumRawEvent;
                rumViewScope2.delegateEventToChildren(addLongTask, datadogContext, function1, dataWriter);
                if (rumViewScope2.stopped) {
                    rumViewScope = rumViewScope2;
                } else {
                    HurlStack hurlStack3 = rumViewScope2.insightsCollector;
                    long j5 = addLongTask.eventTime.nanoTime;
                    hurlStack3.getClass();
                    final RumContext rumContext2 = rumViewScope2.getRumContext();
                    final LinkedHashMap linkedHashMap3 = new LinkedHashMap(rumViewScope2.getCustomAttributes());
                    linkedHashMap3.put("long_task.target", addLongTask.target);
                    final long j6 = addLongTask.eventTime.timestamp + rumViewScope2.serverTimeOffsetInMs;
                    long j7 = addLongTask.durationNs;
                    final boolean z8 = j7 > 700000000;
                    DefaultSlowFramesListener defaultSlowFramesListener = rumViewScope2.slowFramesListener;
                    if (defaultSlowFramesListener != null) {
                        String str14 = defaultSlowFramesListener.currentViewId;
                        if (j7 >= 5000000000L && str14 != null) {
                            ViewUIPerformanceReport viewPerformanceReport = defaultSlowFramesListener.getViewPerformanceReport(str14);
                            synchronized (viewPerformanceReport) {
                                viewPerformanceReport.freezeFramesDuration += j7;
                            }
                        }
                    }
                    if (!rumViewScope2.hasReplay) {
                        CueEncoder cueEncoder4 = rumViewScope2.featuresContextResolver;
                        String str15 = rumContext2.viewId;
                        if (str15 == null) {
                            str15 = "";
                        }
                        cueEncoder4.getClass();
                        if (!CueEncoder.resolveViewHasReplay(datadogContext, str15)) {
                            z = false;
                            rumViewScope2.hasReplay = z;
                            InternalSdkCore internalSdkCore5 = rumViewScope2.sdkCore;
                            Function0 function03 = new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r5v10 */
                                /* JADX WARN: Type inference failed for: r5v11 */
                                /* JADX WARN: Type inference failed for: r5v12 */
                                /* JADX WARN: Type inference failed for: r5v13 */
                                /* JADX WARN: Type inference failed for: r5v14 */
                                /* JADX WARN: Type inference failed for: r5v15, types: [com.datadog.android.rum.model.LongTaskEvent$Plan, java.lang.Number] */
                                /* JADX WARN: Type inference failed for: r5v16 */
                                /* JADX WARN: Type inference failed for: r5v9 */
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    List list;
                                    int i3;
                                    int i4;
                                    ?? r5;
                                    int[] values;
                                    int length;
                                    int i5;
                                    DatadogContext datadogContext2 = DatadogContext.this;
                                    UserInfo userInfo = datadogContext2.userInfo;
                                    DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                                    RumContext rumContext3 = rumContext2;
                                    String str16 = rumContext3.syntheticsResultId;
                                    String str17 = rumContext3.syntheticsTestId;
                                    LongTaskEvent.Synthetics synthetics = (str17 == null || StringsKt.isBlank(str17) || str16 == null || StringsKt.isBlank(str16)) ? null : new LongTaskEvent.Synthetics(str17, str16, null);
                                    int i6 = synthetics == null ? 1 : 2;
                                    RumRawEvent.AddLongTask addLongTask2 = addLongTask;
                                    long j8 = j6 - (addLongTask2.durationNs / 1000000);
                                    LongTaskEvent.LongTask longTask = new LongTaskEvent.LongTask(UUID.randomUUID().toString(), null, 0, addLongTask2.durationNs, null, null, null, null, Boolean.valueOf(z8), null);
                                    String str18 = rumContext3.actionId;
                                    LongTaskEvent.Action action = str18 != null ? new LongTaskEvent.Action(CollectionsKt__CollectionsJVMKt.listOf(str18)) : null;
                                    String str19 = rumContext3.viewId;
                                    if (str19 == null) {
                                        str19 = "";
                                    }
                                    String str20 = rumContext3.viewName;
                                    String str21 = rumContext3.viewUrl;
                                    LongTaskEvent.LongTaskEventView longTaskEventView = new LongTaskEvent.LongTaskEventView(str19, null, str21 != null ? str21 : "", str20);
                                    LongTaskEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new LongTaskEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                                    NetworkInfo networkInfo = datadogContext2.networkInfo;
                                    networkInfo.getClass();
                                    boolean isConnected = zzhy.isConnected(networkInfo);
                                    String str22 = networkInfo.carrierName;
                                    int i7 = isConnected ? 1 : 2;
                                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                        case 0:
                                            list = EmptyList.INSTANCE;
                                            break;
                                        case 1:
                                            list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.ETHERNET);
                                            break;
                                        case 2:
                                            list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.WIFI);
                                            break;
                                        case 3:
                                            list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.WIMAX);
                                            break;
                                        case 4:
                                            list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.BLUETOOTH);
                                            break;
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 9:
                                        case 10:
                                            list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.CELLULAR);
                                            break;
                                        case 11:
                                            list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.OTHER);
                                            break;
                                        default:
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                    }
                                    String str23 = networkInfo.cellularTechnology;
                                    LongTaskEvent.Connectivity connectivity = new LongTaskEvent.Connectivity(i7, list, 0, (str23 == null && str22 == null) ? null : new LongTaskEvent.Cellular(str23, str22));
                                    LongTaskEvent.Application application = new LongTaskEvent.Application(rumContext3.applicationId, null);
                                    String str24 = rumContext3.sessionId;
                                    RumViewScope rumViewScope3 = this;
                                    LongTaskEvent.LongTaskEventSession longTaskEventSession = new LongTaskEvent.LongTaskEventSession(i6, Boolean.valueOf(rumViewScope3.hasReplay), str24);
                                    String str25 = datadogContext2.source;
                                    InternalLogger internalLogger = rumViewScope3.sdkCore.getInternalLogger();
                                    str25.getClass();
                                    internalLogger.getClass();
                                    try {
                                        values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                        length = values.length;
                                        i5 = 0;
                                    } catch (NoSuchElementException e) {
                                        DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str25, 25), e, false, 48);
                                        i3 = 0;
                                    }
                                    while (i5 < length) {
                                        i3 = values[i5];
                                        int[] iArr = values;
                                        if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$9(i3).equals(str25)) {
                                            LongTaskEvent.Os os = new LongTaskEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                            DeviceType deviceType = deviceInfo.deviceType;
                                            deviceType.getClass();
                                            int i8 = 5;
                                            switch (deviceType.ordinal()) {
                                                case 0:
                                                    i4 = 1;
                                                    break;
                                                case 1:
                                                    i4 = 3;
                                                    break;
                                                case 2:
                                                    i4 = 4;
                                                    break;
                                                case 3:
                                                    i4 = 2;
                                                    break;
                                                case 4:
                                                    i4 = 5;
                                                    break;
                                                case 5:
                                                    i4 = 6;
                                                    break;
                                                case 6:
                                                    i4 = 7;
                                                    break;
                                                default:
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                            }
                                            LongTaskEvent.Device device = new LongTaskEvent.Device(i4, deviceInfo.deviceName, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture, null, null, null, null, null, null);
                                            LongTaskEvent.Context context = new LongTaskEvent.Context(linkedHashMap3);
                                            int i9 = rumContext3.sessionStartReason;
                                            if (i9 == 0) {
                                                throw null;
                                            }
                                            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i9)) {
                                                case 0:
                                                    r5 = 0;
                                                    i8 = 1;
                                                    break;
                                                case 1:
                                                    r5 = 0;
                                                    i8 = 2;
                                                    break;
                                                case 2:
                                                    r5 = 0;
                                                    i8 = 3;
                                                    break;
                                                case 3:
                                                    r5 = 0;
                                                    i8 = 4;
                                                    break;
                                                case 4:
                                                    r5 = 0;
                                                    break;
                                                case 5:
                                                    r5 = 0;
                                                    i8 = 6;
                                                    break;
                                                case 6:
                                                    r5 = 0;
                                                    i8 = 7;
                                                    break;
                                                default:
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return null;
                                            }
                                            return new LongTaskEvent(j8, application, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), datadogContext2.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext2), longTaskEventSession, i3, longTaskEventView, usr, null, connectivity, null, synthetics, null, os, device, new LongTaskEvent.Dd(new LongTaskEvent.DdSession(r5, i8), new LongTaskEvent.Configuration(Float.valueOf(rumViewScope3.sampleRate), r5, r5), null, null, null, null), context, action, null, longTask);
                                        }
                                        i5++;
                                        values = iArr;
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                }
                            };
                            rumViewScope = this;
                            boolean z9 = z8;
                            WriteOperation newRumEventWriteOperation3 = SdkCoreExtKt.newRumEventWriteOperation(internalSdkCore5, datadogContext, function1, dataWriter, 1, function03);
                            final StorageEvent storageEvent = !z9 ? StorageEvent.FrozenFrame.INSTANCE : StorageEvent.LongTask.INSTANCE;
                            newRumEventWriteOperation3.onError = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj2;
                                    advancedRumMonitor.getClass();
                                    String str16 = RumContext.this.viewId;
                                    if (str16 == null) {
                                        str16 = "";
                                    }
                                    advancedRumMonitor.eventDropped(str16, storageEvent);
                                    return Unit.INSTANCE;
                                }
                            };
                            newRumEventWriteOperation3.onSuccess = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj2;
                                    advancedRumMonitor.getClass();
                                    String str16 = RumContext.this.viewId;
                                    if (str16 == null) {
                                        str16 = "";
                                    }
                                    advancedRumMonitor.eventSent(str16, storageEvent);
                                    return Unit.INSTANCE;
                                }
                            };
                            newRumEventWriteOperation3.submit();
                            rumViewScope.pendingLongTaskCount++;
                        }
                    }
                    z = true;
                    rumViewScope2.hasReplay = z;
                    InternalSdkCore internalSdkCore52 = rumViewScope2.sdkCore;
                    Function0 function032 = new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r5v10 */
                        /* JADX WARN: Type inference failed for: r5v11 */
                        /* JADX WARN: Type inference failed for: r5v12 */
                        /* JADX WARN: Type inference failed for: r5v13 */
                        /* JADX WARN: Type inference failed for: r5v14 */
                        /* JADX WARN: Type inference failed for: r5v15, types: [com.datadog.android.rum.model.LongTaskEvent$Plan, java.lang.Number] */
                        /* JADX WARN: Type inference failed for: r5v16 */
                        /* JADX WARN: Type inference failed for: r5v9 */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            List list;
                            int i3;
                            int i4;
                            ?? r5;
                            int[] values;
                            int length;
                            int i5;
                            DatadogContext datadogContext2 = DatadogContext.this;
                            UserInfo userInfo = datadogContext2.userInfo;
                            DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                            RumContext rumContext3 = rumContext2;
                            String str16 = rumContext3.syntheticsResultId;
                            String str17 = rumContext3.syntheticsTestId;
                            LongTaskEvent.Synthetics synthetics = (str17 == null || StringsKt.isBlank(str17) || str16 == null || StringsKt.isBlank(str16)) ? null : new LongTaskEvent.Synthetics(str17, str16, null);
                            int i6 = synthetics == null ? 1 : 2;
                            RumRawEvent.AddLongTask addLongTask2 = addLongTask;
                            long j8 = j6 - (addLongTask2.durationNs / 1000000);
                            LongTaskEvent.LongTask longTask = new LongTaskEvent.LongTask(UUID.randomUUID().toString(), null, 0, addLongTask2.durationNs, null, null, null, null, Boolean.valueOf(z8), null);
                            String str18 = rumContext3.actionId;
                            LongTaskEvent.Action action = str18 != null ? new LongTaskEvent.Action(CollectionsKt__CollectionsJVMKt.listOf(str18)) : null;
                            String str19 = rumContext3.viewId;
                            if (str19 == null) {
                                str19 = "";
                            }
                            String str20 = rumContext3.viewName;
                            String str21 = rumContext3.viewUrl;
                            LongTaskEvent.LongTaskEventView longTaskEventView = new LongTaskEvent.LongTaskEventView(str19, null, str21 != null ? str21 : "", str20);
                            LongTaskEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new LongTaskEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                            NetworkInfo networkInfo = datadogContext2.networkInfo;
                            networkInfo.getClass();
                            boolean isConnected = zzhy.isConnected(networkInfo);
                            String str22 = networkInfo.carrierName;
                            int i7 = isConnected ? 1 : 2;
                            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                case 0:
                                    list = EmptyList.INSTANCE;
                                    break;
                                case 1:
                                    list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.ETHERNET);
                                    break;
                                case 2:
                                    list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.WIFI);
                                    break;
                                case 3:
                                    list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.WIMAX);
                                    break;
                                case 4:
                                    list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.BLUETOOTH);
                                    break;
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                    list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.CELLULAR);
                                    break;
                                case 11:
                                    list = CollectionsKt__CollectionsJVMKt.listOf(LongTaskEvent.Interface.OTHER);
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                            String str23 = networkInfo.cellularTechnology;
                            LongTaskEvent.Connectivity connectivity = new LongTaskEvent.Connectivity(i7, list, 0, (str23 == null && str22 == null) ? null : new LongTaskEvent.Cellular(str23, str22));
                            LongTaskEvent.Application application = new LongTaskEvent.Application(rumContext3.applicationId, null);
                            String str24 = rumContext3.sessionId;
                            RumViewScope rumViewScope3 = this;
                            LongTaskEvent.LongTaskEventSession longTaskEventSession = new LongTaskEvent.LongTaskEventSession(i6, Boolean.valueOf(rumViewScope3.hasReplay), str24);
                            String str25 = datadogContext2.source;
                            InternalLogger internalLogger = rumViewScope3.sdkCore.getInternalLogger();
                            str25.getClass();
                            internalLogger.getClass();
                            try {
                                values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                length = values.length;
                                i5 = 0;
                            } catch (NoSuchElementException e) {
                                DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str25, 25), e, false, 48);
                                i3 = 0;
                            }
                            while (i5 < length) {
                                i3 = values[i5];
                                int[] iArr = values;
                                if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$9(i3).equals(str25)) {
                                    LongTaskEvent.Os os = new LongTaskEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                    DeviceType deviceType = deviceInfo.deviceType;
                                    deviceType.getClass();
                                    int i8 = 5;
                                    switch (deviceType.ordinal()) {
                                        case 0:
                                            i4 = 1;
                                            break;
                                        case 1:
                                            i4 = 3;
                                            break;
                                        case 2:
                                            i4 = 4;
                                            break;
                                        case 3:
                                            i4 = 2;
                                            break;
                                        case 4:
                                            i4 = 5;
                                            break;
                                        case 5:
                                            i4 = 6;
                                            break;
                                        case 6:
                                            i4 = 7;
                                            break;
                                        default:
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                    }
                                    LongTaskEvent.Device device = new LongTaskEvent.Device(i4, deviceInfo.deviceName, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture, null, null, null, null, null, null);
                                    LongTaskEvent.Context context = new LongTaskEvent.Context(linkedHashMap3);
                                    int i9 = rumContext3.sessionStartReason;
                                    if (i9 == 0) {
                                        throw null;
                                    }
                                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i9)) {
                                        case 0:
                                            r5 = 0;
                                            i8 = 1;
                                            break;
                                        case 1:
                                            r5 = 0;
                                            i8 = 2;
                                            break;
                                        case 2:
                                            r5 = 0;
                                            i8 = 3;
                                            break;
                                        case 3:
                                            r5 = 0;
                                            i8 = 4;
                                            break;
                                        case 4:
                                            r5 = 0;
                                            break;
                                        case 5:
                                            r5 = 0;
                                            i8 = 6;
                                            break;
                                        case 6:
                                            r5 = 0;
                                            i8 = 7;
                                            break;
                                        default:
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                    }
                                    return new LongTaskEvent(j8, application, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), datadogContext2.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext2), longTaskEventSession, i3, longTaskEventView, usr, null, connectivity, null, synthetics, null, os, device, new LongTaskEvent.Dd(new LongTaskEvent.DdSession(r5, i8), new LongTaskEvent.Configuration(Float.valueOf(rumViewScope3.sampleRate), r5, r5), null, null, null, null), context, action, null, longTask);
                                }
                                i5++;
                                values = iArr;
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    };
                    rumViewScope = this;
                    boolean z92 = z8;
                    WriteOperation newRumEventWriteOperation32 = SdkCoreExtKt.newRumEventWriteOperation(internalSdkCore52, datadogContext, function1, dataWriter, 1, function032);
                    if (!z92) {
                    }
                    newRumEventWriteOperation32.onError = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj2;
                            advancedRumMonitor.getClass();
                            String str16 = RumContext.this.viewId;
                            if (str16 == null) {
                                str16 = "";
                            }
                            advancedRumMonitor.eventDropped(str16, storageEvent);
                            return Unit.INSTANCE;
                        }
                    };
                    newRumEventWriteOperation32.onSuccess = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$onAddLongTask$2$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj2;
                            advancedRumMonitor.getClass();
                            String str16 = RumContext.this.viewId;
                            if (str16 == null) {
                                str16 = "";
                            }
                            advancedRumMonitor.eventSent(str16, storageEvent);
                            return Unit.INSTANCE;
                        }
                    };
                    newRumEventWriteOperation32.submit();
                    rumViewScope.pendingLongTaskCount++;
                }
            } else {
                rumViewScope = rumViewScope2;
                if (rumRawEvent instanceof RumRawEvent.AddFeatureFlagEvaluation) {
                    RumRawEvent.AddFeatureFlagEvaluation addFeatureFlagEvaluation = (RumRawEvent.AddFeatureFlagEvaluation) rumRawEvent;
                    LinkedHashMap linkedHashMap4 = rumViewScope.featureFlags;
                    if (!rumViewScope.stopped) {
                        Object obj2 = addFeatureFlagEvaluation.value;
                        String str16 = addFeatureFlagEvaluation.name;
                        if (!Intrinsics.areEqual(obj2, linkedHashMap4.get(str16))) {
                            linkedHashMap4.put(str16, addFeatureFlagEvaluation.value);
                            rumViewScope2 = rumViewScope;
                            rumViewScope2.sendViewUpdate(addFeatureFlagEvaluation, datadogContext, function1, dataWriter, 1);
                            RumViewChangedListener rumViewChangedListener = rumViewScope2.viewChangedListener;
                            if (rumViewChangedListener != null) {
                                RumScopeKey rumScopeKey = rumViewScope2.key;
                                LinkedHashMap linkedHashMap5 = rumViewScope2.viewAttributes;
                                boolean z10 = rumViewScope2.stopped;
                                RumViewInfo rumViewInfo = new RumViewInfo(rumScopeKey, linkedHashMap5, !z10);
                                RumApplicationScope rumApplicationScope = (RumApplicationScope) rumViewChangedListener;
                                if (!z10) {
                                    rumApplicationScope.lastActiveViewInfo = rumViewInfo;
                                }
                            }
                        }
                    }
                } else {
                    rumViewScope2 = rumViewScope;
                    if (rumRawEvent instanceof RumRawEvent.AddCustomTiming) {
                        RumRawEvent.AddCustomTiming addCustomTiming = (RumRawEvent.AddCustomTiming) rumRawEvent;
                        if (!rumViewScope2.stopped) {
                            rumViewScope2.customTimings.put(addCustomTiming.name, Long.valueOf(Math.max(addCustomTiming.eventTime.nanoTime - rumViewScope2.startedNanos, 1L)));
                            rumViewScope2.sendViewUpdate(addCustomTiming, datadogContext, function1, dataWriter, 1);
                        }
                    } else if (rumRawEvent instanceof RumRawEvent.KeepAlive) {
                        RumRawEvent.KeepAlive keepAlive = (RumRawEvent.KeepAlive) rumRawEvent;
                        rumViewScope2.delegateEventToChildren(keepAlive, datadogContext, function1, dataWriter);
                        if (!rumViewScope2.stopped) {
                            rumViewScope2.sendViewUpdate(keepAlive, datadogContext, function1, dataWriter, 1);
                        }
                    } else if (rumRawEvent instanceof RumRawEvent.AddViewLoadingTime) {
                        RumRawEvent.AddViewLoadingTime addViewLoadingTime = (RumRawEvent.AddViewLoadingTime) rumRawEvent;
                        if (!rumViewScope2.stopped && rumViewScope2.viewLoadingTime == null) {
                            InternalLogger.Target target = InternalLogger.Target.USER;
                            InternalLogger internalLogger = rumViewScope2.sdkCore.getInternalLogger();
                            final String str17 = rumViewScope2.key.name;
                            Long l6 = rumViewScope2.viewLoadingTime;
                            final long j8 = addViewLoadingTime.eventTime.nanoTime - rumViewScope2.startedNanos;
                            if (l6 == null) {
                                DBUtil.log$default(internalLogger, 2, target, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$updateViewLoadingTime$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return String.format(Locale.US, "View loading time %dns added to the view %s", Arrays.copyOf(new Object[]{Long.valueOf(j8), str17}, 2));
                                    }
                                }, null, false, 56);
                                zzlj zzljVar = (zzlj) internalLogger;
                                zzljVar.getClass();
                                if (new AndroidSvg(15.0f).sample(Unit.INSTANCE) && (internalSdkCore = (InternalSdkCore) zzljVar.zza) != null && (feature = internalSdkCore.getFeature("rum")) != null) {
                                    InternalTelemetryEvent$ApiUsage$AddViewLoadingTime internalTelemetryEvent$ApiUsage$AddViewLoadingTime = new InternalTelemetryEvent$ApiUsage$AddViewLoadingTime(false, false, false);
                                    zzhs.enrichWithNonNullAttribute(internalTelemetryEvent$ApiUsage$AddViewLoadingTime.getAdditionalProperties(), 2, Float.valueOf(15.0f));
                                    feature.sendEvent(internalTelemetryEvent$ApiUsage$AddViewLoadingTime);
                                }
                            }
                            rumViewScope2.viewLoadingTime = Long.valueOf(j8);
                            rumViewScope2.viewEndedMetricDispatcher.zzf = Long.valueOf(j8);
                            rumViewScope2.sendViewUpdate(addViewLoadingTime, datadogContext, function1, dataWriter, 1);
                        }
                    } else if (rumRawEvent instanceof RumRawEvent.AddViewAttributes) {
                        rumViewScope2.viewAttributes.putAll(((RumRawEvent.AddViewAttributes) rumRawEvent).attributes);
                    } else {
                        delegateEventToChildren(rumRawEvent, datadogContext, function1, dataWriter);
                    }
                }
            }
            rumViewScope2 = rumViewScope;
        }
        if (!rumViewScope2.isViewComplete()) {
            return rumViewScope2;
        }
        rumViewScope2.sdkCore.updateFeatureContext("session-replay", new BoundsAnimation$animate$1(rumViewScope2, 28), true);
        return null;
    }

    public final boolean isViewComplete() {
        return this.stopped && this.activeResourceScopes.isEmpty() && ((this.pendingActionCount + this.pendingResourceCount) + this.pendingErrorCount) + this.pendingLongTaskCount <= 0;
    }

    public final void resolveViewDuration(RumRawEvent rumRawEvent) {
        long j = rumRawEvent.getEventTime().nanoTime;
        this.stoppedNanos = j;
        long j2 = this.startedNanos;
        long j3 = j - j2;
        this.viewEndedMetricDispatcher.zze = Long.valueOf(j3);
        RumScopeKey rumScopeKey = this.key;
        InternalLogger.Target target = InternalLogger.Target.TELEMETRY;
        InternalLogger.Target target2 = InternalLogger.Target.USER;
        InternalSdkCore internalSdkCore = this.sdkCore;
        if (j3 != 0) {
            if (j3 < 0) {
                InternalLogger internalLogger = internalSdkCore.getInternalLogger();
                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target});
                final int i = 1;
                ((zzlj) internalLogger).log(4, listOf, new Function0(this) { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$resolveViewDuration$1
                    public final /* synthetic */ RumViewScope this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.this$0 = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2 = i;
                        RumViewScope rumViewScope = this.this$0;
                        switch (i2) {
                            case 0:
                                return String.format(Locale.US, "The computed duration for the view: %s was 0. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{rumViewScope.key.name}, 1));
                            default:
                                return String.format(Locale.US, "The computed duration for the view: %s was negative. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{rumViewScope.key.name}, 1));
                        }
                    }
                }, (Throwable) null, false, MapsKt__MapsKt.mapOf(new Pair("view.start_ns", Long.valueOf(j2)), new Pair("view.end_ns", Long.valueOf(rumRawEvent.getEventTime().nanoTime)), new Pair("view.name", rumScopeKey.name)));
                this.stoppedNanos = j2 + 1;
                return;
            }
            return;
        }
        if (this.f953type != 3 || !(rumRawEvent instanceof RumRawEvent.AddError) || !((RumRawEvent.AddError) rumRawEvent).isFatal) {
            InternalLogger internalLogger2 = internalSdkCore.getInternalLogger();
            final int i2 = 0;
            zzlj zzljVar = (zzlj) internalLogger2;
            zzljVar.log(4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, target}), new Function0(this) { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$resolveViewDuration$1
                public final /* synthetic */ RumViewScope this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i22 = i2;
                    RumViewScope rumViewScope = this.this$0;
                    switch (i22) {
                        case 0:
                            return String.format(Locale.US, "The computed duration for the view: %s was 0. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{rumViewScope.key.name}, 1));
                        default:
                            return String.format(Locale.US, "The computed duration for the view: %s was negative. In order to keep the view we forced it to 1ns.", Arrays.copyOf(new Object[]{rumViewScope.key.name}, 1));
                    }
                }
            }, (Throwable) null, false, Thread$State$EnumUnboxingLocalUtility.m("view.name", rumScopeKey.name));
        }
        this.stoppedNanos = j2 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0271  */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [com.datadog.android.rum.model.ViewEvent$Performance] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Number] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendViewUpdate(RumRawEvent rumRawEvent, final DatadogContext datadogContext, Function1 function1, DataWriter dataWriter, int i) {
        final int i2;
        final Double d;
        long j;
        final ViewEvent.FlutterBuildTime flutterBuildTime;
        double d2;
        final ViewEvent.FlutterBuildTime flutterBuildTime2;
        long j2;
        VitalInfo vitalInfo;
        ViewUIPerformanceReport viewUIPerformanceReport;
        long j3;
        long j4;
        ArrayList arrayList;
        final Double d3;
        final Double d4;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        long j5;
        long j6;
        boolean z;
        final ViewEvent.Accessibility accessibility;
        String str;
        DatadogContext datadogContext2;
        boolean z2;
        Map map;
        NoValueReason.TimeToNetworkSettle timeToNetworkSettle;
        String str2;
        double d5;
        Queue<SlowFrameRecord> queue;
        ViewUIPerformanceReport viewUIPerformanceReport2;
        final boolean isViewComplete = isViewComplete();
        final Long resolveMetric = this.networkSettledMetricResolver.resolveMetric();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = this.interactionToNextViewMetricResolver.resolveMetric(this.viewId);
        ViewInitializationMetricsState state = this.interactionToNextViewMetricResolver.getState(this.viewId);
        if (ref$ObjectRef.element == null && state.noValueReason == NoValueReason.InteractionToNextView.DISABLED) {
            Object obj = this.internalAttributes.get("_dd.view.custom_inv_value");
            ref$ObjectRef.element = obj instanceof Long ? (Long) obj : null;
        }
        final long j7 = this.version + 1;
        this.version = j7;
        long j8 = this.actionCount;
        long j9 = this.errorCount;
        long j10 = this.resourceCount;
        long j11 = this.crashCount;
        long j12 = this.longTaskCount;
        final long j13 = this.frozenFrameCount;
        Double d6 = this.cpuTicks;
        int i3 = this.frustrationCount;
        VitalInfo vitalInfo2 = (VitalInfo) this.performanceMetrics.get(RumPerformanceMetric.FLUTTER_BUILD_TIME);
        if (vitalInfo2 != null) {
            i2 = i3;
            d = d6;
            j = j8;
            flutterBuildTime = new ViewEvent.FlutterBuildTime(Double.valueOf(vitalInfo2.minValue), Double.valueOf(vitalInfo2.maxValue), Double.valueOf(vitalInfo2.meanValue), null);
        } else {
            i2 = i3;
            d = d6;
            j = j8;
            flutterBuildTime = null;
        }
        VitalInfo vitalInfo3 = (VitalInfo) this.performanceMetrics.get(RumPerformanceMetric.FLUTTER_RASTER_TIME);
        final ViewEvent.FlutterBuildTime flutterBuildTime3 = vitalInfo3 != null ? new ViewEvent.FlutterBuildTime(Double.valueOf(vitalInfo3.minValue), Double.valueOf(vitalInfo3.maxValue), Double.valueOf(vitalInfo3.meanValue), null) : null;
        VitalInfo vitalInfo4 = (VitalInfo) this.performanceMetrics.get(RumPerformanceMetric.JS_FRAME_TIME);
        if (vitalInfo4 != null) {
            double d7 = vitalInfo4.maxValue;
            Double valueOf = Double.valueOf((d7 == 0.0d ? 0.0d : 1.0d / d7) * 1.0E9d);
            double d8 = vitalInfo4.minValue;
            Double valueOf2 = Double.valueOf((d8 == 0.0d ? 0.0d : 1.0d / d8) * 1.0E9d);
            d2 = 0.0d;
            double d9 = vitalInfo4.meanValue;
            flutterBuildTime2 = new ViewEvent.FlutterBuildTime(valueOf, valueOf2, Double.valueOf((d9 == 0.0d ? 0.0d : 1.0d / d9) * 1.0E9d), null);
        } else {
            d2 = 0.0d;
            flutterBuildTime2 = null;
        }
        if (!this.stopped) {
            resolveViewDuration(rumRawEvent);
        }
        long j14 = this.stoppedNanos - this.startedNanos;
        final RumContext rumContext = getRumContext();
        LinkedHashMap linkedHashMap2 = this.customTimings;
        final ViewEvent.CustomTimings customTimings = !linkedHashMap2.isEmpty() ? new ViewEvent.CustomTimings(new LinkedHashMap(linkedHashMap2)) : null;
        final VitalInfo vitalInfo5 = this.lastMemoryInfo;
        VitalInfo vitalInfo6 = this.lastFrameRateInfo;
        Boolean valueOf3 = vitalInfo6 == null ? null : Boolean.valueOf(vitalInfo6.meanValue < 55.0d);
        final boolean booleanValue = valueOf3 != null ? valueOf3.booleanValue() : false;
        LinkedHashMap mutableMap = MapsKt__MapsKt.toMutableMap(this.featureFlags);
        final LinkedHashMap linkedHashMap3 = new LinkedHashMap(getCustomAttributes());
        DefaultSlowFramesListener defaultSlowFramesListener = this.slowFramesListener;
        if (defaultSlowFramesListener != null) {
            String str3 = this.viewId;
            str3.getClass();
            vitalInfo = vitalInfo6;
            ConcurrentHashMap concurrentHashMap = defaultSlowFramesListener.slowFramesRecords;
            ViewUIPerformanceReport viewUIPerformanceReport3 = (ViewUIPerformanceReport) (isViewComplete ? concurrentHashMap.remove(str3) : concurrentHashMap.get(str3));
            if (viewUIPerformanceReport3 != null) {
                synchronized (viewUIPerformanceReport3) {
                    if (isViewComplete) {
                        try {
                            defaultSlowFramesListener.metricDispatcher.sendMetric(j14, str3);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j2 = j14;
                    long j15 = viewUIPerformanceReport3.viewStartedTimeStamp;
                    Queue queue2 = viewUIPerformanceReport3.slowFramesRecords;
                    long j16 = viewUIPerformanceReport3.totalFramesDurationNs;
                    long j17 = viewUIPerformanceReport3.slowFramesDurationNs;
                    long j18 = viewUIPerformanceReport3.freezeFramesDuration;
                    long j19 = viewUIPerformanceReport3.minViewLifetimeThresholdNs;
                    queue2.getClass();
                    viewUIPerformanceReport2 = new ViewUIPerformanceReport(j15, queue2, j16, j17, j18, j19);
                }
                viewUIPerformanceReport = viewUIPerformanceReport2;
                if (viewUIPerformanceReport != null || (queue = viewUIPerformanceReport.slowFramesRecords) == null) {
                    j3 = j10;
                    j4 = j9;
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(queue, 10));
                    for (SlowFrameRecord slowFrameRecord : queue) {
                        arrayList.add(new ViewEvent.SlowFrame(slowFrameRecord.startTimestampNs - this.startedNanos, slowFrameRecord.durationNs));
                        j10 = j10;
                        j9 = j9;
                    }
                    j3 = j10;
                    j4 = j9;
                }
                if (isViewComplete || viewUIPerformanceReport == null) {
                    d3 = null;
                } else {
                    long j20 = this.stoppedNanos - viewUIPerformanceReport.viewStartedTimeStamp;
                    d3 = Double.valueOf(j20 <= viewUIPerformanceReport.minViewLifetimeThresholdNs ? d2 : Math.max(d2, (viewUIPerformanceReport.freezeFramesDuration / j20) * 3600.0d));
                }
                if (isViewComplete || viewUIPerformanceReport == null) {
                    d4 = null;
                } else {
                    if (this.stoppedNanos - viewUIPerformanceReport.viewStartedTimeStamp <= viewUIPerformanceReport.minViewLifetimeThresholdNs) {
                        d5 = 0.0d;
                    } else {
                        double d10 = viewUIPerformanceReport.totalFramesDurationNs;
                        d5 = 0.0d;
                        if (d10 > 0.0d) {
                            d5 = 1000.0d * (viewUIPerformanceReport.slowFramesDurationNs / d10);
                        }
                    }
                    d4 = Double.valueOf(d5);
                }
                this.insightsCollector.getClass();
                if (isViewComplete) {
                    if (getRumContext().sessionState == 1) {
                        arrayList2 = arrayList;
                        linkedHashMap = mutableMap;
                        j5 = j11;
                        j6 = j12;
                        accessibility = null;
                        z = true;
                        this.accessibilitySnapshotManager.getClass();
                        final BatteryInfo batteryInfo = (BatteryInfo) this.batteryInfoProvider.getState();
                        final DisplayInfo displayInfo = (DisplayInfo) this.displayInfoProvider.getState();
                        Object obj2 = this.internalAttributes.get("_dd.performance.first_build_complete");
                        if (!(obj2 instanceof Number)) {
                        }
                        if (r6 == 0) {
                        }
                        str = rumContext.viewId;
                        if (str == null) {
                        }
                        if (this.hasReplay) {
                        }
                        z2 = z;
                        this.hasReplay = z2;
                        this.featuresContextResolver.getClass();
                        datadogContext2.getClass();
                        map = (Map) datadogContext2.featuresContext.get("session-replay");
                        long j21 = 0;
                        if (map != null) {
                        }
                        final VitalInfo vitalInfo7 = vitalInfo;
                        final String str4 = str;
                        final long j22 = j21;
                        final long j23 = j;
                        final long j24 = j2;
                        final long j25 = j3;
                        final long j26 = j4;
                        final ArrayList arrayList3 = arrayList2;
                        final long j27 = j5;
                        final long j28 = j6;
                        final LinkedHashMap linkedHashMap4 = linkedHashMap;
                        SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, datadogContext, function1, dataWriter, i, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r9v10 */
                            /* JADX WARN: Type inference failed for: r9v11, types: [com.datadog.android.rum.model.ViewEvent$Plan, java.lang.Boolean, java.lang.Number] */
                            /* JADX WARN: Type inference failed for: r9v19 */
                            /* JADX WARN: Type inference failed for: r9v5 */
                            /* JADX WARN: Type inference failed for: r9v6 */
                            /* JADX WARN: Type inference failed for: r9v7 */
                            /* JADX WARN: Type inference failed for: r9v8 */
                            /* JADX WARN: Type inference failed for: r9v9 */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i4;
                                int i5;
                                ?? r9;
                                int i6;
                                List list;
                                String str5;
                                int i7;
                                Double d11;
                                DatadogContext datadogContext3 = DatadogContext.this;
                                UserInfo userInfo = datadogContext3.userInfo;
                                DeviceInfo deviceInfo = datadogContext3.deviceInfo;
                                ViewEvent.ReplayStats replayStats = new ViewEvent.ReplayStats(Long.valueOf(j22), 0L, 0L);
                                RumContext rumContext2 = rumContext;
                                String str6 = rumContext2.syntheticsResultId;
                                String str7 = rumContext2.syntheticsTestId;
                                ViewEvent.Synthetics synthetics = (str7 == null || StringsKt.isBlank(str7) || str6 == null || StringsKt.isBlank(str6)) ? null : new ViewEvent.Synthetics(str7, str6, null);
                                int i8 = synthetics == null ? 1 : 2;
                                RumViewScope rumViewScope = this;
                                long j29 = rumViewScope.eventTimestamp;
                                ViewEvent.Context context = new ViewEvent.Context(linkedHashMap4);
                                String str8 = rumContext2.viewName;
                                String str9 = rumContext2.viewUrl;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                String str10 = str9;
                                ViewEvent.Action action = new ViewEvent.Action(j23);
                                ViewEvent.Resource resource = new ViewEvent.Resource(j25);
                                int i9 = i8;
                                ViewEvent.Error error = new ViewEvent.Error(j26);
                                ViewEvent.Crash crash = new ViewEvent.Crash(j27);
                                ViewEvent.LongTask longTask = new ViewEvent.LongTask(j28);
                                ViewEvent.FrozenFrame frozenFrame = new ViewEvent.FrozenFrame(j13);
                                boolean z3 = !isViewComplete;
                                long j30 = j24;
                                Double valueOf4 = (j30 < 1000000000 || (d11 = d) == null) ? null : Double.valueOf((d11.doubleValue() * 1.0E9d) / j30);
                                VitalInfo vitalInfo8 = vitalInfo5;
                                Double valueOf5 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.meanValue) : null;
                                Double valueOf6 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.maxValue) : null;
                                VitalInfo vitalInfo9 = vitalInfo7;
                                ViewEvent.ViewEventView viewEventView = new ViewEvent.ViewEventView(str4, null, str10, str8, rumViewScope.viewLoadingTime, resolveMetric, (Long) ref$ObjectRef.element, 0, j24, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, customTimings, Boolean.valueOf(z3), Boolean.valueOf(booleanValue), action, error, crash, longTask, frozenFrame, arrayList3, resource, new ViewEvent.Frustration(i2), null, valueOf5, valueOf6, d, valueOf4, vitalInfo9 != null ? Double.valueOf(vitalInfo9.meanValue) : null, vitalInfo9 != null ? Double.valueOf(vitalInfo9.minValue) : null, d4, d3, flutterBuildTime, flutterBuildTime3, flutterBuildTime2, r37, accessibility);
                                ViewEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ViewEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                                ViewEvent.Application application = new ViewEvent.Application(rumContext2.applicationId, deviceInfo.localeInfo.currentLocale);
                                ViewEvent.ViewEventSession viewEventSession = new ViewEvent.ViewEventSession(rumContext2.sessionId, i9, Boolean.valueOf(rumViewScope.hasReplay), Boolean.valueOf(rumContext2.isSessionActive), null);
                                String str11 = datadogContext3.source;
                                InternalLogger internalLogger = rumViewScope.sdkCore.getInternalLogger();
                                str11.getClass();
                                internalLogger.getClass();
                                try {
                                } catch (NoSuchElementException e) {
                                    DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str11, 24), e, false, 48);
                                    i4 = 0;
                                }
                                for (int i10 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                                    if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(i10).equals(str11)) {
                                        i4 = i10;
                                        ViewEvent.Os os = new ViewEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                        DeviceType deviceType = deviceInfo.deviceType;
                                        deviceType.getClass();
                                        switch (deviceType.ordinal()) {
                                            case 0:
                                                i5 = 1;
                                                break;
                                            case 1:
                                                i5 = 3;
                                                break;
                                            case 2:
                                                i5 = 4;
                                                break;
                                            case 3:
                                                i5 = 2;
                                                break;
                                            case 4:
                                                i5 = 5;
                                                break;
                                            case 5:
                                                i5 = 6;
                                                break;
                                            case 6:
                                                i5 = 7;
                                                break;
                                            default:
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                        }
                                        String str12 = deviceInfo.deviceName;
                                        String str13 = deviceInfo.deviceModel;
                                        String str14 = deviceInfo.deviceBrand;
                                        String str15 = deviceInfo.architecture;
                                        LocaleInfo localeInfo = deviceInfo.localeInfo;
                                        List list2 = localeInfo.locales;
                                        String str16 = localeInfo.timeZone;
                                        BatteryInfo batteryInfo2 = batteryInfo;
                                        ViewEvent.Device device = new ViewEvent.Device(i5, str12, str13, str14, str15, null, list2, str16, batteryInfo2.batteryLevel, batteryInfo2.lowPowerMode, displayInfo.screenBrightness);
                                        ViewEvent.Context context2 = new ViewEvent.Context(linkedHashMap3);
                                        int i11 = rumContext2.sessionStartReason;
                                        if (i11 == 0) {
                                            throw null;
                                        }
                                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i11)) {
                                            case 0:
                                                r9 = 0;
                                                i6 = 1;
                                                break;
                                            case 1:
                                                r9 = 0;
                                                i6 = 2;
                                                break;
                                            case 2:
                                                r9 = 0;
                                                i6 = 3;
                                                break;
                                            case 3:
                                                r9 = 0;
                                                i6 = 4;
                                                break;
                                            case 4:
                                                r9 = 0;
                                                i6 = 5;
                                                break;
                                            case 5:
                                                r9 = 0;
                                                i6 = 6;
                                                break;
                                            case 6:
                                                r9 = 0;
                                                i6 = 7;
                                                break;
                                            default:
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                        }
                                        ViewEvent.Dd dd = new ViewEvent.Dd(new ViewEvent.DdSession(r9, i6), new ViewEvent.Configuration(Float.valueOf(rumViewScope.sampleRate), r9, r9, r9), null, null, j7, null, replayStats, null, null);
                                        NetworkInfo networkInfo = datadogContext3.networkInfo;
                                        networkInfo.getClass();
                                        boolean isConnected = zzhy.isConnected(networkInfo);
                                        String str17 = networkInfo.carrierName;
                                        int i12 = isConnected ? 1 : 2;
                                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                            case 0:
                                                list = EmptyList.INSTANCE;
                                                break;
                                            case 1:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.ETHERNET);
                                                break;
                                            case 2:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIFI);
                                                break;
                                            case 3:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIMAX);
                                                break;
                                            case 4:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.BLUETOOTH);
                                                break;
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.CELLULAR);
                                                break;
                                            case 11:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.OTHER);
                                                break;
                                            default:
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                        }
                                        String str18 = networkInfo.cellularTechnology;
                                        ViewEvent viewEvent = new ViewEvent(j29, application, datadogContext3.service, datadogContext3.version, String.valueOf(datadogContext3.versionCode), datadogContext3.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext3), viewEventSession, i4, viewEventView, usr, null, new ViewEvent.Connectivity(i12, list, 0, (str18 == null && str17 == null) ? null : new ViewEvent.Cellular(str18, str17)), null, synthetics, null, os, device, dd, context2, null, context, null);
                                        SessionEndedMetricDispatcher sessionEndedMetricDispatcher = rumViewScope.sessionEndedMetricDispatcher;
                                        String str19 = rumViewScope.sessionId;
                                        sessionEndedMetricDispatcher.getClass();
                                        str19.getClass();
                                        SessionEndedMetric sessionEndedMetric = (SessionEndedMetric) sessionEndedMetricDispatcher.metricsBySessionId.get(str19);
                                        if (sessionEndedMetric != null) {
                                            LinkedHashMap linkedHashMap5 = sessionEndedMetric.trackedViewsById;
                                            if (Intrinsics.areEqual(viewEventSession.id, sessionEndedMetric.sessionId)) {
                                                String str20 = viewEventView.id;
                                                SessionEndedMetric.TrackedView trackedView = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                                if (trackedView == null || (str5 = trackedView.viewUrl) == null) {
                                                    str5 = viewEventView.url;
                                                }
                                                String str21 = str5;
                                                SessionEndedMetric.TrackedView trackedView2 = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                                long j31 = trackedView2 != null ? trackedView2.startMs : j29;
                                                Boolean bool = viewEventSession.hasReplay;
                                                SessionEndedMetric.TrackedView trackedView3 = new SessionEndedMetric.TrackedView(j31, viewEventView.timeSpent, str21, bool != null ? bool.booleanValue() : false);
                                                linkedHashMap5.put(str20, trackedView3);
                                                if (sessionEndedMetric.firstTrackedView == null) {
                                                    sessionEndedMetric.firstTrackedView = trackedView3;
                                                }
                                                sessionEndedMetric.lastTrackedView = trackedView3;
                                                return viewEvent;
                                            }
                                        }
                                        DBUtil.log$default(sessionEndedMetricDispatcher.internalLogger, 3, InternalLogger.Target.MAINTAINER, new Rum$createMonitor$1(5, sessionEndedMetricDispatcher, str19, viewEvent), null, false, 56);
                                        return viewEvent;
                                    }
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                        }).submit();
                    }
                    zzm zzmVar = this.viewEndedMetricDispatcher;
                    ViewInitializationMetricsState state2 = this.interactionToNextViewMetricResolver.getState(this.viewId);
                    NetworkSettledMetricResolver networkSettledMetricResolver = this.networkSettledMetricResolver;
                    Long resolveMetric2 = networkSettledMetricResolver.resolveMetric();
                    int i4 = !(networkSettledMetricResolver.initialResourceIdentifier instanceof TimeBasedInitialResourceIdentifier) ? 4 : 2;
                    if (resolveMetric2 == null) {
                        n nVar = networkSettledMetricResolver.currentViewDiagnostic;
                        int i5 = ((AtomicInteger) nVar.a).get();
                        int i6 = ((AtomicInteger) nVar.b).get();
                        timeToNetworkSettle = i5 == 0 ? NoValueReason.TimeToNetworkSettle.NO_RESOURCES : i6 == 0 ? NoValueReason.TimeToNetworkSettle.NO_INITIAL_RESOURCES : i6 > ((AtomicInteger) nVar.d).get() + ((AtomicInteger) nVar.c).get() ? NoValueReason.TimeToNetworkSettle.NOT_SETTLED_YET : NoValueReason.TimeToNetworkSettle.UNKNOWN;
                    } else {
                        timeToNetworkSettle = null;
                    }
                    zzmVar.getClass();
                    boolean z3 = zzmVar.zza;
                    InternalLogger internalLogger = (InternalLogger) zzmVar.zzb;
                    if (!z3) {
                        ViewEndedMetricDispatcher$sendViewEnded$1 viewEndedMetricDispatcher$sendViewEnded$1 = ViewEndedMetricDispatcher$sendViewEnded$1.INSTANCE$2;
                        MapBuilder mapBuilder = new MapBuilder();
                        arrayList2 = arrayList;
                        NoValueReason.TimeToNetworkSettle timeToNetworkSettle2 = timeToNetworkSettle;
                        mapBuilder.put("metric_type", "rum view ended");
                        linkedHashMap = mutableMap;
                        int i7 = i4;
                        j5 = j11;
                        MapBuilder mapBuilder2 = new MapBuilder();
                        j6 = j12;
                        Long l = (Long) zzmVar.zze;
                        if (l != null) {
                            mapBuilder2.put("duration", l);
                        }
                        if (((Long) zzmVar.zzf) != null) {
                            MapBuilder mapBuilder3 = new MapBuilder();
                            mapBuilder3.put("value", (Long) zzmVar.zzf);
                            mapBuilder2.put("loading_time", mapBuilder3.build());
                        }
                        int i8 = zzmVar.zzd;
                        if (i8 == 0) {
                            throw null;
                        }
                        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i8);
                        if (ordinal == 0 || ordinal == 1) {
                            str2 = "custom";
                        } else if (ordinal == 2) {
                            str2 = "background";
                        } else {
                            if (ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            str2 = "application_launch";
                        }
                        mapBuilder2.put("view_type", str2);
                        MapBuilder mapBuilder4 = new MapBuilder();
                        mapBuilder4.put("value", resolveMetric2);
                        mapBuilder4.put("config", zzic.toAttributeValue$dd_sdk_android_rum_release(i7));
                        if (resolveMetric2 == null) {
                            mapBuilder4.put("no_value_reason", zzic.toAttributeValue$dd_sdk_android_rum_release(timeToNetworkSettle2));
                        }
                        mapBuilder2.put("tns", mapBuilder4.build());
                        MapBuilder mapBuilder5 = new MapBuilder();
                        mapBuilder5.put("value", state2.initializationTime);
                        mapBuilder5.put("config", zzic.toAttributeValue$dd_sdk_android_rum_release(state2.config));
                        if (state2.initializationTime == null) {
                            mapBuilder5.put("no_value_reason", zzic.toAttributeValue$dd_sdk_android_rum_release(state2.noValueReason));
                        }
                        mapBuilder2.put("inv", mapBuilder5.build());
                        ViewScopeInstrumentationType viewScopeInstrumentationType = (ViewScopeInstrumentationType) zzmVar.zzc;
                        String str5 = "manual";
                        int i9 = viewScopeInstrumentationType == null ? -1 : ViewEndedMetricDispatcher$Companion$WhenMappings.$EnumSwitchMapping$2[viewScopeInstrumentationType.ordinal()];
                        if (i9 != -1) {
                            if (i9 == 1) {
                                str5 = "compose";
                            } else if (i9 != 2) {
                                if (i9 == 3) {
                                    str5 = "activity";
                                } else {
                                    if (i9 != 4) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return;
                                    }
                                    str5 = BreadcrumbHelper.Category.FRAGMENT;
                                }
                            }
                        }
                        mapBuilder2.put("instrumentation_type", str5);
                        mapBuilder.put("rve", mapBuilder2.build());
                        ((zzlj) internalLogger).logMetric(viewEndedMetricDispatcher$sendViewEnded$1, mapBuilder.build(), 0.75f, null);
                        z = true;
                        zzmVar.zza = true;
                        accessibility = null;
                        this.accessibilitySnapshotManager.getClass();
                        final BatteryInfo batteryInfo2 = (BatteryInfo) this.batteryInfoProvider.getState();
                        final DisplayInfo displayInfo2 = (DisplayInfo) this.displayInfoProvider.getState();
                        Object obj22 = this.internalAttributes.get("_dd.performance.first_build_complete");
                        ?? r6 = !(obj22 instanceof Number) ? (Number) obj22 : accessibility;
                        final ViewEvent.Performance performance = r6 == 0 ? new ViewEvent.Performance(null, null, null, null, null, new ViewEvent.Fbc(r6.longValue())) : accessibility;
                        str = rumContext.viewId;
                        if (str == null) {
                            str = "";
                        }
                        if (this.hasReplay) {
                            this.featuresContextResolver.getClass();
                            datadogContext2 = datadogContext;
                            if (!CueEncoder.resolveViewHasReplay(datadogContext2, str)) {
                                z2 = false;
                                this.hasReplay = z2;
                                this.featuresContextResolver.getClass();
                                datadogContext2.getClass();
                                map = (Map) datadogContext2.featuresContext.get("session-replay");
                                long j212 = 0;
                                if (map != null) {
                                    Object obj3 = map.get(str);
                                    ?? r62 = obj3 instanceof Map ? (Map) obj3 : accessibility;
                                    Object obj4 = r62 != 0 ? r62.get("records_count") : accessibility;
                                    ?? r63 = obj4 instanceof Long ? (Long) obj4 : accessibility;
                                    if (r63 != 0) {
                                        j212 = r63.longValue();
                                    }
                                }
                                final VitalInfo vitalInfo72 = vitalInfo;
                                final String str42 = str;
                                final long j222 = j212;
                                final long j232 = j;
                                final long j242 = j2;
                                final long j252 = j3;
                                final long j262 = j4;
                                final ArrayList arrayList32 = arrayList2;
                                final long j272 = j5;
                                final long j282 = j6;
                                final LinkedHashMap linkedHashMap42 = linkedHashMap;
                                SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, datadogContext, function1, dataWriter, i, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r9v10 */
                                    /* JADX WARN: Type inference failed for: r9v11, types: [com.datadog.android.rum.model.ViewEvent$Plan, java.lang.Boolean, java.lang.Number] */
                                    /* JADX WARN: Type inference failed for: r9v19 */
                                    /* JADX WARN: Type inference failed for: r9v5 */
                                    /* JADX WARN: Type inference failed for: r9v6 */
                                    /* JADX WARN: Type inference failed for: r9v7 */
                                    /* JADX WARN: Type inference failed for: r9v8 */
                                    /* JADX WARN: Type inference failed for: r9v9 */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i42;
                                        int i52;
                                        ?? r9;
                                        int i62;
                                        List list;
                                        String str52;
                                        int i72;
                                        Double d11;
                                        DatadogContext datadogContext3 = DatadogContext.this;
                                        UserInfo userInfo = datadogContext3.userInfo;
                                        DeviceInfo deviceInfo = datadogContext3.deviceInfo;
                                        ViewEvent.ReplayStats replayStats = new ViewEvent.ReplayStats(Long.valueOf(j222), 0L, 0L);
                                        RumContext rumContext2 = rumContext;
                                        String str6 = rumContext2.syntheticsResultId;
                                        String str7 = rumContext2.syntheticsTestId;
                                        ViewEvent.Synthetics synthetics = (str7 == null || StringsKt.isBlank(str7) || str6 == null || StringsKt.isBlank(str6)) ? null : new ViewEvent.Synthetics(str7, str6, null);
                                        int i82 = synthetics == null ? 1 : 2;
                                        RumViewScope rumViewScope = this;
                                        long j29 = rumViewScope.eventTimestamp;
                                        ViewEvent.Context context = new ViewEvent.Context(linkedHashMap42);
                                        String str8 = rumContext2.viewName;
                                        String str9 = rumContext2.viewUrl;
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        String str10 = str9;
                                        ViewEvent.Action action = new ViewEvent.Action(j232);
                                        ViewEvent.Resource resource = new ViewEvent.Resource(j252);
                                        int i92 = i82;
                                        ViewEvent.Error error = new ViewEvent.Error(j262);
                                        ViewEvent.Crash crash = new ViewEvent.Crash(j272);
                                        ViewEvent.LongTask longTask = new ViewEvent.LongTask(j282);
                                        ViewEvent.FrozenFrame frozenFrame = new ViewEvent.FrozenFrame(j13);
                                        boolean z32 = !isViewComplete;
                                        long j30 = j242;
                                        Double valueOf4 = (j30 < 1000000000 || (d11 = d) == null) ? null : Double.valueOf((d11.doubleValue() * 1.0E9d) / j30);
                                        VitalInfo vitalInfo8 = vitalInfo5;
                                        Double valueOf5 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.meanValue) : null;
                                        Double valueOf6 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.maxValue) : null;
                                        VitalInfo vitalInfo9 = vitalInfo72;
                                        ViewEvent.ViewEventView viewEventView = new ViewEvent.ViewEventView(str42, null, str10, str8, rumViewScope.viewLoadingTime, resolveMetric, (Long) ref$ObjectRef.element, 0, j242, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, customTimings, Boolean.valueOf(z32), Boolean.valueOf(booleanValue), action, error, crash, longTask, frozenFrame, arrayList32, resource, new ViewEvent.Frustration(i2), null, valueOf5, valueOf6, d, valueOf4, vitalInfo9 != null ? Double.valueOf(vitalInfo9.meanValue) : null, vitalInfo9 != null ? Double.valueOf(vitalInfo9.minValue) : null, d4, d3, flutterBuildTime, flutterBuildTime3, flutterBuildTime2, performance, accessibility);
                                        ViewEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ViewEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                                        ViewEvent.Application application = new ViewEvent.Application(rumContext2.applicationId, deviceInfo.localeInfo.currentLocale);
                                        ViewEvent.ViewEventSession viewEventSession = new ViewEvent.ViewEventSession(rumContext2.sessionId, i92, Boolean.valueOf(rumViewScope.hasReplay), Boolean.valueOf(rumContext2.isSessionActive), null);
                                        String str11 = datadogContext3.source;
                                        InternalLogger internalLogger2 = rumViewScope.sdkCore.getInternalLogger();
                                        str11.getClass();
                                        internalLogger2.getClass();
                                        try {
                                        } catch (NoSuchElementException e) {
                                            DBUtil.log$default(internalLogger2, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str11, 24), e, false, 48);
                                            i42 = 0;
                                        }
                                        for (int i10 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                                            if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(i10).equals(str11)) {
                                                i42 = i10;
                                                ViewEvent.Os os = new ViewEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                                DeviceType deviceType = deviceInfo.deviceType;
                                                deviceType.getClass();
                                                switch (deviceType.ordinal()) {
                                                    case 0:
                                                        i52 = 1;
                                                        break;
                                                    case 1:
                                                        i52 = 3;
                                                        break;
                                                    case 2:
                                                        i52 = 4;
                                                        break;
                                                    case 3:
                                                        i52 = 2;
                                                        break;
                                                    case 4:
                                                        i52 = 5;
                                                        break;
                                                    case 5:
                                                        i52 = 6;
                                                        break;
                                                    case 6:
                                                        i52 = 7;
                                                        break;
                                                    default:
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                }
                                                String str12 = deviceInfo.deviceName;
                                                String str13 = deviceInfo.deviceModel;
                                                String str14 = deviceInfo.deviceBrand;
                                                String str15 = deviceInfo.architecture;
                                                LocaleInfo localeInfo = deviceInfo.localeInfo;
                                                List list2 = localeInfo.locales;
                                                String str16 = localeInfo.timeZone;
                                                BatteryInfo batteryInfo22 = batteryInfo2;
                                                ViewEvent.Device device = new ViewEvent.Device(i52, str12, str13, str14, str15, null, list2, str16, batteryInfo22.batteryLevel, batteryInfo22.lowPowerMode, displayInfo2.screenBrightness);
                                                ViewEvent.Context context2 = new ViewEvent.Context(linkedHashMap3);
                                                int i11 = rumContext2.sessionStartReason;
                                                if (i11 == 0) {
                                                    throw null;
                                                }
                                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i11)) {
                                                    case 0:
                                                        r9 = 0;
                                                        i62 = 1;
                                                        break;
                                                    case 1:
                                                        r9 = 0;
                                                        i62 = 2;
                                                        break;
                                                    case 2:
                                                        r9 = 0;
                                                        i62 = 3;
                                                        break;
                                                    case 3:
                                                        r9 = 0;
                                                        i62 = 4;
                                                        break;
                                                    case 4:
                                                        r9 = 0;
                                                        i62 = 5;
                                                        break;
                                                    case 5:
                                                        r9 = 0;
                                                        i62 = 6;
                                                        break;
                                                    case 6:
                                                        r9 = 0;
                                                        i62 = 7;
                                                        break;
                                                    default:
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                }
                                                ViewEvent.Dd dd = new ViewEvent.Dd(new ViewEvent.DdSession(r9, i62), new ViewEvent.Configuration(Float.valueOf(rumViewScope.sampleRate), r9, r9, r9), null, null, j7, null, replayStats, null, null);
                                                NetworkInfo networkInfo = datadogContext3.networkInfo;
                                                networkInfo.getClass();
                                                boolean isConnected = zzhy.isConnected(networkInfo);
                                                String str17 = networkInfo.carrierName;
                                                int i12 = isConnected ? 1 : 2;
                                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                    case 0:
                                                        list = EmptyList.INSTANCE;
                                                        break;
                                                    case 1:
                                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.ETHERNET);
                                                        break;
                                                    case 2:
                                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIFI);
                                                        break;
                                                    case 3:
                                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIMAX);
                                                        break;
                                                    case 4:
                                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.BLUETOOTH);
                                                        break;
                                                    case 5:
                                                    case 6:
                                                    case 7:
                                                    case 8:
                                                    case 9:
                                                    case 10:
                                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.CELLULAR);
                                                        break;
                                                    case 11:
                                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.OTHER);
                                                        break;
                                                    default:
                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                        return null;
                                                }
                                                String str18 = networkInfo.cellularTechnology;
                                                ViewEvent viewEvent = new ViewEvent(j29, application, datadogContext3.service, datadogContext3.version, String.valueOf(datadogContext3.versionCode), datadogContext3.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext3), viewEventSession, i42, viewEventView, usr, null, new ViewEvent.Connectivity(i12, list, 0, (str18 == null && str17 == null) ? null : new ViewEvent.Cellular(str18, str17)), null, synthetics, null, os, device, dd, context2, null, context, null);
                                                SessionEndedMetricDispatcher sessionEndedMetricDispatcher = rumViewScope.sessionEndedMetricDispatcher;
                                                String str19 = rumViewScope.sessionId;
                                                sessionEndedMetricDispatcher.getClass();
                                                str19.getClass();
                                                SessionEndedMetric sessionEndedMetric = (SessionEndedMetric) sessionEndedMetricDispatcher.metricsBySessionId.get(str19);
                                                if (sessionEndedMetric != null) {
                                                    LinkedHashMap linkedHashMap5 = sessionEndedMetric.trackedViewsById;
                                                    if (Intrinsics.areEqual(viewEventSession.id, sessionEndedMetric.sessionId)) {
                                                        String str20 = viewEventView.id;
                                                        SessionEndedMetric.TrackedView trackedView = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                                        if (trackedView == null || (str52 = trackedView.viewUrl) == null) {
                                                            str52 = viewEventView.url;
                                                        }
                                                        String str21 = str52;
                                                        SessionEndedMetric.TrackedView trackedView2 = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                                        long j31 = trackedView2 != null ? trackedView2.startMs : j29;
                                                        Boolean bool = viewEventSession.hasReplay;
                                                        SessionEndedMetric.TrackedView trackedView3 = new SessionEndedMetric.TrackedView(j31, viewEventView.timeSpent, str21, bool != null ? bool.booleanValue() : false);
                                                        linkedHashMap5.put(str20, trackedView3);
                                                        if (sessionEndedMetric.firstTrackedView == null) {
                                                            sessionEndedMetric.firstTrackedView = trackedView3;
                                                        }
                                                        sessionEndedMetric.lastTrackedView = trackedView3;
                                                        return viewEvent;
                                                    }
                                                }
                                                DBUtil.log$default(sessionEndedMetricDispatcher.internalLogger, 3, InternalLogger.Target.MAINTAINER, new Rum$createMonitor$1(5, sessionEndedMetricDispatcher, str19, viewEvent), null, false, 56);
                                                return viewEvent;
                                            }
                                        }
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                }).submit();
                            }
                        } else {
                            datadogContext2 = datadogContext;
                        }
                        z2 = z;
                        this.hasReplay = z2;
                        this.featuresContextResolver.getClass();
                        datadogContext2.getClass();
                        map = (Map) datadogContext2.featuresContext.get("session-replay");
                        long j2122 = 0;
                        if (map != null) {
                        }
                        final VitalInfo vitalInfo722 = vitalInfo;
                        final String str422 = str;
                        final long j2222 = j2122;
                        final long j2322 = j;
                        final long j2422 = j2;
                        final long j2522 = j3;
                        final long j2622 = j4;
                        final ArrayList arrayList322 = arrayList2;
                        final long j2722 = j5;
                        final long j2822 = j6;
                        final LinkedHashMap linkedHashMap422 = linkedHashMap;
                        SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, datadogContext, function1, dataWriter, i, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r9v10 */
                            /* JADX WARN: Type inference failed for: r9v11, types: [com.datadog.android.rum.model.ViewEvent$Plan, java.lang.Boolean, java.lang.Number] */
                            /* JADX WARN: Type inference failed for: r9v19 */
                            /* JADX WARN: Type inference failed for: r9v5 */
                            /* JADX WARN: Type inference failed for: r9v6 */
                            /* JADX WARN: Type inference failed for: r9v7 */
                            /* JADX WARN: Type inference failed for: r9v8 */
                            /* JADX WARN: Type inference failed for: r9v9 */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i42;
                                int i52;
                                ?? r9;
                                int i62;
                                List list;
                                String str52;
                                int i72;
                                Double d11;
                                DatadogContext datadogContext3 = DatadogContext.this;
                                UserInfo userInfo = datadogContext3.userInfo;
                                DeviceInfo deviceInfo = datadogContext3.deviceInfo;
                                ViewEvent.ReplayStats replayStats = new ViewEvent.ReplayStats(Long.valueOf(j2222), 0L, 0L);
                                RumContext rumContext2 = rumContext;
                                String str6 = rumContext2.syntheticsResultId;
                                String str7 = rumContext2.syntheticsTestId;
                                ViewEvent.Synthetics synthetics = (str7 == null || StringsKt.isBlank(str7) || str6 == null || StringsKt.isBlank(str6)) ? null : new ViewEvent.Synthetics(str7, str6, null);
                                int i82 = synthetics == null ? 1 : 2;
                                RumViewScope rumViewScope = this;
                                long j29 = rumViewScope.eventTimestamp;
                                ViewEvent.Context context = new ViewEvent.Context(linkedHashMap422);
                                String str8 = rumContext2.viewName;
                                String str9 = rumContext2.viewUrl;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                String str10 = str9;
                                ViewEvent.Action action = new ViewEvent.Action(j2322);
                                ViewEvent.Resource resource = new ViewEvent.Resource(j2522);
                                int i92 = i82;
                                ViewEvent.Error error = new ViewEvent.Error(j2622);
                                ViewEvent.Crash crash = new ViewEvent.Crash(j2722);
                                ViewEvent.LongTask longTask = new ViewEvent.LongTask(j2822);
                                ViewEvent.FrozenFrame frozenFrame = new ViewEvent.FrozenFrame(j13);
                                boolean z32 = !isViewComplete;
                                long j30 = j2422;
                                Double valueOf4 = (j30 < 1000000000 || (d11 = d) == null) ? null : Double.valueOf((d11.doubleValue() * 1.0E9d) / j30);
                                VitalInfo vitalInfo8 = vitalInfo5;
                                Double valueOf5 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.meanValue) : null;
                                Double valueOf6 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.maxValue) : null;
                                VitalInfo vitalInfo9 = vitalInfo722;
                                ViewEvent.ViewEventView viewEventView = new ViewEvent.ViewEventView(str422, null, str10, str8, rumViewScope.viewLoadingTime, resolveMetric, (Long) ref$ObjectRef.element, 0, j2422, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, customTimings, Boolean.valueOf(z32), Boolean.valueOf(booleanValue), action, error, crash, longTask, frozenFrame, arrayList322, resource, new ViewEvent.Frustration(i2), null, valueOf5, valueOf6, d, valueOf4, vitalInfo9 != null ? Double.valueOf(vitalInfo9.meanValue) : null, vitalInfo9 != null ? Double.valueOf(vitalInfo9.minValue) : null, d4, d3, flutterBuildTime, flutterBuildTime3, flutterBuildTime2, performance, accessibility);
                                ViewEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ViewEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                                ViewEvent.Application application = new ViewEvent.Application(rumContext2.applicationId, deviceInfo.localeInfo.currentLocale);
                                ViewEvent.ViewEventSession viewEventSession = new ViewEvent.ViewEventSession(rumContext2.sessionId, i92, Boolean.valueOf(rumViewScope.hasReplay), Boolean.valueOf(rumContext2.isSessionActive), null);
                                String str11 = datadogContext3.source;
                                InternalLogger internalLogger2 = rumViewScope.sdkCore.getInternalLogger();
                                str11.getClass();
                                internalLogger2.getClass();
                                try {
                                } catch (NoSuchElementException e) {
                                    DBUtil.log$default(internalLogger2, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str11, 24), e, false, 48);
                                    i42 = 0;
                                }
                                for (int i10 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                                    if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(i10).equals(str11)) {
                                        i42 = i10;
                                        ViewEvent.Os os = new ViewEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                        DeviceType deviceType = deviceInfo.deviceType;
                                        deviceType.getClass();
                                        switch (deviceType.ordinal()) {
                                            case 0:
                                                i52 = 1;
                                                break;
                                            case 1:
                                                i52 = 3;
                                                break;
                                            case 2:
                                                i52 = 4;
                                                break;
                                            case 3:
                                                i52 = 2;
                                                break;
                                            case 4:
                                                i52 = 5;
                                                break;
                                            case 5:
                                                i52 = 6;
                                                break;
                                            case 6:
                                                i52 = 7;
                                                break;
                                            default:
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                        }
                                        String str12 = deviceInfo.deviceName;
                                        String str13 = deviceInfo.deviceModel;
                                        String str14 = deviceInfo.deviceBrand;
                                        String str15 = deviceInfo.architecture;
                                        LocaleInfo localeInfo = deviceInfo.localeInfo;
                                        List list2 = localeInfo.locales;
                                        String str16 = localeInfo.timeZone;
                                        BatteryInfo batteryInfo22 = batteryInfo2;
                                        ViewEvent.Device device = new ViewEvent.Device(i52, str12, str13, str14, str15, null, list2, str16, batteryInfo22.batteryLevel, batteryInfo22.lowPowerMode, displayInfo2.screenBrightness);
                                        ViewEvent.Context context2 = new ViewEvent.Context(linkedHashMap3);
                                        int i11 = rumContext2.sessionStartReason;
                                        if (i11 == 0) {
                                            throw null;
                                        }
                                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i11)) {
                                            case 0:
                                                r9 = 0;
                                                i62 = 1;
                                                break;
                                            case 1:
                                                r9 = 0;
                                                i62 = 2;
                                                break;
                                            case 2:
                                                r9 = 0;
                                                i62 = 3;
                                                break;
                                            case 3:
                                                r9 = 0;
                                                i62 = 4;
                                                break;
                                            case 4:
                                                r9 = 0;
                                                i62 = 5;
                                                break;
                                            case 5:
                                                r9 = 0;
                                                i62 = 6;
                                                break;
                                            case 6:
                                                r9 = 0;
                                                i62 = 7;
                                                break;
                                            default:
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                        }
                                        ViewEvent.Dd dd = new ViewEvent.Dd(new ViewEvent.DdSession(r9, i62), new ViewEvent.Configuration(Float.valueOf(rumViewScope.sampleRate), r9, r9, r9), null, null, j7, null, replayStats, null, null);
                                        NetworkInfo networkInfo = datadogContext3.networkInfo;
                                        networkInfo.getClass();
                                        boolean isConnected = zzhy.isConnected(networkInfo);
                                        String str17 = networkInfo.carrierName;
                                        int i12 = isConnected ? 1 : 2;
                                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                            case 0:
                                                list = EmptyList.INSTANCE;
                                                break;
                                            case 1:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.ETHERNET);
                                                break;
                                            case 2:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIFI);
                                                break;
                                            case 3:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIMAX);
                                                break;
                                            case 4:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.BLUETOOTH);
                                                break;
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 9:
                                            case 10:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.CELLULAR);
                                                break;
                                            case 11:
                                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.OTHER);
                                                break;
                                            default:
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                        }
                                        String str18 = networkInfo.cellularTechnology;
                                        ViewEvent viewEvent = new ViewEvent(j29, application, datadogContext3.service, datadogContext3.version, String.valueOf(datadogContext3.versionCode), datadogContext3.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext3), viewEventSession, i42, viewEventView, usr, null, new ViewEvent.Connectivity(i12, list, 0, (str18 == null && str17 == null) ? null : new ViewEvent.Cellular(str18, str17)), null, synthetics, null, os, device, dd, context2, null, context, null);
                                        SessionEndedMetricDispatcher sessionEndedMetricDispatcher = rumViewScope.sessionEndedMetricDispatcher;
                                        String str19 = rumViewScope.sessionId;
                                        sessionEndedMetricDispatcher.getClass();
                                        str19.getClass();
                                        SessionEndedMetric sessionEndedMetric = (SessionEndedMetric) sessionEndedMetricDispatcher.metricsBySessionId.get(str19);
                                        if (sessionEndedMetric != null) {
                                            LinkedHashMap linkedHashMap5 = sessionEndedMetric.trackedViewsById;
                                            if (Intrinsics.areEqual(viewEventSession.id, sessionEndedMetric.sessionId)) {
                                                String str20 = viewEventView.id;
                                                SessionEndedMetric.TrackedView trackedView = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                                if (trackedView == null || (str52 = trackedView.viewUrl) == null) {
                                                    str52 = viewEventView.url;
                                                }
                                                String str21 = str52;
                                                SessionEndedMetric.TrackedView trackedView2 = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                                long j31 = trackedView2 != null ? trackedView2.startMs : j29;
                                                Boolean bool = viewEventSession.hasReplay;
                                                SessionEndedMetric.TrackedView trackedView3 = new SessionEndedMetric.TrackedView(j31, viewEventView.timeSpent, str21, bool != null ? bool.booleanValue() : false);
                                                linkedHashMap5.put(str20, trackedView3);
                                                if (sessionEndedMetric.firstTrackedView == null) {
                                                    sessionEndedMetric.firstTrackedView = trackedView3;
                                                }
                                                sessionEndedMetric.lastTrackedView = trackedView3;
                                                return viewEvent;
                                            }
                                        }
                                        DBUtil.log$default(sessionEndedMetricDispatcher.internalLogger, 3, InternalLogger.Target.MAINTAINER, new Rum$createMonitor$1(5, sessionEndedMetricDispatcher, str19, viewEvent), null, false, 56);
                                        return viewEvent;
                                    }
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                        }).submit();
                    }
                    DBUtil.log$default(internalLogger, 4, InternalLogger.Target.TELEMETRY, ViewEndedMetricDispatcher$sendViewEnded$1.INSTANCE, null, false, 56);
                }
                arrayList2 = arrayList;
                linkedHashMap = mutableMap;
                j5 = j11;
                j6 = j12;
                z = true;
                accessibility = null;
                this.accessibilitySnapshotManager.getClass();
                final BatteryInfo batteryInfo22 = (BatteryInfo) this.batteryInfoProvider.getState();
                final DisplayInfo displayInfo22 = (DisplayInfo) this.displayInfoProvider.getState();
                Object obj222 = this.internalAttributes.get("_dd.performance.first_build_complete");
                if (!(obj222 instanceof Number)) {
                }
                if (r6 == 0) {
                }
                str = rumContext.viewId;
                if (str == null) {
                }
                if (this.hasReplay) {
                }
                z2 = z;
                this.hasReplay = z2;
                this.featuresContextResolver.getClass();
                datadogContext2.getClass();
                map = (Map) datadogContext2.featuresContext.get("session-replay");
                long j21222 = 0;
                if (map != null) {
                }
                final VitalInfo vitalInfo7222 = vitalInfo;
                final String str4222 = str;
                final long j22222 = j21222;
                final long j23222 = j;
                final long j24222 = j2;
                final long j25222 = j3;
                final long j26222 = j4;
                final ArrayList arrayList3222 = arrayList2;
                final long j27222 = j5;
                final long j28222 = j6;
                final LinkedHashMap linkedHashMap4222 = linkedHashMap;
                SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, datadogContext, function1, dataWriter, i, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r9v10 */
                    /* JADX WARN: Type inference failed for: r9v11, types: [com.datadog.android.rum.model.ViewEvent$Plan, java.lang.Boolean, java.lang.Number] */
                    /* JADX WARN: Type inference failed for: r9v19 */
                    /* JADX WARN: Type inference failed for: r9v5 */
                    /* JADX WARN: Type inference failed for: r9v6 */
                    /* JADX WARN: Type inference failed for: r9v7 */
                    /* JADX WARN: Type inference failed for: r9v8 */
                    /* JADX WARN: Type inference failed for: r9v9 */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i42;
                        int i52;
                        ?? r9;
                        int i62;
                        List list;
                        String str52;
                        int i72;
                        Double d11;
                        DatadogContext datadogContext3 = DatadogContext.this;
                        UserInfo userInfo = datadogContext3.userInfo;
                        DeviceInfo deviceInfo = datadogContext3.deviceInfo;
                        ViewEvent.ReplayStats replayStats = new ViewEvent.ReplayStats(Long.valueOf(j22222), 0L, 0L);
                        RumContext rumContext2 = rumContext;
                        String str6 = rumContext2.syntheticsResultId;
                        String str7 = rumContext2.syntheticsTestId;
                        ViewEvent.Synthetics synthetics = (str7 == null || StringsKt.isBlank(str7) || str6 == null || StringsKt.isBlank(str6)) ? null : new ViewEvent.Synthetics(str7, str6, null);
                        int i82 = synthetics == null ? 1 : 2;
                        RumViewScope rumViewScope = this;
                        long j29 = rumViewScope.eventTimestamp;
                        ViewEvent.Context context = new ViewEvent.Context(linkedHashMap4222);
                        String str8 = rumContext2.viewName;
                        String str9 = rumContext2.viewUrl;
                        if (str9 == null) {
                            str9 = "";
                        }
                        String str10 = str9;
                        ViewEvent.Action action = new ViewEvent.Action(j23222);
                        ViewEvent.Resource resource = new ViewEvent.Resource(j25222);
                        int i92 = i82;
                        ViewEvent.Error error = new ViewEvent.Error(j26222);
                        ViewEvent.Crash crash = new ViewEvent.Crash(j27222);
                        ViewEvent.LongTask longTask = new ViewEvent.LongTask(j28222);
                        ViewEvent.FrozenFrame frozenFrame = new ViewEvent.FrozenFrame(j13);
                        boolean z32 = !isViewComplete;
                        long j30 = j24222;
                        Double valueOf4 = (j30 < 1000000000 || (d11 = d) == null) ? null : Double.valueOf((d11.doubleValue() * 1.0E9d) / j30);
                        VitalInfo vitalInfo8 = vitalInfo5;
                        Double valueOf5 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.meanValue) : null;
                        Double valueOf6 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.maxValue) : null;
                        VitalInfo vitalInfo9 = vitalInfo7222;
                        ViewEvent.ViewEventView viewEventView = new ViewEvent.ViewEventView(str4222, null, str10, str8, rumViewScope.viewLoadingTime, resolveMetric, (Long) ref$ObjectRef.element, 0, j24222, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, customTimings, Boolean.valueOf(z32), Boolean.valueOf(booleanValue), action, error, crash, longTask, frozenFrame, arrayList3222, resource, new ViewEvent.Frustration(i2), null, valueOf5, valueOf6, d, valueOf4, vitalInfo9 != null ? Double.valueOf(vitalInfo9.meanValue) : null, vitalInfo9 != null ? Double.valueOf(vitalInfo9.minValue) : null, d4, d3, flutterBuildTime, flutterBuildTime3, flutterBuildTime2, performance, accessibility);
                        ViewEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ViewEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                        ViewEvent.Application application = new ViewEvent.Application(rumContext2.applicationId, deviceInfo.localeInfo.currentLocale);
                        ViewEvent.ViewEventSession viewEventSession = new ViewEvent.ViewEventSession(rumContext2.sessionId, i92, Boolean.valueOf(rumViewScope.hasReplay), Boolean.valueOf(rumContext2.isSessionActive), null);
                        String str11 = datadogContext3.source;
                        InternalLogger internalLogger2 = rumViewScope.sdkCore.getInternalLogger();
                        str11.getClass();
                        internalLogger2.getClass();
                        try {
                        } catch (NoSuchElementException e) {
                            DBUtil.log$default(internalLogger2, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str11, 24), e, false, 48);
                            i42 = 0;
                        }
                        for (int i10 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                            if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(i10).equals(str11)) {
                                i42 = i10;
                                ViewEvent.Os os = new ViewEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                DeviceType deviceType = deviceInfo.deviceType;
                                deviceType.getClass();
                                switch (deviceType.ordinal()) {
                                    case 0:
                                        i52 = 1;
                                        break;
                                    case 1:
                                        i52 = 3;
                                        break;
                                    case 2:
                                        i52 = 4;
                                        break;
                                    case 3:
                                        i52 = 2;
                                        break;
                                    case 4:
                                        i52 = 5;
                                        break;
                                    case 5:
                                        i52 = 6;
                                        break;
                                    case 6:
                                        i52 = 7;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                }
                                String str12 = deviceInfo.deviceName;
                                String str13 = deviceInfo.deviceModel;
                                String str14 = deviceInfo.deviceBrand;
                                String str15 = deviceInfo.architecture;
                                LocaleInfo localeInfo = deviceInfo.localeInfo;
                                List list2 = localeInfo.locales;
                                String str16 = localeInfo.timeZone;
                                BatteryInfo batteryInfo222 = batteryInfo22;
                                ViewEvent.Device device = new ViewEvent.Device(i52, str12, str13, str14, str15, null, list2, str16, batteryInfo222.batteryLevel, batteryInfo222.lowPowerMode, displayInfo22.screenBrightness);
                                ViewEvent.Context context2 = new ViewEvent.Context(linkedHashMap3);
                                int i11 = rumContext2.sessionStartReason;
                                if (i11 == 0) {
                                    throw null;
                                }
                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i11)) {
                                    case 0:
                                        r9 = 0;
                                        i62 = 1;
                                        break;
                                    case 1:
                                        r9 = 0;
                                        i62 = 2;
                                        break;
                                    case 2:
                                        r9 = 0;
                                        i62 = 3;
                                        break;
                                    case 3:
                                        r9 = 0;
                                        i62 = 4;
                                        break;
                                    case 4:
                                        r9 = 0;
                                        i62 = 5;
                                        break;
                                    case 5:
                                        r9 = 0;
                                        i62 = 6;
                                        break;
                                    case 6:
                                        r9 = 0;
                                        i62 = 7;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                }
                                ViewEvent.Dd dd = new ViewEvent.Dd(new ViewEvent.DdSession(r9, i62), new ViewEvent.Configuration(Float.valueOf(rumViewScope.sampleRate), r9, r9, r9), null, null, j7, null, replayStats, null, null);
                                NetworkInfo networkInfo = datadogContext3.networkInfo;
                                networkInfo.getClass();
                                boolean isConnected = zzhy.isConnected(networkInfo);
                                String str17 = networkInfo.carrierName;
                                int i12 = isConnected ? 1 : 2;
                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                    case 0:
                                        list = EmptyList.INSTANCE;
                                        break;
                                    case 1:
                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.ETHERNET);
                                        break;
                                    case 2:
                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIFI);
                                        break;
                                    case 3:
                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIMAX);
                                        break;
                                    case 4:
                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.BLUETOOTH);
                                        break;
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.CELLULAR);
                                        break;
                                    case 11:
                                        list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.OTHER);
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                }
                                String str18 = networkInfo.cellularTechnology;
                                ViewEvent viewEvent = new ViewEvent(j29, application, datadogContext3.service, datadogContext3.version, String.valueOf(datadogContext3.versionCode), datadogContext3.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext3), viewEventSession, i42, viewEventView, usr, null, new ViewEvent.Connectivity(i12, list, 0, (str18 == null && str17 == null) ? null : new ViewEvent.Cellular(str18, str17)), null, synthetics, null, os, device, dd, context2, null, context, null);
                                SessionEndedMetricDispatcher sessionEndedMetricDispatcher = rumViewScope.sessionEndedMetricDispatcher;
                                String str19 = rumViewScope.sessionId;
                                sessionEndedMetricDispatcher.getClass();
                                str19.getClass();
                                SessionEndedMetric sessionEndedMetric = (SessionEndedMetric) sessionEndedMetricDispatcher.metricsBySessionId.get(str19);
                                if (sessionEndedMetric != null) {
                                    LinkedHashMap linkedHashMap5 = sessionEndedMetric.trackedViewsById;
                                    if (Intrinsics.areEqual(viewEventSession.id, sessionEndedMetric.sessionId)) {
                                        String str20 = viewEventView.id;
                                        SessionEndedMetric.TrackedView trackedView = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                        if (trackedView == null || (str52 = trackedView.viewUrl) == null) {
                                            str52 = viewEventView.url;
                                        }
                                        String str21 = str52;
                                        SessionEndedMetric.TrackedView trackedView2 = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                        long j31 = trackedView2 != null ? trackedView2.startMs : j29;
                                        Boolean bool = viewEventSession.hasReplay;
                                        SessionEndedMetric.TrackedView trackedView3 = new SessionEndedMetric.TrackedView(j31, viewEventView.timeSpent, str21, bool != null ? bool.booleanValue() : false);
                                        linkedHashMap5.put(str20, trackedView3);
                                        if (sessionEndedMetric.firstTrackedView == null) {
                                            sessionEndedMetric.firstTrackedView = trackedView3;
                                        }
                                        sessionEndedMetric.lastTrackedView = trackedView3;
                                        return viewEvent;
                                    }
                                }
                                DBUtil.log$default(sessionEndedMetricDispatcher.internalLogger, 3, InternalLogger.Target.MAINTAINER, new Rum$createMonitor$1(5, sessionEndedMetricDispatcher, str19, viewEvent), null, false, 56);
                                return viewEvent;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }).submit();
            }
            j2 = j14;
        } else {
            j2 = j14;
            vitalInfo = vitalInfo6;
        }
        viewUIPerformanceReport = null;
        if (viewUIPerformanceReport != null) {
        }
        j3 = j10;
        j4 = j9;
        arrayList = null;
        if (isViewComplete) {
        }
        d3 = null;
        if (isViewComplete) {
        }
        d4 = null;
        this.insightsCollector.getClass();
        if (isViewComplete) {
        }
        arrayList2 = arrayList;
        linkedHashMap = mutableMap;
        j5 = j11;
        j6 = j12;
        z = true;
        accessibility = null;
        this.accessibilitySnapshotManager.getClass();
        final BatteryInfo batteryInfo222 = (BatteryInfo) this.batteryInfoProvider.getState();
        final DisplayInfo displayInfo222 = (DisplayInfo) this.displayInfoProvider.getState();
        Object obj2222 = this.internalAttributes.get("_dd.performance.first_build_complete");
        if (!(obj2222 instanceof Number)) {
        }
        if (r6 == 0) {
        }
        str = rumContext.viewId;
        if (str == null) {
        }
        if (this.hasReplay) {
        }
        z2 = z;
        this.hasReplay = z2;
        this.featuresContextResolver.getClass();
        datadogContext2.getClass();
        map = (Map) datadogContext2.featuresContext.get("session-replay");
        long j212222 = 0;
        if (map != null) {
        }
        final VitalInfo vitalInfo72222 = vitalInfo;
        final String str42222 = str;
        final long j222222 = j212222;
        final long j232222 = j;
        final long j242222 = j2;
        final long j252222 = j3;
        final long j262222 = j4;
        final ArrayList arrayList32222 = arrayList2;
        final long j272222 = j5;
        final long j282222 = j6;
        final LinkedHashMap linkedHashMap42222 = linkedHashMap;
        SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, datadogContext, function1, dataWriter, i, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewScope$sendViewUpdate$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r9v10 */
            /* JADX WARN: Type inference failed for: r9v11, types: [com.datadog.android.rum.model.ViewEvent$Plan, java.lang.Boolean, java.lang.Number] */
            /* JADX WARN: Type inference failed for: r9v19 */
            /* JADX WARN: Type inference failed for: r9v5 */
            /* JADX WARN: Type inference failed for: r9v6 */
            /* JADX WARN: Type inference failed for: r9v7 */
            /* JADX WARN: Type inference failed for: r9v8 */
            /* JADX WARN: Type inference failed for: r9v9 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42;
                int i52;
                ?? r9;
                int i62;
                List list;
                String str52;
                int i72;
                Double d11;
                DatadogContext datadogContext3 = DatadogContext.this;
                UserInfo userInfo = datadogContext3.userInfo;
                DeviceInfo deviceInfo = datadogContext3.deviceInfo;
                ViewEvent.ReplayStats replayStats = new ViewEvent.ReplayStats(Long.valueOf(j222222), 0L, 0L);
                RumContext rumContext2 = rumContext;
                String str6 = rumContext2.syntheticsResultId;
                String str7 = rumContext2.syntheticsTestId;
                ViewEvent.Synthetics synthetics = (str7 == null || StringsKt.isBlank(str7) || str6 == null || StringsKt.isBlank(str6)) ? null : new ViewEvent.Synthetics(str7, str6, null);
                int i82 = synthetics == null ? 1 : 2;
                RumViewScope rumViewScope = this;
                long j29 = rumViewScope.eventTimestamp;
                ViewEvent.Context context = new ViewEvent.Context(linkedHashMap42222);
                String str8 = rumContext2.viewName;
                String str9 = rumContext2.viewUrl;
                if (str9 == null) {
                    str9 = "";
                }
                String str10 = str9;
                ViewEvent.Action action = new ViewEvent.Action(j232222);
                ViewEvent.Resource resource = new ViewEvent.Resource(j252222);
                int i92 = i82;
                ViewEvent.Error error = new ViewEvent.Error(j262222);
                ViewEvent.Crash crash = new ViewEvent.Crash(j272222);
                ViewEvent.LongTask longTask = new ViewEvent.LongTask(j282222);
                ViewEvent.FrozenFrame frozenFrame = new ViewEvent.FrozenFrame(j13);
                boolean z32 = !isViewComplete;
                long j30 = j242222;
                Double valueOf4 = (j30 < 1000000000 || (d11 = d) == null) ? null : Double.valueOf((d11.doubleValue() * 1.0E9d) / j30);
                VitalInfo vitalInfo8 = vitalInfo5;
                Double valueOf5 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.meanValue) : null;
                Double valueOf6 = vitalInfo8 != null ? Double.valueOf(vitalInfo8.maxValue) : null;
                VitalInfo vitalInfo9 = vitalInfo72222;
                ViewEvent.ViewEventView viewEventView = new ViewEvent.ViewEventView(str42222, null, str10, str8, rumViewScope.viewLoadingTime, resolveMetric, (Long) ref$ObjectRef.element, 0, j242222, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, customTimings, Boolean.valueOf(z32), Boolean.valueOf(booleanValue), action, error, crash, longTask, frozenFrame, arrayList32222, resource, new ViewEvent.Frustration(i2), null, valueOf5, valueOf6, d, valueOf4, vitalInfo9 != null ? Double.valueOf(vitalInfo9.meanValue) : null, vitalInfo9 != null ? Double.valueOf(vitalInfo9.minValue) : null, d4, d3, flutterBuildTime, flutterBuildTime3, flutterBuildTime2, performance, accessibility);
                ViewEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ViewEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                ViewEvent.Application application = new ViewEvent.Application(rumContext2.applicationId, deviceInfo.localeInfo.currentLocale);
                ViewEvent.ViewEventSession viewEventSession = new ViewEvent.ViewEventSession(rumContext2.sessionId, i92, Boolean.valueOf(rumViewScope.hasReplay), Boolean.valueOf(rumContext2.isSessionActive), null);
                String str11 = datadogContext3.source;
                InternalLogger internalLogger2 = rumViewScope.sdkCore.getInternalLogger();
                str11.getClass();
                internalLogger2.getClass();
                try {
                } catch (NoSuchElementException e) {
                    DBUtil.log$default(internalLogger2, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str11, 24), e, false, 48);
                    i42 = 0;
                }
                for (int i10 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                    if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(i10).equals(str11)) {
                        i42 = i10;
                        ViewEvent.Os os = new ViewEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                        DeviceType deviceType = deviceInfo.deviceType;
                        deviceType.getClass();
                        switch (deviceType.ordinal()) {
                            case 0:
                                i52 = 1;
                                break;
                            case 1:
                                i52 = 3;
                                break;
                            case 2:
                                i52 = 4;
                                break;
                            case 3:
                                i52 = 2;
                                break;
                            case 4:
                                i52 = 5;
                                break;
                            case 5:
                                i52 = 6;
                                break;
                            case 6:
                                i52 = 7;
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        String str12 = deviceInfo.deviceName;
                        String str13 = deviceInfo.deviceModel;
                        String str14 = deviceInfo.deviceBrand;
                        String str15 = deviceInfo.architecture;
                        LocaleInfo localeInfo = deviceInfo.localeInfo;
                        List list2 = localeInfo.locales;
                        String str16 = localeInfo.timeZone;
                        BatteryInfo batteryInfo2222 = batteryInfo222;
                        ViewEvent.Device device = new ViewEvent.Device(i52, str12, str13, str14, str15, null, list2, str16, batteryInfo2222.batteryLevel, batteryInfo2222.lowPowerMode, displayInfo222.screenBrightness);
                        ViewEvent.Context context2 = new ViewEvent.Context(linkedHashMap3);
                        int i11 = rumContext2.sessionStartReason;
                        if (i11 == 0) {
                            throw null;
                        }
                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i11)) {
                            case 0:
                                r9 = 0;
                                i62 = 1;
                                break;
                            case 1:
                                r9 = 0;
                                i62 = 2;
                                break;
                            case 2:
                                r9 = 0;
                                i62 = 3;
                                break;
                            case 3:
                                r9 = 0;
                                i62 = 4;
                                break;
                            case 4:
                                r9 = 0;
                                i62 = 5;
                                break;
                            case 5:
                                r9 = 0;
                                i62 = 6;
                                break;
                            case 6:
                                r9 = 0;
                                i62 = 7;
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        ViewEvent.Dd dd = new ViewEvent.Dd(new ViewEvent.DdSession(r9, i62), new ViewEvent.Configuration(Float.valueOf(rumViewScope.sampleRate), r9, r9, r9), null, null, j7, null, replayStats, null, null);
                        NetworkInfo networkInfo = datadogContext3.networkInfo;
                        networkInfo.getClass();
                        boolean isConnected = zzhy.isConnected(networkInfo);
                        String str17 = networkInfo.carrierName;
                        int i12 = isConnected ? 1 : 2;
                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                            case 0:
                                list = EmptyList.INSTANCE;
                                break;
                            case 1:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.ETHERNET);
                                break;
                            case 2:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIFI);
                                break;
                            case 3:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.WIMAX);
                                break;
                            case 4:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.BLUETOOTH);
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.CELLULAR);
                                break;
                            case 11:
                                list = CollectionsKt__CollectionsJVMKt.listOf(ViewEvent.Interface.OTHER);
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                        String str18 = networkInfo.cellularTechnology;
                        ViewEvent viewEvent = new ViewEvent(j29, application, datadogContext3.service, datadogContext3.version, String.valueOf(datadogContext3.versionCode), datadogContext3.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext3), viewEventSession, i42, viewEventView, usr, null, new ViewEvent.Connectivity(i12, list, 0, (str18 == null && str17 == null) ? null : new ViewEvent.Cellular(str18, str17)), null, synthetics, null, os, device, dd, context2, null, context, null);
                        SessionEndedMetricDispatcher sessionEndedMetricDispatcher = rumViewScope.sessionEndedMetricDispatcher;
                        String str19 = rumViewScope.sessionId;
                        sessionEndedMetricDispatcher.getClass();
                        str19.getClass();
                        SessionEndedMetric sessionEndedMetric = (SessionEndedMetric) sessionEndedMetricDispatcher.metricsBySessionId.get(str19);
                        if (sessionEndedMetric != null) {
                            LinkedHashMap linkedHashMap5 = sessionEndedMetric.trackedViewsById;
                            if (Intrinsics.areEqual(viewEventSession.id, sessionEndedMetric.sessionId)) {
                                String str20 = viewEventView.id;
                                SessionEndedMetric.TrackedView trackedView = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                if (trackedView == null || (str52 = trackedView.viewUrl) == null) {
                                    str52 = viewEventView.url;
                                }
                                String str21 = str52;
                                SessionEndedMetric.TrackedView trackedView2 = (SessionEndedMetric.TrackedView) linkedHashMap5.get(str20);
                                long j31 = trackedView2 != null ? trackedView2.startMs : j29;
                                Boolean bool = viewEventSession.hasReplay;
                                SessionEndedMetric.TrackedView trackedView3 = new SessionEndedMetric.TrackedView(j31, viewEventView.timeSpent, str21, bool != null ? bool.booleanValue() : false);
                                linkedHashMap5.put(str20, trackedView3);
                                if (sessionEndedMetric.firstTrackedView == null) {
                                    sessionEndedMetric.firstTrackedView = trackedView3;
                                }
                                sessionEndedMetric.lastTrackedView = trackedView3;
                                return viewEvent;
                            }
                        }
                        DBUtil.log$default(sessionEndedMetricDispatcher.internalLogger, 3, InternalLogger.Target.MAINTAINER, new Rum$createMonitor$1(5, sessionEndedMetricDispatcher, str19, viewEvent), null, false, 56);
                        return viewEvent;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }).submit();
    }

    public final void stopScope(RumRawEvent rumRawEvent, DatadogContext datadogContext, Function1 function1, DataWriter dataWriter, Function0 function0) {
        if (this.stopped) {
            return;
        }
        function0.invoke();
        this.stopped = true;
        resolveViewDuration(rumRawEvent);
        sendViewUpdate(rumRawEvent, datadogContext, function1, dataWriter, 1);
        delegateEventToChildren(rumRawEvent, datadogContext, function1, dataWriter);
        RumViewChangedListener rumViewChangedListener = this.viewChangedListener;
        if (rumViewChangedListener != null) {
            RumScopeKey rumScopeKey = this.key;
            LinkedHashMap linkedHashMap = this.viewAttributes;
            boolean z = this.stopped;
            RumViewInfo rumViewInfo = new RumViewInfo(rumScopeKey, linkedHashMap, !z);
            RumApplicationScope rumApplicationScope = (RumApplicationScope) rumViewChangedListener;
            if (!z) {
                rumApplicationScope.lastActiveViewInfo = rumViewInfo;
            }
        }
        this.cpuVitalMonitor.unregister(this.cpuVitalListener);
        this.memoryVitalMonitor.unregister(this.memoryVitalListener);
        this.frameRateVitalMonitor.unregister(this.frameRateVitalListener);
        NetworkSettledMetricResolver networkSettledMetricResolver = this.networkSettledMetricResolver;
        networkSettledMetricResolver.viewWasStopped = true;
        networkSettledMetricResolver.resourceStartedTimestamps.clear();
    }

    public RumViewScope(RumViewManagerScope rumViewManagerScope, InternalSdkCore internalSdkCore, SessionEndedMetricDispatcher sessionEndedMetricDispatcher, RumScopeKey rumScopeKey, Time time, Map map, RumApplicationScope rumApplicationScope, OneShotDisposable oneShotDisposable, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, int i, boolean z, float f, JWECryptoParts jWECryptoParts, NetworkSettledMetricResolver networkSettledMetricResolver, DefaultSlowFramesListener defaultSlowFramesListener, zzm zzmVar, GlideBuilder$1 glideBuilder$1, InfoProvider infoProvider, InfoProvider infoProvider2, HurlStack hurlStack) {
        this(rumViewManagerScope, internalSdkCore, sessionEndedMetricDispatcher, rumScopeKey, time, map, rumApplicationScope, oneShotDisposable, vitalMonitor, vitalMonitor2, vitalMonitor3, new CueEncoder(27), i, z, f, jWECryptoParts, networkSettledMetricResolver, defaultSlowFramesListener, zzmVar, glideBuilder$1, infoProvider, infoProvider2, hurlStack);
    }
}
