package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mrf implements krf {
    public final xqq a;
    public final pjc b;
    public final aqd c;

    public mrf(mm6 mm6Var, qnq qnqVar, xqq xqqVar) {
        qnqVar.getClass();
        xqqVar.getClass();
        this.a = xqqVar;
        this.b = xqqVar.K();
        this.c = qnqVar.e;
        vqn vqnVar = new vqn();
        ox6.B(zsd.d0(zsd.M0(new ub7(12, new bca(xqqVar.N(), 18), new nz5(vqnVar, (Continuation) null, 27)), new tn2(3, 5, null)), 1), mm6Var, new lrf(0, this, vqnVar));
    }

    @Override // defpackage.krf
    public final void a(orf orfVar) {
        orfVar.getClass();
        this.a.R(orfVar);
    }

    @Override // defpackage.krf
    public final void b(kyf kyfVar) {
        qoq qoqVar;
        kyfVar.getClass();
        switch (toq.a[kyfVar.ordinal()]) {
            case 1:
                qoqVar = qoq.a;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                qoqVar = null;
                break;
            default:
                b6e.s();
                return;
        }
        if (qoqVar != null) {
            ((x0q) this.c.b).a(qoqVar);
        }
    }

    @Override // defpackage.krf
    public final pjc j() {
        return this.b;
    }
}
