package com.yandex.passport.sloth.command;

import defpackage.dfi;
import defpackage.irf;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class a implements s {
    public final boolean a;

    public a(boolean z) {
        this.a = z;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        irf.G(jSONObject, "status", String.valueOf(this.a));
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return dfi.j(new StringBuilder("BooleanResult(data="), this.a, ')');
    }
}
