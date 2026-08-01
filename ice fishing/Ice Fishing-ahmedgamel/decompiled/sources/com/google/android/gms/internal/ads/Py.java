package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class Py implements Ay {

    /* renamed from: a, reason: collision with root package name */
    public final C2949ay f26890a;

    /* renamed from: b, reason: collision with root package name */
    public final Oy f26891b;

    /* renamed from: c, reason: collision with root package name */
    public final My f26892c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f26893d;

    /* renamed from: e, reason: collision with root package name */
    public final C3983uA f26894e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f26895f = new AtomicReference();

    public Py(C2949ay c2949ay, Oy oy, My my, ExecutorService executorService, C3983uA c3983uA) {
        this.f26890a = c2949ay;
        this.f26891b = oy;
        this.f26892c = my;
        this.f26893d = executorService;
        this.f26894e = c3983uA;
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final N3.a c() {
        C2949ay c2949ay = this.f26890a;
        int J = c2949ay.J();
        boolean O8 = c2949ay.O();
        Oy oy = this.f26891b;
        oy.getClass();
        ID s9 = ID.s(QC.o(new Ny(oy, J), oy.f26694d));
        C2556Fi c2556Fi = C2556Fi.f24831n;
        GD gd = GD.f24952n;
        C3878sD t6 = QC.t(s9, c2556Fi, gd);
        if (O8 && J != oy.f26696f) {
            t6 = QC.t(QC.q(ID.s(t6), Throwable.class, L2.f26039u, gd), new C4164xc(oy), gd);
        }
        C3932tD u3 = QC.u(ID.s(t6), new C2722Pe(9, this), gd);
        u3.a(new LD(0, u3, new C3534lt(this)), this.f26893d);
        return u3;
    }
}
