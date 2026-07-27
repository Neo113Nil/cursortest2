package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Oe, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2704Oe {

    /* renamed from: a, reason: collision with root package name */
    public final List f26706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26707b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26708c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f26709d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f26710e;

    /* renamed from: f, reason: collision with root package name */
    public final String f26711f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26712g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f26713h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final long f26714j;

    /* renamed from: k, reason: collision with root package name */
    public final long f26715k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26716l;

    /* renamed from: m, reason: collision with root package name */
    public final String f26717m;

    public C2704Oe(JSONObject jSONObject) {
        this.f26711f = jSONObject.optString("url");
        this.f26707b = jSONObject.optString("base_uri");
        this.f26708c = jSONObject.optString("post_parameters");
        this.f26709d = a(jSONObject.optString("drt_include"));
        this.f26717m = jSONObject.optString("content_type");
        this.f26716l = a(jSONObject.optString("use_compression"));
        this.f26710e = a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f26706a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f26712g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f26713h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
        String optString2 = jSONObject.optString(com.anythink.core.common.d.g.f12486a);
        Long l9 = -1L;
        if (!TextUtils.isEmpty(optString2)) {
            try {
                l9 = Long.valueOf(optString2);
            } catch (NumberFormatException unused) {
            }
        }
        this.f26714j = l9.longValue();
        String optString3 = jSONObject.optString(com.anythink.core.common.d.g.f12487b);
        Long l10 = -1L;
        if (!TextUtils.isEmpty(optString3)) {
            try {
                l10 = Long.valueOf(optString3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f26715k = l10.longValue();
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
