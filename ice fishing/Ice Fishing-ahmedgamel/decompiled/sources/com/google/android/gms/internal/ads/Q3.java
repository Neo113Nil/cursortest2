package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class Q3 {

    /* renamed from: a, reason: collision with root package name */
    public String f27745a;

    /* renamed from: b, reason: collision with root package name */
    public int f27746b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27747c;

    /* renamed from: d, reason: collision with root package name */
    public int f27748d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27749e;

    /* renamed from: k, reason: collision with root package name */
    public float f27754k;

    /* renamed from: l, reason: collision with root package name */
    public String f27755l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f27758o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f27759p;

    /* renamed from: r, reason: collision with root package name */
    public K3 f27761r;

    /* renamed from: t, reason: collision with root package name */
    public String f27763t;

    /* renamed from: u, reason: collision with root package name */
    public String f27764u;

    /* renamed from: v, reason: collision with root package name */
    public String f27765v;

    /* renamed from: f, reason: collision with root package name */
    public int f27750f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f27751g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f27752h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f27753j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f27756m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f27757n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f27760q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f27762s = Float.MAX_VALUE;

    public final String a() {
        return this.f27763t;
    }

    public final String b() {
        return this.f27764u;
    }

    public final String c() {
        return this.f27765v;
    }

    public final void d(Q3 q32) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (q32 != null) {
            if (!this.f27747c && q32.f27747c) {
                this.f27746b = q32.f27746b;
                this.f27747c = true;
            }
            if (this.f27752h == -1) {
                this.f27752h = q32.f27752h;
            }
            if (this.i == -1) {
                this.i = q32.i;
            }
            if (this.f27745a == null && (str = q32.f27745a) != null) {
                this.f27745a = str;
            }
            if (this.f27750f == -1) {
                this.f27750f = q32.f27750f;
            }
            if (this.f27751g == -1) {
                this.f27751g = q32.f27751g;
            }
            if (this.f27757n == -1) {
                this.f27757n = q32.f27757n;
            }
            if (this.f27758o == null && (alignment2 = q32.f27758o) != null) {
                this.f27758o = alignment2;
            }
            if (this.f27759p == null && (alignment = q32.f27759p) != null) {
                this.f27759p = alignment;
            }
            if (this.f27760q == -1) {
                this.f27760q = q32.f27760q;
            }
            if (this.f27753j == -1) {
                this.f27753j = q32.f27753j;
                this.f27754k = q32.f27754k;
            }
            if (this.f27761r == null) {
                this.f27761r = q32.f27761r;
            }
            if (this.f27762s == Float.MAX_VALUE) {
                this.f27762s = q32.f27762s;
            }
            if (this.f27763t == null) {
                this.f27763t = q32.f27763t;
            }
            if (this.f27764u == null) {
                this.f27764u = q32.f27764u;
            }
            if (this.f27765v == null) {
                this.f27765v = q32.f27765v;
            }
            if (!this.f27749e && q32.f27749e) {
                this.f27748d = q32.f27748d;
                this.f27749e = true;
            }
            if (this.f27756m != -1 || (i = q32.f27756m) == -1) {
                return;
            }
            this.f27756m = i;
        }
    }

    public final String e() {
        return this.f27755l;
    }
}
