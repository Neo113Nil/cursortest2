package j0;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import m0.x1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f3318a;

    /* renamed from: b, reason: collision with root package name */
    public static final y0.n f3319b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f3320c = 240;

    /* renamed from: d, reason: collision with root package name */
    public static final float f3321d = l0.h.f3852b;

    /* renamed from: e, reason: collision with root package name */
    public static final v.r f3322e = new v.r(0.2f, 0.0f, 0.8f);

    /* renamed from: f, reason: collision with root package name */
    public static final v.r f3323f = new v.r(0.4f, 0.0f, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    public static final v.r f3324g = new v.r(0.0f, 0.0f, 0.65f);

    /* renamed from: h, reason: collision with root package name */
    public static final v.r f3325h = new v.r(0.1f, 0.0f, 0.45f);

    static {
        float f10 = 10;
        f3318a = f10;
        f3319b = androidx.compose.foundation.layout.b.g(androidx.compose.ui.layout.a.a(b0.f3293g).d(new AppendedSemanticsElement(e.f3315i, true)), 0, f10);
        new v.r(0.4f, 0.0f, 0.2f);
    }

    public static final void a(y0.n nVar, long j3, long j6, int i10, float f10, m0.r rVar, int i11) {
        int i12;
        float f11;
        int i13;
        int i14;
        float f12;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        rVar.Z(567589233);
        if (((i11 | (rVar.f(nVar) ? 4 : 2) | 27648) & 9363) == 9362 && rVar.B()) {
            rVar.S();
            i14 = i10;
            f12 = f10;
        } else {
            rVar.U();
            if ((i11 & 1) == 0 || rVar.z()) {
                i12 = a0.f3289a;
                f11 = a0.f3290b;
            } else {
                rVar.S();
                i12 = i10;
                f11 = f10;
            }
            rVar.r();
            Object M = rVar.M();
            Object obj = m0.l.f4646a;
            if (M == obj) {
                M = new v.e0();
                rVar.i0(M);
            }
            v.e0 e0Var = (v.e0) M;
            e0Var.a(0, rVar);
            e3.j jVar = new e3.j(5);
            jVar.f2091b = 1800;
            jVar.b(valueOf2, 0).f6850b = f3322e;
            jVar.b(valueOf, 750);
            v.c0 c3 = v.d.c(e0Var, v.d.h(new v.h0(jVar), 6), rVar);
            e3.j jVar2 = new e3.j(5);
            jVar2.f2091b = 1800;
            jVar2.b(valueOf2, 333).f6850b = f3323f;
            jVar2.b(valueOf, 1183);
            v.c0 c7 = v.d.c(e0Var, v.d.h(new v.h0(jVar2), 6), rVar);
            e3.j jVar3 = new e3.j(5);
            jVar3.f2091b = 1800;
            jVar3.b(valueOf2, 1000).f6850b = f3324g;
            jVar3.b(valueOf, 1567);
            v.c0 c10 = v.d.c(e0Var, v.d.h(new v.h0(jVar3), 6), rVar);
            e3.j jVar4 = new e3.j(5);
            jVar4.f2091b = 1800;
            jVar4.b(valueOf2, 1267).f6850b = f3325h;
            jVar4.b(valueOf, 1800);
            v.c0 c11 = v.d.c(e0Var, v.d.h(new v.h0(jVar4), 6), rVar);
            y0.n d10 = nVar.d(f3319b);
            w.k kVar = w.k.f7448j;
            AtomicInteger atomicInteger = e2.k.f1989a;
            y0.n i15 = androidx.compose.foundation.layout.b.i(d10.d(new AppendedSemanticsElement(kVar, true)), f3320c, f3321d);
            boolean f13 = rVar.f(c3) | rVar.f(c7) | rVar.f(c10) | rVar.f(c11);
            Object M2 = rVar.M();
            if (f13 || M2 == obj) {
                i13 = 0;
                Object c0Var = new c0(i12, f11, c3, j6, c7, j3, c10, c11);
                rVar.i0(c0Var);
                M2 = c0Var;
            } else {
                i13 = 0;
            }
            uc.e.a(i15, (oc.c) M2, rVar, i13);
            i14 = i12;
            f12 = f11;
        }
        x1 s10 = rVar.s();
        if (s10 != null) {
            s10.f4809d = new d0(nVar, j3, j6, i14, f12, i11);
        }
    }

    public static final void b(h1.d dVar, float f10, float f11, long j3, float f12, int i10) {
        float d10 = e1.e.d(dVar.d());
        float b2 = e1.e.b(dVar.d());
        float f13 = 2;
        float f14 = b2 / f13;
        boolean z10 = dVar.getLayoutDirection() == s2.l.f6396g;
        float f15 = (z10 ? f10 : 1.0f - f11) * d10;
        float f16 = (z10 ? f11 : 1.0f - f10) * d10;
        if (i10 == 0 || b2 > d10) {
            dVar.G(j3, v6.a.h(f15, f14), v6.a.h(f16, f14), f12, (r19 & 16) != 0 ? 0 : 0);
            return;
        }
        float f17 = f12 / f13;
        uc.a aVar = new uc.a(f17, d10 - f17);
        float floatValue = ((Number) uc.e.j(Float.valueOf(f15), aVar)).floatValue();
        float floatValue2 = ((Number) uc.e.j(Float.valueOf(f16), aVar)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            dVar.G(j3, v6.a.h(floatValue, f14), v6.a.h(floatValue2, f14), f12, (r19 & 16) != 0 ? 0 : i10);
        }
    }
}
