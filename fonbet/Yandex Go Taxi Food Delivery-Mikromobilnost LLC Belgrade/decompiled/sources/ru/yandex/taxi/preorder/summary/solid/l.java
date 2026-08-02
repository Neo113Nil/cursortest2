package ru.yandex.taxi.preorder.summary.solid;

import com.yandex.go.payments.domain.m0;
import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.ad5;
import defpackage.amp0;
import defpackage.aw70;
import defpackage.b580;
import defpackage.biv0;
import defpackage.c4r0;
import defpackage.c521;
import defpackage.c8r;
import defpackage.cjw0;
import defpackage.ck31;
import defpackage.crd;
import defpackage.dmq0;
import defpackage.dqe0;
import defpackage.e3o0;
import defpackage.e6t0;
import defpackage.eid0;
import defpackage.f580;
import defpackage.fbj0;
import defpackage.fco;
import defpackage.fgv0;
import defpackage.fmw0;
import defpackage.fnx0;
import defpackage.fov0;
import defpackage.fpx0;
import defpackage.fwu0;
import defpackage.fy1;
import defpackage.g18;
import defpackage.g580;
import defpackage.gg31;
import defpackage.h3y;
import defpackage.h580;
import defpackage.h610;
import defpackage.hhs0;
import defpackage.hk31;
import defpackage.hpr0;
import defpackage.hrd;
import defpackage.hxx;
import defpackage.i2s;
import defpackage.iox0;
import defpackage.iwe0;
import defpackage.j610;
import defpackage.jk20;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.jst;
import defpackage.kmw0;
import defpackage.krq0;
import defpackage.l3b0;
import defpackage.lmw0;
import defpackage.lo40;
import defpackage.lot0;
import defpackage.m6t0;
import defpackage.mi31;
import defpackage.mnv0;
import defpackage.mo40;
import defpackage.n050;
import defpackage.n3o;
import defpackage.nex0;
import defpackage.noe;
import defpackage.o0m0;
import defpackage.oep0;
import defpackage.ogj0;
import defpackage.osi;
import defpackage.pcm;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.pwy0;
import defpackage.qiv0;
import defpackage.qpt0;
import defpackage.rf5;
import defpackage.rft0;
import defpackage.rgt0;
import defpackage.set0;
import defpackage.sgx0;
import defpackage.t49;
import defpackage.tiv0;
import defpackage.tje;
import defpackage.tlx0;
import defpackage.tq30;
import defpackage.tt2;
import defpackage.u;
import defpackage.uet0;
import defpackage.upj0;
import defpackage.vev0;
import defpackage.vqv0;
import defpackage.vwm;
import defpackage.w511;
import defpackage.wa1;
import defpackage.wc11;
import defpackage.wiq0;
import defpackage.wjm;
import defpackage.x8;
import defpackage.xb80;
import defpackage.xfv0;
import defpackage.xx70;
import defpackage.yfx0;
import defpackage.yvf0;
import defpackage.z880;
import defpackage.zi;
import defpackage.zy11;
import java.util.List;
import ru.yandex.taxi.logistics.safe_flow.DeliverySafeFlowNotification;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;
import ru.yandex.taxi.preorder.summary.solid.interactors.c0;
import ru.yandex.taxi.preorder.summary.solid.interactors.p0;
import ru.yandex.taxi.preorder.summary.solid.interactors.q0;
import ru.yandex.taxi.preorder.summary.solid.interactors.s;
import ru.yandex.taxi.preorder.summary.solid.interactors.v;
import ru.yandex.taxi.preorder.summary.solid.interactors.y;
import ru.yandex.taxi.preorder.summary.solid.interactors.z;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.summary.solid.interactor.t;
import ru.yandex.taxi.summary.topnotification.plus.CompositePaymentNotificationComponent;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes6.dex */
public final class l extends ad5 {
    public final fco A;
    public final ru.yandex.taxi.logistics.safe_flow.a A0;
    public final ck31 B;
    public final ru.yandex.taxi.logistics.payment_method_selector.c B0;
    public final com.yandex.go.route.interactor.b B1;
    public final n3o B2;
    public final uet0 B3;
    public final dqe0 C;
    public final y C0;
    public final noe C1;
    public final rf5 C2;
    public final jk20 C3;
    public final c4r0 D;
    public final z D0;
    public final tt2 E;
    public final vev0 E0;
    public final nex0 F;
    public final tq30 F0;
    public final g580 G;
    public final ru.yandex.taxi.preorder.summary.selector.analytics.a G0;
    public final ogj0 H;
    public final com.yandex.go.taxi.summary.map.walkingroute.e H0;
    public final s H1;
    public final yvf0 H2;
    public final gg31 H3;
    public final h580 I;
    public final com.yandex.go.route.interactor.c I0;
    public final f580 J;
    public final fy1 J0;
    public final yfx0 K;
    public final lot0 K0;
    public final qiv0 L;
    public final osi L0;
    public final crd M;
    public final ru.yandex.taxi.deeplinks.b M0;
    public final ru.yandex.taxi.summary.topnotification.plus.c N;
    public final q0 N0;
    public final xfv0 N1;
    public final oep0 N2;
    public final pcm N3;
    public final hrd O;
    public final n050 O0;
    public final eid0 P;
    public final fgv0 P0;
    public final ru.yandex.taxi.summary.topnotification.plus.d Q;
    public final tiv0 Q0;
    public final j610 R;
    public final t R0;
    public final h610 S;
    public final z880 S0;
    public final t49 T;
    public final xb80 T0;
    public final hhs0 T1;
    public final vqv0 T2;
    public final ru.yandex.taxi.routestats.prefetch.m T3;
    public final ru.yandex.taxi.preorder.summary.solid.interactors.l U;
    public final e6t0 V;
    public final com.yandex.go.taxi.summary.shared.lifecycle.a V1;
    public final rft0 V2;
    public final krq0 V3;
    public final dmq0 W;
    public final fwu0 X1;
    public final qpt0 X2;
    public final mnv0 Z;
    public final wc11 a0;
    public final hk31 b0;
    public final com.yandex.go.taxi.tariffs.interactor.mapselection.a c0;
    public final RequirementsChangedNotifier d0;
    public final vwm e0;
    public final l3b0 f0;
    public final ru.yandex.taxi.summary.personalaction.popup.e g0;
    public final c8r h0;
    public final fpx0 i0;
    public final p0 j0;
    public final ru.yandex.taxi.multiorder.e k0;
    public final aw70 l0;
    public final ru.yandex.taxi.preorder.summary.solid.interactors.g m0;
    public final v n0;
    public final cjw0 o0;
    public final h3y p0;
    public final iwe0 p1;
    public final o0m0 p2;
    public final amp0 q0;
    public final m0 r0;
    public final ru.yandex.taxi.orderbutton.summary.solid.interactors.c s0;
    public final ru.yandex.taxi.summary.solid.preview_card.interactor.a t0;
    public final c521 u0;
    public final iox0 v0;
    public final mo40 v1;
    public final pwy0 v2;
    public final biv0 v3;
    public final fov0 v4;
    public final c0 w0;
    public final wiq0 x;
    public final h3y x0;
    public final ru.yandex.taxi.summary.requirements.list.interactors.d x1;
    public final set0 x2;
    public final hpr0 y;
    public final h3y y0;
    public final wjm y1;
    public final rgt0 y2;
    public final ru.yandex.taxi.summary.solid.repository.f z;
    public final wa1 z0;

    public l(wiq0 wiq0Var, hpr0 hpr0Var, ru.yandex.taxi.summary.solid.repository.f fVar, fco fcoVar, ck31 ck31Var, dqe0 dqe0Var, c4r0 c4r0Var, tt2 tt2Var, nex0 nex0Var, g580 g580Var, ogj0 ogj0Var, h580 h580Var, f580 f580Var, yfx0 yfx0Var, qiv0 qiv0Var, crd crdVar, ru.yandex.taxi.summary.topnotification.plus.c cVar, hrd hrdVar, eid0 eid0Var, ru.yandex.taxi.summary.topnotification.plus.d dVar, j610 j610Var, h610 h610Var, t49 t49Var, ru.yandex.taxi.preorder.summary.solid.interactors.l lVar, e6t0 e6t0Var, dmq0 dmq0Var, mnv0 mnv0Var, wc11 wc11Var, hk31 hk31Var, com.yandex.go.taxi.tariffs.interactor.mapselection.a aVar, RequirementsChangedNotifier requirementsChangedNotifier, vwm vwmVar, l3b0 l3b0Var, ru.yandex.taxi.summary.personalaction.popup.e eVar, c8r c8rVar, fpx0 fpx0Var, p0 p0Var, ru.yandex.taxi.multiorder.e eVar2, aw70 aw70Var, ru.yandex.taxi.preorder.summary.solid.interactors.g gVar, v vVar, cjw0 cjw0Var, h3y h3yVar, amp0 amp0Var, m0 m0Var, ru.yandex.taxi.orderbutton.summary.solid.interactors.c cVar2, ru.yandex.taxi.summary.solid.preview_card.interactor.a aVar2, c521 c521Var, iox0 iox0Var, c0 c0Var, h3y h3yVar2, h3y h3yVar3, wa1 wa1Var, ru.yandex.taxi.logistics.safe_flow.a aVar3, ru.yandex.taxi.logistics.payment_method_selector.c cVar3, y yVar, z zVar, vev0 vev0Var, tq30 tq30Var, ru.yandex.taxi.preorder.summary.selector.analytics.a aVar4, com.yandex.go.taxi.summary.map.walkingroute.e eVar3, com.yandex.go.route.interactor.c cVar4, fy1 fy1Var, lot0 lot0Var, osi osiVar, ru.yandex.taxi.deeplinks.b bVar, q0 q0Var, n050 n050Var, fgv0 fgv0Var, tiv0 tiv0Var, t tVar, z880 z880Var, xb80 xb80Var, iwe0 iwe0Var, mo40 mo40Var, ru.yandex.taxi.summary.requirements.list.interactors.d dVar2, wjm wjmVar, com.yandex.go.route.interactor.b bVar2, noe noeVar, s sVar, xfv0 xfv0Var, hhs0 hhs0Var, com.yandex.go.taxi.summary.shared.lifecycle.a aVar5, fwu0 fwu0Var, o0m0 o0m0Var, pwy0 pwy0Var, set0 set0Var, rgt0 rgt0Var, n3o n3oVar, rf5 rf5Var, yvf0 yvf0Var, oep0 oep0Var, vqv0 vqv0Var, rft0 rft0Var, qpt0 qpt0Var, biv0 biv0Var, uet0 uet0Var, jk20 jk20Var, gg31 gg31Var, pcm pcmVar, ru.yandex.taxi.routestats.prefetch.m mVar, krq0 krq0Var, fov0 fov0Var) {
        super(m6t0.class);
        this.x = wiq0Var;
        this.y = hpr0Var;
        this.z = fVar;
        this.A = fcoVar;
        this.B = ck31Var;
        this.C = dqe0Var;
        this.D = c4r0Var;
        this.E = tt2Var;
        this.F = nex0Var;
        this.G = g580Var;
        this.H = ogj0Var;
        this.I = h580Var;
        this.J = f580Var;
        this.K = yfx0Var;
        this.L = qiv0Var;
        this.M = crdVar;
        this.N = cVar;
        this.O = hrdVar;
        this.P = eid0Var;
        this.Q = dVar;
        this.R = j610Var;
        this.S = h610Var;
        this.T = t49Var;
        this.U = lVar;
        this.V = e6t0Var;
        this.W = dmq0Var;
        this.Z = mnv0Var;
        this.a0 = wc11Var;
        this.b0 = hk31Var;
        this.c0 = aVar;
        this.d0 = requirementsChangedNotifier;
        this.e0 = vwmVar;
        this.f0 = l3b0Var;
        this.g0 = eVar;
        this.h0 = c8rVar;
        this.i0 = fpx0Var;
        this.j0 = p0Var;
        this.k0 = eVar2;
        this.l0 = aw70Var;
        this.m0 = gVar;
        this.n0 = vVar;
        this.o0 = cjw0Var;
        this.p0 = h3yVar;
        this.q0 = amp0Var;
        this.r0 = m0Var;
        this.s0 = cVar2;
        this.t0 = aVar2;
        this.u0 = c521Var;
        this.v0 = iox0Var;
        this.w0 = c0Var;
        this.x0 = h3yVar2;
        this.y0 = h3yVar3;
        this.z0 = wa1Var;
        this.A0 = aVar3;
        this.B0 = cVar3;
        this.C0 = yVar;
        this.D0 = zVar;
        this.E0 = vev0Var;
        this.F0 = tq30Var;
        this.G0 = aVar4;
        this.H0 = eVar3;
        this.I0 = cVar4;
        this.J0 = fy1Var;
        this.K0 = lot0Var;
        this.L0 = osiVar;
        this.M0 = bVar;
        this.N0 = q0Var;
        this.O0 = n050Var;
        this.P0 = fgv0Var;
        this.Q0 = tiv0Var;
        this.R0 = tVar;
        this.S0 = z880Var;
        this.T0 = xb80Var;
        this.p1 = iwe0Var;
        this.v1 = mo40Var;
        this.x1 = dVar2;
        this.y1 = wjmVar;
        this.B1 = bVar2;
        this.C1 = noeVar;
        this.H1 = sVar;
        this.N1 = xfv0Var;
        this.T1 = hhs0Var;
        this.V1 = aVar5;
        this.X1 = fwu0Var;
        this.p2 = o0m0Var;
        this.v2 = pwy0Var;
        this.x2 = set0Var;
        this.y2 = rgt0Var;
        this.B2 = n3oVar;
        this.C2 = rf5Var;
        this.H2 = yvf0Var;
        this.N2 = oep0Var;
        this.T2 = vqv0Var;
        this.V2 = rft0Var;
        this.X2 = qpt0Var;
        this.v3 = biv0Var;
        this.B3 = uet0Var;
        this.C3 = jk20Var;
        this.H3 = gg31Var;
        this.N3 = pcmVar;
        this.T3 = mVar;
        this.V3 = krq0Var;
        this.v4 = fov0Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        this.y.b(null, this.z);
        this.O.a.c(CompositePaymentNotificationComponent.NOTIFICATION_ID);
        this.P.a();
        this.S.a();
        super.Cg();
        mnv0 mnv0Var = this.Z;
        mnv0Var.f.g.b();
        mnv0Var.d.a = new zi(21);
        this.w0.c();
        g18 g18Var = this.v0.g;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.A0.a.c(DeliverySafeFlowNotification.NOTIFICATION_ID);
        y yVar = this.C0;
        boolean z = yVar.d.a.c;
        i2s i2sVar = yVar.d;
        if (z) {
            i2sVar.a.c = false;
        } else {
            i2sVar.a.b = false;
        }
    }

    public final void Kg(String str, b580 b580Var) {
        String b = this.K0.b(str);
        if (b != null) {
            b580Var = b580.a(b580Var, null, null, b, 31);
        }
        g580 g580Var = this.G;
        ((x8) g580Var).c(b580Var, true);
        this.H.a.g(new fbj0(str, 4));
        ((x8) g580Var).a();
        ((m6t0) Dg()).W2(str);
    }

    public final void Lg(upj0 upj0Var, boolean z) {
        tje.N(Jg(), null, null, new SolidSummaryPresenter$followTariffRedirect$1(this, upj0Var, z, null), 3);
    }

    public final void Mg(SummaryExpandReason summaryExpandReason) {
        String str;
        com.yandex.go.taxi.tariffs.internal.repository.k kVar = (com.yandex.go.taxi.tariffs.internal.repository.k) this.x;
        pex0 m = kVar.m();
        if (m == null) {
            jst.e.k(new NullPointerException(), "Selected tariff should not be null");
            str = null;
        } else {
            str = m.b;
        }
        pex0 m2 = kVar.m();
        List f = m2 != null ? m2.f() : null;
        this.e0.getClass();
        if (m == null || !m.B || f == null || f.size() != 1) {
            ((m6t0) Dg()).d7(summaryExpandReason);
            return;
        }
        lmw0 lmw0Var = (lmw0) f.get(0);
        if (str == null) {
            jst.e.k(new NullPointerException(), "Tariff class is null. Do not show requirement selector.");
        } else {
            Qg(lmw0Var, str, this.I.a());
        }
    }

    public final void Ng(SummaryExpandReason summaryExpandReason) {
        mi31 mi31Var;
        this.V.d(summaryExpandReason);
        this.X1.getClass();
        fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.x).n();
        if (n == null || (mi31Var = n.a) == null || !mi31Var.a.K0) {
            return;
        }
        String str = mi31Var.b;
        mo40 mo40Var = this.v1;
        lo40 lo40Var = mo40Var.a;
        boolean z = lo40Var.a;
        if (jl40.l(lo40Var.b, str)) {
            lo40Var.a = false;
            mo40Var.b.g(zy11.a);
        }
        if (z) {
            this.p2.a(SavePersonalStateNotifier$SavePersonalStateReason.SUMMARY_BUTTON_EXPAND_CARD);
        }
    }

    public final void Og(CommentViewSource commentViewSource) {
        ((pep0) this.N2).f(new xx70(10, (u) this.H2.get(), new e3o0(28, this)), new defpackage.z(commentViewSource), hxx.a);
    }

    public final void Pg(String str, String str2) {
        if (str2 != null) {
            Lg(new upj0(new tlx0(str, str2, null)), true);
        } else {
            c4r0.e(this.D, SelectionOrigin.REDIRECT, str, null, 12);
        }
    }

    public final void Qg(lmw0 lmw0Var, String str, ru.yandex.taxi.requirements.repository.a aVar) {
        if (lmw0Var instanceof kmw0) {
            Lg(new upj0(((kmw0) lmw0Var).h), true);
            return;
        }
        if (!(lmw0Var instanceof jmw0)) {
            if (lmw0Var instanceof fmw0) {
                return;
            }
            w511.b();
        } else if (lmw0Var.f()) {
            Lg(new upj0(new tlx0(str, lmw0Var.getName(), null)), true);
        } else {
            ((m6t0) Dg()).Ie((jmw0) lmw0Var, aVar);
        }
    }

    public final void Rg(mi31 mi31Var, SummaryExpandReason summaryExpandReason) {
        if (mi31Var == null) {
            jst.e.k(new IllegalArgumentException("null tariff has passed, skip redirect"), "null tariff has passed, skip redirect");
            return;
        }
        m6t0 m6t0Var = (m6t0) Dg();
        sgx0 sgx0Var = mi31Var.a.J0;
        m6t0Var.h2(summaryExpandReason);
    }
}
