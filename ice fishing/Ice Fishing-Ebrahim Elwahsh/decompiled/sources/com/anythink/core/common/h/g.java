package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f14116a;

    /* renamed from: b, reason: collision with root package name */
    public long f14117b;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f14116a = jSONObject.optInt("number");
            this.f14117b = jSONObject.optLong("loadTime");
        } catch (Exception unused) {
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("number", this.f14116a);
            jSONObject.put("loadTime", this.f14117b);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
