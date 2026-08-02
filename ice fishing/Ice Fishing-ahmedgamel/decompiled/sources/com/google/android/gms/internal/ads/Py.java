package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class Py implements Ay {

    /* renamed from: a, reason: collision with root package name */
    public final C2972ay f27677a;

    /* renamed from: b, reason: collision with root package name */
    public final Oy f27678b;

    /* renamed from: c, reason: collision with root package name */
    public final My f27679c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f27680d;

    /* renamed from: e, reason: collision with root package name */
    public final C4006uA f27681e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f27682f = new AtomicReference();

    public Py(C2972ay c2972ay, Oy oy, My my, ExecutorService executorService, C4006uA c4006uA) {
        this.f27677a = c2972ay;
        this.f27678b = oy;
        this.f27679c = my;
        this.f27680d = executorService;
        this.f27681e = c4006uA;
    }

    @Override // com.google.android.gms.internal.ads.Ay
    public final P3.a c() {
        C2972ay c2972ay = this.f27677a;
        int J = c2972ay.J();
        boolean O8 = c2972ay.O();
        Oy oy = this.f27678b;
        oy.getClass();
        ID s9 = ID.s(QC.o(new Ny(oy, J), oy.f27477d));
        C2576Fi c2576Fi = C2576Fi.f25620n;
        GD gd = GD.f25742n;
        C3901sD t6 = QC.t(s9, c2576Fi, gd);
        if (O8 && J != oy.f27479f) {
            t6 = QC.t(QC.q(ID.s(t6), Throwable.class, L2.f26839u, gd), new C4187xc(oy), gd);
        }
        C3955tD u6 = QC.u(ID.s(t6), new C2742Pe(9, this), gd);
        u6.a(new LD(0, u6, new C3557lt(this)), this.f27680d);
        return u6;
    }
}
