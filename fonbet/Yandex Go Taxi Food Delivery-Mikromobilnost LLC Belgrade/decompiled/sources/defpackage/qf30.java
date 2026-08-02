package defpackage;

import android.content.Context;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticSource;
import ru.yandex.taxi.masstransit.analytic.MtDetailedRouteAnalyticType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.detailedroute.ui.v2.d;
import ru.yandex.taxi.masstransit.detailedroute.ui.v2.o;
import ru.yandex.taxi.masstransit.router.MtHubLeadingItemKind;

/* loaded from: classes6.dex */
public final class qf30 extends pgd {
    public final Context F;
    public final w030 G;
    public final o H;
    public final d I;
    public final yw30 J;
    public final y50 K;
    public final h3y L;
    public final a3v M;
    public final zuj0 N;
    public final yvf0 O;
    public final gtc P;
    public final yvf0 Q;
    public final lz30 R;
    public final n6a0 S;
    public final s111 T;
    public final pf30 U;
    public final aj31 V;
    public final mu5 W;

    public qf30(Context context, w030 w030Var, o oVar, d dVar, yw30 yw30Var, y50 y50Var, h3y h3yVar, a3v a3vVar, zuj0 zuj0Var, yvf0 yvf0Var, z0a0 z0a0Var, gtc gtcVar, yvf0 yvf0Var2, lz30 lz30Var, n6a0 n6a0Var, s111 s111Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = oVar;
        this.I = dVar;
        this.J = yw30Var;
        this.K = y50Var;
        this.L = h3yVar;
        this.M = a3vVar;
        this.N = zuj0Var;
        this.O = yvf0Var;
        this.P = gtcVar;
        this.Q = yvf0Var2;
        this.R = lz30Var;
        this.S = n6a0Var;
        this.T = s111Var;
        this.U = new pf30(this, 0);
        this.V = new aj31(3, z0a0Var);
        this.W = new mu5(new ft20(13, this));
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        sg30 sg30Var = (sg30) obj;
        uj30 uj30Var = (uj30) this.O.get();
        su30 su30Var = sg30Var.a;
        MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = sg30Var.b;
        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = sg30Var.c;
        lm30 lm30Var = sg30Var.d;
        o oVar = this.H;
        oVar.n = su30Var;
        oVar.o = uj30Var;
        oVar.p = mtDetailedRouteAnalyticSource;
        oVar.q = mtDetailedRouteAnalyticType;
        oVar.r = lm30Var;
        MtHubLeadingItemKind mtHubLeadingItemKind = lm30Var != null ? lm30Var.c : null;
        int i = mtHubLeadingItemKind == null ? -1 : zh30.a[mtHubLeadingItemKind.ordinal()];
        v011 v011Var = oVar.g;
        if (i == 1) {
            ((ru.yandex.taxi.masstransit.paymentcards.d) v011Var).a(oVar.h.f());
        } else {
            ru.yandex.taxi.masstransit.paymentcards.d dVar = (ru.yandex.taxi.masstransit.paymentcards.d) v011Var;
            pzt0 pzt0Var = dVar.k;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            dVar.k = null;
        }
        su30 su30Var2 = sg30Var.a;
        d dVar2 = this.I;
        dVar2.h = su30Var2;
        dVar2.k = mtDetailedRouteAnalyticSource;
        dVar2.l = mtDetailedRouteAnalyticType;
        dVar2.i = uj30Var;
        dVar2.j = oVar;
        dVar2.m = lm30Var;
        super.G(sg30Var);
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.M.a0(this);
        ru.yandex.taxi.masstransit.paymentcards.d dVar = (ru.yandex.taxi.masstransit.paymentcards.d) this.H.g;
        pzt0 pzt0Var = dVar.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.k = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    @Override // defpackage.h55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Object obj) {
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource;
        int i;
        TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType;
        sg30 sg30Var = (sg30) obj;
        TransportRouteAnalytics$DetailCardOrigin transportRouteAnalytics$DetailCardOrigin = TransportRouteAnalytics$DetailCardOrigin.ButtonTap;
        boolean e = cta1.e(sg30Var.a);
        MtDetailedRouteAnalyticSource mtDetailedRouteAnalyticSource = sg30Var.b;
        int i2 = mtDetailedRouteAnalyticSource == null ? -1 : bf30.a[mtDetailedRouteAnalyticSource.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Hub;
                MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType = sg30Var.c;
                i = mtDetailedRouteAnalyticType != null ? -1 : bf30.b[mtDetailedRouteAnalyticType.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Vertical;
                        this.J.a.f(e, transportRouteAnalytics$DetailCardOrigin, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(sg30Var.a.a));
                        this.M.b8(this);
                    }
                    if (i != 2) {
                        w511.b();
                        return;
                    }
                }
                transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
                this.J.a.f(e, transportRouteAnalytics$DetailCardOrigin, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(sg30Var.a.a));
                this.M.b8(this);
            }
            if (i2 != 2) {
                w511.b();
                return;
            }
        }
        transportRouteAnalytics$DetailCardSource = TransportRouteAnalytics$DetailCardSource.Transport;
        MtDetailedRouteAnalyticType mtDetailedRouteAnalyticType2 = sg30Var.c;
        if (mtDetailedRouteAnalyticType2 != null) {
        }
        if (i != -1) {
        }
        transportRouteAnalytics$DetailCardType = TransportRouteAnalytics$DetailCardType.Horizontal;
        this.J.a.f(e, transportRouteAnalytics$DetailCardOrigin, transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType, wtb1.d(sg30Var.a.a));
        this.M.b8(this);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.W;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }

    @Override // defpackage.pgd
    public final boolean T() {
        return true;
    }
}
