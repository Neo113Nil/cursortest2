package ru.yandex.taxi.delivery.ui.setuprequierements;

import android.app.Activity;
import android.content.Context;
import com.yandex.go.taxi.tariffs.repository.g;
import defpackage.apf;
import defpackage.b1;
import defpackage.cq40;
import defpackage.dhs0;
import defpackage.dqe0;
import defpackage.g580;
import defpackage.gmh;
import defpackage.gsi;
import defpackage.iev0;
import defpackage.jpi;
import defpackage.kbi;
import defpackage.kki;
import defpackage.lx4;
import defpackage.m230;
import defpackage.mpi;
import defpackage.n3w;
import defpackage.ncb;
import defpackage.oep0;
import defpackage.pho;
import defpackage.pwy0;
import defpackage.q5z;
import defpackage.rqo;
import defpackage.rwh;
import defpackage.st0;
import defpackage.syf;
import defpackage.tt2;
import defpackage.u45;
import defpackage.vsi;
import defpackage.w030;
import defpackage.wiq0;
import defpackage.wj0;
import defpackage.wmi;
import defpackage.xjj0;
import defpackage.xvf0;
import defpackage.ynj0;
import defpackage.zch;
import defpackage.zsi;
import ru.yandex.taxi.delivery.interactors.p;

/* loaded from: classes5.dex */
public final class c extends m230 {
    public final w030 E;
    public final Context F;
    public final g580 G;
    public final vsi H;
    public final xjj0 I;
    public final p J;
    public final wiq0 K;
    public final rqo L;
    public final ynj0 M;
    public final Activity N;
    public final g O;
    public final cq40 P;
    public final iev0 Q;
    public final oep0 R;
    public final pho S;
    public final tt2 T;
    public final pwy0 U;
    public final boolean V;

    public c(w030 w030Var, Context context, g580 g580Var, vsi vsiVar, xjj0 xjj0Var, lx4 lx4Var, kki kkiVar, gsi gsiVar, dqe0 dqe0Var, p pVar, zsi zsiVar, wiq0 wiq0Var, rqo rqoVar, ynj0 ynj0Var, Activity activity, g gVar, cq40 cq40Var, iev0 iev0Var, oep0 oep0Var, pho phoVar, tt2 tt2Var, pwy0 pwy0Var) {
        super(null);
        this.E = w030Var;
        this.F = context;
        this.G = g580Var;
        this.H = vsiVar;
        this.I = xjj0Var;
        this.J = pVar;
        this.K = wiq0Var;
        this.L = rqoVar;
        this.M = ynj0Var;
        this.N = activity;
        this.O = gVar;
        this.P = cq40Var;
        this.Q = iev0Var;
        this.R = oep0Var;
        this.S = phoVar;
        this.T = tt2Var;
        this.U = pwy0Var;
        this.V = true;
    }

    @Override // defpackage.m230
    public final w030 P() {
        return this.E;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        return this.V;
    }

    @Override // defpackage.m230
    public final u45 S(Object obj) {
        jpi jpiVar = this.H.c;
        xjj0 xjj0Var = this.I;
        p pVar = this.J;
        wiq0 wiq0Var = this.K;
        rqo rqoVar = this.L;
        ynj0 ynj0Var = this.M;
        Activity activity = this.N;
        tt2 tt2Var = this.T;
        Context context = this.F;
        pwy0 pwy0Var = this.U;
        g gVar = this.O;
        cq40 cq40Var = this.P;
        iev0 iev0Var = this.Q;
        oep0 oep0Var = this.R;
        pho phoVar = this.S;
        st0 st0Var = new st0(xjj0Var, jpiVar, pVar, wiq0Var, rqoVar, ynj0Var, activity, tt2Var, context, pwy0Var, gVar, cq40Var, iev0Var, oep0Var, phoVar);
        g580 g580Var = this.G;
        g580Var.getClass();
        syf syfVar = new syf(st0Var, 0);
        syf syfVar2 = new syf(st0Var, 9);
        syf syfVar3 = new syf(st0Var, 7);
        n3w a = n3w.a(g580Var);
        syf syfVar4 = new syf(st0Var, 1);
        syf syfVar5 = new syf(st0Var, 2);
        syf syfVar6 = new syf(st0Var, 10);
        syf syfVar7 = new syf(st0Var, 8);
        syf syfVar8 = new syf(st0Var, 6);
        syf syfVar9 = new syf(st0Var, 5);
        syf syfVar10 = new syf(st0Var, 4);
        ncb ncbVar = new ncb((xvf0) syfVar, (xvf0) syfVar2, (xvf0) syfVar3, (xvf0) a, (xvf0) new wj0(syfVar4, syfVar5, syfVar6, syfVar7, syfVar8, syfVar9, syfVar2, syfVar10, 12), (xvf0) new gmh(new rwh(new syf(st0Var, 3), 19), 10), 19);
        xvf0 a2 = dhs0.a(new rwh(syfVar10, 17));
        q5z.h(phoVar);
        zch zchVar = new zch(new b1(phoVar));
        q5z.h(pVar);
        q5z.h(wiq0Var);
        wmi wmiVar = (wmi) a2.get();
        q5z.h(xjj0Var);
        q5z.h(rqoVar);
        apf apfVar = new apf(wiq0Var, wmiVar, xjj0Var, new kbi(rqoVar), 15);
        q5z.h(oep0Var);
        return new DeliverySetupRequirementsModalView(this.F, new mpi(jpiVar, zchVar, ncbVar, pVar, apfVar, oep0Var), new DeliverySetupRequirementsRouter$provideModalView$1(2, this, c.class, "requirementCallback", "requirementCallback(Ljava/lang/String;Z)V", 0));
    }
}
