package com.onesignal.user.internal.backend.impl;

import com.onesignal.common.f;
import gb.e;
import gb.h;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements gb.d {
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
            return d.this.createUser(null, null, null, null, this);
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
            return d.this.getUser(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.updateUser(null, null, null, null, false, null, this);
        }
    }

    public d(w8.c cVar) {
        j.e(cVar, "_httpClient");
        this._httpClient = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // gb.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createUser(String str, Map<String, String> map, List<h> list, Map<String, String> map2, fc.d dVar) {
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
                    JSONObject jSONObject = new JSONObject();
                    if (!map.isEmpty()) {
                        jSONObject.put("identity", f.putMap(new JSONObject(), map));
                    }
                    if (!list.isEmpty()) {
                        jSONObject.put("subscriptions", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(list));
                    }
                    if (!map2.isEmpty()) {
                        jSONObject.put("properties", f.putMap(new JSONObject(), map2));
                    }
                    jSONObject.put("refresh_device_metadata", true);
                    w8.c cVar = this._httpClient;
                    String j3 = a4.d.j("apps/", str, "/users");
                    aVar3.label = 1;
                    obj = w8.b.post$default(cVar, j3, jSONObject, null, aVar3, 4, null);
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
                com.onesignal.user.internal.backend.impl.b bVar = com.onesignal.user.internal.backend.impl.b.INSTANCE;
                String payload = aVar2.getPayload();
                j.b(payload);
                return bVar.convertToCreateUserResponse(new JSONObject(payload));
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // gb.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUser(String str, String str2, String str3, fc.d dVar) {
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
                    obj = w8.b.get$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, null, bVar2, 2, null);
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
                return com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToCreateUserResponse(new JSONObject(aVar.getPayload()));
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // gb.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUser(String str, String str2, String str3, gb.f fVar, boolean z10, e eVar, fc.d dVar) {
        c cVar;
        int i10;
        w8.a aVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i11 = cVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.label = i11 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                i10 = cVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    JSONObject put = new JSONObject().put("refresh_device_metadata", z10);
                    if (fVar.getHasAtLeastOnePropertySet()) {
                        put.put("properties", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(fVar));
                    }
                    if (eVar.getHasAtLeastOnePropertySet()) {
                        put.put("deltas", com.onesignal.user.internal.backend.impl.b.INSTANCE.convertToJSON(eVar));
                    }
                    j.d(put, "jsonObject");
                    cVar.label = 1;
                    obj = w8.b.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, put, null, cVar, 4, null);
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
        cVar = new c(dVar);
        Object obj2 = cVar.result;
        i10 = cVar.label;
        if (i10 != 0) {
        }
        aVar = (w8.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
