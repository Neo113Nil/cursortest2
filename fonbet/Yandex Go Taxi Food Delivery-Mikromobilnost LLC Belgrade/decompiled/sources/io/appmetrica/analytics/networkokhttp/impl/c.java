package io.appmetrica.analytics.networkokhttp.impl;

import defpackage.bgo;
import defpackage.c6w;
import defpackage.d5j0;
import defpackage.d6w;
import defpackage.jl40;
import defpackage.kvj0;
import defpackage.m5j0;
import defpackage.meu;
import defpackage.nci0;
import defpackage.qv10;
import defpackage.t4j0;
import defpackage.wms;
import defpackage.y6i0;
import defpackage.yf7;
import defpackage.zf61;
import io.appmetrica.analytics.coreutils.internal.io.InputStreamUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkCallMetrics;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class c extends Call {
    public final OkHttpClient a;
    public final Request b;
    public final NetworkClientSettings c;

    public c(OkHttpClient okHttpClient, Request request, NetworkClientSettings networkClientSettings) {
        this.a = okHttpClient;
        this.b = request;
        this.c = networkClientSettings;
    }

    public static d5j0 a(Request request) {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(request.getUrl());
        switch (a.a[request.getMethod().ordinal()]) {
            case 1:
                t4j0Var.c();
                break;
            case 2:
                t4j0Var.e("HEAD", null);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                String methodName = request.getMethod().getMethodName();
                int i = m5j0.a;
                t4j0Var.e(methodName, wms.b(7, null, request.getBody()));
                break;
        }
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            t4j0Var.a(entry.getKey(), entry.getValue());
        }
        return new d5j0(t4j0Var);
    }

    @Override // io.appmetrica.analytics.networkapi.Call
    public final Response execute() {
        NetworkCallMetrics networkCallMetrics;
        NetworkCallMetrics networkCallMetrics2 = null;
        d dVar = jl40.l(this.c.getCollectMetrics(), Boolean.TRUE) ? new d(new SystemTimeProvider()) : null;
        OkHttpClient okHttpClient = this.a;
        if (dVar != null) {
            OkHttpClient.a b = okHttpClient.b();
            b.e = new zf61(dVar, 1);
            okHttpClient = new OkHttpClient(b);
        }
        try {
            kvj0 execute = ((nci0) okHttpClient.newCall(a(this.b))).execute();
            Response.Builder withUrl = new Response.Builder(true, execute.w, InputStreamUtils.INSTANCE.readSafelyApprox(this.c.getMaxResponseSize(), new b(execute))).withHeaders(a(execute.y)).withUrl(execute.a.a.i);
            if (dVar != null) {
                Long a = d.a(dVar.b, dVar.c);
                Long a2 = d.a(dVar.d, dVar.e);
                networkCallMetrics = new NetworkCallMetrics.Builder().withDnsLookup(a).withTcpConnect(a2).withTlsHandshake(d.a(dVar.f, dVar.g)).withTimeToFirstByte(d.a(dVar.h, dVar.i)).withResponse(d.a(dVar.i, dVar.j)).withConnectionReused(dVar.l).withProtocol(dVar.k).build();
            } else {
                networkCallMetrics = null;
            }
            return withUrl.withMetrics(networkCallMetrics).build();
        } catch (Throwable th) {
            Response.Builder builder = new Response.Builder(th);
            if (dVar != null) {
                Long a3 = d.a(dVar.b, dVar.c);
                Long a4 = d.a(dVar.d, dVar.e);
                networkCallMetrics2 = new NetworkCallMetrics.Builder().withDnsLookup(a3).withTcpConnect(a4).withTlsHandshake(d.a(dVar.f, dVar.g)).withTimeToFirstByte(d.a(dVar.h, dVar.i)).withResponse(d.a(dVar.i, dVar.j)).withConnectionReused(dVar.l).withProtocol(dVar.k).build();
            }
            return builder.withMetrics(networkCallMetrics2).build();
        }
    }

    public static LinkedHashMap a(meu meuVar) {
        d6w n = y6i0.n(0, meuVar.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c6w it = n.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            String b = meuVar.b(nextInt);
            Object obj = linkedHashMap.get(b);
            if (obj == null) {
                obj = qv10.w(b, linkedHashMap);
            }
            ((List) obj).add(meuVar.f(nextInt));
        }
        return linkedHashMap;
    }

    public static final bgo a(d dVar, yf7 yf7Var) {
        return dVar;
    }
}
