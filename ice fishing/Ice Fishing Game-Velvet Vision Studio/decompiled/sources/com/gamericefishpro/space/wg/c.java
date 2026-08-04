package com.gamericefishpro.space.wg;

import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.vg.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements com.gamericefishpro.space.vg.c {
    private final com.gamericefishpro.space.xc.c _httpClient;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.createSubscription(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.deleteSubscription(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.wg.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0072c extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public C0072c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.getIdentityFromSubscription(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.transferSubscription(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return c.this.updateSubscription(null, null, null, this);
        }
    }

    public c(com.gamericefishpro.space.xc.c _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.vg.c
    public Object createSubscription(String str, String str2, String str3, h hVar, com.gamericefishpro.space.th.a aVar) throws JSONException, com.gamericefishpro.space.ec.a {
        a aVar2;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i = aVar2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar2.label = i - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(aVar);
            }
        } else {
            aVar2 = new a(aVar);
        }
        a aVar3 = aVar2;
        Object objPost$default = aVar3.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i2 = aVar3.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objPost$default);
            JSONObject jSONObjectPut = new JSONObject().put("subscription", com.gamericefishpro.space.wg.b.INSTANCE.convertToJSON(hVar));
            Intrinsics.b(jSONObjectPut);
            aVar3.label = 1;
            objPost$default = com.gamericefishpro.space.xc.b.post$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/subscriptions", jSONObjectPut, null, aVar3, 4, null);
            if (objPost$default == aVar4) {
                return aVar4;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objPost$default);
        }
        com.gamericefishpro.space.xc.a aVar5 = (com.gamericefishpro.space.xc.a) objPost$default;
        if (!aVar5.isSuccess()) {
            throw new com.gamericefishpro.space.ec.a(aVar5.getStatusCode(), aVar5.getPayload(), aVar5.getRetryAfterSeconds());
        }
        String payload = aVar5.getPayload();
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        JSONObject jSONObjectSafeJSONObject = jSONObject != null ? com.gamericefishpro.space.yb.d.safeJSONObject(jSONObject, "subscription") : null;
        if (jSONObjectSafeJSONObject == null || !jSONObjectSafeJSONObject.has("id")) {
            return null;
        }
        String strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject, "ryw_token");
        return new Pair(jSONObjectSafeJSONObject.getString("id"), strSafeString != null ? new com.gamericefishpro.space.zb.b(strSafeString, com.gamericefishpro.space.yb.d.safeLong(jSONObject, "ryw_delay")) : null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.vg.c
    public Object deleteSubscription(String str, String str2, com.gamericefishpro.space.th.a aVar) throws com.gamericefishpro.space.ec.a {
        b bVar;
        if (aVar instanceof b) {
            bVar = (b) aVar;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar);
            }
        } else {
            bVar = new b(aVar);
        }
        b bVar2 = bVar;
        Object objDelete$default = bVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objDelete$default);
            bVar2.label = 1;
            objDelete$default = com.gamericefishpro.space.xc.b.delete$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2, null, bVar2, 2, null);
            if (objDelete$default == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objDelete$default);
        }
        com.gamericefishpro.space.xc.a aVar3 = (com.gamericefishpro.space.xc.a) objDelete$default;
        if (aVar3.isSuccess()) {
            return Unit.a;
        }
        throw new com.gamericefishpro.space.ec.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.vg.c
    public Object getIdentityFromSubscription(String str, String str2, com.gamericefishpro.space.th.a aVar) throws com.gamericefishpro.space.ec.a {
        C0072c c0072c;
        Map<String, Object> map;
        if (aVar instanceof C0072c) {
            c0072c = (C0072c) aVar;
            int i = c0072c.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0072c.label = i - Integer.MIN_VALUE;
            } else {
                c0072c = new C0072c(aVar);
            }
        } else {
            c0072c = new C0072c(aVar);
        }
        C0072c c0072c2 = c0072c;
        Object obj = c0072c2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0072c2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            c0072c2.label = 1;
            obj = com.gamericefishpro.space.xc.b.get$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/user/identity", null, c0072c2, 2, null);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
        }
        com.gamericefishpro.space.xc.a aVar3 = (com.gamericefishpro.space.xc.a) obj;
        if (!aVar3.isSuccess()) {
            throw new com.gamericefishpro.space.ec.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
        }
        String payload = aVar3.getPayload();
        Intrinsics.b(payload);
        JSONObject jSONObjectSafeJSONObject = com.gamericefishpro.space.yb.d.safeJSONObject(new JSONObject(payload), "identity");
        if (jSONObjectSafeJSONObject == null || (map = com.gamericefishpro.space.yb.d.toMap(jSONObjectSafeJSONObject)) == null) {
            return m0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(l0.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.vg.c
    public Object transferSubscription(String str, String str2, String str3, String str4, com.gamericefishpro.space.th.a aVar) throws JSONException, com.gamericefishpro.space.ec.a {
        d dVar;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        d dVar2 = dVar;
        Object objPatch$default = dVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = dVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objPatch$default);
            JSONObject jSONObjectPut = new JSONObject().put("identity", new JSONObject().put(str3, str4));
            Intrinsics.b(jSONObjectPut);
            dVar2.label = 1;
            objPatch$default = com.gamericefishpro.space.xc.b.patch$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2 + "/owner", jSONObjectPut, null, dVar2, 4, null);
            if (objPatch$default == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objPatch$default);
        }
        com.gamericefishpro.space.xc.a aVar3 = (com.gamericefishpro.space.xc.a) objPatch$default;
        if (aVar3.isSuccess()) {
            return Unit.a;
        }
        throw new com.gamericefishpro.space.ec.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.vg.c
    public Object updateSubscription(String str, String str2, h hVar, com.gamericefishpro.space.th.a aVar) throws JSONException, com.gamericefishpro.space.ec.a {
        e eVar;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i = eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.label = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(aVar);
            }
        } else {
            eVar = new e(aVar);
        }
        e eVar2 = eVar;
        Object objPatch$default = eVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = eVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objPatch$default);
            JSONObject jSONObjectPut = new JSONObject().put("subscription", com.gamericefishpro.space.wg.b.INSTANCE.convertToJSON(hVar));
            Intrinsics.b(jSONObjectPut);
            eVar2.label = 1;
            objPatch$default = com.gamericefishpro.space.xc.b.patch$default(this._httpClient, "apps/" + str + "/subscriptions/" + str2, jSONObjectPut, null, eVar2, 4, null);
            if (objPatch$default == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objPatch$default);
        }
        com.gamericefishpro.space.xc.a aVar3 = (com.gamericefishpro.space.xc.a) objPatch$default;
        if (!aVar3.isSuccess()) {
            throw new com.gamericefishpro.space.ec.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
        }
        String payload = aVar3.getPayload();
        JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
        String strSafeString = jSONObject != null ? com.gamericefishpro.space.yb.d.safeString(jSONObject, "ryw_token") : null;
        Long lSafeLong = jSONObject != null ? com.gamericefishpro.space.yb.d.safeLong(jSONObject, "ryw_delay") : null;
        if (strSafeString != null) {
            return new com.gamericefishpro.space.zb.b(strSafeString, lSafeLong);
        }
        return null;
    }
}
