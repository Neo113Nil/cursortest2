package com.google.android.gms.internal.mlkit_vision_common;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkHeaders;
import coil3.network.NetworkRequest;
import coil3.network.NetworkResponse;
import coil3.network.SourceResponseBody;
import coil3.network.okhttp.internal.CallFactoryNetworkClientKt$toRequest$1;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.ArrayIterator;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$1;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public abstract class zzbc {
    public static final NetworkResponse access$toNetworkResponse(Response response) {
        BufferedSource source;
        int i = response.code;
        long j = response.sentRequestAtMillis;
        long j2 = response.receivedResponseAtMillis;
        Headers headers = response.headers;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = headers.iterator();
        while (true) {
            ArrayIterator arrayIterator = (ArrayIterator) it;
            if (!arrayIterator.hasNext()) {
                break;
            }
            Pair pair = (Pair) arrayIterator.next();
            String str = (String) pair.first;
            String str2 = (String) pair.second;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object obj = linkedHashMap.get(lowerCase);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(lowerCase, obj);
            }
            ((List) obj).add(str2);
        }
        NetworkHeaders networkHeaders = new NetworkHeaders(MapsKt__MapsKt.toMap(linkedHashMap));
        ResponseBody responseBody = response.body;
        return new NetworkResponse(i, j, j2, networkHeaders, (responseBody == null || (source = responseBody.source()) == null) ? null : new SourceResponseBody(source), response);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Request access$toRequest(NetworkRequest networkRequest, ContinuationImpl continuationImpl) {
        CallFactoryNetworkClientKt$toRequest$1 callFactoryNetworkClientKt$toRequest$1;
        int i;
        Request.Builder builder;
        String str;
        Request.Builder builder2;
        NetworkRequest networkRequest2;
        RequestBody$Companion$toRequestBody$1 requestBody$Companion$toRequestBody$1;
        if (continuationImpl instanceof CallFactoryNetworkClientKt$toRequest$1) {
            callFactoryNetworkClientKt$toRequest$1 = (CallFactoryNetworkClientKt$toRequest$1) continuationImpl;
            int i2 = callFactoryNetworkClientKt$toRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                callFactoryNetworkClientKt$toRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = callFactoryNetworkClientKt$toRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = callFactoryNetworkClientKt$toRequest$1.label;
                Request.Builder builder3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    builder = new Request.Builder();
                    builder.url(networkRequest.url);
                    str = networkRequest.method;
                    builder2 = builder;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ByteString byteString = (ByteString) obj;
                    if (byteString != null) {
                        RequestBody.Companion.getClass();
                        requestBody$Companion$toRequestBody$1 = new RequestBody$Companion$toRequestBody$1(null, byteString);
                        networkRequest2 = null;
                        builder2 = null;
                        str = null;
                        builder3.method(str, requestBody$Companion$toRequestBody$1);
                        NetworkHeaders networkHeaders = networkRequest2.headers;
                        Headers.Builder builder4 = new Headers.Builder();
                        for (Map.Entry entry : networkHeaders.data.entrySet()) {
                            String str2 = (String) entry.getKey();
                            Iterator it = ((List) entry.getValue()).iterator();
                            while (it.hasNext()) {
                                builder4.addUnsafeNonAscii(str2, (String) it.next());
                            }
                        }
                        Headers build = builder4.build();
                        builder2.getClass();
                        builder2.headers = build.newBuilder();
                        return new Request(builder2);
                    }
                    networkRequest = null;
                    builder = null;
                    builder2 = null;
                    str = null;
                }
                Request.Builder builder5 = builder;
                networkRequest2 = networkRequest;
                requestBody$Companion$toRequestBody$1 = null;
                builder3 = builder5;
                builder3.method(str, requestBody$Companion$toRequestBody$1);
                NetworkHeaders networkHeaders2 = networkRequest2.headers;
                Headers.Builder builder42 = new Headers.Builder();
                while (r5.hasNext()) {
                }
                Headers build2 = builder42.build();
                builder2.getClass();
                builder2.headers = build2.newBuilder();
                return new Request(builder2);
            }
        }
        callFactoryNetworkClientKt$toRequest$1 = new CallFactoryNetworkClientKt$toRequest$1(continuationImpl);
        Object obj2 = callFactoryNetworkClientKt$toRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = callFactoryNetworkClientKt$toRequest$1.label;
        Request.Builder builder32 = null;
        if (i != 0) {
        }
        Request.Builder builder52 = builder;
        networkRequest2 = networkRequest;
        requestBody$Companion$toRequestBody$1 = null;
        builder32 = builder52;
        builder32.method(str, requestBody$Companion$toRequestBody$1);
        NetworkHeaders networkHeaders22 = networkRequest2.headers;
        Headers.Builder builder422 = new Headers.Builder();
        while (r5.hasNext()) {
        }
        Headers build22 = builder422.build();
        builder2.getClass();
        builder2.headers = build22.newBuilder();
        return new Request(builder2);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewInvestingDividendReinvestmentSettings.deepLinkSpecs;
    }
}
