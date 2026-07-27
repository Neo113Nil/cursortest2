package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Yt {

    /* renamed from: a, reason: collision with root package name */
    public final String f28906a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28907b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f28908c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f28909d;

    public Yt(JsonReader jsonReader) {
        JSONObject r9 = p8.g.r(jsonReader);
        this.f28909d = r9;
        this.f28906a = r9.optString(com.anythink.expressad.foundation.d.d.f18737c, null);
        this.f28907b = r9.optString("ad_base_url", null);
        this.f28908c = r9.optJSONObject("ad_json");
    }
}
