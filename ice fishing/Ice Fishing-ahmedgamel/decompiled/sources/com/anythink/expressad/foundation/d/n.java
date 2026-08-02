package com.anythink.expressad.foundation.d;

import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19610a = "key";

    /* renamed from: b, reason: collision with root package name */
    public static final String f19611b = "time";

    /* renamed from: c, reason: collision with root package name */
    public static final String f19612c = "ad_source_id";

    /* renamed from: d, reason: collision with root package name */
    public static final String f19613d = "num";

    /* renamed from: e, reason: collision with root package name */
    public static final String f19614e = "unit_id";

    /* renamed from: f, reason: collision with root package name */
    public static final String f19615f = "fb";

    /* renamed from: g, reason: collision with root package name */
    public static final String f19616g = "timeout";

    /* renamed from: h, reason: collision with root package name */
    public static final String f19617h = "network_type";
    public static final String i = "network_str";

    /* renamed from: j, reason: collision with root package name */
    public static final String f19618j = "2000006";

    /* renamed from: k, reason: collision with root package name */
    public static final String f19619k = "hb";

    /* renamed from: l, reason: collision with root package name */
    private int f19620l;

    /* renamed from: m, reason: collision with root package name */
    private String f19621m;

    /* renamed from: n, reason: collision with root package name */
    private int f19622n;

    /* renamed from: o, reason: collision with root package name */
    private String f19623o;

    /* renamed from: p, reason: collision with root package name */
    private int f19624p;

    /* renamed from: q, reason: collision with root package name */
    private int f19625q;

    /* renamed from: r, reason: collision with root package name */
    private int f19626r;

    /* renamed from: s, reason: collision with root package name */
    private String f19627s;

    /* renamed from: t, reason: collision with root package name */
    private int f19628t;

    /* renamed from: u, reason: collision with root package name */
    private String f19629u;

    private n(int i4, String str, int i6, String str2, int i9, int i10, int i11) {
        this.f19620l = i4;
        this.f19621m = str;
        this.f19622n = i6;
        this.f19623o = str2;
        this.f19624p = i9;
        this.f19625q = i10;
        this.f19626r = i11;
    }

    private int a() {
        return this.f19628t;
    }

    private int b() {
        return this.f19620l;
    }

    private String c() {
        return this.f19621m;
    }

    private String d() {
        return this.f19629u;
    }

    private int e() {
        return this.f19622n;
    }

    private String f() {
        return this.f19623o;
    }

    private int g() {
        return this.f19624p;
    }

    private int h() {
        return this.f19625q;
    }

    private int i() {
        return this.f19626r;
    }

    private String j() {
        return this.f19627s;
    }

    private void a(int i4) {
        this.f19628t = i4;
    }

    private void b(int i4) {
        this.f19620l = i4;
    }

    private void c(int i4) {
        this.f19622n = i4;
    }

    private void d(int i4) {
        this.f19624p = i4;
    }

    private void e(int i4) {
        this.f19625q = i4;
    }

    private void f(int i4) {
        this.f19626r = i4;
    }

    private void a(String str) {
        this.f19621m = str;
    }

    private void b(String str) {
        this.f19629u = str;
    }

    private void c(String str) {
        this.f19623o = str;
    }

    private void d(String str) {
        this.f19627s = str;
    }

    private static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            stringBuffer.append("ad_source_id=" + nVar.f19620l);
            stringBuffer.append("&time=" + nVar.f19621m);
            stringBuffer.append("&num=" + nVar.f19622n);
            stringBuffer.append("&unit_id=" + nVar.f19623o);
            stringBuffer.append("&key=2000006");
            stringBuffer.append("&fb=" + nVar.f19624p);
            if (nVar.f19628t == 1) {
                stringBuffer.append("&hb=1");
            }
            stringBuffer.append("&timeout=" + nVar.f19625q + "\n");
        }
        return stringBuffer.toString();
    }

    public n() {
    }
}
