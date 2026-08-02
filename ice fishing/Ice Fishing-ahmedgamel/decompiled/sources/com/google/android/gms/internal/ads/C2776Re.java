package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Re, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2776Re {

    /* renamed from: a, reason: collision with root package name */
    public final List f27976a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27977b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27978c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27979d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27980e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27981f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27982g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f27983h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27984j;

    /* renamed from: k, reason: collision with root package name */
    public final long f27985k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27986l;

    /* renamed from: m, reason: collision with root package name */
    public final String f27987m;

    public C2776Re(JSONObject jSONObject) {
        this.f27981f = jSONObject.optString("url");
        this.f27977b = jSONObject.optString("base_uri");
        this.f27978c = jSONObject.optString("post_parameters");
        this.f27979d = a(jSONObject.optString("drt_include"));
        this.f27987m = jSONObject.optString("content_type");
        this.f27986l = a(jSONObject.optString("use_compression"));
        this.f27980e = a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f27976a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f27982g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f27983h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
        String optString2 = jSONObject.optString(com.anythink.core.common.d.g.f13115a);
        Long l9 = -1L;
        if (!TextUtils.isEmpty(optString2)) {
            try {
                l9 = Long.valueOf(optString2);
            } catch (NumberFormatException unused) {
            }
        }
        this.f27984j = l9.longValue();
        String optString3 = jSONObject.optString(com.anythink.core.common.d.g.f13116b);
        Long l10 = -1L;
        if (!TextUtils.isEmpty(optString3)) {
            try {
                l10 = Long.valueOf(optString3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f27985k = l10.longValue();
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
