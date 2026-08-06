package io.appmetrica.analytics.impl;

import android.content.Context;
import h1.C0234d;
import i1.AbstractC0253j;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.c5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0321c5 {

    /* renamed from: a, reason: collision with root package name */
    public final C0269a5 f5709a;

    /* renamed from: b, reason: collision with root package name */
    public final C0295b5 f5710b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f5711c;

    /* renamed from: d, reason: collision with root package name */
    public final Q4 f5712d;

    /* renamed from: e, reason: collision with root package name */
    public final C0630o4 f5713e;

    /* renamed from: f, reason: collision with root package name */
    public final V4 f5714f;

    /* renamed from: g, reason: collision with root package name */
    protected final C0415fm f5715g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC0462hh f5716h;

    /* renamed from: i, reason: collision with root package name */
    public final H8 f5717i;

    /* renamed from: j, reason: collision with root package name */
    public final ICommonExecutor f5718j;

    /* renamed from: k, reason: collision with root package name */
    public final Fb f5719k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0738s9 f5720l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5721m;

    public C0321c5(Context context, Q4 q4, C0630o4 c0630o4, V4 v4, C0415fm c0415fm, InterfaceC0462hh interfaceC0462hh, ICommonExecutor iCommonExecutor, int i2, Fb fb, InterfaceC0738s9 interfaceC0738s9) {
        this(context, q4, c0630o4, v4, c0415fm, interfaceC0462hh, iCommonExecutor, new H8(), i2, new C0269a5(c0630o4.f6644a), new C0295b5(context, q4), fb, interfaceC0738s9);
    }

    public static X8 c(X4 x4) {
        return new X8(x4);
    }

    public final M8 a() {
        Context context = this.f5711c;
        Q4 q4 = this.f5712d;
        return new M8(new R8(context, q4), this.f5721m);
    }

    public final L6 b(X4 x4) {
        return new L6(x4, C0610na.f6575I.B().c(this.f5711c, this.f5712d), new H6(x4.c()), new C0400f7());
    }

    public final C0269a5 d() {
        return this.f5709a;
    }

    public final C0295b5 e() {
        return this.f5710b;
    }

    public final C0883xo f() {
        C0883xo c0883xo;
        Bo c0300ba;
        Ao D2 = C0610na.f6575I.D();
        Q4 q4 = this.f5712d;
        synchronized (D2) {
            try {
                String valueOf = String.valueOf(q4);
                LinkedHashMap linkedHashMap = D2.f4166b;
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    We we = new We(C0610na.f6575I.B().b(D2.f4165a, q4));
                    if (q4.d()) {
                        String str = "appmetrica_vital_" + q4.f4951b + ".dat";
                        c0300ba = new C0424g5(AbstractC0253j.B(new C0234d(str, new C0300ba(D2.f4165a, str)), new C0234d("appmetrica_vital_main.dat", new C0300ba(D2.f4165a, "appmetrica_vital_main.dat"))));
                    } else {
                        c0300ba = new C0300ba(D2.f4165a, "appmetrica_vital_" + q4.f4951b + ".dat");
                    }
                    obj = new C0883xo(we, c0300ba, valueOf);
                    linkedHashMap.put(valueOf, obj);
                }
                c0883xo = (C0883xo) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0883xo;
    }

    public C0321c5(Context context, Q4 q4, C0630o4 c0630o4, V4 v4, C0415fm c0415fm, InterfaceC0462hh interfaceC0462hh, ICommonExecutor iCommonExecutor, H8 h8, int i2, C0269a5 c0269a5, C0295b5 c0295b5, Fb fb, InterfaceC0738s9 interfaceC0738s9) {
        this.f5711c = context;
        this.f5712d = q4;
        this.f5713e = c0630o4;
        this.f5714f = v4;
        this.f5715g = c0415fm;
        this.f5716h = interfaceC0462hh;
        this.f5718j = iCommonExecutor;
        this.f5717i = h8;
        this.f5721m = i2;
        this.f5709a = c0269a5;
        this.f5710b = c0295b5;
        this.f5719k = fb;
        this.f5720l = interfaceC0738s9;
    }

    public final Jk c() {
        return new Jk(this.f5711c, this.f5712d);
    }

    public final C0825vi d(X4 x4) {
        C0825vi c0825vi = new C0825vi(x4, this.f5714f.a(), this.f5718j);
        Fb fb = this.f5719k;
        synchronized (fb) {
            fb.f4380c.add(c0825vi);
        }
        return c0825vi;
    }

    public final Qg a(X4 x4) {
        return new Qg(new C0487ih(x4, this.f5716h, new C3()), this.f5715g, new C0410fh(this.f5713e));
    }

    public static Rk a(X4 x4, C0883xo c0883xo, W4 w4) {
        Qk qk = new Qk(c0883xo);
        return new Rk(x4, qk, w4, new C0455ha(x4, qk, new Uk(x4.h(), C0455ha.f6138g), AbstractC0860x1.a(), new SystemTimeProvider()), new C0913z2(x4, qk, new Uk(x4.h(), C0913z2.f7266g), AbstractC0860x1.a(), new SystemTimeProvider()));
    }

    public static S4 b() {
        return new S4();
    }

    public final C0577m3 b(We we) {
        Context context = this.f5711c;
        return new C0577m3(context, we, context.getPackageName(), new SafePackageManager());
    }

    public final C0531k9 a(We we, C0883xo c0883xo, Rk rk, L6 l6, C0496j0 c0496j0, Jk jk, C0825vi c0825vi) {
        return new C0531k9(we, c0883xo, rk, l6, c0496j0, this.f5717i, jk, this.f5721m, new Z4(c0825vi), new SystemTimeProvider());
    }

    public static C0773ti a(X4 x4, X8 x8) {
        return new C0773ti(x8, x4);
    }

    public InterfaceC0687q9 a(InterfaceC0816v9 interfaceC0816v9, L6 l6, Qg qg, C0630o4 c0630o4, Q4 q4, We we) {
        return this.f5720l.a(interfaceC0816v9, l6, qg, c0630o4, q4, we).a();
    }

    public final C0654p2 a(We we) {
        return new C0654p2(this.f5712d, we);
    }
}
