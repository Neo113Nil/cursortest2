package com.gamericefishpro.space.wg;

import com.gamericefishpro.space.ph.l0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.vg.b {
    private final com.gamericefishpro.space.xc.c _httpClient;

    /* JADX INFO: renamed from: com.gamericefishpro.space.wg.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0070a extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public C0070a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.deleteAlias(null, null, null, null, this);
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
            return a.this.setAlias(null, null, null, null, this);
        }
    }

    public a(com.gamericefishpro.space.xc.c _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.vg.b
    public Object deleteAlias(String str, String str2, String str3, String str4, com.gamericefishpro.space.th.a aVar) throws com.gamericefishpro.space.ec.a {
        C0070a c0070a;
        if (aVar instanceof C0070a) {
            c0070a = (C0070a) aVar;
            int i = c0070a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0070a.label = i - Integer.MIN_VALUE;
            } else {
                c0070a = new C0070a(aVar);
            }
        } else {
            c0070a = new C0070a(aVar);
        }
        C0070a c0070a2 = c0070a;
        Object objDelete$default = c0070a2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0070a2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objDelete$default);
            com.gamericefishpro.space.xc.c cVar = this._httpClient;
            StringBuilder sb = new StringBuilder("apps/");
            sb.append(str);
            sb.append("/users/by/");
            sb.append(str2);
            sb.append('/');
            String strJ = com.gamericefishpro.space.m5.a.j(sb, str3, "/identity/", str4);
            c0070a2.label = 1;
            objDelete$default = com.gamericefishpro.space.xc.b.delete$default(cVar, strJ, null, c0070a2, 2, null);
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
    @Override // com.gamericefishpro.space.vg.b
    public Object setAlias(String str, String str2, String str3, Map<String, String> map, com.gamericefishpro.space.th.a aVar) throws JSONException, com.gamericefishpro.space.ec.a {
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
        Object objPatch$default = bVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objPatch$default);
            JSONObject jSONObjectPut = new JSONObject().put("identity", com.gamericefishpro.space.yb.d.putMap(new JSONObject(), map));
            Intrinsics.b(jSONObjectPut);
            bVar2.label = 1;
            objPatch$default = com.gamericefishpro.space.xc.b.patch$default(this._httpClient, "apps/" + str + "/users/by/" + str2 + '/' + str3 + "/identity", jSONObjectPut, null, bVar2, 4, null);
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
        Intrinsics.b(payload);
        JSONObject jSONObject = new JSONObject(payload).getJSONObject("identity");
        Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
        Map<String, Object> map2 = com.gamericefishpro.space.yb.d.toMap(jSONObject);
        LinkedHashMap linkedHashMap = new LinkedHashMap(l0.a(map2.size()));
        Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return linkedHashMap;
    }
}
