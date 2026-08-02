package com.anythink.core.common.h;

import com.anythink.core.common.e.a;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final int f14763a = 10;

    /* renamed from: b, reason: collision with root package name */
    private int f14764b;

    /* renamed from: c, reason: collision with root package name */
    private int f14765c;

    /* renamed from: d, reason: collision with root package name */
    private int f14766d;

    /* renamed from: e, reason: collision with root package name */
    private long f14767e;

    /* renamed from: f, reason: collision with root package name */
    private int f14768f;

    /* renamed from: g, reason: collision with root package name */
    private int f14769g;

    /* renamed from: h, reason: collision with root package name */
    private long f14770h;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f14771a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f14772b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f14773c = 3;
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
            lVar.f14765c = jSONObject.optInt("req_no_fill_nc");
        } else if (optInt == 2) {
            lVar.f14766d = jSONObject.optInt("req_no_fill_s");
            lVar.f14767e = jSONObject.optLong("req_no_fill_sgt");
        } else {
            if (optInt != 3) {
                return null;
            }
            lVar.f14768f = jSONObject.optInt("req_no_fill_sr");
            lVar.f14767e = jSONObject.optLong("req_no_fill_sgt");
            lVar.f14769g = jSONObject.optInt(a.C0077a.f13701n, 10);
        }
        lVar.f14764b = optInt;
        lVar.f14770h = optLong;
        if (lVar.f14765c > 0 || lVar.f14766d > 0 || lVar.f14767e > 0 || lVar.f14768f > 0 || optLong > 0) {
            return lVar;
        }
        return null;
    }

    public final int b() {
        return this.f14765c;
    }

    public final int c() {
        return this.f14766d;
    }

    public final long d() {
        return this.f14767e;
    }

    public final int e() {
        return this.f14768f;
    }

    public final long f() {
        return this.f14770h;
    }

    public final int g() {
        return this.f14769g;
    }

    public final String toString() {
        return "AdSourceFltRuleEntity{id=" + this.f14764b + ", reqNoFillNc=" + this.f14765c + ", reqNoFillS=" + this.f14766d + ", reqNoFillSgtTime=" + this.f14767e + ", reqNoFillSr=" + this.f14768f + ", reqPacingTime=" + this.f14770h + '}';
    }

    private void b(int i) {
        this.f14765c = i;
    }

    private void c(int i) {
        this.f14766d = i;
    }

    private void d(int i) {
        this.f14768f = i;
    }

    private void e(int i) {
        this.f14769g = i;
    }

    private void b(long j6) {
        this.f14770h = j6;
    }

    public final int a() {
        return this.f14764b;
    }

    private void a(int i) {
        this.f14764b = i;
    }

    private void a(long j6) {
        this.f14767e = j6;
    }
}
