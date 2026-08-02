package io.appmetrica.analytics.impl;

import defpackage.jl40;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0251ci implements InterfaceC0299e9 {
    public final String a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final EnumC0271d9 e;

    public C0251ci(String str, JSONObject jSONObject, boolean z, boolean z2, EnumC0271d9 enumC0271d9) {
        this.a = str;
        this.b = jSONObject;
        this.c = z;
        this.d = z2;
        this.e = enumC0271d9;
    }

    public static C0251ci a(JSONObject jSONObject) {
        EnumC0271d9 enumC0271d9;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        EnumC0271d9.b.getClass();
        EnumC0271d9[] values = EnumC0271d9.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                enumC0271d9 = null;
                break;
            }
            enumC0271d9 = values[i];
            if (jl40.l(enumC0271d9.a, optStringOrNull2)) {
                break;
            }
            i++;
        }
        if (enumC0271d9 == null) {
            enumC0271d9 = EnumC0271d9.c;
        }
        return new C0251ci(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, enumC0271d9);
    }

    public final JSONObject b() {
        if (!this.c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.a);
            if (this.b.length() > 0) {
                jSONObject.put("additionalParams", this.b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.a);
            jSONObject.put("additionalParams", this.b);
            jSONObject.put("wasSet", this.c);
            jSONObject.put("autoTracking", this.d);
            jSONObject.put("source", this.e.a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.a + "', additionalParameters=" + this.b + ", wasSet=" + this.c + ", autoTrackingEnabled=" + this.d + ", source=" + this.e + '}';
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0299e9
    public final EnumC0271d9 a() {
        return this.e;
    }
}
