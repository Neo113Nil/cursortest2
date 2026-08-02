package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class gnv {
    public final k81 a;
    public final kxi b;
    public final q0v c;
    public final g0l d;
    public final tf6 e = gld.e(dm6.b());
    public final l3l f = new l3l();
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;

    public gnv(k81 k81Var, kxi kxiVar, q0v q0vVar, g0l g0lVar, jyr jyrVar, jyr jyrVar2, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5) {
        this.a = k81Var;
        this.b = kxiVar;
        this.c = q0vVar;
        this.d = g0lVar;
        this.g = jyrVar;
        this.h = jyrVar4;
        this.i = jyrVar3;
        this.j = jyrVar2;
        this.k = jyrVar5;
    }

    public final void a(String str) {
        str.getClass();
        this.c.invoke(mnv.a);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean h = ((a4q) ((byb) qdcVar.C(I)).c(ern.a(a4q.class))).h();
        Continuation continuation = null;
        if (h) {
            x97.y(this.e, null, null, new y6v(this, continuation, 6), 3);
        } else {
            z5l.e((z5l) this.j.getValue(), new aa0(this, str, continuation, 12));
        }
    }
}
