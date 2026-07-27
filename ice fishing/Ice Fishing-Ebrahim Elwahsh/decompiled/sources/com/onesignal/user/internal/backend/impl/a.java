package com.onesignal.user.internal.backend.impl;

import D.y;
import com.bumptech.glide.f;
import com.onesignal.core.internal.http.impl.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import p4.C4860a;
import q7.v;
import r7.t;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a implements M5.b {
    private final A4.c _httpClient;

    /* renamed from: com.onesignal.user.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0245a extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public C0245a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.deleteAlias(null, null, null, null, null, this);
        }
    }

    public static final class b extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setAlias(null, null, null, null, null, this);
        }
    }

    public a(A4.c _httpClient) {
        h.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAlias(String str, String str2, String str3, String str4, String str5, InterfaceC5133d interfaceC5133d) {
        C0245a c0245a;
        int i;
        A4.a aVar;
        if (interfaceC5133d instanceof C0245a) {
            c0245a = (C0245a) interfaceC5133d;
            int i4 = c0245a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0245a.label = i4 - Integer.MIN_VALUE;
                Object obj = c0245a.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0245a.label;
                if (i != 0) {
                    f.r(obj);
                    A4.c cVar = this._httpClient;
                    StringBuilder sb = new StringBuilder("apps/");
                    sb.append(str);
                    sb.append("/users/by/");
                    sb.append(str2);
                    sb.append('/');
                    String o9 = y.o(sb, str3, "/identity/", str4);
                    e eVar = new e(null, null, null, null, str5, 15, null);
                    c0245a.label = 1;
                    obj = cVar.delete(o9, eVar, c0245a);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                aVar = (A4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C4860a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return v.f40183a;
            }
        }
        c0245a = new C0245a(interfaceC5133d);
        Object obj2 = c0245a.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0245a.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // M5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, String str4, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        A4.a aVar;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar.label;
                if (i != 0) {
                    f.r(obj);
                    JSONObject put = new JSONObject().put(Q5.c.IDENTITY_NAME_SPACE, com.onesignal.common.e.putMap(new JSONObject(), map));
                    h.b(put);
                    e eVar = new e(null, null, null, null, str4, 15, null);
                    bVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", put, eVar, bVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                aVar = (A4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C4860a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                String payload = aVar.getPayload();
                h.b(payload);
                JSONObject jSONObject = new JSONObject(payload).getJSONObject(Q5.c.IDENTITY_NAME_SPACE);
                h.d(jSONObject, "getJSONObject(...)");
                Map<String, Object> map2 = com.onesignal.common.e.toMap(jSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap(t.z(map2.size()));
                Iterator<T> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        bVar = new b(interfaceC5133d);
        Object obj2 = bVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
