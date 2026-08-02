package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class dy2 implements cse {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dy2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cse
    public final Object a(mr1 mr1Var, Continuation continuation) {
        switch (this.a) {
            case 0:
                boolean g = ((z66) this.b).g();
                rce rceVar = (rce) mr1Var.e;
                if (!g) {
                    pce a = rce.a(rceVar);
                    a.s = dq3.DISABLED;
                    rceVar = a.a();
                }
                return mr1Var.b(rceVar, (cg6) continuation);
            default:
                boolean g2 = ((z66) ((xzi) ((tao) this.b).b).a).g();
                rce rceVar2 = (rce) mr1Var.e;
                if (!g2) {
                    pce a2 = rce.a(rceVar2);
                    a2.s = dq3.DISABLED;
                    rceVar2 = a2.a();
                }
                return mr1Var.b(rceVar2, (cg6) continuation);
        }
    }
}
