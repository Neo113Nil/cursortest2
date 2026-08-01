package com.onesignal.session.internal.outcomes.impl;

import org.json.JSONObject;
import t4.C5040a;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class g implements b {
    private final E4.c _http;

    public static final class a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return g.this.sendOutcomeEvent(null, null, null, null, null, null, this);
        }
    }

    public g(E4.c _http) {
        kotlin.jvm.internal.h.e(_http, "_http");
        this._http = _http;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendOutcomeEvent(String str, String str2, String str3, String str4, Boolean bool, e eVar, InterfaceC5267d interfaceC5267d) {
        a aVar;
        int i;
        E4.a aVar2;
        if (interfaceC5267d instanceof a) {
            aVar = (a) interfaceC5267d;
            int i6 = aVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.label = i6 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                A7.a aVar3 = A7.a.f58n;
                i = aVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    JSONObject put = new JSONObject().put("app_id", str).put("onesignal_id", str2).put("subscription", new JSONObject().put("id", str3).put("type", str4));
                    if (bool != null) {
                        put.put(L5.e.DIRECT_TAG, bool.booleanValue());
                    }
                    if (eVar.getNotificationIds() != null && eVar.getNotificationIds().length() > 0) {
                        put.put(L5.e.NOTIFICATIONS_IDS, eVar.getNotificationIds());
                    }
                    put.put("id", eVar.getName());
                    if (eVar.getWeight() > 0.0f) {
                        put.put("weight", new Float(eVar.getWeight()));
                    }
                    if (eVar.getTimestamp() > 0) {
                        put.put(com.anythink.expressad.foundation.d.d.f18596u, eVar.getTimestamp());
                    }
                    if (eVar.getSessionTime() > 0) {
                        put.put("session_time", eVar.getSessionTime());
                    }
                    E4.c cVar = this._http;
                    aVar.label = 1;
                    obj = E4.b.post$default(cVar, "outcomes/measure", put, null, aVar, 4, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
                aVar2 = (E4.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C5040a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                return v.f41353a;
            }
        }
        aVar = new a(interfaceC5267d);
        Object obj2 = aVar.result;
        A7.a aVar32 = A7.a.f58n;
        i = aVar.label;
        if (i != 0) {
        }
        aVar2 = (E4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
