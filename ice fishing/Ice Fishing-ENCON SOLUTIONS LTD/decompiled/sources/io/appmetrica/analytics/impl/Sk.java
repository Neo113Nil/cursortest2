package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Sk {

    /* renamed from: a, reason: collision with root package name */
    public final String f5065a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5066b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5067c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5068d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5069e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5070f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5071g;

    public Sk(JSONObject jSONObject) {
        this.f5065a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f5066b = jSONObject.optString("kitBuildNumber", "");
        this.f5067c = jSONObject.optString("appVer", "");
        this.f5068d = jSONObject.optString("appBuild", "");
        this.f5069e = jSONObject.optString("osVer", "");
        this.f5070f = jSONObject.optInt("osApiLev", -1);
        this.f5071g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f5065a + "', kitBuildNumber='" + this.f5066b + "', appVersion='" + this.f5067c + "', appBuild='" + this.f5068d + "', osVersion='" + this.f5069e + "', apiLevel=" + this.f5070f + ", attributionId=" + this.f5071g + ')';
    }
}
