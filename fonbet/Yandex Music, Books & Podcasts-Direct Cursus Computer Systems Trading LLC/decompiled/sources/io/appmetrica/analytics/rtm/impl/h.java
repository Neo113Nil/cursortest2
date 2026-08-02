package io.appmetrica.analytics.rtm.impl;

import androidx.annotation.NonNull;
import defpackage.lsq;
import defpackage.qen;
import defpackage.ren;
import defpackage.ven;
import defpackage.xq0;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class h extends e {
    public final String c;
    public final Boolean d;

    public h(@NonNull JSONObject jSONObject, @NonNull String str, Boolean bool) {
        super(jSONObject);
        this.c = str;
        this.d = bool;
    }

    @Override // io.appmetrica.analytics.rtm.impl.e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(@NonNull ren renVar) {
        String optStringOrNull = JsonUtils.optStringOrNull(this.a, "stacktrace");
        if (optStringOrNull != null) {
            renVar.q = optStringOrNull;
        }
        String optStringOrNull2 = JsonUtils.optStringOrNull(this.a, "level");
        int i = 0;
        int i2 = "info".equals(optStringOrNull2) ? 1 : "debug".equals(optStringOrNull2) ? 2 : "warn".equals(optStringOrNull2) ? 3 : "error".equals(optStringOrNull2) ? 4 : "fatal".equals(optStringOrNull2) ? 5 : 0;
        if (i2 != 0) {
            renVar.s = i2;
        }
        JSONObject jSONObject = this.a;
        int i3 = jSONObject.has("silent") ? jSONObject.optBoolean("silent") ? 1 : 2 : 0;
        if (i3 == 0) {
            Boolean bool = this.d;
            if (bool != null) {
                i = bool.booleanValue() ? 1 : 2;
            }
        } else {
            i = i3;
        }
        if (i != 0) {
            renVar.t = i;
        }
        String optStringOrNull3 = JsonUtils.optStringOrNull(this.a, "url");
        if (optStringOrNull3 != null) {
            renVar.u = optStringOrNull3;
        }
        String optStringOrNull4 = JsonUtils.optStringOrNull(this.a, "requestId");
        if (optStringOrNull4 != null) {
            renVar.v = optStringOrNull4;
        }
        JSONObject optJSONObject = this.a.optJSONObject("genericVariables");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = optJSONObject.optString(next, null);
                renVar.getClass();
                next.getClass();
                optString.getClass();
                if (lsq.z(next)) {
                    xq0.x("Key must not be empty");
                    return;
                }
                if (renVar.w == null) {
                    renVar.w = new LinkedHashMap();
                }
                LinkedHashMap linkedHashMap = renVar.w;
                if (linkedHashMap == null) {
                    Intrinsics.j("genericVars");
                    throw null;
                }
                linkedHashMap.put(next, optString);
            }
        }
    }

    @NonNull
    public final ren b(@NonNull ven venVar) {
        return venVar.a(this.c);
    }

    @NonNull
    public final qen a(@NonNull ven venVar) {
        return venVar.a(this.c);
    }
}
