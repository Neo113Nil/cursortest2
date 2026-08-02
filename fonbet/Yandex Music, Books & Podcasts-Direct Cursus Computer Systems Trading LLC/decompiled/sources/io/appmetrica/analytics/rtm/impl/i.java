package io.appmetrica.analytics.rtm.impl;

import androidx.annotation.NonNull;
import defpackage.sen;
import defpackage.ven;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class i extends e {
    public final String c;

    public i(@NonNull JSONObject jSONObject, @NonNull String str) {
        super(jSONObject);
        this.c = str;
    }

    @Override // io.appmetrica.analytics.rtm.impl.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(@NonNull sen senVar) {
        if (this.a.has("loggedIn")) {
            senVar.s = Boolean.valueOf(this.a.optBoolean("loggedIn"));
        }
        String optStringOrNull = JsonUtils.optStringOrNull(this.a, "requestId");
        if (optStringOrNull != null) {
            senVar.t = optStringOrNull;
        }
    }

    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final sen a(@NonNull ven venVar) {
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
            venVar.getClass();
            str.getClass();
            return new sen(str, String.valueOf(i), 3, venVar.b, venVar.a, venVar.c, venVar.d, venVar.e, venVar.g);
        }
        if (c != 1) {
            venVar.getClass();
            str.getClass();
            return new sen(str, optString2, 1, venVar.b, venVar.a, venVar.c, venVar.d, venVar.e, venVar.g);
        }
        if (optString2 != null) {
            try {
                parseFloat = Float.parseFloat(optString2);
            } catch (Throwable unused2) {
            }
            venVar.getClass();
            str.getClass();
            return new sen(str, String.valueOf(parseFloat), 2, venVar.b, venVar.a, venVar.c, venVar.d, venVar.e, venVar.g);
        }
        parseFloat = 0.0f;
        venVar.getClass();
        str.getClass();
        return new sen(str, String.valueOf(parseFloat), 2, venVar.b, venVar.a, venVar.c, venVar.d, venVar.e, venVar.g);
    }

    @NonNull
    public final String a() {
        return this.c;
    }
}
