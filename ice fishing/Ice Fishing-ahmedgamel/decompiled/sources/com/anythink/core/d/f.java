package com.anythink.core.d;

import D.y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private int f17272a = 1;

    /* renamed from: b, reason: collision with root package name */
    private int f17273b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f17274c = 3;

    /* renamed from: d, reason: collision with root package name */
    private int f17275d = 1;

    /* renamed from: e, reason: collision with root package name */
    private double f17276e = 2.0d;

    /* renamed from: f, reason: collision with root package name */
    private int f17277f = 3;

    /* renamed from: g, reason: collision with root package name */
    private int[] f17278g;

    /* renamed from: h, reason: collision with root package name */
    private String f17279h;

    public final int a() {
        return this.f17272a;
    }

    public final int b() {
        return this.f17273b;
    }

    public final int c() {
        return this.f17274c;
    }

    public final int d() {
        return this.f17275d;
    }

    public final double e() {
        return this.f17276e;
    }

    public final int f() {
        return this.f17277f;
    }

    public final int[] g() {
        return this.f17278g;
    }

    public final String h() {
        return this.f17279h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicWaterfallStrategy{limitSegmentSwitch=");
        sb.append(this.f17272a);
        sb.append(", latestDay=");
        sb.append(this.f17273b);
        sb.append(", maxCollectCount=");
        sb.append(this.f17274c);
        sb.append(", minCollectCount=");
        sb.append(this.f17275d);
        sb.append(", premiumRate=");
        sb.append(this.f17276e);
        sb.append(", premiumLevel=");
        return y.q(sb, this.f17277f, '}');
    }

    public static f a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f fVar = new f();
            fVar.f17272a = jSONObject.optInt("limit_sw", 1);
            fVar.f17273b = jSONObject.optInt("latest_day", 0);
            fVar.f17274c = jSONObject.optInt("max_n", 3);
            fVar.f17275d = jSONObject.optInt("min_m", 1);
            fVar.f17276e = jSONObject.optDouble("premium_rate", 2.0d);
            fVar.f17277f = jSONObject.optInt("premium_level", 3);
            JSONArray optJSONArray = jSONObject.optJSONArray("not_filter_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                fVar.f17279h = optJSONArray.toString();
                fVar.f17278g = new int[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    fVar.f17278g[i] = optJSONArray.optInt(i);
                }
            }
            return fVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
