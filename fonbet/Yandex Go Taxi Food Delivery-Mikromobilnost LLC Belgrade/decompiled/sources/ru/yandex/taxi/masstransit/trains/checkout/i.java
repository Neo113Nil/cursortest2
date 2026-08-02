package ru.yandex.taxi.masstransit.trains.checkout;

import android.content.Context;
import com.yandex.go.payments.data.p;
import defpackage.aa40;
import defpackage.aj31;
import defpackage.b611;
import defpackage.e840;
import defpackage.ea40;
import defpackage.eb40;
import defpackage.fa40;
import defpackage.ga40;
import defpackage.gb40;
import defpackage.gci0;
import defpackage.i3y;
import defpackage.jb40;
import defpackage.jqr;
import defpackage.mu5;
import defpackage.pgd;
import defpackage.sls;
import defpackage.smw0;
import defpackage.tje;
import defpackage.tse;
import defpackage.ua40;
import defpackage.w030;
import defpackage.wfd;
import defpackage.x0z;
import defpackage.x240;
import defpackage.x4e;
import defpackage.y3g;
import defpackage.y50;
import defpackage.ya40;
import defpackage.z0a0;
import defpackage.zd40;
import java.util.HashMap;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.trains.checkout.a;
import ru.yandex.taxi.masstransit.trains.checkout.i;
import ru.yandex.taxi.masstransit.trains.checkout.j;
import ru.yandex.taxi.masstransit.trains.checkout.k;
import ru.yandex.taxi.masstransit.trains.checkout.r;

/* loaded from: classes6.dex */
public final class i extends pgd {
    public final Context F;
    public final w030 G;
    public final zd40 H;
    public final aa40 I;
    public final ua40 J;
    public final eb40 K;
    public final ea40 L;
    public final jb40 M;
    public final x0z N;
    public final e840 O;
    public final x0z P;
    public final y3g Q;
    public final y50 R;
    public final ga40 S;
    public final ya40 T;
    public final i3y U;
    public final i3y V;
    public final aj31 W;
    public final mu5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, w030 w030Var, zd40 zd40Var, aa40 aa40Var, ua40 ua40Var, eb40 eb40Var, ea40 ea40Var, jb40 jb40Var, x0z x0zVar, e840 e840Var, x0z x0zVar2, y3g y3gVar, y50 y50Var, z0a0 z0a0Var, ga40 ga40Var) {
        super(0);
        final int i = 0;
        this.F = context;
        this.G = w030Var;
        this.H = zd40Var;
        this.I = aa40Var;
        this.J = ua40Var;
        this.K = eb40Var;
        this.L = ea40Var;
        this.M = jb40Var;
        this.N = x0zVar;
        this.O = e840Var;
        this.P = x0zVar2;
        this.Q = y3gVar;
        this.R = y50Var;
        this.S = ga40Var;
        this.T = new ya40(this);
        this.U = kotlin.a.a(new sls(this) { // from class: xa40
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                i iVar = this.b;
                switch (i2) {
                    case 0:
                        aa40 aa40Var2 = iVar.I;
                        eb40 eb40Var2 = iVar.K;
                        ea40 ea40Var2 = iVar.L;
                        jb40 jb40Var2 = iVar.M;
                        dt20 dt20Var = aa40Var2.a;
                        return new a(eb40Var2, ea40Var2, jb40Var2, (j) ((xvf0) dt20Var.b).get(), (ga40) ((xvf0) dt20Var.c).get(), i5m.a((wvq) dt20Var.w), (zuj0) ((xvf0) dt20Var.x).get());
                    default:
                        zd40 zd40Var2 = iVar.H;
                        ea40 ea40Var3 = iVar.L;
                        v31 v31Var = zd40Var2.a;
                        pwy0 pwy0Var = (pwy0) v31Var.a.get();
                        tt2 tt2Var = (tt2) v31Var.b.get();
                        return new r(pwy0Var, tt2Var, (k) v31Var.d.get(), (p) v31Var.e.get(), (a2a0) v31Var.f.get(), (zuj0) v31Var.g.get(), (ga40) v31Var.h.get(), ea40Var3);
                }
            }
        });
        final int i2 = 1;
        this.V = kotlin.a.a(new sls(this) { // from class: xa40
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                i iVar = this.b;
                switch (i22) {
                    case 0:
                        aa40 aa40Var2 = iVar.I;
                        eb40 eb40Var2 = iVar.K;
                        ea40 ea40Var2 = iVar.L;
                        jb40 jb40Var2 = iVar.M;
                        dt20 dt20Var = aa40Var2.a;
                        return new a(eb40Var2, ea40Var2, jb40Var2, (j) ((xvf0) dt20Var.b).get(), (ga40) ((xvf0) dt20Var.c).get(), i5m.a((wvq) dt20Var.w), (zuj0) ((xvf0) dt20Var.x).get());
                    default:
                        zd40 zd40Var2 = iVar.H;
                        ea40 ea40Var3 = iVar.L;
                        v31 v31Var = zd40Var2.a;
                        pwy0 pwy0Var = (pwy0) v31Var.a.get();
                        tt2 tt2Var = (tt2) v31Var.b.get();
                        return new r(pwy0Var, tt2Var, (k) v31Var.d.get(), (p) v31Var.e.get(), (a2a0) v31Var.f.get(), (zuj0) v31Var.g.get(), (ga40) v31Var.h.get(), ea40Var3);
                }
            }
        });
        this.W = new aj31(3, z0a0Var);
        this.Z = new mu5(new x240(7, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        gb40 gb40Var = (gb40) obj;
        super.G(gb40Var);
        tse o = o();
        a aVar = (a) this.U.getValue();
        r U = U();
        this.J.getClass();
        eb40 eb40Var = this.K;
        gci0 gci0Var = eb40Var.c;
        ya40 ya40Var = this.T;
        tje.N(o, null, null, new MtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.p(new jqr(new e(new c(new kotlinx.coroutines.flow.n(gci0Var, new MtTrainCheckoutLifecycleInteractor$onAttach$1(aVar, gb40Var, U, ya40Var, o, null)))), new MtTrainCheckoutLifecycleInteractor$onAttach$4(aVar, null), 3), 500L), null, aVar, gb40Var, U, ya40Var, o), 3);
        tje.N(o, null, null, new MtTrainCheckoutLifecycleInteractor$onAttach$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.d(this.M.a), null, aVar, eb40Var, gb40Var, U, ya40Var, o, this.L), 3);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        super.H((gb40) obj);
        U().f.e = false;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        gb40 gb40Var = (gb40) obj;
        ga40 ga40Var = this.S;
        fa40 fa40Var = ga40Var.a;
        String str = gb40Var.d;
        if (str == null) {
            str = "";
        }
        String str2 = gb40Var.b;
        String str3 = str2 == null ? "" : str2;
        String str4 = gb40Var.c;
        ga40Var.a = fa40.a(fa40Var, null, str, null, null, null, 0, null, str3, str4 == null ? "" : str4, null, null, null, null, null, 15997);
        ea40 ea40Var = this.L;
        fa40 fa40Var2 = ea40Var.b.a;
        b611 b611Var = ea40Var.a;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = ea40Var.d;
        String str5 = fa40Var2.b;
        String str6 = fa40Var2.h;
        String str7 = fa40Var2.i;
        HashMap o = smw0.o(b611Var);
        o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        o.put("selected_date", str5);
        b611Var.a.a("TransportRoute.Checkout.Shown", o, 4, x4e.q(o, "start_stop_id", str6, "final_stop_id", str7));
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.Z;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    public final r U() {
        return (r) this.V.getValue();
    }
}
