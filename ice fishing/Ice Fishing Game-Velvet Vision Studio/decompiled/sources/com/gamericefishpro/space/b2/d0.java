package com.gamericefishpro.space.b2;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.f2.n1;
import com.gamericefishpro.space.f2.o1;
import com.gamericefishpro.space.f2.p1;
import com.gamericefishpro.space.f2.q1;
import com.gamericefishpro.space.h0.s0;
import com.gamericefishpro.space.h2.b2;
import com.gamericefishpro.space.h2.f1;
import com.gamericefishpro.space.h2.g0;
import com.gamericefishpro.space.h2.k0;
import com.gamericefishpro.space.h2.n0;
import com.gamericefishpro.space.i2.d1;
import com.gamericefishpro.space.i2.g1;
import com.gamericefishpro.space.o1.l0;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t.i0;
import com.gamericefishpro.space.t0.v0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends com.gamericefishpro.space.ei.l implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, Object obj) {
        super(1);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [com.gamericefishpro.space.f2.u0, com.gamericefishpro.space.h2.a] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.th.a aVar = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Throwable th = (Throwable) obj;
                c0 c0Var = (c0) this.e;
                com.gamericefishpro.space.pi.h hVar = c0Var.i;
                if (hVar != null) {
                    hVar.i(th);
                }
                c0Var.i = null;
                return Unit.a;
            case 1:
                ((com.gamericefishpro.space.h2.f0) this.e).Z((com.gamericefishpro.space.c3.c) obj);
                return Unit.a;
            case 2:
                com.gamericefishpro.space.n1.c cVar = (com.gamericefishpro.space.n1.c) obj;
                com.gamericefishpro.space.f3.q qVar = (com.gamericefishpro.space.f3.q) this.e;
                if (qVar.G) {
                    com.gamericefishpro.space.pi.a0.u(qVar.o0(), null, new com.gamericefishpro.space.b0.o(qVar, cVar, aVar, 6), 3);
                }
                return Unit.a;
            case 3:
                com.gamericefishpro.space.h2.a aVar2 = (com.gamericefishpro.space.h2.a) obj;
                g0 g0Var = (g0) this.e;
                if (aVar2.N() != Integer.MAX_VALUE) {
                    if (aVar2.a().b) {
                        aVar2.C();
                    }
                    for (Map.Entry entry : aVar2.a().g.entrySet()) {
                        g0.a(g0Var, (com.gamericefishpro.space.f2.a) entry.getKey(), ((Number) entry.getValue()).intValue(), aVar2.v());
                    }
                    f1 f1Var = aVar2.v().J;
                    Intrinsics.b(f1Var);
                    while (!f1Var.equals(g0Var.a.v())) {
                        for (com.gamericefishpro.space.f2.a aVar3 : g0Var.b(f1Var).keySet()) {
                            g0.a(g0Var, aVar3, g0Var.c(f1Var, aVar3), f1Var);
                        }
                        f1Var = f1Var.J;
                        Intrinsics.b(f1Var);
                    }
                }
                return Unit.a;
            case 4:
                ((com.gamericefishpro.space.v0.e) this.e).b((com.gamericefishpro.space.h1.k) obj);
                return Boolean.TRUE;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return Boolean.valueOf(((com.gamericefishpro.space.m1.u) obj).H0(((com.gamericefishpro.space.m1.c) this.e).a));
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                k0 k0Var = (k0) obj;
                com.gamericefishpro.space.i2.t tVar = ((com.gamericefishpro.space.i2.k) this.e).I;
                if (tVar.getInsetsListener().z.g() > 0) {
                    com.gamericefishpro.space.t.w wVar = p1.a;
                    k0Var.d = true;
                    n0 n0Var = k0Var.v;
                    com.gamericefishpro.space.f2.u uVarP0 = n0Var.p0();
                    if (com.gamericefishpro.space.c3.i.a(k0Var.e, 9223372034707292159L)) {
                        k0Var.e = com.gamericefishpro.space.a.a.D(uVarP0.d(0L));
                        k0Var.i = uVarP0.F();
                    }
                    n0Var.r0().a0.b();
                    long jF = uVarP0.F();
                    h0 h0Var = tVar.getInsetsListener().y;
                    int i = (int) (jF >> 32);
                    int i2 = (int) (jF & 4294967295L);
                    for (n1 n1Var : p1.b) {
                        Object objG = h0Var.g(n1Var);
                        Intrinsics.b(objG);
                        q1 q1Var = (q1) objG;
                        o1 o1Var = (o1) n1Var;
                        p1.a(k0Var, o1Var.c, q1Var.h, i, i2);
                        if (((Boolean) q1Var.b.getValue()).booleanValue()) {
                            p1.a(k0Var, q1Var.f, q1Var.j, i, i2);
                            p1.a(k0Var, q1Var.g, q1Var.k, i, i2);
                        }
                        p1.a(k0Var, o1Var.d, q1Var.i, i, i2);
                    }
                    com.gamericefishpro.space.t.d0 d0Var = tVar.getInsetsListener().A;
                    if (d0Var.i()) {
                        com.gamericefishpro.space.f1.u uVar = tVar.getInsetsListener().B;
                        Object[] objArr = d0Var.a;
                        int i3 = d0Var.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            v0 v0Var = (v0) objArr[i4];
                            com.gamericefishpro.space.f2.n nVar = (com.gamericefishpro.space.f2.n) uVar.get(i4);
                            Rect rect = (Rect) v0Var.getValue();
                            k0Var.a(nVar.b(), rect.left);
                            k0Var.a(nVar.d(), rect.top);
                            k0Var.a(nVar.c(), rect.right);
                            k0Var.a(nVar.a(), rect.bottom);
                        }
                    }
                }
                return Unit.a;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return Boolean.valueOf(((com.gamericefishpro.space.t.l) this.e).a(((com.gamericefishpro.space.o2.o) obj).g));
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return Boolean.valueOf(com.gamericefishpro.space.i2.f0.c((com.gamericefishpro.space.o2.o) obj, (Resources) this.e));
            case 9:
                return new com.gamericefishpro.space.e.c(5, (d1) this.e);
            case 10:
                if (com.gamericefishpro.space.i2.f1.b.compareAndSet(false, true)) {
                    ((com.gamericefishpro.space.ri.e) this.e).k(Unit.a);
                }
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.q1.d dVar = (com.gamericefishpro.space.q1.d) obj;
                g1 g1Var = (g1) this.e;
                com.gamericefishpro.space.o1.q qVarJ = dVar.x().j();
                Function2 function2 = g1Var.v;
                if (function2 != null) {
                    function2.invoke(qVarJ, (com.gamericefishpro.space.r1.b) dVar.x().i);
                }
                return Unit.a;
            case 12:
                com.gamericefishpro.space.k1.e eVar = (com.gamericefishpro.space.k1.e) obj;
                if (!eVar.G) {
                    return b2.e;
                }
                if (eVar.I != null) {
                    com.gamericefishpro.space.e2.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                eVar.I = null;
                com.gamericefishpro.space.ei.w wVar2 = (com.gamericefishpro.space.ei.w) this.e;
                wVar2.d = wVar2.d;
                return b2.d;
            case 13:
                com.gamericefishpro.space.k1.e eVar2 = (com.gamericefishpro.space.k1.e) obj;
                if (!eVar2.d.G) {
                    return b2.e;
                }
                com.gamericefishpro.space.k1.e eVar3 = eVar2.I;
                if (eVar3 != null) {
                    d0 d0Var2 = new d0(13, (com.gamericefishpro.space.vb.c) this.e);
                    if (d0Var2.invoke(eVar3) == b2.d) {
                        com.gamericefishpro.space.h2.k.x(eVar3, d0Var2);
                    }
                }
                eVar2.I = null;
                eVar2.H = null;
                return b2.d;
            case 14:
                com.gamericefishpro.space.o1.h0 h0Var2 = (com.gamericefishpro.space.o1.h0) obj;
                com.gamericefishpro.space.l1.m mVar = (com.gamericefishpro.space.l1.m) this.e;
                h0Var2.l(h0Var2.b() * mVar.a);
                h0Var2.o(mVar.b);
                h0Var2.f(mVar.c);
                h0Var2.e(mVar.d);
                h0Var2.p(mVar.e);
                return Unit.a;
            case 15:
                Throwable th2 = (Throwable) obj;
                com.gamericefishpro.space.l4.c0 c0Var2 = (com.gamericefishpro.space.l4.c0) this.e;
                if (th2 != null) {
                    c0Var2.A.d(new com.gamericefishpro.space.l4.n0(th2));
                }
                if (c0Var2.C.e != com.gamericefishpro.space.oh.y.a) {
                    ((com.gamericefishpro.space.l4.k0) c0Var2.C.getValue()).close();
                }
                return Unit.a;
            case 16:
                Throwable th3 = (Throwable) obj;
                com.gamericefishpro.space.l6.k kVar = (com.gamericefishpro.space.l6.k) this.e;
                if (th3 == null) {
                    if (!kVar.d.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                } else if (th3 instanceof CancellationException) {
                    kVar.d.cancel(true);
                } else {
                    com.gamericefishpro.space.w6.j jVar = kVar.d;
                    Throwable cause = th3.getCause();
                    if (cause != null) {
                        th3 = cause;
                    }
                    jVar.j(th3);
                }
                return Unit.a;
            case 17:
                ((com.gamericefishpro.space.va.b) this.e).cancel(false);
                return Unit.a;
            case 18:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.e).cancel();
                }
                return Unit.a;
            case 19:
                com.gamericefishpro.space.o1.h0 h0Var3 = (com.gamericefishpro.space.o1.h0) obj;
                l0 l0Var = (l0) this.e;
                h0Var3.i(l0Var.H);
                h0Var3.k(l0Var.I);
                h0Var3.d(l0Var.J);
                h0Var3.l(l0Var.K);
                float f = l0Var.L;
                if (h0Var3.A != f) {
                    h0Var3.d |= 2048;
                    h0Var3.A = f;
                }
                h0Var3.t(l0Var.M);
                h0Var3.o(l0Var.N);
                h0Var3.f(l0Var.O);
                h0Var3.h(null);
                h0Var3.e(l0Var.P);
                h0Var3.p(l0Var.Q);
                int i5 = l0Var.R;
                if (h0Var3.I != i5) {
                    h0Var3.d |= 524288;
                    h0Var3.I = i5;
                }
                return Unit.a;
            case 20:
                com.gamericefishpro.space.o2.u.a((com.gamericefishpro.space.o2.w) obj, ((com.gamericefishpro.space.o2.h) this.e).a);
                return Unit.a;
            case 21:
                String str = (String) this.e;
                com.gamericefishpro.space.ki.d[] dVarArr = com.gamericefishpro.space.o2.u.a;
                ((com.gamericefishpro.space.o2.w) obj).b(com.gamericefishpro.space.o2.s.a, com.gamericefishpro.space.ph.w.c(str));
                return Unit.a;
            case 22:
                ((List) obj).add((Float) ((s0) this.e).invoke());
                return true;
            case 23:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = (Context) this.e;
                Intrinsics.checkNotNullParameter(context, "context");
                MeasurementManager measurementManager = MeasurementManager.get(context);
                Intrinsics.checkNotNullExpressionValue(measurementManager, "get(context)");
                return new com.gamericefishpro.space.o5.b(measurementManager);
            case 24:
                com.gamericefishpro.space.q1.d dVar2 = (com.gamericefishpro.space.q1.d) obj;
                com.gamericefishpro.space.r1.b bVar = (com.gamericefishpro.space.r1.b) this.e;
                com.gamericefishpro.space.o1.h hVar2 = bVar.l;
                if (bVar.n && bVar.w && hVar2 != null) {
                    com.gamericefishpro.space.a8.c cVarX = dVar2.x();
                    long jO = cVarX.o();
                    cVarX.j().k();
                    try {
                        ((com.gamericefishpro.space.a8.c) ((com.gamericefishpro.space.m.d) cVarX.e).e).j().a(hVar2);
                        bVar.c(dVar2);
                    } finally {
                        cVarX.j().i();
                        cVarX.H(jO);
                    }
                } else {
                    bVar.c(dVar2);
                }
                return Unit.a;
            case 25:
                return obj == ((com.gamericefishpro.space.t.d0) this.e) ? "(this)" : String.valueOf(obj);
            case 26:
                return obj == ((com.gamericefishpro.space.t.e0) this.e) ? "(this)" : String.valueOf(obj);
            case 27:
                return obj == ((i0) this.e) ? "(this)" : String.valueOf(obj);
            case 28:
                com.gamericefishpro.space.u1.c0 c0Var3 = (com.gamericefishpro.space.u1.c0) obj;
                com.gamericefishpro.space.u1.c cVar2 = (com.gamericefishpro.space.u1.c) this.e;
                cVar2.g(c0Var3);
                Function1 function1 = cVar2.i;
                if (function1 != null) {
                    function1.invoke(c0Var3);
                }
                return Unit.a;
            default:
                return Boolean.valueOf(Intrinsics.a(obj, this.e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.gamericefishpro.space.vb.c cVar, com.gamericefishpro.space.k1.e eVar, com.gamericefishpro.space.ei.w wVar) {
        super(1);
        this.d = 12;
        this.e = wVar;
    }
}
