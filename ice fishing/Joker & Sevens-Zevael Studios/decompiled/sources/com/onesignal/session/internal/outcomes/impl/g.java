package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONObject;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g implements b {
    private final w8.c _http;

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
            return g.this.sendOutcomeEvent(null, null, null, null, null, null, this);
        }
    }

    public g(w8.c cVar) {
        pc.j.e(cVar, "_http");
        this._http = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.onesignal.session.internal.outcomes.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, e eVar, fc.d dVar) {
        a aVar;
        int i10;
        w8.a aVar2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.label = i11 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                i10 = aVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    JSONObject put = new JSONObject().put("app_id", str).put("onesignal_id", str2).put("subscription", new JSONObject().put("id", str3).put(com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY, str4));
                    if (bool != null) {
                        put.put(bb.e.DIRECT_TAG, bool.booleanValue());
                    }
                    if (eVar.getNotificationIds() != null && eVar.getNotificationIds().length() > 0) {
                        put.put(bb.e.NOTIFICATIONS_IDS, eVar.getNotificationIds());
                    }
                    put.put("id", eVar.getName());
                    if (eVar.getWeight() > 0.0f) {
                        put.put("weight", new Float(eVar.getWeight()));
                    }
                    if (eVar.getTimestamp() > 0) {
                        put.put("timestamp", eVar.getTimestamp());
                    }
                    if (eVar.getSessionTime() > 0) {
                        put.put("session_time", eVar.getSessionTime());
                    }
                    w8.c cVar = this._http;
                    aVar.label = 1;
                    obj = w8.b.post$default(cVar, "outcomes/measure", put, null, aVar, 4, null);
                    gc.a aVar3 = gc.a.f2559g;
                    if (obj == aVar3) {
                        return aVar3;
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
                return ac.o.f277a;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.result;
        i10 = aVar.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
