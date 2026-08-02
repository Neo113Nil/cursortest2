package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class og5 implements eiw {
    public final /* synthetic */ int a = 1;
    public final boolean b;
    public final Object c;
    public final Object d;

    public og5(nyu nyuVar, xsu xsuVar, boolean z) {
        nyn nynVar = nyn.a;
        xsuVar.getClass();
        this.c = nyuVar;
        this.d = xsuVar;
        this.b = z;
    }

    @Override // defpackage.eiw
    public final Object a(rcr rcrVar) {
        switch (this.a) {
            case 0:
                return x97.V(dm6.b, new v3(this, (Continuation) null, 19), rcrVar);
            default:
                l18 l18Var = l18.b;
                bdt I = hag.I(f5v.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return x97.V(dm6.b, new r1w(new evj((f5v) qdcVar.C(I), (nyu) this.c, (xsu) this.d, nyn.a, h4q.b, this.b), null, 8), rcrVar);
        }
    }

    public og5(se5 se5Var, boolean z, h4q h4qVar) {
        h4qVar.getClass();
        this.c = se5Var;
        this.b = z;
        this.d = h4qVar;
    }
}
