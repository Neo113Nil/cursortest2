package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f13959a;

    /* renamed from: b, reason: collision with root package name */
    public long f13960b;

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f13959a = jSONObject.optInt("number");
            this.f13960b = jSONObject.optLong("loadTime");
        } catch (Exception unused) {
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("number", this.f13959a);
            jSONObject.put("loadTime", this.f13960b);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }
}
