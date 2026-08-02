package defpackage;

import android.content.Context;
import com.yandex.go.payments.transport.domain.a;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardCloseReason;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardOpenReason;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.datasource.routing.f;
import ru.yandex.taxi.masstransit.domain.g;
import ru.yandex.taxi.masstransit.domain.h0;
import ru.yandex.taxi.masstransit.domain.y;
import ru.yandex.taxi.masstransit.holder.c;
import ru.yandex.taxi.masstransit.mapper.b;
import ru.yandex.taxi.masstransit.router.MtRoutesModalBackPressHelper$BackPressAction;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.MtCollapsedRoutesView;
import ru.yandex.taxi.masstransit.ui.route.modal.collapsed.d;
import ru.yandex.taxi.masstransit.ui.route.modal.expanded.MtExpandedRoutesView;
import ru.yandex.taxi.multiorder.e;

/* loaded from: classes6.dex */
public final class vx30 extends m230 {
    public final w030 E;
    public final yvf0 F;
    public final y50 G;
    public final yvf0 H;
    public final v920 I;
    public final yw30 J;
    public final yvf0 K;
    public final f L;
    public final dj30 M;
    public final yvf0 N;
    public final yvf0 O;
    public final h3y P;
    public final zuj0 Q;
    public final wu30 R;
    public final h3y S;
    public final yvf0 T;
    public MtRoutesModalView U;

    public vx30(w030 w030Var, h0z h0zVar, y50 y50Var, yvf0 yvf0Var, v920 v920Var, yw30 yw30Var, c8w c8wVar, f fVar, dj30 dj30Var, o08 o08Var, x0z x0zVar, h3y h3yVar, zuj0 zuj0Var, wu30 wu30Var, h3y h3yVar2, v3g v3gVar) {
        super(null);
        this.E = w030Var;
        this.F = h0zVar;
        this.G = y50Var;
        this.H = yvf0Var;
        this.I = v920Var;
        this.J = yw30Var;
        this.K = c8wVar;
        this.L = fVar;
        this.M = dj30Var;
        this.N = o08Var;
        this.O = x0zVar;
        this.P = h3yVar;
        this.Q = zuj0Var;
        this.R = wu30Var;
        this.S = h3yVar2;
        this.T = v3gVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.U = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ix30 ix30Var = (ix30) obj;
        MtRoutesModalView mtRoutesModalView = this.U;
        if (mtRoutesModalView != null) {
            mtRoutesModalView.setOnBackPressedListener(new sf30(5, this));
        }
        fx30 fx30Var = ix30Var.a;
        if (!fx30Var.equals(qtb1.H)) {
            if (!(fx30Var instanceof ex30)) {
                w511.b();
                return;
            }
            su30 d = this.L.d();
            if (d != null) {
                boolean e = cta1.e(d);
                MtDetailRouteCardOpenReason mtDetailRouteCardOpenReason = ((ex30) fx30Var).a;
                this.M.a(e, wtb1.e(mtDetailRouteCardOpenReason), wtb1.f(mtDetailRouteCardOpenReason), wtb1.d(d.a));
            }
        }
        z((m950) this.H.get(), sy60.Q2);
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return false;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i;
        fx30 fx30Var = ((ix30) obj).a;
        if (fx30Var.equals(qtb1.H)) {
            i = 6;
        } else {
            if (!(fx30Var instanceof ex30)) {
                w511.b();
                return null;
            }
            i = 3;
        }
        int i2 = i;
        fl10 fl10Var = new fl10(this);
        v920 v920Var = this.I;
        wrr wrrVar = ((kx30) v920Var.b).a;
        jx30 jx30Var = new jx30(fl10Var, (xj30) ((xvf0) wrrVar.b).get(), (e) ((xvf0) wrrVar.c).get(), (h0) ((x0z) wrrVar.w).get(), (yw30) ((zw30) wrrVar.x).get(), (dj30) ((xvf0) wrrVar.y).get(), (zj30) ((ret) wrrVar.z).get(), (f) ((xvf0) wrrVar.A).get());
        ze30 ze30Var = (ze30) v920Var.c;
        t3g t3gVar = ((pe30) v920Var.w).a;
        d dVar = new d(fl10Var, (nc30) ((c0j) t3gVar.e).get(), (h0) ((x0z) t3gVar.g).get(), (c) ((x0z) t3gVar.f).get(), (yw30) ((zw30) t3gVar.h).get(), (sy00) ((xvf0) t3gVar.a).get(), (dj30) ((xvf0) t3gVar.b).get(), (ru.yandex.taxi.address.repository.f) ((xvf0) t3gVar.c).get(), (tu30) ((xvf0) t3gVar.d).get(), (sq30) ((xvf0) t3gVar.i).get(), (ag31) ((nb11) t3gVar.j).get(), (xcv0) ((vrt0) t3gVar.k).get(), (nv20) ((xvf0) t3gVar.l).get(), (y) ((xvf0) t3gVar.m).get(), (v011) ((xvf0) t3gVar.n).get(), (s111) ((xvf0) t3gVar.o).get(), (mb11) ((nb11) t3gVar.p).get(), (ru.yandex.taxi.masstransit.paymentcards.c) ((ret) t3gVar.q).get(), (a) ((xvf0) t3gVar.r).get(), (b540) ((xvf0) t3gVar.s).get(), (tj60) ((xvf0) t3gVar.t).get(), (zuj0) ((v3g) t3gVar.u).get(), (g610) ((xvf0) t3gVar.v).get(), (Context) ((xvf0) t3gVar.w).get(), (wu30) ((xvf0) t3gVar.x).get());
        hoa hoaVar = ze30Var.a;
        MtCollapsedRoutesView mtCollapsedRoutesView = new MtCollapsedRoutesView(dVar, (w440) hoaVar.d.a, (qgu0) hoaVar.a.get(), (Context) hoaVar.b.get(), (lk31) hoaVar.c.get());
        rj30 rj30Var = (rj30) v920Var.x;
        st0 st0Var = ((mj30) v920Var.y).a;
        lj30 lj30Var = new lj30(fl10Var, (tt2) ((u3g) st0Var.y).get(), (b) ((ys10) st0Var.z).get(), (f) ((xvf0) st0Var.a).get(), (yw30) ((zw30) st0Var.A).get(), (ru.yandex.taxi.design.utils.b) ((xvf0) st0Var.b).get(), (g) ((di20) st0Var.B).get(), (wr30) ((bhx) st0Var.C).get(), (v011) ((xvf0) st0Var.c).get(), (s111) ((xvf0) st0Var.w).get(), (mb11) ((nb11) st0Var.D).get(), (wu30) ((xvf0) st0Var.x).get());
        gus gusVar = rj30Var.a;
        MtRoutesModalView mtRoutesModalView = new MtRoutesModalView((Context) v920Var.a, i2, jx30Var, mtCollapsedRoutesView, new MtExpandedRoutesView(lj30Var, (c2x0) gusVar.a.get(), (Context) gusVar.b.get()));
        this.U = mtRoutesModalView;
        return mtRoutesModalView;
    }

    public final void T() {
        MtRoutesModalView mtRoutesModalView = this.U;
        if (mtRoutesModalView == null) {
            return;
        }
        int i = ux30.a[(mtRoutesModalView.isExpanded() ? MtRoutesModalBackPressHelper$BackPressAction.Collapse : MtRoutesModalBackPressHelper$BackPressAction.GoBack).ordinal()];
        if (i == 1) {
            this.J.a(MtDetailRouteCardCloseReason.SYSTEM_BACK_BUTTON, TransportRouteAnalytics$DetailCardSource.Transport, TransportRouteAnalytics$DetailCardType.Horizontal);
            mtRoutesModalView.collapse();
        } else if (i == 2) {
            r(new qu(9));
        } else {
            w511.b();
        }
    }
}
