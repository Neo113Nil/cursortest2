package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.hb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0388hb {
    public final String a;
    public final int b;
    public final boolean c;

    public C0388hb(JSONObject jSONObject) {
        this.a = jSONObject.getString("name");
        this.c = jSONObject.getBoolean("required");
        this.b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0388hb.class == obj.getClass()) {
            C0388hb c0388hb = (C0388hb) obj;
            if (this.b != c0388hb.b || this.c != c0388hb.c) {
                return false;
            }
            String str = this.a;
            String str2 = c0388hb.a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + (this.c ? 1 : 0);
    }

    public C0388hb(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
