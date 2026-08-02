package com.onesignal.user.internal.backend.impl;

import D.x;
import Q5.f;
import com.onesignal.common.e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import q4.C4875b;
import t4.C5041a;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class d implements Q5.d {
    private final E4.c _httpClient;

    public static final class a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createUser(null, null, null, null, null, this);
        }
    }

    public static final class b extends B7.c {
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.getUser(null, null, null, null, this);
        }
    }

    public static final class c extends B7.c {
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.updateUser(null, null, null, null, false, null, null, this);
        }
    }

    public d(E4.c _httpClient) {
        h.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUser(String str, Map<String, String> map, List<Q5.h> list, Map<String, String> map2, String str2, InterfaceC5240d interfaceC5240d) {
        a aVar;
        int i;
        E4.a aVar2;
        if (interfaceC5240d instanceof a) {
            aVar = (a) interfaceC5240d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                A7.a aVar3 = A7.a.f215n;
                i = aVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    JSONObject jSONObject = new JSONObject();
                    if (!map.isEmpty()) {
                        jSONObject.put(U5.c.IDENTITY_NAME_SPACE, e.putMap(new JSONObject(), map));
                    }
                    if (!list.isEmpty()) {
                        jSONObject.put("subscriptions", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(list));
                    }
                    if (!map2.isEmpty()) {
                        jSONObject.put("properties", e.putMap(new JSONObject(), map2));
                    }
                    jSONObject.put("refresh_device_metadata", true);
                    E4.c cVar = this._httpClient;
                    String l9 = x.l("apps/", str, "/users");
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str2, 15, null);
                    aVar.label = 1;
                    obj = cVar.post(l9, jSONObject, eVar, aVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                aVar2 = (E4.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C5041a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                com.onesignal.user.internal.backend.impl.b bVar = com.onesignal.user.internal.backend.impl.b.INSTANCE;
                String payload = aVar2.getPayload();
                h.b(payload);
                return bVar.convertToCreateUserResponse(new JSONObject(payload));
            }
        }
        aVar = new a(interfaceC5240d);
        Object obj2 = aVar.result;
        A7.a aVar32 = A7.a.f215n;
        i = aVar.label;
        if (i != 0) {
        }
        aVar2 = (E4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUser(String str, String str2, String str3, String str4, InterfaceC5240d interfaceC5240d) {
        b bVar;
        int i;
        E4.a aVar;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                A7.a aVar2 = A7.a.f215n;
                i = bVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    bVar.label = 1;
                    obj = this._httpClient.get("apps/" + str + "/users/by/" + str2 + '/' + str3, eVar, bVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                aVar = (E4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C5041a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToCreateUserResponse(new JSONObject(aVar.getPayload()));
            }
        }
        bVar = new b(interfaceC5240d);
        Object obj2 = bVar.result;
        A7.a aVar22 = A7.a.f215n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar = (E4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // Q5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUser(String str, String str2, String str3, f fVar, boolean z6, Q5.e eVar, String str4, InterfaceC5240d interfaceC5240d) {
        c cVar;
        int i;
        E4.a aVar;
        if (interfaceC5240d instanceof c) {
            cVar = (c) interfaceC5240d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                A7.a aVar2 = A7.a.f215n;
                i = cVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    JSONObject put = new JSONObject().put("refresh_device_metadata", z6);
                    if (fVar.getHasAtLeastOnePropertySet()) {
                        put.put("properties", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(fVar));
                    }
                    if (eVar.getHasAtLeastOnePropertySet()) {
                        put.put("deltas", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(eVar));
                    }
                    h.b(put);
                    com.onesignal.core.internal.http.impl.e eVar2 = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    cVar.label = 1;
                    obj = this._httpClient.patch("apps/" + str + "/users/by/" + str2 + '/' + str3, put, eVar2, cVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                aVar = (E4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C5041a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                String payload = aVar.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new C4875b(safeString, safeLong);
                }
                return null;
            }
        }
        cVar = new c(interfaceC5240d);
        Object obj2 = cVar.result;
        A7.a aVar22 = A7.a.f215n;
        i = cVar.label;
        if (i != 0) {
        }
        aVar = (E4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
