package io.appmetrica.analytics.impl;

import defpackage.b64;
import defpackage.jl40;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.of, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0594of {
    public final List a;
    public final long b;

    public C0594of(List list, long j) {
        this.a = list;
        this.b = j;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<We> list = this.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (We we : list) {
                we.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", we.a);
                    jSONObject.put("loaded", we.b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0594of)) {
            return false;
        }
        C0594of c0594of = (C0594of) obj;
        return jl40.l(this.a, c0594of.a) && this.b == c0594of.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModulesStatus(modulesStatus=");
        sb.append(this.a);
        sb.append(", lastSendTime=");
        return b64.o(sb, this.b, ')');
    }
}
