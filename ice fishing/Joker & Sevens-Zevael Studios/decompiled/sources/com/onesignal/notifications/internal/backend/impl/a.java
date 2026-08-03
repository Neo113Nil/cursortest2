package com.onesignal.notifications.internal.backend.impl;

import ac.o;
import fc.d;
import org.json.JSONObject;
import pc.j;
import w8.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements fa.a {
    private final c _httpClient;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0048a extends hc.c {
        int label;
        /* synthetic */ Object result;

        public C0048a(d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsOpened(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        int label;
        /* synthetic */ Object result;

        public b(d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsReceived(null, null, null, null, this);
        }
    }

    public a(c cVar) {
        j.e(cVar, "_httpClient");
        this._httpClient = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // fa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsOpened(String str, String str2, String str3, v8.a aVar, d dVar) {
        C0048a c0048a;
        int i10;
        w8.a aVar2;
        if (dVar instanceof C0048a) {
            c0048a = (C0048a) dVar;
            int i11 = c0048a.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0048a.label = i11 - Integer.MIN_VALUE;
                C0048a c0048a2 = c0048a;
                Object obj = c0048a2.result;
                i10 = c0048a2.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", str);
                    jSONObject.put("player_id", str3);
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", aVar.getValue());
                    c0048a2.label = 1;
                    obj = w8.b.put$default(this._httpClient, "notifications/" + str2, jSONObject, null, c0048a2, 4, null);
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
                return o.f277a;
            }
        }
        c0048a = new C0048a(dVar);
        C0048a c0048a22 = c0048a;
        Object obj2 = c0048a22.result;
        i10 = c0048a22.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // fa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsReceived(String str, String str2, String str3, v8.a aVar, d dVar) {
        b bVar;
        int i10;
        w8.a aVar2;
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
                    JSONObject put = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", aVar.getValue());
                    j.d(put, "JSONObject()\n           …_type\", deviceType.value)");
                    c cVar = this._httpClient;
                    String j3 = a4.d.j("notifications/", str2, "/report_received");
                    bVar2.label = 1;
                    obj = w8.b.put$default(cVar, j3, put, null, bVar2, 4, null);
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
                return o.f277a;
            }
        }
        bVar = new b(dVar);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        i10 = bVar22.label;
        if (i10 != 0) {
        }
        aVar2 = (w8.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
