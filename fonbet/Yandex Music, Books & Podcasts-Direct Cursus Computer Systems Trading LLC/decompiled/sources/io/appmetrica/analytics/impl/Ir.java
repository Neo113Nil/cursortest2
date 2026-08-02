package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Ir {
    public final Lr a;
    public final Lr b;
    public final Jr c;
    public JSONObject d;

    public Ir(Lr lr, Lr lr2, Jr jr) {
        this.a = lr;
        this.b = lr2;
        this.c = jr;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.d == null) {
                JSONObject a = this.c.a(a(this.a), a(this.b));
                this.d = a;
                a(a);
            }
            jSONObject = this.d;
            if (jSONObject == null) {
                Intrinsics.j("fileContents");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static JSONObject a(Lr lr) {
        try {
            String a = lr.a();
            return a != null ? new JSONObject(a) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.a.a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.b.a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
