package com.onesignal.user.internal.backend.impl;

import D.y;
import com.bumptech.glide.f;
import com.onesignal.common.e;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import m4.C4781b;
import org.json.JSONObject;
import p4.C4860a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class d implements M5.d {
    private final A4.c _httpClient;

    public static final class a extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createUser(null, null, null, null, null, this);
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
            return d.this.getUser(null, null, null, null, this);
        }
    }

    public static final class c extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.updateUser(null, null, null, null, false, null, null, this);
        }
    }

    public d(A4.c _httpClient) {
        h.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUser(String str, Map<String, String> map, List<M5.h> list, Map<String, String> map2, String str2, InterfaceC5133d interfaceC5133d) {
        a aVar;
        int i;
        A4.a aVar2;
        if (interfaceC5133d instanceof a) {
            aVar = (a) interfaceC5133d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = aVar.label;
                if (i != 0) {
                    f.r(obj);
                    JSONObject jSONObject = new JSONObject();
                    if (!map.isEmpty()) {
                        jSONObject.put(Q5.c.IDENTITY_NAME_SPACE, e.putMap(new JSONObject(), map));
                    }
                    if (!list.isEmpty()) {
                        jSONObject.put("subscriptions", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(list));
                    }
                    if (!map2.isEmpty()) {
                        jSONObject.put("properties", e.putMap(new JSONObject(), map2));
                    }
                    jSONObject.put("refresh_device_metadata", true);
                    A4.c cVar = this._httpClient;
                    String k6 = y.k("apps/", str, "/users");
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str2, 15, null);
                    aVar.label = 1;
                    obj = cVar.post(k6, jSONObject, eVar, aVar);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                aVar2 = (A4.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C4860a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                com.onesignal.user.internal.backend.impl.b bVar = com.onesignal.user.internal.backend.impl.b.INSTANCE;
                String payload = aVar2.getPayload();
                h.b(payload);
                return bVar.convertToCreateUserResponse(new JSONObject(payload));
            }
        }
        aVar = new a(interfaceC5133d);
        Object obj2 = aVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = aVar.label;
        if (i != 0) {
        }
        aVar2 = (A4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUser(String str, String str2, String str3, String str4, InterfaceC5133d interfaceC5133d) {
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
                    com.onesignal.core.internal.http.impl.e eVar = new com.onesignal.core.internal.http.impl.e(null, null, null, null, str4, 15, null);
                    bVar.label = 1;
                    obj = this._httpClient.get("apps/" + str + "/users/by/" + str2 + '/' + str3, eVar, bVar);
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
                return com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToCreateUserResponse(new JSONObject(aVar.getPayload()));
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // M5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUser(String str, String str2, String str3, M5.f fVar, boolean z8, M5.e eVar, String str4, InterfaceC5133d interfaceC5133d) {
        c cVar;
        int i;
        A4.a aVar;
        if (interfaceC5133d instanceof c) {
            cVar = (c) interfaceC5133d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = cVar.label;
                if (i != 0) {
                    f.r(obj);
                    JSONObject put = new JSONObject().put("refresh_device_metadata", z8);
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
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? e.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? e.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new C4781b(safeString, safeLong);
                }
                return null;
            }
        }
        cVar = new c(interfaceC5133d);
        Object obj2 = cVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = cVar.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
