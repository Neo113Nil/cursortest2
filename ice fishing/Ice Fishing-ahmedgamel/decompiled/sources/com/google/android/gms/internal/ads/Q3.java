package com.google.android.gms.internal.ads;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class Q3 {

    /* renamed from: a, reason: collision with root package name */
    public String f26958a;

    /* renamed from: b, reason: collision with root package name */
    public int f26959b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26960c;

    /* renamed from: d, reason: collision with root package name */
    public int f26961d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26962e;

    /* renamed from: k, reason: collision with root package name */
    public float f26967k;

    /* renamed from: l, reason: collision with root package name */
    public String f26968l;

    /* renamed from: o, reason: collision with root package name */
    public Layout.Alignment f26971o;

    /* renamed from: p, reason: collision with root package name */
    public Layout.Alignment f26972p;

    /* renamed from: r, reason: collision with root package name */
    public K3 f26974r;

    /* renamed from: t, reason: collision with root package name */
    public String f26976t;

    /* renamed from: u, reason: collision with root package name */
    public String f26977u;

    /* renamed from: v, reason: collision with root package name */
    public String f26978v;

    /* renamed from: f, reason: collision with root package name */
    public int f26963f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f26964g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f26965h = -1;
    public int i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f26966j = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f26969m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f26970n = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f26973q = -1;

    /* renamed from: s, reason: collision with root package name */
    public float f26975s = Float.MAX_VALUE;

    public final String a() {
        return this.f26976t;
    }

    public final String b() {
        return this.f26977u;
    }

    public final String c() {
        return this.f26978v;
    }

    public final void d(Q3 q32) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (q32 != null) {
            if (!this.f26960c && q32.f26960c) {
                this.f26959b = q32.f26959b;
                this.f26960c = true;
            }
            if (this.f26965h == -1) {
                this.f26965h = q32.f26965h;
            }
            if (this.i == -1) {
                this.i = q32.i;
            }
            if (this.f26958a == null && (str = q32.f26958a) != null) {
                this.f26958a = str;
            }
            if (this.f26963f == -1) {
                this.f26963f = q32.f26963f;
            }
            if (this.f26964g == -1) {
                this.f26964g = q32.f26964g;
            }
            if (this.f26970n == -1) {
                this.f26970n = q32.f26970n;
            }
            if (this.f26971o == null && (alignment2 = q32.f26971o) != null) {
                this.f26971o = alignment2;
            }
            if (this.f26972p == null && (alignment = q32.f26972p) != null) {
                this.f26972p = alignment;
            }
            if (this.f26973q == -1) {
                this.f26973q = q32.f26973q;
            }
            if (this.f26966j == -1) {
                this.f26966j = q32.f26966j;
                this.f26967k = q32.f26967k;
            }
            if (this.f26974r == null) {
                this.f26974r = q32.f26974r;
            }
            if (this.f26975s == Float.MAX_VALUE) {
                this.f26975s = q32.f26975s;
            }
            if (this.f26976t == null) {
                this.f26976t = q32.f26976t;
            }
            if (this.f26977u == null) {
                this.f26977u = q32.f26977u;
            }
            if (this.f26978v == null) {
                this.f26978v = q32.f26978v;
            }
            if (!this.f26962e && q32.f26962e) {
                this.f26961d = q32.f26961d;
                this.f26962e = true;
            }
            if (this.f26969m != -1 || (i = q32.f26969m) == -1) {
                return;
            }
            this.f26969m = i;
        }
    }

    public final String e() {
        return this.f26968l;
    }
}
