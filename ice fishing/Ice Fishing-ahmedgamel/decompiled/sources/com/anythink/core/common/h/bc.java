package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    int f13611a;

    /* renamed from: b, reason: collision with root package name */
    boolean f13612b;

    /* renamed from: c, reason: collision with root package name */
    String f13613c;

    /* renamed from: d, reason: collision with root package name */
    boolean f13614d;

    private bc() {
    }

    public static bc a(boolean z3, String str, boolean z6) {
        bc bcVar = new bc();
        bcVar.f13611a = 1;
        bcVar.f13612b = z3;
        bcVar.f13613c = str;
        bcVar.f13614d = z6;
        return bcVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("from", this.f13611a);
            jSONObject.put("is_playend", this.f13612b ? 1 : 2);
            jSONObject.put("url", this.f13613c);
            jSONObject.put("status", this.f13614d ? 1 : 2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
