package io.appmetrica.analytics.impl;

import android.content.Context;
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
import kotlin.text.StringsKt;

/* renamed from: io.appmetrica.analytics.impl.wb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0747wb {
    public static volatile C0747wb I;
    public volatile Ua C;
    public C0844zn H;
    public final Context a;
    public volatile Oi b;
    public volatile C0772x7 c;
    public volatile G3 e;
    public volatile C0411km f;
    public volatile Y g;
    public volatile M2 h;
    public volatile PlatformIdentifiers i;
    public volatile Ph j;
    public volatile C0509o4 k;
    public volatile C0724vh l;
    public volatile Kr m;
    public volatile C0181cm n;
    public volatile C0258fd o;
    public InterfaceC0824z3 p;
    public volatile C0788xn r;
    public volatile InterfaceC0402kd w;
    public volatile C0675tq x;
    public volatile C0760wo y;
    public volatile C0145bf z;
    public final C0718vb q = new C0718vb();
    public final C0779xe s = new C0779xe();
    public final Ae t = new Ae();
    public final C0443lp u = new C0443lp();
    public final C0182cn v = new C0182cn();
    public final C0376jg A = new C0376jg();
    public final UtilityServiceProvider B = new UtilityServiceProvider();
    public final C0470mn D = new C0470mn();
    public final ReferenceHolder E = new ReferenceHolder();
    public final C0759wn F = new C0759wn();
    public final C0388k G = new C0388k();
    public final C0383jn d = new C0383jn();

    public C0747wb(Context context) {
        this.a = context;
    }

    public static void a(Context context) {
        if (I == null) {
            synchronized (C0747wb.class) {
                try {
                    if (I == null) {
                        I = new C0747wb(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static C0747wb k() {
        return I;
    }

    public final C0443lp A() {
        return this.u;
    }

    public final C0844zn B() {
        C0844zn c0844zn;
        File file;
        C0844zn c0844zn2 = this.H;
        if (c0844zn2 != null) {
            return c0844zn2;
        }
        synchronized (this) {
            c0844zn = this.H;
            if (c0844zn == null) {
                Context context = this.a;
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
                    c0844zn = new C0844zn(file);
                    this.H = c0844zn;
                }
                file = null;
                c0844zn = new C0844zn(file);
                this.H = c0844zn;
            }
        }
        return c0844zn;
    }

    public final C0675tq C() {
        C0675tq c0675tq;
        C0675tq c0675tq2 = this.x;
        if (c0675tq2 != null) {
            return c0675tq2;
        }
        synchronized (this) {
            try {
                c0675tq = this.x;
                if (c0675tq == null) {
                    c0675tq = new C0675tq(this.a);
                    this.x = c0675tq;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0675tq;
    }

    public final synchronized Kr D() {
        try {
            if (this.m == null) {
                this.m = new Kr(this.a);
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
                        Up a = Tp.a(C0838zh.class);
                        Context context = this.a;
                        Vp vp = (Vp) a;
                        ProtobufStateStorage<Object> a2 = vp.a(context, vp.a(context));
                        C0838zh c0838zh = (C0838zh) a2.read();
                        this.j = new Ph(this.a, a2, new Gh(), new C0782xh(c0838zh), new Oh(), new Fh(this.a), new Kh(k().y()), new Ah(), c0838zh, "[PreloadInfoStorage]");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final C0388k b() {
        return this.G;
    }

    public final Y c() {
        Y y;
        Y y2 = this.g;
        if (y2 != null) {
            return y2;
        }
        synchronized (this) {
            try {
                y = this.g;
                if (y == null) {
                    y = new Y(this.a, this.d.b(), this.u.b());
                    this.u.a(y);
                    this.g = y;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return y;
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

    public final C0509o4 f() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        Up a = Tp.a(C0307h4.class);
                        Context context = this.a;
                        Vp vp = (Vp) a;
                        ProtobufStateStorage<Object> a2 = vp.a(context, vp.a(context));
                        this.k = new C0509o4(this.a, a2, new C0538p4(), new C0163c4(), new C0624s4(), new Rl(this.a), new C0567q4(y()), new C0192d4(), (C0307h4) a2.read(), "[ClidsInfoStorage]");
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

    public final C0772x7 h() {
        if (this.c == null) {
            synchronized (this) {
                try {
                    if (this.c == null) {
                        this.c = new C0772x7(new C0743w7(y()));
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final Ua i() {
        Ua ua;
        Ua ua2 = this.C;
        if (ua2 != null) {
            return ua2;
        }
        synchronized (this) {
            try {
                ua = this.C;
                if (ua == null) {
                    ua = new Ua(this.a);
                    this.C = ua;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ua;
    }

    public final PermissionExtractor j() {
        C0760wo c0760wo = this.y;
        if (c0760wo != null) {
            return c0760wo;
        }
        synchronized (this) {
            try {
                C0760wo c0760wo2 = this.y;
                if (c0760wo2 != null) {
                    return c0760wo2;
                }
                C0760wo c0760wo3 = new C0760wo(p().c.getAskForPermissionStrategy());
                this.y = c0760wo3;
                return c0760wo3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0258fd l() {
        C0258fd c0258fd;
        C0258fd c0258fd2 = this.o;
        if (c0258fd2 != null) {
            return c0258fd2;
        }
        synchronized (this) {
            try {
                c0258fd = this.o;
                if (c0258fd == null) {
                    c0258fd = new C0258fd(new D3(this.a, this.d.b()), new T2());
                    this.o = c0258fd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0258fd;
    }

    public final InterfaceC0402kd m() {
        InterfaceC0402kd interfaceC0402kd;
        InterfaceC0402kd interfaceC0402kd2 = this.w;
        if (interfaceC0402kd2 != null) {
            return interfaceC0402kd2;
        }
        synchronized (this) {
            try {
                interfaceC0402kd = this.w;
                if (interfaceC0402kd == null) {
                    Context context = this.a;
                    LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                    interfaceC0402kd = locationClient == null ? new C0460md() : new C0431ld(context, new C0633sd(), locationClient);
                    this.w = interfaceC0402kd;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0402kd;
    }

    public final InterfaceC0402kd n() {
        return m();
    }

    public final Ae o() {
        return this.t;
    }

    public final C0788xn p() {
        C0788xn c0788xn;
        C0788xn c0788xn2 = this.r;
        if (c0788xn2 != null) {
            return c0788xn2;
        }
        synchronized (this) {
            try {
                c0788xn = this.r;
                if (c0788xn == null) {
                    c0788xn = new C0788xn();
                    this.r = c0788xn;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0788xn;
    }

    public final C0145bf q() {
        C0145bf c0145bf;
        C0145bf c0145bf2 = this.z;
        if (c0145bf2 != null) {
            return c0145bf2;
        }
        synchronized (this) {
            try {
                c0145bf = this.z;
                if (c0145bf == null) {
                    c0145bf = new C0145bf(this.a, new xr());
                    this.z = c0145bf;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0145bf;
    }

    public final C0376jg r() {
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

    public final Ph t() {
        E();
        return this.j;
    }

    public final Oi u() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = new Oi(this.a, I.D().c);
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final C0181cm v() {
        C0181cm c0181cm;
        C0181cm c0181cm2 = this.n;
        if (c0181cm2 != null) {
            return c0181cm2;
        }
        synchronized (this) {
            try {
                c0181cm = this.n;
                if (c0181cm == null) {
                    c0181cm = new C0181cm(this.a);
                    this.n = c0181cm;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0181cm;
    }

    public final C0383jn w() {
        return this.d;
    }

    public final C0759wn x() {
        return this.F;
    }

    public final C0724vh y() {
        if (this.l == null) {
            synchronized (this) {
                try {
                    if (this.l == null) {
                        this.l = new C0724vh(B().d(this.a));
                    }
                } finally {
                }
            }
        }
        return this.l;
    }

    public final synchronized InterfaceC0824z3 z() {
        try {
            if (this.p == null) {
                Do r0 = new Do(this.a);
                this.p = r0;
                this.u.a(r0);
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
