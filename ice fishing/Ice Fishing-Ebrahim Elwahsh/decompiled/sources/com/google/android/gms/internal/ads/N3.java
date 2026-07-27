package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class N3 {

    /* renamed from: a, reason: collision with root package name */
    public String f26456a;

    /* renamed from: b, reason: collision with root package name */
    public int f26457b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26458c;

    /* renamed from: d, reason: collision with root package name */
    public int f26459d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26460e;

    /* renamed from: k, reason: collision with root package name */
    public float f26465k;

    /* renamed from: l, reason: collision with root package name */
    public String f26466l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f26469o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f26470p;

    /* renamed from: r, reason: collision with root package name */
    public I3 f26472r;

    /* renamed from: t, reason: collision with root package name */
    public String f26474t;

    /* renamed from: u, reason: collision with root package name */
    public String f26475u;

    /* renamed from: f, reason: collision with root package name */
    public int f26461f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f26462g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f26463h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f26464j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f26467m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f26468n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f26471q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f26473s = Float.MAX_VALUE;

    public final String a() {
        return this.f26474t;
    }

    public final String b() {
        return this.f26475u;
    }

    public final void c(N3 n32) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (n32 != null) {
            if (!this.f26458c && n32.f26458c) {
                this.f26457b = n32.f26457b;
                this.f26458c = true;
            }
            if (this.f26463h == -1) {
                this.f26463h = n32.f26463h;
            }
            if (this.i == -1) {
                this.i = n32.i;
            }
            if (this.f26456a == null && (str = n32.f26456a) != null) {
                this.f26456a = str;
            }
            if (this.f26461f == -1) {
                this.f26461f = n32.f26461f;
            }
            if (this.f26462g == -1) {
                this.f26462g = n32.f26462g;
            }
            if (this.f26468n == -1) {
                this.f26468n = n32.f26468n;
            }
            if (this.f26469o == null && (alignment2 = n32.f26469o) != null) {
                this.f26469o = alignment2;
            }
            if (this.f26470p == null && (alignment = n32.f26470p) != null) {
                this.f26470p = alignment;
            }
            if (this.f26471q == -1) {
                this.f26471q = n32.f26471q;
            }
            if (this.f26464j == -1) {
                this.f26464j = n32.f26464j;
                this.f26465k = n32.f26465k;
            }
            if (this.f26472r == null) {
                this.f26472r = n32.f26472r;
            }
            if (this.f26473s == Float.MAX_VALUE) {
                this.f26473s = n32.f26473s;
            }
            if (this.f26474t == null) {
                this.f26474t = n32.f26474t;
            }
            if (this.f26475u == null) {
                this.f26475u = n32.f26475u;
            }
            if (!this.f26460e && n32.f26460e) {
                this.f26459d = n32.f26459d;
                this.f26460e = true;
            }
            if (this.f26467m != -1 || (i = n32.f26467m) == -1) {
                return;
            }
            this.f26467m = i;
        }
    }

    public final String d() {
        return this.f26466l;
    }
}
