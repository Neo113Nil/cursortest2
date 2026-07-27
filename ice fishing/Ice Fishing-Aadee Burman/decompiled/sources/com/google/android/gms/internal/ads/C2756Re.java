package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Re, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2756Re {

    /* renamed from: a, reason: collision with root package name */
    public final List f27292a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27293b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27294c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27295d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27296e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27297f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27298g;

    /* renamed from: h, reason: collision with root package name */
    public final JSONObject f27299h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final long f27300j;

    /* renamed from: k, reason: collision with root package name */
    public final long f27301k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f27302l;

    /* renamed from: m, reason: collision with root package name */
    public final String f27303m;

    public C2756Re(JSONObject jSONObject) {
        this.f27297f = jSONObject.optString("url");
        this.f27293b = jSONObject.optString("base_uri");
        this.f27294c = jSONObject.optString("post_parameters");
        this.f27295d = a(jSONObject.optString("drt_include"));
        this.f27303m = jSONObject.optString("content_type");
        this.f27302l = a(jSONObject.optString("use_compression"));
        this.f27296e = a(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String optString = jSONObject.optString("errors");
        this.f27292a = optString == null ? null : Arrays.asList(optString.split(","));
        this.f27298g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f27299h = optJSONObject == null ? new JSONObject() : optJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.i = jSONObject.optString("pool_key");
        String optString2 = jSONObject.optString(com.anythink.core.common.d.g.f12329a);
        Long l9 = -1L;
        if (!TextUtils.isEmpty(optString2)) {
            try {
                l9 = Long.valueOf(optString2);
            } catch (NumberFormatException unused) {
            }
        }
        this.f27300j = l9.longValue();
        String optString3 = jSONObject.optString(com.anythink.core.common.d.g.f12330b);
        Long l10 = -1L;
        if (!TextUtils.isEmpty(optString3)) {
            try {
                l10 = Long.valueOf(optString3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.f27301k = l10.longValue();
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }
}
