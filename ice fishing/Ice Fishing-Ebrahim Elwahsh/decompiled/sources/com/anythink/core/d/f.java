package com.anythink.core.d;

import D.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private int f17430a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f17431b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f17432c = 3;

    /* renamed from: d, reason: collision with root package name */
    private int f17433d = 1;

    /* renamed from: e, reason: collision with root package name */
    private double f17434e = 2.0d;

    /* renamed from: f, reason: collision with root package name */
    private int f17435f = 3;

    /* renamed from: g, reason: collision with root package name */
    private int[] f17436g;

    /* renamed from: h, reason: collision with root package name */
    private String f17437h;

    public final int a() {
        return this.f17430a;
    }

    public final int b() {
        return this.f17431b;
    }

    public final int c() {
        return this.f17432c;
    }

    public final int d() {
        return this.f17433d;
    }

    public final double e() {
        return this.f17434e;
    }

    public final int f() {
        return this.f17435f;
    }

    public final int[] g() {
        return this.f17436g;
    }

    public final String h() {
        return this.f17437h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicWaterfallStrategy{limitSegmentSwitch=");
        sb.append(this.f17430a);
        sb.append(", latestDay=");
        sb.append(this.f17431b);
        sb.append(", maxCollectCount=");
        sb.append(this.f17432c);
        sb.append(", minCollectCount=");
        sb.append(this.f17433d);
        sb.append(", premiumRate=");
        sb.append(this.f17434e);
        sb.append(", premiumLevel=");
        return y.m(sb, this.f17435f, '}');
    }

    public static f a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f fVar = new f();
            fVar.f17430a = jSONObject.optInt("limit_sw", 1);
            fVar.f17431b = jSONObject.optInt("latest_day", 0);
            fVar.f17432c = jSONObject.optInt("max_n", 3);
            fVar.f17433d = jSONObject.optInt("min_m", 1);
            fVar.f17434e = jSONObject.optDouble("premium_rate", 2.0d);
            fVar.f17435f = jSONObject.optInt("premium_level", 3);
            JSONArray optJSONArray = jSONObject.optJSONArray("not_filter_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                fVar.f17437h = optJSONArray.toString();
                fVar.f17436g = new int[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    fVar.f17436g[i] = optJSONArray.optInt(i);
                }
            }
            return fVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
