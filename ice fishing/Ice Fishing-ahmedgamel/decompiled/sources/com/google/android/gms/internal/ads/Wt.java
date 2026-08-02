package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Wt {

    /* renamed from: a, reason: collision with root package name */
    public final String f29208a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29209b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f29210c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f29211d;

    public Wt(JsonReader jsonReader) {
        JSONObject r9 = d6.c.r(jsonReader);
        this.f29211d = r9;
        this.f29208a = r9.optString(com.anythink.expressad.foundation.d.d.f19366c, null);
        this.f29209b = r9.optString("ad_base_url", null);
        this.f29210c = r9.optJSONObject("ad_json");
    }
}
