package ee;

import j0.j;
import j0.l;
import j0.x;
import m0.r;
import m0.x1;
import m0.x2;
import u0.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j f2168a;

    static {
        long j3 = a.f2155b;
        long j6 = a.f2165l;
        long j10 = a.f2159f;
        long j11 = a.f2154a;
        long j12 = a.f2158e;
        long j13 = a.f2156c;
        long j14 = a.f2160g;
        long j15 = a.f2161h;
        long j16 = a.f2162i;
        long j17 = a.f2163j;
        long j18 = a.f2166m;
        long j19 = a.f2164k;
        long j20 = a.f2167n;
        x2 x2Var = l.f3404a;
        f2168a = new j(j3, j6, j10, j3, l0.a.f3772c, j11, j6, j12, j11, j13, j14, j15, j13, j10, j6, j16, j6, j17, j18, j3, l0.a.f3773d, l0.a.f3771b, j19, j6, l0.a.f3770a, l0.a.f3774e, j18, j20, l0.a.f3775f, l0.a.f3776g, l0.a.f3782m, l0.a.f3777h, l0.a.f3778i, l0.a.f3779j, l0.a.f3780k, l0.a.f3781l);
    }

    public static final void a(d dVar, r rVar, int i10) {
        d dVar2;
        r rVar2;
        rVar.Z(-874678358);
        if ((i10 & 3) == 2 && rVar.B()) {
            rVar.S();
            dVar2 = dVar;
            rVar2 = rVar;
        } else {
            dVar2 = dVar;
            rVar2 = rVar;
            x.a(f2168a, null, c.f2169a, dVar2, rVar2, 3462);
        }
        x1 s10 = rVar2.s();
        if (s10 != null) {
            s10.f4809d = new ae.b(i10, 1, dVar2);
        }
    }
}
