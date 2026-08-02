package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    int f14397a;

    /* renamed from: b, reason: collision with root package name */
    boolean f14398b;

    /* renamed from: c, reason: collision with root package name */
    String f14399c;

    /* renamed from: d, reason: collision with root package name */
    boolean f14400d;

    private bc() {
    }

    public static bc a(boolean z6, String str, boolean z9) {
        bc bcVar = new bc();
        bcVar.f14397a = 1;
        bcVar.f14398b = z6;
        bcVar.f14399c = str;
        bcVar.f14400d = z9;
        return bcVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f14397a);
            jSONObject.put("is_playend", this.f14398b ? 1 : 2);
            jSONObject.put("url", this.f14399c);
            jSONObject.put("status", this.f14400d ? 1 : 2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
