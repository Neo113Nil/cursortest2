package defpackage;

import android.content.Context;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.payments.data.p;
import com.yandex.go.preorder.navigation.g;
import com.yandex.go.taxi.analytics.HubOpenReason;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.taxi.summary.mobilityhub.experiment.HubV2VerticalOnSummaryExperiment;
import com.yandex.go.taxi.summary.mobilityhub.experiment.HubVerticalOnSummaryExperiment;
import com.yandex.go.taxi.summary.mobilityhub.interactor.h;
import com.yandex.go.taxi.summary.mobilityhub.interactor.i;
import com.yandex.go.taxi.summary.mobilityhub.interactor.i0;
import com.yandex.go.taxi.summary.mobilityhub.interactor.j0;
import com.yandex.go.taxi.summary.mobilityhub.interactor.k;
import com.yandex.go.taxi.summary.mobilityhub.interactor.m;
import com.yandex.go.taxi.summary.mobilityhub.interactor.n;
import com.yandex.go.taxi.summary.mobilityhub.interactor.o;
import com.yandex.go.taxi.summary.mobilityhub.mapper.e;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.f;
import com.yandex.go.taxi.tariffs.interactor.r;
import com.yandex.mapkit.transport.masstransit.Route;
import kotlinx.serialization.json.b;
import ru.yandex.taxi.controller.feature.compat.FeatureStubFragment;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.masstransit.geopayment.purchase.MtPurchaseMapper;
import ru.yandex.taxi.masstransit.paymentcards.d;
import ru.yandex.taxi.ui.FragmentBackground;
import ru.yandex.taxi.widget.c;

/* loaded from: classes14.dex */
public final class ww20 extends dds {
    public final String F;
    public final h3g G;
    public final a H;
    public final sae I;
    public final dxu J;
    public final g K;
    public final yvf0 L;
    public final cyx M;
    public final com.yandex.go.taxi.summary.mobilityhub.experiment.g N;
    public final FeatureStubFragment O;
    public fn6 P;

    public ww20(String str, h3g h3gVar, a aVar, sae saeVar, dxu dxuVar, g gVar, l3g l3gVar, cyx cyxVar, com.yandex.go.taxi.summary.mobilityhub.experiment.g gVar2) {
        super(null);
        this.F = str;
        this.G = h3gVar;
        this.H = aVar;
        this.I = saeVar;
        this.J = dxuVar;
        this.K = gVar;
        this.L = l3gVar;
        this.M = cyxVar;
        this.N = gVar2;
        nmp nmpVar = FeatureStubFragment.Companion;
        ysl yslVar = new ysl(119, FragmentBackground.MAP);
        Screen screen = Screen.MOBILITY_HUB;
        nmpVar.getClass();
        this.O = nmp.a(yslVar, screen, null);
    }

    public static Route W(atj0 atj0Var) {
        if (atj0Var instanceof xsj0) {
            return ((xsj0) atj0Var).a;
        }
        if (atj0Var instanceof wsj0) {
            return ((wsj0) atj0Var).a;
        }
        if (atj0Var instanceof zsj0) {
            return ((zsj0) atj0Var).a;
        }
        if (atj0Var instanceof ysj0) {
            return ((ysj0) atj0Var).a;
        }
        if (!(atj0Var instanceof vsj0) && atj0Var != null) {
            w511.b();
        }
        return null;
    }

    @Override // defpackage.dds, defpackage.h55
    public final void H(Object obj) {
        super.H((j2v) obj);
        this.K.b(false);
    }

    @Override // defpackage.dds, defpackage.h55
    public final void I(Object obj) {
        this.D = null;
        this.P = null;
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        j2v j2vVar = (j2v) obj;
        if (t()) {
            return;
        }
        V(j2vVar);
    }

    @Override // defpackage.dds
    public final a P() {
        return this.H;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        j2v j2vVar = (j2v) obj;
        this.M.b(new byx(com.yandex.go.layers.api.model.params.Screen.SUMMARY, new c430(Mode.NORMAL, (b) null, (un0) null)));
        w030 modalViewCoordinator = ((FeatureStubFragment) baseFragment).modalViewCoordinator();
        sae saeVar = this.I;
        saeVar.getClass();
        modalViewCoordinator.getClass();
        this.P = new fn6((n3g) saeVar.b, modalViewCoordinator);
        if (!t()) {
            V(j2vVar);
        }
        this.K.b(true);
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        return this.O;
    }

    public final void V(j2v j2vVar) {
        m950 qc31Var;
        fn6 fn6Var = this.P;
        if (fn6Var == null) {
            return;
        }
        w030 w030Var = (w030) fn6Var.a;
        n3g n3gVar = (n3g) fn6Var.d;
        i6r i6rVar = (i6r) n3gVar.m;
        String str = (String) n3gVar.l;
        a2v a2vVar = (a2v) n3gVar.n;
        com.yandex.go.taxi.summary.mobilityhub.experiment.g gVar = this.N;
        h2v c = com.yandex.go.taxi.summary.mobilityhub.experiment.g.c((HubV2VerticalOnSummaryExperiment) gVar.b.b());
        if (c == null) {
            c = com.yandex.go.taxi.summary.mobilityhub.experiment.g.b((HubVerticalOnSummaryExperiment) gVar.a.b());
        }
        if (c != null) {
            yb31 yb31Var = c.a;
            if (yb31Var.f) {
                c0g c0gVar = (c0g) i6rVar;
                tt2 k = c0gVar.k();
                q5z.h(k);
                ck31 d1 = c0gVar.d1();
                c0g c0gVar2 = c0gVar.A;
                zzf zzfVar = c0gVar.z;
                q5z.h(d1);
                o7r0 r = fn6Var.r();
                fyu fyuVar = (fyu) zzfVar.n1.get();
                q5z.h(fyuVar);
                fvr fvrVar = (fvr) n3gVar.d.get();
                e s = fn6Var.s();
                me31 me31Var = (me31) n3gVar.i.get();
                tt2 k2 = c0gVar.k();
                q5z.h(k2);
                o7r0 r2 = fn6Var.r();
                fyu fyuVar2 = (fyu) zzfVar.n1.get();
                q5z.h(fyuVar2);
                qbl0 qbl0Var = (qbl0) zzfVar.C2.get();
                q5z.h(qbl0Var);
                com.yandex.go.route.interactor.b W5 = c0gVar.W5();
                q5z.h(W5);
                uze0 uze0Var = (uze0) zzfVar.B2.get();
                q5z.h(uze0Var);
                hpi0 hpi0Var = (hpi0) n3gVar.f.get();
                on2 l3 = c0gVar.l3();
                q5z.h(l3);
                new r1v();
                kcz0 kcz0Var = new kcz0();
                kcz0Var.a = a2vVar;
                kcz0Var.b = kotlin.a.a(new lr40(l3, 22));
                com.yandex.go.taxi.summary.mobilityhub.experiment.g a = n3gVar.a();
                lhq0 lhq0Var = (lhq0) n3gVar.h.get();
                e s2 = fn6Var.s();
                vlm vlmVar = (vlm) zzfVar.xm.get();
                q5z.h(vlmVar);
                tt2 k3 = c0gVar.k();
                q5z.h(k3);
                com.yandex.go.taxi.summary.mobilityhub.interactor.b bVar = new com.yandex.go.taxi.summary.mobilityhub.interactor.b(vlmVar, k3);
                kra0 kra0Var = (kra0) zzfVar.om.get();
                q5z.h(kra0Var);
                tt2 k4 = c0gVar.k();
                q5z.h(k4);
                j0 j0Var = new j0(kra0Var, k4, zzfVar.u());
                tw30 tw30Var = (tw30) c0gVar.hD.get();
                upm0 upm0Var = (upm0) zzfVar.Uq.get();
                q5z.h(upm0Var);
                tt2 k5 = c0gVar.k();
                q5z.h(k5);
                o oVar = new o(upm0Var, k5, zzfVar.u());
                h3y a2 = i5m.a((l3g) n3gVar.i0);
                tt2 k6 = c0gVar.k();
                q5z.h(k6);
                n nVar = new n(bVar, j0Var, tw30Var, oVar, a2, k6);
                dxu dxuVar = (dxu) n3gVar.b.get();
                jym jymVar = (jym) n3gVar.j.get();
                amp0 i = fn6Var.i();
                wiq0 c6 = c0gVar.c6();
                q5z.h(c6);
                x1v x1vVar = (x1v) c0gVar.xE.get();
                q5z.h(x1vVar);
                i0 i0Var = new i0(str, k2, r2, fyuVar2, qbl0Var, W5, uze0Var, hpi0Var, kcz0Var, a, lhq0Var, s2, nVar, dxuVar, jymVar, i, c6, x1vVar, a2vVar);
                fyu fyuVar3 = (fyu) zzfVar.n1.get();
                q5z.h(fyuVar3);
                h hVar = new h(fyuVar3, (me31) n3gVar.i.get(), fn6Var.s());
                tt2 k7 = c0gVar.k();
                q5z.h(k7);
                zuj0 c2 = c0gVar.c();
                q5z.h(c2);
                pwy0 w6 = c0gVar.w6();
                q5z.h(w6);
                ru.yandex.taxi.widget.utils.e f = c0gVar.f();
                q5z.h(f);
                com.yandex.go.route.interactor.b W52 = c0gVar.W5();
                q5z.h(W52);
                com.yandex.go.taxi.summary.mobilityhub.interactor.a aVar = new com.yandex.go.taxi.summary.mobilityhub.interactor.a(k7, c2, w6, f, W52);
                tt2 k8 = c0gVar.k();
                q5z.h(k8);
                ck31 d12 = c0gVar.d1();
                q5z.h(d12);
                pb31 g3 = c0gVar.g3();
                rqo l1 = c0gVar.l1();
                q5z.h(l1);
                pdc F1 = c0gVar.F1();
                q5z.h(F1);
                yp2 yp2Var = (yp2) zzfVar.kk.get();
                q5z.h(yp2Var);
                m mVar = new m(str, k8, d12, g3, new q(l1, F1, yp2Var));
                tt2 k9 = c0gVar.k();
                q5z.h(k9);
                zuj0 c3 = c0gVar.c();
                q5z.h(c3);
                wiq0 c62 = c0gVar.c6();
                q5z.h(c62);
                vwm vwmVar = new vwm(c62);
                com.yandex.go.route.interactor.b W53 = c0gVar.W5();
                q5z.h(W53);
                fcj0 fcj0Var = new fcj0(k9, c3, vwmVar, W53, zzfVar.A1());
                lhq0 lhq0Var2 = (lhq0) n3gVar.h.get();
                d2a0 N5 = c0gVar.N5();
                d dVar = new d((Context) c0gVar.U.get(), (ru.yandex.taxi.widget.utils.e) c0gVar.J9.get(), (c) zzfVar.Ze.get(), (pdc) zzfVar.Ye.get(), new g610((rqo) zzfVar.C.get()), (pwy0) zzfVar.U.get(), (com.yandex.go.payments.transport.domain.a) c0gVar.Cv.get(), (lz30) c0gVar.Li.get(), new qy90(zzfVar.h1()), (tt2) zzfVar.n.get());
                com.yandex.go.route.interactor.b W54 = c0gVar.W5();
                q5z.h(W54);
                p pVar = (p) zzfVar.rj.get();
                jym jymVar2 = (jym) n3gVar.j.get();
                dxu dxuVar2 = (dxu) n3gVar.b.get();
                pwy0 w62 = c0gVar.w6();
                q5z.h(w62);
                ah00 B = c0gVar.B();
                q5z.h(B);
                com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.q qVar = new com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.q(k, d1, r, fyuVar, fvrVar, s, me31Var, i0Var, hVar, aVar, mVar, fcj0Var, lhq0Var2, N5, dVar, W54, pVar, jymVar2, dxuVar2, w62, B, new l141((rqo) zzfVar.C.get()), a2vVar);
                k h = fn6Var.h();
                hpi0 hpi0Var2 = (hpi0) n3gVar.f.get();
                r p = zzfVar.p();
                me31 me31Var2 = (me31) n3gVar.i.get();
                v0v v0vVar = (v0v) n3gVar.g.get();
                fyu fyuVar4 = (fyu) zzfVar.n1.get();
                q5z.h(fyuVar4);
                o7r0 r3 = fn6Var.r();
                b8r o = zzfVar.o();
                c4r0 x0 = c0gVar.x0();
                lhq0 lhq0Var3 = (lhq0) n3gVar.h.get();
                lhq0 lhq0Var4 = (lhq0) n3gVar.h.get();
                pwy0 w63 = c0gVar.w6();
                q5z.h(w63);
                Context H1 = c0gVar.H1();
                q5z.h(H1);
                com.yandex.go.pin.api.widget.b h6 = c0gVar.h6();
                ru.yandex.taxi.design.utils.b d6 = c0gVar.d6();
                ru.yandex.taxi.widget.utils.e f2 = c0gVar.f();
                q5z.h(f2);
                pdc F12 = c0gVar.F1();
                q5z.h(F12);
                hdu hduVar = new hdu(zzfVar.e());
                ru.yandex.taxi.design.utils.a A0 = c0gVar.A0();
                q5z.h(A0);
                com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar2 = new com.yandex.go.taxi.summary.mobilityhub.mapper.b(H1, h6, d6, f2, F12, hduVar, A0);
                tt2 k10 = c0gVar.k();
                q5z.h(k10);
                com.yandex.go.route.interactor.b W55 = c0gVar.W5();
                q5z.h(W55);
                i iVar = new i(lhq0Var4, w63, bVar2, k10, W55);
                ck31 d13 = c0gVar.d1();
                q5z.h(d13);
                ag31 ag31Var = new ag31((pho) c0gVar2.a.a.d0.get());
                HubOpenReason hubOpenReason = (HubOpenReason) n3gVar.o;
                com.yandex.go.route.interactor.b W56 = c0gVar.W5();
                q5z.h(W56);
                dxu dxuVar3 = (dxu) n3gVar.b.get();
                jym jymVar3 = (jym) n3gVar.j.get();
                amp0 i2 = fn6Var.i();
                b2v b2vVar = (b2v) n3gVar.p;
                sy00 x6 = c0gVar.x6();
                c7l0 c7l0Var = new c7l0();
                nm30 nm30Var = new nm30(new jt30((com.yandex.go.zone.repository.o) c0gVar2.a.b.z.q2.get(), new gt30()), new MtPurchaseMapper());
                tw30 tw30Var2 = (tw30) c0gVar.hD.get();
                qr40 qr40Var = (qr40) c0gVar.qd.get();
                q5z.h(qr40Var);
                f fVar = new f(h, hpi0Var2, p, me31Var2, v0vVar, fyuVar4, r3, o, x0, lhq0Var3, iVar, d13, ag31Var, hubOpenReason, str, W56, dxuVar3, jymVar3, i2, a2vVar, b2vVar, x6, c7l0Var, nm30Var, tw30Var2, qr40Var);
                Context H12 = c0gVar.H1();
                q5z.h(H12);
                zuj0 c4 = c0gVar.c();
                q5z.h(c4);
                h3y a3 = i5m.a((h3g) n3gVar.j0);
                a3v j1 = c0gVar.j1();
                q5z.h(j1);
                h3y a4 = i5m.a((h3g) n3gVar.g0);
                h3y a5 = i5m.a((l3g) n3gVar.k0);
                z0a0 M5 = c0gVar.M5();
                ra00 ra00Var = (ra00) c0gVar.u8.get();
                q5z.h(ra00Var);
                t0w0 t0w0Var = new t0w0(i5m.a(c0gVar.be));
                h3y a6 = i5m.a((h3g) n3gVar.l0);
                lk31 h3 = c0gVar.h3();
                x1v x1vVar2 = (x1v) c0gVar.xE.get();
                q5z.h(x1vVar2);
                f1v f1vVar = (f1v) n3gVar.k.get();
                com.yandex.go.route.interactor.b W57 = c0gVar.W5();
                q5z.h(W57);
                qc31Var = new dd31(qVar, fVar, H12, c4, a3, j1, a4, a5, M5, ra00Var, t0w0Var, a6, h3, x1vVar2, w030Var, f1vVar, W57, i5m.a((l3g) n3gVar.m0), (l3g) n3gVar.n0, (vu) fn6Var.i, (h3g) n3gVar.u0, (l3g) n3gVar.v0, fn6Var.h(), (h3g) n3gVar.h0, i5m.a((l3g) n3gVar.w0), i5m.a((l3g) n3gVar.x0), i5m.a((l3g) n3gVar.y0), (ubq0) fn6Var.g, i5m.a((l3g) n3gVar.A0), (aw20) ((n3w) fn6Var.l).a);
                yb31Var = yb31Var;
            } else {
                jl00 jl00Var = (jl00) fn6Var.e;
                oc31 oc31Var = (oc31) ((n3w) fn6Var.b).a;
                kc31 kc31Var = (kc31) ((n3w) fn6Var.c).a;
                com.yandex.go.route.interactor.b W58 = ((c0g) i6rVar).W5();
                q5z.h(W58);
                qc31Var = new qc31(w030Var, jl00Var, oc31Var, kc31Var, W58, i5m.a((h3g) n3gVar.g0), (h3g) n3gVar.h0);
            }
            A(qc31Var, new ac31(yb31Var, j2vVar.a), new vw20(this, j2vVar));
        }
    }
}
