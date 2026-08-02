package com.anythink.core.c.a;

import D.x;
import android.text.TextUtils;
import com.anythink.core.common.k;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12796a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12797b = 4;

    /* renamed from: c, reason: collision with root package name */
    private int f12798c;

    /* renamed from: d, reason: collision with root package name */
    private String f12799d;

    /* renamed from: e, reason: collision with root package name */
    private String f12800e;

    /* renamed from: f, reason: collision with root package name */
    private int f12801f;

    /* renamed from: g, reason: collision with root package name */
    private String f12802g;

    /* renamed from: h, reason: collision with root package name */
    private String f12803h;
    private double i;

    /* renamed from: j, reason: collision with root package name */
    private long f12804j;

    /* renamed from: k, reason: collision with root package name */
    private String f12805k;

    /* renamed from: l, reason: collision with root package name */
    private int f12806l;

    public final int a() {
        return this.f12806l;
    }

    public final String b() {
        return this.f12800e;
    }

    public final int c() {
        return this.f12801f;
    }

    public final String d() {
        return this.f12802g;
    }

    public final String e() {
        return this.f12803h;
    }

    public final double f() {
        return this.i;
    }

    public final long g() {
        return this.f12804j;
    }

    public final String h() {
        return this.f12805k;
    }

    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject, "req_id", this.f12800e);
            a(jSONObject, "unit_id", this.f12802g);
            a(jSONObject, "dsp_id", this.f12803h);
            a(jSONObject, k.f15071H, Double.valueOf(this.i));
            a(jSONObject, "ts", Long.valueOf(this.f12804j));
            a(jSONObject, "lc_id", this.f12805k);
            a(jSONObject, "nw_firm_id", Integer.valueOf(this.f12801f));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String j() {
        return this.f12799d;
    }

    public final int k() {
        return this.f12798c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacementStatisticsBean{requestId='");
        sb.append(this.f12800e);
        sb.append("', networkFirmId=");
        sb.append(this.f12801f);
        sb.append(", adSourceId='");
        sb.append(this.f12802g);
        sb.append("', dspId='");
        sb.append(this.f12803h);
        sb.append("', price=");
        sb.append(this.i);
        sb.append(", recordTime=");
        sb.append(this.f12804j);
        sb.append(", psId='");
        sb.append(this.f12805k);
        sb.append("', placementId='");
        sb.append(this.f12799d);
        sb.append("', type= ");
        sb.append(this.f12798c);
        sb.append("', segmentId= ");
        return x.n(sb, this.f12806l, '}');
    }

    public final void a(int i) {
        this.f12806l = i;
    }

    public final void b(int i) {
        this.f12801f = i;
    }

    public final void c(String str) {
        this.f12803h = str;
    }

    public final void d(String str) {
        this.f12805k = str;
    }

    public final void e(String str) {
        this.f12799d = str;
    }

    public final void a(String str) {
        this.f12800e = str;
    }

    public final void b(String str) {
        this.f12802g = str;
    }

    public final void c(int i) {
        this.f12798c = i;
    }

    public final void a(double d9) {
        this.i = d9;
    }

    public final void a(long j6) {
        this.f12804j = j6;
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
        if (str.equals(k.f15071H)) {
            jSONObject.put(str, String.valueOf(obj));
        } else {
            jSONObject.put(str, obj);
        }
    }
}
