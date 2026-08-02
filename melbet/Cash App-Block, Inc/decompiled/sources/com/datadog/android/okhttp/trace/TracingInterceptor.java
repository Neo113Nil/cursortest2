package com.datadog.android.okhttp.trace;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.extractor.text.CueEncoder;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.trifle.KeyHandle$keyPair$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$fetch$2;
import coil3.request.OneShotDisposable;
import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import com.bugsnag.android.TombstoneEventEnhancer$invoke$2;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.sampling.Sampler;
import com.datadog.android.internal.telemetry.TracingHeaderTypesSet;
import com.datadog.android.internal.utils.MapUtilsKt;
import com.datadog.android.okhttp.TraceContext;
import com.datadog.android.okhttp.internal.utils.SpanSamplingIdProvider;
import com.datadog.android.trace.TracingHeaderType;
import com.datadog.android.trace.api.span.DatadogSpan;
import com.datadog.android.trace.api.span.DatadogSpanContext;
import com.datadog.android.trace.api.tracer.DatadogTracer;
import com.datadog.android.trace.internal.DatadogSpanContextAdapter;
import com.datadog.trace.bootstrap.instrumentation.api.AgentTrace;
import com.datadog.trace.core.PendingTrace;
import com.datadog.trace.core.propagation.ExtractedContext;
import com.fillr.n;
import com.google.android.gms.tasks.zzb;
import com.squareup.workflow1.ui.ViewRegistryKt$buildView$1$2$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes4.dex */
public class TracingInterceptor implements Interceptor {
    public final Function0 globalTracerProvider;
    public final OneShotDisposable localFirstPartyHostHeaderTypeResolver;
    public final Function2 localTracerFactory;
    public final AtomicReference localTracerReference;
    public final boolean redacted404ResourceName;
    public final n.b rumContextPropagator;
    public final ArrayList sanitizedHosts;
    public final WorkLauncherImpl sdkCoreReference;
    public final int traceContextInjection;
    public final String traceOrigin;
    public final Sampler traceSampler;
    public final LinkedHashMap tracedHosts;

    public abstract class BaseBuilder {
        public final LinkedHashMap tracedHostsWithHeaderType;
        public final CueEncoder tracedRequestListener = new CueEncoder(26);
        public Sampler traceSampler = new zzb(new NetworkFetcher$fetch$2(1, SpanSamplingIdProvider.INSTANCE, SpanSamplingIdProvider.class, "provideId", "provideId-I7RO_PI(Lcom/datadog/android/trace/api/span/DatadogSpan;)J", 0, 12), new DeterministicTraceSampler$2(0, 0));
        public final TracingInterceptor$extractParentContext$headerContext$1 localTracerFactory = TracingInterceptor$extractParentContext$headerContext$1.INSTANCE$1;
        public final DeterministicTraceSampler$2 globalTracerProvider = DeterministicTraceSampler$2.INSTANCE;
        public final int traceContextInjection = 2;
        public final boolean redacted404ResourceName = true;

        public BaseBuilder(LinkedHashMap linkedHashMap) {
            this.tracedHostsWithHeaderType = linkedHashMap;
        }

        public abstract BaseBuilder getThis$dd_sdk_android_okhttp_release();

        public final BaseBuilder setTraceSampler(AndroidSvg androidSvg) {
            this.traceSampler = androidSvg;
            return getThis$dd_sdk_android_okhttp_release();
        }
    }

    public final class Builder extends BaseBuilder {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Builder(List list) {
            super(r0);
            List list2 = list;
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity < 16 ? 16 : mapCapacity);
            for (Object obj : list2) {
                linkedHashMap.put(obj, ArraysKt___ArraysKt.toSet(new TracingHeaderType[]{TracingHeaderType.DATADOG, TracingHeaderType.TRACECONTEXT}));
            }
        }

        public final TracingInterceptor build() {
            return new TracingInterceptor(this.tracedHostsWithHeaderType, this.tracedRequestListener, null, this.traceSampler, this.traceContextInjection, this.redacted404ResourceName, this.localTracerFactory, this.globalTracerProvider);
        }

        @Override // com.datadog.android.okhttp.trace.TracingInterceptor.BaseBuilder
        public final BaseBuilder getThis$dd_sdk_android_okhttp_release() {
            return this;
        }
    }

    public TracingInterceptor(LinkedHashMap linkedHashMap, CueEncoder cueEncoder, String str, Sampler sampler, int i, boolean z, Function2 function2, Function0 function0) {
        sampler.getClass();
        if (i == 0) {
            throw null;
        }
        function2.getClass();
        function0.getClass();
        this.tracedHosts = linkedHashMap;
        this.traceOrigin = str;
        this.traceSampler = sampler;
        this.traceContextInjection = i;
        this.redacted404ResourceName = z;
        this.localTracerFactory = function2;
        this.globalTracerProvider = function0;
        this.localTracerReference = new AtomicReference();
        this.sanitizedHosts = HurlStack.sanitizeHosts("Network Requests", CollectionsKt.toList(linkedHashMap.keySet()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (this.sanitizedHosts.contains((String) entry.getKey())) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        this.localFirstPartyHostHeaderTypeResolver = new OneShotDisposable(linkedHashMap2);
        final int i2 = 1;
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(new Function1(this) { // from class: com.datadog.android.okhttp.trace.TracingInterceptor.1
            public final /* synthetic */ TracingInterceptor this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                com.datadog.android.internal.telemetry.TracingHeaderType tracingHeaderType;
                int i3 = i2;
                TracingInterceptor tracingInterceptor = this.this$0;
                switch (i3) {
                    case 0:
                        Map map = (Map) obj;
                        map.getClass();
                        map.put("okhttp_interceptor_sample_rate", tracingInterceptor.traceSampler.getSampleRate());
                        ArrayList flatten = CollectionsKt__IterablesKt.flatten(tracingInterceptor.tracedHosts.values());
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flatten, 10));
                        Iterator it = flatten.iterator();
                        while (it.hasNext()) {
                            TracingHeaderType tracingHeaderType2 = (TracingHeaderType) it.next();
                            tracingHeaderType2.getClass();
                            int ordinal = tracingHeaderType2.ordinal();
                            if (ordinal == 0) {
                                tracingHeaderType = com.datadog.android.internal.telemetry.TracingHeaderType.DATADOG;
                            } else if (ordinal == 1) {
                                tracingHeaderType = com.datadog.android.internal.telemetry.TracingHeaderType.B3;
                            } else if (ordinal == 2) {
                                tracingHeaderType = com.datadog.android.internal.telemetry.TracingHeaderType.B3MULTI;
                            } else if (ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                tracingHeaderType = com.datadog.android.internal.telemetry.TracingHeaderType.TRACECONTEXT;
                            }
                            arrayList.add(tracingHeaderType);
                        }
                        map.put("okhttp_interceptor_header_types", new TracingHeaderTypesSet(CollectionsKt.toSet(arrayList)));
                        break;
                    default:
                        InternalSdkCore internalSdkCore = (InternalSdkCore) obj;
                        internalSdkCore.getClass();
                        tracingInterceptor.onSdkInstanceReady$dd_sdk_android_okhttp_release(internalSdkCore);
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        this.sdkCoreReference = workLauncherImpl;
        this.rumContextPropagator = new n.b(new KeyHandle$keyPair$2(this, 22), 12);
        InternalSdkCore internalSdkCore = workLauncherImpl.get();
        InternalSdkCore internalSdkCore2 = internalSdkCore instanceof InternalSdkCore ? internalSdkCore : null;
        if (internalSdkCore2 != null) {
            final int i3 = 0;
            internalSdkCore2.updateFeatureContext("tracing", new Function1(this) { // from class: com.datadog.android.okhttp.trace.TracingInterceptor.1
                public final /* synthetic */ TracingInterceptor this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    com.datadog.android.internal.telemetry.TracingHeaderType tracingHeaderType;
                    int i32 = i3;
                    TracingInterceptor tracingInterceptor = this.this$0;
                    switch (i32) {
                        case 0:
                            Map map = (Map) obj;
                            map.getClass();
                            map.put("okhttp_interceptor_sample_rate", tracingInterceptor.traceSampler.getSampleRate());
                            ArrayList flatten = CollectionsKt__IterablesKt.flatten(tracingInterceptor.tracedHosts.values());
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flatten, 10));
                            Iterator it = flatten.iterator();
                            while (it.hasNext()) {
                                TracingHeaderType tracingHeaderType2 = (TracingHeaderType) it.next();
                                tracingHeaderType2.getClass();
                                int ordinal = tracingHeaderType2.ordinal();
                                if (ordinal == 0) {
                                    tracingHeaderType = com.datadog.android.internal.telemetry.TracingHeaderType.DATADOG;
                                } else if (ordinal == 1) {
                                    tracingHeaderType = com.datadog.android.internal.telemetry.TracingHeaderType.B3;
                                } else if (ordinal == 2) {
                                    tracingHeaderType = com.datadog.android.internal.telemetry.TracingHeaderType.B3MULTI;
                                } else if (ordinal != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    tracingHeaderType = com.datadog.android.internal.telemetry.TracingHeaderType.TRACECONTEXT;
                                }
                                arrayList.add(tracingHeaderType);
                            }
                            map.put("okhttp_interceptor_header_types", new TracingHeaderTypesSet(CollectionsKt.toSet(arrayList)));
                            break;
                        default:
                            InternalSdkCore internalSdkCore3 = (InternalSdkCore) obj;
                            internalSdkCore3.getClass();
                            tracingInterceptor.onSdkInstanceReady$dd_sdk_android_okhttp_release(internalSdkCore3);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, false);
        }
    }

    public boolean canSendSpan$dd_sdk_android_okhttp_release() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:18|(1:20)(2:185|(1:187)(2:188|189))|21|(1:25)|26|(2:28|(1:30)(16:92|32|(2:34|(1:36))|37|38|39|40|41|42|43|44|45|(1:47)(7:55|(1:59)|60|(1:64)|65|66|67)|48|(1:(1:51)(1:53))(1:54)|52))(7:93|(1:95)(1:184)|96|(3:98|(4:127|(1:134)(1:131)|132|133)|100)(2:135|(3:137|(1:139)(3:140|(1:142)|100)|133)(8:143|(5:145|(1:147)(2:149|(2:151|(2:153|(3:155|157|159)(2:161|159))(3:163|(1:165)|160)))|148|102|(2:(1:(6:106|(1:108)(1:120)|(3:110|(1:112)(1:115)|(1:114))|116|(1:118)|119)(1:121))|(1:123)(1:124))(2:125|126))(1:183)|166|(2:168|(6:170|(1:172)(2:178|(3:180|102|(0)(0)))|(3:176|102|(0)(0))|177|102|(0)(0)))(1:182)|181|177|102|(0)(0)))|101|102|(0)(0))|31|32|(0)|37|38|39|40|41|42|43|44|45|(0)(0)|48|(0)(0)|52) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x029b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a3, code lost:
    
        androidx.room.util.DBUtil.log$default(r2.getInternalLogger(), 4, kotlin.collections.CollectionsKt__CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), com.datadog.android.okhttp.trace.DeterministicTraceSampler$2.INSTANCE$1, r0, 48);
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x029f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02a0, code lost:
    
        r7 = r9;
        r11 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02c4 A[Catch: all -> 0x0310, TryCatch #0 {all -> 0x0310, blocks: (B:45:0x02be, B:47:0x02c4, B:48:0x02f8, B:51:0x0300, B:53:0x0304, B:54:0x0308, B:55:0x02ce, B:59:0x02e1, B:62:0x02e8, B:64:0x02ec), top: B:44:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0308 A[Catch: all -> 0x0310, TRY_LEAVE, TryCatch #0 {all -> 0x0310, blocks: (B:45:0x02be, B:47:0x02c4, B:48:0x02f8, B:51:0x0300, B:53:0x0304, B:54:0x0308, B:55:0x02ce, B:59:0x02e1, B:62:0x02e8, B:64:0x02ec), top: B:44:0x02be }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ce A[Catch: all -> 0x0310, TryCatch #0 {all -> 0x0310, blocks: (B:45:0x02be, B:47:0x02c4, B:48:0x02f8, B:51:0x0300, B:53:0x0304, B:54:0x0308, B:55:0x02ce, B:59:0x02e1, B:62:0x02e8, B:64:0x02ec), top: B:44:0x02be }] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response doIntercept(Interceptor.Chain chain, Request request) {
        DatadogTracer datadogTracer;
        DatadogSpanContext datadogSpanContext;
        InternalSdkCore internalSdkCore;
        boolean z;
        Boolean bool;
        List split$default;
        List split$default2;
        ?? r6;
        boolean z2;
        DatadogSpan datadogSpan;
        request.getClass();
        InternalSdkCore internalSdkCore2 = this.sdkCoreReference.get();
        if (internalSdkCore2 == null) {
            InternalLogger.Companion.getClass();
            DBUtil.log$default(InternalLogger.Companion.UNBOUND, 3, InternalLogger.Target.USER, new ViewRegistryKt$buildView$1$2$1$1(11, "Default SDK instance", request), null, false, 56);
            return chain.proceed(request);
        }
        InternalSdkCore internalSdkCore3 = internalSdkCore2;
        synchronized (this) {
            try {
                SdkFeature feature = internalSdkCore3.getFeature("tracing");
                datadogTracer = (DatadogTracer) this.globalTracerProvider.invoke();
                if (feature == null) {
                    DBUtil.log$default(internalSdkCore3.getInternalLogger(), 4, InternalLogger.Target.USER, DeterministicTraceSampler$2.INSTANCE$4, null, true, 40);
                    datadogTracer = null;
                } else if (datadogTracer != null) {
                    this.localTracerReference.set(null);
                } else {
                    datadogTracer = resolveLocalTracer(internalSdkCore3);
                }
            } finally {
            }
        }
        if (datadogTracer != null) {
            HttpUrl httpUrl = request.url;
            if (internalSdkCore3.getFirstPartyHostResolver().isFirstPartyUrl(httpUrl) || this.localFirstPartyHostHeaderTypeResolver.isFirstPartyUrl(httpUrl)) {
                Sampler sampler = this.traceSampler;
                ReflectionFactory reflectionFactory = Reflection.factory;
                DatadogSpan datadogSpan2 = (DatadogSpan) request.tag(reflectionFactory.getOrCreateKotlinClass(DatadogSpan.class));
                if (datadogSpan2 != null) {
                    datadogSpanContext = datadogSpan2.context();
                } else {
                    if (request.tag(reflectionFactory.getOrCreateKotlinClass(TraceContext.class)) != null) {
                        a$$ExternalSyntheticBUOutline0.m$1();
                        return null;
                    }
                    datadogSpanContext = null;
                }
                DatadogSpanContext extract = datadogTracer.propagate().extract(request);
                if (extract != null && (((DatadogSpanContextAdapter) extract).delegate instanceof ExtractedContext)) {
                    datadogSpanContext = extract;
                }
                String str = request.url.url;
                DatadogSpan start = datadogTracer.buildSpan().withOrigin(this.traceOrigin).withParentContext(datadogSpanContext).start();
                start.setResourceName(StringsKt.substringBefore$default(str, '?'));
                start.setTag("http.url", str);
                start.setTag("http.method", request.method);
                start.setTag("span.kind", "client");
                n.b bVar = this.rumContextPropagator;
                bVar.getClass();
                boolean z3 = true;
                n.b.access$extractRumContextInternal(bVar, start, true);
                Integer samplingPriority = start.getSamplingPriority();
                try {
                    if (samplingPriority == null) {
                        Headers headers = request.headers;
                        String str2 = headers.get("x-datadog-sampling-priority");
                        Integer intOrNull = str2 != null ? StringsKt.toIntOrNull(str2) : null;
                        if (intOrNull != null) {
                            if (intOrNull.intValue() != Integer.MIN_VALUE) {
                                bool = Boolean.valueOf(intOrNull.intValue() == 2 || intOrNull.intValue() == 1);
                                internalSdkCore = internalSdkCore3;
                            }
                            internalSdkCore = internalSdkCore3;
                            bool = null;
                        } else {
                            String str3 = headers.get("X-B3-Sampled");
                            if (str3 != null) {
                                if (str3.equals("1")) {
                                    bool = Boolean.TRUE;
                                } else {
                                    if (str3.equals("0")) {
                                        bool = Boolean.FALSE;
                                    }
                                    internalSdkCore = internalSdkCore3;
                                    bool = null;
                                }
                                internalSdkCore = internalSdkCore3;
                            } else {
                                String str4 = headers.get("b3");
                                if (str4 != null) {
                                    if (str4.equals("0")) {
                                        bool = Boolean.FALSE;
                                        internalSdkCore = internalSdkCore3;
                                    } else {
                                        internalSdkCore = internalSdkCore3;
                                        split$default2 = StringsKt__StringsKt.split$default(str4, new String[]{"-"}, false, 0, 6, null);
                                        if (split$default2.size() >= 3) {
                                            String str5 = (String) split$default2.get(2);
                                            int hashCode = str5.hashCode();
                                            if (hashCode != 48) {
                                                bool = hashCode != 49 ? Boolean.TRUE : Boolean.TRUE;
                                            } else {
                                                if (str5.equals("0")) {
                                                    bool = Boolean.FALSE;
                                                }
                                                bool = null;
                                            }
                                        }
                                    }
                                    z = false;
                                    z3 = true;
                                    DatadogSpan datadogSpan3 = (DatadogSpan) request.tag(reflectionFactory.getOrCreateKotlinClass(DatadogSpan.class));
                                    if (request.tag(reflectionFactory.getOrCreateKotlinClass(TraceContext.class)) == null) {
                                        a$$ExternalSyntheticBUOutline0.m$1();
                                        return null;
                                    }
                                    if (bool == null) {
                                        if (datadogSpan3 != null) {
                                            DatadogSpanContext context = datadogSpan3.context();
                                            DatadogSpanContextAdapter datadogSpanContextAdapter = context instanceof DatadogSpanContextAdapter ? (DatadogSpanContextAdapter) context : null;
                                            if (datadogSpanContextAdapter != null) {
                                                AgentTrace trace = datadogSpanContextAdapter.delegate.getTrace();
                                                PendingTrace pendingTrace = trace instanceof PendingTrace ? (PendingTrace) trace : null;
                                                if (pendingTrace != null) {
                                                    pendingTrace.setSamplingPriorityIfNecessary();
                                                }
                                            }
                                            if (datadogSpan3.context().getSamplingPriority() <= 0) {
                                                z3 = z;
                                            }
                                            bool = Boolean.valueOf(z3);
                                        } else {
                                            bool = null;
                                        }
                                    }
                                    z3 = bool != null ? bool.booleanValue() : sampler.sample(start);
                                } else {
                                    internalSdkCore = internalSdkCore3;
                                }
                                String str6 = headers.get("traceparent");
                                if (str6 != null) {
                                    z = false;
                                    split$default = StringsKt__StringsKt.split$default(str6, new String[]{"-"}, false, 0, 6, null);
                                    if (split$default.size() >= 4) {
                                        Integer intOrNull2 = StringsKt.toIntOrNull((String) split$default.get(3));
                                        if (intOrNull2 == null) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                            if (intOrNull2.intValue() == 1) {
                                                bool = Boolean.TRUE;
                                                DatadogSpan datadogSpan32 = (DatadogSpan) request.tag(reflectionFactory.getOrCreateKotlinClass(DatadogSpan.class));
                                                if (request.tag(reflectionFactory.getOrCreateKotlinClass(TraceContext.class)) == null) {
                                                }
                                            }
                                        }
                                        if (intOrNull2 != null && intOrNull2.intValue() == 0) {
                                            bool = Boolean.FALSE;
                                            DatadogSpan datadogSpan322 = (DatadogSpan) request.tag(reflectionFactory.getOrCreateKotlinClass(DatadogSpan.class));
                                            if (request.tag(reflectionFactory.getOrCreateKotlinClass(TraceContext.class)) == null) {
                                            }
                                        }
                                        bool = null;
                                        DatadogSpan datadogSpan3222 = (DatadogSpan) request.tag(reflectionFactory.getOrCreateKotlinClass(DatadogSpan.class));
                                        if (request.tag(reflectionFactory.getOrCreateKotlinClass(TraceContext.class)) == null) {
                                        }
                                    }
                                } else {
                                    z = false;
                                }
                                z3 = true;
                                bool = null;
                                DatadogSpan datadogSpan32222 = (DatadogSpan) request.tag(reflectionFactory.getOrCreateKotlinClass(DatadogSpan.class));
                                if (request.tag(reflectionFactory.getOrCreateKotlinClass(TraceContext.class)) == null) {
                                }
                            }
                        }
                        z = false;
                        DatadogSpan datadogSpan322222 = (DatadogSpan) request.tag(reflectionFactory.getOrCreateKotlinClass(DatadogSpan.class));
                        if (request.tag(reflectionFactory.getOrCreateKotlinClass(TraceContext.class)) == null) {
                        }
                    } else {
                        if (samplingPriority.intValue() <= 0) {
                            internalSdkCore = internalSdkCore3;
                            r6 = 0;
                            if (start.isRootSpan()) {
                                DatadogSpanContext context2 = start.context();
                                if (context2.setSamplingPriority(r6)) {
                                    context2.setMetric(sampler.getSampleRate().floatValue() / 100.0d);
                                }
                            }
                            InternalSdkCore internalSdkCore4 = internalSdkCore;
                            DatadogSpan datadogSpan4 = start;
                            z2 = r6;
                            Request request2 = new Request(updateRequest(internalSdkCore4, request, datadogTracer, start, r6));
                            Response proceed = chain.proceed(request2);
                            if (z2) {
                                int i = proceed.code;
                                datadogSpan4.setTag(Integer.valueOf(i));
                                if (400 <= i && i < 500) {
                                    datadogSpan4.setError();
                                }
                                if (i == 404 && this.redacted404ResourceName) {
                                    datadogSpan4.setResourceName("404");
                                }
                                DatadogSpan datadogSpan5 = datadogSpan4;
                                try {
                                    onRequestIntercepted(internalSdkCore4, request, datadogSpan5, proceed, null);
                                } catch (Throwable th) {
                                    th = th;
                                    datadogSpan4 = datadogSpan5;
                                    Throwable th2 = th;
                                    if (z2) {
                                        datadogSpan4.setError();
                                        datadogSpan4.setTag("error.msg", th2.getMessage());
                                        datadogSpan4.setTag("error.type", th2.getClass().getName());
                                        datadogSpan4.setTag("error.stack", MapUtilsKt.loggableStackTrace(th2));
                                        datadogSpan = datadogSpan4;
                                        onRequestIntercepted(internalSdkCore4, request, datadogSpan, null, th2);
                                    } else {
                                        onRequestIntercepted(internalSdkCore4, request, null, null, th2);
                                        datadogSpan = datadogSpan4;
                                    }
                                    if (!canSendSpan$dd_sdk_android_okhttp_release()) {
                                        datadogSpan.drop();
                                        throw th2;
                                    }
                                    if (z2) {
                                        datadogSpan.finish();
                                        throw th2;
                                    }
                                    datadogSpan.drop();
                                    throw th2;
                                }
                            } else {
                                onRequestIntercepted(internalSdkCore4, request, null, proceed, null);
                            }
                            if (!canSendSpan$dd_sdk_android_okhttp_release()) {
                                datadogSpan4.drop();
                            } else if (z2) {
                                datadogSpan4.finish();
                            } else {
                                datadogSpan4.drop();
                            }
                            return proceed;
                        }
                        internalSdkCore = internalSdkCore3;
                    }
                    Response proceed2 = chain.proceed(request2);
                    if (z2) {
                    }
                    if (!canSendSpan$dd_sdk_android_okhttp_release()) {
                    }
                    return proceed2;
                } catch (Throwable th3) {
                    th = th3;
                }
                r6 = z3;
                if (start.isRootSpan()) {
                }
                InternalSdkCore internalSdkCore42 = internalSdkCore;
                DatadogSpan datadogSpan42 = start;
                z2 = r6;
                Request request22 = new Request(updateRequest(internalSdkCore42, request, datadogTracer, start, r6));
            }
        }
        try {
            Response proceed3 = chain.proceed(request);
            onRequestIntercepted(internalSdkCore3, request, null, proceed3, null);
            return proceed3;
        } catch (Throwable th4) {
            onRequestIntercepted(internalSdkCore3, request, null, null, th4);
            throw th4;
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        return doIntercept(chain, ((RealInterceptorChain) chain).request);
    }

    public void onRequestIntercepted(InternalSdkCore internalSdkCore, Request request, DatadogSpan datadogSpan, Response response, Throwable th) {
        request.getClass();
    }

    public void onSdkInstanceReady$dd_sdk_android_okhttp_release(InternalSdkCore internalSdkCore) {
        internalSdkCore.getClass();
        if (((LinkedHashMap) this.localFirstPartyHostHeaderTypeResolver.job).isEmpty() && ((LinkedHashMap) internalSdkCore.getFirstPartyHostResolver().job).isEmpty()) {
            DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, InternalLogger.Target.USER, DeterministicTraceSampler$2.INSTANCE$2, null, true, 40);
        }
    }

    public final DatadogTracer resolveLocalTracer(InternalSdkCore internalSdkCore) {
        AtomicReference atomicReference = this.localTracerReference;
        if (atomicReference.get() == null) {
            Object invoke = this.localTracerFactory.invoke(internalSdkCore, SetsKt___SetsKt.plus(CollectionsKt.toSet(CollectionsKt__IterablesKt.flatten(((LinkedHashMap) this.localFirstPartyHostHeaderTypeResolver.job).values())), (Iterable) CollectionsKt.toSet(CollectionsKt__IterablesKt.flatten(((LinkedHashMap) internalSdkCore.getFirstPartyHostResolver().job).values()))));
            while (!atomicReference.compareAndSet(null, invoke) && atomicReference.get() == null) {
            }
            DBUtil.log$default(internalSdkCore.getInternalLogger(), 4, InternalLogger.Target.USER, DeterministicTraceSampler$2.INSTANCE$3, null, false, 56);
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (DatadogTracer) obj;
    }

    public final Request.Builder updateRequest(InternalSdkCore internalSdkCore, Request request, DatadogTracer datadogTracer, DatadogSpan datadogSpan, boolean z) {
        Request.Builder newBuilder = request.newBuilder();
        HttpUrl httpUrl = request.url;
        Set headerTypesForUrl = this.localFirstPartyHostHeaderTypeResolver.headerTypesForUrl(httpUrl);
        if (headerTypesForUrl.isEmpty()) {
            headerTypesForUrl = internalSdkCore.getFirstPartyHostResolver().headerTypesForUrl(httpUrl);
        }
        Set set = headerTypesForUrl;
        if (z) {
            datadogTracer.propagate().inject(datadogSpan.context(), newBuilder, new TombstoneEventEnhancer$invoke$2(set, this));
            return newBuilder;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int ordinal = ((TracingHeaderType) it.next()).ordinal();
            int i = this.traceContextInjection;
            if (ordinal == 0) {
                for (String str : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"x-datadog-sampling-priority", "x-datadog-trace-id", "x-datadog-tags", "x-datadog-parent-id", "x-datadog-origin"})) {
                    str.getClass();
                    newBuilder.headers.removeAll(str);
                }
                if (i == 1) {
                    datadogTracer.propagate().inject(datadogSpan.context(), newBuilder, TracingInterceptor$handleDatadogSampledOutHeaders$1.INSTANCE);
                    newBuilder.addHeader("x-datadog-sampling-priority", "0");
                }
            } else if (ordinal == 1) {
                newBuilder.headers.removeAll("b3");
                if (i == 1) {
                    newBuilder.addHeader("b3", "0");
                }
            } else if (ordinal == 2) {
                for (String str2 : CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"X-B3-TraceId", "X-B3-SpanId", "X-B3-Sampled"})) {
                    str2.getClass();
                    newBuilder.headers.removeAll(str2);
                }
                if (i == 1) {
                    newBuilder.addHeader("X-B3-Sampled", "0");
                }
            } else if (ordinal == 3) {
                newBuilder.headers.removeAll("traceparent");
                newBuilder.headers.removeAll("tracestate");
                if (i == 1) {
                    String hexString = datadogSpan.context().getTraceId().toHexString();
                    String valueOf = String.valueOf(datadogSpan.context().getSpanId());
                    newBuilder.addHeader("traceparent", String.format("00-%s-%s-00", Arrays.copyOf(new Object[]{StringsKt.padStart(32, hexString), StringsKt.padStart(16, valueOf)}, 2)));
                    String format2 = String.format("dd=p:%s;s:0", Arrays.copyOf(new Object[]{StringsKt.padStart(16, valueOf)}, 1));
                    String str3 = this.traceOrigin;
                    if (str3 != null) {
                        format2 = Recorder$$ExternalSyntheticOutline2.m(format2, ";o:", str3);
                    }
                    newBuilder.addHeader("tracestate", format2);
                }
            }
        }
        return newBuilder;
    }
}
