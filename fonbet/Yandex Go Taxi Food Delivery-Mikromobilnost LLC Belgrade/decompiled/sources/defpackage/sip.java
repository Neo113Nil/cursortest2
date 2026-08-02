package defpackage;

/* loaded from: classes5.dex */
public final class sip implements v7p {
    public final /* synthetic */ int a;
    public final t4 b;

    public /* synthetic */ sip(Object obj, t4 t4Var, int i) {
        this.a = i;
        this.b = t4Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        t4 t4Var = this.b;
        switch (i) {
            case 0:
                m2v m2vVar = (m2v) t4Var.get();
                return new xj0((vj0) m2vVar.a, (zav0) m2vVar.b, (l7s0) m2vVar.c, (yj0) m2vVar.w);
            default:
                m2v m2vVar2 = (m2v) t4Var.get();
                return new xj0((vj0) m2vVar2.a, (zav0) m2vVar2.b, (l7s0) m2vVar2.c, (yj0) m2vVar2.w);
        }
    }
}
