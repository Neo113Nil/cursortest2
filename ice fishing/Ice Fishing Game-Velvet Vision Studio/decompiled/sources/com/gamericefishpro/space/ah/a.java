package com.gamericefishpro.space.ah;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.zg.a {
    private final com.gamericefishpro.space.xc.c httpClient;

    /* JADX INFO: renamed from: com.gamericefishpro.space.ah.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0002a extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public C0002a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendCustomEvent(null, null, null, 0L, null, null, null, this);
        }
    }

    public a(com.gamericefishpro.space.xc.c httpClient) {
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.zg.a
    public Object sendCustomEvent(String str, String str2, String str3, long j, String str4, String str5, c cVar, com.gamericefishpro.space.th.a aVar) throws JSONException, com.gamericefishpro.space.ec.a {
        C0002a c0002a;
        if (aVar instanceof C0002a) {
            c0002a = (C0002a) aVar;
            int i = c0002a.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0002a.label = i - Integer.MIN_VALUE;
            } else {
                c0002a = new C0002a(aVar);
            }
        } else {
            c0002a = new C0002a(aVar);
        }
        Object objPost$default = c0002a.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = c0002a.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objPost$default);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", str4);
            jSONObject.put("onesignal_id", str2);
            if (str3 != null) {
                jSONObject.put("external_id", str3);
            }
            SimpleDateFormat simpleDateFormatIso8601Format = com.gamericefishpro.space.yb.a.INSTANCE.iso8601Format();
            simpleDateFormatIso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
            Unit unit = Unit.a;
            jSONObject.put("timestamp", simpleDateFormatIso8601Format.format(new Long(j)));
            JSONObject jSONObject2 = str5 != null ? new JSONObject(str5) : new JSONObject();
            jSONObject2.put("os_sdk", cVar.toJSONObject());
            jSONObject.put("payload", jSONObject2);
            JSONObject jSONObjectPut = new JSONObject().put("events", new JSONArray().put(jSONObject));
            Intrinsics.b(jSONObjectPut);
            c0002a.label = 1;
            objPost$default = com.gamericefishpro.space.xc.b.post$default(this.httpClient, "apps/" + str + "/custom_events", jSONObjectPut, null, c0002a, 4, null);
            if (objPost$default == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(objPost$default);
        }
        com.gamericefishpro.space.xc.a aVar3 = (com.gamericefishpro.space.xc.a) objPost$default;
        if (aVar3.isSuccess()) {
            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
        }
        throw new com.gamericefishpro.space.ec.a(aVar3.getStatusCode(), aVar3.getPayload(), aVar3.getRetryAfterSeconds());
    }
}
