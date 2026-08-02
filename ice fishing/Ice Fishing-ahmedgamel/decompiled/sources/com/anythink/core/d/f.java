package com.anythink.core.d;

import D.x;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private int f18059a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f18060b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f18061c = 3;

    /* renamed from: d, reason: collision with root package name */
    private int f18062d = 1;

    /* renamed from: e, reason: collision with root package name */
    private double f18063e = 2.0d;

    /* renamed from: f, reason: collision with root package name */
    private int f18064f = 3;

    /* renamed from: g, reason: collision with root package name */
    private int[] f18065g;

    /* renamed from: h, reason: collision with root package name */
    private String f18066h;

    public final int a() {
        return this.f18059a;
    }

    public final int b() {
        return this.f18060b;
    }

    public final int c() {
        return this.f18061c;
    }

    public final int d() {
        return this.f18062d;
    }

    public final double e() {
        return this.f18063e;
    }

    public final int f() {
        return this.f18064f;
    }

    public final int[] g() {
        return this.f18065g;
    }

    public final String h() {
        return this.f18066h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicWaterfallStrategy{limitSegmentSwitch=");
        sb.append(this.f18059a);
        sb.append(", latestDay=");
        sb.append(this.f18060b);
        sb.append(", maxCollectCount=");
        sb.append(this.f18061c);
        sb.append(", minCollectCount=");
        sb.append(this.f18062d);
        sb.append(", premiumRate=");
        sb.append(this.f18063e);
        sb.append(", premiumLevel=");
        return x.n(sb, this.f18064f, '}');
    }

    public static f a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f fVar = new f();
            fVar.f18059a = jSONObject.optInt("limit_sw", 1);
            fVar.f18060b = jSONObject.optInt("latest_day", 0);
            fVar.f18061c = jSONObject.optInt("max_n", 3);
            fVar.f18062d = jSONObject.optInt("min_m", 1);
            fVar.f18063e = jSONObject.optDouble("premium_rate", 2.0d);
            fVar.f18064f = jSONObject.optInt("premium_level", 3);
            JSONArray optJSONArray = jSONObject.optJSONArray("not_filter_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                fVar.f18066h = optJSONArray.toString();
                fVar.f18065g = new int[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    fVar.f18065g[i] = optJSONArray.optInt(i);
                }
            }
            return fVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
