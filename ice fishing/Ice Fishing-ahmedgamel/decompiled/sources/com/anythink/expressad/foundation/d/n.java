package com.anythink.expressad.foundation.d;

import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18823a = "key";

    /* renamed from: b, reason: collision with root package name */
    public static final String f18824b = "time";

    /* renamed from: c, reason: collision with root package name */
    public static final String f18825c = "ad_source_id";

    /* renamed from: d, reason: collision with root package name */
    public static final String f18826d = "num";

    /* renamed from: e, reason: collision with root package name */
    public static final String f18827e = "unit_id";

    /* renamed from: f, reason: collision with root package name */
    public static final String f18828f = "fb";

    /* renamed from: g, reason: collision with root package name */
    public static final String f18829g = "timeout";

    /* renamed from: h, reason: collision with root package name */
    public static final String f18830h = "network_type";
    public static final String i = "network_str";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18831j = "2000006";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18832k = "hb";

    /* renamed from: l, reason: collision with root package name */
    private int f18833l;

    /* renamed from: m, reason: collision with root package name */
    private String f18834m;

    /* renamed from: n, reason: collision with root package name */
    private int f18835n;

    /* renamed from: o, reason: collision with root package name */
    private String f18836o;

    /* renamed from: p, reason: collision with root package name */
    private int f18837p;

    /* renamed from: q, reason: collision with root package name */
    private int f18838q;

    /* renamed from: r, reason: collision with root package name */
    private int f18839r;

    /* renamed from: s, reason: collision with root package name */
    private String f18840s;

    /* renamed from: t, reason: collision with root package name */
    private int f18841t;

    /* renamed from: u, reason: collision with root package name */
    private String f18842u;

    private n(int i6, String str, int i9, String str2, int i10, int i11, int i12) {
        this.f18833l = i6;
        this.f18834m = str;
        this.f18835n = i9;
        this.f18836o = str2;
        this.f18837p = i10;
        this.f18838q = i11;
        this.f18839r = i12;
    }

    private int a() {
        return this.f18841t;
    }

    private int b() {
        return this.f18833l;
    }

    private String c() {
        return this.f18834m;
    }

    private String d() {
        return this.f18842u;
    }

    private int e() {
        return this.f18835n;
    }

    private String f() {
        return this.f18836o;
    }

    private int g() {
        return this.f18837p;
    }

    private int h() {
        return this.f18838q;
    }

    private int i() {
        return this.f18839r;
    }

    private String j() {
        return this.f18840s;
    }

    private void a(int i6) {
        this.f18841t = i6;
    }

    private void b(int i6) {
        this.f18833l = i6;
    }

    private void c(int i6) {
        this.f18835n = i6;
    }

    private void d(int i6) {
        this.f18837p = i6;
    }

    private void e(int i6) {
        this.f18838q = i6;
    }

    private void f(int i6) {
        this.f18839r = i6;
    }

    private void a(String str) {
        this.f18834m = str;
    }

    private void b(String str) {
        this.f18842u = str;
    }

    private void c(String str) {
        this.f18836o = str;
    }

    private void d(String str) {
        this.f18840s = str;
    }

    private static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            stringBuffer.append("ad_source_id=" + nVar.f18833l);
            stringBuffer.append("&time=" + nVar.f18834m);
            stringBuffer.append("&num=" + nVar.f18835n);
            stringBuffer.append("&unit_id=" + nVar.f18836o);
            stringBuffer.append("&key=2000006");
            stringBuffer.append("&fb=" + nVar.f18837p);
            if (nVar.f18841t == 1) {
                stringBuffer.append("&hb=1");
            }
            stringBuffer.append("&timeout=" + nVar.f18838q + "\n");
        }
        return stringBuffer.toString();
    }

    public n() {
    }
}
