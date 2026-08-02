package defpackage;

/* loaded from: classes5.dex */
public final class s4c implements ro4 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public s4c(sgr sgrVar, no4 no4Var) {
        o2g.J("error must not be OK", !sgrVar.g());
        this.b = sgrVar;
        this.c = no4Var;
    }

    @Override // defpackage.pue
    public final sue a() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not a real transport");
            default:
                return ((s8h) this.c).a();
        }
    }

    @Override // defpackage.ro4
    public final mo4 f(k3i k3iVar, s2i s2iVar, ks3 ks3Var, qo4[] qo4VarArr) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new r4c((sgr) obj2, (no4) obj, qo4VarArr);
            default:
                ks3 ks3Var2 = ks3.h;
                o2g.O(ks3Var, "callOptions cannot be null");
                qo4 a = ((po4) obj2).a(new e0(ks3Var, 0, false), s2iVar);
                o2g.U("lb tracer already assigned", qo4VarArr[qo4VarArr.length - 1] == xqd.q);
                qo4VarArr[qo4VarArr.length - 1] = a;
                return ((s8h) obj).f(k3iVar, s2iVar, ks3Var, qo4VarArr);
        }
    }

    public s4c(po4 po4Var, s8h s8hVar) {
        this.b = po4Var;
        this.c = s8hVar;
    }
}
