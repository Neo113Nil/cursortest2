package com.anythink.expressad.foundation.d;

import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18697a = "cid";

    /* renamed from: b, reason: collision with root package name */
    public static final String f18698b = "click_type";

    /* renamed from: c, reason: collision with root package name */
    public static final String f18699c = "network_type";

    /* renamed from: d, reason: collision with root package name */
    public static final String f18700d = "network_str";

    /* renamed from: e, reason: collision with root package name */
    public static final String f18701e = "click_duration";

    /* renamed from: f, reason: collision with root package name */
    public static final String f18702f = "last_url";

    /* renamed from: g, reason: collision with root package name */
    public static final String f18703g = "type";

    /* renamed from: h, reason: collision with root package name */
    public static final String f18704h = "code";
    public static final String i = "exception";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18705j = "header";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18706k = "content";

    /* renamed from: l, reason: collision with root package name */
    public static final String f18707l = "network_type";

    /* renamed from: m, reason: collision with root package name */
    public static final String f18708m = "rid";

    /* renamed from: n, reason: collision with root package name */
    public static final String f18709n = "key";

    /* renamed from: o, reason: collision with root package name */
    public static final String f18710o = "rid_n";

    /* renamed from: p, reason: collision with root package name */
    public static final String f18711p = "unit_id";

    /* renamed from: q, reason: collision with root package name */
    public static final String f18712q = "landing_type";

    /* renamed from: r, reason: collision with root package name */
    public static final String f18713r = "link_type";

    /* renamed from: s, reason: collision with root package name */
    public static final String f18714s = "click_time";

    /* renamed from: t, reason: collision with root package name */
    public static final String f18715t = "market_result";

    /* renamed from: u, reason: collision with root package name */
    public static final String f18716u = "2000013";

    /* renamed from: v, reason: collision with root package name */
    public static final String f18717v = "2000012";

    /* renamed from: A, reason: collision with root package name */
    private String f18718A;

    /* renamed from: B, reason: collision with root package name */
    private int f18719B;

    /* renamed from: C, reason: collision with root package name */
    private String f18720C;

    /* renamed from: D, reason: collision with root package name */
    private String f18721D;

    /* renamed from: E, reason: collision with root package name */
    private String f18722E;

    /* renamed from: F, reason: collision with root package name */
    private int f18723F;

    /* renamed from: G, reason: collision with root package name */
    private int f18724G;

    /* renamed from: H, reason: collision with root package name */
    private String f18725H;

    /* renamed from: I, reason: collision with root package name */
    private int f18726I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private String f18727K;

    /* renamed from: L, reason: collision with root package name */
    private int f18728L;

    /* renamed from: M, reason: collision with root package name */
    private String f18729M;

    /* renamed from: N, reason: collision with root package name */
    private int f18730N;

    /* renamed from: w, reason: collision with root package name */
    private int f18731w;

    /* renamed from: x, reason: collision with root package name */
    private String f18732x;

    /* renamed from: y, reason: collision with root package name */
    private String f18733y;

    /* renamed from: z, reason: collision with root package name */
    private String f18734z;

    public g() {
    }

    private int a() {
        return this.f18730N;
    }

    private int b() {
        return this.f18728L;
    }

    private String c() {
        return this.f18729M;
    }

    private String d() {
        return this.f18725H;
    }

    private int e() {
        return this.f18726I;
    }

    private void f(int i6) {
        this.f18730N = i6;
    }

    private void g(int i6) {
        this.f18728L = i6;
    }

    private int h() {
        return this.f18724G;
    }

    private String i() {
        return this.f18720C;
    }

    private void j(String str) {
        this.f18729M = str;
    }

    private String k() {
        return this.f18721D;
    }

    private String l() {
        return this.f18722E;
    }

    private int m() {
        return this.f18723F;
    }

    private String n() {
        return this.f18718A;
    }

    private String o() {
        return this.f18733y;
    }

    private String p() {
        return this.f18734z;
    }

    private int q() {
        return this.f18731w;
    }

    private String r() {
        return this.f18732x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickTime [campaignId=");
        sb.append(this.f18733y);
        sb.append(", click_duration=");
        sb.append(this.f18734z);
        sb.append(", lastUrl=");
        sb.append(this.f18718A);
        sb.append(", code=");
        sb.append(this.f18719B);
        sb.append(", excepiton=");
        sb.append(this.f18720C);
        sb.append(", header=");
        sb.append(this.f18721D);
        sb.append(", content=");
        sb.append(this.f18722E);
        sb.append(", type=");
        sb.append(this.f18723F);
        sb.append(", click_type=");
        return u1.h.e(this.f18724G, "]", sb);
    }

    private g(String str, String str2, String str3, String str4, int i6, String str5, String str6, String str7, int i9, int i10, String str8, int i11, int i12, String str9, int i13, int i14, String str10) {
        this.f18732x = str;
        this.f18733y = str2;
        this.f18734z = str3;
        this.f18718A = str4;
        this.f18719B = i6;
        this.f18720C = str5;
        this.f18721D = str6;
        this.f18722E = str7;
        this.f18723F = i9;
        this.f18724G = i10;
        this.f18725H = str8;
        this.f18726I = i11;
        this.J = i12;
        this.f18727K = str9;
        this.f18728L = i13;
        this.f18729M = str10;
        this.f18730N = i14;
    }

    private int f() {
        return this.J;
    }

    private String g() {
        return this.f18727K;
    }

    private int j() {
        return this.f18719B;
    }

    public final void a(String str) {
        this.f18725H = str;
    }

    public final void b(int i6) {
        this.J = i6;
    }

    public final void c(int i6) {
        this.f18724G = i6;
    }

    public final void d(int i6) {
        this.f18719B = i6;
    }

    public final void e(String str) {
        this.f18722E = str;
    }

    public final void h(String str) {
        this.f18734z = str;
    }

    public final void i(String str) {
        this.f18732x = str;
    }

    private void h(int i6) {
        this.f18731w = i6;
    }

    public final void a(int i6) {
        this.f18726I = i6;
    }

    public final void b(String str) {
        this.f18727K = str;
    }

    public final void c(String str) {
        this.f18720C = str;
    }

    public final void d(String str) {
        this.f18721D = str;
    }

    public final void e(int i6) {
        this.f18723F = i6;
    }

    public final void f(String str) {
        this.f18718A = str;
    }

    public final void g(String str) {
        this.f18733y = str;
    }

    public static String a(List<g> list) {
        if (list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (g gVar : list) {
            sb.append("rid_n=" + gVar.f18732x);
            sb.append("&cid=" + gVar.f18733y);
            sb.append("&click_type=" + gVar.f18724G);
            sb.append("&type=" + gVar.f18723F);
            sb.append("&click_duration=" + gVar.f18734z);
            sb.append("&key=2000013");
            sb.append("&unit_id=" + gVar.f18725H);
            sb.append("&last_url=" + gVar.f18718A);
            sb.append("&content=" + gVar.f18722E);
            sb.append("&code=" + gVar.f18719B);
            sb.append("&exception=" + gVar.f18720C);
            sb.append("&header=" + gVar.f18721D);
            sb.append("&landing_type=" + gVar.f18726I);
            sb.append("&link_type=" + gVar.J);
            sb.append("&click_time=" + gVar.f18727K + "\n");
        }
        return sb.toString();
    }

    private static String a(g gVar) {
        if (gVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = gVar.f18718A;
        sb.append("rid_n=" + gVar.f18732x);
        sb.append("&click_type=" + gVar.f18724G);
        sb.append("&type=" + gVar.f18723F);
        sb.append("&cid=" + gVar.f18733y);
        sb.append("&click_duration=" + gVar.f18734z);
        sb.append("&key=2000012");
        sb.append("&unit_id=" + gVar.f18725H);
        sb.append("&last_url=".concat(String.valueOf(str)));
        sb.append("&code=" + gVar.f18719B);
        sb.append("&exception=" + gVar.f18720C);
        sb.append("&landing_type=" + gVar.f18726I);
        sb.append("&link_type=" + gVar.J);
        sb.append("&click_time=" + gVar.f18727K + "\n");
        return sb.toString();
    }
}
