package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes9.dex */
public class X5 {
    public final V5 a;
    public final W5 b;
    protected final Context c;
    public final K5 d;
    public final C0439j5 e;
    public final Q5 f;
    protected final Bp g;
    public final Uj h;
    public final W9 i;
    public final ICommonExecutor j;
    public final C0794vd k;
    public final Ha l;
    public final int m;

    public X5(Context context, K5 k5, C0439j5 c0439j5, Q5 q5, Bp bp, Uj uj, ICommonExecutor iCommonExecutor, int i, C0794vd c0794vd, Ha ha) {
        this(context, k5, c0439j5, q5, bp, uj, iCommonExecutor, new W9(), i, new V5(c0439j5.a), new W5(context, k5), c0794vd, ha);
    }

    public static C0574no a(S5 s5, as asVar, R5 r5) {
        C0516lo c0516lo = new C0516lo(asVar);
        return new C0574no(s5, r5, new Ab(s5, c0516lo, new C0689ro(s5.i(), "foreground"), R1.a(), new SystemTimeProvider()), new C0553n3(s5, c0516lo, new C0689ro(s5.i(), C0553n3.g), R1.a(), new SystemTimeProvider()), new C0487ko(s5, c0516lo));
    }

    public final I7 b(S5 s5) {
        return new I7(s5, Jb.I.B().c(this.c, this.d), new F7(s5.c()), new C0241c8());
    }

    public final Cdo c() {
        return new Cdo(this.c, this.d);
    }

    public final C0571nl d(S5 s5) {
        C0571nl c0571nl = new C0571nl(s5, this.f.a(), this.j);
        C0794vd c0794vd = this.k;
        synchronized (c0794vd) {
            c0794vd.c.add(c0571nl);
        }
        return c0571nl;
    }

    public final W5 e() {
        return this.b;
    }

    public final as f() {
        return Jb.I.D().a(this.d);
    }

    public static C0531ma c(S5 s5) {
        return new C0531ma(s5);
    }

    public final V5 d() {
        return this.a;
    }

    public static M5 b() {
        return new M5();
    }

    public final C0323f4 b(Ih ih) {
        Context context = this.c;
        return new C0323f4(context, ih, context.getPackageName(), new SafePackageManager());
    }

    public X5(Context context, K5 k5, C0439j5 c0439j5, Q5 q5, Bp bp, Uj uj, ICommonExecutor iCommonExecutor, W9 w9, int i, V5 v5, W5 w5, C0794vd c0794vd, Ha ha) {
        this.c = context;
        this.d = k5;
        this.e = c0439j5;
        this.f = q5;
        this.g = bp;
        this.h = uj;
        this.j = iCommonExecutor;
        this.i = w9;
        this.m = i;
        this.a = v5;
        this.b = w5;
        this.k = c0794vd;
        this.l = ha;
    }

    public final C0916zj a(S5 s5) {
        return new C0916zj(new Vj(s5, this.h, new C0785v4()), this.g, new Sj(this.e));
    }

    public final C0214ba a() {
        Context context = this.c;
        K5 k5 = this.d;
        return new C0214ba(new C0358ga(context, k5), this.m);
    }

    public final C0907za a(Ih ih, as asVar, C0574no c0574no, I7 i7, C0608p0 c0608p0, Cdo cdo, C0571nl c0571nl) {
        return new C0907za(ih, asVar, c0574no, i7, c0608p0, this.i, cdo, this.m, new U5(c0571nl), new SystemTimeProvider());
    }

    public static C0513ll a(S5 s5, C0531ma c0531ma) {
        return new C0513ll(c0531ma, s5);
    }

    public Fa a(Ka ka, I7 i7, C0916zj c0916zj, C0439j5 c0439j5, K5 k5, Ih ih) {
        return this.l.a(ka, i7, c0916zj, c0439j5, k5, ih).a();
    }

    public final C0265d3 a(Ih ih) {
        return new C0265d3(this.d, ih);
    }
}
