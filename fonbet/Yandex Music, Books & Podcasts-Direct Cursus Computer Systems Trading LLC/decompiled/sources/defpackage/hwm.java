package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class hwm implements knq {
    public static final /* synthetic */ s9f[] e;
    public final boq a;
    public final tmb b;
    public final jwm c;
    public final z6n d;

    static {
        opi opiVar = new opi(hwm.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        e = new s9f[]{opiVar};
    }

    public hwm(boq boqVar, tmb tmbVar, jwm jwmVar) {
        tmbVar.getClass();
        this.a = boqVar;
        this.b = tmbVar;
        this.c = jwmVar;
        this.d = new z6n(7);
    }

    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        nwm nwmVar = (nwm) rnqVar;
        qnqVar.getClass();
        fwm fwmVar = nwmVar.h;
        nrf nrfVar = fwmVar.a;
        rar y = x97.y(qnqVar.c, null, null, new b5l(qnqVar, nwmVar, (Continuation) null, 28), 3);
        this.d.setValue(this, e[0], y);
        dqj Q = rzf.Q(new g73(nrfVar.a, nrfVar.b, new wn5(new gvl(this, nwmVar, qnqVar, nrfVar, 14), -1834735856, true), (cma) null, 24), fwmVar.d, null, null, null, null, 62);
        xdr xdrVar = nwmVar.d.c;
        xdrVar.getClass();
        return tyf.I(new cyd(Q, xdrVar), new mjm(3, nwmVar), null, 14);
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        return new nwm(s63Var, s63Var.d, q5g.x(this.b, s63Var));
    }
}
