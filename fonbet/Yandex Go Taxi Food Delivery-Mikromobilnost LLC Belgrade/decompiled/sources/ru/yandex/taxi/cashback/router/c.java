package ru.yandex.taxi.cashback.router;

import defpackage.e5c;
import defpackage.f5c;
import defpackage.frd0;
import defpackage.h55;
import defpackage.hbp0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.m950;
import defpackage.mo30;
import defpackage.nrd0;
import defpackage.ord0;
import defpackage.prd0;
import defpackage.q0h;
import defpackage.qp0;
import defpackage.qrd0;
import defpackage.tt2;
import defpackage.w511;
import defpackage.wnb0;
import defpackage.yvf0;
import ru.yandex.taxi.activity.i;

/* loaded from: classes5.dex */
public final class c extends h55 {
    public final yvf0 D;
    public final yvf0 E;
    public final frd0 F;
    public final e5c G;

    public c(yvf0 yvf0Var, yvf0 yvf0Var2, frd0 frd0Var, f5c f5cVar) {
        super(null);
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = frd0Var;
        wnb0 wnb0Var = new wnb0(18, this);
        qp0 qp0Var = f5cVar.a;
        this.G = new e5c(wnb0Var, (i) qp0Var.a.get(), (q0h) qp0Var.b.get(), (tt2) qp0Var.c.get());
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.G.e.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        qrd0 qrd0Var = (qrd0) obj;
        e5c e5cVar = this.G;
        hbp0 hbp0Var = e5cVar.e;
        hbp0Var.f();
        kotlinx.coroutines.flow.e.H(hbp0Var.c(), new jqr(new b(e5cVar.b.c, e5cVar), new ClosePlusHomeOnDeeplinkRouter$start$2(e5cVar, null), 3));
        if (jl40.l(qrd0Var, ord0.a)) {
            z((m950) this.E.get(), new nrd0(this));
        } else if (!(qrd0Var instanceof prd0)) {
            w511.b();
        } else {
            A((m950) this.D.get(), ((prd0) qrd0Var).a, new mo30(15, this));
        }
    }
}
