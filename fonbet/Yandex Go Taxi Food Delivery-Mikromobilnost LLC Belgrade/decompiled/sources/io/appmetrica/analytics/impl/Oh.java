package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class Oh {
    public final String a;
    public final JSONObject b;
    public final EnumC0271d9 c;

    public Oh(String str, JSONObject jSONObject, EnumC0271d9 enumC0271d9) {
        this.a = str;
        this.b = jSONObject;
        this.c = enumC0271d9;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.a + "', additionalParams=" + this.b + ", source=" + this.c + '}';
    }
}
