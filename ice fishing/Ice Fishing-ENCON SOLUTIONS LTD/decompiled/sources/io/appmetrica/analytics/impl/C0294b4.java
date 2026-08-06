package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;

/* renamed from: io.appmetrica.analytics.impl.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294b4 {

    /* renamed from: w, reason: collision with root package name */
    public static volatile C0294b4 f5581w;

    /* renamed from: a, reason: collision with root package name */
    public final C0709r6 f5582a;

    /* renamed from: b, reason: collision with root package name */
    public final D7 f5583b;

    /* renamed from: c, reason: collision with root package name */
    public final R3 f5584c;

    /* renamed from: d, reason: collision with root package name */
    public final F1 f5585d;

    /* renamed from: e, reason: collision with root package name */
    public final C0625o f5586e;

    /* renamed from: f, reason: collision with root package name */
    public final Wk f5587f;

    /* renamed from: g, reason: collision with root package name */
    public final E5 f5588g;

    /* renamed from: h, reason: collision with root package name */
    public final C0573m f5589h;

    /* renamed from: i, reason: collision with root package name */
    public final C0597mn f5590i;

    /* renamed from: j, reason: collision with root package name */
    public C0820vd f5591j;

    /* renamed from: k, reason: collision with root package name */
    public final C0703r0 f5592k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Y3 f5593l;

    /* renamed from: m, reason: collision with root package name */
    public final Sc f5594m;

    /* renamed from: n, reason: collision with root package name */
    public volatile Ve f5595n;

    /* renamed from: o, reason: collision with root package name */
    public C0309bj f5596o;

    /* renamed from: p, reason: collision with root package name */
    public final C0911z0 f5597p;

    /* renamed from: q, reason: collision with root package name */
    public final K1 f5598q;

    /* renamed from: r, reason: collision with root package name */
    public final C0326ca f5599r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C0290b0 f5600s;
    public volatile M9 t;

    /* renamed from: u, reason: collision with root package name */
    public volatile G7 f5601u;

    /* renamed from: v, reason: collision with root package name */
    public volatile C0320c4 f5602v;

    public C0294b4(C0709r6 c0709r6, C0625o c0625o, R3 r3) {
        this(c0709r6, c0625o, r3, new C0573m(c0625o));
    }

    public static C0294b4 l() {
        if (f5581w == null) {
            synchronized (C0294b4.class) {
                try {
                    if (f5581w == null) {
                        f5581w = new C0294b4(new C0709r6(), new C0625o(), new R3());
                    }
                } finally {
                }
            }
        }
        return f5581w;
    }

    public final C0625o a() {
        return this.f5586e;
    }

    public final Ve b(Context context) {
        Ve ve = this.f5595n;
        if (ve == null) {
            synchronized (this) {
                try {
                    ve = this.f5595n;
                    if (ve == null) {
                        ve = new Ve(c(context).a(context));
                        this.f5595n = ve;
                    }
                } finally {
                }
            }
        }
        return ve;
    }

    public final C0703r0 c() {
        return this.f5592k;
    }

    public final C0911z0 d() {
        return this.f5597p;
    }

    public final F1 e() {
        return this.f5585d;
    }

    public final K1 f() {
        return this.f5598q;
    }

    public final R3 g() {
        return this.f5584c;
    }

    public final E5 h() {
        return this.f5588g;
    }

    public final C0709r6 i() {
        return this.f5582a;
    }

    public final D7 j() {
        return this.f5583b;
    }

    public final C0326ca k() {
        return this.f5599r;
    }

    public final Y3 m() {
        Y3 y3 = this.f5593l;
        if (y3 == null) {
            synchronized (this) {
                try {
                    y3 = this.f5593l;
                    if (y3 == null) {
                        y3 = new Y3();
                        this.f5593l = y3;
                    }
                } finally {
                }
            }
        }
        return y3;
    }

    public final C0709r6 n() {
        return this.f5582a;
    }

    public final Wk o() {
        return this.f5587f;
    }

    public C0294b4(C0709r6 c0709r6, C0625o c0625o, R3 r3, C0573m c0573m) {
        this(c0709r6, new D7(), r3, c0573m, new F1(), c0625o, new Wk(c0625o, c0573m), new E5(c0625o), new C0597mn(), new C0703r0());
    }

    public final synchronized C0820vd a(Context context) {
        try {
            if (this.f5591j == null) {
                this.f5591j = new C0820vd(context, new C0598mo());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5591j;
    }

    public final C0320c4 c(Context context) {
        File file;
        C0320c4 c0320c4 = this.f5602v;
        if (c0320c4 == null) {
            synchronized (this) {
                c0320c4 = this.f5602v;
                if (c0320c4 == null) {
                    String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                    String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                    if (z1.g.a0(readSystemProperty)) {
                        readSystemProperty = readSystemProperty2;
                    }
                    if (!z1.g.a0(readSystemProperty)) {
                        file = new File(readSystemProperty, context.getPackageName());
                        try {
                            file.mkdirs();
                        } catch (Exception unused) {
                        }
                        c0320c4 = new C0320c4(file);
                        this.f5602v = c0320c4;
                    }
                    file = null;
                    c0320c4 = new C0320c4(file);
                    this.f5602v = c0320c4;
                }
            }
        }
        return c0320c4;
    }

    public C0294b4(C0709r6 c0709r6, D7 d7, R3 r3, C0573m c0573m, F1 f12, C0625o c0625o, Wk wk, E5 e5, C0597mn c0597mn, C0703r0 c0703r0) {
        this.f5594m = new Sc();
        this.f5597p = new C0911z0();
        this.f5598q = new K1();
        this.f5599r = new C0326ca();
        new C7();
        this.f5601u = new G7();
        this.f5582a = c0709r6;
        this.f5583b = d7;
        this.f5584c = r3;
        this.f5589h = c0573m;
        this.f5585d = f12;
        this.f5586e = c0625o;
        this.f5587f = wk;
        this.f5588g = e5;
        this.f5590i = c0597mn;
        this.f5592k = c0703r0;
    }

    public final C0290b0 b() {
        C0290b0 c0290b0 = this.f5600s;
        if (c0290b0 == null) {
            synchronized (this) {
                try {
                    c0290b0 = this.f5600s;
                    if (c0290b0 == null) {
                        c0290b0 = new C0290b0(this.f5597p, this.f5587f, this.f5584c);
                        this.f5600s = c0290b0;
                    }
                } finally {
                }
            }
        }
        return c0290b0;
    }
}
