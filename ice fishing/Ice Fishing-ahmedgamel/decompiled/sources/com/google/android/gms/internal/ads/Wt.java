package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Wt {

    /* renamed from: a, reason: collision with root package name */
    public final String f28426a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28427b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f28428c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f28429d;

    public Wt(JsonReader jsonReader) {
        JSONObject J = A8.b.J(jsonReader);
        this.f28429d = J;
        this.f28426a = J.optString(com.anythink.expressad.foundation.d.d.f18579c, null);
        this.f28427b = J.optString("ad_base_url", null);
        this.f28428c = J.optJSONObject("ad_json");
    }
}
