package ru.yandex.taxi.scooters.presentation.detailed_order.v2;

import android.content.Context;
import android.view.View;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsFromScreen;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.b5o0;
import defpackage.c0n0;
import defpackage.c4p0;
import defpackage.chn0;
import defpackage.cyx;
import defpackage.czn0;
import defpackage.dpb;
import defpackage.e7g;
import defpackage.fgn0;
import defpackage.fll0;
import defpackage.fva0;
import defpackage.fy30;
import defpackage.g1n0;
import defpackage.g5o0;
import defpackage.g8n0;
import defpackage.gei0;
import defpackage.h6o0;
import defpackage.hen0;
import defpackage.ign0;
import defpackage.jco0;
import defpackage.jhn0;
import defpackage.jpj0;
import defpackage.k7x0;
import defpackage.kco0;
import defpackage.khn0;
import defpackage.kv1;
import defpackage.l7g;
import defpackage.m0o0;
import defpackage.m7g;
import defpackage.mbo0;
import defpackage.mhn0;
import defpackage.n5o0;
import defpackage.n7g;
import defpackage.ndl0;
import defpackage.ney;
import defpackage.npe0;
import defpackage.nqm0;
import defpackage.nso0;
import defpackage.nwo0;
import defpackage.ny61;
import defpackage.nyn0;
import defpackage.pav;
import defpackage.pfn0;
import defpackage.pmn0;
import defpackage.po21;
import defpackage.pwy0;
import defpackage.qhn0;
import defpackage.qr40;
import defpackage.qwo0;
import defpackage.qx5;
import defpackage.qxm0;
import defpackage.rhn0;
import defpackage.t9h0;
import defpackage.tse;
import defpackage.ukn0;
import defpackage.uq1;
import defpackage.uto0;
import defpackage.v0o0;
import defpackage.vfn0;
import defpackage.vu;
import defpackage.vxm0;
import defpackage.w030;
import defpackage.wro0;
import defpackage.wun0;
import defpackage.wxm0;
import defpackage.x4o0;
import defpackage.xva0;
import defpackage.xvf0;
import defpackage.yuf0;
import defpackage.yvf0;
import defpackage.zfn0;
import defpackage.zno0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.data.k;
import ru.yandex.taxi.scooters.data.u;
import ru.yandex.taxi.scooters.domain.p;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.f;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.g;

/* loaded from: classes6.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final fva0 G;
    public final yvf0 H;
    public final ukn0 I;
    public final yvf0 J;
    public final czn0 K;
    public final g5o0 L;
    public final yvf0 M;
    public final yvf0 N;
    public final yvf0 O;
    public final yvf0 P;
    public final yvf0 Q;
    public final yvf0 R;
    public final yvf0 S;
    public final qhn0 T;
    public final jhn0 U;
    public final nwo0 V;
    public final yvf0 W;
    public final yvf0 Z;
    public final yvf0 a0;
    public final yvf0 b0;
    public final ndl0 c0;

    public a(w030 w030Var, fva0 fva0Var, e7g e7gVar, ukn0 ukn0Var, n7g n7gVar, czn0 czn0Var, g5o0 g5o0Var, fy30 fy30Var, m7g m7gVar, vu vuVar, qx5 qx5Var, qx5 qx5Var2, l7g l7gVar, qx5 qx5Var3, qhn0 qhn0Var, jhn0 jhn0Var, nwo0 nwo0Var, wun0 wun0Var, m7g m7gVar2, m7g m7gVar3, pmn0 pmn0Var, ndl0 ndl0Var) {
        super(null);
        this.F = w030Var;
        this.G = fva0Var;
        this.H = e7gVar;
        this.I = ukn0Var;
        this.J = n7gVar;
        this.K = czn0Var;
        this.L = g5o0Var;
        this.M = fy30Var;
        this.N = m7gVar;
        this.O = vuVar;
        this.P = qx5Var;
        this.Q = qx5Var2;
        this.R = l7gVar;
        this.S = qx5Var3;
        this.T = qhn0Var;
        this.U = jhn0Var;
        this.V = nwo0Var;
        this.W = wun0Var;
        this.Z = m7gVar2;
        this.a0 = m7gVar3;
        this.b0 = pmn0Var;
        this.c0 = ndl0Var;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void G(Object obj) {
        super.G((zy11) obj);
        this.K.b.add(ScootersMosRuAnalyticsFromScreen.ACTIVE_RIDE);
        ((n5o0) this.c0.b).a("Perf.ScootersDetailedOrderModalViewRouter.Launch");
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((zy11) obj);
        j(dpb.a);
        this.K.a();
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final /* bridge */ /* synthetic */ Object S(Object obj, Continuation continuation) {
        return T(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderModalViewRouter$provideModalView$$inlined$wrapJankStats$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T(Continuation continuation) {
        ScootersDetailedOrderModalViewRouter$provideModalView$1 scootersDetailedOrderModalViewRouter$provideModalView$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        e eVar;
        jhn0 jhn0Var;
        fgn0 fgn0Var;
        String str;
        Object b;
        ScootersCardV2.ChargeConfig chargeConfig;
        fgn0 fgn0Var2;
        e eVar2;
        if (continuation instanceof ScootersDetailedOrderModalViewRouter$provideModalView$1) {
            scootersDetailedOrderModalViewRouter$provideModalView$1 = (ScootersDetailedOrderModalViewRouter$provideModalView$1) continuation;
            int i2 = scootersDetailedOrderModalViewRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersDetailedOrderModalViewRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersDetailedOrderModalViewRouter$provideModalView$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersDetailedOrderModalViewRouter$provideModalView$1.label;
                ukn0 ukn0Var = this.I;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fva0.f(this.G, "ScootersDetailedOrder", PerformanceAnalytics$Type.Inflate, 0L, 4);
                    fgn0 fgn0Var3 = new fgn0(this);
                    rhn0 rhn0Var = this.T.a;
                    eVar = new e((ney) rhn0Var.a.get(), (qxm0) rhn0Var.b.get(), (pwy0) rhn0Var.c.get(), (ru.yandex.taxi.multiorder.e) rhn0Var.d.get(), (p) rhn0Var.e.get(), (zno0) rhn0Var.f.get(), (m0o0) rhn0Var.g.get(), (qr40) rhn0Var.h.get(), (chn0) rhn0Var.i.get(), (uto0) rhn0Var.j.get(), (nyn0) rhn0Var.k.get(), (g) rhn0Var.l.get(), (ru.yandex.taxi.scooters.domain.g) rhn0Var.m.get(), (ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.a) rhn0Var.n.get(), (ru.yandex.taxi.scooters.presentation.detailed_order.v2.domain.c) rhn0Var.o.get(), (f) rhn0Var.p.get(), (k) rhn0Var.q.get(), (vfn0) rhn0Var.r.get(), (v0o0) rhn0Var.s.get(), (gei0) rhn0Var.t.get(), (ign0) rhn0Var.u.get(), (ru.yandex.taxi.scooters.presentation.share_location.data.a) rhn0Var.v.get(), fgn0Var3);
                    scootersDetailedOrderModalViewRouter$provideModalView$1.L$0 = null;
                    scootersDetailedOrderModalViewRouter$provideModalView$1.L$1 = null;
                    scootersDetailedOrderModalViewRouter$provideModalView$1.L$2 = "ScootersDetailedOrder";
                    scootersDetailedOrderModalViewRouter$provideModalView$1.L$3 = fgn0Var3;
                    scootersDetailedOrderModalViewRouter$provideModalView$1.L$4 = eVar;
                    jhn0Var = this.U;
                    scootersDetailedOrderModalViewRouter$provideModalView$1.L$5 = jhn0Var;
                    scootersDetailedOrderModalViewRouter$provideModalView$1.label = 1;
                    Object b2 = ukn0Var.a.b(scootersDetailedOrderModalViewRouter$provideModalView$1);
                    if (b2 != coroutineSingletons) {
                        fgn0Var = fgn0Var3;
                        obj = b2;
                        str = "ScootersDetailedOrder";
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ScootersCardV2.ChargeConfig chargeConfig2 = (ScootersCardV2.ChargeConfig) scootersDetailedOrderModalViewRouter$provideModalView$1.L$6;
                    jhn0Var = (jhn0) scootersDetailedOrderModalViewRouter$provideModalView$1.L$5;
                    e eVar3 = (e) scootersDetailedOrderModalViewRouter$provideModalView$1.L$4;
                    fgn0 fgn0Var4 = (fgn0) scootersDetailedOrderModalViewRouter$provideModalView$1.L$3;
                    str = (String) scootersDetailedOrderModalViewRouter$provideModalView$1.L$2;
                    kotlin.b.b(obj);
                    chargeConfig = chargeConfig2;
                    eVar2 = eVar3;
                    fgn0Var2 = fgn0Var4;
                    ScootersCardV2.a aVar = ((g0) obj).k.a;
                    kv1 kv1Var = this.L.a;
                    fgn0 fgn0Var5 = fgn0Var2;
                    ru.yandex.taxi.scooters.presentation.ontheway.f fVar = new ru.yandex.taxi.scooters.presentation.ontheway.f((tse) ((xvf0) kv1Var.a).get(), (uq1) ((xvf0) kv1Var.b).get(), (po21) ((xvf0) kv1Var.c).get(), (hen0) ((xvf0) kv1Var.d).get(), (qwo0) ((xvf0) kv1Var.e).get(), (ru.yandex.taxi.scooters.domain.f) ((xvf0) kv1Var.h).get(), (cyx) ((xvf0) kv1Var.i).get(), (h6o0) ((npe0) kv1Var.f).get(), (u) ((xvf0) kv1Var.j).get(), (nyn0) ((xvf0) kv1Var.k).get(), (ru.yandex.taxi.scooters.presentation.ontheway.lock.domain.a) ((g1n0) kv1Var.g).get(), (nqm0) ((xvf0) kv1Var.l).get(), (b5o0) ((xvf0) kv1Var.m).get(), (kco0) ((xvf0) kv1Var.n).get(), (x4o0) ((xvf0) kv1Var.o).get(), (ru.yandex.taxi.scooters.data.g) ((xvf0) kv1Var.p).get(), (ign0) ((xvf0) kv1Var.q).get(), (wxm0) ((xvf0) kv1Var.r).get(), (fll0) ((mbo0) kv1Var.s).get(), (jco0) ((mbo0) kv1Var.t).get(), (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.d) ((jpj0) kv1Var.u).get(), fgn0Var5);
                    mhn0 mhn0Var = ((khn0) jhn0Var).a;
                    Context context = (Context) mhn0Var.a.get();
                    k7x0 k7x0Var = (k7x0) mhn0Var.b.get();
                    c0n0 c0n0Var = (c0n0) mhn0Var.c.get();
                    wro0 wro0Var = (wro0) mhn0Var.d.get();
                    g8n0 g8n0Var = (g8n0) mhn0Var.e.get();
                    pav pavVar = (pav) mhn0Var.f.get();
                    ah00 ah00Var = (ah00) mhn0Var.g.get();
                    a3v a3vVar = (a3v) mhn0Var.h.get();
                    fva0 fva0Var = (fva0) mhn0Var.i.get();
                    vxm0 vxm0Var = (vxm0) mhn0Var.j.get();
                    nso0 nso0Var = (nso0) mhn0Var.k.get();
                    zno0 zno0Var = (zno0) mhn0Var.l.get();
                    c4p0 c4p0Var = (c4p0) mhn0Var.m.get();
                    pfn0 pfn0Var = (pfn0) mhn0Var.n.get();
                    zfn0 zfn0Var = (zfn0) mhn0Var.o.get();
                    final String str2 = str;
                    final ScootersDetailedOrderV2ModalView scootersDetailedOrderV2ModalView = new ScootersDetailedOrderV2ModalView(context, k7x0Var, c0n0Var, wro0Var, g8n0Var, pavVar, ah00Var, a3vVar, fva0Var, vxm0Var, nso0Var, zno0Var, c4p0Var, pfn0Var, zfn0Var, chargeConfig, aVar, fVar, eVar2, fgn0Var5);
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ?? r3 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderModalViewRouter$provideModalView$$inlined$wrapJankStats$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v) {
                            View rootView = scootersDetailedOrderV2ModalView.getRootView();
                            Object tag = rootView.getTag(t9h0.metricsStateHolder);
                            if (tag == null) {
                                tag = new xva0();
                                rootView.setTag(t9h0.metricsStateHolder, tag);
                            }
                            yuf0 yuf0Var = ((xva0) tag).a;
                            if (yuf0Var != null) {
                                yuf0Var.I(str2);
                            }
                            View view = scootersDetailedOrderV2ModalView;
                            T t = ref$ObjectRef.element;
                            view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v) {
                        }
                    };
                    ref$ObjectRef.element = r3;
                    scootersDetailedOrderV2ModalView.addOnAttachStateChangeListener(r3);
                    return scootersDetailedOrderV2ModalView;
                }
                jhn0Var = (jhn0) scootersDetailedOrderModalViewRouter$provideModalView$1.L$5;
                e eVar4 = (e) scootersDetailedOrderModalViewRouter$provideModalView$1.L$4;
                fgn0Var = (fgn0) scootersDetailedOrderModalViewRouter$provideModalView$1.L$3;
                String str3 = (String) scootersDetailedOrderModalViewRouter$provideModalView$1.L$2;
                kotlin.b.b(obj);
                eVar = eVar4;
                str = str3;
                ScootersCardV2.ChargeConfig chargeConfig3 = ((g0) obj).k.b;
                scootersDetailedOrderModalViewRouter$provideModalView$1.L$0 = null;
                scootersDetailedOrderModalViewRouter$provideModalView$1.L$1 = null;
                scootersDetailedOrderModalViewRouter$provideModalView$1.L$2 = str;
                scootersDetailedOrderModalViewRouter$provideModalView$1.L$3 = fgn0Var;
                scootersDetailedOrderModalViewRouter$provideModalView$1.L$4 = eVar;
                scootersDetailedOrderModalViewRouter$provideModalView$1.L$5 = jhn0Var;
                scootersDetailedOrderModalViewRouter$provideModalView$1.L$6 = chargeConfig3;
                scootersDetailedOrderModalViewRouter$provideModalView$1.label = 2;
                b = ukn0Var.a.b(scootersDetailedOrderModalViewRouter$provideModalView$1);
                if (b != coroutineSingletons) {
                    chargeConfig = chargeConfig3;
                    obj = b;
                    fgn0Var2 = fgn0Var;
                    eVar2 = eVar;
                    ScootersCardV2.a aVar2 = ((g0) obj).k.a;
                    kv1 kv1Var2 = this.L.a;
                    fgn0 fgn0Var52 = fgn0Var2;
                    ru.yandex.taxi.scooters.presentation.ontheway.f fVar2 = new ru.yandex.taxi.scooters.presentation.ontheway.f((tse) ((xvf0) kv1Var2.a).get(), (uq1) ((xvf0) kv1Var2.b).get(), (po21) ((xvf0) kv1Var2.c).get(), (hen0) ((xvf0) kv1Var2.d).get(), (qwo0) ((xvf0) kv1Var2.e).get(), (ru.yandex.taxi.scooters.domain.f) ((xvf0) kv1Var2.h).get(), (cyx) ((xvf0) kv1Var2.i).get(), (h6o0) ((npe0) kv1Var2.f).get(), (u) ((xvf0) kv1Var2.j).get(), (nyn0) ((xvf0) kv1Var2.k).get(), (ru.yandex.taxi.scooters.presentation.ontheway.lock.domain.a) ((g1n0) kv1Var2.g).get(), (nqm0) ((xvf0) kv1Var2.l).get(), (b5o0) ((xvf0) kv1Var2.m).get(), (kco0) ((xvf0) kv1Var2.n).get(), (x4o0) ((xvf0) kv1Var2.o).get(), (ru.yandex.taxi.scooters.data.g) ((xvf0) kv1Var2.p).get(), (ign0) ((xvf0) kv1Var2.q).get(), (wxm0) ((xvf0) kv1Var2.r).get(), (fll0) ((mbo0) kv1Var2.s).get(), (jco0) ((mbo0) kv1Var2.t).get(), (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.d) ((jpj0) kv1Var2.u).get(), fgn0Var52);
                    mhn0 mhn0Var2 = ((khn0) jhn0Var).a;
                    Context context2 = (Context) mhn0Var2.a.get();
                    k7x0 k7x0Var2 = (k7x0) mhn0Var2.b.get();
                    c0n0 c0n0Var2 = (c0n0) mhn0Var2.c.get();
                    wro0 wro0Var2 = (wro0) mhn0Var2.d.get();
                    g8n0 g8n0Var2 = (g8n0) mhn0Var2.e.get();
                    pav pavVar2 = (pav) mhn0Var2.f.get();
                    ah00 ah00Var2 = (ah00) mhn0Var2.g.get();
                    a3v a3vVar2 = (a3v) mhn0Var2.h.get();
                    fva0 fva0Var2 = (fva0) mhn0Var2.i.get();
                    vxm0 vxm0Var2 = (vxm0) mhn0Var2.j.get();
                    nso0 nso0Var2 = (nso0) mhn0Var2.k.get();
                    zno0 zno0Var2 = (zno0) mhn0Var2.l.get();
                    c4p0 c4p0Var2 = (c4p0) mhn0Var2.m.get();
                    pfn0 pfn0Var2 = (pfn0) mhn0Var2.n.get();
                    zfn0 zfn0Var2 = (zfn0) mhn0Var2.o.get();
                    final String str22 = str;
                    final View scootersDetailedOrderV2ModalView2 = new ScootersDetailedOrderV2ModalView(context2, k7x0Var2, c0n0Var2, wro0Var2, g8n0Var2, pavVar2, ah00Var2, a3vVar2, fva0Var2, vxm0Var2, nso0Var2, zno0Var2, c4p0Var2, pfn0Var2, zfn0Var2, chargeConfig, aVar2, fVar2, eVar2, fgn0Var52);
                    final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ?? r32 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.detailed_order.v2.ScootersDetailedOrderModalViewRouter$provideModalView$$inlined$wrapJankStats$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View v) {
                            View rootView = scootersDetailedOrderV2ModalView2.getRootView();
                            Object tag = rootView.getTag(t9h0.metricsStateHolder);
                            if (tag == null) {
                                tag = new xva0();
                                rootView.setTag(t9h0.metricsStateHolder, tag);
                            }
                            yuf0 yuf0Var = ((xva0) tag).a;
                            if (yuf0Var != null) {
                                yuf0Var.I(str22);
                            }
                            View view = scootersDetailedOrderV2ModalView2;
                            T t = ref$ObjectRef2.element;
                            view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View v) {
                        }
                    };
                    ref$ObjectRef2.element = r32;
                    scootersDetailedOrderV2ModalView2.addOnAttachStateChangeListener(r32);
                    return scootersDetailedOrderV2ModalView2;
                }
                return coroutineSingletons;
            }
        }
        scootersDetailedOrderModalViewRouter$provideModalView$1 = new ScootersDetailedOrderModalViewRouter$provideModalView$1(this, (ContinuationImpl) continuation);
        Object obj2 = scootersDetailedOrderModalViewRouter$provideModalView$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersDetailedOrderModalViewRouter$provideModalView$1.label;
        ukn0 ukn0Var2 = this.I;
        if (i != 0) {
        }
        ScootersCardV2.ChargeConfig chargeConfig32 = ((g0) obj2).k.b;
        scootersDetailedOrderModalViewRouter$provideModalView$1.L$0 = null;
        scootersDetailedOrderModalViewRouter$provideModalView$1.L$1 = null;
        scootersDetailedOrderModalViewRouter$provideModalView$1.L$2 = str;
        scootersDetailedOrderModalViewRouter$provideModalView$1.L$3 = fgn0Var;
        scootersDetailedOrderModalViewRouter$provideModalView$1.L$4 = eVar;
        scootersDetailedOrderModalViewRouter$provideModalView$1.L$5 = jhn0Var;
        scootersDetailedOrderModalViewRouter$provideModalView$1.L$6 = chargeConfig32;
        scootersDetailedOrderModalViewRouter$provideModalView$1.label = 2;
        b = ukn0Var2.a.b(scootersDetailedOrderModalViewRouter$provideModalView$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
