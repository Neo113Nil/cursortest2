package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.yo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0909yo {

    /* renamed from: a, reason: collision with root package name */
    public final Bo f7261a;

    /* renamed from: b, reason: collision with root package name */
    public final Bo f7262b;

    /* renamed from: c, reason: collision with root package name */
    public final zo f7263c;

    /* renamed from: d, reason: collision with root package name */
    public JSONObject f7264d;

    public C0909yo(Bo bo, Bo bo2, zo zoVar) {
        this.f7261a = bo;
        this.f7262b = bo2;
        this.f7263c = zoVar;
    }

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f7264d == null) {
                JSONObject a2 = this.f7263c.a(a(this.f7261a), a(this.f7262b));
                this.f7264d = a2;
                a(a2);
            }
            jSONObject = this.f7264d;
            if (jSONObject == null) {
                kotlin.jvm.internal.i.i("fileContents");
                throw null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public static JSONObject a(Bo bo) {
        try {
            String a2 = bo.a();
            return a2 != null ? new JSONObject(a2) : new JSONObject();
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public final synchronized void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        try {
            this.f7261a.a(jSONObject2);
        } catch (Throwable unused) {
        }
        try {
            this.f7262b.a(jSONObject2);
        } catch (Throwable unused2) {
        }
    }
}
