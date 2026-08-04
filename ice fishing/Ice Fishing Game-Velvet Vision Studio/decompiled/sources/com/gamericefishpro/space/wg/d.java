package com.gamericefishpro.space.wg;

import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.vg.e;
import com.gamericefishpro.space.vg.f;
import com.gamericefishpro.space.vg.h;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.vg.d {
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
            return d.this.createUser(null, null, null, null, this);
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
            return d.this.getUser(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.updateUser(null, null, null, null, false, null, this);
        }
    }

    public d(com.gamericefishpro.space.xc.c _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.vg.d
    public Object createUser(String str, Map<String, String> map, List<h> list, Map<String, String> map2, com.gamericefishpro.space.th.a aVar) throws JSONException, com.gamericefishpro.space.ec.a {
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
            JSONObject jSONObject = new JSONObject();
            if (!map.isEmpty()) {
                jSONObject.put("identity", com.gamericefishpro.space.yb.d.putMap(new JSONObject(), map));
            }
            if (!list.isEmpty()) {
                jSONObject.put("subscriptions", com.gamericefishpro.space.wg.b.INSTANCE.convertToJSON(list));
            }
            if (!map2.isEmpty()) {
                jSONObject.put("properties", com.gamericefishpro.space.yb.d.putMap(new JSONObject(), map2));
            }
            jSONObject.put("refresh_device_metadata", true);
            com.gamericefishpro.space.xc.c cVar = this._httpClient;
            String strG = y0.g("apps/", str, "/users");
            aVar3.label = 1;
            objPost$default = com.gamericefishpro.space.xc.b.post$default(cVar, strG, jSONObject, null, aVar3, 4, null);
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
        com.gamericefishpro.space.wg.b bVar = com.gamericefishpro.space.wg.b.INSTANCE;
        String payload = aVar5.getPayload();
        Intrinsics.b(payload);
        return bVar.convertToCreateUserResponse(new JSONObject(payload));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.vg.d
    public Object getUser(String str, String str2, String str3, com.gamericefishpro.space.th.a aVar) throws com.gamericefishpro.space.ec.a {
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
        Object obj = bVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            bVar2.label = 1;
            obj = com.gamericefishpro.space.xc.b.get$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, null, bVar2, 2, null);
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
        if (aVar3.isSuccess()) {
            return com.gamericefishpro.space.wg.b.INSTANCE.convertToCreateUserResponse(new JSONObject(aVar3.getPayload()));
        }
        throw new com.gamericefishpro.space.ec.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.vg.d
    public Object updateUser(String str, String str2, String str3, f fVar, boolean z, e eVar, com.gamericefishpro.space.th.a aVar) throws JSONException, com.gamericefishpro.space.ec.a {
        c cVar;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(aVar);
            }
        } else {
            cVar = new c(aVar);
        }
        Object objPatch$default = cVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objPatch$default);
            JSONObject jSONObjectPut = new JSONObject().put("refresh_device_metadata", z);
            if (fVar.getHasAtLeastOnePropertySet()) {
                jSONObjectPut.put("properties", com.gamericefishpro.space.wg.b.INSTANCE.convertToJSON(fVar));
            }
            if (eVar.getHasAtLeastOnePropertySet()) {
                jSONObjectPut.put("deltas", com.gamericefishpro.space.wg.b.INSTANCE.convertToJSON(eVar));
            }
            Intrinsics.b(jSONObjectPut);
            cVar.label = 1;
            objPatch$default = com.gamericefishpro.space.xc.b.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3, jSONObjectPut, null, cVar, 4, null);
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
