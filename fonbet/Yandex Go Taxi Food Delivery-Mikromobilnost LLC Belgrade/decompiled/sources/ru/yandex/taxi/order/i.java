package ru.yandex.taxi.order;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.go.taxi.order.search.v2.interactor.LongSearchV2Interactor$handleActiveOrder$$inlined$collectIn$1;
import defpackage.an91;
import defpackage.b2k;
import defpackage.b64;
import defpackage.b6y0;
import defpackage.bv6;
import defpackage.bwi;
import defpackage.bx70;
import defpackage.ci70;
import defpackage.ck31;
import defpackage.d1s;
import defpackage.dai;
import defpackage.f9x;
import defpackage.fm40;
import defpackage.fv6;
import defpackage.g18;
import defpackage.g6y0;
import defpackage.ga80;
import defpackage.h3y;
import defpackage.h760;
import defpackage.ha80;
import defpackage.hc00;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.i6y0;
import defpackage.ic00;
import defpackage.iez;
import defpackage.ike;
import defpackage.jc00;
import defpackage.jgd;
import defpackage.jl40;
import defpackage.jqz;
import defpackage.jst;
import defpackage.k1l0;
import defpackage.kc00;
import defpackage.koz0;
import defpackage.l0g;
import defpackage.l1t;
import defpackage.l8x;
import defpackage.m950;
import defpackage.mjg0;
import defpackage.mnz;
import defpackage.n080;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.op70;
import defpackage.pep0;
import defpackage.ps70;
import defpackage.pzt0;
import defpackage.qa80;
import defpackage.qc5;
import defpackage.qs70;
import defpackage.qv10;
import defpackage.ra80;
import defpackage.s8t0;
import defpackage.s8x;
import defpackage.seh0;
import defpackage.sly;
import defpackage.sny;
import defpackage.tje;
import defpackage.tly;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uhx;
import defpackage.uyj;
import defpackage.v7j0;
import defpackage.vc80;
import defpackage.vng;
import defpackage.vo0;
import defpackage.wl40;
import defpackage.wvy;
import defpackage.ww70;
import defpackage.x980;
import defpackage.xvf0;
import defpackage.xvr0;
import defpackage.xw70;
import defpackage.y0l0;
import defpackage.y980;
import defpackage.yh70;
import defpackage.yvf0;
import defpackage.yw70;
import defpackage.yy70;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import ru.yandex.taxi.appdelegates.SupportedOrderType;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public final class i extends qc5 implements vo0 {
    public final ci70 A;
    public kotlinx.coroutines.c A0;
    public final com.yandex.go.taxi.order.provider.a B;
    public kotlinx.coroutines.c B0;
    public final d C;
    public g18 C0;
    public final l1t D;
    public pzt0 D0;
    public final v7j0 E;
    public kotlinx.coroutines.c E0;
    public final y980 F;
    public final ArrayList F0;
    public final ru.yandex.taxi.order.location.a G;
    public OrderScreen G0;
    public final ru.yandex.taxi.superapp.address.i H;
    public n080 H0;
    public final ha80 I;
    public boolean I0;
    public final x980 J;
    public final ArrayList J0;
    public final com.yandex.go.overdraft.ui.g K;
    public final i3y K0;
    public final fm40 L;
    public final bx70 L0;
    public final com.yandex.go.taxi.order.view.l M;
    public final com.yandex.go.superapp.order.multi.old.provider.g N;
    public final h760 O;
    public final vc80 P;
    public final ck31 Q;
    public final ru.yandex.taxi.checkin.i R;
    public final ru.yandex.taxi.preorder.source.domain.a S;
    public final mnz T;
    public final com.yandex.go.taxi.order.search.domain.interactor.a U;
    public final com.yandex.go.taxi.order.search.ui.c V;
    public final xvr0 W;
    public final ru.yandex.taxi.linked_order.provider.h Z;
    public final fv6 a0;
    public final ps70 b0;
    public final com.yandex.go.taxi.order.multi.feed.domain.a c0;
    public final wvy d0;
    public final f0 e0;
    public final jc00 f0;
    public final s8t0 g0;
    public final k1l0 h0;
    public final oep0 i0;
    public final d1s j0;
    public final y0l0 k0;
    public final h3y l0;
    public final yvf0 m0;
    public final yvf0 n0;
    public final koz0 o0;
    public final mjg0 p0;
    public final h3y q0;
    public final com.yandex.go.taxi.order.common.f r0;
    public final com.yandex.go.taxi.tariffs.interactor.i s0;
    public final h3y t0;
    public final com.yandex.go.location.domain.a u0;
    public final h3y v0;
    public final com.yandex.go.taxi.order.perf.experiment.d w0;
    public final com.yandex.go.taxi.order.perf.a x0;
    public o2y0 y0;
    public g18 z0;

    public i(Lifecycle lifecycle, ci70 ci70Var, com.yandex.go.taxi.order.provider.a aVar, d dVar, l1t l1tVar, v7j0 v7j0Var, y980 y980Var, ru.yandex.taxi.order.location.a aVar2, ru.yandex.taxi.superapp.address.i iVar, ha80 ha80Var, x980 x980Var, com.yandex.go.overdraft.ui.g gVar, fm40 fm40Var, com.yandex.go.taxi.order.view.l lVar, com.yandex.go.superapp.order.multi.old.provider.g gVar2, h760 h760Var, vc80 vc80Var, ck31 ck31Var, ru.yandex.taxi.checkin.i iVar2, ru.yandex.taxi.preorder.source.domain.a aVar3, mnz mnzVar, com.yandex.go.taxi.order.search.domain.interactor.a aVar4, com.yandex.go.taxi.order.search.ui.c cVar, xvr0 xvr0Var, ru.yandex.taxi.linked_order.provider.h hVar, fv6 fv6Var, ps70 ps70Var, com.yandex.go.taxi.order.multi.feed.domain.a aVar5, wvy wvyVar, f0 f0Var, jc00 jc00Var, s8t0 s8t0Var, k1l0 k1l0Var, oep0 oep0Var, d1s d1sVar, y0l0 y0l0Var, h3y h3yVar, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, koz0 koz0Var, mjg0 mjg0Var, h3y h3yVar2, com.yandex.go.taxi.order.common.f fVar, com.yandex.go.taxi.tariffs.interactor.i iVar3, h3y h3yVar3, com.yandex.go.location.domain.a aVar6, h3y h3yVar4, com.yandex.go.taxi.order.perf.experiment.d dVar2, com.yandex.go.taxi.order.perf.a aVar7) {
        super(ww70.class, lifecycle);
        this.A = ci70Var;
        this.B = aVar;
        this.C = dVar;
        this.D = l1tVar;
        this.E = v7j0Var;
        this.F = y980Var;
        this.G = aVar2;
        this.H = iVar;
        this.I = ha80Var;
        this.J = x980Var;
        this.K = gVar;
        this.L = fm40Var;
        this.M = lVar;
        this.N = gVar2;
        this.O = h760Var;
        this.P = vc80Var;
        this.Q = ck31Var;
        this.R = iVar2;
        this.S = aVar3;
        this.T = mnzVar;
        this.U = aVar4;
        this.V = cVar;
        this.W = xvr0Var;
        this.Z = hVar;
        this.a0 = fv6Var;
        this.b0 = ps70Var;
        this.c0 = aVar5;
        this.d0 = wvyVar;
        this.e0 = f0Var;
        this.f0 = jc00Var;
        this.g0 = s8t0Var;
        this.h0 = k1l0Var;
        this.i0 = oep0Var;
        this.j0 = d1sVar;
        this.k0 = y0l0Var;
        this.l0 = h3yVar;
        this.m0 = yvf0Var2;
        this.n0 = yvf0Var3;
        this.o0 = koz0Var;
        this.p0 = mjg0Var;
        this.q0 = h3yVar2;
        this.r0 = fVar;
        this.s0 = iVar3;
        this.t0 = h3yVar3;
        this.u0 = aVar6;
        this.v0 = h3yVar4;
        this.w0 = dVar2;
        this.x0 = aVar7;
        dai daiVar = g18.u1;
        this.z0 = daiVar;
        s8x s8xVar = f9x.b;
        this.A0 = s8xVar;
        this.B0 = s8xVar;
        this.C0 = daiVar;
        this.E0 = s8xVar;
        this.F0 = new ArrayList();
        this.J0 = new ArrayList();
        this.K0 = kotlin.a.b(LazyThreadSafetyMode.NONE, new jgd(yvf0Var, 1));
        this.L0 = new bx70(this);
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.I0 = false;
        jst.e.getClass();
        ArrayList arrayList = this.F0;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                ((l8x) it.next()).a(null);
            }
        }
        arrayList.clear();
        this.C0.cancel();
        pzt0 pzt0Var = this.D0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.D0 = null;
        n080 n080Var = this.H0;
        if (n080Var != null) {
            n080Var.stop();
        }
        com.yandex.go.taxi.order.common.f fVar = this.r0;
        fVar.F.a(null);
        fVar.A = null;
        fVar.B = null;
        fVar.C = false;
        com.yandex.go.taxi.order.promotions.router.a aVar = fVar.b;
        pzt0 pzt0Var2 = aVar.a.h;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = aVar.j;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        ((ru.yandex.taxi.altpins.order.i) fVar.d).d.b();
        ((jqz) fVar.e).a();
        com.yandex.go.taxi.order.change.common.domain.d dVar = fVar.f;
        com.yandex.go.taxi.order.change.common.data.d dVar2 = dVar.a;
        dVar2.i.clear();
        dVar2.g.b();
        dVar.b.d.b();
        pzt0 pzt0Var4 = fVar.h.c;
        if (pzt0Var4 != null) {
            pzt0Var4.a(null);
        }
        com.yandex.go.taxi.order.communications.analytics.realtime.a aVar2 = fVar.w;
        aVar2.e.b();
        if (aVar2.f) {
            aVar2.b.c.b();
        }
        this.I.e.clear();
        this.B0.a(null);
        ru.yandex.taxi.linked_order.provider.h hVar = this.Z;
        hVar.c.b();
        hVar.b = wl40.j;
        ((com.yandex.go.taxi.order.details.v2.fallback.common.a) ((com.yandex.go.taxi.order.details.v2.core.d) this.q0.get()).c.get()).d.clear();
        this.E0.a(null);
        com.yandex.go.taxi.order.chat.navigation.a aVar3 = (com.yandex.go.taxi.order.chat.navigation.a) this.t0.get();
        OrderFragmentPresenter$detachView$2 orderFragmentPresenter$detachView$2 = new OrderFragmentPresenter$detachView$2(1, Dg(), ww70.class, "findViewById", "findViewById(I)Landroid/view/View;", 0);
        aVar3.g.b();
        aVar3.e.g.b();
        Object invoke = orderFragmentPresenter$detachView$2.invoke(Integer.valueOf(seh0.messenger_webview_preload_container));
        ViewGroup viewGroup = invoke instanceof ViewGroup ? (ViewGroup) invoke : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        jst.e.getClass();
        d dVar = this.r0.m;
        dVar.j.b();
        pzt0 pzt0Var = dVar.o;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.o = null;
        pzt0 pzt0Var2 = this.M.l;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        n080 n080Var = this.H0;
        if (n080Var != null) {
            n080Var.d(true);
        }
        ru.yandex.taxi.preorder.source.domain.a aVar = this.S;
        if (jl40.l(aVar.h, this)) {
            aVar.g.b();
            aVar.h = null;
        }
        mnz mnzVar = this.T;
        mnzVar.a();
        pzt0 pzt0Var3 = mnzVar.g;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        mnzVar.g = null;
        this.U.b();
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        jst.e.getClass();
        com.yandex.go.taxi.order.common.f fVar = this.r0;
        tje.N(Kg(), null, null, new OrderFragmentPresenter$onResume$$inlined$safeCollectIn$1(fVar.E, null, this), 3);
        tse Kg = Kg();
        op70 op70Var = new op70(2, this);
        op70 op70Var2 = new op70(3, this.J);
        com.yandex.go.taxi.order.view.l lVar = this.M;
        fVar.b(Kg, lVar.g(op70Var, op70Var2));
        lVar.e();
        fVar.A = new xw70(this, 0);
        n080 n080Var = this.H0;
        if (n080Var != null) {
            n080Var.resume();
        }
        this.S.a(this);
        tje.N(Jg(), null, null, new OrderFragmentPresenter$listenDeactivatedOrdersEvent$$inlined$safeCollectIn$1(new ru.yandex.taxi.widgets.data.repository.f(new ru.yandex.taxi.widgets.data.repository.d((tpr) this.W.a.getValue())), null, this), 3);
        tpr t = kotlinx.coroutines.flow.e.t(this.N.b.k);
        SupportedOrderType supportedOrderType = SupportedOrderType.TAXI;
        tje.N(Jg(), null, null, new OrderFragmentPresenter$listenDeactivatedOrdersEvent$$inlined$safeCollectIn$2(t, null, this), 3);
        tje.N(Jg(), null, null, new OrderFragmentPresenter$onResume$$inlined$safeCollectIn$2(this.H.b(), null, this), 3);
        tje.N(Kg(), null, null, new OrderFragmentPresenter$onResume$7(this, null), 3);
        Ng();
        o2y0 o2y0Var = this.y0;
        if (o2y0Var != null) {
            Tg(o2y0Var);
            Ug();
            Mg(o2y0Var);
        }
    }

    public final void Jb(o2y0 o2y0Var) {
        String str = o2y0Var.b().a;
        yh70 yh70Var = this.A.f;
        yh70Var.getClass();
        yh70Var.a.a("openPaymentMethod", new HashMap(), 1, new HashMap());
        ((pep0) this.i0).f((m950) this.K0.getValue(), o2y0Var, hxx.a);
    }

    @Override // defpackage.qc5
    public final void Lg() {
        jst.e.getClass();
        this.z0.cancel();
        this.A0.a(null);
        n080 n080Var = this.H0;
        if (n080Var != null) {
            n080Var.stop();
        }
    }

    public final void Mg(o2y0 o2y0Var) {
        this.E0.a(null);
        com.yandex.go.taxi.order.queue.interactor.c cVar = (com.yandex.go.taxi.order.queue.interactor.c) this.p0;
        cVar.getClass();
        this.E0 = tje.N(Kg(), null, null, new OrderFragmentPresenter$addQueueCardCollapseSubscription$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.queue.interactor.b(o2y0Var.a(), cVar)), null, this), 3);
    }

    public final void Ng() {
        o2y0 o2y0Var = this.y0;
        if (o2y0Var == null) {
            return;
        }
        d1s d1sVar = this.j0;
        tje.N(Kg(), null, null, new OrderFragmentPresenter$addShowForceDestinationDialogSubscription$$inlined$safeCollectIn$1(new com.yandex.go.taxi.order.provider.e(d1sVar.a.b(o2y0Var), d1sVar), null, this, o2y0Var), 3);
    }

    public final void Og(boolean z) {
        Object obj;
        tly a;
        sny snyVar;
        this.a0.getClass();
        ic00 ic00Var = ((kc00) this.f0).a;
        ic00Var.getClass();
        boolean z2 = ic00Var instanceof hc00;
        x980 x980Var = this.J;
        com.yandex.go.taxi.order.view.l lVar = this.M;
        if (z2) {
            if (z) {
                OrderScreen orderScreen = ((ra80) lVar.j.getValue()).a;
                if (orderScreen == OrderScreen.ORDER_DETAILS || orderScreen == OrderScreen.ORDER_TRACKING || orderScreen == OrderScreen.ORDER_LIST) {
                    ((f) x980Var).h0();
                    return;
                }
                return;
            }
            return;
        }
        if (this.N.d()) {
            ((ww70) Dg()).X2();
            return;
        }
        ru.yandex.taxi.linked_order.provider.h hVar = this.Z;
        String str = null;
        if (!hVar.a.d()) {
            Iterator it = hVar.b.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((sly) obj).a() != null) {
                        break;
                    }
                }
            }
            sly slyVar = (sly) obj;
            if (slyVar != null && (a = slyVar.a()) != null && (snyVar = a.c) != null) {
                str = snyVar.a;
            }
        }
        hVar.b = wl40.j;
        if (str == null || str.length() == 0) {
            ((f) x980Var).t0();
        } else if (lVar.b() == OrderScreen.ORDER_LIST) {
            this.M.h(OrderScreen.LINKED_ORDER_DETAILS, false, new qa80(str), DetailsOpenReason.FINISHED_LINKED_ORDER, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0145, code lost:
    
        if (r9 != com.yandex.go.taxi.order.models.api.screen.OrderScreen.BUNDLED_ORDER_DETAILS) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        if (defpackage.jl40.l(r11.b().a, r10 != null ? r10.b().a : null) != false) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Pg(OrderScreen orderScreen, o2y0 o2y0Var, o2y0 o2y0Var2) {
        n080 n080Var;
        n080 n080Var2;
        n080 n080Var3;
        if (!Eg()) {
            jst.e.e("TaxiOrder.Navigation.invalidateMapOverlay", "OrderFragmentPresenter", new IllegalStateException("::invalidateMapOverlay was called on detached fragment"));
            return;
        }
        if (this.w0.b().h && o2y0Var2 != null && o2y0Var != null && jl40.l(o2y0Var2.b().a, o2y0Var.b().a)) {
            OrderScreen orderScreen2 = this.G0;
            OrderScreen orderScreen3 = OrderScreen.ORDER_TRACKING;
            if (orderScreen2 == orderScreen3 && orderScreen == OrderScreen.ORDER_DETAILS) {
                return;
            }
            if (orderScreen2 == OrderScreen.ORDER_DETAILS && orderScreen == orderScreen3) {
                return;
            }
            if (orderScreen2 != null && orderScreen2 == orderScreen) {
                return;
            }
        }
        this.G0 = orderScreen;
        int i = yw70.a[orderScreen.ordinal()];
        x980 x980Var = this.J;
        bx70 bx70Var = this.L0;
        fm40 fm40Var = this.L;
        boolean z = false;
        if (i == 1) {
            n080 n080Var4 = fm40Var.b;
            n080Var = n080Var4;
            if (n080Var4 == null) {
                yy70 yy70Var = (yy70) ((xvf0) fm40Var.a(bx70Var, x980Var).d).get();
                fm40Var.b = yy70Var;
                n080Var = yy70Var;
            }
        } else {
            if (i == 2 || i == 3) {
                Wg(false, false);
                n080 n080Var5 = this.H0;
                if (n080Var5 != null) {
                    n080Var5.d(true);
                }
                n080 n080Var6 = this.H0;
                if (n080Var6 != null) {
                    n080Var6.stop();
                }
                this.H0 = null;
                return;
            }
            if (i == 4) {
                bv6 bv6Var = fm40Var.c;
                bv6 bv6Var2 = bv6Var;
                if (bv6Var == null) {
                    bv6 bv6Var3 = (bv6) ((xvf0) fm40Var.a(bx70Var, x980Var).e).get();
                    fm40Var.c = bv6Var3;
                    bv6Var2 = bv6Var3;
                }
                Wg(false, false);
                n080Var = bv6Var2;
            } else {
                if (o2y0Var == null) {
                    if (orderScreen == OrderScreen.ORDER_DETAILS || orderScreen == OrderScreen.ORDER_TRACKING || orderScreen == OrderScreen.ORDER_LIST) {
                        jst.e.a(15, "TaxiOrder.Navigation", new IllegalStateException("Active order holder can not be null"), null);
                        return;
                    }
                    return;
                }
                Pair a = this.I.a(o2y0Var);
                ga80 ga80Var = (ga80) a.c();
                if (((Boolean) a.f()).booleanValue()) {
                    ((ww70) Dg()).I8(ga80Var);
                }
                n080Var = (com.yandex.go.taxi.order.superapp.orders.multi.c) ((l0g) ga80Var).l.get();
            }
        }
        List l = this.B.l();
        boolean i2 = !l.isEmpty() ? an91.i(((o2y0) b64.c(1, l)).c()) : false;
        o2y0 o2y0Var3 = this.y0;
        boolean Qg = Qg(o2y0Var3 != null ? o2y0Var3.c() : null);
        o2y0 o2y0Var4 = this.y0;
        if (an91.i(o2y0Var4 != null ? o2y0Var4.c() : null)) {
            if (an91.i(o2y0Var2 != null ? o2y0Var2.c() : null)) {
            }
        }
        z = true;
        if ((this.H0 instanceof com.yandex.go.taxi.order.superapp.orders.multi.c) && (n080Var instanceof com.yandex.go.taxi.order.superapp.orders.multi.c)) {
            if (o2y0Var2 != null) {
            }
            if (!this.I0) {
                this.I0 = true;
                ((i6y0) ((g6y0) this.v0.get())).b(new b6y0(TaxiOrderSessionCheckpoint.MAP));
            }
            n080Var2 = this.H0;
            if (n080Var2 != null) {
                n080Var2.a(i2);
            }
            if (orderScreen != OrderScreen.ORDER_DETAILS || orderScreen == OrderScreen.ORDER_TRACKING) {
                Wg(i2, Qg);
            }
            if (this.c || (n080Var3 = this.H0) == null) {
            }
            n080Var3.resume();
            return;
        }
        n080 n080Var7 = this.H0;
        if (n080Var7 != null) {
            n080Var7.d(z);
        }
        n080 n080Var8 = this.H0;
        if (n080Var8 != null) {
            n080Var8.stop();
        }
        this.H0 = n080Var;
        if (!this.I0) {
        }
        n080Var2 = this.H0;
        if (n080Var2 != null) {
        }
        if (orderScreen != OrderScreen.ORDER_DETAILS) {
        }
        Wg(i2, Qg);
        if (this.c) {
        }
    }

    public final boolean Qg(DriveState driveState) {
        TaxiOrder b;
        OrderStatusInfo V;
        if (driveState == null) {
            return false;
        }
        boolean i = an91.i(driveState);
        o2y0 o2y0Var = this.y0;
        if (o2y0Var == null) {
            return !i;
        }
        OrderStatusInfo.AlternativeDestination alternativeDestination = (o2y0Var == null || (b = o2y0Var.b()) == null || (V = b.V()) == null) ? null : V.j0;
        return alternativeDestination != null ? alternativeDestination.f == null && !i : !i;
    }

    public final void Rg(boolean z) {
        n080 n080Var = this.H0;
        if (n080Var == null) {
            return;
        }
        if (z) {
            n080Var.c();
        } else {
            n080Var.b();
        }
    }

    public final void Sg(o2y0 o2y0Var) {
        if (o2y0Var == null || jl40.l(this.y0, o2y0Var)) {
            return;
        }
        o2y0 o2y0Var2 = this.y0;
        boolean z = o2y0Var2 == null;
        this.y0 = o2y0Var;
        if (Eg() && !this.w0.b().g) {
            ((ww70) Dg()).I8((ga80) this.I.a(o2y0Var).c());
            this.r0.c((ike) Jg(), o2y0Var2);
            Vg(o2y0Var.c());
        }
        if (this.c) {
            Tg(o2y0Var);
            Ug();
            if (z) {
                Ng();
            }
            Mg(o2y0Var);
        }
    }

    public final void Tg(o2y0 o2y0Var) {
        tse Jg = Jg();
        mnz mnzVar = this.T;
        mnzVar.a();
        pzt0 pzt0Var = mnzVar.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        mnzVar.g = null;
        b2k l = vng.l(mnzVar.c.b(o2y0Var), new iez(2), vng.c);
        mnzVar.d.getClass();
        mnzVar.g = tje.N(Jg, null, null, new LongSearchV2Interactor$handleActiveOrder$$inlined$collectIn$1(kotlinx.coroutines.flow.e.F(l, uyj.a), null, mnzVar), 3);
        tje.N(Jg(), null, null, new OrderFragmentPresenter$collapseCardWithTimeoutIfNeed$1(this, null), 3);
    }

    public final void Ug() {
        String str;
        this.U.a();
        if (((qs70) this.b0).a().b) {
            return;
        }
        o2y0 o2y0Var = this.y0;
        if (o2y0Var == null || (str = o2y0Var.b().a) == null) {
            str = "";
        }
        tje.N(Jg(), null, null, new OrderFragmentPresenter$registerCollapse$1(this, str, null), 3);
    }

    public final void Vg(DriveState driveState) {
        boolean i = an91.i(driveState);
        n080 n080Var = this.H0;
        if (n080Var != null && i && n080Var != null) {
            n080Var.a(true);
        }
        Wg(i, Qg(driveState));
        Rg(true);
    }

    public final void Wg(boolean z, boolean z2) {
        ((ww70) Dg()).Q4(z);
        qv10.B(z2, this.O.b, null);
    }

    @Override // defpackage.qc5
    public final void onStart() {
        jst.e.getClass();
        n080 n080Var = this.H0;
        if (n080Var != null) {
            o2y0 o2y0Var = this.y0;
            n080Var.a(an91.i(o2y0Var != null ? o2y0Var.c() : null));
        }
        Rg(true);
        uhx uhxVar = new uhx(29, this);
        com.yandex.go.overdraft.ui.g gVar = this.K;
        gVar.e = uhxVar;
        this.z0 = new bwi(2, gVar);
        this.r0.w.a.c();
    }
}
