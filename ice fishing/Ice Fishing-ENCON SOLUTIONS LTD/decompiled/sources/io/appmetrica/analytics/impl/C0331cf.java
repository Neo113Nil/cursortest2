package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331cf {

    /* renamed from: a, reason: collision with root package name */
    public final String f5747a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f5748b;

    /* renamed from: c, reason: collision with root package name */
    public final S7 f5749c;

    public C0331cf(String str, JSONObject jSONObject, S7 s7) {
        this.f5747a = str;
        this.f5748b = jSONObject;
        this.f5749c = s7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f5747a + "', additionalParams=" + this.f5748b + ", source=" + this.f5749c + '}';
    }
}
