package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.evu0;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;

/* loaded from: classes9.dex */
public final class V4 {
    public static volatile V4 A;
    public final C0615p7 a;
    public final B8 b;
    public final L4 c;
    public final C0465k2 d;
    public final C0607p e;
    public final C0747to f;
    public final C0903z6 g;
    public final C0549n h;
    public volatile Nc i;
    public final Iq j;
    public C0652qf k;
    public final C0839x0 l;
    public volatile S4 m;
    public final Me n;
    public volatile Hh o;
    public volatile Hh p;
    public C0659qm q;
    public final F0 r;
    public final C0639q2 s;
    public final C0792vb t;
    public final A4 u;
    public volatile C0377h0 v;
    public volatile C0244cb w;
    public volatile InterfaceC0891yn x;
    public volatile W4 y;
    public volatile C0690rp z;

    public V4(C0615p7 c0615p7, B8 b8, L4 l4, C0549n c0549n, C0465k2 c0465k2, C0607p c0607p, C0747to c0747to, C0903z6 c0903z6, Iq iq, C0839x0 c0839x0) {
        this.n = new Me();
        this.r = new F0();
        this.s = new C0639q2();
        this.t = new C0792vb();
        this.u = new A4();
        this.x = new E8();
        this.a = c0615p7;
        this.b = b8;
        this.c = l4;
        this.h = c0549n;
        this.d = c0465k2;
        this.e = c0607p;
        this.f = c0747to;
        this.g = c0903z6;
        this.j = iq;
        this.l = c0839x0;
    }

    public static V4 l() {
        if (A == null) {
            synchronized (V4.class) {
                try {
                    if (A == null) {
                        A = new V4(new C0615p7(), new C0607p(), new L4());
                    }
                } finally {
                }
            }
        }
        return A;
    }

    public final synchronized C0652qf a(Context context) {
        try {
            if (this.k == null) {
                this.k = new C0652qf(context, new Pr());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.k;
    }

    public final Hh b(Context context) {
        Hh hh;
        Hh hh2 = this.o;
        if (hh2 != null) {
            return hh2;
        }
        synchronized (this) {
            try {
                hh = this.o;
                if (hh == null) {
                    W4 e = e(context);
                    new P4(c(context)).a(context);
                    Hh hh3 = new Hh(e.a(context));
                    this.o = hh3;
                    hh = hh3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hh;
    }

    public final Hh c(Context context) {
        Hh hh;
        Hh hh2 = this.p;
        if (hh2 != null) {
            return hh2;
        }
        synchronized (this) {
            try {
                hh = this.p;
                if (hh == null) {
                    Hh hh3 = new Hh(e(context).b(context));
                    this.p = hh3;
                    hh = hh3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hh;
    }

    public final C0690rp d(Context context) {
        C0690rp c0690rp;
        C0690rp c0690rp2 = this.z;
        if (c0690rp2 != null) {
            return c0690rp2;
        }
        synchronized (this) {
            try {
                c0690rp = this.z;
                if (c0690rp == null) {
                    c0690rp = new C0690rp(context, b(context));
                    this.z = c0690rp;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0690rp;
    }

    public final W4 e(Context context) {
        W4 w4;
        File file;
        W4 w42 = this.y;
        if (w42 != null) {
            return w42;
        }
        synchronized (this) {
            w4 = this.y;
            if (w4 == null) {
                String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                if (evu0.J(readSystemProperty)) {
                    readSystemProperty = readSystemProperty2;
                }
                if (!evu0.J(readSystemProperty)) {
                    file = new File(readSystemProperty, context.getPackageName());
                    try {
                        file.mkdirs();
                    } catch (Exception unused) {
                    }
                    w4 = new W4(file);
                    this.y = w4;
                }
                file = null;
                w4 = new W4(file);
                this.y = w4;
            }
        }
        return w4;
    }

    public final C0639q2 f() {
        return this.s;
    }

    public final L4 g() {
        return this.c;
    }

    public final C0903z6 h() {
        return this.g;
    }

    public final C0615p7 i() {
        return this.a;
    }

    public final B8 j() {
        return this.b;
    }

    public final C0792vb k() {
        return this.t;
    }

    public final S4 m() {
        S4 s4;
        S4 s42 = this.m;
        if (s42 != null) {
            return s42;
        }
        synchronized (this) {
            try {
                s4 = this.m;
                if (s4 == null) {
                    s4 = new S4();
                    this.m = s4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s4;
    }

    public final C0615p7 n() {
        return this.a;
    }

    public final Nc o() {
        return this.i;
    }

    public final C0747to p() {
        return this.f;
    }

    public final C0607p a() {
        return this.e;
    }

    public final F0 d() {
        return this.r;
    }

    public final C0839x0 c() {
        return this.l;
    }

    public final C0377h0 b() {
        C0377h0 c0377h0;
        C0377h0 c0377h02 = this.v;
        if (c0377h02 != null) {
            return c0377h02;
        }
        synchronized (this) {
            try {
                c0377h0 = this.v;
                if (c0377h0 == null) {
                    c0377h0 = new C0377h0(this.r, this.f, this.c);
                    this.v = c0377h0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0377h0;
    }

    public final C0465k2 e() {
        return this.d;
    }

    public V4(C0615p7 c0615p7, C0607p c0607p, L4 l4, C0549n c0549n) {
        this(c0615p7, new B8(), l4, c0549n, new C0465k2(c0615p7), c0607p, new C0747to(c0607p, c0549n), new C0903z6(c0607p), new Iq(), new C0839x0());
    }

    public V4(C0615p7 c0615p7, C0607p c0607p, L4 l4) {
        this(c0615p7, c0607p, l4, new C0549n(c0607p));
    }
}
