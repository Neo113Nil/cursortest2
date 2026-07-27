package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Lo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2664Lo {

    /* renamed from: a, reason: collision with root package name */
    public final String f26172a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26173b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26174c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26175d;

    /* renamed from: e, reason: collision with root package name */
    public final String f26176e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26177f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f26178g;

    public C2664Lo(String str, String str2, String str3, int i, String str4, int i6, boolean z3) {
        this.f26172a = str;
        this.f26173b = str2;
        this.f26174c = str3;
        this.f26175d = i;
        this.f26176e = str4;
        this.f26177f = i6;
        this.f26178g = z3;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adapterClassName", this.f26172a);
        jSONObject.put(com.anythink.expressad.foundation.g.a.i, this.f26174c);
        C3301ha c3301ha = AbstractC3569ma.Ga;
        q2.r rVar = q2.r.f40204e;
        if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            jSONObject.put("sdkVersion", this.f26173b);
        }
        jSONObject.put("status", this.f26175d);
        jSONObject.put("description", this.f26176e);
        jSONObject.put("initializationLatencyMillis", this.f26177f);
        if (((Boolean) rVar.f40207c.a(AbstractC3569ma.Ha)).booleanValue()) {
            jSONObject.put("supportsInitialization", this.f26178g);
        }
        return jSONObject;
    }
}
