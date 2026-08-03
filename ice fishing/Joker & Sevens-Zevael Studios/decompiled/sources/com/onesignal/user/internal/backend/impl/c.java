package com.onesignal.user.internal.backend.impl;

import ac.i;
import ac.o;
import bc.a0;
import bc.w;
import com.onesignal.common.f;
import gb.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements gb.c {
    private final w8.c _httpClient;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.c {
        int label;
        /* synthetic */ Object result;

        public a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.createSubscription(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.deleteSubscription(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.user.internal.backend.impl.c$c, reason: collision with other inner class name */
    public static final class C0067c extends hc.c {
        int label;
        /* synthetic */ Object result;

        public C0067c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.getIdentityFromSubscription(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.transferSubscription(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.c {
        int label;
        /* synthetic */ Object result;

        public e(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.updateSubscription(null, null, null, this);
        }
    }

    public c(w8.c cVar) {
        j.e(cVar, "_httpClient");
        this._httpClient = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // gb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSubscription(String str, String str2, String str3, h hVar, fc.d dVar) {
        a aVar;
        int i10;
        w8.a aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.label = i11 - Integer.MIN_VALUE;
                a aVar3 = aVar;
                Object obj = aVar3.result;
                i10 = aVar3.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    JSONObject convertToJSON = com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar);
                    convertToJSON.remove("id");
                    JSONObject put = new JSONObject().put("subscription", convertToJSON);
                    j.d(put, "requestJSON");
                    aVar3.label = 1;
                    obj = w8.b.post$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", put, null, aVar3, 4, null);
                    gc.a aVar4 = gc.a.f2559g;
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                aVar2 = (w8.a) obj;
                if (aVar2.isSuccess()) {
                    throw new l8.a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                String payload = aVar2.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                JSONObject safeJSONObject = jSONObject != null ? f.safeJSONObject(jSONObject, "subscription") : null;
                if (safeJSONObject == null || !safeJSONObject.has("id")) {
                    return null;
                }
                String safeString = f.safeString(jSONObject, "ryw_token");
                return new i(safeJSONObject.getString("id"), safeString != null ? new i8.b(safeString, f.safeLong(jSONObject, "ryw_delay")) : null);
            }
        }
        aVar = new a(dVar);
        a aVar32 = aVar;
        Object obj2 = aVar32.result;
        i10 = aVar32.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // gb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object deleteSubscription(String str, String str2, fc.d dVar) {
        b bVar;
        int i10;
        w8.a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                i10 = bVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    bVar2.label = 1;
                    obj = w8.b.delete$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2, null, bVar2, 2, null);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                aVar = (w8.a) obj;
                if (aVar.isSuccess()) {
                    throw new l8.a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return o.f277a;
            }
        }
        bVar = new b(dVar);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        i10 = bVar22.label;
        if (i10 != 0) {
        }
        aVar = (w8.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // gb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getIdentityFromSubscription(String str, String str2, fc.d dVar) {
        C0067c c0067c;
        int i10;
        w8.a aVar;
        Map<String, Object> map;
        if (dVar instanceof C0067c) {
            c0067c = (C0067c) dVar;
            int i11 = c0067c.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0067c.label = i11 - Integer.MIN_VALUE;
                C0067c c0067c2 = c0067c;
                Object obj = c0067c2.result;
                i10 = c0067c2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    c0067c2.label = 1;
                    obj = w8.b.get$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/user/identity", null, c0067c2, 2, null);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                aVar = (w8.a) obj;
                if (aVar.isSuccess()) {
                    throw new l8.a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                String payload = aVar.getPayload();
                j.b(payload);
                JSONObject safeJSONObject = f.safeJSONObject(new JSONObject(payload), "identity");
                if (safeJSONObject == null || (map = f.toMap(safeJSONObject)) == null) {
                    return w.f1068g;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a0.B(map.size()));
                Iterator<T> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                }
                return linkedHashMap;
            }
        }
        c0067c = new C0067c(dVar);
        C0067c c0067c22 = c0067c;
        Object obj2 = c0067c22.result;
        i10 = c0067c22.label;
        if (i10 != 0) {
        }
        aVar = (w8.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // gb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object transferSubscription(String str, String str2, String str3, String str4, fc.d dVar) {
        d dVar2;
        int i10;
        w8.a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
                d dVar3 = dVar2;
                Object obj = dVar3.result;
                i10 = dVar3.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    JSONObject put = new JSONObject().put("identity", new JSONObject().put(str3, str4));
                    j.d(put, "requestJSON");
                    dVar3.label = 1;
                    obj = w8.b.patch$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/owner", put, null, dVar3, 4, null);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                aVar = (w8.a) obj;
                if (aVar.isSuccess()) {
                    throw new l8.a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return o.f277a;
            }
        }
        dVar2 = new d(dVar);
        d dVar32 = dVar2;
        Object obj2 = dVar32.result;
        i10 = dVar32.label;
        if (i10 != 0) {
        }
        aVar = (w8.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // gb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateSubscription(String str, String str2, h hVar, fc.d dVar) {
        e eVar;
        int i10;
        w8.a aVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.label = i11 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.result;
                i10 = eVar2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    JSONObject put = new JSONObject().put("subscription", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(hVar));
                    j.d(put, "requestJSON");
                    eVar2.label = 1;
                    obj = w8.b.patch$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2, put, null, eVar2, 4, null);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                aVar = (w8.a) obj;
                if (aVar.isSuccess()) {
                    throw new l8.a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                String payload = aVar.getPayload();
                JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
                String safeString = jSONObject != null ? f.safeString(jSONObject, "ryw_token") : null;
                Long safeLong = jSONObject != null ? f.safeLong(jSONObject, "ryw_delay") : null;
                if (safeString != null) {
                    return new i8.b(safeString, safeLong);
                }
                return null;
            }
        }
        eVar = new e(dVar);
        e eVar22 = eVar;
        Object obj2 = eVar22.result;
        i10 = eVar22.label;
        if (i10 != 0) {
        }
        aVar = (w8.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
