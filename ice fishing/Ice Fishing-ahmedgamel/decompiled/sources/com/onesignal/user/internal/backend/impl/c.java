package com.onesignal.user.internal.backend.impl;

import D.y;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import q4.C4926b;
import t4.C5040a;
import u7.C5089g;
import u7.v;
import v7.q;
import v7.t;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class c implements Q5.c {
    private final E4.c _httpClient;

    public static final class a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.createSubscription(null, null, null, null, null, this);
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
            return c.this.deleteSubscription(null, null, null, this);
        }
    }

    /* renamed from: com.onesignal.user.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0248c extends B7.c {
        int label;
        /* synthetic */ Object result;

        public C0248c(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.getIdentityFromSubscription(null, null, this);
        }
    }

    public static final class d extends B7.c {
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.transferSubscription(null, null, null, null, null, this);
        }
    }

    public static final class e extends B7.c {
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.updateSubscription(null, null, null, null, this);
        }
    }

    public c(E4.c _httpClient) {
        h.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // Q5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSubscription(String str, String str2, String str3, Q5.h hVar, String str4, InterfaceC5267d interfaceC5267d) {
        a aVar;
        int i;
        E4.a aVar2;
        if (interfaceC5267d instanceof a) {
            aVar = (a) interfaceC5267d;
            int i6 = aVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.label = i6 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                A7.a aVar3 = A7.a.f58n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
                    h.b(put);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    aVar.label = 1;
                    obj = this._httpClient.post("apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", put, eVar, aVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
                aVar2 = (E4.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C5040a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                JSONObject safeJSONObject = jSONObject != null ? com.onesignal.common.e.safeJSONObject(jSONObject, "subscription") : null;
                if (safeJSONObject == null || !safeJSONObject.has("id")) {
                    return null;
                }
                String safeString = com.onesignal.common.e.safeString(jSONObject, "ryw_token");
                return new C5089g(safeJSONObject.getString("id"), safeString != null ? new C4926b(safeString, com.onesignal.common.e.safeLong(jSONObject, "ryw_delay")) : null);
            }
        }
        aVar = new a(interfaceC5267d);
        Object obj2 = aVar.result;
        A7.a aVar32 = A7.a.f58n;
        i = aVar.label;
        if (i != 0) {
        }
        aVar2 = (E4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Q5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSubscription(String str, String str2, String str3, InterfaceC5267d interfaceC5267d) {
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
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str3, 15, null);
                    bVar.label = 1;
                    obj = this._httpClient.delete("apps/" + str + "/subscriptions/" + str2, eVar, bVar);
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // Q5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIdentityFromSubscription(String str, String str2, InterfaceC5267d interfaceC5267d) {
        C0248c c0248c;
        int i;
        E4.a aVar;
        Map<String, Object> map;
        if (interfaceC5267d instanceof C0248c) {
            c0248c = (C0248c) interfaceC5267d;
            int i6 = c0248c.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0248c.label = i6 - Integer.MIN_VALUE;
                C0248c c0248c2 = c0248c;
                Object obj = c0248c2.result;
                A7.a aVar2 = A7.a.f58n;
                i = c0248c2.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    E4.c cVar = this._httpClient;
                    String p9 = y.p("apps/", str, "/subscriptions/", str2, "/user/identity");
                    c0248c2.label = 1;
                    obj = E4.b.get$default(cVar, p9, null, c0248c2, 2, null);
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
                JSONObject safeJSONObject = com.onesignal.common.e.safeJSONObject(new JSONObject(payload), U5.c.IDENTITY_NAME_SPACE);
                if (safeJSONObject == null || (map = com.onesignal.common.e.toMap(safeJSONObject)) == null) {
                    return q.f41443n;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(t.P(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        c0248c = new C0248c(interfaceC5267d);
        C0248c c0248c22 = c0248c;
        Object obj2 = c0248c22.result;
        A7.a aVar22 = A7.a.f58n;
        i = c0248c22.label;
        if (i != 0) {
        }
        aVar = (E4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Q5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transferSubscription(String str, String str2, String str3, String str4, String str5, InterfaceC5267d interfaceC5267d) {
        d dVar;
        int i;
        E4.a aVar;
        if (interfaceC5267d instanceof d) {
            dVar = (d) interfaceC5267d;
            int i6 = dVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dVar.label = i6 - Integer.MIN_VALUE;
                Object obj = dVar.result;
                A7.a aVar2 = A7.a.f58n;
                i = dVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    JSONObject put = new JSONObject().put(U5.c.IDENTITY_NAME_SPACE, new JSONObject().put(str3, str4));
                    E4.c cVar = this._httpClient;
                    String p9 = y.p("apps/", str, "/subscriptions/", str2, "/owner");
                    h.b(put);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str5, 15, null);
                    dVar.label = 1;
                    obj = cVar.patch(p9, put, eVar, dVar);
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
        dVar = new d(interfaceC5267d);
        Object obj2 = dVar.result;
        A7.a aVar22 = A7.a.f58n;
        i = dVar.label;
        if (i != 0) {
        }
        aVar = (E4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Q5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSubscription(String str, String str2, Q5.h hVar, String str3, InterfaceC5267d interfaceC5267d) {
        e eVar;
        int i;
        E4.a aVar;
        if (interfaceC5267d instanceof e) {
            eVar = (e) interfaceC5267d;
            int i6 = eVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar.label = i6 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                A7.a aVar2 = A7.a.f58n;
                i = eVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
                    h.b(put);
                    com.onesignal.core.internal.http.impl.e eVar2 = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str3, 15, null);
                    eVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/subscriptions/" + str2, put, eVar2, eVar);
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
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? com.onesignal.common.e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? com.onesignal.common.e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new C4926b(safeString, safeLong);
                }
                return null;
            }
        }
        eVar = new e(interfaceC5267d);
        Object obj2 = eVar.result;
        A7.a aVar22 = A7.a.f58n;
        i = eVar.label;
        if (i != 0) {
        }
        aVar = (E4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
