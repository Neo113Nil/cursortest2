package com.datadog.android.rum.internal.domain.scope;

import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import androidx.viewpager.widget.ViewPager;
import app.cash.trifle.KeyHandle$keyPair$2;
import coil3.request.OneShotDisposable;
import com.android.volley.toolbox.HurlStack;
import com.bumptech.glide.GlideBuilder$1;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator$Builder;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.NoOpDataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.internal.profiling.TTIDRumContext;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.internal.domain.InfoProvider;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import com.datadog.android.rum.internal.metric.SessionEndedMetricDispatcher;
import com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher$sendViewEnded$1;
import com.datadog.android.rum.internal.metric.slowframes.DefaultSlowFramesListener;
import com.datadog.android.rum.internal.startup.RumAppStartupTelemetryReporterImpl$reportTTID$1;
import com.datadog.android.rum.internal.startup.RumSessionScopeStartupManager;
import com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl;
import com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl$onTTFDEvent$1;
import com.datadog.android.rum.internal.startup.RumSessionScopeStartupManagerImpl$onTTFDEvent$2;
import com.datadog.android.rum.internal.startup.RumStartupScenario;
import com.datadog.android.rum.internal.startup.RumTTIDInfo;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.datadog.android.rum.internal.vitals.VitalMonitor;
import com.datadog.android.rum.metric.interactiontonextview.LastInteractionIdentifier;
import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.datadog.android.rum.model.VitalAppLaunchEvent;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzhz;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class RumSessionScope implements RumScope {
    public final boolean backgroundTrackingEnabled;
    public RumViewManagerScope childScope;
    public final boolean isActive;
    public final AtomicLong lastUserInteractionNs;
    public final NoOpDataWriter noOpWriter;
    public final RumApplicationScope parentScope;
    public final SecureRandom random;
    public RumSessionScopeStartupManager rumSessionScopeStartupManager;
    public final Rum$createMonitor$1 rumSessionScopeStartupManagerFactory;
    public final float sampleRate;
    public final InternalSdkCore sdkCore;
    public final SessionEndedMetricDispatcher sessionEndedMetricDispatcher;
    public String sessionId;
    public final OneShotDisposable sessionListener;
    public final AtomicLong sessionStartNs;
    public int sessionState;
    public int startReason;

    public RumSessionScope(RumApplicationScope rumApplicationScope, InternalSdkCore internalSdkCore, SessionEndedMetricDispatcher sessionEndedMetricDispatcher, float f, boolean z, boolean z2, RumApplicationScope rumApplicationScope2, OneShotDisposable oneShotDisposable, VitalMonitor vitalMonitor, VitalMonitor vitalMonitor2, VitalMonitor vitalMonitor3, OneShotDisposable oneShotDisposable2, boolean z3, InitialResourceIdentifier initialResourceIdentifier, LastInteractionIdentifier lastInteractionIdentifier, DefaultSlowFramesListener defaultSlowFramesListener, GlideBuilder$1 glideBuilder$1, InfoProvider infoProvider, InfoProvider infoProvider2, Rum$createMonitor$1 rum$createMonitor$1, HurlStack hurlStack) {
        oneShotDisposable.getClass();
        vitalMonitor.getClass();
        vitalMonitor2.getClass();
        vitalMonitor3.getClass();
        initialResourceIdentifier.getClass();
        glideBuilder$1.getClass();
        infoProvider.getClass();
        infoProvider2.getClass();
        hurlStack.getClass();
        this.parentScope = rumApplicationScope;
        this.sdkCore = internalSdkCore;
        this.sessionEndedMetricDispatcher = sessionEndedMetricDispatcher;
        this.sampleRate = f;
        this.backgroundTrackingEnabled = z;
        this.sessionListener = oneShotDisposable2;
        this.rumSessionScopeStartupManagerFactory = rum$createMonitor$1;
        this.sessionId = RumContext.NULL_UUID;
        this.sessionState = 1;
        this.startReason = 1;
        this.isActive = true;
        internalSdkCore.getTimeProvider().getClass();
        this.sessionStartNs = new AtomicLong(System.nanoTime());
        this.lastUserInteractionNs = new AtomicLong(0L);
        this.random = new SecureRandom();
        this.noOpWriter = new NoOpDataWriter();
        this.childScope = new RumViewManagerScope(this, internalSdkCore, sessionEndedMetricDispatcher, z, z2, rumApplicationScope2, oneShotDisposable, vitalMonitor, vitalMonitor2, vitalMonitor3, z3, f, initialResourceIdentifier, defaultSlowFramesListener, lastInteractionIdentifier, glideBuilder$1, infoProvider, infoProvider2, hurlStack);
    }

    public final RumViewScope getActiveView$dd_sdk_android_rum_release() {
        RumViewManagerScope rumViewManagerScope;
        if (!this.isActive || (rumViewManagerScope = this.childScope) == null) {
            return null;
        }
        ArrayList arrayList = rumViewManagerScope.childrenScopes;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((RumViewScope) next).stopped) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            DBUtil.log$default(rumViewManagerScope.sdkCore.getInternalLogger(), 5, InternalLogger.Target.MAINTAINER, RumViewScope$stopScope$1.INSTANCE$4, null, false, 56);
        }
        return (RumViewScope) CollectionsKt.lastOrNull((List) arrayList2);
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
        return RumContext.copy$default(this.parentScope.rumContext, this.sessionId, this.isActive, null, null, null, null, this.sessionState, this.startReason, 0, null, null, 0L, 0L, false, 32377);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x029b A[LOOP:0: B:190:0x0295->B:192:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x016b  */
    /* JADX WARN: Type inference failed for: r2v55, types: [com.datadog.android.internal.profiling.TTIDRumContext] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RumScope handleEvent(RumRawEvent rumRawEvent, DatadogContext datadogContext, Function1 function1, DataWriter dataWriter) {
        RumScope rumScope;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object obj;
        boolean z5;
        boolean z6;
        boolean z7;
        Pair pair;
        long j;
        Collection values;
        Iterator it;
        int i;
        Collection values2;
        Iterator it2;
        int i2;
        Collection values3;
        Iterator it3;
        int i3;
        int size;
        int mapCapacity;
        Iterator it4;
        String replace;
        RumSessionScope rumSessionScope;
        RumSessionScopeStartupManager rumSessionScopeStartupManager;
        RumSessionScopeStartupManager rumSessionScopeStartupManager2;
        boolean z8;
        String str;
        ?? r4;
        RumContext rumContext;
        DataWriter dataWriter2;
        rumRawEvent.getClass();
        datadogContext.getClass();
        function1.getClass();
        dataWriter.getClass();
        InternalSdkCore internalSdkCore = this.sdkCore;
        internalSdkCore.getTimeProvider().getClass();
        long nanoTime = System.nanoTime();
        boolean areEqual = Intrinsics.areEqual(this.sessionId, RumContext.NULL_UUID);
        AtomicLong atomicLong = this.lastUserInteractionNs;
        boolean z9 = nanoTime - atomicLong.get() >= 900000000000L;
        boolean z10 = nanoTime - this.sessionStartNs.get() >= 14400000000000L;
        boolean z11 = (rumRawEvent instanceof RumRawEvent.StartView) || (rumRawEvent instanceof RumRawEvent.StartAction);
        boolean contains = ArraysKt___ArraysKt.contains(RumViewManagerScope.validBackgroundEventTypes, rumRawEvent.getClass());
        boolean z12 = rumRawEvent instanceof RumRawEvent.SdkInit;
        boolean z13 = z12 && ((RumRawEvent.SdkInit) rumRawEvent).isAppInForeground;
        boolean z14 = z12 && !((RumRawEvent.SdkInit) rumRawEvent).isAppInForeground;
        boolean z15 = z10;
        boolean z16 = this.isActive;
        if (z9 || z15 || !z16) {
            rumScope = null;
            String str2 = this.sessionId;
            z = areEqual;
            z2 = z11;
            z3 = contains;
            long j2 = internalSdkCore.getTime().serverTimeOffsetMs;
            str2.getClass();
            SessionEndedMetricDispatcher sessionEndedMetricDispatcher = this.sessionEndedMetricDispatcher;
            z4 = z9;
            SessionEndedMetric sessionEndedMetric = (SessionEndedMetric) sessionEndedMetricDispatcher.metricsBySessionId.remove(str2);
            if (sessionEndedMetric != null) {
                InternalLogger internalLogger = sessionEndedMetricDispatcher.internalLogger;
                z5 = z14;
                Pair pair2 = new Pair("metric_type", "rum session ended");
                Pair pair3 = new Pair("process_type", "app");
                Pair pair4 = new Pair("precondition", RumErrorSource$EnumUnboxingLocalUtility.getAsString(sessionEndedMetric.startReason));
                SessionEndedMetric.TrackedView trackedView = sessionEndedMetric.lastTrackedView;
                if (trackedView != null) {
                    SessionEndedMetric.TrackedView trackedView2 = sessionEndedMetric.firstTrackedView;
                    pair = pair4;
                    z6 = z12;
                    Long valueOf = trackedView2 != null ? Long.valueOf(TimeUnit.MILLISECONDS.toNanos(trackedView.startMs - trackedView2.startMs) + trackedView.durationNs) : null;
                    if (valueOf != null) {
                        j = valueOf.longValue();
                        Pair pair5 = new Pair("duration", Long.valueOf(j));
                        Pair pair6 = new Pair("was_stopped", Boolean.FALSE);
                        LinkedHashMap linkedHashMap = sessionEndedMetric.trackedViewsById;
                        Pair pair7 = new Pair("total", Integer.valueOf(linkedHashMap.size()));
                        values = linkedHashMap.values();
                        if ((values instanceof Collection) || !values.isEmpty()) {
                            it = values.iterator();
                            int i4 = 0;
                            while (it.hasNext()) {
                                Iterator it5 = it;
                                int i5 = i4;
                                if (Intrinsics.areEqual(((SessionEndedMetric.TrackedView) it.next()).viewUrl, "com/datadog/background/view")) {
                                    i4 = i5 + 1;
                                    if (i4 < 0) {
                                        CollectionsKt__CollectionsKt.throwCountOverflow();
                                        throw null;
                                    }
                                } else {
                                    i4 = i5;
                                }
                                it = it5;
                            }
                            i = i4;
                        } else {
                            i = 0;
                        }
                        z7 = z13;
                        Pair pair8 = new Pair("background", Integer.valueOf(i));
                        values2 = linkedHashMap.values();
                        if ((values2 instanceof Collection) || !values2.isEmpty()) {
                            it2 = values2.iterator();
                            int i6 = 0;
                            while (it2.hasNext()) {
                                Iterator it6 = it2;
                                int i7 = i6;
                                if (Intrinsics.areEqual(((SessionEndedMetric.TrackedView) it2.next()).viewUrl, "com/datadog/application-launch/view")) {
                                    i6 = i7 + 1;
                                    if (i6 < 0) {
                                        CollectionsKt__CollectionsKt.throwCountOverflow();
                                        throw null;
                                    }
                                } else {
                                    i6 = i7;
                                }
                                it2 = it6;
                            }
                            i2 = i6;
                        } else {
                            i2 = 0;
                        }
                        Pair pair9 = new Pair("app_launch", Integer.valueOf(i2));
                        values3 = linkedHashMap.values();
                        if ((values3 instanceof Collection) || !values3.isEmpty()) {
                            it3 = values3.iterator();
                            i3 = 0;
                            while (it3.hasNext()) {
                                Iterator it7 = it3;
                                if (((SessionEndedMetric.TrackedView) it3.next()).hasReplay && (i3 = i3 + 1) < 0) {
                                    CollectionsKt__CollectionsKt.throwCountOverflow();
                                    throw null;
                                }
                                it3 = it7;
                            }
                        } else {
                            i3 = 0;
                        }
                        obj = "metric_type";
                        Pair pair10 = new Pair("views_count", MapsKt__MapsKt.mapOf(pair7, pair8, pair9, new Pair("with_has_replay", Integer.valueOf(i3))));
                        LinkedHashMap linkedHashMap2 = sessionEndedMetric.errorKindFrequencies;
                        Pair pair11 = new Pair("total", Integer.valueOf(CollectionsKt.sumOfInt(linkedHashMap2.values())));
                        size = linkedHashMap2.size();
                        if (5 <= size) {
                            size = 5;
                        }
                        List subList = CollectionsKt.sortedWith(linkedHashMap2.entrySet(), new ViewPager.AnonymousClass1(21)).subList(0, size);
                        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(subList, 10));
                        if (mapCapacity < 16) {
                            mapCapacity = 16;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(mapCapacity);
                        it4 = subList.iterator();
                        while (it4.hasNext()) {
                            Map.Entry entry = (Map.Entry) it4.next();
                            Iterator it8 = it4;
                            replace = new Regex("[^\\w']+").replace((String) entry.getKey(), "_");
                            linkedHashMap3.put(replace, entry.getValue());
                            it4 = it8;
                        }
                        Pair pair12 = new Pair("sdk_errors_count", MapsKt__MapsKt.mapOf(pair11, new Pair("by_kind", linkedHashMap3)));
                        LinkedHashMap linkedHashMap4 = sessionEndedMetric.missedEventCountByType;
                        Integer num = (Integer) linkedHashMap4.get(SessionEndedMetric.MissedEventType.ACTION);
                        Pair pair13 = new Pair("actions", Integer.valueOf(num == null ? num.intValue() : 0));
                        Integer num2 = (Integer) linkedHashMap4.get(SessionEndedMetric.MissedEventType.RESOURCE);
                        Pair pair14 = new Pair("resources", Integer.valueOf(num2 == null ? num2.intValue() : 0));
                        Integer num3 = (Integer) linkedHashMap4.get(SessionEndedMetric.MissedEventType.ERROR);
                        Pair pair15 = new Pair("errors", Integer.valueOf(num3 == null ? num3.intValue() : 0));
                        Integer num4 = (Integer) linkedHashMap4.get(SessionEndedMetric.MissedEventType.LONG_TASK);
                        ((zzlj) internalLogger).logMetric(ViewEndedMetricDispatcher$sendViewEnded$1.INSTANCE$1, MapsKt__MapsKt.mapOf(pair2, new Pair("rse", MapsKt__MapsKt.mapOf(pair3, pair, pair5, pair6, pair10, pair12, new Pair("no_view_events_count", MapsKt__MapsKt.mapOf(pair13, pair14, pair15, new Pair("long_tasks", Integer.valueOf(num4 == null ? num4.intValue() : 0)))), new Pair("has_background_events_tracking_enabled", Boolean.valueOf(sessionEndedMetric.hasTrackBackgroundEventsEnabled)), new Pair("ntp_offset", MapsKt__MapsKt.mapOf(new Pair("at_start", Long.valueOf(sessionEndedMetric.ntpOffsetAtStartMs)), new Pair("at_end", Long.valueOf(j2)))), new Pair("sr_skipped_frames_count", Integer.valueOf(sessionEndedMetric.sessionReplaySkippedFramesCount.get()))))), 15.0f, Float.valueOf(sessionEndedMetricDispatcher.sessionSamplingRate));
                    }
                } else {
                    pair = pair4;
                    z6 = z12;
                }
                j = 0;
                Pair pair52 = new Pair("duration", Long.valueOf(j));
                Pair pair62 = new Pair("was_stopped", Boolean.FALSE);
                LinkedHashMap linkedHashMap5 = sessionEndedMetric.trackedViewsById;
                Pair pair72 = new Pair("total", Integer.valueOf(linkedHashMap5.size()));
                values = linkedHashMap5.values();
                if (values instanceof Collection) {
                }
                it = values.iterator();
                int i42 = 0;
                while (it.hasNext()) {
                }
                i = i42;
                z7 = z13;
                Pair pair82 = new Pair("background", Integer.valueOf(i));
                values2 = linkedHashMap5.values();
                if (values2 instanceof Collection) {
                }
                it2 = values2.iterator();
                int i62 = 0;
                while (it2.hasNext()) {
                }
                i2 = i62;
                Pair pair92 = new Pair("app_launch", Integer.valueOf(i2));
                values3 = linkedHashMap5.values();
                if (values3 instanceof Collection) {
                }
                it3 = values3.iterator();
                i3 = 0;
                while (it3.hasNext()) {
                }
                obj = "metric_type";
                Pair pair102 = new Pair("views_count", MapsKt__MapsKt.mapOf(pair72, pair82, pair92, new Pair("with_has_replay", Integer.valueOf(i3))));
                LinkedHashMap linkedHashMap22 = sessionEndedMetric.errorKindFrequencies;
                Pair pair112 = new Pair("total", Integer.valueOf(CollectionsKt.sumOfInt(linkedHashMap22.values())));
                size = linkedHashMap22.size();
                if (5 <= size) {
                }
                List subList2 = CollectionsKt.sortedWith(linkedHashMap22.entrySet(), new ViewPager.AnonymousClass1(21)).subList(0, size);
                mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(subList2, 10));
                if (mapCapacity < 16) {
                }
                LinkedHashMap linkedHashMap32 = new LinkedHashMap(mapCapacity);
                it4 = subList2.iterator();
                while (it4.hasNext()) {
                }
                Pair pair122 = new Pair("sdk_errors_count", MapsKt__MapsKt.mapOf(pair112, new Pair("by_kind", linkedHashMap32)));
                LinkedHashMap linkedHashMap42 = sessionEndedMetric.missedEventCountByType;
                Integer num5 = (Integer) linkedHashMap42.get(SessionEndedMetric.MissedEventType.ACTION);
                Pair pair132 = new Pair("actions", Integer.valueOf(num5 == null ? num5.intValue() : 0));
                Integer num22 = (Integer) linkedHashMap42.get(SessionEndedMetric.MissedEventType.RESOURCE);
                Pair pair142 = new Pair("resources", Integer.valueOf(num22 == null ? num22.intValue() : 0));
                Integer num32 = (Integer) linkedHashMap42.get(SessionEndedMetric.MissedEventType.ERROR);
                Pair pair152 = new Pair("errors", Integer.valueOf(num32 == null ? num32.intValue() : 0));
                Integer num42 = (Integer) linkedHashMap42.get(SessionEndedMetric.MissedEventType.LONG_TASK);
                ((zzlj) internalLogger).logMetric(ViewEndedMetricDispatcher$sendViewEnded$1.INSTANCE$1, MapsKt__MapsKt.mapOf(pair2, new Pair("rse", MapsKt__MapsKt.mapOf(pair3, pair, pair52, pair62, pair102, pair122, new Pair("no_view_events_count", MapsKt__MapsKt.mapOf(pair132, pair142, pair152, new Pair("long_tasks", Integer.valueOf(num42 == null ? num42.intValue() : 0)))), new Pair("has_background_events_tracking_enabled", Boolean.valueOf(sessionEndedMetric.hasTrackBackgroundEventsEnabled)), new Pair("ntp_offset", MapsKt__MapsKt.mapOf(new Pair("at_start", Long.valueOf(sessionEndedMetric.ntpOffsetAtStartMs)), new Pair("at_end", Long.valueOf(j2)))), new Pair("sr_skipped_frames_count", Integer.valueOf(sessionEndedMetric.sessionReplaySkippedFramesCount.get()))))), 15.0f, Float.valueOf(sessionEndedMetricDispatcher.sessionSamplingRate));
            } else {
                obj = "metric_type";
                z5 = z14;
                z6 = z12;
                z7 = z13;
            }
        } else {
            z = areEqual;
            z4 = z9;
            obj = "metric_type";
            z5 = z14;
            z2 = z11;
            z3 = contains;
            z6 = z12;
            z7 = z13;
            rumScope = null;
        }
        int i8 = 3;
        if (z2 || z7) {
            if (z || z4 || z15) {
                if (z) {
                    i8 = 1;
                } else if (z4) {
                    i8 = 2;
                }
                renewSession(rumRawEvent.getEventTime(), i8);
            }
            atomicLong.set(nanoTime);
        } else if (z4) {
            if (this.backgroundTrackingEnabled && (z3 || z5)) {
                renewSession(rumRawEvent.getEventTime(), 4);
                atomicLong.set(nanoTime);
            } else {
                this.sessionState = 3;
            }
        } else if (z15) {
            renewSession(rumRawEvent.getEventTime(), 3);
        }
        int i9 = this.sessionState;
        String str3 = this.sessionId;
        boolean z17 = i9 == 2;
        SdkFeature feature = internalSdkCore.getFeature("session-replay");
        if (feature != null) {
            feature.sendEvent(MapsKt__MapsKt.mapOf(new Pair("type", "rum_session_renewed"), new Pair("keepSession", Boolean.valueOf(z17)), new Pair("sessionId", str3)));
        }
        DataWriter dataWriter3 = this.sessionState == 2 ? dataWriter : this.noOpWriter;
        RumViewScope activeView$dd_sdk_android_rum_release = getActiveView$dd_sdk_android_rum_release();
        RumContext rumContext2 = activeView$dd_sdk_android_rum_release != null ? activeView$dd_sdk_android_rum_release.getRumContext() : getRumContext();
        boolean z18 = rumRawEvent instanceof RumRawEvent.AppStartTTIDEvent;
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (z18) {
            if (this.sessionState == 2) {
                RumSessionScopeStartupManager rumSessionScopeStartupManager3 = this.rumSessionScopeStartupManager;
                if (rumSessionScopeStartupManager3 != null) {
                    Map customAttributes = zzhz.getCustomAttributes(this);
                    RumSessionScopeStartupManagerImpl rumSessionScopeStartupManagerImpl = (RumSessionScopeStartupManagerImpl) rumSessionScopeStartupManager3;
                    InternalSdkCore internalSdkCore2 = rumSessionScopeStartupManagerImpl.sdkCore;
                    dataWriter3.getClass();
                    rumSessionScopeStartupManagerImpl.ttidReportedForScenario = true;
                    MediaLoadData mediaLoadData = rumSessionScopeStartupManagerImpl.rumAppStartupTelemetryReporter;
                    RumTTIDInfo rumTTIDInfo = ((RumRawEvent.AppStartTTIDEvent) rumRawEvent).info;
                    int i10 = rumSessionScopeStartupManagerImpl.appStartCount - 1;
                    rumTTIDInfo.getClass();
                    RumStartupScenario rumStartupScenario = rumTTIDInfo.scenario;
                    InternalLogger internalLogger2 = (InternalLogger) mediaLoadData.trackFormat;
                    RumAppStartupTelemetryReporterImpl$reportTTID$1 rumAppStartupTelemetryReporterImpl$reportTTID$1 = RumAppStartupTelemetryReporterImpl$reportTTID$1.INSTANCE;
                    Pair pair16 = new Pair(obj, "app launch ttid");
                    MapBuilder mapBuilder = new MapBuilder();
                    boolean z19 = rumStartupScenario instanceof RumStartupScenario.Cold;
                    if (z19) {
                        z8 = z19;
                        str = "cold";
                    } else {
                        z8 = z19;
                        if (rumStartupScenario instanceof RumStartupScenario.WarmAfterActivityDestroyed) {
                            str = "warm_after_activity_destroyed";
                        } else {
                            if (!(rumStartupScenario instanceof RumStartupScenario.WarmFirstActivity)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return rumScope;
                            }
                            str = "warm_first_activity";
                        }
                    }
                    mapBuilder.put("scenario", str);
                    mapBuilder.put("duration_ns", Long.valueOf(rumTTIDInfo.durationNs));
                    mapBuilder.put("index_in_session", Integer.valueOf(i10));
                    mapBuilder.put("cp_process_start_diff_ns", Long.valueOf(mediaLoadData.mediaEndTimeMs - mediaLoadData.mediaStartTimeMs));
                    mapBuilder.put("process_start_importance", Integer.valueOf(mediaLoadData.trackType));
                    mapBuilder.put("has_saved_instance_state", Boolean.valueOf(rumStartupScenario.getHasSavedInstanceStateBundle()));
                    if (z8) {
                        r4 = Long.valueOf(((RumStartupScenario.Cold) rumStartupScenario).appStartActivityOnCreateGapNs);
                    } else if (rumStartupScenario instanceof RumStartupScenario.WarmFirstActivity) {
                        r4 = Long.valueOf(((RumStartupScenario.WarmFirstActivity) rumStartupScenario).appStartActivityOnCreateGapNs);
                    } else {
                        if (!(rumStartupScenario instanceof RumStartupScenario.WarmAfterActivityDestroyed)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return rumScope;
                        }
                        r4 = rumScope;
                    }
                    if (r4 != 0) {
                        mapBuilder.put("app_start_activity_on_create_gap_ns", Long.valueOf(r4.longValue()));
                    }
                    ((zzlj) internalLogger2).logMetric(rumAppStartupTelemetryReporterImpl$reportTTID$1, MapsKt__MapsKt.mapOf(pair16, new Pair("app_launch_ttid", mapBuilder.build())), 15.0f, null);
                    if (!rumSessionScopeStartupManagerImpl.ttidSentForSession) {
                        rumSessionScopeStartupManagerImpl.ttidSentForSession = true;
                        MemorySizeCalculator$Builder memorySizeCalculator$Builder = rumSessionScopeStartupManagerImpl.rumVitalAppLaunchEventHelper;
                        long j3 = rumStartupScenario.getInitialTime().timestamp + internalSdkCore2.getTime().serverTimeOffsetMs;
                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                        emptyMap.getClass();
                        long j4 = rumTTIDInfo.durationNs;
                        Map map = (Map) datadogContext.featuresContext.get("profiling");
                        DataWriter dataWriter4 = dataWriter3;
                        VitalAppLaunchEvent newVitalAppLaunchEvent = memorySizeCalculator$Builder.newVitalAppLaunchEvent(j3, datadogContext, emptyMap, customAttributes, rumContext2, j4, rumStartupScenario, 1, Intrinsics.areEqual(map != null ? map.get("profiler_is_running") : rumScope, Boolean.TRUE) ? 2 : 0);
                        VitalAppLaunchEvent.Vital vital = newVitalAppLaunchEvent.vital;
                        SdkFeature feature2 = internalSdkCore2.getFeature("profiling");
                        if (feature2 != null) {
                            final TTIDRumContext tTIDRumContext = new TTIDRumContext(rumContext2.applicationId, rumContext2.sessionId, vital.id, rumContext2.viewId, rumContext2.viewName);
                            feature2.sendEvent(new Object(tTIDRumContext) { // from class: com.datadog.android.internal.profiling.ProfilerStopEvent$TTID
                                public final TTIDRumContext rumContext;

                                {
                                    this.rumContext = tTIDRumContext;
                                }

                                public final boolean equals(Object obj2) {
                                    if (this == obj2) {
                                        return true;
                                    }
                                    return (obj2 instanceof ProfilerStopEvent$TTID) && Intrinsics.areEqual(this.rumContext, ((ProfilerStopEvent$TTID) obj2).rumContext);
                                }

                                public final int hashCode() {
                                    TTIDRumContext tTIDRumContext2 = this.rumContext;
                                    if (tTIDRumContext2 == null) {
                                        return 0;
                                    }
                                    return tTIDRumContext2.hashCode();
                                }

                                public final String toString() {
                                    return "TTID(rumContext=" + this.rumContext + ")";
                                }
                            });
                        }
                        if (vital.duration.longValue() > RumSessionScopeStartupManagerImpl.MAX_TTID_DURATION_NS) {
                            ((zzlj) internalSdkCore2.getInternalLogger()).log(4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), (Function0) RumAppStartupTelemetryReporterImpl$reportTTID$1.INSTANCE$4, (Throwable) null, false, (Map) null);
                            rumContext = rumContext2;
                            dataWriter2 = dataWriter4;
                        } else {
                            rumContext = rumContext2;
                            dataWriter2 = dataWriter4;
                            SdkCoreExtKt.newRumEventWriteOperation(internalSdkCore2, datadogContext, function1, dataWriter2, 1, new KeyHandle$keyPair$2(newVitalAppLaunchEvent, 25)).submit();
                        }
                        if (rumSessionScopeStartupManagerImpl.ttfdReportedForScenario) {
                            rumSessionScopeStartupManagerImpl.sendTTFDEvent(datadogContext, function1, dataWriter2, rumContext, customAttributes, rumTTIDInfo.durationNs, rumStartupScenario);
                        }
                    }
                }
            } else {
                SdkFeature feature3 = internalSdkCore.getFeature("profiling");
                if (feature3 != null) {
                    final ?? r2 = rumScope;
                    feature3.sendEvent(new Object(r2) { // from class: com.datadog.android.internal.profiling.ProfilerStopEvent$TTID
                        public final TTIDRumContext rumContext;

                        {
                            this.rumContext = r2;
                        }

                        public final boolean equals(Object obj2) {
                            if (this == obj2) {
                                return true;
                            }
                            return (obj2 instanceof ProfilerStopEvent$TTID) && Intrinsics.areEqual(this.rumContext, ((ProfilerStopEvent$TTID) obj2).rumContext);
                        }

                        public final int hashCode() {
                            TTIDRumContext tTIDRumContext2 = this.rumContext;
                            if (tTIDRumContext2 == null) {
                                return 0;
                            }
                            return tTIDRumContext2.hashCode();
                        }

                        public final String toString() {
                            return "TTID(rumContext=" + this.rumContext + ")";
                        }
                    });
                }
            }
            rumSessionScope = this;
        } else {
            DataWriter dataWriter5 = dataWriter3;
            if (rumRawEvent instanceof RumRawEvent.AppStartEvent) {
                rumSessionScope = this;
                if (rumSessionScope.sessionState == 2 && (rumSessionScopeStartupManager2 = rumSessionScope.rumSessionScopeStartupManager) != null) {
                    RumSessionScopeStartupManagerImpl rumSessionScopeStartupManagerImpl2 = (RumSessionScopeStartupManagerImpl) rumSessionScopeStartupManager2;
                    rumSessionScopeStartupManagerImpl2.lastScenario = ((RumRawEvent.AppStartEvent) rumRawEvent).scenario;
                    rumSessionScopeStartupManagerImpl2.ttfdReportedForScenario = false;
                    rumSessionScopeStartupManagerImpl2.ttidReportedForScenario = false;
                    rumSessionScopeStartupManagerImpl2.appStartCount++;
                }
            } else {
                rumSessionScope = this;
                if (rumRawEvent instanceof RumRawEvent.AppStartTTFDEvent) {
                    if (rumSessionScope.sessionState == 2 && (rumSessionScopeStartupManager = rumSessionScope.rumSessionScopeStartupManager) != null) {
                        RumRawEvent.AppStartTTFDEvent appStartTTFDEvent = (RumRawEvent.AppStartTTFDEvent) rumRawEvent;
                        Map customAttributes2 = zzhz.getCustomAttributes(rumSessionScope);
                        RumSessionScopeStartupManagerImpl rumSessionScopeStartupManagerImpl3 = (RumSessionScopeStartupManagerImpl) rumSessionScopeStartupManager;
                        InternalSdkCore internalSdkCore3 = rumSessionScopeStartupManagerImpl3.sdkCore;
                        dataWriter5.getClass();
                        if (!rumSessionScopeStartupManagerImpl3.ttfdReportedForSession) {
                            rumSessionScopeStartupManagerImpl3.ttfdReportedForSession = true;
                            RumStartupScenario rumStartupScenario2 = rumSessionScopeStartupManagerImpl3.lastScenario;
                            if (rumStartupScenario2 == null) {
                                ((zzlj) internalSdkCore3.getInternalLogger()).log(5, target, (Function0) RumSessionScopeStartupManagerImpl$onTTFDEvent$1.INSTANCE, (Throwable) null, false, (Map) null);
                            } else {
                                rumSessionScopeStartupManagerImpl3.ttfdReportedForScenario = true;
                                if (rumSessionScopeStartupManagerImpl3.ttidReportedForScenario) {
                                    rumSessionScopeStartupManagerImpl3.sendTTFDEvent(datadogContext, function1, dataWriter5, rumContext2, customAttributes2, appStartTTFDEvent.eventTime.nanoTime - rumStartupScenario2.getInitialTime().nanoTime, rumStartupScenario2);
                                } else {
                                    ((zzlj) internalSdkCore3.getInternalLogger()).log(4, target, (Function0) RumSessionScopeStartupManagerImpl$onTTFDEvent$2.INSTANCE, (Throwable) null, false, (Map) null);
                                }
                            }
                        }
                    }
                } else if (!z6) {
                    RumViewManagerScope rumViewManagerScope = rumSessionScope.childScope;
                    if (rumViewManagerScope != null) {
                        rumViewManagerScope.handleEvent(rumRawEvent, datadogContext, function1, dataWriter5);
                    } else {
                        rumViewManagerScope = null;
                    }
                    if (!(rumViewManagerScope instanceof RumViewManagerScope)) {
                        rumViewManagerScope = null;
                    }
                    rumSessionScope.childScope = rumViewManagerScope;
                }
            }
        }
        if (z16 || rumSessionScope.childScope != null) {
            return rumSessionScope;
        }
        return null;
    }

    public final void renewSession(Time time, int i) {
        boolean z = ((double) this.random.nextFloat()) < ((double) this.sampleRate) / 100.0d;
        this.startReason = i;
        this.sessionState = z ? 2 : 1;
        this.sessionId = Boxes$$ExternalSyntheticOutline1.m();
        Time time2 = time;
        this.sessionStartNs.set(time2.nanoTime);
        this.rumSessionScopeStartupManager = (RumSessionScopeStartupManager) this.rumSessionScopeStartupManagerFactory.invoke();
        RumViewManagerScope rumViewManagerScope = this.childScope;
        if (rumViewManagerScope != null) {
            ArrayList arrayList = rumViewManagerScope.childrenScopes;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RumViewScope rumViewScope = (RumViewScope) it.next();
                rumViewScope.getClass();
                arrayList2.add(new RumViewScope(rumViewScope, rumViewScope.sdkCore, rumViewScope.sessionEndedMetricDispatcher, rumViewScope.key, time2, rumViewScope.initialAttributes, rumViewScope.viewChangedListener, rumViewScope.firstPartyHostHeaderTypeResolver, rumViewScope.cpuVitalMonitor, rumViewScope.memoryVitalMonitor, rumViewScope.frameRateVitalMonitor, rumViewScope.featuresContextResolver, rumViewScope.f953type, rumViewScope.trackFrustrations, rumViewScope.sampleRate, rumViewScope.interactionToNextViewMetricResolver, rumViewScope.networkSettledMetricResolver, rumViewScope.slowFramesListener, rumViewScope.viewEndedMetricDispatcher, rumViewScope.accessibilitySnapshotManager, rumViewScope.batteryInfoProvider, rumViewScope.displayInfoProvider, rumViewScope.insightsCollector));
                time2 = time;
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
        }
        if (z) {
            String str = this.sessionId;
            long j = this.sdkCore.getTime().serverTimeOffsetMs;
            str.getClass();
            if (i == 0) {
                throw null;
            }
            this.sessionEndedMetricDispatcher.metricsBySessionId.put(str, new SessionEndedMetric(str, i, j, this.backgroundTrackingEnabled));
        }
        this.sessionListener.onSessionStarted(this.sessionId, !z);
    }
}
