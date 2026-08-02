package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f14745a;

    /* renamed from: b, reason: collision with root package name */
    public long f14746b;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14745a = jSONObject.optInt("number");
            this.f14746b = jSONObject.optLong("loadTime");
        } catch (Exception unused) {
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("number", this.f14745a);
            jSONObject.put("loadTime", this.f14746b);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
