package com.datadog.android.rum.internal.domain.scope;

import androidx.glance.appwidget.SizeBoxKt$ForEachSize$sizes$1$1;
import androidx.room.util.DBUtil;
import coil3.request.OneShotDisposable;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import com.bumptech.glide.GlideBuilder$1;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.internal.attributes.ViewScopeInstrumentationType;
import com.datadog.android.internal.telemetry.InternalTelemetryEvent$ApiUsage$AddViewLoadingTime;
import com.datadog.android.rum.DdRumContentProvider;
import com.datadog.android.rum.internal.anr.ANRException;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.datadog.android.rum.internal.metric.interactiontonextview.ActionTypeInteractionValidator;
import com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver;
import com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener;
import com.datadog.android.rum.internal.vitals.NoOpVitalMonitor;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzhs;
import com.google.android.gms.internal.mlkit_vision_common.zzhz;
import com.google.mlkit.vision.face.internal.zzm;
import com.nimbusds.jose.JWECryptoParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class RumViewManagerScope implements RumScope {
    public final GlideBuilder$1 accessibilitySnapshotManager;
    public boolean applicationDisplayed;
    public final boolean backgroundTrackingEnabled;
    public final InfoProvider batteryInfoProvider;
    public final ArrayList childrenScopes;
    public final VitalMonitor cpuVitalMonitor;
    public final InfoProvider displayInfoProvider;
    public final OneShotDisposable firstPartyHostHeaderTypeResolver;
    public final VitalMonitor frameRateVitalMonitor;
    public final InitialResourceIdentifier initialResourceIdentifier;
    public final HurlStack insightsCollector;
    public final JWECryptoParts interactionToNextViewMetricResolver;
    public Time lastStoppedViewTime;
    public final VitalMonitor memoryVitalMonitor;
    public final RumSessionScope parentScope;
    public final float sampleRate;
    public final InternalSdkCore sdkCore;
    public final SessionEndedMetricDispatcher sessionEndedMetricDispatcher;
    public final DefaultSlowFramesListener slowFramesListener;
    public final boolean trackFrustrations;
    public final RumApplicationScope viewChangedListener;
    public static final Class[] validBackgroundEventTypes = {RumRawEvent.AddError.class, RumRawEvent.StartAction.class, RumRawEvent.StartResource.class, RumRawEvent.StartFeatureOperation.class, RumRawEvent.StopFeatureOperation.class};
    public static final Class[] silentOrphanEventTypes = {RumRawEvent.ApplicationStarted.class, RumRawEvent.KeepAlive.class, RumRawEvent.ResetSession.class, RumRawEvent.StopView.class, RumRawEvent.ActionDropped.class, RumRawEvent.ActionSent.class, RumRawEvent.ErrorDropped.class, RumRawEvent.ErrorSent.class, RumRawEvent.LongTaskDropped.class, RumRawEvent.LongTaskSent.class, RumRawEvent.ResourceDropped.class, RumRawEvent.ResourceSent.class, RumRawEvent.UpdatePerformanceMetric.class, RumRawEvent.UpdateExternalRefreshRate.class};

    public RumViewManagerScope(RumSessionScope rumSessionScope, InternalSdkCore internalSdkCore, SessionEndedMetricDispatcher sessionEndedMetricDispatcher, boolean z, boolean z2, RumApplicationScope rumApplicationScope, OneShotDisposable oneShotDisposable, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, boolean z3, float f, InitialResourceIdentifier initialResourceIdentifier, DefaultSlowFramesListener defaultSlowFramesListener, LastInteractionIdentifier lastInteractionIdentifier, GlideBuilder$1 glideBuilder$1, InfoProvider infoProvider, InfoProvider infoProvider2, HurlStack hurlStack) {
        oneShotDisposable.getClass();
        vitalMonitor.getClass();
        vitalMonitor2.getClass();
        vitalMonitor3.getClass();
        initialResourceIdentifier.getClass();
        glideBuilder$1.getClass();
        infoProvider.getClass();
        infoProvider2.getClass();
        hurlStack.getClass();
        this.parentScope = rumSessionScope;
        this.sdkCore = internalSdkCore;
        this.sessionEndedMetricDispatcher = sessionEndedMetricDispatcher;
        this.backgroundTrackingEnabled = z;
        this.trackFrustrations = z2;
        this.viewChangedListener = rumApplicationScope;
        this.firstPartyHostHeaderTypeResolver = oneShotDisposable;
        this.cpuVitalMonitor = vitalMonitor;
        this.memoryVitalMonitor = vitalMonitor2;
        this.frameRateVitalMonitor = vitalMonitor3;
        this.applicationDisplayed = z3;
        this.sampleRate = f;
        this.initialResourceIdentifier = initialResourceIdentifier;
        this.slowFramesListener = defaultSlowFramesListener;
        this.accessibilitySnapshotManager = glideBuilder$1;
        this.batteryInfoProvider = infoProvider;
        this.displayInfoProvider = infoProvider2;
        this.insightsCollector = hurlStack;
        InternalLogger internalLogger = internalSdkCore.getInternalLogger();
        ActionTypeInteractionValidator actionTypeInteractionValidator = new ActionTypeInteractionValidator();
        internalLogger.getClass();
        JWECryptoParts jWECryptoParts = new JWECryptoParts();
        jWECryptoParts.header = internalLogger;
        jWECryptoParts.encryptedKey = actionTypeInteractionValidator;
        jWECryptoParts.iv = lastInteractionIdentifier;
        jWECryptoParts.cipherText = new LinkedHashMap();
        jWECryptoParts.authenticationTag = new LinkedHashMap();
        this.interactionToNextViewMetricResolver = jWECryptoParts;
        this.childrenScopes = new ArrayList();
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final Map getCustomAttributes() {
        return zzhz.getCustomAttributes(this);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumScope getParentScope() {
        return this.parentScope;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumContext getRumContext() {
        return this.parentScope.getRumContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03d2  */
    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RumScope handleEvent(RumRawEvent rumRawEvent, DatadogContext datadogContext, Function1 function1, DataWriter dataWriter) {
        int i;
        boolean z;
        SessionEndedMetricDispatcher sessionEndedMetricDispatcher;
        SessionEndedMetric.MissedEventType missedEventType;
        Object obj;
        InternalSdkCore internalSdkCore;
        SdkFeature feature;
        InternalSdkCore internalSdkCore2;
        final RumRawEvent rumRawEvent2 = rumRawEvent;
        rumRawEvent2.getClass();
        datadogContext.getClass();
        function1.getClass();
        dataWriter.getClass();
        boolean z2 = rumRawEvent2 instanceof RumRawEvent.ApplicationStarted;
        RumApplicationScope rumApplicationScope = this.viewChangedListener;
        SessionEndedMetricDispatcher sessionEndedMetricDispatcher2 = this.sessionEndedMetricDispatcher;
        InitialResourceIdentifier initialResourceIdentifier = this.initialResourceIdentifier;
        ArrayList arrayList = this.childrenScopes;
        InternalSdkCore internalSdkCore3 = this.sdkCore;
        if (z2 && !this.applicationDisplayed) {
            RumRawEvent.ApplicationStarted applicationStarted = (RumRawEvent.ApplicationStarted) rumRawEvent2;
            Time time = applicationStarted.eventTime;
            NetworkSettledMetricResolver networkSettledMetricResolver = new NetworkSettledMetricResolver(initialResourceIdentifier, internalSdkCore3.getInternalLogger());
            zzm zzmVar = new zzm(4, internalSdkCore3.getInternalLogger(), null, 12);
            RumScopeKey rumScopeKey = new RumScopeKey("com.datadog.application-launch.view", "com/datadog/application-launch/view", "ApplicationLaunch");
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            RumViewScope rumViewScope = new RumViewScope(this, internalSdkCore3, sessionEndedMetricDispatcher2, rumScopeKey, time, emptyMap, rumApplicationScope, this.firstPartyHostHeaderTypeResolver, new NoOpVitalMonitor(), new NoOpVitalMonitor(), new NoOpVitalMonitor(), 4, this.trackFrustrations, this.sampleRate, this.interactionToNextViewMetricResolver, networkSettledMetricResolver, this.slowFramesListener, zzmVar, this.accessibilitySnapshotManager, this.batteryInfoProvider, this.displayInfoProvider, this.insightsCollector);
            this.applicationDisplayed = true;
            rumViewScope.handleEvent(applicationStarted, datadogContext, function1, dataWriter);
            arrayList.add(rumViewScope);
            return this;
        }
        final boolean isEmpty = arrayList.isEmpty();
        Iterator it = arrayList.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            RumViewScope rumViewScope2 = (RumViewScope) it.next();
            boolean z4 = rumViewScope2.stopped;
            z3 |= !z4;
            if (!(rumRawEvent2 instanceof RumRawEvent.StopView) || z4) {
                internalSdkCore2 = internalSdkCore3;
            } else {
                RumScopeKey rumScopeKey2 = rumViewScope2.key;
                RumRawEvent.StopView stopView = (RumRawEvent.StopView) rumRawEvent2;
                internalSdkCore2 = internalSdkCore3;
                if (Intrinsics.areEqual(rumScopeKey2 != null ? rumScopeKey2.id : null, stopView.key.id)) {
                    this.lastStoppedViewTime = stopView.eventTime;
                }
            }
            if (rumViewScope2.handleEvent(rumRawEvent2, datadogContext, function1, dataWriter) == null) {
                it.remove();
            }
            internalSdkCore3 = internalSdkCore2;
        }
        InternalSdkCore internalSdkCore4 = internalSdkCore3;
        boolean z5 = rumRawEvent2 instanceof RumRawEvent.AddViewLoadingTime;
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (z5 && !z3) {
            DBUtil.log$default(internalSdkCore4.getInternalLogger(), 4, target, RumViewScope$stopScope$1.INSTANCE$5, null, false, 56);
            InternalLogger internalLogger = internalSdkCore4.getInternalLogger();
            Function0 function0 = new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumViewManagerScope$delegateToChildren$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ((RumRawEvent.AddViewLoadingTime) RumRawEvent.this).getClass();
                    boolean z6 = isEmpty;
                    return new InternalTelemetryEvent$ApiUsage$AddViewLoadingTime(false, z6, !z6);
                }
            };
            zzlj zzljVar = (zzlj) internalLogger;
            zzljVar.getClass();
            if (new AndroidSvg(15.0f).sample(Unit.INSTANCE) && (internalSdkCore = (InternalSdkCore) zzljVar.zza) != null && (feature = internalSdkCore.getFeature("rum")) != null) {
                InternalTelemetryEvent$ApiUsage$AddViewLoadingTime internalTelemetryEvent$ApiUsage$AddViewLoadingTime = (InternalTelemetryEvent$ApiUsage$AddViewLoadingTime) function0.invoke();
                zzhs.enrichWithNonNullAttribute(internalTelemetryEvent$ApiUsage$AddViewLoadingTime.getAdditionalProperties(), 2, Float.valueOf(15.0f));
                feature.sendEvent(internalTelemetryEvent$ApiUsage$AddViewLoadingTime);
            }
        }
        if (rumRawEvent2 instanceof RumRawEvent.StartView) {
            RumRawEvent.StartView startView = (RumRawEvent.StartView) rumRawEvent2;
            Time time2 = startView.eventTime;
            OneShotDisposable oneShotDisposable = this.firstPartyHostHeaderTypeResolver;
            oneShotDisposable.getClass();
            VitalMonitor vitalMonitor = this.cpuVitalMonitor;
            vitalMonitor.getClass();
            VitalMonitor vitalMonitor2 = this.memoryVitalMonitor;
            vitalMonitor2.getClass();
            VitalMonitor vitalMonitor3 = this.frameRateVitalMonitor;
            vitalMonitor3.getClass();
            JWECryptoParts jWECryptoParts = this.interactionToNextViewMetricResolver;
            jWECryptoParts.getClass();
            initialResourceIdentifier.getClass();
            GlideBuilder$1 glideBuilder$1 = this.accessibilitySnapshotManager;
            glideBuilder$1.getClass();
            InfoProvider infoProvider = this.batteryInfoProvider;
            infoProvider.getClass();
            InfoProvider infoProvider2 = this.displayInfoProvider;
            infoProvider2.getClass();
            HurlStack hurlStack = this.insightsCollector;
            hurlStack.getClass();
            NetworkSettledMetricResolver networkSettledMetricResolver2 = new NetworkSettledMetricResolver(initialResourceIdentifier, internalSdkCore4.getInternalLogger());
            InternalLogger internalLogger2 = internalSdkCore4.getInternalLogger();
            Map map = startView.attributes;
            Object obj2 = map.get("_dd.local.view_instrumentation_type_key");
            RumViewScope rumViewScope3 = new RumViewScope(this, internalSdkCore4, sessionEndedMetricDispatcher2, startView.key, time2, startView.attributes, rumApplicationScope, oneShotDisposable, vitalMonitor, vitalMonitor2, vitalMonitor3, 2, this.trackFrustrations, this.sampleRate, jWECryptoParts, networkSettledMetricResolver2, this.slowFramesListener, new zzm(2, internalLogger2, obj2 instanceof ViewScopeInstrumentationType ? (ViewScopeInstrumentationType) obj2 : null, 8), glideBuilder$1, infoProvider, infoProvider2, hurlStack);
            this.applicationDisplayed = true;
            arrayList.add(rumViewScope3);
            rumViewScope3.handleEvent(new RumRawEvent.KeepAlive(), datadogContext, function1, dataWriter);
            rumApplicationScope.lastActiveViewInfo = new RumViewInfo(startView.key, map, true);
            Time time3 = this.lastStoppedViewTime;
            if (time3 != null) {
                long j = time2.nanoTime - time3.nanoTime;
                if (1 <= j && j < 3000000000L) {
                    ((zzlj) internalSdkCore4.getInternalLogger()).logMetric(new SizeBoxKt$ForEachSize$sizes$1$1(j, 1), MapsKt__MapsJVMKt.mapOf(new Pair("view_gap", Long.valueOf(j))), 1.0f, null);
                } else if (j < 0) {
                    ((zzlj) internalSdkCore4.getInternalLogger()).logMetric(new SizeBoxKt$ForEachSize$sizes$1$1(j, 2), MapsKt__MapsJVMKt.mapOf(new Pair("view_gap", Long.valueOf(j))), 1.0f, null);
                }
            }
            this.lastStoppedViewTime = null;
        } else {
            SessionEndedMetric.MissedEventType missedEventType2 = null;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (!((RumViewScope) it2.next()).stopped && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            if (i == 0) {
                boolean z6 = DdRumContentProvider.processImportance == 100;
                if (z5) {
                    DBUtil.log$default(internalSdkCore4.getInternalLogger(), 4, target, RumViewScope$stopScope$1.INSTANCE$7, null, false, 56);
                } else {
                    boolean z7 = this.applicationDisplayed;
                    Class[] clsArr = silentOrphanEventTypes;
                    if (z7 || !z6) {
                        if (!(rumRawEvent2 instanceof RumRawEvent.AddError) || !(((RumRawEvent.AddError) rumRawEvent2).throwable instanceof ANRException)) {
                            boolean contains = ArraysKt___ArraysKt.contains(validBackgroundEventTypes, rumRawEvent2.getClass());
                            boolean contains2 = ArraysKt___ArraysKt.contains(clsArr, rumRawEvent2.getClass());
                            if (contains && this.backgroundTrackingEnabled) {
                                NetworkSettledMetricResolver networkSettledMetricResolver3 = new NetworkSettledMetricResolver(initialResourceIdentifier, internalSdkCore4.getInternalLogger());
                                zzm zzmVar2 = new zzm(3, internalSdkCore4.getInternalLogger(), null, 12);
                                RumScopeKey rumScopeKey3 = new RumScopeKey("com.datadog.background.view", "com/datadog/background/view", "Background");
                                Time eventTime = rumRawEvent2.getEventTime();
                                EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                                emptyMap2.getClass();
                                sessionEndedMetricDispatcher = sessionEndedMetricDispatcher2;
                                z = true;
                                RumViewScope rumViewScope4 = new RumViewScope(this, internalSdkCore4, sessionEndedMetricDispatcher, rumScopeKey3, eventTime, emptyMap2, rumApplicationScope, this.firstPartyHostHeaderTypeResolver, new NoOpVitalMonitor(), new NoOpVitalMonitor(), new NoOpVitalMonitor(), 3, this.trackFrustrations, this.sampleRate, this.interactionToNextViewMetricResolver, networkSettledMetricResolver3, this.slowFramesListener, zzmVar2, this.accessibilitySnapshotManager, this.batteryInfoProvider, this.displayInfoProvider, this.insightsCollector);
                                internalSdkCore4 = internalSdkCore4;
                                rumRawEvent2 = rumRawEvent;
                                rumViewScope4.handleEvent(rumRawEvent2, datadogContext, function1, dataWriter);
                                arrayList.add(rumViewScope4);
                                missedEventType2 = null;
                                this.lastStoppedViewTime = null;
                            } else {
                                z = true;
                                sessionEndedMetricDispatcher = sessionEndedMetricDispatcher2;
                                if (!contains2) {
                                    DBUtil.log$default(internalSdkCore4.getInternalLogger(), 4, target, RumViewScope$stopScope$1.INSTANCE$6, null, false, 56);
                                }
                            }
                            missedEventType = !(!(rumRawEvent2 instanceof RumRawEvent.AddError) ? z : rumRawEvent2 instanceof RumRawEvent.StopResourceWithError) ? SessionEndedMetric.MissedEventType.ERROR : rumRawEvent2 instanceof RumRawEvent.StartAction ? SessionEndedMetric.MissedEventType.ACTION : rumRawEvent2 instanceof RumRawEvent.StartResource ? SessionEndedMetric.MissedEventType.RESOURCE : rumRawEvent2 instanceof RumRawEvent.AddLongTask ? SessionEndedMetric.MissedEventType.LONG_TASK : missedEventType2;
                            if (missedEventType == null) {
                                String str = this.parentScope.getRumContext().sessionId;
                                str.getClass();
                                SessionEndedMetric sessionEndedMetric = (SessionEndedMetric) sessionEndedMetricDispatcher.metricsBySessionId.get(str);
                                if (sessionEndedMetric != null) {
                                    LinkedHashMap linkedHashMap = sessionEndedMetric.missedEventCountByType;
                                    Integer num = (Integer) linkedHashMap.get(missedEventType);
                                    linkedHashMap.put(missedEventType, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                                }
                                obj = Unit.INSTANCE;
                            } else {
                                obj = missedEventType2;
                            }
                            if (obj == null) {
                                DBUtil.log$default(internalSdkCore4.getInternalLogger(), 3, InternalLogger.Target.MAINTAINER, RumViewScope$stopScope$1.INSTANCE$9, null, false, 56);
                            }
                        }
                    } else if (!ArraysKt___ArraysKt.contains(clsArr, rumRawEvent2.getClass())) {
                        DBUtil.log$default(internalSdkCore4.getInternalLogger(), 4, target, RumViewScope$stopScope$1.INSTANCE$8, null, false, 56);
                    }
                    z = true;
                    sessionEndedMetricDispatcher = sessionEndedMetricDispatcher2;
                    if (!(!(rumRawEvent2 instanceof RumRawEvent.AddError) ? z : rumRawEvent2 instanceof RumRawEvent.StopResourceWithError)) {
                    }
                    if (missedEventType == null) {
                    }
                    if (obj == null) {
                    }
                }
            }
        }
        return this;
    }
}
