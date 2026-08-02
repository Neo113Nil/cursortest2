package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class nmf {
    public final pmf a;
    public final xmf b;
    public final fkn c;

    public nmf(pmf pmfVar, xmf xmfVar, frt frtVar, mm6 mm6Var) {
        frtVar.getClass();
        this.a = pmfVar;
        this.b = xmfVar;
        ox6.B(frtVar.g(), mm6Var, new otd(19, this));
        xqn xqnVar = new xqn();
        Continuation continuation = null;
        pjc b0 = zsd.b0(new u21(10, pmfVar.b, xmfVar.e, new v42(this, continuation, 7)));
        mmf mmfVar = new mmf(xqnVar, 0);
        TimeUnit.MILLISECONDS.getClass();
        this.c = zsd.F0(new ub7(12, zsd.M0(b0, new ekc(mmfVar, 300L, (Continuation) null)), new nz5(xqnVar, continuation, 24)), mm6Var, lbq.a, hwu.a);
    }
}
