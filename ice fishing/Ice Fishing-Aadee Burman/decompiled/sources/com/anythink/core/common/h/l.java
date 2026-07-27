package com.anythink.core.common.h;

import com.anythink.core.common.e.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int f13977a = 10;

    /* renamed from: b, reason: collision with root package name */
    private int f13978b;

    /* renamed from: c, reason: collision with root package name */
    private int f13979c;

    /* renamed from: d, reason: collision with root package name */
    private int f13980d;

    /* renamed from: e, reason: collision with root package name */
    private long f13981e;

    /* renamed from: f, reason: collision with root package name */
    private int f13982f;

    /* renamed from: g, reason: collision with root package name */
    private int f13983g;

    /* renamed from: h, reason: collision with root package name */
    private long f13984h;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f13985a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f13986b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f13987c = 3;
    }

    private l() {
    }

    public static l a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        long optLong = jSONObject.optLong("req_pacing");
        if (optLong <= 0) {
            return null;
        }
        l lVar = new l();
        int optInt = jSONObject.optInt("id");
        if (optInt == 1) {
            lVar.f13979c = jSONObject.optInt("req_no_fill_nc");
        } else if (optInt == 2) {
            lVar.f13980d = jSONObject.optInt("req_no_fill_s");
            lVar.f13981e = jSONObject.optLong("req_no_fill_sgt");
        } else {
            if (optInt != 3) {
                return null;
            }
            lVar.f13982f = jSONObject.optInt("req_no_fill_sr");
            lVar.f13981e = jSONObject.optLong("req_no_fill_sgt");
            lVar.f13983g = jSONObject.optInt(a.C0077a.f12915n, 10);
        }
        lVar.f13978b = optInt;
        lVar.f13984h = optLong;
        if (lVar.f13979c > 0 || lVar.f13980d > 0 || lVar.f13981e > 0 || lVar.f13982f > 0 || optLong > 0) {
            return lVar;
        }
        return null;
    }

    public final int b() {
        return this.f13979c;
    }

    public final int c() {
        return this.f13980d;
    }

    public final long d() {
        return this.f13981e;
    }

    public final int e() {
        return this.f13982f;
    }

    public final long f() {
        return this.f13984h;
    }

    public final int g() {
        return this.f13983g;
    }

    public final String toString() {
        return "AdSourceFltRuleEntity{id=" + this.f13978b + ", reqNoFillNc=" + this.f13979c + ", reqNoFillS=" + this.f13980d + ", reqNoFillSgtTime=" + this.f13981e + ", reqNoFillSr=" + this.f13982f + ", reqPacingTime=" + this.f13984h + '}';
    }

    private void b(int i) {
        this.f13979c = i;
    }

    private void c(int i) {
        this.f13980d = i;
    }

    private void d(int i) {
        this.f13982f = i;
    }

    private void e(int i) {
        this.f13983g = i;
    }

    private void b(long j6) {
        this.f13984h = j6;
    }

    public final int a() {
        return this.f13978b;
    }

    private void a(int i) {
        this.f13978b = i;
    }

    private void a(long j6) {
        this.f13981e = j6;
    }
}
