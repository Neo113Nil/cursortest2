package com.datadog.android.rum.internal.domain.scope;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.extractor.text.CueEncoder;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.request.OneShotDisposable;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DatadogContext;
import com.datadog.android.api.context.DeviceInfo;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.api.context.LocaleInfo;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.api.context.UserInfo;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.datadog.android.okhttp.DatadogInterceptor$intercept$1;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.internal.domain.RumContext;
import com.datadog.android.rum.internal.domain.Time;
import com.datadog.android.rum.internal.domain.event.ResourceTiming;
import com.datadog.android.rum.internal.domain.scope.RumRawEvent;
import com.datadog.android.rum.internal.metric.networksettled.NetworkSettledMetricResolver;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.internal.monitor.StorageEvent;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.datadog.android.rum.internal.utils.RuntimeUtilsKt;
import com.datadog.android.rum.internal.utils.SdkCoreExtKt;
import com.datadog.android.rum.internal.utils.WriteOperation;
import com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext;
import com.datadog.android.rum.model.ErrorEvent;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ResourceEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzhy;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderMalfunctionError;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class RumResourceScope implements RumScope {
    public final long eventTimestamp;
    public final CueEncoder featuresContextResolver;
    public final OneShotDisposable firstPartyHostHeaderTypeResolver;
    public final RumContext initialContext;
    public final HurlStack insightsCollector;
    public final Object key;
    public int kind;
    public final int method;
    public final NetworkInfo networkInfo;
    public final RumViewScope parentScope;
    public final LinkedHashMap resourceAttributes;
    public final String resourceId;
    public final float sampleRate;
    public final InternalSdkCore sdkCore;
    public boolean sent;
    public Long size;
    public final long startedNanos;
    public Long statusCode;
    public boolean stopped;
    public ResourceTiming timing;
    public final String url;
    public boolean waitForTiming;

    public RumResourceScope(RumViewScope rumViewScope, InternalSdkCore internalSdkCore, String str, int i, Object obj, Time time, Map map, long j, OneShotDisposable oneShotDisposable, CueEncoder cueEncoder, float f, NetworkSettledMetricResolver networkSettledMetricResolver, HurlStack hurlStack) {
        internalSdkCore.getClass();
        if (i == 0) {
            throw null;
        }
        obj.getClass();
        map.getClass();
        oneShotDisposable.getClass();
        cueEncoder.getClass();
        networkSettledMetricResolver.getClass();
        hurlStack.getClass();
        this.parentScope = rumViewScope;
        this.sdkCore = internalSdkCore;
        this.url = str;
        this.method = i;
        this.key = obj;
        this.firstPartyHostHeaderTypeResolver = oneShotDisposable;
        this.featuresContextResolver = cueEncoder;
        this.sampleRate = f;
        this.insightsCollector = hurlStack;
        String m = Boxes$$ExternalSyntheticOutline1.m();
        this.resourceId = m;
        this.resourceAttributes = new LinkedHashMap(map);
        this.initialContext = rumViewScope.getRumContext();
        this.eventTimestamp = time.timestamp + j;
        this.startedNanos = time.nanoTime;
        this.networkInfo = internalSdkCore.getNetworkInfo();
        this.kind = 6;
        long j2 = time.nanoTime;
        if (networkSettledMetricResolver.viewWasStopped) {
            return;
        }
        ((AtomicInteger) networkSettledMetricResolver.currentViewDiagnostic.a).incrementAndGet();
        if (networkSettledMetricResolver.initialResourceIdentifier.validate(new NetworkSettledResourceContext(j2, networkSettledMetricResolver.viewCreatedTimestamp, m))) {
            ((AtomicInteger) networkSettledMetricResolver.currentViewDiagnostic.b).incrementAndGet();
            networkSettledMetricResolver.resourceStartedTimestamps.add(m);
        }
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final Map getCustomAttributes() {
        return MapsKt__MapsKt.plus(this.parentScope.getCustomAttributes(), this.resourceAttributes);
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumScope getParentScope() {
        return this.parentScope;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumContext getRumContext() {
        return this.initialContext;
    }

    @Override // com.datadog.android.rum.internal.domain.scope.RumScope
    public final RumScope handleEvent(RumRawEvent rumRawEvent, final DatadogContext datadogContext, Function1 function1, DataWriter dataWriter) {
        RumResourceScope rumResourceScope;
        final RumResourceScope rumResourceScope2 = this;
        rumRawEvent.getClass();
        datadogContext.getClass();
        function1.getClass();
        dataWriter.getClass();
        boolean z = rumRawEvent instanceof RumRawEvent.WaitForResourceTiming;
        Object obj = rumResourceScope2.key;
        if (z) {
            if (Intrinsics.areEqual(obj, ((RumRawEvent.WaitForResourceTiming) rumRawEvent).key)) {
                rumResourceScope2.waitForTiming = true;
            }
        } else if (rumRawEvent instanceof RumRawEvent.AddResourceTiming) {
            RumRawEvent.AddResourceTiming addResourceTiming = (RumRawEvent.AddResourceTiming) rumRawEvent;
            if (Intrinsics.areEqual(obj, addResourceTiming.key)) {
                rumResourceScope2.timing = addResourceTiming.timing;
                if (rumResourceScope2.stopped && !rumResourceScope2.sent) {
                    int i = rumResourceScope2.kind;
                    Long l = rumResourceScope2.statusCode;
                    Long l2 = rumResourceScope2.size;
                    Time time = addResourceTiming.eventTime;
                    rumResourceScope = rumResourceScope2;
                    rumResourceScope.sendResource(i, l, l2, time, datadogContext, function1, dataWriter);
                    rumResourceScope2 = rumResourceScope;
                }
            }
        } else {
            boolean z2 = rumRawEvent instanceof RumRawEvent.StopResource;
            LinkedHashMap linkedHashMap = rumResourceScope2.resourceAttributes;
            if (z2) {
                RumRawEvent.StopResource stopResource = (RumRawEvent.StopResource) rumRawEvent;
                if (Intrinsics.areEqual(obj, stopResource.key)) {
                    rumResourceScope2.stopped = true;
                    linkedHashMap.putAll(stopResource.attributes);
                    int i2 = stopResource.kind;
                    rumResourceScope2.kind = i2;
                    Long l3 = stopResource.statusCode;
                    rumResourceScope2.statusCode = l3;
                    Long l4 = stopResource.size;
                    rumResourceScope2.size = l4;
                    if (!rumResourceScope2.waitForTiming || rumResourceScope2.timing != null) {
                        Time time2 = stopResource.eventTime;
                        rumResourceScope = rumResourceScope2;
                        rumResourceScope.sendResource(i2, l3, l4, time2, datadogContext, function1, dataWriter);
                        rumResourceScope2 = rumResourceScope;
                    }
                }
            } else if (rumRawEvent instanceof RumRawEvent.StopResourceWithError) {
                RumRawEvent.StopResourceWithError stopResourceWithError = (RumRawEvent.StopResourceWithError) rumRawEvent;
                Object obj2 = stopResourceWithError.key;
                Throwable th = stopResourceWithError.throwable;
                if (Intrinsics.areEqual(obj, obj2)) {
                    linkedHashMap.putAll(stopResourceWithError.attributes);
                    final String str = stopResourceWithError.message;
                    final int i3 = stopResourceWithError.source;
                    final Long l5 = stopResourceWithError.statusCode;
                    final String loggableStackTrace = MapUtilsKt.loggableStackTrace(th);
                    final String canonicalName = th.getClass().getCanonicalName();
                    final long j = stopResourceWithError.eventTime.nanoTime;
                    Object remove = linkedHashMap.remove("_dd.error.fingerprint");
                    final String str2 = remove instanceof String ? (String) remove : null;
                    final RumContext rumContext = rumResourceScope2.initialContext;
                    String str3 = rumContext.syntheticsTestId;
                    String str4 = rumContext.syntheticsResultId;
                    final ErrorEvent.Synthetics synthetics = (str3 == null || StringsKt.isBlank(str3) || str4 == null || StringsKt.isBlank(str4)) ? null : new ErrorEvent.Synthetics(rumContext.syntheticsTestId, str4, null);
                    final int i4 = synthetics == null ? 1 : 2;
                    WriteOperation newRumEventWriteOperation = SdkCoreExtKt.newRumEventWriteOperation(rumResourceScope2.sdkCore, datadogContext, function1, dataWriter, 1, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i5;
                            long j2;
                            ErrorEvent.Provider provider;
                            int i6;
                            int i7;
                            String str5;
                            DatadogContext datadogContext2 = DatadogContext.this;
                            UserInfo userInfo = datadogContext2.userInfo;
                            DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                            RumResourceScope rumResourceScope3 = rumResourceScope2;
                            String str6 = rumResourceScope3.url;
                            CueEncoder cueEncoder = rumResourceScope3.featuresContextResolver;
                            RumContext rumContext2 = rumContext;
                            String str7 = rumContext2.viewId;
                            if (str7 == null) {
                                str7 = "";
                            }
                            cueEncoder.getClass();
                            boolean resolveViewHasReplay = CueEncoder.resolveViewHasReplay(datadogContext2, str7);
                            String str8 = datadogContext2.appBuildId;
                            long j3 = rumResourceScope3.eventTimestamp;
                            String uuid = UUID.randomUUID().toString();
                            int schemaSource = zzhy.toSchemaSource(i3);
                            int i8 = rumResourceScope3.method;
                            if (i8 == 0) {
                                throw null;
                            }
                            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i8)) {
                                case 0:
                                    i5 = 1;
                                    break;
                                case 1:
                                    i5 = 2;
                                    break;
                                case 2:
                                    i5 = 3;
                                    break;
                                case 3:
                                    i5 = 4;
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
                                case 7:
                                    i5 = 8;
                                    break;
                                case 8:
                                    i5 = 9;
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                            Long l6 = l5;
                            long longValue = l6 != null ? l6.longValue() : 0L;
                            if (rumResourceScope3.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str6)) {
                                try {
                                    str5 = new URL(str6).getHost();
                                    str5.getClass();
                                } catch (MalformedURLException unused) {
                                    str5 = str6;
                                }
                                j2 = j3;
                                provider = new ErrorEvent.Provider(str5, null, 7);
                            } else {
                                j2 = j3;
                                provider = null;
                            }
                            long j4 = j2;
                            ErrorEvent.Error error = new ErrorEvent.Error(uuid, str, schemaSource, loggableStackTrace, Boolean.FALSE, str2, canonicalName, 3, 1, new ErrorEvent.Resource(i5, longValue, str6, provider), null, null, 517648);
                            String str9 = rumContext2.actionId;
                            ErrorEvent.Action action = str9 != null ? new ErrorEvent.Action(CollectionsKt__CollectionsJVMKt.listOf(str9)) : null;
                            String str10 = rumContext2.viewId;
                            String str11 = str10 == null ? "" : str10;
                            String str12 = rumContext2.viewName;
                            String str13 = rumContext2.viewUrl;
                            ErrorEvent.ErrorEventView errorEventView = new ErrorEvent.ErrorEventView(str11, 18, (String) null, str13 == null ? "" : str13, str12);
                            ErrorEvent.Usr usr = RuntimeUtilsKt.hasUserData(userInfo) ? new ErrorEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                            ErrorEvent.Connectivity errorConnectivity = zzhy.toErrorConnectivity(rumResourceScope3.networkInfo);
                            ErrorEvent.Application application = new ErrorEvent.Application(rumContext2.applicationId, null);
                            ErrorEvent.ErrorEventSession errorEventSession = new ErrorEvent.ErrorEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext2.sessionId);
                            String str14 = datadogContext2.source;
                            InternalLogger internalLogger = rumResourceScope3.sdkCore.getInternalLogger();
                            str14.getClass();
                            internalLogger.getClass();
                            try {
                            } catch (NoSuchElementException e) {
                                DBUtil.log$default(internalLogger, 5, InternalLogger.Target.USER, new DatadogInterceptor$intercept$1(str14, 26), e, false, 48);
                                i6 = 0;
                            }
                            for (int i9 : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                                if (RumErrorSource$EnumUnboxingLocalUtility.getJsonValue$12(i9).equals(str14)) {
                                    i6 = i9;
                                    return new ErrorEvent(j4, application, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), str8, RumTagsUtilsKt.buildDDTagsString(datadogContext2), errorEventSession, i6, errorEventView, usr, null, errorConnectivity, synthetics, new ErrorEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion), new ErrorEvent.Device(zzhy.toErrorSchemaType(deviceInfo.deviceType), deviceInfo.deviceName, deviceInfo.deviceModel, deviceInfo.deviceBrand, deviceInfo.architecture, (List) null, (String) null, (Number) null, (Boolean) null, (Number) null, 2016), new ErrorEvent.Dd(new ErrorEvent.DdSession(zzhy.toErrorSessionPrecondition(rumContext2.sessionStartReason), 1), new ErrorEvent.Configuration(Float.valueOf(rumResourceScope3.sampleRate), null, null), null, null), new ErrorEvent.Context(new LinkedHashMap(rumResourceScope3.getCustomAttributes())), action, error, null, 27303936);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                    });
                    final int i5 = 0;
                    newRumEventWriteOperation.onError = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i6 = i5;
                            long j2 = j;
                            RumResourceScope rumResourceScope3 = rumResourceScope2;
                            RumContext rumContext2 = rumContext;
                            switch (i6) {
                                case 0:
                                    AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj3;
                                    advancedRumMonitor.getClass();
                                    String str5 = rumContext2.viewId;
                                    advancedRumMonitor.eventDropped(str5 != null ? str5 : "", new StorageEvent.Error(rumResourceScope3.resourceId, Long.valueOf(j2)));
                                    break;
                                default:
                                    AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj3;
                                    advancedRumMonitor2.getClass();
                                    String str6 = rumContext2.viewId;
                                    advancedRumMonitor2.eventSent(str6 != null ? str6 : "", new StorageEvent.Error(rumResourceScope3.resourceId, Long.valueOf(j2)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    final int i6 = 1;
                    rumResourceScope2 = this;
                    newRumEventWriteOperation.onSuccess = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendError$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            int i62 = i6;
                            long j2 = j;
                            RumResourceScope rumResourceScope3 = rumResourceScope2;
                            RumContext rumContext2 = rumContext;
                            switch (i62) {
                                case 0:
                                    AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj3;
                                    advancedRumMonitor.getClass();
                                    String str5 = rumContext2.viewId;
                                    advancedRumMonitor.eventDropped(str5 != null ? str5 : "", new StorageEvent.Error(rumResourceScope3.resourceId, Long.valueOf(j2)));
                                    break;
                                default:
                                    AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj3;
                                    advancedRumMonitor2.getClass();
                                    String str6 = rumContext2.viewId;
                                    advancedRumMonitor2.eventSent(str6 != null ? str6 : "", new StorageEvent.Error(rumResourceScope3.resourceId, Long.valueOf(j2)));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    newRumEventWriteOperation.submit();
                    rumResourceScope2.sent = true;
                }
            }
        }
        if (rumResourceScope2.sent) {
            return null;
        }
        return rumResourceScope2;
    }

    public final void logPayloadTruncationFailure(Throwable th) {
        DBUtil.log$default(this.sdkCore.getInternalLogger(), 5, InternalLogger.Target.MAINTAINER, RumViewScope$stopScope$1.INSTANCE$3, th, false, 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sendResource(final int i, final Long l, final Long l2, final Time time, final DatadogContext datadogContext, Function1 function1, DataWriter dataWriter) {
        RumContext rumContext;
        String str;
        String str2;
        String str3;
        final ResourceEvent.Graphql graphql;
        int i2;
        String upperCase;
        int i3;
        RumContext rumContext2;
        Iterator it;
        Timing timing;
        LinkedHashMap linkedHashMap = this.resourceAttributes;
        Object remove = linkedHashMap.remove("_dd.trace_id");
        final String obj = remove != null ? remove.toString() : null;
        Object remove2 = linkedHashMap.remove("_dd.span_id");
        final String obj2 = remove2 != null ? remove2.toString() : null;
        Object remove3 = linkedHashMap.remove("_dd.rule_psr");
        final Number number = remove3 instanceof Number ? (Number) remove3 : null;
        RumContext rumContext3 = this.initialContext;
        String str4 = rumContext3.syntheticsTestId;
        String str5 = rumContext3.syntheticsResultId;
        final ResourceEvent.Synthetics synthetics = (str4 == null || StringsKt.isBlank(str4) || str5 == null || StringsKt.isBlank(str5)) ? null : new ResourceEvent.Synthetics(rumContext3.syntheticsTestId, str5, null);
        final int i4 = synthetics == null ? 1 : 2;
        ResourceTiming resourceTiming = this.timing;
        if (resourceTiming == null) {
            Object remove4 = linkedHashMap.remove("_dd.resource_timings");
            Map map = remove4 instanceof Map ? (Map) remove4 : null;
            if (map != null) {
                List list = ExternalResourceTimingsKt.ALL_TIMINGS;
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    Object obj3 = map.get((String) next);
                    if (obj3 != null && (obj3 instanceof Map)) {
                        Map map2 = (Map) obj3;
                        Object obj4 = map2.get("startTime");
                        Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
                        Long valueOf = number2 != null ? Long.valueOf(number2.longValue()) : null;
                        Object obj5 = map2.get("duration");
                        Number number3 = obj5 instanceof Number ? (Number) obj5 : null;
                        Long valueOf2 = number3 != null ? Long.valueOf(number3.longValue()) : null;
                        if (valueOf != null && valueOf2 != null) {
                            rumContext2 = rumContext3;
                            it = it2;
                            timing = new Timing(valueOf.longValue(), valueOf2.longValue());
                            linkedHashMap2.put(next, timing);
                            rumContext3 = rumContext2;
                            it2 = it;
                        }
                    }
                    rumContext2 = rumContext3;
                    it = it2;
                    timing = null;
                    linkedHashMap2.put(next, timing);
                    rumContext3 = rumContext2;
                    it2 = it;
                }
                rumContext = rumContext3;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Timing) entry.getValue()) != null) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                if (linkedHashMap3.isEmpty()) {
                    resourceTiming = null;
                } else {
                    Timing timing2 = (Timing) linkedHashMap3.get("firstByte");
                    long j = timing2 != null ? timing2.startTime : 0L;
                    Timing timing3 = (Timing) linkedHashMap3.get("firstByte");
                    long j2 = timing3 != null ? timing3.duration : 0L;
                    Timing timing4 = (Timing) linkedHashMap3.get("download");
                    long j3 = timing4 != null ? timing4.startTime : 0L;
                    Timing timing5 = (Timing) linkedHashMap3.get("download");
                    long j4 = timing5 != null ? timing5.duration : 0L;
                    Timing timing6 = (Timing) linkedHashMap3.get("dns");
                    long j5 = timing6 != null ? timing6.startTime : 0L;
                    Timing timing7 = (Timing) linkedHashMap3.get("dns");
                    long j6 = timing7 != null ? timing7.duration : 0L;
                    Timing timing8 = (Timing) linkedHashMap3.get("connect");
                    long j7 = timing8 != null ? timing8.startTime : 0L;
                    Timing timing9 = (Timing) linkedHashMap3.get("connect");
                    long j8 = timing9 != null ? timing9.duration : 0L;
                    Timing timing10 = (Timing) linkedHashMap3.get("ssl");
                    long j9 = timing10 != null ? timing10.startTime : 0L;
                    Timing timing11 = (Timing) linkedHashMap3.get("ssl");
                    resourceTiming = new ResourceTiming(j5, j6, j7, j8, j9, timing11 != null ? timing11.duration : 0L, j, j2, j3, j4);
                }
                final ResourceTiming resourceTiming2 = resourceTiming;
                Object remove5 = linkedHashMap.remove("_dd.graphql.operation_name");
                String str6 = !(remove5 instanceof String) ? (String) remove5 : null;
                Object remove6 = linkedHashMap.remove("_dd.graphql.operation_type");
                str = !(remove6 instanceof String) ? (String) remove6 : null;
                Object remove7 = linkedHashMap.remove("_dd.graphql.variables");
                String str7 = !(remove7 instanceof String) ? (String) remove7 : null;
                Object remove8 = linkedHashMap.remove("_dd.graphql.payload");
                str2 = !(remove8 instanceof String) ? (String) remove8 : null;
                final int i5 = 0;
                if (str2 == null) {
                    String str8 = "";
                    CharsetEncoder newEncoder = StandardCharsets.UTF_8.newEncoder();
                    ByteBuffer allocate = ByteBuffer.allocate(30720);
                    CharBuffer wrap = CharBuffer.wrap(str2);
                    try {
                        newEncoder.encode(wrap, allocate, true);
                        str8 = str2.substring(0, wrap.position());
                    } catch (IllegalStateException e) {
                        logPayloadTruncationFailure(e);
                    } catch (NullPointerException e2) {
                        logPayloadTruncationFailure(e2);
                    } catch (CoderMalfunctionError e3) {
                        logPayloadTruncationFailure(e3);
                    }
                    str3 = str8;
                } else {
                    str3 = null;
                }
                if (str != null) {
                    InternalLogger internalLogger = this.sdkCore.getInternalLogger();
                    internalLogger.getClass();
                    try {
                        Locale locale = Locale.US;
                        locale.getClass();
                        upperCase = str.toUpperCase(locale);
                        upperCase.getClass();
                    } catch (IllegalArgumentException e4) {
                        DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str, 23), e4, 48);
                        i2 = 0;
                    }
                    if (upperCase != null) {
                        if (upperCase.equals("QUERY")) {
                            i3 = 1;
                        } else if (upperCase.equals("MUTATION")) {
                            i3 = 2;
                        } else if (upperCase.equals("SUBSCRIPTION")) {
                            i3 = 3;
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.datadog.android.rum.model.ResourceEvent.OperationType.".concat(upperCase));
                        }
                        i2 = i3;
                        if (i2 != 0) {
                            graphql = new ResourceEvent.Graphql(i2, str6, str3, str7, null, null);
                            final RumContext rumContext4 = rumContext;
                            WriteOperation newRumEventWriteOperation = SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, datadogContext, function1, dataWriter, 1, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't wrap try/catch for region: R(37:17|18|22|(2:24|(33:26|(2:28|(31:30|(2:32|(29:34|(2:36|(2:38|(27:40|(2:42|(24:44|45|(5:47|48|49|50|51)(1:132)|52|(1:54)(1:129)|55|(1:57)|58|(1:60)|61|(1:63)(1:128)|64|(1:66)(1:127)|67|68|72|(1:120)(1:75)|76|77|78|(2:80|(6:83|84|85|86|90|(4:92|93|97|98)(2:105|106))(1:82))|113|114|115))|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115)))|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115))|135|(0)|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115))|136|(0)|135|(0)|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115))|137|(0)|136|(0)|135|(0)|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115) */
                                /* JADX WARN: Code restructure failed: missing block: B:117:0x02bb, code lost:
                                
                                    r0 = move-exception;
                                 */
                                /* JADX WARN: Code restructure failed: missing block: B:119:0x02bd, code lost:
                                
                                    androidx.room.util.DBUtil.log$default(r14, 5, r30, new com.datadog.android.okhttp.DatadogInterceptor$intercept$1(r13, 28), r0, false, 48);
                                    r12 = 0;
                                 */
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:121:0x0234  */
                                /* JADX WARN: Removed duplicated region for block: B:122:0x023b  */
                                /* JADX WARN: Removed duplicated region for block: B:123:0x0242  */
                                /* JADX WARN: Removed duplicated region for block: B:124:0x0249  */
                                /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
                                /* JADX WARN: Removed duplicated region for block: B:126:0x0257  */
                                /* JADX WARN: Removed duplicated region for block: B:127:0x021c  */
                                /* JADX WARN: Removed duplicated region for block: B:128:0x020b  */
                                /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
                                /* JADX WARN: Removed duplicated region for block: B:132:0x0174  */
                                /* JADX WARN: Removed duplicated region for block: B:146:0x03cf  */
                                /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
                                /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
                                /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
                                /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
                                /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
                                /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
                                /* JADX WARN: Removed duplicated region for block: B:54:0x01ce  */
                                /* JADX WARN: Removed duplicated region for block: B:57:0x01e0  */
                                /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
                                /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
                                /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
                                /* JADX WARN: Removed duplicated region for block: B:69:0x0227  */
                                /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
                                /* JADX WARN: Removed duplicated region for block: B:74:0x025d A[ADDED_TO_REGION] */
                                /* JADX WARN: Removed duplicated region for block: B:80:0x029a A[Catch: NoSuchElementException -> 0x02bb, TryCatch #0 {NoSuchElementException -> 0x02bb, blocks: (B:78:0x0293, B:80:0x029a, B:82:0x02ab, B:114:0x02b0, B:115:0x02b7), top: B:77:0x0293 }] */
                                /* JADX WARN: Type inference failed for: r5v10 */
                                /* JADX WARN: Type inference failed for: r5v11 */
                                /* JADX WARN: Type inference failed for: r5v12 */
                                /* JADX WARN: Type inference failed for: r5v13 */
                                /* JADX WARN: Type inference failed for: r5v14 */
                                /* JADX WARN: Type inference failed for: r5v15, types: [com.datadog.android.rum.model.ResourceEvent$Plan, java.lang.Number] */
                                /* JADX WARN: Type inference failed for: r5v17 */
                                /* JADX WARN: Type inference failed for: r5v9 */
                                @Override // kotlin.jvm.functions.Function0
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke() {
                                    InternalLogger.Target target;
                                    Throwable th;
                                    int i6;
                                    int i7;
                                    int i8;
                                    RumContext rumContext5;
                                    long j10;
                                    Object obj6;
                                    Object obj7;
                                    int i9;
                                    Object obj8;
                                    Object obj9;
                                    int i10;
                                    Object obj10;
                                    Object obj11;
                                    Object obj12;
                                    Object obj13;
                                    int i11;
                                    Object obj14;
                                    int i12;
                                    Object obj15;
                                    String str9;
                                    String str10;
                                    NetworkInfo networkInfo;
                                    List list2;
                                    int i13;
                                    int i14;
                                    ?? r5;
                                    int i15;
                                    int length;
                                    String str11;
                                    DatadogContext datadogContext2 = DatadogContext.this;
                                    UserInfo userInfo = datadogContext2.userInfo;
                                    DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                                    RumResourceScope rumResourceScope = this;
                                    String str12 = rumResourceScope.url;
                                    InternalSdkCore internalSdkCore = rumResourceScope.sdkCore;
                                    CueEncoder cueEncoder = rumResourceScope.featuresContextResolver;
                                    RumContext rumContext6 = rumContext4;
                                    String str13 = rumContext6.viewId;
                                    if (str13 == null) {
                                        str13 = "";
                                    }
                                    cueEncoder.getClass();
                                    boolean resolveViewHasReplay = CueEncoder.resolveViewHasReplay(datadogContext2, str13);
                                    long j11 = time.nanoTime - rumResourceScope.startedNanos;
                                    InternalLogger.Target target2 = InternalLogger.Target.USER;
                                    if (j11 <= 0) {
                                        DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, target2, new KeyHandle$keyPair$2(rumResourceScope, 24), null, false, 56);
                                        target = target2;
                                        j11 = 1;
                                    } else {
                                        target = target2;
                                    }
                                    rumResourceScope.insightsCollector.getClass();
                                    long j12 = rumResourceScope.eventTimestamp;
                                    String str14 = rumResourceScope.resourceId;
                                    int i16 = i;
                                    if (i16 == 0) {
                                        throw null;
                                    }
                                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i16)) {
                                        case 0:
                                            th = null;
                                            i6 = 3;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                                throw th;
                                            }
                                            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i7)) {
                                                case 0:
                                                    i8 = 1;
                                                    break;
                                                case 1:
                                                    i8 = 2;
                                                    break;
                                                case 2:
                                                    i8 = 3;
                                                    break;
                                                case 3:
                                                    i8 = 4;
                                                    break;
                                                case 4:
                                                    i8 = 5;
                                                    break;
                                                case 5:
                                                    i8 = 6;
                                                    break;
                                                case 6:
                                                    i8 = 7;
                                                    break;
                                                case 7:
                                                    i8 = 8;
                                                    break;
                                                case 8:
                                                    i8 = 9;
                                                    break;
                                                default:
                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                    return th;
                                            }
                                            ResourceTiming resourceTiming3 = resourceTiming2;
                                            if (resourceTiming3 != null) {
                                                long j13 = resourceTiming3.dnsStart;
                                                if (j13 > 0) {
                                                    rumContext5 = rumContext6;
                                                    j10 = j11;
                                                    obj6 = new ResourceEvent.Dns(resourceTiming3.dnsDuration, j13);
                                                    if (resourceTiming3 != null) {
                                                        long j14 = resourceTiming3.connectStart;
                                                        if (j14 > 0) {
                                                            obj7 = obj6;
                                                            i9 = i8;
                                                            obj8 = new ResourceEvent.Connect(resourceTiming3.connectDuration, j14);
                                                            if (resourceTiming3 != null) {
                                                                long j15 = resourceTiming3.sslStart;
                                                                if (j15 > 0) {
                                                                    obj9 = obj8;
                                                                    i10 = i9;
                                                                    obj10 = new ResourceEvent.Ssl(resourceTiming3.sslDuration, j15);
                                                                    if (resourceTiming3 != null) {
                                                                        long j16 = resourceTiming3.firstByteStart;
                                                                        if (j16 >= 0) {
                                                                            long j17 = resourceTiming3.firstByteDuration;
                                                                            if (j17 > 0) {
                                                                                obj11 = obj10;
                                                                                obj12 = new ResourceEvent.FirstByte(j17, j16);
                                                                                if (resourceTiming3 != null) {
                                                                                    long j18 = resourceTiming3.downloadStart;
                                                                                    if (j18 > 0) {
                                                                                        obj13 = obj12;
                                                                                        i11 = i10;
                                                                                        obj14 = new ResourceEvent.Download(resourceTiming3.downloadDuration, j18);
                                                                                        if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                                                            i12 = 7;
                                                                                            obj15 = th;
                                                                                        } else {
                                                                                            try {
                                                                                                str11 = new URL(str12).getHost();
                                                                                                str11.getClass();
                                                                                            } catch (MalformedURLException unused) {
                                                                                                str11 = str12;
                                                                                            }
                                                                                            i12 = 7;
                                                                                            obj15 = new ResourceEvent.Provider(str11, th, 7);
                                                                                        }
                                                                                        RumContext rumContext7 = rumContext5;
                                                                                        int i17 = i12;
                                                                                        int i18 = i6;
                                                                                        int i19 = i11;
                                                                                        ResourceEvent.Resource resource = new ResourceEvent.Resource(str14, i18, i19, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                                                        String str15 = rumContext7.actionId;
                                                                                        ResourceEvent.Action action = str15 == null ? new ResourceEvent.Action(CollectionsKt__CollectionsJVMKt.listOf(str15)) : null;
                                                                                        str9 = rumContext7.viewId;
                                                                                        if (str9 == null) {
                                                                                            str9 = "";
                                                                                        }
                                                                                        String str16 = rumContext7.viewName;
                                                                                        str10 = rumContext7.viewUrl;
                                                                                        if (str10 == null) {
                                                                                            str10 = "";
                                                                                        }
                                                                                        ResourceEvent.ResourceEventView resourceEventView = new ResourceEvent.ResourceEventView(str9, null, str10, str16);
                                                                                        ResourceEvent.Usr usr = !RuntimeUtilsKt.hasUserData(userInfo) ? new ResourceEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                                                                                        networkInfo = rumResourceScope.networkInfo;
                                                                                        networkInfo.getClass();
                                                                                        boolean isConnected = zzhy.isConnected(networkInfo);
                                                                                        String str17 = networkInfo.carrierName;
                                                                                        int i20 = !isConnected ? 1 : 2;
                                                                                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                                                            case 0:
                                                                                                list2 = EmptyList.INSTANCE;
                                                                                                break;
                                                                                            case 1:
                                                                                                list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.ETHERNET);
                                                                                                break;
                                                                                            case 2:
                                                                                                list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.WIFI);
                                                                                                break;
                                                                                            case 3:
                                                                                                list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.WIMAX);
                                                                                                break;
                                                                                            case 4:
                                                                                                list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.BLUETOOTH);
                                                                                                break;
                                                                                            case 5:
                                                                                            case 6:
                                                                                            case 7:
                                                                                            case 8:
                                                                                            case 9:
                                                                                            case 10:
                                                                                                list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.CELLULAR);
                                                                                                break;
                                                                                            case 11:
                                                                                                list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.OTHER);
                                                                                                break;
                                                                                            default:
                                                                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                return null;
                                                                                        }
                                                                                        String str18 = networkInfo.cellularTechnology;
                                                                                        i13 = 0;
                                                                                        ResourceEvent.Connectivity connectivity = new ResourceEvent.Connectivity(i20, list2, 0, (str18 == null || str17 != null) ? new ResourceEvent.Cellular(str18, str17) : null);
                                                                                        ResourceEvent.Application application = new ResourceEvent.Application(rumContext7.applicationId, deviceInfo.localeInfo.currentLocale);
                                                                                        ResourceEvent.ResourceEventSession resourceEventSession = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext7.sessionId);
                                                                                        String str19 = datadogContext2.source;
                                                                                        InternalLogger internalLogger2 = internalSdkCore.getInternalLogger();
                                                                                        str19.getClass();
                                                                                        internalLogger2.getClass();
                                                                                        int[] values = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                                                        length = values.length;
                                                                                        while (i13 < length) {
                                                                                            int i21 = values[i13];
                                                                                            int[] iArr = values;
                                                                                            if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$20(i21).equals(str19)) {
                                                                                                int i22 = i21;
                                                                                                ResourceEvent.Os os = new ResourceEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                                                                                DeviceType deviceType = deviceInfo.deviceType;
                                                                                                deviceType.getClass();
                                                                                                switch (deviceType.ordinal()) {
                                                                                                    case 0:
                                                                                                        i14 = 1;
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        i14 = 3;
                                                                                                        break;
                                                                                                    case 2:
                                                                                                        i14 = 4;
                                                                                                        break;
                                                                                                    case 3:
                                                                                                        i14 = 2;
                                                                                                        break;
                                                                                                    case 4:
                                                                                                        i14 = 5;
                                                                                                        break;
                                                                                                    case 5:
                                                                                                        i14 = 6;
                                                                                                        break;
                                                                                                    case 6:
                                                                                                        i14 = i17;
                                                                                                        break;
                                                                                                    default:
                                                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                        return null;
                                                                                                }
                                                                                                String str20 = deviceInfo.deviceName;
                                                                                                String str21 = deviceInfo.deviceModel;
                                                                                                String str22 = deviceInfo.deviceBrand;
                                                                                                String str23 = deviceInfo.architecture;
                                                                                                LocaleInfo localeInfo = deviceInfo.localeInfo;
                                                                                                ResourceEvent.Device device = new ResourceEvent.Device(i14, str20, str21, str22, str23, null, localeInfo.locales, localeInfo.timeZone, null, null, null);
                                                                                                ResourceEvent.Context context = new ResourceEvent.Context(new LinkedHashMap(rumResourceScope.getCustomAttributes()));
                                                                                                int i23 = rumContext7.sessionStartReason;
                                                                                                if (i23 == 0) {
                                                                                                    throw null;
                                                                                                }
                                                                                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i23)) {
                                                                                                    case 0:
                                                                                                        r5 = 0;
                                                                                                        i15 = 1;
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        r5 = 0;
                                                                                                        i15 = 2;
                                                                                                        break;
                                                                                                    case 2:
                                                                                                        r5 = 0;
                                                                                                        i15 = 3;
                                                                                                        break;
                                                                                                    case 3:
                                                                                                        r5 = 0;
                                                                                                        i15 = 4;
                                                                                                        break;
                                                                                                    case 4:
                                                                                                        r5 = 0;
                                                                                                        i15 = 5;
                                                                                                        break;
                                                                                                    case 5:
                                                                                                        r5 = 0;
                                                                                                        i15 = 6;
                                                                                                        break;
                                                                                                    case 6:
                                                                                                        r5 = 0;
                                                                                                        i15 = i17;
                                                                                                        break;
                                                                                                    default:
                                                                                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                                        return null;
                                                                                                }
                                                                                                return new ResourceEvent(j12, application, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), datadogContext2.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext2), resourceEventSession, i22, resourceEventView, usr, null, connectivity, null, synthetics, null, os, device, new ResourceEvent.Dd(new ResourceEvent.DdSession(r5, i15), new ResourceEvent.Configuration(Float.valueOf(rumResourceScope.sampleRate), r5, r5), null, null, obj2, null, obj, number, null), context, action, null, resource);
                                                                                            }
                                                                                            i13++;
                                                                                            values = iArr;
                                                                                        }
                                                                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                                                    }
                                                                                }
                                                                                obj13 = obj12;
                                                                                i11 = i10;
                                                                                obj14 = th;
                                                                                if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                                                }
                                                                                RumContext rumContext72 = rumContext5;
                                                                                int i172 = i12;
                                                                                int i182 = i6;
                                                                                int i192 = i11;
                                                                                ResourceEvent.Resource resource2 = new ResourceEvent.Resource(str14, i182, i192, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                                                String str152 = rumContext72.actionId;
                                                                                if (str152 == null) {
                                                                                }
                                                                                str9 = rumContext72.viewId;
                                                                                if (str9 == null) {
                                                                                }
                                                                                String str162 = rumContext72.viewName;
                                                                                str10 = rumContext72.viewUrl;
                                                                                if (str10 == null) {
                                                                                }
                                                                                ResourceEvent.ResourceEventView resourceEventView2 = new ResourceEvent.ResourceEventView(str9, null, str10, str162);
                                                                                if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                                                                }
                                                                                networkInfo = rumResourceScope.networkInfo;
                                                                                networkInfo.getClass();
                                                                                boolean isConnected2 = zzhy.isConnected(networkInfo);
                                                                                String str172 = networkInfo.carrierName;
                                                                                if (!isConnected2) {
                                                                                }
                                                                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                                                }
                                                                                String str182 = networkInfo.cellularTechnology;
                                                                                i13 = 0;
                                                                                ResourceEvent.Connectivity connectivity2 = new ResourceEvent.Connectivity(i20, list2, 0, (str182 == null || str172 != null) ? new ResourceEvent.Cellular(str182, str172) : null);
                                                                                ResourceEvent.Application application2 = new ResourceEvent.Application(rumContext72.applicationId, deviceInfo.localeInfo.currentLocale);
                                                                                ResourceEvent.ResourceEventSession resourceEventSession2 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext72.sessionId);
                                                                                String str192 = datadogContext2.source;
                                                                                InternalLogger internalLogger22 = internalSdkCore.getInternalLogger();
                                                                                str192.getClass();
                                                                                internalLogger22.getClass();
                                                                                int[] values2 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                                                length = values2.length;
                                                                                while (i13 < length) {
                                                                                }
                                                                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                                            }
                                                                        }
                                                                    }
                                                                    obj11 = obj10;
                                                                    obj12 = th;
                                                                    if (resourceTiming3 != null) {
                                                                    }
                                                                    obj13 = obj12;
                                                                    i11 = i10;
                                                                    obj14 = th;
                                                                    if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                                    }
                                                                    RumContext rumContext722 = rumContext5;
                                                                    int i1722 = i12;
                                                                    int i1822 = i6;
                                                                    int i1922 = i11;
                                                                    ResourceEvent.Resource resource22 = new ResourceEvent.Resource(str14, i1822, i1922, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                                    String str1522 = rumContext722.actionId;
                                                                    if (str1522 == null) {
                                                                    }
                                                                    str9 = rumContext722.viewId;
                                                                    if (str9 == null) {
                                                                    }
                                                                    String str1622 = rumContext722.viewName;
                                                                    str10 = rumContext722.viewUrl;
                                                                    if (str10 == null) {
                                                                    }
                                                                    ResourceEvent.ResourceEventView resourceEventView22 = new ResourceEvent.ResourceEventView(str9, null, str10, str1622);
                                                                    if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                                                    }
                                                                    networkInfo = rumResourceScope.networkInfo;
                                                                    networkInfo.getClass();
                                                                    boolean isConnected22 = zzhy.isConnected(networkInfo);
                                                                    String str1722 = networkInfo.carrierName;
                                                                    if (!isConnected22) {
                                                                    }
                                                                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                                    }
                                                                    String str1822 = networkInfo.cellularTechnology;
                                                                    i13 = 0;
                                                                    ResourceEvent.Connectivity connectivity22 = new ResourceEvent.Connectivity(i20, list2, 0, (str1822 == null || str1722 != null) ? new ResourceEvent.Cellular(str1822, str1722) : null);
                                                                    ResourceEvent.Application application22 = new ResourceEvent.Application(rumContext722.applicationId, deviceInfo.localeInfo.currentLocale);
                                                                    ResourceEvent.ResourceEventSession resourceEventSession22 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext722.sessionId);
                                                                    String str1922 = datadogContext2.source;
                                                                    InternalLogger internalLogger222 = internalSdkCore.getInternalLogger();
                                                                    str1922.getClass();
                                                                    internalLogger222.getClass();
                                                                    int[] values22 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                                    length = values22.length;
                                                                    while (i13 < length) {
                                                                    }
                                                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                                }
                                                            }
                                                            obj9 = obj8;
                                                            i10 = i9;
                                                            obj10 = th;
                                                            if (resourceTiming3 != null) {
                                                            }
                                                            obj11 = obj10;
                                                            obj12 = th;
                                                            if (resourceTiming3 != null) {
                                                            }
                                                            obj13 = obj12;
                                                            i11 = i10;
                                                            obj14 = th;
                                                            if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                            }
                                                            RumContext rumContext7222 = rumContext5;
                                                            int i17222 = i12;
                                                            int i18222 = i6;
                                                            int i19222 = i11;
                                                            ResourceEvent.Resource resource222 = new ResourceEvent.Resource(str14, i18222, i19222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                            String str15222 = rumContext7222.actionId;
                                                            if (str15222 == null) {
                                                            }
                                                            str9 = rumContext7222.viewId;
                                                            if (str9 == null) {
                                                            }
                                                            String str16222 = rumContext7222.viewName;
                                                            str10 = rumContext7222.viewUrl;
                                                            if (str10 == null) {
                                                            }
                                                            ResourceEvent.ResourceEventView resourceEventView222 = new ResourceEvent.ResourceEventView(str9, null, str10, str16222);
                                                            if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                                            }
                                                            networkInfo = rumResourceScope.networkInfo;
                                                            networkInfo.getClass();
                                                            boolean isConnected222 = zzhy.isConnected(networkInfo);
                                                            String str17222 = networkInfo.carrierName;
                                                            if (!isConnected222) {
                                                            }
                                                            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                            }
                                                            String str18222 = networkInfo.cellularTechnology;
                                                            i13 = 0;
                                                            ResourceEvent.Connectivity connectivity222 = new ResourceEvent.Connectivity(i20, list2, 0, (str18222 == null || str17222 != null) ? new ResourceEvent.Cellular(str18222, str17222) : null);
                                                            ResourceEvent.Application application222 = new ResourceEvent.Application(rumContext7222.applicationId, deviceInfo.localeInfo.currentLocale);
                                                            ResourceEvent.ResourceEventSession resourceEventSession222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext7222.sessionId);
                                                            String str19222 = datadogContext2.source;
                                                            InternalLogger internalLogger2222 = internalSdkCore.getInternalLogger();
                                                            str19222.getClass();
                                                            internalLogger2222.getClass();
                                                            int[] values222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                            length = values222.length;
                                                            while (i13 < length) {
                                                            }
                                                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                        }
                                                    }
                                                    obj7 = obj6;
                                                    i9 = i8;
                                                    obj8 = th;
                                                    if (resourceTiming3 != null) {
                                                    }
                                                    obj9 = obj8;
                                                    i10 = i9;
                                                    obj10 = th;
                                                    if (resourceTiming3 != null) {
                                                    }
                                                    obj11 = obj10;
                                                    obj12 = th;
                                                    if (resourceTiming3 != null) {
                                                    }
                                                    obj13 = obj12;
                                                    i11 = i10;
                                                    obj14 = th;
                                                    if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                    }
                                                    RumContext rumContext72222 = rumContext5;
                                                    int i172222 = i12;
                                                    int i182222 = i6;
                                                    int i192222 = i11;
                                                    ResourceEvent.Resource resource2222 = new ResourceEvent.Resource(str14, i182222, i192222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                    String str152222 = rumContext72222.actionId;
                                                    if (str152222 == null) {
                                                    }
                                                    str9 = rumContext72222.viewId;
                                                    if (str9 == null) {
                                                    }
                                                    String str162222 = rumContext72222.viewName;
                                                    str10 = rumContext72222.viewUrl;
                                                    if (str10 == null) {
                                                    }
                                                    ResourceEvent.ResourceEventView resourceEventView2222 = new ResourceEvent.ResourceEventView(str9, null, str10, str162222);
                                                    if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                                    }
                                                    networkInfo = rumResourceScope.networkInfo;
                                                    networkInfo.getClass();
                                                    boolean isConnected2222 = zzhy.isConnected(networkInfo);
                                                    String str172222 = networkInfo.carrierName;
                                                    if (!isConnected2222) {
                                                    }
                                                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                    }
                                                    String str182222 = networkInfo.cellularTechnology;
                                                    i13 = 0;
                                                    ResourceEvent.Connectivity connectivity2222 = new ResourceEvent.Connectivity(i20, list2, 0, (str182222 == null || str172222 != null) ? new ResourceEvent.Cellular(str182222, str172222) : null);
                                                    ResourceEvent.Application application2222 = new ResourceEvent.Application(rumContext72222.applicationId, deviceInfo.localeInfo.currentLocale);
                                                    ResourceEvent.ResourceEventSession resourceEventSession2222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext72222.sessionId);
                                                    String str192222 = datadogContext2.source;
                                                    InternalLogger internalLogger22222 = internalSdkCore.getInternalLogger();
                                                    str192222.getClass();
                                                    internalLogger22222.getClass();
                                                    int[] values2222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                    length = values2222.length;
                                                    while (i13 < length) {
                                                    }
                                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                }
                                            }
                                            rumContext5 = rumContext6;
                                            j10 = j11;
                                            obj6 = th;
                                            if (resourceTiming3 != null) {
                                            }
                                            obj7 = obj6;
                                            i9 = i8;
                                            obj8 = th;
                                            if (resourceTiming3 != null) {
                                            }
                                            obj9 = obj8;
                                            i10 = i9;
                                            obj10 = th;
                                            if (resourceTiming3 != null) {
                                            }
                                            obj11 = obj10;
                                            obj12 = th;
                                            if (resourceTiming3 != null) {
                                            }
                                            obj13 = obj12;
                                            i11 = i10;
                                            obj14 = th;
                                            if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                            }
                                            RumContext rumContext722222 = rumContext5;
                                            int i1722222 = i12;
                                            int i1822222 = i6;
                                            int i1922222 = i11;
                                            ResourceEvent.Resource resource22222 = new ResourceEvent.Resource(str14, i1822222, i1922222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                            String str1522222 = rumContext722222.actionId;
                                            if (str1522222 == null) {
                                            }
                                            str9 = rumContext722222.viewId;
                                            if (str9 == null) {
                                            }
                                            String str1622222 = rumContext722222.viewName;
                                            str10 = rumContext722222.viewUrl;
                                            if (str10 == null) {
                                            }
                                            ResourceEvent.ResourceEventView resourceEventView22222 = new ResourceEvent.ResourceEventView(str9, null, str10, str1622222);
                                            if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                            }
                                            networkInfo = rumResourceScope.networkInfo;
                                            networkInfo.getClass();
                                            boolean isConnected22222 = zzhy.isConnected(networkInfo);
                                            String str1722222 = networkInfo.carrierName;
                                            if (!isConnected22222) {
                                            }
                                            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                            }
                                            String str1822222 = networkInfo.cellularTechnology;
                                            i13 = 0;
                                            ResourceEvent.Connectivity connectivity22222 = new ResourceEvent.Connectivity(i20, list2, 0, (str1822222 == null || str1722222 != null) ? new ResourceEvent.Cellular(str1822222, str1722222) : null);
                                            ResourceEvent.Application application22222 = new ResourceEvent.Application(rumContext722222.applicationId, deviceInfo.localeInfo.currentLocale);
                                            ResourceEvent.ResourceEventSession resourceEventSession22222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext722222.sessionId);
                                            String str1922222 = datadogContext2.source;
                                            InternalLogger internalLogger222222 = internalSdkCore.getInternalLogger();
                                            str1922222.getClass();
                                            internalLogger222222.getClass();
                                            int[] values22222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                            length = values22222.length;
                                            while (i13 < length) {
                                            }
                                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                                        case 1:
                                            th = null;
                                            i6 = 4;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        case 2:
                                            th = null;
                                            i6 = 2;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        case 3:
                                            th = null;
                                            i6 = 1;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        case 4:
                                            i6 = 11;
                                            th = null;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        case 5:
                                        case 11:
                                            i6 = 10;
                                            th = null;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        case 6:
                                            th = null;
                                            i6 = 7;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        case 7:
                                            th = null;
                                            i6 = 6;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        case 8:
                                            th = null;
                                            i6 = 8;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        case 9:
                                            th = null;
                                            i6 = 5;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        case 10:
                                            th = null;
                                            i6 = 9;
                                            i7 = rumResourceScope.method;
                                            if (i7 == 0) {
                                            }
                                            break;
                                        default:
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                    }
                                }
                            });
                            newRumEventWriteOperation.onError = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    int i6 = i5;
                                    Time time2 = time;
                                    RumResourceScope rumResourceScope = this;
                                    RumContext rumContext5 = rumContext4;
                                    switch (i6) {
                                        case 0:
                                            AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj6;
                                            advancedRumMonitor.getClass();
                                            String str9 = rumContext5.viewId;
                                            advancedRumMonitor.eventDropped(str9 != null ? str9 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                                            break;
                                        default:
                                            AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj6;
                                            advancedRumMonitor2.getClass();
                                            String str10 = rumContext5.viewId;
                                            advancedRumMonitor2.eventSent(str10 != null ? str10 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            final int i6 = 1;
                            newRumEventWriteOperation.onSuccess = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj6) {
                                    int i62 = i6;
                                    Time time2 = time;
                                    RumResourceScope rumResourceScope = this;
                                    RumContext rumContext5 = rumContext4;
                                    switch (i62) {
                                        case 0:
                                            AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj6;
                                            advancedRumMonitor.getClass();
                                            String str9 = rumContext5.viewId;
                                            advancedRumMonitor.eventDropped(str9 != null ? str9 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                                            break;
                                        default:
                                            AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj6;
                                            advancedRumMonitor2.getClass();
                                            String str10 = rumContext5.viewId;
                                            advancedRumMonitor2.eventSent(str10 != null ? str10 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            newRumEventWriteOperation.submit();
                            this.sent = true;
                        }
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$2("Name is null");
                    }
                    i3 = 0;
                    i2 = i3;
                    if (i2 != 0) {
                    }
                }
                graphql = null;
                final RumContext rumContext42 = rumContext;
                WriteOperation newRumEventWriteOperation2 = SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, datadogContext, function1, dataWriter, 1, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(37:17|18|22|(2:24|(33:26|(2:28|(31:30|(2:32|(29:34|(2:36|(2:38|(27:40|(2:42|(24:44|45|(5:47|48|49|50|51)(1:132)|52|(1:54)(1:129)|55|(1:57)|58|(1:60)|61|(1:63)(1:128)|64|(1:66)(1:127)|67|68|72|(1:120)(1:75)|76|77|78|(2:80|(6:83|84|85|86|90|(4:92|93|97|98)(2:105|106))(1:82))|113|114|115))|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115)))|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115))|135|(0)|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115))|136|(0)|135|(0)|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115))|137|(0)|136|(0)|135|(0)|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115) */
                    /* JADX WARN: Code restructure failed: missing block: B:117:0x02bb, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:119:0x02bd, code lost:
                    
                        androidx.room.util.DBUtil.log$default(r14, 5, r30, new com.datadog.android.okhttp.DatadogInterceptor$intercept$1(r13, 28), r0, false, 48);
                        r12 = 0;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:121:0x0234  */
                    /* JADX WARN: Removed duplicated region for block: B:122:0x023b  */
                    /* JADX WARN: Removed duplicated region for block: B:123:0x0242  */
                    /* JADX WARN: Removed duplicated region for block: B:124:0x0249  */
                    /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
                    /* JADX WARN: Removed duplicated region for block: B:126:0x0257  */
                    /* JADX WARN: Removed duplicated region for block: B:127:0x021c  */
                    /* JADX WARN: Removed duplicated region for block: B:128:0x020b  */
                    /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
                    /* JADX WARN: Removed duplicated region for block: B:132:0x0174  */
                    /* JADX WARN: Removed duplicated region for block: B:146:0x03cf  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x01ce  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x01e0  */
                    /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x0227  */
                    /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x025d A[ADDED_TO_REGION] */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x029a A[Catch: NoSuchElementException -> 0x02bb, TryCatch #0 {NoSuchElementException -> 0x02bb, blocks: (B:78:0x0293, B:80:0x029a, B:82:0x02ab, B:114:0x02b0, B:115:0x02b7), top: B:77:0x0293 }] */
                    /* JADX WARN: Type inference failed for: r5v10 */
                    /* JADX WARN: Type inference failed for: r5v11 */
                    /* JADX WARN: Type inference failed for: r5v12 */
                    /* JADX WARN: Type inference failed for: r5v13 */
                    /* JADX WARN: Type inference failed for: r5v14 */
                    /* JADX WARN: Type inference failed for: r5v15, types: [com.datadog.android.rum.model.ResourceEvent$Plan, java.lang.Number] */
                    /* JADX WARN: Type inference failed for: r5v17 */
                    /* JADX WARN: Type inference failed for: r5v9 */
                    @Override // kotlin.jvm.functions.Function0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke() {
                        InternalLogger.Target target;
                        Throwable th;
                        int i62;
                        int i7;
                        int i8;
                        RumContext rumContext5;
                        long j10;
                        Object obj6;
                        Object obj7;
                        int i9;
                        Object obj8;
                        Object obj9;
                        int i10;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        int i11;
                        Object obj14;
                        int i12;
                        Object obj15;
                        String str9;
                        String str10;
                        NetworkInfo networkInfo;
                        List list2;
                        int i13;
                        int i14;
                        ?? r5;
                        int i15;
                        int length;
                        String str11;
                        DatadogContext datadogContext2 = DatadogContext.this;
                        UserInfo userInfo = datadogContext2.userInfo;
                        DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                        RumResourceScope rumResourceScope = this;
                        String str12 = rumResourceScope.url;
                        InternalSdkCore internalSdkCore = rumResourceScope.sdkCore;
                        CueEncoder cueEncoder = rumResourceScope.featuresContextResolver;
                        RumContext rumContext6 = rumContext42;
                        String str13 = rumContext6.viewId;
                        if (str13 == null) {
                            str13 = "";
                        }
                        cueEncoder.getClass();
                        boolean resolveViewHasReplay = CueEncoder.resolveViewHasReplay(datadogContext2, str13);
                        long j11 = time.nanoTime - rumResourceScope.startedNanos;
                        InternalLogger.Target target2 = InternalLogger.Target.USER;
                        if (j11 <= 0) {
                            DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, target2, new KeyHandle$keyPair$2(rumResourceScope, 24), null, false, 56);
                            target = target2;
                            j11 = 1;
                        } else {
                            target = target2;
                        }
                        rumResourceScope.insightsCollector.getClass();
                        long j12 = rumResourceScope.eventTimestamp;
                        String str14 = rumResourceScope.resourceId;
                        int i16 = i;
                        if (i16 == 0) {
                            throw null;
                        }
                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i16)) {
                            case 0:
                                th = null;
                                i62 = 3;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                    throw th;
                                }
                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i7)) {
                                    case 0:
                                        i8 = 1;
                                        break;
                                    case 1:
                                        i8 = 2;
                                        break;
                                    case 2:
                                        i8 = 3;
                                        break;
                                    case 3:
                                        i8 = 4;
                                        break;
                                    case 4:
                                        i8 = 5;
                                        break;
                                    case 5:
                                        i8 = 6;
                                        break;
                                    case 6:
                                        i8 = 7;
                                        break;
                                    case 7:
                                        i8 = 8;
                                        break;
                                    case 8:
                                        i8 = 9;
                                        break;
                                    default:
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return th;
                                }
                                ResourceTiming resourceTiming3 = resourceTiming2;
                                if (resourceTiming3 != null) {
                                    long j13 = resourceTiming3.dnsStart;
                                    if (j13 > 0) {
                                        rumContext5 = rumContext6;
                                        j10 = j11;
                                        obj6 = new ResourceEvent.Dns(resourceTiming3.dnsDuration, j13);
                                        if (resourceTiming3 != null) {
                                            long j14 = resourceTiming3.connectStart;
                                            if (j14 > 0) {
                                                obj7 = obj6;
                                                i9 = i8;
                                                obj8 = new ResourceEvent.Connect(resourceTiming3.connectDuration, j14);
                                                if (resourceTiming3 != null) {
                                                    long j15 = resourceTiming3.sslStart;
                                                    if (j15 > 0) {
                                                        obj9 = obj8;
                                                        i10 = i9;
                                                        obj10 = new ResourceEvent.Ssl(resourceTiming3.sslDuration, j15);
                                                        if (resourceTiming3 != null) {
                                                            long j16 = resourceTiming3.firstByteStart;
                                                            if (j16 >= 0) {
                                                                long j17 = resourceTiming3.firstByteDuration;
                                                                if (j17 > 0) {
                                                                    obj11 = obj10;
                                                                    obj12 = new ResourceEvent.FirstByte(j17, j16);
                                                                    if (resourceTiming3 != null) {
                                                                        long j18 = resourceTiming3.downloadStart;
                                                                        if (j18 > 0) {
                                                                            obj13 = obj12;
                                                                            i11 = i10;
                                                                            obj14 = new ResourceEvent.Download(resourceTiming3.downloadDuration, j18);
                                                                            if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                                                i12 = 7;
                                                                                obj15 = th;
                                                                            } else {
                                                                                try {
                                                                                    str11 = new URL(str12).getHost();
                                                                                    str11.getClass();
                                                                                } catch (MalformedURLException unused) {
                                                                                    str11 = str12;
                                                                                }
                                                                                i12 = 7;
                                                                                obj15 = new ResourceEvent.Provider(str11, th, 7);
                                                                            }
                                                                            RumContext rumContext722222 = rumContext5;
                                                                            int i1722222 = i12;
                                                                            int i1822222 = i62;
                                                                            int i1922222 = i11;
                                                                            ResourceEvent.Resource resource22222 = new ResourceEvent.Resource(str14, i1822222, i1922222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                                            String str1522222 = rumContext722222.actionId;
                                                                            ResourceEvent.Action action = str1522222 == null ? new ResourceEvent.Action(CollectionsKt__CollectionsJVMKt.listOf(str1522222)) : null;
                                                                            str9 = rumContext722222.viewId;
                                                                            if (str9 == null) {
                                                                                str9 = "";
                                                                            }
                                                                            String str1622222 = rumContext722222.viewName;
                                                                            str10 = rumContext722222.viewUrl;
                                                                            if (str10 == null) {
                                                                                str10 = "";
                                                                            }
                                                                            ResourceEvent.ResourceEventView resourceEventView22222 = new ResourceEvent.ResourceEventView(str9, null, str10, str1622222);
                                                                            ResourceEvent.Usr usr = !RuntimeUtilsKt.hasUserData(userInfo) ? new ResourceEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                                                                            networkInfo = rumResourceScope.networkInfo;
                                                                            networkInfo.getClass();
                                                                            boolean isConnected22222 = zzhy.isConnected(networkInfo);
                                                                            String str1722222 = networkInfo.carrierName;
                                                                            int i20 = !isConnected22222 ? 1 : 2;
                                                                            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                                                case 0:
                                                                                    list2 = EmptyList.INSTANCE;
                                                                                    break;
                                                                                case 1:
                                                                                    list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.ETHERNET);
                                                                                    break;
                                                                                case 2:
                                                                                    list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.WIFI);
                                                                                    break;
                                                                                case 3:
                                                                                    list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.WIMAX);
                                                                                    break;
                                                                                case 4:
                                                                                    list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.BLUETOOTH);
                                                                                    break;
                                                                                case 5:
                                                                                case 6:
                                                                                case 7:
                                                                                case 8:
                                                                                case 9:
                                                                                case 10:
                                                                                    list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.CELLULAR);
                                                                                    break;
                                                                                case 11:
                                                                                    list2 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.OTHER);
                                                                                    break;
                                                                                default:
                                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                    return null;
                                                                            }
                                                                            String str1822222 = networkInfo.cellularTechnology;
                                                                            i13 = 0;
                                                                            ResourceEvent.Connectivity connectivity22222 = new ResourceEvent.Connectivity(i20, list2, 0, (str1822222 == null || str1722222 != null) ? new ResourceEvent.Cellular(str1822222, str1722222) : null);
                                                                            ResourceEvent.Application application22222 = new ResourceEvent.Application(rumContext722222.applicationId, deviceInfo.localeInfo.currentLocale);
                                                                            ResourceEvent.ResourceEventSession resourceEventSession22222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext722222.sessionId);
                                                                            String str1922222 = datadogContext2.source;
                                                                            InternalLogger internalLogger222222 = internalSdkCore.getInternalLogger();
                                                                            str1922222.getClass();
                                                                            internalLogger222222.getClass();
                                                                            int[] values22222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                                            length = values22222.length;
                                                                            while (i13 < length) {
                                                                                int i21 = values22222[i13];
                                                                                int[] iArr = values22222;
                                                                                if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$20(i21).equals(str1922222)) {
                                                                                    int i22 = i21;
                                                                                    ResourceEvent.Os os = new ResourceEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                                                                    DeviceType deviceType = deviceInfo.deviceType;
                                                                                    deviceType.getClass();
                                                                                    switch (deviceType.ordinal()) {
                                                                                        case 0:
                                                                                            i14 = 1;
                                                                                            break;
                                                                                        case 1:
                                                                                            i14 = 3;
                                                                                            break;
                                                                                        case 2:
                                                                                            i14 = 4;
                                                                                            break;
                                                                                        case 3:
                                                                                            i14 = 2;
                                                                                            break;
                                                                                        case 4:
                                                                                            i14 = 5;
                                                                                            break;
                                                                                        case 5:
                                                                                            i14 = 6;
                                                                                            break;
                                                                                        case 6:
                                                                                            i14 = i1722222;
                                                                                            break;
                                                                                        default:
                                                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                            return null;
                                                                                    }
                                                                                    String str20 = deviceInfo.deviceName;
                                                                                    String str21 = deviceInfo.deviceModel;
                                                                                    String str22 = deviceInfo.deviceBrand;
                                                                                    String str23 = deviceInfo.architecture;
                                                                                    LocaleInfo localeInfo = deviceInfo.localeInfo;
                                                                                    ResourceEvent.Device device = new ResourceEvent.Device(i14, str20, str21, str22, str23, null, localeInfo.locales, localeInfo.timeZone, null, null, null);
                                                                                    ResourceEvent.Context context = new ResourceEvent.Context(new LinkedHashMap(rumResourceScope.getCustomAttributes()));
                                                                                    int i23 = rumContext722222.sessionStartReason;
                                                                                    if (i23 == 0) {
                                                                                        throw null;
                                                                                    }
                                                                                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i23)) {
                                                                                        case 0:
                                                                                            r5 = 0;
                                                                                            i15 = 1;
                                                                                            break;
                                                                                        case 1:
                                                                                            r5 = 0;
                                                                                            i15 = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r5 = 0;
                                                                                            i15 = 3;
                                                                                            break;
                                                                                        case 3:
                                                                                            r5 = 0;
                                                                                            i15 = 4;
                                                                                            break;
                                                                                        case 4:
                                                                                            r5 = 0;
                                                                                            i15 = 5;
                                                                                            break;
                                                                                        case 5:
                                                                                            r5 = 0;
                                                                                            i15 = 6;
                                                                                            break;
                                                                                        case 6:
                                                                                            r5 = 0;
                                                                                            i15 = i1722222;
                                                                                            break;
                                                                                        default:
                                                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                            return null;
                                                                                    }
                                                                                    return new ResourceEvent(j12, application22222, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), datadogContext2.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext2), resourceEventSession22222, i22, resourceEventView22222, usr, null, connectivity22222, null, synthetics, null, os, device, new ResourceEvent.Dd(new ResourceEvent.DdSession(r5, i15), new ResourceEvent.Configuration(Float.valueOf(rumResourceScope.sampleRate), r5, r5), null, null, obj2, null, obj, number, null), context, action, null, resource22222);
                                                                                }
                                                                                i13++;
                                                                                values22222 = iArr;
                                                                            }
                                                                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                                        }
                                                                    }
                                                                    obj13 = obj12;
                                                                    i11 = i10;
                                                                    obj14 = th;
                                                                    if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                                    }
                                                                    RumContext rumContext7222222 = rumContext5;
                                                                    int i17222222 = i12;
                                                                    int i18222222 = i62;
                                                                    int i19222222 = i11;
                                                                    ResourceEvent.Resource resource222222 = new ResourceEvent.Resource(str14, i18222222, i19222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                                    String str15222222 = rumContext7222222.actionId;
                                                                    if (str15222222 == null) {
                                                                    }
                                                                    str9 = rumContext7222222.viewId;
                                                                    if (str9 == null) {
                                                                    }
                                                                    String str16222222 = rumContext7222222.viewName;
                                                                    str10 = rumContext7222222.viewUrl;
                                                                    if (str10 == null) {
                                                                    }
                                                                    ResourceEvent.ResourceEventView resourceEventView222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str16222222);
                                                                    if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                                                    }
                                                                    networkInfo = rumResourceScope.networkInfo;
                                                                    networkInfo.getClass();
                                                                    boolean isConnected222222 = zzhy.isConnected(networkInfo);
                                                                    String str17222222 = networkInfo.carrierName;
                                                                    if (!isConnected222222) {
                                                                    }
                                                                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                                    }
                                                                    String str18222222 = networkInfo.cellularTechnology;
                                                                    i13 = 0;
                                                                    ResourceEvent.Connectivity connectivity222222 = new ResourceEvent.Connectivity(i20, list2, 0, (str18222222 == null || str17222222 != null) ? new ResourceEvent.Cellular(str18222222, str17222222) : null);
                                                                    ResourceEvent.Application application222222 = new ResourceEvent.Application(rumContext7222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                                                    ResourceEvent.ResourceEventSession resourceEventSession222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext7222222.sessionId);
                                                                    String str19222222 = datadogContext2.source;
                                                                    InternalLogger internalLogger2222222 = internalSdkCore.getInternalLogger();
                                                                    str19222222.getClass();
                                                                    internalLogger2222222.getClass();
                                                                    int[] values222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                                    length = values222222.length;
                                                                    while (i13 < length) {
                                                                    }
                                                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                                }
                                                            }
                                                        }
                                                        obj11 = obj10;
                                                        obj12 = th;
                                                        if (resourceTiming3 != null) {
                                                        }
                                                        obj13 = obj12;
                                                        i11 = i10;
                                                        obj14 = th;
                                                        if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                        }
                                                        RumContext rumContext72222222 = rumContext5;
                                                        int i172222222 = i12;
                                                        int i182222222 = i62;
                                                        int i192222222 = i11;
                                                        ResourceEvent.Resource resource2222222 = new ResourceEvent.Resource(str14, i182222222, i192222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                        String str152222222 = rumContext72222222.actionId;
                                                        if (str152222222 == null) {
                                                        }
                                                        str9 = rumContext72222222.viewId;
                                                        if (str9 == null) {
                                                        }
                                                        String str162222222 = rumContext72222222.viewName;
                                                        str10 = rumContext72222222.viewUrl;
                                                        if (str10 == null) {
                                                        }
                                                        ResourceEvent.ResourceEventView resourceEventView2222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str162222222);
                                                        if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                                        }
                                                        networkInfo = rumResourceScope.networkInfo;
                                                        networkInfo.getClass();
                                                        boolean isConnected2222222 = zzhy.isConnected(networkInfo);
                                                        String str172222222 = networkInfo.carrierName;
                                                        if (!isConnected2222222) {
                                                        }
                                                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                        }
                                                        String str182222222 = networkInfo.cellularTechnology;
                                                        i13 = 0;
                                                        ResourceEvent.Connectivity connectivity2222222 = new ResourceEvent.Connectivity(i20, list2, 0, (str182222222 == null || str172222222 != null) ? new ResourceEvent.Cellular(str182222222, str172222222) : null);
                                                        ResourceEvent.Application application2222222 = new ResourceEvent.Application(rumContext72222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                                        ResourceEvent.ResourceEventSession resourceEventSession2222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext72222222.sessionId);
                                                        String str192222222 = datadogContext2.source;
                                                        InternalLogger internalLogger22222222 = internalSdkCore.getInternalLogger();
                                                        str192222222.getClass();
                                                        internalLogger22222222.getClass();
                                                        int[] values2222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                        length = values2222222.length;
                                                        while (i13 < length) {
                                                        }
                                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                    }
                                                }
                                                obj9 = obj8;
                                                i10 = i9;
                                                obj10 = th;
                                                if (resourceTiming3 != null) {
                                                }
                                                obj11 = obj10;
                                                obj12 = th;
                                                if (resourceTiming3 != null) {
                                                }
                                                obj13 = obj12;
                                                i11 = i10;
                                                obj14 = th;
                                                if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                }
                                                RumContext rumContext722222222 = rumContext5;
                                                int i1722222222 = i12;
                                                int i1822222222 = i62;
                                                int i1922222222 = i11;
                                                ResourceEvent.Resource resource22222222 = new ResourceEvent.Resource(str14, i1822222222, i1922222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                String str1522222222 = rumContext722222222.actionId;
                                                if (str1522222222 == null) {
                                                }
                                                str9 = rumContext722222222.viewId;
                                                if (str9 == null) {
                                                }
                                                String str1622222222 = rumContext722222222.viewName;
                                                str10 = rumContext722222222.viewUrl;
                                                if (str10 == null) {
                                                }
                                                ResourceEvent.ResourceEventView resourceEventView22222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str1622222222);
                                                if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                                }
                                                networkInfo = rumResourceScope.networkInfo;
                                                networkInfo.getClass();
                                                boolean isConnected22222222 = zzhy.isConnected(networkInfo);
                                                String str1722222222 = networkInfo.carrierName;
                                                if (!isConnected22222222) {
                                                }
                                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                }
                                                String str1822222222 = networkInfo.cellularTechnology;
                                                i13 = 0;
                                                ResourceEvent.Connectivity connectivity22222222 = new ResourceEvent.Connectivity(i20, list2, 0, (str1822222222 == null || str1722222222 != null) ? new ResourceEvent.Cellular(str1822222222, str1722222222) : null);
                                                ResourceEvent.Application application22222222 = new ResourceEvent.Application(rumContext722222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                                ResourceEvent.ResourceEventSession resourceEventSession22222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext722222222.sessionId);
                                                String str1922222222 = datadogContext2.source;
                                                InternalLogger internalLogger222222222 = internalSdkCore.getInternalLogger();
                                                str1922222222.getClass();
                                                internalLogger222222222.getClass();
                                                int[] values22222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                length = values22222222.length;
                                                while (i13 < length) {
                                                }
                                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                                            }
                                        }
                                        obj7 = obj6;
                                        i9 = i8;
                                        obj8 = th;
                                        if (resourceTiming3 != null) {
                                        }
                                        obj9 = obj8;
                                        i10 = i9;
                                        obj10 = th;
                                        if (resourceTiming3 != null) {
                                        }
                                        obj11 = obj10;
                                        obj12 = th;
                                        if (resourceTiming3 != null) {
                                        }
                                        obj13 = obj12;
                                        i11 = i10;
                                        obj14 = th;
                                        if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                        }
                                        RumContext rumContext7222222222 = rumContext5;
                                        int i17222222222 = i12;
                                        int i18222222222 = i62;
                                        int i19222222222 = i11;
                                        ResourceEvent.Resource resource222222222 = new ResourceEvent.Resource(str14, i18222222222, i19222222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                        String str15222222222 = rumContext7222222222.actionId;
                                        if (str15222222222 == null) {
                                        }
                                        str9 = rumContext7222222222.viewId;
                                        if (str9 == null) {
                                        }
                                        String str16222222222 = rumContext7222222222.viewName;
                                        str10 = rumContext7222222222.viewUrl;
                                        if (str10 == null) {
                                        }
                                        ResourceEvent.ResourceEventView resourceEventView222222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str16222222222);
                                        if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                        }
                                        networkInfo = rumResourceScope.networkInfo;
                                        networkInfo.getClass();
                                        boolean isConnected222222222 = zzhy.isConnected(networkInfo);
                                        String str17222222222 = networkInfo.carrierName;
                                        if (!isConnected222222222) {
                                        }
                                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                        }
                                        String str18222222222 = networkInfo.cellularTechnology;
                                        i13 = 0;
                                        ResourceEvent.Connectivity connectivity222222222 = new ResourceEvent.Connectivity(i20, list2, 0, (str18222222222 == null || str17222222222 != null) ? new ResourceEvent.Cellular(str18222222222, str17222222222) : null);
                                        ResourceEvent.Application application222222222 = new ResourceEvent.Application(rumContext7222222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                        ResourceEvent.ResourceEventSession resourceEventSession222222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext7222222222.sessionId);
                                        String str19222222222 = datadogContext2.source;
                                        InternalLogger internalLogger2222222222 = internalSdkCore.getInternalLogger();
                                        str19222222222.getClass();
                                        internalLogger2222222222.getClass();
                                        int[] values222222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                        length = values222222222.length;
                                        while (i13 < length) {
                                        }
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                }
                                rumContext5 = rumContext6;
                                j10 = j11;
                                obj6 = th;
                                if (resourceTiming3 != null) {
                                }
                                obj7 = obj6;
                                i9 = i8;
                                obj8 = th;
                                if (resourceTiming3 != null) {
                                }
                                obj9 = obj8;
                                i10 = i9;
                                obj10 = th;
                                if (resourceTiming3 != null) {
                                }
                                obj11 = obj10;
                                obj12 = th;
                                if (resourceTiming3 != null) {
                                }
                                obj13 = obj12;
                                i11 = i10;
                                obj14 = th;
                                if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                }
                                RumContext rumContext72222222222 = rumContext5;
                                int i172222222222 = i12;
                                int i182222222222 = i62;
                                int i192222222222 = i11;
                                ResourceEvent.Resource resource2222222222 = new ResourceEvent.Resource(str14, i182222222222, i192222222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                String str152222222222 = rumContext72222222222.actionId;
                                if (str152222222222 == null) {
                                }
                                str9 = rumContext72222222222.viewId;
                                if (str9 == null) {
                                }
                                String str162222222222 = rumContext72222222222.viewName;
                                str10 = rumContext72222222222.viewUrl;
                                if (str10 == null) {
                                }
                                ResourceEvent.ResourceEventView resourceEventView2222222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str162222222222);
                                if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                }
                                networkInfo = rumResourceScope.networkInfo;
                                networkInfo.getClass();
                                boolean isConnected2222222222 = zzhy.isConnected(networkInfo);
                                String str172222222222 = networkInfo.carrierName;
                                if (!isConnected2222222222) {
                                }
                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                }
                                String str182222222222 = networkInfo.cellularTechnology;
                                i13 = 0;
                                ResourceEvent.Connectivity connectivity2222222222 = new ResourceEvent.Connectivity(i20, list2, 0, (str182222222222 == null || str172222222222 != null) ? new ResourceEvent.Cellular(str182222222222, str172222222222) : null);
                                ResourceEvent.Application application2222222222 = new ResourceEvent.Application(rumContext72222222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                ResourceEvent.ResourceEventSession resourceEventSession2222222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext72222222222.sessionId);
                                String str192222222222 = datadogContext2.source;
                                InternalLogger internalLogger22222222222 = internalSdkCore.getInternalLogger();
                                str192222222222.getClass();
                                internalLogger22222222222.getClass();
                                int[] values2222222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                length = values2222222222.length;
                                while (i13 < length) {
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            case 1:
                                th = null;
                                i62 = 4;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            case 2:
                                th = null;
                                i62 = 2;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            case 3:
                                th = null;
                                i62 = 1;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            case 4:
                                i62 = 11;
                                th = null;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            case 5:
                            case 11:
                                i62 = 10;
                                th = null;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            case 6:
                                th = null;
                                i62 = 7;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            case 7:
                                th = null;
                                i62 = 6;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            case 8:
                                th = null;
                                i62 = 8;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            case 9:
                                th = null;
                                i62 = 5;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            case 10:
                                th = null;
                                i62 = 9;
                                i7 = rumResourceScope.method;
                                if (i7 == 0) {
                                }
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                        }
                    }
                });
                newRumEventWriteOperation2.onError = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i62 = i5;
                        Time time2 = time;
                        RumResourceScope rumResourceScope = this;
                        RumContext rumContext5 = rumContext42;
                        switch (i62) {
                            case 0:
                                AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj6;
                                advancedRumMonitor.getClass();
                                String str9 = rumContext5.viewId;
                                advancedRumMonitor.eventDropped(str9 != null ? str9 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                                break;
                            default:
                                AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj6;
                                advancedRumMonitor2.getClass();
                                String str10 = rumContext5.viewId;
                                advancedRumMonitor2.eventSent(str10 != null ? str10 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                final int i62 = 1;
                newRumEventWriteOperation2.onSuccess = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i622 = i62;
                        Time time2 = time;
                        RumResourceScope rumResourceScope = this;
                        RumContext rumContext5 = rumContext42;
                        switch (i622) {
                            case 0:
                                AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj6;
                                advancedRumMonitor.getClass();
                                String str9 = rumContext5.viewId;
                                advancedRumMonitor.eventDropped(str9 != null ? str9 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                                break;
                            default:
                                AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj6;
                                advancedRumMonitor2.getClass();
                                String str10 = rumContext5.viewId;
                                advancedRumMonitor2.eventSent(str10 != null ? str10 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                newRumEventWriteOperation2.submit();
                this.sent = true;
            }
            List list2 = ExternalResourceTimingsKt.ALL_TIMINGS;
            resourceTiming = null;
        }
        rumContext = rumContext3;
        final ResourceTiming resourceTiming22 = resourceTiming;
        Object remove52 = linkedHashMap.remove("_dd.graphql.operation_name");
        if (!(remove52 instanceof String)) {
        }
        Object remove62 = linkedHashMap.remove("_dd.graphql.operation_type");
        if (!(remove62 instanceof String)) {
        }
        Object remove72 = linkedHashMap.remove("_dd.graphql.variables");
        if (!(remove72 instanceof String)) {
        }
        Object remove82 = linkedHashMap.remove("_dd.graphql.payload");
        if (!(remove82 instanceof String)) {
        }
        final int i52 = 0;
        if (str2 == null) {
        }
        if (str != null) {
        }
        graphql = null;
        final RumContext rumContext422 = rumContext;
        WriteOperation newRumEventWriteOperation22 = SdkCoreExtKt.newRumEventWriteOperation(this.sdkCore, datadogContext, function1, dataWriter, 1, new Function0() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(37:17|18|22|(2:24|(33:26|(2:28|(31:30|(2:32|(29:34|(2:36|(2:38|(27:40|(2:42|(24:44|45|(5:47|48|49|50|51)(1:132)|52|(1:54)(1:129)|55|(1:57)|58|(1:60)|61|(1:63)(1:128)|64|(1:66)(1:127)|67|68|72|(1:120)(1:75)|76|77|78|(2:80|(6:83|84|85|86|90|(4:92|93|97|98)(2:105|106))(1:82))|113|114|115))|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115)))|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115))|135|(0)|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115))|136|(0)|135|(0)|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115))|137|(0)|136|(0)|135|(0)|134|(0)|133|45|(0)(0)|52|(0)(0)|55|(0)|58|(0)|61|(0)(0)|64|(0)(0)|67|68|72|(0)|120|76|77|78|(0)|113|114|115) */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x02bb, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:119:0x02bd, code lost:
            
                androidx.room.util.DBUtil.log$default(r14, 5, r30, new com.datadog.android.okhttp.DatadogInterceptor$intercept$1(r13, 28), r0, false, 48);
                r12 = 0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0234  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x023b  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x0242  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x0249  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x0250  */
            /* JADX WARN: Removed duplicated region for block: B:126:0x0257  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x021c  */
            /* JADX WARN: Removed duplicated region for block: B:128:0x020b  */
            /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
            /* JADX WARN: Removed duplicated region for block: B:132:0x0174  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x03cf  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x010c  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x013e  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x01ce  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x01e0  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01e8  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0227  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x022d  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x025d A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x029a A[Catch: NoSuchElementException -> 0x02bb, TryCatch #0 {NoSuchElementException -> 0x02bb, blocks: (B:78:0x0293, B:80:0x029a, B:82:0x02ab, B:114:0x02b0, B:115:0x02b7), top: B:77:0x0293 }] */
            /* JADX WARN: Type inference failed for: r5v10 */
            /* JADX WARN: Type inference failed for: r5v11 */
            /* JADX WARN: Type inference failed for: r5v12 */
            /* JADX WARN: Type inference failed for: r5v13 */
            /* JADX WARN: Type inference failed for: r5v14 */
            /* JADX WARN: Type inference failed for: r5v15, types: [com.datadog.android.rum.model.ResourceEvent$Plan, java.lang.Number] */
            /* JADX WARN: Type inference failed for: r5v17 */
            /* JADX WARN: Type inference failed for: r5v9 */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke() {
                InternalLogger.Target target;
                Throwable th;
                int i622;
                int i7;
                int i8;
                RumContext rumContext5;
                long j10;
                Object obj6;
                Object obj7;
                int i9;
                Object obj8;
                Object obj9;
                int i10;
                Object obj10;
                Object obj11;
                Object obj12;
                Object obj13;
                int i11;
                Object obj14;
                int i12;
                Object obj15;
                String str9;
                String str10;
                NetworkInfo networkInfo;
                List list22;
                int i13;
                int i14;
                ?? r5;
                int i15;
                int length;
                String str11;
                DatadogContext datadogContext2 = DatadogContext.this;
                UserInfo userInfo = datadogContext2.userInfo;
                DeviceInfo deviceInfo = datadogContext2.deviceInfo;
                RumResourceScope rumResourceScope = this;
                String str12 = rumResourceScope.url;
                InternalSdkCore internalSdkCore = rumResourceScope.sdkCore;
                CueEncoder cueEncoder = rumResourceScope.featuresContextResolver;
                RumContext rumContext6 = rumContext422;
                String str13 = rumContext6.viewId;
                if (str13 == null) {
                    str13 = "";
                }
                cueEncoder.getClass();
                boolean resolveViewHasReplay = CueEncoder.resolveViewHasReplay(datadogContext2, str13);
                long j11 = time.nanoTime - rumResourceScope.startedNanos;
                InternalLogger.Target target2 = InternalLogger.Target.USER;
                if (j11 <= 0) {
                    DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, target2, new KeyHandle$keyPair$2(rumResourceScope, 24), null, false, 56);
                    target = target2;
                    j11 = 1;
                } else {
                    target = target2;
                }
                rumResourceScope.insightsCollector.getClass();
                long j12 = rumResourceScope.eventTimestamp;
                String str14 = rumResourceScope.resourceId;
                int i16 = i;
                if (i16 == 0) {
                    throw null;
                }
                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i16)) {
                    case 0:
                        th = null;
                        i622 = 3;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                            throw th;
                        }
                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i7)) {
                            case 0:
                                i8 = 1;
                                break;
                            case 1:
                                i8 = 2;
                                break;
                            case 2:
                                i8 = 3;
                                break;
                            case 3:
                                i8 = 4;
                                break;
                            case 4:
                                i8 = 5;
                                break;
                            case 5:
                                i8 = 6;
                                break;
                            case 6:
                                i8 = 7;
                                break;
                            case 7:
                                i8 = 8;
                                break;
                            case 8:
                                i8 = 9;
                                break;
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return th;
                        }
                        ResourceTiming resourceTiming3 = resourceTiming22;
                        if (resourceTiming3 != null) {
                            long j13 = resourceTiming3.dnsStart;
                            if (j13 > 0) {
                                rumContext5 = rumContext6;
                                j10 = j11;
                                obj6 = new ResourceEvent.Dns(resourceTiming3.dnsDuration, j13);
                                if (resourceTiming3 != null) {
                                    long j14 = resourceTiming3.connectStart;
                                    if (j14 > 0) {
                                        obj7 = obj6;
                                        i9 = i8;
                                        obj8 = new ResourceEvent.Connect(resourceTiming3.connectDuration, j14);
                                        if (resourceTiming3 != null) {
                                            long j15 = resourceTiming3.sslStart;
                                            if (j15 > 0) {
                                                obj9 = obj8;
                                                i10 = i9;
                                                obj10 = new ResourceEvent.Ssl(resourceTiming3.sslDuration, j15);
                                                if (resourceTiming3 != null) {
                                                    long j16 = resourceTiming3.firstByteStart;
                                                    if (j16 >= 0) {
                                                        long j17 = resourceTiming3.firstByteDuration;
                                                        if (j17 > 0) {
                                                            obj11 = obj10;
                                                            obj12 = new ResourceEvent.FirstByte(j17, j16);
                                                            if (resourceTiming3 != null) {
                                                                long j18 = resourceTiming3.downloadStart;
                                                                if (j18 > 0) {
                                                                    obj13 = obj12;
                                                                    i11 = i10;
                                                                    obj14 = new ResourceEvent.Download(resourceTiming3.downloadDuration, j18);
                                                                    if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                                        i12 = 7;
                                                                        obj15 = th;
                                                                    } else {
                                                                        try {
                                                                            str11 = new URL(str12).getHost();
                                                                            str11.getClass();
                                                                        } catch (MalformedURLException unused) {
                                                                            str11 = str12;
                                                                        }
                                                                        i12 = 7;
                                                                        obj15 = new ResourceEvent.Provider(str11, th, 7);
                                                                    }
                                                                    RumContext rumContext72222222222 = rumContext5;
                                                                    int i172222222222 = i12;
                                                                    int i182222222222 = i622;
                                                                    int i192222222222 = i11;
                                                                    ResourceEvent.Resource resource2222222222 = new ResourceEvent.Resource(str14, i182222222222, i192222222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                                    String str152222222222 = rumContext72222222222.actionId;
                                                                    ResourceEvent.Action action = str152222222222 == null ? new ResourceEvent.Action(CollectionsKt__CollectionsJVMKt.listOf(str152222222222)) : null;
                                                                    str9 = rumContext72222222222.viewId;
                                                                    if (str9 == null) {
                                                                        str9 = "";
                                                                    }
                                                                    String str162222222222 = rumContext72222222222.viewName;
                                                                    str10 = rumContext72222222222.viewUrl;
                                                                    if (str10 == null) {
                                                                        str10 = "";
                                                                    }
                                                                    ResourceEvent.ResourceEventView resourceEventView2222222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str162222222222);
                                                                    ResourceEvent.Usr usr = !RuntimeUtilsKt.hasUserData(userInfo) ? new ResourceEvent.Usr(userInfo.id, userInfo.name, userInfo.email, userInfo.anonymousId, MapsKt__MapsKt.toMutableMap(userInfo.additionalProperties)) : null;
                                                                    networkInfo = rumResourceScope.networkInfo;
                                                                    networkInfo.getClass();
                                                                    boolean isConnected2222222222 = zzhy.isConnected(networkInfo);
                                                                    String str172222222222 = networkInfo.carrierName;
                                                                    int i20 = !isConnected2222222222 ? 1 : 2;
                                                                    switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                                        case 0:
                                                                            list22 = EmptyList.INSTANCE;
                                                                            break;
                                                                        case 1:
                                                                            list22 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.ETHERNET);
                                                                            break;
                                                                        case 2:
                                                                            list22 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.WIFI);
                                                                            break;
                                                                        case 3:
                                                                            list22 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.WIMAX);
                                                                            break;
                                                                        case 4:
                                                                            list22 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.BLUETOOTH);
                                                                            break;
                                                                        case 5:
                                                                        case 6:
                                                                        case 7:
                                                                        case 8:
                                                                        case 9:
                                                                        case 10:
                                                                            list22 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.CELLULAR);
                                                                            break;
                                                                        case 11:
                                                                            list22 = CollectionsKt__CollectionsJVMKt.listOf(ResourceEvent.Interface.OTHER);
                                                                            break;
                                                                        default:
                                                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                            return null;
                                                                    }
                                                                    String str182222222222 = networkInfo.cellularTechnology;
                                                                    i13 = 0;
                                                                    ResourceEvent.Connectivity connectivity2222222222 = new ResourceEvent.Connectivity(i20, list22, 0, (str182222222222 == null || str172222222222 != null) ? new ResourceEvent.Cellular(str182222222222, str172222222222) : null);
                                                                    ResourceEvent.Application application2222222222 = new ResourceEvent.Application(rumContext72222222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                                                    ResourceEvent.ResourceEventSession resourceEventSession2222222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext72222222222.sessionId);
                                                                    String str192222222222 = datadogContext2.source;
                                                                    InternalLogger internalLogger22222222222 = internalSdkCore.getInternalLogger();
                                                                    str192222222222.getClass();
                                                                    internalLogger22222222222.getClass();
                                                                    int[] values2222222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                                    length = values2222222222.length;
                                                                    while (i13 < length) {
                                                                        int i21 = values2222222222[i13];
                                                                        int[] iArr = values2222222222;
                                                                        if (ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$20(i21).equals(str192222222222)) {
                                                                            int i22 = i21;
                                                                            ResourceEvent.Os os = new ResourceEvent.Os(deviceInfo.osName, deviceInfo.osVersion, null, deviceInfo.osMajorVersion);
                                                                            DeviceType deviceType = deviceInfo.deviceType;
                                                                            deviceType.getClass();
                                                                            switch (deviceType.ordinal()) {
                                                                                case 0:
                                                                                    i14 = 1;
                                                                                    break;
                                                                                case 1:
                                                                                    i14 = 3;
                                                                                    break;
                                                                                case 2:
                                                                                    i14 = 4;
                                                                                    break;
                                                                                case 3:
                                                                                    i14 = 2;
                                                                                    break;
                                                                                case 4:
                                                                                    i14 = 5;
                                                                                    break;
                                                                                case 5:
                                                                                    i14 = 6;
                                                                                    break;
                                                                                case 6:
                                                                                    i14 = i172222222222;
                                                                                    break;
                                                                                default:
                                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                    return null;
                                                                            }
                                                                            String str20 = deviceInfo.deviceName;
                                                                            String str21 = deviceInfo.deviceModel;
                                                                            String str22 = deviceInfo.deviceBrand;
                                                                            String str23 = deviceInfo.architecture;
                                                                            LocaleInfo localeInfo = deviceInfo.localeInfo;
                                                                            ResourceEvent.Device device = new ResourceEvent.Device(i14, str20, str21, str22, str23, null, localeInfo.locales, localeInfo.timeZone, null, null, null);
                                                                            ResourceEvent.Context context = new ResourceEvent.Context(new LinkedHashMap(rumResourceScope.getCustomAttributes()));
                                                                            int i23 = rumContext72222222222.sessionStartReason;
                                                                            if (i23 == 0) {
                                                                                throw null;
                                                                            }
                                                                            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(i23)) {
                                                                                case 0:
                                                                                    r5 = 0;
                                                                                    i15 = 1;
                                                                                    break;
                                                                                case 1:
                                                                                    r5 = 0;
                                                                                    i15 = 2;
                                                                                    break;
                                                                                case 2:
                                                                                    r5 = 0;
                                                                                    i15 = 3;
                                                                                    break;
                                                                                case 3:
                                                                                    r5 = 0;
                                                                                    i15 = 4;
                                                                                    break;
                                                                                case 4:
                                                                                    r5 = 0;
                                                                                    i15 = 5;
                                                                                    break;
                                                                                case 5:
                                                                                    r5 = 0;
                                                                                    i15 = 6;
                                                                                    break;
                                                                                case 6:
                                                                                    r5 = 0;
                                                                                    i15 = i172222222222;
                                                                                    break;
                                                                                default:
                                                                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                                                                    return null;
                                                                            }
                                                                            return new ResourceEvent(j12, application2222222222, datadogContext2.service, datadogContext2.version, String.valueOf(datadogContext2.versionCode), datadogContext2.appBuildId, RumTagsUtilsKt.buildDDTagsString(datadogContext2), resourceEventSession2222222222, i22, resourceEventView2222222222, usr, null, connectivity2222222222, null, synthetics, null, os, device, new ResourceEvent.Dd(new ResourceEvent.DdSession(r5, i15), new ResourceEvent.Configuration(Float.valueOf(rumResourceScope.sampleRate), r5, r5), null, null, obj2, null, obj, number, null), context, action, null, resource2222222222);
                                                                        }
                                                                        i13++;
                                                                        values2222222222 = iArr;
                                                                    }
                                                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                                }
                                                            }
                                                            obj13 = obj12;
                                                            i11 = i10;
                                                            obj14 = th;
                                                            if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                            }
                                                            RumContext rumContext722222222222 = rumContext5;
                                                            int i1722222222222 = i12;
                                                            int i1822222222222 = i622;
                                                            int i1922222222222 = i11;
                                                            ResourceEvent.Resource resource22222222222 = new ResourceEvent.Resource(str14, i1822222222222, i1922222222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                            String str1522222222222 = rumContext722222222222.actionId;
                                                            if (str1522222222222 == null) {
                                                            }
                                                            str9 = rumContext722222222222.viewId;
                                                            if (str9 == null) {
                                                            }
                                                            String str1622222222222 = rumContext722222222222.viewName;
                                                            str10 = rumContext722222222222.viewUrl;
                                                            if (str10 == null) {
                                                            }
                                                            ResourceEvent.ResourceEventView resourceEventView22222222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str1622222222222);
                                                            if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                                            }
                                                            networkInfo = rumResourceScope.networkInfo;
                                                            networkInfo.getClass();
                                                            boolean isConnected22222222222 = zzhy.isConnected(networkInfo);
                                                            String str1722222222222 = networkInfo.carrierName;
                                                            if (!isConnected22222222222) {
                                                            }
                                                            switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                            }
                                                            String str1822222222222 = networkInfo.cellularTechnology;
                                                            i13 = 0;
                                                            ResourceEvent.Connectivity connectivity22222222222 = new ResourceEvent.Connectivity(i20, list22, 0, (str1822222222222 == null || str1722222222222 != null) ? new ResourceEvent.Cellular(str1822222222222, str1722222222222) : null);
                                                            ResourceEvent.Application application22222222222 = new ResourceEvent.Application(rumContext722222222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                                            ResourceEvent.ResourceEventSession resourceEventSession22222222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext722222222222.sessionId);
                                                            String str1922222222222 = datadogContext2.source;
                                                            InternalLogger internalLogger222222222222 = internalSdkCore.getInternalLogger();
                                                            str1922222222222.getClass();
                                                            internalLogger222222222222.getClass();
                                                            int[] values22222222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                            length = values22222222222.length;
                                                            while (i13 < length) {
                                                            }
                                                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                                                        }
                                                    }
                                                }
                                                obj11 = obj10;
                                                obj12 = th;
                                                if (resourceTiming3 != null) {
                                                }
                                                obj13 = obj12;
                                                i11 = i10;
                                                obj14 = th;
                                                if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                                }
                                                RumContext rumContext7222222222222 = rumContext5;
                                                int i17222222222222 = i12;
                                                int i18222222222222 = i622;
                                                int i19222222222222 = i11;
                                                ResourceEvent.Resource resource222222222222 = new ResourceEvent.Resource(str14, i18222222222222, i19222222222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                                String str15222222222222 = rumContext7222222222222.actionId;
                                                if (str15222222222222 == null) {
                                                }
                                                str9 = rumContext7222222222222.viewId;
                                                if (str9 == null) {
                                                }
                                                String str16222222222222 = rumContext7222222222222.viewName;
                                                str10 = rumContext7222222222222.viewUrl;
                                                if (str10 == null) {
                                                }
                                                ResourceEvent.ResourceEventView resourceEventView222222222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str16222222222222);
                                                if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                                }
                                                networkInfo = rumResourceScope.networkInfo;
                                                networkInfo.getClass();
                                                boolean isConnected222222222222 = zzhy.isConnected(networkInfo);
                                                String str17222222222222 = networkInfo.carrierName;
                                                if (!isConnected222222222222) {
                                                }
                                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                                }
                                                String str18222222222222 = networkInfo.cellularTechnology;
                                                i13 = 0;
                                                ResourceEvent.Connectivity connectivity222222222222 = new ResourceEvent.Connectivity(i20, list22, 0, (str18222222222222 == null || str17222222222222 != null) ? new ResourceEvent.Cellular(str18222222222222, str17222222222222) : null);
                                                ResourceEvent.Application application222222222222 = new ResourceEvent.Application(rumContext7222222222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                                ResourceEvent.ResourceEventSession resourceEventSession222222222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext7222222222222.sessionId);
                                                String str19222222222222 = datadogContext2.source;
                                                InternalLogger internalLogger2222222222222 = internalSdkCore.getInternalLogger();
                                                str19222222222222.getClass();
                                                internalLogger2222222222222.getClass();
                                                int[] values222222222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                                length = values222222222222.length;
                                                while (i13 < length) {
                                                }
                                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                                            }
                                        }
                                        obj9 = obj8;
                                        i10 = i9;
                                        obj10 = th;
                                        if (resourceTiming3 != null) {
                                        }
                                        obj11 = obj10;
                                        obj12 = th;
                                        if (resourceTiming3 != null) {
                                        }
                                        obj13 = obj12;
                                        i11 = i10;
                                        obj14 = th;
                                        if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                        }
                                        RumContext rumContext72222222222222 = rumContext5;
                                        int i172222222222222 = i12;
                                        int i182222222222222 = i622;
                                        int i192222222222222 = i11;
                                        ResourceEvent.Resource resource2222222222222 = new ResourceEvent.Resource(str14, i182222222222222, i192222222222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                        String str152222222222222 = rumContext72222222222222.actionId;
                                        if (str152222222222222 == null) {
                                        }
                                        str9 = rumContext72222222222222.viewId;
                                        if (str9 == null) {
                                        }
                                        String str162222222222222 = rumContext72222222222222.viewName;
                                        str10 = rumContext72222222222222.viewUrl;
                                        if (str10 == null) {
                                        }
                                        ResourceEvent.ResourceEventView resourceEventView2222222222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str162222222222222);
                                        if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                        }
                                        networkInfo = rumResourceScope.networkInfo;
                                        networkInfo.getClass();
                                        boolean isConnected2222222222222 = zzhy.isConnected(networkInfo);
                                        String str172222222222222 = networkInfo.carrierName;
                                        if (!isConnected2222222222222) {
                                        }
                                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                        }
                                        String str182222222222222 = networkInfo.cellularTechnology;
                                        i13 = 0;
                                        ResourceEvent.Connectivity connectivity2222222222222 = new ResourceEvent.Connectivity(i20, list22, 0, (str182222222222222 == null || str172222222222222 != null) ? new ResourceEvent.Cellular(str182222222222222, str172222222222222) : null);
                                        ResourceEvent.Application application2222222222222 = new ResourceEvent.Application(rumContext72222222222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                        ResourceEvent.ResourceEventSession resourceEventSession2222222222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext72222222222222.sessionId);
                                        String str192222222222222 = datadogContext2.source;
                                        InternalLogger internalLogger22222222222222 = internalSdkCore.getInternalLogger();
                                        str192222222222222.getClass();
                                        internalLogger22222222222222.getClass();
                                        int[] values2222222222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                        length = values2222222222222.length;
                                        while (i13 < length) {
                                        }
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                }
                                obj7 = obj6;
                                i9 = i8;
                                obj8 = th;
                                if (resourceTiming3 != null) {
                                }
                                obj9 = obj8;
                                i10 = i9;
                                obj10 = th;
                                if (resourceTiming3 != null) {
                                }
                                obj11 = obj10;
                                obj12 = th;
                                if (resourceTiming3 != null) {
                                }
                                obj13 = obj12;
                                i11 = i10;
                                obj14 = th;
                                if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                                }
                                RumContext rumContext722222222222222 = rumContext5;
                                int i1722222222222222 = i12;
                                int i1822222222222222 = i622;
                                int i1922222222222222 = i11;
                                ResourceEvent.Resource resource22222222222222 = new ResourceEvent.Resource(str14, i1822222222222222, i1922222222222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                                String str1522222222222222 = rumContext722222222222222.actionId;
                                if (str1522222222222222 == null) {
                                }
                                str9 = rumContext722222222222222.viewId;
                                if (str9 == null) {
                                }
                                String str1622222222222222 = rumContext722222222222222.viewName;
                                str10 = rumContext722222222222222.viewUrl;
                                if (str10 == null) {
                                }
                                ResourceEvent.ResourceEventView resourceEventView22222222222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str1622222222222222);
                                if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                                }
                                networkInfo = rumResourceScope.networkInfo;
                                networkInfo.getClass();
                                boolean isConnected22222222222222 = zzhy.isConnected(networkInfo);
                                String str1722222222222222 = networkInfo.carrierName;
                                if (!isConnected22222222222222) {
                                }
                                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                                }
                                String str1822222222222222 = networkInfo.cellularTechnology;
                                i13 = 0;
                                ResourceEvent.Connectivity connectivity22222222222222 = new ResourceEvent.Connectivity(i20, list22, 0, (str1822222222222222 == null || str1722222222222222 != null) ? new ResourceEvent.Cellular(str1822222222222222, str1722222222222222) : null);
                                ResourceEvent.Application application22222222222222 = new ResourceEvent.Application(rumContext722222222222222.applicationId, deviceInfo.localeInfo.currentLocale);
                                ResourceEvent.ResourceEventSession resourceEventSession22222222222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext722222222222222.sessionId);
                                String str1922222222222222 = datadogContext2.source;
                                InternalLogger internalLogger222222222222222 = internalSdkCore.getInternalLogger();
                                str1922222222222222.getClass();
                                internalLogger222222222222222.getClass();
                                int[] values22222222222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                                length = values22222222222222.length;
                                while (i13 < length) {
                                }
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                        }
                        rumContext5 = rumContext6;
                        j10 = j11;
                        obj6 = th;
                        if (resourceTiming3 != null) {
                        }
                        obj7 = obj6;
                        i9 = i8;
                        obj8 = th;
                        if (resourceTiming3 != null) {
                        }
                        obj9 = obj8;
                        i10 = i9;
                        obj10 = th;
                        if (resourceTiming3 != null) {
                        }
                        obj11 = obj10;
                        obj12 = th;
                        if (resourceTiming3 != null) {
                        }
                        obj13 = obj12;
                        i11 = i10;
                        obj14 = th;
                        if (rumResourceScope.firstPartyHostHeaderTypeResolver.isFirstPartyUrl(str12)) {
                        }
                        RumContext rumContext7222222222222222 = rumContext5;
                        int i17222222222222222 = i12;
                        int i18222222222222222 = i622;
                        int i19222222222222222 = i11;
                        ResourceEvent.Resource resource222222222222222 = new ResourceEvent.Resource(str14, i18222222222222222, i19222222222222222, str12, l, Long.valueOf(j10), l2, null, null, null, 0, null, null, obj7, obj9, obj11, obj13, obj14, null, 0, obj15, graphql);
                        String str15222222222222222 = rumContext7222222222222222.actionId;
                        if (str15222222222222222 == null) {
                        }
                        str9 = rumContext7222222222222222.viewId;
                        if (str9 == null) {
                        }
                        String str16222222222222222 = rumContext7222222222222222.viewName;
                        str10 = rumContext7222222222222222.viewUrl;
                        if (str10 == null) {
                        }
                        ResourceEvent.ResourceEventView resourceEventView222222222222222 = new ResourceEvent.ResourceEventView(str9, null, str10, str16222222222222222);
                        if (!RuntimeUtilsKt.hasUserData(userInfo)) {
                        }
                        networkInfo = rumResourceScope.networkInfo;
                        networkInfo.getClass();
                        boolean isConnected222222222222222 = zzhy.isConnected(networkInfo);
                        String str17222222222222222 = networkInfo.carrierName;
                        if (!isConnected222222222222222) {
                        }
                        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(networkInfo.connectivity)) {
                        }
                        String str18222222222222222 = networkInfo.cellularTechnology;
                        i13 = 0;
                        ResourceEvent.Connectivity connectivity222222222222222 = new ResourceEvent.Connectivity(i20, list22, 0, (str18222222222222222 == null || str17222222222222222 != null) ? new ResourceEvent.Cellular(str18222222222222222, str17222222222222222) : null);
                        ResourceEvent.Application application222222222222222 = new ResourceEvent.Application(rumContext7222222222222222.applicationId, deviceInfo.localeInfo.currentLocale);
                        ResourceEvent.ResourceEventSession resourceEventSession222222222222222 = new ResourceEvent.ResourceEventSession(i4, Boolean.valueOf(resolveViewHasReplay), rumContext7222222222222222.sessionId);
                        String str19222222222222222 = datadogContext2.source;
                        InternalLogger internalLogger2222222222222222 = internalSdkCore.getInternalLogger();
                        str19222222222222222.getClass();
                        internalLogger2222222222222222.getClass();
                        int[] values222222222222222 = CameraSelector$$ExternalSyntheticOutline0.values(8);
                        length = values222222222222222.length;
                        while (i13 < length) {
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    case 1:
                        th = null;
                        i622 = 4;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    case 2:
                        th = null;
                        i622 = 2;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    case 3:
                        th = null;
                        i622 = 1;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    case 4:
                        i622 = 11;
                        th = null;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    case 5:
                    case 11:
                        i622 = 10;
                        th = null;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    case 6:
                        th = null;
                        i622 = 7;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    case 7:
                        th = null;
                        i622 = 6;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    case 8:
                        th = null;
                        i622 = 8;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    case 9:
                        th = null;
                        i622 = 5;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    case 10:
                        th = null;
                        i622 = 9;
                        i7 = rumResourceScope.method;
                        if (i7 == 0) {
                        }
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
            }
        });
        newRumEventWriteOperation22.onError = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj6) {
                int i622 = i52;
                Time time2 = time;
                RumResourceScope rumResourceScope = this;
                RumContext rumContext5 = rumContext422;
                switch (i622) {
                    case 0:
                        AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj6;
                        advancedRumMonitor.getClass();
                        String str9 = rumContext5.viewId;
                        advancedRumMonitor.eventDropped(str9 != null ? str9 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                        break;
                    default:
                        AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj6;
                        advancedRumMonitor2.getClass();
                        String str10 = rumContext5.viewId;
                        advancedRumMonitor2.eventSent(str10 != null ? str10 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i622 = 1;
        newRumEventWriteOperation22.onSuccess = new Function1() { // from class: com.datadog.android.rum.internal.domain.scope.RumResourceScope$sendResource$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj6) {
                int i6222 = i622;
                Time time2 = time;
                RumResourceScope rumResourceScope = this;
                RumContext rumContext5 = rumContext422;
                switch (i6222) {
                    case 0:
                        AdvancedRumMonitor advancedRumMonitor = (AdvancedRumMonitor) obj6;
                        advancedRumMonitor.getClass();
                        String str9 = rumContext5.viewId;
                        advancedRumMonitor.eventDropped(str9 != null ? str9 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                        break;
                    default:
                        AdvancedRumMonitor advancedRumMonitor2 = (AdvancedRumMonitor) obj6;
                        advancedRumMonitor2.getClass();
                        String str10 = rumContext5.viewId;
                        advancedRumMonitor2.eventSent(str10 != null ? str10 : "", new StorageEvent.Resource(rumResourceScope.resourceId, time2.nanoTime));
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        newRumEventWriteOperation22.submit();
        this.sent = true;
    }
}
