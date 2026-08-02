package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import java.io.File;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class R4 {
    public static volatile R4 y;
    public final C0396k7 a;
    public final C0744w8 b;
    public final H4 c;
    public final C0391k2 d;
    public final C0533p e;
    public final Yn f;
    public final C0742w6 g;
    public final C0475n h;
    public volatile C0777xc i;
    public final C0617rq j;
    public C0145bf k;
    public final C0707v0 l;
    public volatile O4 m;
    public final C0779xe n;
    public volatile C0608rh o;
    public Zl p;
    public final D0 q;
    public final C0565q2 r;
    public final C0429lb s;
    public final C0740w4 t;
    public volatile C0245f0 u;
    public volatile Ua v;
    public volatile InterfaceC0297gn w;
    public volatile S4 x;

    public R4(C0396k7 c0396k7, C0744w8 c0744w8, H4 h4, C0475n c0475n, C0391k2 c0391k2, C0533p c0533p, Yn yn, C0742w6 c0742w6, C0617rq c0617rq, C0707v0 c0707v0) {
        this.n = new C0779xe();
        this.q = new D0();
        this.r = new C0565q2();
        this.s = new C0429lb();
        this.t = new C0740w4();
        this.w = new C0829z8();
        this.a = c0396k7;
        this.b = c0744w8;
        this.c = h4;
        this.h = c0475n;
        this.d = c0391k2;
        this.e = c0533p;
        this.f = yn;
        this.g = c0742w6;
        this.j = c0617rq;
        this.l = c0707v0;
    }

    public static R4 l() {
        if (y == null) {
            synchronized (R4.class) {
                try {
                    if (y == null) {
                        y = new R4(new C0396k7(), new C0533p(), new H4());
                    }
                } finally {
                }
            }
        }
        return y;
    }

    public final synchronized C0145bf a(Context context) {
        try {
            if (this.k == null) {
                this.k = new C0145bf(context, new C0763wr());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.k;
    }

    public final C0608rh b(Context context) {
        C0608rh c0608rh;
        C0608rh c0608rh2 = this.o;
        if (c0608rh2 != null) {
            return c0608rh2;
        }
        synchronized (this) {
            try {
                c0608rh = this.o;
                if (c0608rh == null) {
                    c0608rh = new C0608rh(c(context).a(context));
                    this.o = c0608rh;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0608rh;
    }

    public final S4 c(Context context) {
        S4 s4;
        File file;
        S4 s42 = this.x;
        if (s42 != null) {
            return s42;
        }
        synchronized (this) {
            s4 = this.x;
            if (s4 == null) {
                String readSystemProperty = SystemPropertiesHelper.readSystemProperty("ro.yndx.metrica.db.dir");
                String readSystemProperty2 = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.db.dir");
                if (StringsKt.U(readSystemProperty)) {
                    readSystemProperty = readSystemProperty2;
                }
                if (!StringsKt.U(readSystemProperty)) {
                    file = new File(readSystemProperty, context.getPackageName());
                    try {
                        file.mkdirs();
                    } catch (Exception unused) {
                    }
                    s4 = new S4(file);
                    this.x = s4;
                }
                file = null;
                s4 = new S4(file);
                this.x = s4;
            }
        }
        return s4;
    }

    public final D0 d() {
        return this.q;
    }

    public final C0391k2 e() {
        return this.d;
    }

    public final C0565q2 f() {
        return this.r;
    }

    public final H4 g() {
        return this.c;
    }

    public final C0742w6 h() {
        return this.g;
    }

    public final C0396k7 i() {
        return this.a;
    }

    public final C0744w8 j() {
        return this.b;
    }

    public final C0429lb k() {
        return this.s;
    }

    public final O4 m() {
        O4 o4;
        O4 o42 = this.m;
        if (o42 != null) {
            return o42;
        }
        synchronized (this) {
            try {
                o4 = this.m;
                if (o4 == null) {
                    o4 = new O4();
                    this.m = o4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o4;
    }

    public final C0396k7 n() {
        return this.a;
    }

    public final C0777xc o() {
        return this.i;
    }

    public final Yn p() {
        return this.f;
    }

    public final C0533p a() {
        return this.e;
    }

    public final C0245f0 b() {
        C0245f0 c0245f0;
        C0245f0 c0245f02 = this.u;
        if (c0245f02 != null) {
            return c0245f02;
        }
        synchronized (this) {
            try {
                c0245f0 = this.u;
                if (c0245f0 == null) {
                    c0245f0 = new C0245f0(this.q, this.f, this.c);
                    this.u = c0245f0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0245f0;
    }

    public final C0707v0 c() {
        return this.l;
    }

    public R4(C0396k7 c0396k7, C0533p c0533p, H4 h4, C0475n c0475n) {
        this(c0396k7, new C0744w8(), h4, c0475n, new C0391k2(c0396k7), c0533p, new Yn(c0533p, c0475n), new C0742w6(c0533p), new C0617rq(), new C0707v0());
    }

    public R4(C0396k7 c0396k7, C0533p c0533p, H4 h4) {
        this(c0396k7, c0533p, h4, new C0475n(c0533p));
    }
}
