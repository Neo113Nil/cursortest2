package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class bs {
    public final es a;
    public final es b;
    public final cs c;
    public JSONObject d;

    public bs(es esVar, es esVar2, cs csVar) {
        this.a = esVar;
        this.b = esVar2;
        this.c = csVar;
    }

    public static JSONObject b(es esVar) {
        try {
            String b = esVar.b();
            return b != null ? new JSONObject(b) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.d == null) {
                JSONObject a = this.c.a(b(this.a), b(this.b));
                this.d = a;
                a(a);
            }
            jSONObject = this.d;
            if (jSONObject == null) {
                jSONObject = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
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

    public static void a(es esVar) {
        try {
            esVar.flushAsync();
        } catch (Throwable unused) {
        }
    }
}
