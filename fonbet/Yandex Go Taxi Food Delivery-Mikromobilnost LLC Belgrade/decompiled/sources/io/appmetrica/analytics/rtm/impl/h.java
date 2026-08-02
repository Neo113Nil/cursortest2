package io.appmetrica.analytics.rtm.impl;

import com.yandex.browser.rtm.ErrorLevel;
import com.yandex.browser.rtm.Silent;
import defpackage.b5i0;
import defpackage.f5i0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.y4i0;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class h extends e {
    public final String c;
    public final Boolean d;

    public h(JSONObject jSONObject, String str, Boolean bool) {
        super(jSONObject);
        this.c = str;
        this.d = bool;
    }

    @Override // io.appmetrica.analytics.rtm.impl.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(b5i0 b5i0Var) {
        String optStringOrNull = JsonUtils.optStringOrNull(this.a, "stacktrace");
        if (optStringOrNull != null) {
            b5i0Var.r = optStringOrNull;
        }
        String optStringOrNull2 = JsonUtils.optStringOrNull(this.a, "level");
        ErrorLevel errorLevel = "info".equals(optStringOrNull2) ? ErrorLevel.INFO : "debug".equals(optStringOrNull2) ? ErrorLevel.DEBUG : "warn".equals(optStringOrNull2) ? ErrorLevel.WARN : "error".equals(optStringOrNull2) ? ErrorLevel.ERROR : "fatal".equals(optStringOrNull2) ? ErrorLevel.FATAL : null;
        if (errorLevel != null) {
            b5i0Var.t = errorLevel;
        }
        JSONObject jSONObject = this.a;
        Silent silent = jSONObject.has("silent") ? jSONObject.optBoolean("silent") ? Silent.TRUE : Silent.FALSE : null;
        if (silent == null) {
            Boolean bool = this.d;
            silent = bool == null ? null : bool.booleanValue() ? Silent.TRUE : Silent.FALSE;
        }
        if (silent != null) {
            b5i0Var.u = silent;
        }
        String optStringOrNull3 = JsonUtils.optStringOrNull(this.a, "url");
        if (optStringOrNull3 != null) {
            b5i0Var.v = optStringOrNull3;
        }
        String optStringOrNull4 = JsonUtils.optStringOrNull(this.a, "table");
        if (optStringOrNull4 != null) {
            b5i0Var.y = optStringOrNull4;
        }
        String optStringOrNull5 = JsonUtils.optStringOrNull(this.a, "requestId");
        if (optStringOrNull5 != null) {
            b5i0Var.w = optStringOrNull5;
        }
        JSONObject optJSONObject = this.a.optJSONObject("genericVariables");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next, null);
                b5i0Var.getClass();
                if (jl40.A(next)) {
                    ny61.g("Key must not be empty");
                    return;
                }
                if (b5i0Var.z == null) {
                    b5i0Var.z = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap = b5i0Var.z;
                if (linkedHashMap == null) {
                    linkedHashMap = null;
                }
                linkedHashMap.put(next, optString);
            }
        }
    }

    public final b5i0 b(f5i0 f5i0Var) {
        return f5i0Var.a(this.c);
    }

    public final y4i0 a(f5i0 f5i0Var) {
        return f5i0Var.a(this.c);
    }
}
