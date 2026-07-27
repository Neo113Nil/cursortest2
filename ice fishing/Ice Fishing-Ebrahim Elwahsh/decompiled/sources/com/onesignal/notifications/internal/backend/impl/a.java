package com.onesignal.notifications.internal.backend.impl;

import A4.c;
import D.y;
import com.bumptech.glide.f;
import h5.InterfaceC4569a;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import p4.C4860a;
import q7.v;
import t0.AbstractC5051n;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import y4.EnumC5252a;

/* loaded from: classes2.dex */
public final class a implements InterfaceC4569a {
    private final c _httpClient;

    /* renamed from: com.onesignal.notifications.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0226a extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public C0226a(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.updateNotificationAsOpened(null, null, null, null, this);
        }
    }

    public static final class b extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
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
    @Override // h5.InterfaceC4569a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsOpened(String str, String str2, String str3, EnumC5252a enumC5252a, InterfaceC5133d interfaceC5133d) {
        C0226a c0226a;
        int i;
        A4.a aVar;
        if (interfaceC5133d instanceof C0226a) {
            c0226a = (C0226a) interfaceC5133d;
            int i4 = c0226a.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0226a.label = i4 - Integer.MIN_VALUE;
                C0226a c0226a2 = c0226a;
                Object obj = c0226a2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0226a2.label;
                if (i != 0) {
                    f.r(obj);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", str);
                    jSONObject.put("player_id", str3);
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", enumC5252a.getValue());
                    c cVar = this._httpClient;
                    String f6 = AbstractC5051n.f("notifications/", str2);
                    c0226a2.label = 1;
                    obj = A4.b.put$default(cVar, f6, jSONObject, null, c0226a2, 4, null);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                aVar = (A4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C4860a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return v.f40183a;
            }
        }
        c0226a = new C0226a(interfaceC5133d);
        C0226a c0226a22 = c0226a;
        Object obj2 = c0226a22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0226a22.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // h5.InterfaceC4569a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateNotificationAsReceived(String str, String str2, String str3, EnumC5252a enumC5252a, InterfaceC5133d interfaceC5133d) {
        b bVar;
        int i;
        A4.a aVar;
        if (interfaceC5133d instanceof b) {
            bVar = (b) interfaceC5133d;
            int i4 = bVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                bVar.label = i4 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = bVar2.label;
                if (i != 0) {
                    f.r(obj);
                    JSONObject put = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", enumC5252a.getValue());
                    h.d(put, "put(...)");
                    c cVar = this._httpClient;
                    String k6 = y.k("notifications/", str2, "/report_received");
                    bVar2.label = 1;
                    obj = A4.b.put$default(cVar, k6, put, null, bVar2, 4, null);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.r(obj);
                }
                aVar = (A4.a) obj;
                if (aVar.isSuccess()) {
                    throw new C4860a(aVar.getStatusCode(), aVar.getPayload(), aVar.getRetryAfterSeconds());
                }
                return v.f40183a;
            }
        }
        bVar = new b(interfaceC5133d);
        b bVar22 = bVar;
        Object obj2 = bVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = bVar22.label;
        if (i != 0) {
        }
        aVar = (A4.a) obj2;
        if (aVar.isSuccess()) {
        }
    }
}
