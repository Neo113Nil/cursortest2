package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Lo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2663Lo {

    /* renamed from: a, reason: collision with root package name */
    public final String f26215a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26216b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26217c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26218d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26219e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26220f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26221g;

    public C2663Lo(String str, String str2, String str3, int i, String str4, int i4, boolean z8) {
        this.f26215a = str;
        this.f26216b = str2;
        this.f26217c = str3;
        this.f26218d = i;
        this.f26219e = str4;
        this.f26220f = i4;
        this.f26221g = z8;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f26215a);
        jSONObject.put(com.anythink.expressad.foundation.g.a.i, this.f26217c);
        C3151ea c3151ea = AbstractC3368ia.Ga;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f26216b);
        }
        jSONObject.put("status", this.f26218d);
        jSONObject.put("description", this.f26219e);
        jSONObject.put("initializationLatencyMillis", this.f26220f);
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Ha)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f26221g);
        }
        return jSONObject;
    }
}
