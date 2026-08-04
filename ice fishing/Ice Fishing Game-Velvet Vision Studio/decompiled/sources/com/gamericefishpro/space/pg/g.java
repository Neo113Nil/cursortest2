package com.gamericefishpro.space.pg;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements b {
    private final com.gamericefishpro.space.xc.c _http;

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
            return g.this.sendOutcomeEvent(null, null, null, null, null, null, this);
        }
    }

    public g(com.gamericefishpro.space.xc.c _http) {
        Intrinsics.checkNotNullParameter(_http, "_http");
        this._http = _http;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.pg.b
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, e eVar, com.gamericefishpro.space.th.a aVar) throws JSONException, com.gamericefishpro.space.ec.a {
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
        Object objPost$default = aVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = aVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objPost$default);
            JSONObject jSONObjectPut = new JSONObject().put("app_id", str).put("onesignal_id", str2).put("subscription", new JSONObject().put("id", str3).put(com.gamericefishpro.space.vd.m.EVENT_TYPE_KEY, str4));
            if (bool != null) {
                jSONObjectPut.put(com.gamericefishpro.space.ng.e.DIRECT_TAG, bool.booleanValue());
            }
            if (eVar.getNotificationIds() != null && eVar.getNotificationIds().length() > 0) {
                jSONObjectPut.put(com.gamericefishpro.space.ng.e.NOTIFICATIONS_IDS, eVar.getNotificationIds());
            }
            jSONObjectPut.put("id", eVar.getName());
            if (eVar.getWeight() > 0.0f) {
                jSONObjectPut.put("weight", new Float(eVar.getWeight()));
            }
            if (eVar.getTimestamp() > 0) {
                jSONObjectPut.put("timestamp", eVar.getTimestamp());
            }
            if (eVar.getSessionTime() > 0) {
                jSONObjectPut.put("session_time", eVar.getSessionTime());
            }
            com.gamericefishpro.space.xc.c cVar = this._http;
            aVar2.label = 1;
            objPost$default = com.gamericefishpro.space.xc.b.post$default(cVar, "outcomes/measure", jSONObjectPut, null, aVar2, 4, null);
            if (objPost$default == aVar3) {
                return aVar3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objPost$default);
        }
        com.gamericefishpro.space.xc.a aVar4 = (com.gamericefishpro.space.xc.a) objPost$default;
        if (aVar4.isSuccess()) {
            return Unit.a;
        }
        throw new com.gamericefishpro.space.ec.a(aVar4.getStatusCode(), aVar4.getPayload(), aVar4.getRetryAfterSeconds());
    }
}
