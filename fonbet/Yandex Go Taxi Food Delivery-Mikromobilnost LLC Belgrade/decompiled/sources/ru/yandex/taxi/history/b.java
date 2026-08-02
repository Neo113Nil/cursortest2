package ru.yandex.taxi.history;

import defpackage.bdp;
import defpackage.cmu;
import defpackage.dmu;
import defpackage.emu;
import defpackage.eqh;
import defpackage.fmu;
import defpackage.h55;
import defpackage.ic0;
import defpackage.jj10;
import defpackage.jj3;
import defpackage.m950;
import defpackage.qzj0;
import defpackage.rvx0;
import defpackage.sls;
import defpackage.tje;
import defpackage.um3;
import defpackage.w511;
import defpackage.yvf0;
import defpackage.zo1;
import defpackage.zuj0;
import java.util.HashMap;
import java.util.Optional;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;

/* loaded from: classes5.dex */
public final class b extends h55 implements m950 {
    public final yvf0 D;
    public final yvf0 E;
    public final eqh F;
    public final rvx0 G;
    public final jj10 H;
    public final ru.yandex.taxi.am.token.a I;
    public final zuj0 J;
    public final jj3 K;

    public b(yvf0 yvf0Var, yvf0 yvf0Var2, eqh eqhVar, rvx0 rvx0Var, jj10 jj10Var, ru.yandex.taxi.am.token.a aVar, zuj0 zuj0Var, jj3 jj3Var) {
        super(null);
        this.D = yvf0Var;
        this.E = yvf0Var2;
        this.F = eqhVar;
        this.G = rvx0Var;
        this.H = jj10Var;
        this.I = aVar;
        this.J = zuj0Var;
        this.K = jj3Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        emu emuVar = (emu) obj;
        jj10 jj10Var = this.H;
        jj10Var.getClass();
        jj10Var.a.a("Menu.OrderHistoryTapped", new HashMap(), 1, new HashMap());
        if (emuVar instanceof dmu) {
            P(Events$Zalogin$LoginContext.MENU, new zo1(this, ((dmu) emuVar).a, 10));
        } else if (!(emuVar instanceof cmu)) {
            w511.b();
        } else {
            P(Events$Zalogin$LoginContext.DEEPLINK, new bdp(27, this, ((cmu) emuVar).a));
        }
    }

    public final void P(Events$Zalogin$LoginContext events$Zalogin$LoginContext, sls slsVar) {
        this.K.c(new um3(events$Zalogin$LoginContext, new qzj0(null, new ic0(21, slsVar)), false, false, 28));
    }

    public final void Q(String str) {
        A((ru.yandex.taxi.new_history.a) this.D.get(), Optional.of(str), new fmu(this, 0));
    }

    public final void R(boolean z) {
        tje.N(o(), null, null, new HistoryRouterImpl$openOldHistoryWithoutAuthCheck$1(this, z, null), 3);
    }
}
