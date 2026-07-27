package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class Ry implements By {

    /* renamed from: a, reason: collision with root package name */
    public final C3066cy f27449a;

    /* renamed from: b, reason: collision with root package name */
    public final Qy f27450b;

    /* renamed from: c, reason: collision with root package name */
    public final Oy f27451c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f27452d;

    /* renamed from: e, reason: collision with root package name */
    public final C4158xA f27453e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f27454f = new AtomicReference();

    public Ry(C3066cy c3066cy, Qy qy, Oy oy, ExecutorService executorService, C4158xA c4158xA) {
        this.f27449a = c3066cy;
        this.f27450b = qy;
        this.f27451c = oy;
        this.f27452d = executorService;
        this.f27453e = c4158xA;
    }

    @Override // com.google.android.gms.internal.ads.By
    public final J3.a a() {
        C3066cy c3066cy = this.f27449a;
        int J = c3066cy.J();
        boolean O8 = c3066cy.O();
        Qy qy = this.f27450b;
        qy.getClass();
        JD s3 = JD.s(C3686oN.p(new Py(qy, J), qy.f27289d));
        C2538Ei c2538Ei = C2538Ei.f24801n;
        HD hd = HD.f25326n;
        C3945tD y6 = C3686oN.y(s3, c2538Ei, hd);
        if (O8 && J != qy.f27291f) {
            y6 = C3686oN.y(C3686oN.u(JD.s(y6), Throwable.class, J2.f25709u, hd), new C3907sc(qy), hd);
        }
        C3999uD A8 = C3686oN.A(JD.s(y6), new C2670Me(9, this), hd);
        A8.c(new MD(0, A8, new Mt(this)), this.f27452d);
        return A8;
    }
}
