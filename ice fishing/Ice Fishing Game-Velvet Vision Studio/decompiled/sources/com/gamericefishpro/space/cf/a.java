package com.gamericefishpro.space.cf;

import com.gamericefishpro.space.t0.y0;
import com.gamericefishpro.space.xc.c;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.bf.a {
    private final c _httpClient;

    /* JADX INFO: renamed from: com.gamericefishpro.space.cf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0006a extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public C0006a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsOpened(null, null, null, null, this);
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
            return a.this.updateNotificationAsReceived(null, null, null, null, this);
        }
    }

    public a(c _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.bf.a
    public Object updateNotificationAsOpened(String str, String str2, String str3, com.gamericefishpro.space.vc.a aVar, com.gamericefishpro.space.th.a aVar2) throws JSONException, com.gamericefishpro.space.ec.a {
        C0006a c0006a;
        if (aVar2 instanceof C0006a) {
            c0006a = (C0006a) aVar2;
            int i = c0006a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0006a.label = i - Integer.MIN_VALUE;
            } else {
                c0006a = new C0006a(aVar2);
            }
        } else {
            c0006a = new C0006a(aVar2);
        }
        C0006a c0006a2 = c0006a;
        Object objPut$default = c0006a2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0006a2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objPut$default);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", str);
            jSONObject.put("player_id", str3);
            jSONObject.put("opened", true);
            jSONObject.put("device_type", aVar.getValue());
            c cVar = this._httpClient;
            String strU = com.gamericefishpro.space.m5.a.u("notifications/", str2);
            c0006a2.label = 1;
            objPut$default = com.gamericefishpro.space.xc.b.put$default(cVar, strU, jSONObject, null, c0006a2, 4, null);
            if (objPut$default == aVar3) {
                return aVar3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objPut$default);
        }
        com.gamericefishpro.space.xc.a aVar4 = (com.gamericefishpro.space.xc.a) objPut$default;
        if (aVar4.isSuccess()) {
            return Unit.a;
        }
        throw new com.gamericefishpro.space.ec.a(aVar4.getStatusCode(), aVar4.getPayload(), aVar4.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.bf.a
    public Object updateNotificationAsReceived(String str, String str2, String str3, com.gamericefishpro.space.vc.a aVar, com.gamericefishpro.space.th.a aVar2) throws JSONException, com.gamericefishpro.space.ec.a {
        b bVar;
        if (aVar2 instanceof b) {
            bVar = (b) aVar2;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar2);
            }
        } else {
            bVar = new b(aVar2);
        }
        b bVar2 = bVar;
        Object objPut$default = bVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objPut$default);
            JSONObject jSONObjectPut = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", aVar.getValue());
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "put(...)");
            c cVar = this._httpClient;
            String strG = y0.g("notifications/", str2, "/report_received");
            bVar2.label = 1;
            objPut$default = com.gamericefishpro.space.xc.b.put$default(cVar, strG, jSONObjectPut, null, bVar2, 4, null);
            if (objPut$default == aVar3) {
                return aVar3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objPut$default);
        }
        com.gamericefishpro.space.xc.a aVar4 = (com.gamericefishpro.space.xc.a) objPut$default;
        if (aVar4.isSuccess()) {
            return Unit.a;
        }
        throw new com.gamericefishpro.space.ec.a(aVar4.getStatusCode(), aVar4.getPayload(), aVar4.getRetryAfterSeconds());
    }
}
