package com.datadog.android.okhttp;

import android.util.Base64;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.media3.extractor.text.CueEncoder;
import androidx.room.util.DBUtil;
import com.android.volley.toolbox.HurlStack;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.sampling.Sampler;
import com.datadog.android.okhttp.trace.DeterministicTraceSampler$2;
import com.datadog.android.okhttp.trace.TracingInterceptor;
import com.datadog.android.okhttp.trace.TracingInterceptor$extractParentContext$headerContext$1;
import com.datadog.android.rum.GlobalRumMonitor;
import com.datadog.android.rum.RumErrorSource$EnumUnboxingLocalUtility;
import com.datadog.android.rum.RumMonitor;
import com.datadog.android.rum.internal.monitor.AdvancedRumMonitor;
import com.datadog.android.rum.resource.ResourceId;
import com.datadog.android.trace.TracingHeaderType;
import com.datadog.android.trace.api.span.DatadogSpan;
import com.google.android.gms.internal.mlkit_vision_common.zzhu;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: classes4.dex */
public final class DatadogInterceptor extends TracingInterceptor {
    public static final Set STREAM_CONTENT_TYPES = ArraysKt___ArraysKt.toSet(new String[]{"text/event-stream", "application/grpc", "application/grpc+proto", "application/grpc+json"});
    public final HurlStack rumResourceAttributesProvider;

    public final class Builder extends TracingInterceptor.BaseBuilder {
        public final HurlStack rumResourceAttributesProvider;

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
            this.rumResourceAttributesProvider = new HurlStack(27);
        }

        public final DatadogInterceptor build() {
            return new DatadogInterceptor(this.tracedHostsWithHeaderType, this.tracedRequestListener, this.rumResourceAttributesProvider, this.traceSampler, this.traceContextInjection, this.redacted404ResourceName, this.localTracerFactory, this.globalTracerProvider);
        }

        @Override // com.datadog.android.okhttp.trace.TracingInterceptor.BaseBuilder
        public final TracingInterceptor.BaseBuilder getThis$dd_sdk_android_okhttp_release() {
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatadogInterceptor(LinkedHashMap linkedHashMap, CueEncoder cueEncoder, HurlStack hurlStack, Sampler sampler, int i, boolean z, TracingInterceptor$extractParentContext$headerContext$1 tracingInterceptor$extractParentContext$headerContext$1, DeterministicTraceSampler$2 deterministicTraceSampler$2) {
        super(linkedHashMap, cueEncoder, "rum", sampler, i, z, tracingInterceptor$extractParentContext$headerContext$1, deterministicTraceSampler$2);
        hurlStack.getClass();
        sampler.getClass();
        if (i == 0) {
            throw null;
        }
        tracingInterceptor$extractParentContext$headerContext$1.getClass();
        deterministicTraceSampler$2.getClass();
        this.rumResourceAttributesProvider = hurlStack;
    }

    public static String fromBase64(String str) {
        try {
            byte[] decode = Base64.decode(str, 2);
            if (decode != null) {
                return new String(decode, Charsets.UTF_8);
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // com.datadog.android.okhttp.trace.TracingInterceptor
    public final boolean canSendSpan$dd_sdk_android_okhttp_release() {
        InternalSdkCore internalSdkCore = this.sdkCoreReference.get();
        InternalSdkCore internalSdkCore2 = internalSdkCore instanceof InternalSdkCore ? internalSdkCore : null;
        return (internalSdkCore2 != null ? internalSdkCore2.getFeature("rum") : null) == null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (r10.equals("GET") == false) goto L54;
     */
    @Override // com.datadog.android.okhttp.trace.TracingInterceptor, okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Response intercept(Interceptor.Chain chain) {
        Request request;
        InternalLogger internalLogger;
        InternalLogger internalLogger2;
        Interceptor.Chain chain2;
        int i;
        InternalSdkCore internalSdkCore = this.sdkCoreReference.get();
        InternalSdkCore internalSdkCore2 = internalSdkCore instanceof InternalSdkCore ? internalSdkCore : null;
        SdkFeature feature = internalSdkCore2 != null ? internalSdkCore2.getFeature("rum") : null;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Request request2 = realInterceptorChain.request;
        Request.Builder newBuilder = request2.newBuilder();
        newBuilder.tag(UUID.class, UUID.randomUUID());
        try {
            request = new Request(newBuilder);
        } catch (IllegalStateException unused) {
            request = null;
        }
        if (request == null) {
            request = request2;
        }
        int i2 = 0;
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (feature != null) {
            String str = request.url.url;
            String str2 = request.method;
            InternalLogger internalLogger3 = internalSdkCore2.getInternalLogger();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = str2.toUpperCase(locale);
            upperCase.getClass();
            int i3 = 2;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        i3 = 8;
                        i = i3;
                        break;
                    }
                    DBUtil.log$default(internalLogger3, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str2, 20), null, 56);
                    i = i3;
                case 70454:
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        i = 4;
                        break;
                    }
                    DBUtil.log$default(internalLogger3, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str2, 20), null, 56);
                    i = i3;
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        i3 = 3;
                        i = i3;
                        break;
                    }
                    DBUtil.log$default(internalLogger3, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str2, 20), null, 56);
                    i = i3;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        i3 = 1;
                        i = i3;
                        break;
                    }
                    DBUtil.log$default(internalLogger3, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str2, 20), null, 56);
                    i = i3;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        i3 = 6;
                        i = i3;
                        break;
                    }
                    DBUtil.log$default(internalLogger3, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str2, 20), null, 56);
                    i = i3;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        i3 = 7;
                        i = i3;
                        break;
                    }
                    DBUtil.log$default(internalLogger3, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str2, 20), null, 56);
                    i = i3;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        i3 = 9;
                        i = i3;
                        break;
                    }
                    DBUtil.log$default(internalLogger3, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str2, 20), null, 56);
                    i = i3;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        i3 = 5;
                        i = i3;
                        break;
                    }
                    DBUtil.log$default(internalLogger3, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str2, 20), null, 56);
                    i = i3;
                default:
                    DBUtil.log$default(internalLogger3, 4, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target, InternalLogger.Target.TELEMETRY}), new DatadogInterceptor$intercept$1(str2, 20), null, 56);
                    i = i3;
                    break;
            }
            ResourceId buildResourceId = zzhu.buildResourceId(request);
            RumMonitor rumMonitor = GlobalRumMonitor.get(internalSdkCore2);
            AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
            if (advancedRumMonitor != null) {
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                advancedRumMonitor.startResource(buildResourceId, i, str, emptyMap);
            }
        } else {
            if (internalSdkCore2 == null || (internalLogger = internalSdkCore2.getInternalLogger()) == null) {
                InternalLogger.Companion.getClass();
                internalLogger = InternalLogger.Companion.UNBOUND;
            }
            DBUtil.log$default(internalLogger, 3, target, new DatadogInterceptor$intercept$1("Default SDK instance", 0), null, false, 56);
        }
        if (internalSdkCore2 == null || (internalLogger2 = internalSdkCore2.getInternalLogger()) == null) {
            InternalLogger.Companion.getClass();
            internalLogger2 = InternalLogger.Companion.UNBOUND;
        }
        Headers headers = request2.headers;
        int[] values = CameraSelector$$ExternalSyntheticOutline0.values(4);
        int length = values.length;
        while (true) {
            if (i2 >= length) {
                chain2 = chain;
            } else if (headers.get(RumErrorSource$EnumUnboxingLocalUtility.getHeaderValue(values[i2])) != null) {
                chain2 = new SVG(realInterceptorChain, internalLogger2, this);
            } else {
                i2++;
            }
        }
        return doIntercept(chain2, request);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba A[Catch: IllegalArgumentException -> 0x0170, IllegalStateException -> 0x0175, IOException -> 0x017a, TryCatch #0 {IOException -> 0x017a, blocks: (B:90:0x0151, B:92:0x0157, B:59:0x0182, B:63:0x0195, B:71:0x01a8, B:75:0x01ba, B:78:0x01ca, B:86:0x01b4), top: B:89:0x0151 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b4 A[Catch: IllegalArgumentException -> 0x0170, IllegalStateException -> 0x0175, IOException -> 0x017a, TryCatch #0 {IOException -> 0x017a, blocks: (B:90:0x0151, B:92:0x0157, B:59:0x0182, B:63:0x0195, B:71:0x01a8, B:75:0x01ba, B:78:0x01ca, B:86:0x01b4), top: B:89:0x0151 }] */
    @Override // com.datadog.android.okhttp.trace.TracingInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onRequestIntercepted(InternalSdkCore internalSdkCore, Request request, DatadogSpan datadogSpan, Response response, Throwable th) {
        Map map;
        InternalLogger.Target target;
        IOException iOException;
        Long l;
        ResponseBody responseBody;
        MediaType contentType;
        String str;
        String str2;
        boolean z;
        request.getClass();
        if (internalSdkCore.getFeature("rum") != null) {
            HurlStack hurlStack = this.rumResourceAttributesProvider;
            if (response == null) {
                Throwable illegalStateException = th == null ? new IllegalStateException("The request ended with no response nor any exception.") : th;
                ResourceId buildResourceId = zzhu.buildResourceId(request);
                String str3 = request.method;
                String str4 = request.url.url;
                RumMonitor rumMonitor = GlobalRumMonitor.get(internalSdkCore);
                AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
                if (advancedRumMonitor != null) {
                    advancedRumMonitor.stopResourceWithError(buildResourceId, String.format(Locale.US, "OkHttp request error %s %s", Arrays.copyOf(new Object[]{str3, str4}, 2)), illegalStateException, hurlStack.onProvideAttributes(request, null, illegalStateException));
                    return;
                }
                return;
            }
            Headers headers = response.headers;
            boolean z2 = datadogSpan != null;
            ResourceId buildResourceId2 = zzhu.buildResourceId(request);
            Headers headers2 = request.headers;
            int i = response.code;
            String str5 = headers.get("Content-Type");
            if (str5 == null) {
                str5 = null;
            }
            int i2 = 5;
            if (str5 != null) {
                String substringBefore$default = StringsKt.substringBefore$default(str5, '/');
                Locale locale = Locale.US;
                String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, substringBefore$default, locale);
                String lowerCase = StringsKt.substringBefore$default(StringsKt.substringAfter('/', str5, str5), ';').toLowerCase(locale);
                lowerCase.getClass();
                if (m.equals("image")) {
                    i2 = 7;
                } else if (m.equals("video") || m.equals("audio")) {
                    i2 = 11;
                } else if (m.equals("font")) {
                    i2 = 9;
                } else if (m.equals("text") && lowerCase.equals("css")) {
                    i2 = 10;
                } else if (m.equals("text") && lowerCase.equals("javascript")) {
                    i2 = 8;
                }
            }
            if (!z2 || datadogSpan == null) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            } else {
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("_dd.trace_id", datadogSpan.context().getTraceId().toHexString());
                mapBuilder.put("_dd.span_id", String.valueOf(datadogSpan.context().getSpanId()));
                mapBuilder.put("_dd.rule_psr", Float.valueOf(this.traceSampler.getSampleRate().floatValue() / 100.0f));
                String str6 = headers2.get("_dd-custom-header-graph-ql-operation-name");
                if (str6 != null) {
                    mapBuilder.put("_dd.graphql.operation_name", fromBase64(str6));
                }
                String str7 = headers2.get("_dd-custom-header-graph-ql-operation-type");
                if (str7 != null) {
                    mapBuilder.put("_dd.graphql.operation_type", fromBase64(str7));
                }
                String str8 = headers2.get("_dd-custom-header-graph-ql-variables");
                if (str8 != null) {
                    mapBuilder.put("_dd.graphql.variables", fromBase64(str8));
                }
                String str9 = headers2.get("_dd-custom-header-graph-ql-payload");
                if (str9 != null) {
                    mapBuilder.put("_dd.graphql.payload", fromBase64(str9));
                }
                map = mapBuilder.build();
            }
            Map map2 = map;
            RumMonitor rumMonitor2 = GlobalRumMonitor.get(internalSdkCore);
            AdvancedRumMonitor advancedRumMonitor2 = rumMonitor2 instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor2 : null;
            if (advancedRumMonitor2 != null) {
                Integer valueOf = Integer.valueOf(i);
                InternalLogger internalLogger = internalSdkCore.getInternalLogger();
                InternalLogger.Target target2 = InternalLogger.Target.MAINTAINER;
                try {
                    try {
                        responseBody = response.body;
                    } catch (IOException e) {
                        target = target2;
                        iOException = e;
                    }
                } catch (IllegalArgumentException e2) {
                    DBUtil.log$default(internalLogger, 5, CollectionsKt__CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{target2, InternalLogger.Target.TELEMETRY}), DatadogInterceptor$getBodyLength$1.INSTANCE$4, e2, 48);
                } catch (IllegalStateException e3) {
                    DBUtil.log$default(internalLogger, 5, target2, DatadogInterceptor$getBodyLength$1.INSTANCE$3, e3, false, 48);
                }
                if (responseBody != null) {
                    try {
                        contentType = responseBody.contentType();
                    } catch (IOException e4) {
                        iOException = e4;
                        target = target2;
                        DBUtil.log$default(internalLogger, 5, target, DatadogInterceptor$getBodyLength$1.INSTANCE, iOException, false, 48);
                        l = null;
                        advancedRumMonitor2.stopResource(buildResourceId2, valueOf, l, i2, MapsKt__MapsKt.plus(map2, hurlStack.onProvideAttributes(request, response, null)));
                    }
                    if (contentType != null) {
                        str = contentType.f1545type + "/" + contentType.subtype;
                        boolean contains = CollectionsKt.contains(STREAM_CONTENT_TYPES, str);
                        str2 = headers.get("Sec-WebSocket-Accept");
                        if (str2 == null) {
                            str2 = null;
                        }
                        if (str2 != null && !StringsKt.isBlank(str2)) {
                            z = false;
                            if (responseBody != null && !contains && z) {
                                long contentLength = responseBody.contentLength();
                                l = contentLength >= 0 ? null : Long.valueOf(contentLength);
                                if (l == null) {
                                    long contentLength2 = response.peekBody(33554432L).contentLength();
                                    if (contentLength2 >= 0) {
                                        l = Long.valueOf(contentLength2);
                                    }
                                }
                                advancedRumMonitor2.stopResource(buildResourceId2, valueOf, l, i2, MapsKt__MapsKt.plus(map2, hurlStack.onProvideAttributes(request, response, null)));
                            }
                            l = null;
                            advancedRumMonitor2.stopResource(buildResourceId2, valueOf, l, i2, MapsKt__MapsKt.plus(map2, hurlStack.onProvideAttributes(request, response, null)));
                        }
                        z = true;
                        if (responseBody != null) {
                            long contentLength3 = responseBody.contentLength();
                            if (contentLength3 >= 0) {
                            }
                            if (l == null) {
                            }
                            advancedRumMonitor2.stopResource(buildResourceId2, valueOf, l, i2, MapsKt__MapsKt.plus(map2, hurlStack.onProvideAttributes(request, response, null)));
                        }
                        l = null;
                        advancedRumMonitor2.stopResource(buildResourceId2, valueOf, l, i2, MapsKt__MapsKt.plus(map2, hurlStack.onProvideAttributes(request, response, null)));
                    }
                }
                str = null;
                boolean contains2 = CollectionsKt.contains(STREAM_CONTENT_TYPES, str);
                str2 = headers.get("Sec-WebSocket-Accept");
                if (str2 == null) {
                }
                if (str2 != null) {
                    z = false;
                    if (responseBody != null) {
                    }
                    l = null;
                    advancedRumMonitor2.stopResource(buildResourceId2, valueOf, l, i2, MapsKt__MapsKt.plus(map2, hurlStack.onProvideAttributes(request, response, null)));
                }
                z = true;
                if (responseBody != null) {
                }
                l = null;
                advancedRumMonitor2.stopResource(buildResourceId2, valueOf, l, i2, MapsKt__MapsKt.plus(map2, hurlStack.onProvideAttributes(request, response, null)));
            }
        }
    }

    @Override // com.datadog.android.okhttp.trace.TracingInterceptor
    public final void onSdkInstanceReady$dd_sdk_android_okhttp_release(InternalSdkCore internalSdkCore) {
        internalSdkCore.getClass();
        super.onSdkInstanceReady$dd_sdk_android_okhttp_release(internalSdkCore);
        RumMonitor rumMonitor = GlobalRumMonitor.get(internalSdkCore);
        AdvancedRumMonitor advancedRumMonitor = rumMonitor instanceof AdvancedRumMonitor ? (AdvancedRumMonitor) rumMonitor : null;
        if (advancedRumMonitor != null) {
            advancedRumMonitor.notifyInterceptorInstantiated();
        }
    }
}
