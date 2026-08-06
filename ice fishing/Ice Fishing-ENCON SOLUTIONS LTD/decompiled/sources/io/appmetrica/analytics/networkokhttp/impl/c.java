package io.appmetrica.analytics.networkokhttp.impl;

import J1.l;
import J1.m;
import J1.s;
import J1.u;
import J1.v;
import J1.w;
import J1.y;
import io.appmetrica.analytics.coreutils.internal.io.InputStreamUtils;
import io.appmetrica.analytics.networkapi.Call;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.i;
import u0.AbstractC1050a;
import w1.C1061b;
import w1.C1062c;

/* loaded from: classes.dex */
public final class c extends Call {

    /* renamed from: a, reason: collision with root package name */
    public final s f7455a;

    /* renamed from: b, reason: collision with root package name */
    public final Request f7456b;

    /* renamed from: c, reason: collision with root package name */
    public final NetworkClientSettings f7457c;

    public c(s sVar, Request request, NetworkClientSettings networkClientSettings) {
        this.f7455a = sVar;
        this.f7456b = request;
        this.f7457c = networkClientSettings;
    }

    public static LinkedHashMap a(m mVar) {
        C1062c E2 = AbstractC1050a.E(0, mVar.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = E2.iterator();
        while (((C1061b) it).f8521c) {
            int a2 = ((C1061b) it).a();
            String b2 = mVar.b(a2);
            Object obj = linkedHashMap.get(b2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(b2, obj);
            }
            ((List) obj).add(mVar.d(a2));
        }
        return linkedHashMap;
    }

    @Override // io.appmetrica.analytics.networkapi.Call
    public final Response execute() {
        try {
            s sVar = this.f7455a;
            v request = a(this.f7456b);
            sVar.getClass();
            i.e(request, "request");
            y c2 = new N1.i(sVar, request).c();
            return new Response.Builder(true, c2.f1003d, InputStreamUtils.INSTANCE.readSafelyApprox(this.f7457c.getMaxResponseSize(), new b(c2))).withHeaders(a(c2.f1005f)).withUrl(c2.f1000a.f977a.f911h).build();
        } catch (Throwable th) {
            return new Response.Builder(th).build();
        }
    }

    public static v a(Request request) {
        u uVar = new u();
        uVar.d(request.getUrl());
        int i2 = a.f7453a[request.getMethod().ordinal()];
        if (i2 == 1) {
            uVar.c("GET", null);
        } else if (i2 == 2) {
            String methodName = request.getMethod().getMethodName();
            byte[] body = request.getBody();
            int length = body.length;
            i.e(body, "<this>");
            K1.b.c(body.length, 0, length);
            uVar.c(methodName, new w(null, length, body, 0));
        }
        for (Map.Entry<String, String> entry : request.getHeaders().entrySet()) {
            String name = entry.getKey();
            String value = entry.getValue();
            i.e(name, "name");
            i.e(value, "value");
            l lVar = (l) uVar.f974d;
            lVar.getClass();
            AbstractC1050a.f(name);
            AbstractC1050a.g(value, name);
            lVar.a(name, value);
        }
        return uVar.a();
    }
}
