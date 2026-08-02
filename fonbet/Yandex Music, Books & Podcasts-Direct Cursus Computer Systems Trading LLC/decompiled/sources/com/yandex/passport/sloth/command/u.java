package com.yandex.passport.sloth.command;

import defpackage.k5r;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class u implements s {
    public final Map a;

    public u(Map map) {
        map.getClass();
        this.a = map;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final String a() {
        String jSONObject = new JSONObject(this.a).toString();
        jSONObject.getClass();
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.p(new StringBuilder("MapResult(data="), this.a, ')');
    }
}
