package com.anythink.expressad.out;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class k implements com.anythink.expressad.foundation.g.d.c, com.anythink.expressad.g.b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final long f20822a = 1;
    public static final int dg = 1;
    public static final int dh = 2;
    public static final int di = 3;
    public String dj;

    /* renamed from: j, reason: collision with root package name */
    private double f20830j;

    /* renamed from: l, reason: collision with root package name */
    private Object f20832l;

    /* renamed from: n, reason: collision with root package name */
    private String f20834n;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f20835o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f20836p;

    /* renamed from: q, reason: collision with root package name */
    private r f20837q;

    /* renamed from: b, reason: collision with root package name */
    private String f20823b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f20824c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f20825d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f20826e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f20827f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f20828g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f20829h = "";
    private long i = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f20831k = 33333;

    /* renamed from: m, reason: collision with root package name */
    private int f20833m = 1;

    /* renamed from: r, reason: collision with root package name */
    private int f20838r = 0;

    /* renamed from: s, reason: collision with root package name */
    private int f20839s = 0;

    /* renamed from: t, reason: collision with root package name */
    private int f20840t = 0;

    private Drawable b() {
        return this.f20836p;
    }

    private void c(r rVar) {
        this.f20837q = rVar;
    }

    private String d() {
        return this.dj;
    }

    private int e() {
        return this.f20838r;
    }

    private int f() {
        return this.f20839s;
    }

    private String g() {
        return this.f20834n;
    }

    public final void A(String str) {
        this.f20828g = str;
    }

    public final void B(String str) {
        this.f20829h = str;
    }

    public final void C(String str) {
        this.f20827f = str;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(String str, String str2) {
    }

    public final double bf() {
        return this.f20830j;
    }

    public final int bg() {
        return this.f20831k;
    }

    public final String bh() {
        return this.f20823b;
    }

    public final String bi() {
        return this.f20824c;
    }

    public final String bj() {
        return this.f20825d;
    }

    public final String bk() {
        return this.f20826e;
    }

    public final String bl() {
        return this.f20828g;
    }

    public final String bm() {
        return this.f20829h;
    }

    public final int bn() {
        return this.f20833m;
    }

    public final long bo() {
        return this.i;
    }

    public final String bp() {
        return this.f20827f;
    }

    public final int bq() {
        return this.f20840t;
    }

    public void o(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.dj = str;
    }

    public final void r(int i) {
        if (i > 0) {
            this.f20831k = i;
        }
    }

    public final void s(int i) {
        this.f20833m = i;
    }

    public final void t(int i) {
        this.f20840t = i;
    }

    public final void w(String str) {
        this.f20823b = str;
    }

    public final void x(String str) {
        this.f20824c = str;
    }

    public final void y(String str) {
        this.f20825d = str;
    }

    public final void z(String str) {
        this.f20826e = str;
    }

    private Drawable a() {
        return this.f20835o;
    }

    private void b(r rVar) {
        this.f20837q = rVar;
        if (TextUtils.isEmpty(this.f20829h)) {
            return;
        }
        com.IceFishing.LiveIceFishing.k.m().a(this.f20829h, this);
    }

    private Object c() {
        return this.f20832l;
    }

    private void a(r rVar) {
        this.f20837q = rVar;
        if (TextUtils.isEmpty(this.f20828g)) {
            return;
        }
        com.IceFishing.LiveIceFishing.k.m().a(this.f20828g, this);
    }

    private void b(int i) {
        this.f20839s = i;
    }

    private void b(Drawable drawable) {
        this.f20836p = drawable;
    }

    public final void a(double d9) {
        this.f20830j = d9;
    }

    private void a(Object obj) {
        this.f20832l = obj;
    }

    public final void a(long j6) {
        this.i = j6;
    }

    private void a(int i) {
        this.f20838r = i;
    }

    private void a(String str) {
        this.f20834n = str;
    }

    private static Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    private void a(Drawable drawable) {
        this.f20835o = drawable;
    }

    @Override // com.anythink.expressad.foundation.g.d.c
    public final void a(Bitmap bitmap, String str) {
        String str2;
        if (!TextUtils.isEmpty(this.f20829h) && this.f20829h.equals(str) && bitmap != null) {
            this.f20836p = a(bitmap);
            if (this.f20837q != null) {
                a(bitmap);
            }
        }
        if (TextUtils.isEmpty(this.f20828g) || (str2 = this.f20828g) == null || !str2.equals(str) || bitmap == null) {
            return;
        }
        this.f20835o = a(bitmap);
        if (this.f20837q != null) {
            a(bitmap);
        }
    }
}
