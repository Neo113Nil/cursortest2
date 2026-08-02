package com.yandex.passport.sloth.command;

import defpackage.dfi;
import io.appmetrica.analytics.rtm.internal.Constants;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class w implements s {
    public final String a;

    public w(String str) {
        this.a = str;
    }

    @Override // com.yandex.passport.sloth.command.s
    public final String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.KEY_VALUE, this.a);
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a.equals(((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("StringResult(data="), this.a, ')');
    }
}
