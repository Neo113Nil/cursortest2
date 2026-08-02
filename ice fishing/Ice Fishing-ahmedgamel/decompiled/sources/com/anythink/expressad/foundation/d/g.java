package com.anythink.expressad.foundation.d;

import java.util.List;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19484a = "cid";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19485b = "click_type";

    /* renamed from: c, reason: collision with root package name */
    public static final String f19486c = "network_type";

    /* renamed from: d, reason: collision with root package name */
    public static final String f19487d = "network_str";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19488e = "click_duration";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19489f = "last_url";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19490g = "type";

    /* renamed from: h, reason: collision with root package name */
    public static final String f19491h = "code";
    public static final String i = "exception";

    /* renamed from: j, reason: collision with root package name */
    public static final String f19492j = "header";

    /* renamed from: k, reason: collision with root package name */
    public static final String f19493k = "content";

    /* renamed from: l, reason: collision with root package name */
    public static final String f19494l = "network_type";

    /* renamed from: m, reason: collision with root package name */
    public static final String f19495m = "rid";

    /* renamed from: n, reason: collision with root package name */
    public static final String f19496n = "key";

    /* renamed from: o, reason: collision with root package name */
    public static final String f19497o = "rid_n";

    /* renamed from: p, reason: collision with root package name */
    public static final String f19498p = "unit_id";

    /* renamed from: q, reason: collision with root package name */
    public static final String f19499q = "landing_type";

    /* renamed from: r, reason: collision with root package name */
    public static final String f19500r = "link_type";

    /* renamed from: s, reason: collision with root package name */
    public static final String f19501s = "click_time";

    /* renamed from: t, reason: collision with root package name */
    public static final String f19502t = "market_result";

    /* renamed from: u, reason: collision with root package name */
    public static final String f19503u = "2000013";

    /* renamed from: v, reason: collision with root package name */
    public static final String f19504v = "2000012";

    /* renamed from: A, reason: collision with root package name */
    private String f19505A;

    /* renamed from: B, reason: collision with root package name */
    private int f19506B;

    /* renamed from: C, reason: collision with root package name */
    private String f19507C;

    /* renamed from: D, reason: collision with root package name */
    private String f19508D;

    /* renamed from: E, reason: collision with root package name */
    private String f19509E;

    /* renamed from: F, reason: collision with root package name */
    private int f19510F;

    /* renamed from: G, reason: collision with root package name */
    private int f19511G;

    /* renamed from: H, reason: collision with root package name */
    private String f19512H;

    /* renamed from: I, reason: collision with root package name */
    private int f19513I;
    private int J;

    /* renamed from: K, reason: collision with root package name */
    private String f19514K;

    /* renamed from: L, reason: collision with root package name */
    private int f19515L;

    /* renamed from: M, reason: collision with root package name */
    private String f19516M;

    /* renamed from: N, reason: collision with root package name */
    private int f19517N;

    /* renamed from: w, reason: collision with root package name */
    private int f19518w;

    /* renamed from: x, reason: collision with root package name */
    private String f19519x;

    /* renamed from: y, reason: collision with root package name */
    private String f19520y;

    /* renamed from: z, reason: collision with root package name */
    private String f19521z;

    public g() {
    }

    private int a() {
        return this.f19517N;
    }

    private int b() {
        return this.f19515L;
    }

    private String c() {
        return this.f19516M;
    }

    private String d() {
        return this.f19512H;
    }

    private int e() {
        return this.f19513I;
    }

    private void f(int i4) {
        this.f19517N = i4;
    }

    private void g(int i4) {
        this.f19515L = i4;
    }

    private int h() {
        return this.f19511G;
    }

    private String i() {
        return this.f19507C;
    }

    private void j(String str) {
        this.f19516M = str;
    }

    private String k() {
        return this.f19508D;
    }

    private String l() {
        return this.f19509E;
    }

    private int m() {
        return this.f19510F;
    }

    private String n() {
        return this.f19505A;
    }

    private String o() {
        return this.f19520y;
    }

    private String p() {
        return this.f19521z;
    }

    private int q() {
        return this.f19518w;
    }

    private String r() {
        return this.f19519x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickTime [campaignId=");
        sb.append(this.f19520y);
        sb.append(", click_duration=");
        sb.append(this.f19521z);
        sb.append(", lastUrl=");
        sb.append(this.f19505A);
        sb.append(", code=");
        sb.append(this.f19506B);
        sb.append(", excepiton=");
        sb.append(this.f19507C);
        sb.append(", header=");
        sb.append(this.f19508D);
        sb.append(", content=");
        sb.append(this.f19509E);
        sb.append(", type=");
        sb.append(this.f19510F);
        sb.append(", click_type=");
        return AbstractC5128c.e(this.f19511G, "]", sb);
    }

    private g(String str, String str2, String str3, String str4, int i4, String str5, String str6, String str7, int i6, int i9, String str8, int i10, int i11, String str9, int i12, int i13, String str10) {
        this.f19519x = str;
        this.f19520y = str2;
        this.f19521z = str3;
        this.f19505A = str4;
        this.f19506B = i4;
        this.f19507C = str5;
        this.f19508D = str6;
        this.f19509E = str7;
        this.f19510F = i6;
        this.f19511G = i9;
        this.f19512H = str8;
        this.f19513I = i10;
        this.J = i11;
        this.f19514K = str9;
        this.f19515L = i12;
        this.f19516M = str10;
        this.f19517N = i13;
    }

    private int f() {
        return this.J;
    }

    private String g() {
        return this.f19514K;
    }

    private int j() {
        return this.f19506B;
    }

    public final void a(String str) {
        this.f19512H = str;
    }

    public final void b(int i4) {
        this.J = i4;
    }

    public final void c(int i4) {
        this.f19511G = i4;
    }

    public final void d(int i4) {
        this.f19506B = i4;
    }

    public final void e(String str) {
        this.f19509E = str;
    }

    public final void h(String str) {
        this.f19521z = str;
    }

    public final void i(String str) {
        this.f19519x = str;
    }

    private void h(int i4) {
        this.f19518w = i4;
    }

    public final void a(int i4) {
        this.f19513I = i4;
    }

    public final void b(String str) {
        this.f19514K = str;
    }

    public final void c(String str) {
        this.f19507C = str;
    }

    public final void d(String str) {
        this.f19508D = str;
    }

    public final void e(int i4) {
        this.f19510F = i4;
    }

    public final void f(String str) {
        this.f19505A = str;
    }

    public final void g(String str) {
        this.f19520y = str;
    }

    public static String a(List<g> list) {
        if (list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (g gVar : list) {
            sb.append("rid_n=" + gVar.f19519x);
            sb.append("&cid=" + gVar.f19520y);
            sb.append("&click_type=" + gVar.f19511G);
            sb.append("&type=" + gVar.f19510F);
            sb.append("&click_duration=" + gVar.f19521z);
            sb.append("&key=2000013");
            sb.append("&unit_id=" + gVar.f19512H);
            sb.append("&last_url=" + gVar.f19505A);
            sb.append("&content=" + gVar.f19509E);
            sb.append("&code=" + gVar.f19506B);
            sb.append("&exception=" + gVar.f19507C);
            sb.append("&header=" + gVar.f19508D);
            sb.append("&landing_type=" + gVar.f19513I);
            sb.append("&link_type=" + gVar.J);
            sb.append("&click_time=" + gVar.f19514K + "\n");
        }
        return sb.toString();
    }

    private static String a(g gVar) {
        if (gVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = gVar.f19505A;
        sb.append("rid_n=" + gVar.f19519x);
        sb.append("&click_type=" + gVar.f19511G);
        sb.append("&type=" + gVar.f19510F);
        sb.append("&cid=" + gVar.f19520y);
        sb.append("&click_duration=" + gVar.f19521z);
        sb.append("&key=2000012");
        sb.append("&unit_id=" + gVar.f19512H);
        sb.append("&last_url=".concat(String.valueOf(str)));
        sb.append("&code=" + gVar.f19506B);
        sb.append("&exception=" + gVar.f19507C);
        sb.append("&landing_type=" + gVar.f19513I);
        sb.append("&link_type=" + gVar.J);
        sb.append("&click_time=" + gVar.f19514K + "\n");
        return sb.toString();
    }
}
