package defpackage;

/* loaded from: classes6.dex */
public final class xsg implements rqn, tqg {
    public final t44 a;
    public final g06 b = new g06(new d5b(), c5b.a);

    public xsg(t44 t44Var) {
        this.a = t44Var;
    }

    @Override // defpackage.tqg
    public final g06 a() {
        return this.b;
    }

    @Override // defpackage.rqn
    public final Object b(Object obj, ohb ohbVar) {
        return this.a.invoke(obj, ohbVar);
    }
}
