package com.anythink.core.c.a;

import D.y;
import android.text.TextUtils;
import com.anythink.core.common.k;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12167a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12168b = 4;

    /* renamed from: c, reason: collision with root package name */
    private int f12169c;

    /* renamed from: d, reason: collision with root package name */
    private String f12170d;

    /* renamed from: e, reason: collision with root package name */
    private String f12171e;

    /* renamed from: f, reason: collision with root package name */
    private int f12172f;

    /* renamed from: g, reason: collision with root package name */
    private String f12173g;

    /* renamed from: h, reason: collision with root package name */
    private String f12174h;
    private double i;

    /* renamed from: j, reason: collision with root package name */
    private long f12175j;

    /* renamed from: k, reason: collision with root package name */
    private String f12176k;

    /* renamed from: l, reason: collision with root package name */
    private int f12177l;

    public final int a() {
        return this.f12177l;
    }

    public final String b() {
        return this.f12171e;
    }

    public final int c() {
        return this.f12172f;
    }

    public final String d() {
        return this.f12173g;
    }

    public final String e() {
        return this.f12174h;
    }

    public final double f() {
        return this.i;
    }

    public final long g() {
        return this.f12175j;
    }

    public final String h() {
        return this.f12176k;
    }

    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject, "req_id", this.f12171e);
            a(jSONObject, "unit_id", this.f12173g);
            a(jSONObject, "dsp_id", this.f12174h);
            a(jSONObject, k.f14442H, Double.valueOf(this.i));
            a(jSONObject, "ts", Long.valueOf(this.f12175j));
            a(jSONObject, "lc_id", this.f12176k);
            a(jSONObject, "nw_firm_id", Integer.valueOf(this.f12172f));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String j() {
        return this.f12170d;
    }

    public final int k() {
        return this.f12169c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacementStatisticsBean{requestId='");
        sb.append(this.f12171e);
        sb.append("', networkFirmId=");
        sb.append(this.f12172f);
        sb.append(", adSourceId='");
        sb.append(this.f12173g);
        sb.append("', dspId='");
        sb.append(this.f12174h);
        sb.append("', price=");
        sb.append(this.i);
        sb.append(", recordTime=");
        sb.append(this.f12175j);
        sb.append(", psId='");
        sb.append(this.f12176k);
        sb.append("', placementId='");
        sb.append(this.f12170d);
        sb.append("', type= ");
        sb.append(this.f12169c);
        sb.append("', segmentId= ");
        return y.m(sb, this.f12177l, '}');
    }

    public final void a(int i) {
        this.f12177l = i;
    }

    public final void b(int i) {
        this.f12172f = i;
    }

    public final void c(String str) {
        this.f12174h = str;
    }

    public final void d(String str) {
        this.f12176k = str;
    }

    public final void e(String str) {
        this.f12170d = str;
    }

    public final void a(String str) {
        this.f12171e = str;
    }

    public final void b(String str) {
        this.f12173g = str;
    }

    public final void c(int i) {
        this.f12169c = i;
    }

    public final void a(double d2) {
        this.i = d2;
    }

    public final void a(long j9) {
        this.f12175j = j9;
    }

    private static void a(JSONObject jSONObject, String str, Object obj) {
        if (obj == null || TextUtils.isEmpty(str)) {
            return;
        }
        if ((obj instanceof String) && ((String) obj).isEmpty()) {
            return;
        }
        if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
            return;
        }
        if ((obj instanceof Long) && ((Long) obj).longValue() == 0) {
            return;
        }
        if ((obj instanceof Double) && ((Double) obj).doubleValue() == 0.0d) {
            return;
        }
        if (str.equals(k.f14442H)) {
            jSONObject.put(str, String.valueOf(obj));
        } else {
            jSONObject.put(str, obj);
        }
    }
}
