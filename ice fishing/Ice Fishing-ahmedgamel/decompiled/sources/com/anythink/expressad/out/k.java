package com.anythink.expressad.out;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class k implements com.anythink.expressad.foundation.g.d.c, com.anythink.expressad.g.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final long f20035a = 1;
    public static final int dg = 1;
    public static final int dh = 2;
    public static final int di = 3;
    public String dj;

    /* renamed from: j, reason: collision with root package name */
    private double f20043j;

    /* renamed from: l, reason: collision with root package name */
    private Object f20045l;

    /* renamed from: n, reason: collision with root package name */
    private String f20047n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f20048o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f20049p;

    /* renamed from: q, reason: collision with root package name */
    private r f20050q;

    /* renamed from: b, reason: collision with root package name */
    private String f20036b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f20037c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f20038d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f20039e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f20040f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f20041g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f20042h = "";
    private long i = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f20044k = 33333;

    /* renamed from: m, reason: collision with root package name */
    private int f20046m = 1;

    /* renamed from: r, reason: collision with root package name */
    private int f20051r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f20052s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f20053t = 0;

    private Drawable b() {
        return this.f20049p;
    }

    private void c(r rVar) {
        this.f20050q = rVar;
    }

    private String d() {
        return this.dj;
    }

    private int e() {
        return this.f20051r;
    }

    private int f() {
        return this.f20052s;
    }

    private String g() {
        return this.f20047n;
    }

    public final void A(String str) {
        this.f20041g = str;
    }

    public final void B(String str) {
        this.f20042h = str;
    }

    public final void C(String str) {
        this.f20040f = str;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(String str, String str2) {
    }

    public final double bf() {
        return this.f20043j;
    }

    public final int bg() {
        return this.f20044k;
    }

    public final String bh() {
        return this.f20036b;
    }

    public final String bi() {
        return this.f20037c;
    }

    public final String bj() {
        return this.f20038d;
    }

    public final String bk() {
        return this.f20039e;
    }

    public final String bl() {
        return this.f20041g;
    }

    public final String bm() {
        return this.f20042h;
    }

    public final int bn() {
        return this.f20046m;
    }

    public final long bo() {
        return this.i;
    }

    public final String bp() {
        return this.f20040f;
    }

    public final int bq() {
        return this.f20053t;
    }

    public void o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.dj = str;
    }

    public final void r(int i) {
        if (i > 0) {
            this.f20044k = i;
        }
    }

    public final void s(int i) {
        this.f20046m = i;
    }

    public final void t(int i) {
        this.f20053t = i;
    }

    public final void w(String str) {
        this.f20036b = str;
    }

    public final void x(String str) {
        this.f20037c = str;
    }

    public final void y(String str) {
        this.f20038d = str;
    }

    public final void z(String str) {
        this.f20039e = str;
    }

    private Drawable a() {
        return this.f20048o;
    }

    private void b(r rVar) {
        this.f20050q = rVar;
        if (TextUtils.isEmpty(this.f20042h)) {
            return;
        }
        com.anythink.basead.exoplayer.f.f.l().a(this.f20042h, this);
    }

    private Object c() {
        return this.f20045l;
    }

    private void a(r rVar) {
        this.f20050q = rVar;
        if (TextUtils.isEmpty(this.f20041g)) {
            return;
        }
        com.anythink.basead.exoplayer.f.f.l().a(this.f20041g, this);
    }

    private void b(int i) {
        this.f20052s = i;
    }

    private void b(Drawable drawable) {
        this.f20049p = drawable;
    }

    public final void a(double d2) {
        this.f20043j = d2;
    }

    private void a(Object obj) {
        this.f20045l = obj;
    }

    public final void a(long j6) {
        this.i = j6;
    }

    private void a(int i) {
        this.f20051r = i;
    }

    private void a(String str) {
        this.f20047n = str;
    }

    private static Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    private void a(Drawable drawable) {
        this.f20048o = drawable;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        String str2;
        if (!TextUtils.isEmpty(this.f20042h) && this.f20042h.equals(str) && bitmap != null) {
            this.f20049p = a(bitmap);
            if (this.f20050q != null) {
                a(bitmap);
            }
        }
        if (TextUtils.isEmpty(this.f20041g) || (str2 = this.f20041g) == null || !str2.equals(str) || bitmap == null) {
            return;
        }
        this.f20048o = a(bitmap);
        if (this.f20050q != null) {
            a(bitmap);
        }
    }
}
