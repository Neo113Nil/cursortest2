package com.onesignal.notifications.internal.backend.impl;

import D.x;
import E4.c;
import kotlin.jvm.internal.h;
import l5.InterfaceC4677a;
import org.json.JSONObject;
import t4.C5041a;
import u7.v;
import w.AbstractC5128c;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a implements InterfaceC4677a {
    private final c _httpClient;

    /* renamed from: com.onesignal.notifications.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0227a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public C0227a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsOpened(null, null, null, null, this);
        }
    }

    public static final class b extends B7.c {
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsReceived(null, null, null, null, this);
        }
    }

    public a(c _httpClient) {
        h.e(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // l5.InterfaceC4677a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsOpened(String str, String str2, String str3, C4.a aVar, InterfaceC5240d interfaceC5240d) {
        C0227a c0227a;
        int i;
        E4.a aVar2;
        if (interfaceC5240d instanceof C0227a) {
            c0227a = (C0227a) interfaceC5240d;
            int i4 = c0227a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0227a.label = i4 - Integer.MIN_VALUE;
                C0227a c0227a2 = c0227a;
                Object obj = c0227a2.result;
                A7.a aVar3 = A7.a.f215n;
                i = c0227a2.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", str);
                    jSONObject.put("player_id", str3);
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", aVar.getValue());
                    c cVar = this._httpClient;
                    String f2 = AbstractC5128c.f("notifications/", str2);
                    c0227a2.label = 1;
                    obj = E4.b.put$default(cVar, f2, jSONObject, null, c0227a2, 4, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                aVar2 = (E4.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C5041a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                return v.f41073a;
            }
        }
        c0227a = new C0227a(interfaceC5240d);
        C0227a c0227a22 = c0227a;
        Object obj2 = c0227a22.result;
        A7.a aVar32 = A7.a.f215n;
        i = c0227a22.label;
        if (i != 0) {
        }
        aVar2 = (E4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // l5.InterfaceC4677a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsReceived(String str, String str2, String str3, C4.a aVar, InterfaceC5240d interfaceC5240d) {
        b bVar;
        int i;
        E4.a aVar2;
        if (interfaceC5240d instanceof b) {
            bVar = (b) interfaceC5240d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                A7.a aVar3 = A7.a.f215n;
                i = bVar2.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    JSONObject put = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", aVar.getValue());
                    h.d(put, "put(...)");
                    c cVar = this._httpClient;
                    String l9 = x.l("notifications/", str2, "/report_received");
                    bVar2.label = 1;
                    obj = E4.b.put$default(cVar, l9, put, null, bVar2, 4, null);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                aVar2 = (E4.a) obj;
                if (aVar2.isSuccess()) {
                    throw new C5041a(aVar2.getStatusCode(), aVar2.getPayload(), aVar2.getRetryAfterSeconds());
                }
                return v.f41073a;
            }
        }
        bVar = new b(interfaceC5240d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        A7.a aVar32 = A7.a.f215n;
        i = bVar22.label;
        if (i != 0) {
        }
        aVar2 = (E4.a) obj2;
        if (aVar2.isSuccess()) {
        }
    }
}
