package ru.yandex.taxi.order;

import android.app.Activity;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.address.models.Address;
import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.details.v2.core.availability.m;
import com.yandex.go.taxi.order.feedback.after.ui.AfterFeedbackInfoModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.cancel.DetailedCancelNotification;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import com.yandex.go.taxi.order.models.api.cancel.p;
import com.yandex.go.taxi.order.models.api.response.CancelRules;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.status.RequiredYangopayBalance;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import com.yandex.go.taxi.order.v;
import com.yandex.go.taxi.order.y;
import defpackage.a980;
import defpackage.aoj;
import defpackage.ap70;
import defpackage.b6y0;
import defpackage.bf4;
import defpackage.bgc;
import defpackage.biw;
import defpackage.c02;
import defpackage.ci70;
import defpackage.cp70;
import defpackage.cqx0;
import defpackage.cta1;
import defpackage.d0l0;
import defpackage.d0y0;
import defpackage.dab1;
import defpackage.dds;
import defpackage.dj1;
import defpackage.e4a0;
import defpackage.epq0;
import defpackage.evu0;
import defpackage.f83;
import defpackage.f9x;
import defpackage.fp70;
import defpackage.g18;
import defpackage.g6y0;
import defpackage.gp70;
import defpackage.gw40;
import defpackage.h3y;
import defpackage.h6r;
import defpackage.hc00;
import defpackage.hj1;
import defpackage.hp70;
import defpackage.hq70;
import defpackage.hst;
import defpackage.ht10;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.i6y0;
import defpackage.ic00;
import defpackage.ij1;
import defpackage.itl0;
import defpackage.jc00;
import defpackage.jp70;
import defpackage.jst;
import defpackage.jwf0;
import defpackage.k880;
import defpackage.k990;
import defpackage.kc00;
import defpackage.kyh0;
import defpackage.l880;
import defpackage.l8x;
import defpackage.lpx0;
import defpackage.m950;
import defpackage.n3h;
import defpackage.nit;
import defpackage.nzx0;
import defpackage.o2y0;
import defpackage.ob0;
import defpackage.oep0;
import defpackage.op70;
import defpackage.oyr;
import defpackage.p370;
import defpackage.pg7;
import defpackage.pit;
import defpackage.pp70;
import defpackage.pwf0;
import defpackage.pzt0;
import defpackage.q4g;
import defpackage.qrj0;
import defpackage.ri1;
import defpackage.rp70;
import defpackage.s8x;
import defpackage.sa80;
import defpackage.sd30;
import defpackage.sls;
import defpackage.sw7;
import defpackage.sy60;
import defpackage.t26;
import defpackage.tdj;
import defpackage.th40;
import defpackage.tj60;
import defpackage.tje;
import defpackage.tse;
import defpackage.u480;
import defpackage.u500;
import defpackage.uh60;
import defpackage.ulb0;
import defpackage.uw40;
import defpackage.vw70;
import defpackage.vxx0;
import defpackage.vzx0;
import defpackage.w030;
import defpackage.wl40;
import defpackage.woq0;
import defpackage.wr40;
import defpackage.wu7;
import defpackage.x980;
import defpackage.xdf;
import defpackage.xh60;
import defpackage.xkw;
import defpackage.yea0;
import defpackage.yo70;
import defpackage.ysg;
import defpackage.yu40;
import defpackage.yvf0;
import defpackage.zo70;
import defpackage.zuj0;
import defpackage.zw30;
import defpackage.zxf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;

/* loaded from: classes14.dex */
public final class f extends dds implements x980 {
    public final yvf0 A0;
    public final yvf0 B0;
    public final i3y B1;
    public final com.yandex.go.taxi.order.deeplink.c C0;
    public final rp70 C1;
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a D0;
    public final oep0 E0;
    public final h6r F;
    public final yvf0 F0;
    public final Activity G;
    public final vxx0 G0;
    public final ru.yandex.taxi.analytics.j H;
    public final yvf0 H0;
    public final e H1;
    public final ulb0 I;
    public final g6y0 I0;
    public final ysg J;
    public final yvf0 J0;
    public final u500 K;
    public final com.yandex.go.multimodal_route.store.a K0;
    public final com.yandex.go.taxi.order.provider.a L;
    public final wr40 L0;
    public final com.yandex.go.superapp.order.multi.old.provider.g M;
    public final ArrayList M0;
    public final pit N;
    public final vw70 N0;
    public final uw40 O;
    public final ArrayList O0;
    public final y P;
    public final ConcurrentHashMap P0;
    public final l880 Q;
    public final HashSet Q0;
    public final woq0 R;
    public final HashSet R0;
    public final ri1 S;
    public kotlinx.coroutines.c S0;
    public final ru.yandex.taxi.zonemodes.j T;
    public kotlinx.coroutines.c T0;
    public final pg7 U;
    public final u480 V;
    public final com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c W;
    public final tj60 Z;
    public final h3y a0;
    public final h3y b0;
    public final yvf0 c0;
    public final k880 d0;
    public final h3y e0;
    public final jc00 f0;
    public final h3y g0;
    public final yvf0 h0;
    public final k990 i0;
    public final yvf0 j0;
    public final h3y k0;
    public final com.yandex.go.mainscreen.superapp.impl.foundation.domain.g l0;
    public final com.yandex.go.blockeduser.data.c m0;
    public final h3y n0;
    public final h3y o0;
    public final h3y p0;
    public OrderFragment p1;
    public final yvf0 q0;
    public final h3y r0;
    public final yea0 s0;
    public final yvf0 t0;
    public final h3y u0;
    public final hq70 v0;
    public final LinkedHashMap v1;
    public final h3y w0;
    public final h3y x0;
    public final i3y x1;
    public final nzx0 y0;
    public final i3y y1;
    public final yvf0 z0;

    public f(h6r h6rVar, Activity activity, ru.yandex.taxi.analytics.j jVar, ulb0 ulb0Var, ysg ysgVar, u500 u500Var, com.yandex.go.taxi.order.provider.a aVar, com.yandex.go.superapp.order.multi.old.provider.g gVar, pit pitVar, a980 a980Var, zuj0 zuj0Var, uw40 uw40Var, y yVar, l880 l880Var, woq0 woq0Var, ri1 ri1Var, ci70 ci70Var, ru.yandex.taxi.zonemodes.j jVar2, pg7 pg7Var, u480 u480Var, xdf xdfVar, com.yandex.go.promocodes.base.impl.promo_codes.data.repositories.c cVar, tj60 tj60Var, h3y h3yVar, h3y h3yVar2, yvf0 yvf0Var, k880 k880Var, h3y h3yVar3, jc00 jc00Var, h3y h3yVar4, yvf0 yvf0Var2, k990 k990Var, yvf0 yvf0Var3, yvf0 yvf0Var4, h3y h3yVar5, com.yandex.go.mainscreen.superapp.impl.foundation.domain.g gVar2, com.yandex.go.blockeduser.data.c cVar2, yvf0 yvf0Var5, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8, yvf0 yvf0Var6, h3y h3yVar9, yea0 yea0Var, yvf0 yvf0Var7, h3y h3yVar10, hq70 hq70Var, h3y h3yVar11, h3y h3yVar12, nzx0 nzx0Var, yvf0 yvf0Var8, yvf0 yvf0Var9, yvf0 yvf0Var10, com.yandex.go.taxi.order.deeplink.c cVar3, com.yandex.go.mainscreen.superapp.impl.fragment.a aVar2, oep0 oep0Var, yvf0 yvf0Var11, vxx0 vxx0Var, yvf0 yvf0Var12, g6y0 g6y0Var, yvf0 yvf0Var13, com.yandex.go.multimodal_route.store.a aVar3, wr40 wr40Var, zw30 zw30Var, xkw xkwVar) {
        super(null);
        this.F = h6rVar;
        this.G = activity;
        this.H = jVar;
        this.I = ulb0Var;
        this.J = ysgVar;
        this.K = u500Var;
        this.L = aVar;
        this.M = gVar;
        this.N = pitVar;
        this.O = uw40Var;
        this.P = yVar;
        this.Q = l880Var;
        this.R = woq0Var;
        this.S = ri1Var;
        this.T = jVar2;
        this.U = pg7Var;
        this.V = u480Var;
        this.W = cVar;
        this.Z = tj60Var;
        this.a0 = h3yVar;
        this.b0 = h3yVar2;
        this.c0 = yvf0Var;
        this.d0 = k880Var;
        this.e0 = h3yVar3;
        this.f0 = jc00Var;
        this.g0 = h3yVar4;
        this.h0 = yvf0Var2;
        this.i0 = k990Var;
        this.j0 = yvf0Var3;
        this.k0 = h3yVar5;
        this.l0 = gVar2;
        this.m0 = cVar2;
        this.n0 = h3yVar6;
        this.o0 = h3yVar7;
        this.p0 = h3yVar8;
        this.q0 = yvf0Var6;
        this.r0 = h3yVar9;
        this.s0 = yea0Var;
        this.t0 = yvf0Var7;
        this.u0 = h3yVar10;
        this.v0 = hq70Var;
        this.w0 = h3yVar11;
        this.x0 = h3yVar12;
        this.y0 = nzx0Var;
        this.z0 = yvf0Var8;
        this.A0 = yvf0Var9;
        this.B0 = yvf0Var10;
        this.C0 = cVar3;
        this.D0 = aVar2;
        this.E0 = oep0Var;
        this.F0 = yvf0Var11;
        this.G0 = vxx0Var;
        this.H0 = yvf0Var12;
        this.I0 = g6y0Var;
        this.J0 = yvf0Var13;
        this.K0 = aVar3;
        this.L0 = wr40Var;
        this.M0 = new ArrayList();
        this.N0 = new vw70();
        this.O0 = new ArrayList();
        this.P0 = new ConcurrentHashMap();
        this.Q0 = new HashSet();
        this.R0 = new HashSet();
        s8x s8xVar = f9x.b;
        this.S0 = s8xVar;
        this.T0 = s8xVar;
        this.v1 = new LinkedHashMap();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x1 = kotlin.a.b(lazyThreadSafetyMode, new OrderControllerCompatFragmentRouter$altpinSourceRouter$1(0, yvf0Var5, yvf0.class, "get", "get()Ljava/lang/Object;", 0));
        this.y1 = kotlin.a.b(lazyThreadSafetyMode, new OrderControllerCompatFragmentRouter$orderTopNotificationsRouter$1(0, yvf0Var4, yvf0.class, "get", "get()Ljava/lang/Object;", 0));
        this.B1 = kotlin.a.b(lazyThreadSafetyMode, new OrderControllerCompatFragmentRouter$multimodalTransportPartOverlayRouter$1(0, zw30Var, yvf0.class, "get", "get()Ljava/lang/Object;", 0));
        g0("init");
        this.C1 = new rp70(new ob0(6, this), zuj0Var, pitVar.h, ci70Var, xdfVar);
        this.H1 = new e(this, activity, a980Var);
    }

    public static final void V(f fVar) {
        List l = fVar.L.l();
        if (!l.isEmpty()) {
            Iterator it = l.iterator();
            while (it.hasNext()) {
                fVar.p0((o2y0) it.next());
            }
        } else {
            hst hstVar = jst.e;
            hstVar.m("TaxiOrder.Navigation.deactivateOrdersAndReturnToSummary").a(20, "OrderControllerCompatFragmentRouter", new IllegalStateException("OrderController without active orders"), "No active orders found");
            fVar.h0();
        }
    }

    public static boolean f0(o2y0 o2y0Var) {
        TaxiOrder b = o2y0Var.b();
        return (b.V().j0 != null) && !b.l.y && b.l.A;
    }

    @Override // defpackage.dds, defpackage.h55
    public final void G(Object obj) {
        super.G((vzx0) obj);
        g0("onAttach");
        ((i6y0) this.I0).b(new b6y0(TaxiOrderSessionCheckpoint.ATTACH_ORDER_FRAGMENT_ROUTER));
        ((m) this.w0.get()).c();
        u480 u480Var = this.V;
        if (!u480Var.m) {
            u480Var.a();
            u480Var.k.b(new v(u480Var));
            u480Var.m = true;
        }
        this.P.g();
        ((sa80) this.p0.get()).a.clear();
        this.N.a(this.H1);
        tse o = o();
        com.yandex.go.taxi.order.deeplink.c cVar = this.C0;
        int i = 2;
        ru.yandex.taxi.deeplinks.a.c(o, cVar.a, new biw(i, cVar));
        this.T0 = tje.N(o(), null, null, new OrderControllerCompatFragmentRouter$onAttach$$inlined$safeCollectIn$1(this.v0.b, null, this), 3);
        A((m950) this.y1.getValue(), zy11.a, sy60.Q2);
        this.O0.add(tje.N(o(), null, null, new OrderControllerCompatFragmentRouter$onAttach$$inlined$safeCollectIn$2(this.G0.b, null, this), 3));
        if (this.L.r()) {
            this.Q.a(new zo70(this, i));
        }
    }

    @Override // defpackage.dds, defpackage.h55
    public final void H(Object obj) {
        e eVar;
        vzx0 vzx0Var = (vzx0) obj;
        g0("onDetach");
        ArrayList arrayList = this.O0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((l8x) it.next()).a(null);
        }
        arrayList.clear();
        ArrayList arrayList2 = this.M0;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((g18) it2.next()).cancel();
        }
        arrayList2.clear();
        this.P.h();
        ((com.yandex.go.taxi.order.promotions.notification.a) this.y1.getValue()).i();
        ((gw40) this.B1.getValue()).i();
        this.T0.a(null);
        OrderFragment orderFragment = this.p1;
        if (orderFragment != null) {
            orderFragment.stopOverlayUpdates();
        }
        Iterator it3 = this.L.l().iterator();
        while (it3.hasNext()) {
            com.yandex.go.taxi.order.controller.a d0 = d0((o2y0) it3.next());
            ArrayList arrayList3 = d0.K;
            d0.o.a(d0.c.b().a);
            pzt0 pzt0Var = d0.L;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            pzt0 pzt0Var2 = d0.M;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                ((l8x) it4.next()).a(null);
            }
            arrayList3.clear();
        }
        AtomicReference atomicReference = this.N.g.a;
        do {
            eVar = this.H1;
            if (atomicReference.compareAndSet(eVar, null)) {
                break;
            }
        } while (atomicReference.get() == eVar);
        this.N0.a.clear();
        ((m) this.w0.get()).d();
        this.p1 = null;
        super.H(vzx0Var);
    }

    @Override // defpackage.dds, defpackage.h55
    public final void I(Object obj) {
        this.D = null;
        g0("onDismiss");
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        g0("onLaunch");
    }

    @Override // defpackage.h55
    public final void K(Object obj) {
        g0("onResume");
    }

    @Override // defpackage.h55
    public final void L(Object obj) {
        g0("onSuspend");
    }

    @Override // defpackage.dds
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a P() {
        return this.D0;
    }

    @Override // defpackage.dds
    public final bf4 R(BaseFragment baseFragment) {
        return new ap70(0, this);
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        o2y0 o2y0Var = ((vzx0) obj).a;
        getClass();
        OrderFragment.Companion.getClass();
        OrderFragment orderFragment = new OrderFragment();
        orderFragment.initialOrderHolder = o2y0Var;
        orderFragment.orderUiCallback = this;
        orderFragment.orderInstanceState = this.N0;
        this.p1 = orderFragment;
        return orderFragment;
    }

    public final void W(o2y0 o2y0Var, DriveState driveState, wu7 wu7Var) {
        p370 p370Var = new p370(5, this, wu7Var, o2y0Var);
        com.yandex.go.taxi.order.controller.a d0 = d0(o2y0Var);
        d0.c(new bgc(12), new th40(6, d0, driveState, p370Var));
    }

    public final void X(o2y0 o2y0Var) {
        this.O0.add(tje.N(o(), null, null, new OrderControllerCompatFragmentRouter$triggerReorder$1(this, o2y0Var, null), 3));
    }

    public final void Y(o2y0 o2y0Var, d0y0 d0y0Var, sls slsVar) {
        this.O0.add(tje.N(o(), null, null, new OrderControllerCompatFragmentRouter$changeSourceAddress$1(this, d0y0Var, o2y0Var, slsVar, null), 3));
    }

    public final void Z(o2y0 o2y0Var) {
        this.v1.remove(o2y0Var.b().a);
    }

    public final void a0(o2y0 o2y0Var) {
        d0(o2y0Var).j("completeOrder");
        if (f0(o2y0Var)) {
            ysg ysgVar = this.J;
            TaxiOrder b = o2y0Var.b();
            synchronized (ysgVar) {
                synchronized (b) {
                    b.l = b.l.E();
                }
                ysgVar.h(b);
                ysgVar.g(b);
            }
            o2y0Var.f();
        } else {
            ri1 ri1Var = this.S;
            String str = o2y0Var.b().a;
            HashSet hashSet = ri1Var.b;
            if (hashSet.contains(str)) {
                ri1Var.a = null;
                hashSet.clear();
            }
            this.L.d(o2y0Var);
        }
        if (!this.M.d() || this.f0.a()) {
            h0();
        }
    }

    public final void b0(o2y0 o2y0Var, DetailsOpenReason detailsOpenReason) {
        OrderFragment orderFragment = this.p1;
        if (orderFragment == null || !getLifecycle().w.a(Lifecycle.State.STARTED)) {
            return;
        }
        orderFragment.expandOrderView(o2y0Var, detailsOpenReason);
    }

    public final void c0(o2y0 o2y0Var) {
        String str = o2y0Var.b().a;
        HashSet hashSet = this.S.b;
        if (hashSet.contains(str)) {
            hashSet.clear();
        }
        this.L.d(o2y0Var);
        d0(o2y0Var).j("finishOrderProcessing");
        this.P.a(o2y0Var.b().a);
    }

    public final com.yandex.go.taxi.order.controller.a d0(o2y0 o2y0Var) {
        ConcurrentHashMap concurrentHashMap = this.P0;
        Object obj = concurrentHashMap.get(o2y0Var);
        if (obj == null) {
            qrj0 qrj0Var = (qrj0) this.u0.get();
            o2y0Var.getClass();
            qrj0Var.getClass();
            h6r h6rVar = this.F;
            h6rVar.getClass();
            com.yandex.go.taxi.order.controller.a n = new q4g(h6rVar, o2y0Var, qrj0Var).n();
            Object putIfAbsent = concurrentHashMap.putIfAbsent(o2y0Var, n);
            obj = putIfAbsent == null ? n : putIfAbsent;
        }
        return (com.yandex.go.taxi.order.controller.a) obj;
    }

    public final epq0 e0(o2y0 o2y0Var) {
        return (epq0) ((zxf0) pwf0.d(epq0.class, new jwf0(new uh60(18, this), new cp70(o2y0Var, this))));
    }

    public final void g0(String str) {
        jst.e.o("TaxiOrder.Navigation", String.format("%s[%s](%x)::%s", Arrays.copyOf(new Object[]{"OrderControllerCompatFragmentRouter", getLifecycle().w, Integer.valueOf(hashCode()), str}, 4)));
    }

    public final void h0() {
        com.yandex.go.superapp.order.multi.old.provider.g gVar = this.M;
        wl40 a = gVar.a();
        if (gVar.d() && a.j() > a.a.size()) {
            ic00 ic00Var = ((kc00) this.f0).a;
            ic00Var.getClass();
            if (!(ic00Var instanceof hc00)) {
                return;
            }
        }
        r(new zo70(this, 1));
    }

    public final void i0(o2y0 o2y0Var, boolean z) {
        if (!f0(o2y0Var)) {
            TaxiOrder b = o2y0Var.b();
            b.O(false);
            this.J.g(b);
            d0(o2y0Var).j("afterFeedback");
        }
        ij1 ij1Var = (ij1) this.e0.get();
        yo70 yo70Var = new yo70(this, o2y0Var, 1);
        AfterFeedbackInfoModalView.MessageType messageType = z ? AfterFeedbackInfoModalView.MessageType.MESSAGE_DRIVE_DISABLE : AfterFeedbackInfoModalView.MessageType.MESSAGE_DONE;
        w030 a = ij1Var.b.a();
        if (a.i(AfterFeedbackInfoModalView.class) == null) {
            a.s(new AfterFeedbackInfoModalView(ij1Var.a, messageType, new hj1(yo70Var)), true);
        }
    }

    public final void j0(String str) {
        ((n3h) this.r0.get()).a(Uri.parse(str), DeeplinkSource.TOTW_COMMUNICATIONS);
    }

    public final void k0(o2y0 o2y0Var) {
        OrderFragment orderFragment = this.p1;
        if (orderFragment == null || !getLifecycle().w.a(Lifecycle.State.STARTED)) {
            return;
        }
        orderFragment.openOrderPaymentMethods(o2y0Var);
    }

    public final void l0(o2y0 o2y0Var, RequiredYangopayBalance requiredYangopayBalance, Activity activity, String str) {
        if (this.p1 == null || activity == null) {
            jst.e.e(oyr.p("TaxiOrder.Navigation.", str, ".openYangopayTopup"), "OrderControllerCompatFragmentRouter", new IllegalStateException("Can't open YangopayTopup because fragment or activity are null"));
            return;
        }
        aoj aojVar = (aoj) this.b0.get();
        if (requiredYangopayBalance != null) {
            String str2 = requiredYangopayBalance.a;
        }
        o2y0Var.a();
        aojVar.getClass();
    }

    public final void m0(o2y0 o2y0Var) {
        c0(o2y0Var);
        r(new nit(1, o2y0Var));
    }

    public final void n0(o2y0 o2y0Var) {
        o2y0Var.g(com.yandex.go.taxi.order.models.api.f.b(TaxiOrder.Companion, o2y0Var.b().W(), null, null, 0L, 30));
        d0(o2y0Var).b(e0(o2y0Var));
    }

    public final void o0(o2y0 o2y0Var) {
        boolean z = o2y0Var.b().l.q || o2y0Var.b().G();
        String str = o2y0Var.b().a;
        String str2 = o2y0Var.b().b.b;
        if (z && this.K0.b(str, str2)) {
            wr40 wr40Var = this.L0;
            Address address = (Address) ((Map) wr40Var.c.getValue()).get(wr40Var.a.b(str, str2));
            if (address != null) {
                TaxiOrder b = o2y0Var.b();
                d0l0 d0l0Var = b.i.b;
                if (d0l0Var != null) {
                    d0l0 f = d0l0Var.f(address, false);
                    synchronized (b) {
                        b.i = b.i.l(f);
                    }
                    b.b.l(f);
                } else {
                    d0l0 d0l0Var2 = b.b.G;
                    d0l0 f2 = d0l0Var2.f(address, false);
                    if (d0l0Var2 != f2) {
                        synchronized (b) {
                            b.i = b.i.l(f2);
                        }
                        b.b.l(f2);
                    }
                }
            }
            com.yandex.go.multimodal_route.store.a aVar = this.K0;
            yu40 yu40Var = aVar.a;
            String b2 = yu40Var.b(str, str2);
            if (b2 != null) {
                yu40Var.e(b2);
                ((Map) aVar.d.c.getValue()).remove(b2);
            }
        }
    }

    public final void p0(o2y0 o2y0Var) {
        o0(o2y0Var);
        o2y0Var.b().b.j(null);
        c0(o2y0Var);
        d0(o2y0Var).k(new fp70(o2y0Var, this));
    }

    public final void q0(o2y0 o2y0Var) {
        xh60 b = o2y0Var.b().V().P.b("after_cancel_popup");
        if (b == null) {
            return;
        }
        p pVar = (p) b.b;
        if (pVar instanceof DetailedCancelNotification) {
            this.P.a(o2y0Var.b().a);
            if (this.p1 == null || !getLifecycle().w.a(Lifecycle.State.STARTED)) {
                return;
            }
            A((m950) this.c0.get(), new dj1(o2y0Var.b(), (DetailedCancelNotification) pVar), new gp70(o2y0Var, this));
        }
    }

    public final void r0(o2y0 o2y0Var, Dialog dialog) {
        rp70 rp70Var = this.C1;
        rp70Var.getClass();
        String str = dialog.b;
        if (str == null || evu0.J(str)) {
            return;
        }
        ci70 ci70Var = rp70Var.d;
        String str2 = o2y0Var.b().a;
        ci70Var.q.b(str2, ci70Var.b(str2), "show", null);
        tdj tdjVar = new tdj(o2y0Var);
        tdjVar.b = dialog.a;
        tdjVar.c = dialog.b;
        tdjVar.a(new t26(16, dialog, rp70Var, o2y0Var));
        rp70Var.c.n(tdjVar, new pp70(o2y0Var, "callButtonInactiveDialog"));
    }

    public final void s0(o2y0 o2y0Var) {
        String str;
        String str2;
        if (this.p1 == null) {
            jst.e.m("TaxiOrder.Navigation.showCancelOrder").v("OrderControllerCompatFragmentRouter", new IllegalStateException("Missing fragment when showCancelOrder called"));
            return;
        }
        TaxiOrder b = o2y0Var.b();
        Z(o2y0Var);
        xh60 b2 = b.V().P.b("order_cancel_notification");
        if (b2 != null && ((OrderCancelNotification) b2.b).a()) {
            A((m950) this.h0.get(), o2y0Var, new jp70(this, o2y0Var, b));
            return;
        }
        Map map = d0(o2y0Var).J;
        rp70 rp70Var = this.C1;
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        ht10 ht10Var = new ht10(this, o2y0Var, false, 24);
        if (rp70Var.f) {
            return;
        }
        if (!rp70.c(o2y0Var.b())) {
            f83 f83Var = new f83(rp70Var, o2y0Var.b().h.b, new sd30(11, rp70Var, ht10Var), new op70(rp70Var, ht10Var), 6);
            YandexTaxiFragment yandexTaxiFragment = (YandexTaxiFragment) rp70Var.a.get();
            if (yandexTaxiFragment == null) {
                return;
            }
            yandexTaxiFragment.showDialog(f83Var);
            rp70Var.f = true;
            this.H.t(cta1.d(o2y0Var.c()), "showCancelDialog");
            return;
        }
        TaxiOrder b3 = o2y0Var.b();
        CancelRules cancelRules = b3.h.a;
        if (cancelRules != null) {
            String str3 = cancelRules.c;
            str = (str3 == null || evu0.J(str3)) ? null : (String) map.get(String.format("cancel_state.%s.title", Arrays.copyOf(new Object[]{str3}, 1)));
            if (str == null || evu0.J(str)) {
                str = (String) map.get(String.format("cancel_state.%s.title", Arrays.copyOf(new Object[]{cancelRules.b}, 1)));
            }
        } else {
            str = null;
        }
        if (str == null || evu0.J(str)) {
            str = null;
        }
        if (str == null) {
            str = rp70Var.b(kyh0.order_cancel_paid_title);
        }
        if (cancelRules != null) {
            e4a0 r = b3.r();
            String str4 = cancelRules.c;
            String str5 = cancelRules.b;
            if (str4 != null && !evu0.J(str4)) {
                String format = String.format("cancel_state.%s.message", Arrays.copyOf(new Object[]{str4}, 1));
                if (map.containsKey(format)) {
                    str2 = (String) map.get(format);
                    r5 = str2;
                }
            }
            PaymentMethod$Type a = r.a();
            r5 = a != null ? a.getCode() : null;
            if (r5 == null) {
                r5 = "";
            }
            String format2 = String.format("cancel_state.%1$s.%2$s.message", Arrays.copyOf(new Object[]{r5, str5}, 2));
            str2 = map.containsKey(format2) ? (String) map.get(format2) : (String) map.get(String.format("cancel_state.%s.message", Arrays.copyOf(new Object[]{str5}, 1)));
            r5 = str2;
        }
        if (r5 == null || evu0.J(r5)) {
            r5 = b3.r() == PaymentMethod$Type.CASH ? rp70Var.b(kyh0.order_cancel_paid_message_cash) : rp70Var.b(kyh0.order_cancel_paid_message);
        }
        rp70Var.f = true;
        E((m950) this.B0.get(), new sw7(str, r5), new hp70(this, ht10Var), hxx.a);
        this.H.t(cta1.d(o2y0Var.c()), "showCancelDialog");
    }

    public final void t0() {
        if (this.f0.a()) {
            r(new zo70(this, 3));
        } else {
            h0();
        }
    }

    public final void u0(String str) {
        itl0 itl0Var = new itl0(SafetyCenterParams$Source.ORDER_CARD, str, dab1.O);
        this.K.b(MainMenuProcessor$MenuEntry.SAFETY_CENTER, itl0Var);
    }

    public final void v0(o2y0 o2y0Var, lpx0 lpx0Var) {
        OrderFragment orderFragment = this.p1;
        if (orderFragment == null) {
            return;
        }
        boolean isSomethingWentWrongHidden = orderFragment.isSomethingWentWrongHidden();
        boolean z = o2y0Var.b().l.n;
        if (!isSomethingWentWrongHidden || z) {
            return;
        }
        A((m950) this.q0.get(), new cqx0(lpx0Var, o2y0Var.b()), sy60.Q2);
    }

    public final void w0() {
        if (u()) {
            this.S0.a(null);
            pzt0 N = tje.N(o(), null, null, new OrderControllerCompatFragmentRouter$subscribeForMostActiveOrderFlow$$inlined$safeCollectIn$1(this.L.v(), null, this), 3);
            this.S0 = N;
            this.O0.add(N);
        }
    }

    public final void x0(o2y0 o2y0Var) {
        TaxiOrder b = o2y0Var.b();
        if (b.h.b == DriveState.FAILED) {
            TaxiOrder b2 = o2y0Var.b();
            if (this.R0.add(b2)) {
                this.d0.getClass();
                if (k880.b(b2)) {
                    q0(o2y0Var);
                    return;
                }
                return;
            }
            return;
        }
        if (b.h.b == DriveState.CANCELLED) {
            if (b.E() || b.V().F == OrderStatusInfo.CancelledBy.TIMEOUT) {
                d0(o2y0Var).e(new yo70(this, o2y0Var, 2));
                return;
            }
            TaxiOrder b3 = o2y0Var.b();
            if (this.R0.add(b3)) {
                this.d0.getClass();
                if (k880.b(b3)) {
                    q0(o2y0Var);
                }
            }
        }
    }

    public final void y0(o2y0 o2y0Var) {
        if (u()) {
            x0(o2y0Var);
            if (o2y0Var.b().h.getB() != DriveState.DRIVING && v((m950) this.x1.getValue())) {
                ((c02) this.x1.getValue()).i();
            }
        }
    }
}
