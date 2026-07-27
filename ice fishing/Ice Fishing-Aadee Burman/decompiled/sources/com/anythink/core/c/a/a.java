package com.anythink.core.c.a;

import D.y;
import android.text.TextUtils;
import com.anythink.core.common.k;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12010a = 10;

    /* renamed from: b, reason: collision with root package name */
    public static final int f12011b = 4;

    /* renamed from: c, reason: collision with root package name */
    private int f12012c;

    /* renamed from: d, reason: collision with root package name */
    private String f12013d;

    /* renamed from: e, reason: collision with root package name */
    private String f12014e;

    /* renamed from: f, reason: collision with root package name */
    private int f12015f;

    /* renamed from: g, reason: collision with root package name */
    private String f12016g;

    /* renamed from: h, reason: collision with root package name */
    private String f12017h;
    private double i;

    /* renamed from: j, reason: collision with root package name */
    private long f12018j;

    /* renamed from: k, reason: collision with root package name */
    private String f12019k;

    /* renamed from: l, reason: collision with root package name */
    private int f12020l;

    public final int a() {
        return this.f12020l;
    }

    public final String b() {
        return this.f12014e;
    }

    public final int c() {
        return this.f12015f;
    }

    public final String d() {
        return this.f12016g;
    }

    public final String e() {
        return this.f12017h;
    }

    public final double f() {
        return this.i;
    }

    public final long g() {
        return this.f12018j;
    }

    public final String h() {
        return this.f12019k;
    }

    public final JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        try {
            a(jSONObject, "req_id", this.f12014e);
            a(jSONObject, "unit_id", this.f12016g);
            a(jSONObject, "dsp_id", this.f12017h);
            a(jSONObject, k.f14285H, Double.valueOf(this.i));
            a(jSONObject, "ts", Long.valueOf(this.f12018j));
            a(jSONObject, "lc_id", this.f12019k);
            a(jSONObject, "nw_firm_id", Integer.valueOf(this.f12015f));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public final String j() {
        return this.f12013d;
    }

    public final int k() {
        return this.f12012c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacementStatisticsBean{requestId='");
        sb.append(this.f12014e);
        sb.append("', networkFirmId=");
        sb.append(this.f12015f);
        sb.append(", adSourceId='");
        sb.append(this.f12016g);
        sb.append("', dspId='");
        sb.append(this.f12017h);
        sb.append("', price=");
        sb.append(this.i);
        sb.append(", recordTime=");
        sb.append(this.f12018j);
        sb.append(", psId='");
        sb.append(this.f12019k);
        sb.append("', placementId='");
        sb.append(this.f12013d);
        sb.append("', type= ");
        sb.append(this.f12012c);
        sb.append("', segmentId= ");
        return y.q(sb, this.f12020l, '}');
    }

    public final void a(int i) {
        this.f12020l = i;
    }

    public final void b(int i) {
        this.f12015f = i;
    }

    public final void c(String str) {
        this.f12017h = str;
    }

    public final void d(String str) {
        this.f12019k = str;
    }

    public final void e(String str) {
        this.f12013d = str;
    }

    public final void a(String str) {
        this.f12014e = str;
    }

    public final void b(String str) {
        this.f12016g = str;
    }

    public final void c(int i) {
        this.f12012c = i;
    }

    public final void a(double d2) {
        this.i = d2;
    }

    public final void a(long j6) {
        this.f12018j = j6;
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
        if (str.equals(k.f14285H)) {
            jSONObject.put(str, String.valueOf(obj));
        } else {
            jSONObject.put(str, obj);
        }
    }
}
