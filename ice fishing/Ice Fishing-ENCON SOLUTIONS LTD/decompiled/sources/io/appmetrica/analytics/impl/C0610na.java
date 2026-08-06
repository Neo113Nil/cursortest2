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

/* renamed from: io.appmetrica.analytics.impl.na, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610na {

    /* renamed from: I, reason: collision with root package name */
    public static volatile C0610na f6575I;

    /* renamed from: C, reason: collision with root package name */
    public volatile M9 f6578C;

    /* renamed from: H, reason: collision with root package name */
    public C0905yk f6582H;

    /* renamed from: a, reason: collision with root package name */
    public final Context f6583a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0564lg f6584b;

    /* renamed from: c, reason: collision with root package name */
    public volatile E6 f6585c;

    /* renamed from: e, reason: collision with root package name */
    public volatile R2 f6587e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C0593mj f6588f;

    /* renamed from: g, reason: collision with root package name */
    public volatile U f6589g;

    /* renamed from: h, reason: collision with root package name */
    public volatile C0266a2 f6590h;

    /* renamed from: i, reason: collision with root package name */
    public volatile PlatformIdentifiers f6591i;

    /* renamed from: j, reason: collision with root package name */
    public volatile C0770tf f6592j;

    /* renamed from: k, reason: collision with root package name */
    public volatile C0914z3 f6593k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Ze f6594l;

    /* renamed from: m, reason: collision with root package name */
    public volatile Ao f6595m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0386ej f6596n;

    /* renamed from: o, reason: collision with root package name */
    public volatile Fb f6597o;

    /* renamed from: p, reason: collision with root package name */
    public Al f6598p;

    /* renamed from: r, reason: collision with root package name */
    public volatile C0879xk f6600r;

    /* renamed from: w, reason: collision with root package name */
    public volatile Kb f6604w;

    /* renamed from: x, reason: collision with root package name */
    public volatile C0649on f6605x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C0776tl f6606y;

    /* renamed from: z, reason: collision with root package name */
    public volatile C0820vd f6607z;

    /* renamed from: q, reason: collision with root package name */
    public final C0584ma f6599q = new C0584ma();

    /* renamed from: s, reason: collision with root package name */
    public final Sc f6601s = new Sc();
    public final Uc t = new Uc();

    /* renamed from: u, reason: collision with root package name */
    public final C0467hm f6602u = new C0467hm();

    /* renamed from: v, reason: collision with root package name */
    public final C0387ek f6603v = new C0387ek();

    /* renamed from: A, reason: collision with root package name */
    public final Od f6576A = new Od();

    /* renamed from: B, reason: collision with root package name */
    public final UtilityServiceProvider f6577B = new UtilityServiceProvider();

    /* renamed from: D, reason: collision with root package name */
    public final C0594mk f6579D = new C0594mk();

    /* renamed from: E, reason: collision with root package name */
    public final ReferenceHolder f6580E = new ReferenceHolder();

    /* renamed from: F, reason: collision with root package name */
    public final C0853wk f6581F = new C0853wk();
    public final C0495j G = new C0495j();

    /* renamed from: d, reason: collision with root package name */
    public final C0542kk f6586d = new C0542kk();

    public C0610na(Context context) {
        this.f6583a = context;
    }

    public static void a(Context context) {
        if (f6575I == null) {
            synchronized (C0610na.class) {
                try {
                    if (f6575I == null) {
                        f6575I = new C0610na(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    public static C0610na k() {
        return f6575I;
    }

    public final C0467hm A() {
        return this.f6602u;
    }

    public final C0905yk B() {
        File file;
        C0905yk c0905yk = this.f6582H;
        if (c0905yk == null) {
            synchronized (this) {
                c0905yk = this.f6582H;
                if (c0905yk == null) {
                    Context context = this.f6583a;
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
                        c0905yk = new C0905yk(file);
                        this.f6582H = c0905yk;
                    }
                    file = null;
                    c0905yk = new C0905yk(file);
                    this.f6582H = c0905yk;
                }
            }
        }
        return c0905yk;
    }

    public final C0649on C() {
        C0649on c0649on = this.f6605x;
        if (c0649on == null) {
            synchronized (this) {
                try {
                    c0649on = this.f6605x;
                    if (c0649on == null) {
                        c0649on = new C0649on(this.f6583a);
                        this.f6605x = c0649on;
                    }
                } finally {
                }
            }
        }
        return c0649on;
    }

    public final synchronized Ao D() {
        try {
            if (this.f6595m == null) {
                this.f6595m = new Ao(this.f6583a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6595m;
    }

    public final void E() {
        if (this.f6592j == null) {
            synchronized (this) {
                try {
                    if (this.f6592j == null) {
                        Qm a2 = Pm.a(C0357df.class);
                        Context context = this.f6583a;
                        Rm rm = (Rm) a2;
                        ProtobufStateStorage<Object> a3 = rm.a(context, rm.a(context));
                        C0357df c0357df = (C0357df) a3.read();
                        this.f6592j = new C0770tf(this.f6583a, a3, new C0537kf(), new C0305bf(c0357df), new C0744sf(), new C0511jf(this.f6583a), new C0641of(k().y()), new C0382ef(), c0357df, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    public final C0495j b() {
        return this.G;
    }

    public final U c() {
        U u2 = this.f6589g;
        if (u2 == null) {
            synchronized (this) {
                try {
                    u2 = this.f6589g;
                    if (u2 == null) {
                        u2 = new U(this.f6583a, this.f6586d.a(), this.f6602u.b());
                        this.f6602u.a(u2);
                        this.f6589g = u2;
                    }
                } finally {
                }
            }
        }
        return u2;
    }

    public final C0266a2 d() {
        C0266a2 c0266a2 = this.f6590h;
        if (c0266a2 == null) {
            synchronized (this) {
                try {
                    c0266a2 = this.f6590h;
                    if (c0266a2 == null) {
                        c0266a2 = new C0266a2(this.f6583a, AbstractC0292b2.a());
                        this.f6590h = c0266a2;
                    }
                } finally {
                }
            }
        }
        return c0266a2;
    }

    public final C0421g2 e() {
        return l().f4379b;
    }

    public final C0914z3 f() {
        if (this.f6593k == null) {
            synchronized (this) {
                try {
                    if (this.f6593k == null) {
                        Qm a2 = Pm.a(C0732s3.class);
                        Context context = this.f6583a;
                        Rm rm = (Rm) a2;
                        ProtobufStateStorage<Object> a3 = rm.a(context, rm.a(context));
                        this.f6593k = new C0914z3(this.f6583a, a3, new A3(), new C0603n3(), new D3(), new Ti(this.f6583a), new B3(y()), new C0629o3(), (C0732s3) a3.read(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.f6593k;
    }

    public final Context g() {
        return this.f6583a;
    }

    public final E6 h() {
        if (this.f6585c == null) {
            synchronized (this) {
                try {
                    if (this.f6585c == null) {
                        this.f6585c = new E6(new D6(y()));
                    }
                } finally {
                }
            }
        }
        return this.f6585c;
    }

    public final M9 i() {
        M9 m9 = this.f6578C;
        if (m9 == null) {
            synchronized (this) {
                try {
                    m9 = this.f6578C;
                    if (m9 == null) {
                        m9 = new M9(this.f6583a);
                        this.f6578C = m9;
                    }
                } finally {
                }
            }
        }
        return m9;
    }

    public final PermissionExtractor j() {
        C0776tl c0776tl = this.f6606y;
        if (c0776tl != null) {
            return c0776tl;
        }
        synchronized (this) {
            try {
                C0776tl c0776tl2 = this.f6606y;
                if (c0776tl2 != null) {
                    return c0776tl2;
                }
                C0776tl c0776tl3 = new C0776tl(p().f7212c.getAskForPermissionStrategy());
                this.f6606y = c0776tl3;
                return c0776tl3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Fb l() {
        Fb fb = this.f6597o;
        if (fb == null) {
            synchronized (this) {
                try {
                    fb = this.f6597o;
                    if (fb == null) {
                        fb = new Fb(new O2(this.f6583a, this.f6586d.a()), new C0421g2());
                        this.f6597o = fb;
                    }
                } finally {
                }
            }
        }
        return fb;
    }

    public final Kb m() {
        Kb kb = this.f6604w;
        if (kb == null) {
            synchronized (this) {
                try {
                    kb = this.f6604w;
                    if (kb == null) {
                        Context context = this.f6583a;
                        LocationClient locationClient = (LocationClient) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor("io.appmetrica.analytics.location.internal.LocationClientImpl", LocationClient.class);
                        kb = locationClient == null ? new Mb() : new Lb(context, new Sb(), locationClient);
                        this.f6604w = kb;
                    }
                } finally {
                }
            }
        }
        return kb;
    }

    public final Kb n() {
        return m();
    }

    public final Uc o() {
        return this.t;
    }

    public final C0879xk p() {
        C0879xk c0879xk = this.f6600r;
        if (c0879xk == null) {
            synchronized (this) {
                try {
                    c0879xk = this.f6600r;
                    if (c0879xk == null) {
                        c0879xk = new C0879xk();
                        this.f6600r = c0879xk;
                    }
                } finally {
                }
            }
        }
        return c0879xk;
    }

    public final C0820vd q() {
        C0820vd c0820vd = this.f6607z;
        if (c0820vd == null) {
            synchronized (this) {
                try {
                    c0820vd = this.f6607z;
                    if (c0820vd == null) {
                        c0820vd = new C0820vd(this.f6583a, new C0624no());
                        this.f6607z = c0820vd;
                    }
                } finally {
                }
            }
        }
        return c0820vd;
    }

    public final Od r() {
        return this.f6576A;
    }

    public final PlatformIdentifiers s() {
        PlatformIdentifiers platformIdentifiers = this.f6591i;
        if (platformIdentifiers == null) {
            synchronized (this) {
                try {
                    platformIdentifiers = this.f6591i;
                    if (platformIdentifiers == null) {
                        platformIdentifiers = new PlatformIdentifiers(c(), d());
                        this.f6591i = platformIdentifiers;
                    }
                } finally {
                }
            }
        }
        return platformIdentifiers;
    }

    public final C0770tf t() {
        E();
        return this.f6592j;
    }

    public final C0564lg u() {
        if (this.f6584b == null) {
            synchronized (this) {
                try {
                    if (this.f6584b == null) {
                        this.f6584b = new C0564lg(this.f6583a, f6575I.D().f4167c);
                    }
                } finally {
                }
            }
        }
        return this.f6584b;
    }

    public final C0386ej v() {
        C0386ej c0386ej = this.f6596n;
        if (c0386ej == null) {
            synchronized (this) {
                try {
                    c0386ej = this.f6596n;
                    if (c0386ej == null) {
                        c0386ej = new C0386ej(this.f6583a);
                        this.f6596n = c0386ej;
                    }
                } finally {
                }
            }
        }
        return c0386ej;
    }

    public final C0542kk w() {
        return this.f6586d;
    }

    public final C0853wk x() {
        return this.f6581F;
    }

    public final Ze y() {
        if (this.f6594l == null) {
            synchronized (this) {
                try {
                    if (this.f6594l == null) {
                        this.f6594l = new Ze(B().d(this.f6583a));
                    }
                } finally {
                }
            }
        }
        return this.f6594l;
    }

    public final synchronized K2 z() {
        try {
            if (this.f6598p == null) {
                Al al = new Al(this.f6583a);
                this.f6598p = al;
                this.f6602u.a(al);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6598p;
    }

    public final WaitForActivationDelayBarrier a() {
        return this.f6577B.getActivationBarrier();
    }
}
