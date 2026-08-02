package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.evu0;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.ReferenceHolder;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import java.io.File;

/* loaded from: classes9.dex */
public final class Jb {
    public static volatile Jb I;
    public volatile C0244cb C;
    public Rn H;
    public final Context a;
    public volatile Yi b;
    public volatile C7 c;
    public volatile G3 e;
    public volatile Am f;
    public volatile C0175a0 g;
    public volatile M2 h;
    public volatile PlatformIdentifiers i;
    public volatile C0337fi j;
    public volatile C0698s4 k;
    public volatile Lh l;
    public volatile ds m;
    public volatile C0745tm n;
    public volatile C0794vd o;
    public InterfaceC0900z3 p;
    public volatile Pn r;
    public volatile Ad w;
    public volatile Kq x;
    public volatile Ro y;
    public volatile C0652qf z;
    public final Ib q = new Ib();
    public final Me s = new Me();
    public final Pe t = new Pe();
    public final Dp u = new Dp();
    public final C0775un v = new C0775un();
    public final C0884yg A = new C0884yg();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final En D = new En();
    public final ReferenceHolder E = new ReferenceHolder();
    public final On F = new On();
    public final C0462k G = new C0462k();
    public final Bn d = new Bn();

    public Jb(Context context) {
        this.a = context;
    }

    public static void a(Context context) {
        if (I == null) {
            synchronized (Jb.class) {
                try {
                    if (I == null) {
                        I = new Jb(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static Jb k() {
        return I;
    }

    public final Dp A() {
        return this.u;
    }

    public final Rn B() {
        Rn rn;
        File file;
        Rn rn2 = this.H;
        if (rn2 != null) {
            return rn2;
        }
        synchronized (this) {
            rn = this.H;
            if (rn == null) {
                Context context = this.a;
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
                    rn = new Rn(file);
                    this.H = rn;
                }
                file = null;
                rn = new Rn(file);
                this.H = rn;
            }
        }
        return rn;
    }

    public final Kq C() {
        Kq kq;
        Kq kq2 = this.x;
        if (kq2 != null) {
            return kq2;
        }
        synchronized (this) {
            try {
                kq = this.x;
                if (kq == null) {
                    kq = new Kq(this.a);
                    this.x = kq;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return kq;
    }

    public final synchronized ds D() {
        try {
            if (this.m == null) {
                this.m = new ds(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.m;
    }

    public final void E() {
        if (this.j == null) {
            synchronized (this) {
                try {
                    if (this.j == null) {
                        InterfaceC0547mq a = C0518lq.a(Ph.class);
                        Context context = this.a;
                        AbstractC0576nq abstractC0576nq = (AbstractC0576nq) a;
                        ProtobufStateStorage<Object> a2 = abstractC0576nq.a(context, abstractC0576nq.a(context));
                        Ph ph = (Ph) a2.read();
                        this.j = new C0337fi(this.a, a2, new Wh(), new Nh(ph), new C0308ei(), new Vh(this.a), new C0193ai(k().y()), new Qh(), ph, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C0462k b() {
        return this.G;
    }

    public final C0175a0 c() {
        C0175a0 c0175a0;
        C0175a0 c0175a02 = this.g;
        if (c0175a02 != null) {
            return c0175a02;
        }
        synchronized (this) {
            try {
                c0175a0 = this.g;
                if (c0175a0 == null) {
                    c0175a0 = new C0175a0(this.a, this.d.h(), this.u.a());
                    this.u.a(c0175a0);
                    this.g = c0175a0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0175a0;
    }

    public final M2 d() {
        M2 m2;
        M2 m22 = this.h;
        if (m22 != null) {
            return m22;
        }
        synchronized (this) {
            try {
                m2 = this.h;
                if (m2 == null) {
                    m2 = new M2(this.a, N2.a());
                    this.h = m2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m2;
    }

    public final T2 e() {
        return l().b;
    }

    public final C0698s4 f() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        InterfaceC0547mq a = C0518lq.a(C0496l4.class);
                        Context context = this.a;
                        AbstractC0576nq abstractC0576nq = (AbstractC0576nq) a;
                        ProtobufStateStorage<Object> a2 = abstractC0576nq.a(context, abstractC0576nq.a(context));
                        this.k = new C0698s4(this.a, a2, new C0727t4(), new C0352g4(), new C0814w4(), new C0427im(this.a), new C0756u4(y()), new C0381h4(), (C0496l4) a2.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    public final Context g() {
        return this.a;
    }

    public final C7 h() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = new C7(new B7(y()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final C0244cb i() {
        C0244cb c0244cb;
        C0244cb c0244cb2 = this.C;
        if (c0244cb2 != null) {
            return c0244cb2;
        }
        synchronized (this) {
            try {
                c0244cb = this.C;
                if (c0244cb == null) {
                    c0244cb = new C0244cb(this.a);
                    this.C = c0244cb;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0244cb;
    }

    public final PermissionExtractor j() {
        Ro ro = this.y;
        if (ro != null) {
            return ro;
        }
        synchronized (this) {
            try {
                Ro ro2 = this.y;
                if (ro2 != null) {
                    return ro2;
                }
                Ro ro3 = new Ro(p().c.getAskForPermissionStrategy());
                this.y = ro3;
                return ro3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0794vd l() {
        C0794vd c0794vd;
        C0794vd c0794vd2 = this.o;
        if (c0794vd2 != null) {
            return c0794vd2;
        }
        synchronized (this) {
            try {
                c0794vd = this.o;
                if (c0794vd == null) {
                    c0794vd = new C0794vd(new D3(this.a, this.d.b()), new T2());
                    this.o = c0794vd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0794vd;
    }

    public final Ad m() {
        Ad ad;
        Ad ad2 = this.w;
        if (ad2 != null) {
            return ad2;
        }
        synchronized (this) {
            try {
                ad = this.w;
                if (ad == null) {
                    Context context = this.a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    ad = locationClient == null ? new Cd() : new Bd(context, new Id(), locationClient);
                    this.w = ad;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ad;
    }

    public final Ad n() {
        return m();
    }

    public final Pe o() {
        return this.t;
    }

    public final Pn p() {
        Pn pn;
        Pn pn2 = this.r;
        if (pn2 != null) {
            return pn2;
        }
        synchronized (this) {
            try {
                pn = this.r;
                if (pn == null) {
                    pn = new Pn();
                    this.r = pn;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pn;
    }

    public final C0652qf q() {
        C0652qf c0652qf;
        C0652qf c0652qf2 = this.z;
        if (c0652qf2 != null) {
            return c0652qf2;
        }
        synchronized (this) {
            try {
                c0652qf = this.z;
                if (c0652qf == null) {
                    c0652qf = new C0652qf(this.a, new Qr());
                    this.z = c0652qf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0652qf;
    }

    public final C0884yg r() {
        return this.A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers;
        PlatformIdentifiers platformIdentifiers2 = this.i;
        if (platformIdentifiers2 != null) {
            return platformIdentifiers2;
        }
        synchronized (this) {
            try {
                platformIdentifiers = this.i;
                if (platformIdentifiers == null) {
                    platformIdentifiers = new PlatformIdentifiers(c(), d());
                    this.i = platformIdentifiers;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return platformIdentifiers;
    }

    public final C0337fi t() {
        E();
        return this.j;
    }

    public final Yi u() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = new Yi(new C0223bj().a(this.a));
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final C0745tm v() {
        C0745tm c0745tm;
        C0745tm c0745tm2 = this.n;
        if (c0745tm2 != null) {
            return c0745tm2;
        }
        synchronized (this) {
            try {
                c0745tm = this.n;
                if (c0745tm == null) {
                    c0745tm = new C0745tm(this.a);
                    this.n = c0745tm;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0745tm;
    }

    public final Bn w() {
        return this.d;
    }

    public final On x() {
        return this.F;
    }

    public final Lh y() {
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        this.l = new Lh(B().d(this.a));
                    }
                } finally {
                }
            }
        }
        return this.l;
    }

    public final synchronized InterfaceC0900z3 z() {
        try {
            if (this.p == null) {
                Vo vo = new Vo(this.a);
                this.p = vo;
                this.u.a(vo);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.p;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.B.getActivationBarrier();
    }
}
