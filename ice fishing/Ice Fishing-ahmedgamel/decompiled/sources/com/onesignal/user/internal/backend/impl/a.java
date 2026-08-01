package com.onesignal.user.internal.backend.impl;

import D.y;
import com.onesignal.core.internal.http.impl.e;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import t4.C5040a;
import u7.v;
import v7.t;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class a implements Q5.b {
    private final E4.c _httpClient;

    /* renamed from: com.onesignal.user.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0246a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public C0246a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.deleteAlias(null, null, null, null, null, this);
        }
    }

    public static final class b extends B7.c {
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.setAlias(null, null, null, null, null, this);
        }
    }

    public a(E4.c _httpClient) {
        h.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Q5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteAlias(String str, String str2, String str3, String str4, String str5, InterfaceC5267d interfaceC5267d) {
        C0246a c0246a;
        int i;
        E4.a aVar;
        if (interfaceC5267d instanceof C0246a) {
            c0246a = (C0246a) interfaceC5267d;
            int i6 = c0246a.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0246a.label = i6 - Integer.MIN_VALUE;
                Object obj = c0246a.result;
                A7.a aVar2 = A7.a.f58n;
                i = c0246a.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    E4.c cVar = this._httpClient;
                    StringBuilder sb = new StringBuilder("apps/");
                    sb.append(str);
                    sb.append("/users/by/");
                    sb.append(str2);
                    sb.append('/');
                    String s9 = y.s(sb, str3, "/identity/", str4);
                    e eVar = new e(null, null, null, null, str5, 15, null);
                    c0246a.label = 1;
                    obj = cVar.delete(s9, eVar, c0246a);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
                aVar = (E4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C5040a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return v.f41353a;
            }
        }
        c0246a = new C0246a(interfaceC5267d);
        Object obj2 = c0246a.result;
        A7.a aVar22 = A7.a.f58n;
        i = c0246a.label;
        if (i != 0) {
        }
        aVar = (E4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // Q5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, String str4, InterfaceC5267d interfaceC5267d) {
        b bVar;
        int i;
        E4.a aVar;
        if (interfaceC5267d instanceof b) {
            bVar = (b) interfaceC5267d;
            int i6 = bVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.label = i6 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                A7.a aVar2 = A7.a.f58n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    JSONObject put = new JSONObject().put(U5.c.IDENTITY_NAME_SPACE, com.onesignal.common.e.putMap(new JSONObject(), map));
                    h.b(put);
                    e eVar = new e(null, null, null, null, str4, 15, null);
                    bVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", put, eVar, bVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
                aVar = (E4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C5040a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                String payload = aVar.getPayload();
                h.b(payload);
                JSONObject jSONObject = new JSONObject(payload).getJSONObject(U5.c.IDENTITY_NAME_SPACE);
                h.d(jSONObject, "getJSONObject(...)");
                Map<String, Object> map2 = com.onesignal.common.e.toMap(jSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap(t.P(map2.size()));
                Iterator<T> it = map2.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        bVar = new b(interfaceC5267d);
        Object obj2 = bVar.result;
        A7.a aVar22 = A7.a.f58n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar = (E4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
