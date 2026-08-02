package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.tariffs.interactor.v;
import com.yandex.go.taxi.tariffs.internal.interactor.f;
import com.yandex.go.taxi.tariffs.internal.routestats.interactor.a0;
import com.yandex.go.zone.repository.o;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.i;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;
import ru.yandex.taxi.e;
import ru.yandex.taxi.preorder.source.pickup.a;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.routestats.prefetch.m;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes5.dex */
public final class w0g implements xvf0 {
    public final /* synthetic */ int a;
    public final h0g b;

    public /* synthetic */ w0g(h0g h0gVar, int i) {
        this.a = i;
        this.b = h0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        h0g h0gVar = this.b;
        switch (i) {
            case 0:
                c0g c0gVar = h0gVar.y.a.b;
                return new d800(c0gVar.P5(), (i130) c0gVar.g0.get(), 0);
            case 1:
                a aVar = (a) h0gVar.x.jn.get();
                q5z.h(aVar);
                return aVar;
            case 2:
                e eVar = (e) h0gVar.y.le.get();
                q5z.h(eVar);
                return eVar;
            case 3:
                return h0gVar.y.h6();
            case 4:
                return h0gVar.y.T5();
            case 5:
                s6d0 s6d0Var = (s6d0) h0gVar.x.Sr.get();
                q5z.h(s6d0Var);
                return s6d0Var;
            case 6:
                atd0 atd0Var = (atd0) h0gVar.y.Ac.get();
                q5z.h(atd0Var);
                return atd0Var;
            case 7:
                dne0 dne0Var = (dne0) h0gVar.x.d.get();
                q5z.h(dne0Var);
                return dne0Var;
            case 8:
                d0g d0gVar = h0gVar.y.a;
                zzf zzfVar = d0gVar.a;
                wiq0 wiq0Var = (wiq0) zzfVar.B2.get();
                o370 o370Var = new o370((c) zzfVar.Bc.get());
                ru.yandex.taxi.launch.c cVar = (ru.yandex.taxi.launch.c) zzfVar.Y0.get();
                b bVar = (b) zzfVar.Qb.get();
                qoj0 qoj0Var = new qoj0((dqe0) zzfVar.s2.get(), (RequirementsChangedNotifier) zzfVar.Sj.get(), d0gVar.L(), (jti0) zzfVar.Uj.get());
                mmf0 mmf0Var = new mmf0((g) zzfVar.W0.get(), (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) zzfVar.q8.get());
                hqe0 hqe0Var = new hqe0((dqe0) zzfVar.s2.get(), (axm) zzfVar.Vj.get(), (y1s) zzfVar.Zm.get());
                n1d n1dVar = new n1d((r8h) zzfVar.s.get(), new sfa0(), (ru.yandex.taxi.preorder.repositories.g) zzfVar.Sb.get(), (x1f0) zzfVar.h1.get(), (wtx) zzfVar.np.get(), (usx) zzfVar.Wi.get(), (stx) zzfVar.Mn.get());
                vo40 H = d0gVar.H();
                ru.yandex.taxi.preorder.tollroad.data.e eVar2 = (ru.yandex.taxi.preorder.tollroad.data.e) zzfVar.Kb.get();
                zzf zzfVar2 = d0gVar.a;
                int i2 = 11;
                au50 au50Var = new au50(i2, (i270) zzfVar2.Cm.get());
                pte0 pte0Var = (pte0) zzfVar.kn.get();
                ldm ldmVar = (ldm) zzfVar.op.get();
                ru.yandex.taxi.logistics.sdk.dashboard.storage.c cVar2 = (ru.yandex.taxi.logistics.sdk.dashboard.storage.c) bvf0.u().r0.get();
                q5z.i(cVar2);
                com.yandex.go.taxi.tariffs.internal.factory.a aVar2 = new com.yandex.go.taxi.tariffs.internal.factory.a(wiq0Var, o370Var, new a0(cVar, bVar, qoj0Var, mmf0Var, hqe0Var, n1dVar, H, eVar2, au50Var, pte0Var, ldmVar, new kni(cVar2, dkz.a(), (d) zzfVar.qp.get(), (wdi) zzfVar.rp.get(), (o3i) zzfVar.sp.get(), rjz.a()), (uvw) zzfVar.up.get(), (jd21) zzfVar.f107io.get(), (i) zzfVar.Si.get(), (wiq0) zzfVar.B2.get()), (e1s) zzfVar.an.get(), d0gVar.H(), (oci) zzfVar.wp.get());
                com.yandex.go.taxi.tariffs.internal.routestats.interactor.c cVar3 = new com.yandex.go.taxi.tariffs.internal.routestats.interactor.c(new t7j0((zuj0) zzfVar.W.get(), (cpw0) zzfVar.t5.get(), (bko) zzfVar.Sg.get(), new xox0((c) zzfVar.Bc.get(), (qbl0) zzfVar.C2.get(), (wiq0) zzfVar.B2.get()), new au50(i2, (i270) zzfVar2.Cm.get()), new dmw0((hqj0) zzfVar.fh.get(), zzfVar.E1(), new pp40((rqo) zzfVar.C.get())), d0gVar.H(), new am2((acz) zzfVar.o0.get(), (ru.yandex.taxi.maas.impl.ride.c) zzfVar.d9.get(), new dhe0(zzfVar.i1(), (n) zzfVar.Q2.get())), new nlw0((mqv0) zzfVar.j2.get())), (ru.yandex.taxi.provider.a) zzfVar.Bp.get(), (uze0) zzfVar.B2.get(), (m) zzfVar.Dp.get(), (com.yandex.go.analytics.b) zzfVar.i3.get());
                f fVar = new f((com.yandex.go.taxi.tariffs.internal.repository.a) zzfVar.Mf.get(), zzfVar.t1(), (uvw) zzfVar.up.get(), (ru.yandex.taxi.preorder.tollroad.a) zzfVar.Sp.get(), (opz0) zzfVar.Lb.get(), (mqz0) zzfVar.Mb.get(), new ae61((dne0) zzfVar.d.get(), (b03) zzfVar.f.get()), (nrx0) zzfVar.Ep.get(), (tt2) zzfVar.n.get(), zzfVar.s1());
                uvw uvwVar = (uvw) zzfVar.up.get();
                com.yandex.go.taxi.tariffs.factory.a i3 = zzfVar.i();
                c0g c0gVar2 = d0gVar.b;
                return new v(aVar2, cVar3, fVar, uvwVar, i3, i5m.a(c0gVar2.bz), (o) zzfVar.q2.get(), zzfVar.t1(), (ck31) zzfVar.B2.get(), (b) zzfVar.Qb.get(), (tt2) zzfVar.n.get(), (Lifecycle) c0gVar2.P.get(), (tse) c0gVar2.B.get(), (com.yandex.go.analytics.b) zzfVar.i3.get());
            case 9:
                dqe0 t1 = h0gVar.t1();
                q5z.h(t1);
                return t1;
            case 10:
                ru.yandex.taxi.preorder.repositories.g gVar = (ru.yandex.taxi.preorder.repositories.g) h0gVar.x.Sb.get();
                q5z.h(gVar);
                return gVar;
            case 11:
                RequirementsChangedNotifier requirementsChangedNotifier = (RequirementsChangedNotifier) h0gVar.x.Sj.get();
                q5z.h(requirementsChangedNotifier);
                return requirementsChangedNotifier;
            case 12:
                b g = h0gVar.g();
                q5z.h(g);
                return g;
            case 13:
                ru.yandex.taxi.surge.repository.a aVar3 = (ru.yandex.taxi.surge.repository.a) h0gVar.x.cr.get();
                q5z.h(aVar3);
                return aVar3;
            case 14:
                uze0 uze0Var = (uze0) h0gVar.x.B2.get();
                q5z.h(uze0Var);
                return uze0Var;
            case 15:
                com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar4 = (com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c) h0gVar.x.q8.get();
                q5z.h(cVar4);
                return cVar4;
            case 16:
                vbj0 vbj0Var = (vbj0) h0gVar.x.Pb.get();
                q5z.h(vbj0Var);
                return vbj0Var;
            case 17:
                ynj0 ynj0Var = (ynj0) h0gVar.x.x8.get();
                q5z.h(ynj0Var);
                return ynj0Var;
            case 18:
                zuj0 u1 = h0gVar.u1();
                q5z.h(u1);
                return u1;
            case 19:
                ru.yandex.taxi.preorder.tollroad.a aVar4 = (ru.yandex.taxi.preorder.tollroad.a) h0gVar.x.Sp.get();
                q5z.h(aVar4);
                return aVar4;
            case 20:
                c6l0 c6l0Var = (c6l0) h0gVar.b0.get();
                q5z.h(c6l0Var);
                return c6l0Var;
            case 21:
                qbl0 qbl0Var = (qbl0) h0gVar.x.C2.get();
                q5z.h(qbl0Var);
                return qbl0Var;
            case 22:
                return (ycq0) h0gVar.x.Xi.get();
            case 23:
                com.yandex.go.taxi.tariffs.repository.g v1 = h0gVar.v1();
                q5z.h(v1);
                return v1;
            case 24:
                wiq0 w1 = h0gVar.w1();
                q5z.h(w1);
                return w1;
            case 25:
                yyq0 yyq0Var = (yyq0) h0gVar.x.z8.get();
                q5z.h(yyq0Var);
                return yyq0Var;
            case 26:
                return h0gVar.y.T2();
            case 27:
                hpr0 hpr0Var = (hpr0) h0gVar.y.Tb.get();
                q5z.h(hpr0Var);
                return hpr0Var;
            case 28:
                return new y5s0(new pjc((dne0) h0gVar.x.d.get()), (ru.yandex.taxi.banners.c) h0gVar.y.M8.get(), (pta0) h0gVar.w7.get());
            default:
                return new uos0(new ul5((rqo) h0gVar.y.a.a.C.get(), 2));
        }
    }
}
