package io.appmetrica.analytics.rtm.impl;

import com.yandex.browser.rtm.EventValueType;
import defpackage.c5i0;
import defpackage.f5i0;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class i extends e {
    public final String c;

    public i(JSONObject jSONObject, String str) {
        super(jSONObject);
        this.c = str;
    }

    @Override // io.appmetrica.analytics.rtm.impl.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(c5i0 c5i0Var) {
        if (this.a.has("loggedIn")) {
            c5i0Var.t = Boolean.valueOf(this.a.optBoolean("loggedIn"));
        }
        String optStringOrNull = JsonUtils.optStringOrNull(this.a, "requestId");
        if (optStringOrNull != null) {
            c5i0Var.u = optStringOrNull;
        }
        JSONObject optJSONObject = this.a.optJSONObject("customVars");
        if (optJSONObject != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, optJSONObject.optString(next, null));
            }
            c5i0Var.v = hashMap;
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c5i0 a(f5i0 f5i0Var) {
        char c;
        float parseFloat;
        String optString = this.a.optString("eventValueType", "STRING");
        String optString2 = this.a.optString("eventValue", null);
        int hashCode = optString.hashCode();
        int i = 0;
        if (hashCode == -1838656495) {
            if (optString.equals("STRING")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 72655) {
            if (hashCode == 66988604 && optString.equals("FLOAT")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (optString.equals("INT")) {
                c = 0;
            }
            c = 65535;
        }
        String str = this.c;
        if (c == 0) {
            if (optString2 != null) {
                try {
                    i = Integer.parseInt(optString2);
                } catch (Throwable unused) {
                }
            }
            f5i0Var.getClass();
            return new c5i0(str, String.valueOf(i), EventValueType.INTEGER, f5i0Var.b, f5i0Var.a, f5i0Var.c, f5i0Var.d, f5i0Var.e, f5i0Var.g, f5i0Var.h);
        }
        if (c != 1) {
            f5i0Var.getClass();
            return new c5i0(str, optString2, EventValueType.STRING, f5i0Var.b, f5i0Var.a, f5i0Var.c, f5i0Var.d, f5i0Var.e, f5i0Var.g, f5i0Var.h);
        }
        if (optString2 != null) {
            try {
                parseFloat = Float.parseFloat(optString2);
            } catch (Throwable unused2) {
            }
            f5i0Var.getClass();
            return new c5i0(str, String.valueOf(parseFloat), EventValueType.FLOAT, f5i0Var.b, f5i0Var.a, f5i0Var.c, f5i0Var.d, f5i0Var.e, f5i0Var.g, f5i0Var.h);
        }
        parseFloat = 0.0f;
        f5i0Var.getClass();
        return new c5i0(str, String.valueOf(parseFloat), EventValueType.FLOAT, f5i0Var.b, f5i0Var.a, f5i0Var.c, f5i0Var.d, f5i0Var.e, f5i0Var.g, f5i0Var.h);
    }

    public final String a() {
        return this.c;
    }
}
