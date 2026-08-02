package ru.yandex.taxi.scooters.presentation.route;

import com.yandex.mapkit.transport.masstransit.Route;
import defpackage.ah00;
import defpackage.cg30;
import defpackage.g0o0;
import defpackage.g92;
import defpackage.gci0;
import defpackage.h55;
import defpackage.k7g;
import defpackage.m0o0;
import defpackage.qr40;
import defpackage.tje;
import defpackage.tpr;
import defpackage.xm00;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class a extends h55 {
    public final ah00 D;
    public final m0o0 E;
    public final qr40 F;
    public final k7g G;
    public cg30 H;
    public xm00 I;
    public Route J;
    public Route K;
    public boolean L;
    public boolean M;

    public a(ah00 ah00Var, m0o0 m0o0Var, qr40 qr40Var, k7g k7gVar) {
        super(null);
        this.D = ah00Var;
        this.E = m0o0Var;
        this.F = qr40Var;
        this.G = k7gVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        cg30 cg30Var = this.H;
        if (cg30Var != null) {
            cg30Var.i();
        }
        this.H = null;
        xm00 xm00Var = this.I;
        if (xm00Var != null) {
            xm00Var.d();
        }
        this.I = null;
        this.E.b.Fg(Boolean.TRUE);
        this.J = null;
        this.K = null;
        this.L = false;
        this.M = false;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        gci0 d = e.d(this.F.a);
        tpr tprVar = ((g0o0) obj).a;
        if (tprVar == null) {
            tprVar = new g92(2, null);
        }
        tje.N(o(), null, null, new ScootersMtRouteOverlayRouter$onLaunch$$inlined$collectLatestIn$1(e.n(d, tprVar, e.d((r0) this.E.b.b), new ScootersMtRouteOverlayRouter$onLaunch$1(4, null)), null, this), 3);
    }
}
