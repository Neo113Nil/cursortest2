package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes5.dex */
public class U5 {
    public final S5 a;
    public final T5 b;

    @NonNull
    protected final Context c;
    public final H5 d;
    public final C0250f5 e;
    public final N5 f;

    @NonNull
    protected final C0385jp g;
    public final Kj h;
    public final P9 i;
    public final ICommonExecutor j;
    public final C0258fd k;
    public final Aa l;
    public final int m;

    public U5(Context context, H5 h5, C0250f5 c0250f5, N5 n5, C0385jp c0385jp, Kj kj, ICommonExecutor iCommonExecutor, int i, C0258fd c0258fd, Aa aa) {
        this(context, h5, c0250f5, n5, c0385jp, kj, iCommonExecutor, new P9(), i, new S5(c0250f5.a), new T5(context, h5), c0258fd, aa);
    }

    public static Tn a(P5 p5, Hr hr, O5 o5) {
        Rn rn = new Rn(hr);
        return new Tn(p5, rn, o5, new C0574qb(p5, rn, new Wn(p5.i(), C0574qb.g), R1.a(), new SystemTimeProvider()), new C0479n3(p5, rn, new Wn(p5.i(), C0479n3.g), R1.a(), new SystemTimeProvider()));
    }

    public final E7 b(P5 p5) {
        return new E7(p5, C0747wb.I.B().c(this.c, this.d), new A7(p5.c()), new Y7());
    }

    public final Kn c() {
        return new Kn(this.c, this.d);
    }

    public final C0209dl d(P5 p5) {
        C0209dl c0209dl = new C0209dl(p5, this.f.a(), this.j);
        C0258fd c0258fd = this.k;
        synchronized (c0258fd) {
            c0258fd.c.add(c0209dl);
        }
        return c0209dl;
    }

    public final T5 e() {
        return this.b;
    }

    public final Hr f() {
        return C0747wb.I.D().a(this.d);
    }

    public static C0255fa c(P5 p5) {
        return new C0255fa(p5);
    }

    public final S5 d() {
        return this.a;
    }

    public static J5 b() {
        return new J5();
    }

    public final C0134b4 b(C0637sh c0637sh) {
        Context context = this.c;
        return new C0134b4(context, c0637sh, context.getPackageName(), new SafePackageManager());
    }

    public U5(Context context, H5 h5, C0250f5 c0250f5, N5 n5, C0385jp c0385jp, Kj kj, ICommonExecutor iCommonExecutor, P9 p9, int i, S5 s5, T5 t5, C0258fd c0258fd, Aa aa) {
        this.c = context;
        this.d = h5;
        this.e = c0250f5;
        this.f = n5;
        this.g = c0385jp;
        this.h = kj;
        this.j = iCommonExecutor;
        this.i = p9;
        this.m = i;
        this.a = s5;
        this.b = t5;
        this.k = c0258fd;
        this.l = aa;
    }

    public final C0668tj a(P5 p5) {
        return new C0668tj(new Lj(p5, this.h, new C0595r4()), this.g, new Ij(this.e));
    }

    public final U9 a() {
        Context context = this.c;
        H5 h5 = this.d;
        return new U9(new Z9(context, h5), this.m);
    }

    public final C0630sa a(C0637sh c0637sh, Hr hr, Tn tn, E7 e7, C0476n0 c0476n0, Kn kn, C0209dl c0209dl) {
        return new C0630sa(c0637sh, hr, tn, e7, c0476n0, this.i, kn, this.m, new R5(c0209dl), new SystemTimeProvider());
    }

    public static C0151bl a(P5 p5, C0255fa c0255fa) {
        return new C0151bl(c0255fa, p5);
    }

    public InterfaceC0803ya a(Da da, E7 e7, C0668tj c0668tj, C0250f5 c0250f5, H5 h5, C0637sh c0637sh) {
        return this.l.a(da, e7, c0668tj, c0250f5, h5, c0637sh).a();
    }

    public final C0191d3 a(C0637sh c0637sh) {
        return new C0191d3(this.d, c0637sh);
    }
}
