package com.onesignal.user.internal.customEvents.impl;

import com.bumptech.glide.d;
import com.onesignal.core.internal.http.impl.e;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import kotlin.jvm.internal.h;
import org.json.JSONArray;
import org.json.JSONObject;
import t4.C5040a;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class a implements T5.a {
    private final E4.c httpClient;

    /* renamed from: com.onesignal.user.internal.customEvents.impl.a$a, reason: collision with other inner class name */
    public static final class C0249a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public C0249a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.sendCustomEvent(null, null, null, 0L, null, null, null, null, this);
        }
    }

    public a(E4.c httpClient) {
        h.e(httpClient, "httpClient");
        this.httpClient = httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // T5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object sendCustomEvent(String str, String str2, String str3, long j6, String str4, String str5, c cVar, String str6, InterfaceC5267d interfaceC5267d) {
        C0249a c0249a;
        int i;
        E4.a aVar;
        if (interfaceC5267d instanceof C0249a) {
            c0249a = (C0249a) interfaceC5267d;
            int i6 = c0249a.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c0249a.label = i6 - Integer.MIN_VALUE;
                Object obj = c0249a.result;
                A7.a aVar2 = A7.a.f58n;
                i = c0249a.label;
                if (i != 0) {
                    d.k(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str4);
                    jSONObject.put("onesignal_id", str2);
                    if (str3 != null) {
                        jSONObject.put("external_id", str3);
                    }
                    SimpleDateFormat iso8601Format = com.onesignal.common.b.INSTANCE.iso8601Format();
                    iso8601Format.setTimeZone(TimeZone.getTimeZone("UTC"));
                    jSONObject.put(com.anythink.expressad.foundation.d.d.f18596u, iso8601Format.format(new Long(j6)));
                    JSONObject jSONObject2 = str5 != null ? new JSONObject(str5) : new JSONObject();
                    jSONObject2.put("os_sdk", cVar.toJSONObject());
                    jSONObject.put("payload", jSONObject2);
                    JSONObject put = new JSONObject().put("events", new JSONArray().put(jSONObject));
                    h.b(put);
                    e eVar = new e(null, null, null, null, str6, 15, null);
                    c0249a.label = 1;
                    obj = this.httpClient.post("apps/" + str + "/custom_events", put, eVar, c0249a);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d.k(obj);
                }
                aVar = (E4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C5040a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
            }
        }
        c0249a = new C0249a(interfaceC5267d);
        Object obj2 = c0249a.result;
        A7.a aVar22 = A7.a.f58n;
        i = c0249a.label;
        if (i != 0) {
        }
        aVar = (E4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
