package com.anythink.expressad.foundation.d;

import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18981a = "key";

    /* renamed from: b, reason: collision with root package name */
    public static final String f18982b = "time";

    /* renamed from: c, reason: collision with root package name */
    public static final String f18983c = "ad_source_id";

    /* renamed from: d, reason: collision with root package name */
    public static final String f18984d = "num";

    /* renamed from: e, reason: collision with root package name */
    public static final String f18985e = "unit_id";

    /* renamed from: f, reason: collision with root package name */
    public static final String f18986f = "fb";

    /* renamed from: g, reason: collision with root package name */
    public static final String f18987g = "timeout";

    /* renamed from: h, reason: collision with root package name */
    public static final String f18988h = "network_type";
    public static final String i = "network_str";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18989j = "2000006";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18990k = "hb";

    /* renamed from: l, reason: collision with root package name */
    private int f18991l;

    /* renamed from: m, reason: collision with root package name */
    private String f18992m;

    /* renamed from: n, reason: collision with root package name */
    private int f18993n;

    /* renamed from: o, reason: collision with root package name */
    private String f18994o;

    /* renamed from: p, reason: collision with root package name */
    private int f18995p;

    /* renamed from: q, reason: collision with root package name */
    private int f18996q;

    /* renamed from: r, reason: collision with root package name */
    private int f18997r;

    /* renamed from: s, reason: collision with root package name */
    private String f18998s;

    /* renamed from: t, reason: collision with root package name */
    private int f18999t;

    /* renamed from: u, reason: collision with root package name */
    private String f19000u;

    private n(int i4, String str, int i9, String str2, int i10, int i11, int i12) {
        this.f18991l = i4;
        this.f18992m = str;
        this.f18993n = i9;
        this.f18994o = str2;
        this.f18995p = i10;
        this.f18996q = i11;
        this.f18997r = i12;
    }

    private int a() {
        return this.f18999t;
    }

    private int b() {
        return this.f18991l;
    }

    private String c() {
        return this.f18992m;
    }

    private String d() {
        return this.f19000u;
    }

    private int e() {
        return this.f18993n;
    }

    private String f() {
        return this.f18994o;
    }

    private int g() {
        return this.f18995p;
    }

    private int h() {
        return this.f18996q;
    }

    private int i() {
        return this.f18997r;
    }

    private String j() {
        return this.f18998s;
    }

    private void a(int i4) {
        this.f18999t = i4;
    }

    private void b(int i4) {
        this.f18991l = i4;
    }

    private void c(int i4) {
        this.f18993n = i4;
    }

    private void d(int i4) {
        this.f18995p = i4;
    }

    private void e(int i4) {
        this.f18996q = i4;
    }

    private void f(int i4) {
        this.f18997r = i4;
    }

    private void a(String str) {
        this.f18992m = str;
    }

    private void b(String str) {
        this.f19000u = str;
    }

    private void c(String str) {
        this.f18994o = str;
    }

    private void d(String str) {
        this.f18998s = str;
    }

    private static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            stringBuffer.append("ad_source_id=" + nVar.f18991l);
            stringBuffer.append("&time=" + nVar.f18992m);
            stringBuffer.append("&num=" + nVar.f18993n);
            stringBuffer.append("&unit_id=" + nVar.f18994o);
            stringBuffer.append("&key=2000006");
            stringBuffer.append("&fb=" + nVar.f18995p);
            if (nVar.f18999t == 1) {
                stringBuffer.append("&hb=1");
            }
            stringBuffer.append("&timeout=" + nVar.f18996q + "\n");
        }
        return stringBuffer.toString();
    }

    public n() {
    }
}
