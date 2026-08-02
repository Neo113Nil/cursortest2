package defpackage;

import android.content.Context;
import ru.yandex.taxi.activity.MainActivity;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.delivery.experiments.e;
import ru.yandex.taxi.logistics.delivery_form.repository.a;
import ru.yandex.taxi.logistics.sdk.management.f;
import ru.yandex.taxi.logistics.sdk.management.j;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class u0g implements xvf0 {
    public final /* synthetic */ int a;
    public final h0g b;

    public /* synthetic */ u0g(h0g h0gVar, int i) {
        this.a = i;
        this.b = h0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h0g h0gVar = this.b;
        switch (i) {
            case 0:
                f fVar = (f) h0gVar.x.L3.get();
                q5z.h(fVar);
                return fVar;
            case 1:
                c0g c0gVar = h0gVar.y;
                w030 w030Var = (w030) c0gVar.o0.get();
                i130 i130Var = (i130) c0gVar.g0.get();
                zzf zzfVar = h0gVar.x;
                zuj0 zuj0Var = (zuj0) zzfVar.W.get();
                y5i y5iVar = (y5i) zzfVar.Nb.get();
                lx4 lx4Var = (lx4) zzfVar.Y.get();
                a aVar = (a) h0gVar.o7.get();
                dqe0 dqe0Var = (dqe0) zzfVar.s2.get();
                gsi m = zzfVar.m();
                wiq0 wiq0Var = (wiq0) zzfVar.B2.get();
                g gVar = (g) c0gVar.F0.get();
                tt2 tt2Var = (tt2) zzfVar.n.get();
                tse tseVar = (tse) c0gVar.B.get();
                Context context = (Context) c0gVar.U.get();
                MainActivity mainActivity = c0gVar.w;
                pav pavVar = (pav) zzfVar.p3.get();
                ynj0 ynj0Var = (ynj0) zzfVar.x8.get();
                k7x0 k7x0Var = (k7x0) zzfVar.M3.get();
                v7j0 v7j0Var = (v7j0) c0gVar.L0.get();
                ru.yandex.taxi.preorder.repositories.g gVar2 = (ru.yandex.taxi.preorder.repositories.g) zzfVar.Sb.get();
                y50 y50Var = (y50) c0gVar.n0.get();
                k9i k9iVar = (k9i) c0gVar.Mg.get();
                tjt0 tjt0Var = new tjt0(c0gVar);
                zzf zzfVar2 = c0gVar.z;
                apf apfVar = new apf(tjt0Var, (dqe0) zzfVar2.s2.get(), (y9y0) zzfVar2.rm.get(), new g0j(c0gVar), 8);
                rqo rqoVar = (rqo) zzfVar.C.get();
                ljz ljzVar = (ljz) zzfVar.Wn.get();
                pwy0 pwy0Var = (pwy0) zzfVar.U.get();
                hit hitVar = (hit) zzfVar.z.get();
                j a = bkz.a();
                xku0 xku0Var = (xku0) zzfVar.Rg.get();
                t8i t8iVar = (t8i) zzfVar.Bm.get();
                l8i l8iVar = (l8i) c0gVar.Vf.get();
                wt90 a2 = rjz.a();
                uq1 uq1Var = (uq1) c0gVar.O0.get();
                com.yandex.go.taxi.tariffs.repository.g gVar3 = (com.yandex.go.taxi.tariffs.repository.g) zzfVar.Lh.get();
                zzfVar.Or.get();
                Context context2 = (Context) c0gVar.U.get();
                ru.yandex.taxi.contacts.a t2 = c0gVar.t2();
                zuj0 zuj0Var2 = (zuj0) zzfVar2.W.get();
                ru.yandex.taxi.contacts.g U2 = c0gVar.U2();
                uq1 uq1Var2 = (uq1) c0gVar.O0.get();
                rqo rqoVar2 = (rqo) zzfVar2.C.get();
                pav pavVar2 = (pav) zzfVar2.p3.get();
                k7x0 k7x0Var2 = (k7x0) zzfVar2.M3.get();
                wt90 a3 = rjz.a();
                y5i y5iVar2 = (y5i) zzfVar2.Nb.get();
                e K5 = c0gVar.K5();
                s14 s14Var = new s14(context2, t2, zuj0Var2, U2, uq1Var2, rqoVar2, pavVar2, k7x0Var2, a3, y5iVar2, K5, new apf((wiq0) zzfVar2.B2.get(), (lx4) zzfVar2.Y.get(), new b1((pho) zzfVar2.d0.get()), new o61((pho) zzfVar2.d0.get()), 13), c0gVar.L5(), (oep0) c0gVar.T.get(), (pho) zzfVar2.d0.get());
                c0gVar.L5();
                ru.yandex.taxi.logistics.payment.a aVar2 = new ru.yandex.taxi.logistics.payment.a(i5m.a(c0gVar.Nf));
                return new xjg(new a6i(w030Var, i130Var, zuj0Var, y5iVar, lx4Var, aVar, dqe0Var, m, wiq0Var, gVar, tt2Var, tseVar, context, mainActivity, pavVar, ynj0Var, k7x0Var, v7j0Var, gVar2, y50Var, k9iVar, apfVar, rqoVar, ljzVar, pwy0Var, hitVar, a, xku0Var, t8iVar, l8iVar, a2, uq1Var, gVar3, s14Var, aVar2, h0gVar.I0(), (ru.yandex.taxi.design.utils.a) c0gVar.g9.get(), zzfVar.o(), (c4r0) zzfVar.qk.get(), (dci) c0gVar.zg.get(), (fvt) zzfVar.Z8.get(), (elb0) zzfVar.Nb.get(), c0gVar.a.c(), (o3i) zzfVar.sp.get(), zzf.Z0(), (ru.yandex.taxi.logistics.address.g) h0gVar.p7.get(), h0gVar.w, new iev0(zzfVar.x1()), (oep0) c0gVar.T.get(), (pho) zzfVar.d0.get()), new h580(c0gVar.T2(), (dqe0) zzfVar.s2.get(), (ynj0) zzfVar.x8.get()), false, 11);
            case 2:
                t8i t8iVar2 = (t8i) h0gVar.x.Bm.get();
                q5z.h(t8iVar2);
                return t8iVar2;
            case 3:
                return (k9i) h0gVar.y.Mg.get();
            case 4:
                lci lciVar = (lci) h0gVar.x.vp.get();
                q5z.h(lciVar);
                return lciVar;
            case 5:
                oci ociVar = (oci) h0gVar.x.wp.get();
                q5z.h(ociVar);
                return ociVar;
            case 6:
                return h0gVar.I0();
            case 7:
                zzf zzfVar3 = h0gVar.x;
                return new ici((rqo) zzfVar3.C.get(), (lci) zzfVar3.vp.get());
            case 8:
                d0g d0gVar = h0gVar.y.a;
                c0g c0gVar2 = d0gVar.b;
                w030 w030Var2 = (w030) c0gVar2.o0.get();
                uq1 uq1Var3 = (uq1) c0gVar2.O0.get();
                Context context3 = (Context) c0gVar2.U.get();
                zzf zzfVar4 = d0gVar.a;
                return new goi(w030Var2, uq1Var3, new wwf(context3, (c) zzfVar4.Ze.get(), (uze0) zzfVar4.B2.get()));
            case 9:
                pai paiVar = (pai) h0gVar.t7.get();
                q5z.h(paiVar);
                return paiVar;
            case 10:
                return new osi((wdi) h0gVar.y.a.a.rp.get());
            case 11:
                awi awiVar = (awi) h0gVar.y.Ph.get();
                q5z.h(awiVar);
                return awiVar;
            case 12:
                l0j l0jVar = (l0j) h0gVar.x.G2.get();
                q5z.h(l0jVar);
                return l0jVar;
            case 13:
                return (zem) h0gVar.y.xe.get();
            case 14:
                return h0gVar.y.a.f();
            case 15:
                axm axmVar = (axm) h0gVar.x.Vj.get();
                q5z.h(axmVar);
                return axmVar;
            case 16:
                c0g c0gVar3 = h0gVar.y;
                return new f28((i130) c0gVar3.g0.get(), (Context) c0gVar3.U.get(), (lg21) h0gVar.x.u5.get(), c0gVar3.rt, 5);
            case 17:
                return h0gVar.y.S1();
            case 18:
                pho p1 = h0gVar.p1();
                q5z.h(p1);
                return p1;
            case 19:
                rqo q1 = h0gVar.q1();
                q5z.h(q1);
                return q1;
            case 20:
                ru.yandex.taxi.preorder.extraphone.e eVar = (ru.yandex.taxi.preorder.extraphone.e) h0gVar.x.w8.get();
                q5z.h(eVar);
                return eVar;
            case 21:
                v4p v4pVar = (v4p) h0gVar.s7.get();
                q5z.h(v4pVar);
                return v4pVar;
            case 22:
                qmp qmpVar = (qmp) h0gVar.x.D.get();
                q5z.h(qmpVar);
                return qmpVar;
            case 23:
                return h0gVar.x.o();
            case 24:
                c8r c8rVar = (c8r) h0gVar.x.il.get();
                q5z.h(c8rVar);
                return c8rVar;
            case 25:
                a3v a3vVar = (a3v) h0gVar.y.Wb.get();
                q5z.h(a3vVar);
                return a3vVar;
            case 26:
                y1s y1sVar = (y1s) h0gVar.x.Zm.get();
                q5z.h(y1sVar);
                return y1sVar;
            case 27:
                c r1 = h0gVar.r1();
                q5z.h(r1);
                return r1;
            case 28:
                hit hitVar2 = (hit) h0gVar.x.z.get();
                q5z.h(hitVar2);
                return hitVar2;
            default:
                pav pavVar3 = (pav) h0gVar.x.p3.get();
                q5z.h(pavVar3);
                return pavVar3;
        }
    }
}
