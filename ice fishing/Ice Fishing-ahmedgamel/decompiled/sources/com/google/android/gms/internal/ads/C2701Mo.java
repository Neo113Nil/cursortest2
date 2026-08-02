package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Mo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2701Mo {

    /* renamed from: a, reason: collision with root package name */
    public final String f27118a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27119b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27120c;

    /* renamed from: d, reason: collision with root package name */
    public final int f27121d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27122e;

    /* renamed from: f, reason: collision with root package name */
    public final int f27123f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27124g;

    public C2701Mo(String str, String str2, String str3, int i, String str4, int i4, boolean z6) {
        this.f27118a = str;
        this.f27119b = str2;
        this.f27120c = str3;
        this.f27121d = i;
        this.f27122e = str4;
        this.f27123f = i4;
        this.f27124g = z6;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f27118a);
        jSONObject.put(com.anythink.expressad.foundation.g.a.i, this.f27120c);
        C3324ha c3324ha = AbstractC3592ma.Ga;
        s2.r rVar = s2.r.f40506e;
        if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f27119b);
        }
        jSONObject.put("status", this.f27121d);
        jSONObject.put("description", this.f27122e);
        jSONObject.put("initializationLatencyMillis", this.f27123f);
        if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Ha)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f27124g);
        }
        return jSONObject;
    }
}
