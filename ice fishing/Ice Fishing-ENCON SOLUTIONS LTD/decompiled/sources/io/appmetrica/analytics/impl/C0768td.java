package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768td {

    /* renamed from: a, reason: collision with root package name */
    public final List f6945a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6946b;

    public C0768td(List list, long j2) {
        this.f6945a = list;
        this.f6946b = j2;
    }

    public final String a() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            List<C0303bd> list = this.f6945a;
            ArrayList arrayList = new ArrayList(i1.k.E(list));
            for (C0303bd c0303bd : list) {
                c0303bd.getClass();
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put("moduleName", c0303bd.f5667a);
                    jSONObject.put("loaded", c0303bd.f5668b);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                arrayList.add(jSONObject);
            }
            jSONObject2.put("modulesStatus", new JSONArray((Collection) arrayList));
            jSONObject2.put("lastSendTime", this.f6946b);
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0768td)) {
            return false;
        }
        C0768td c0768td = (C0768td) obj;
        return kotlin.jvm.internal.i.a(this.f6945a, c0768td.f6945a) && this.f6946b == c0768td.f6946b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6946b) + (this.f6945a.hashCode() * 31);
    }

    public final String toString() {
        return "ModulesStatus(modulesStatus=" + this.f6945a + ", lastSendTime=" + this.f6946b + ')';
    }
}
