package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class R9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4991a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4992b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4993c;

    public R9(JSONObject jSONObject) {
        this.f4991a = jSONObject.getString("name");
        this.f4993c = jSONObject.getBoolean("required");
        this.f4992b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || R9.class != obj.getClass()) {
            return false;
        }
        R9 r9 = (R9) obj;
        if (this.f4992b != r9.f4992b || this.f4993c != r9.f4993c) {
            return false;
        }
        String str = this.f4991a;
        String str2 = r9.f4991a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public final int hashCode() {
        String str = this.f4991a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f4992b) * 31) + (this.f4993c ? 1 : 0);
    }

    public R9(String str, int i2, boolean z2) {
        this.f4991a = str;
        this.f4992b = i2;
        this.f4993c = z2;
    }
}
