package defpackage;

/* loaded from: classes5.dex */
public final class zn0 extends b6 {
    public final xn0 d;
    public final xn0 e;
    public final yn0 f;
    public final yn0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn0(String str, Object obj, b6 b6Var, xn0 xn0Var, xn0 xn0Var2, yn0 yn0Var, yn0 yn0Var2) {
        super(obj, str);
        str.getClass();
        obj.getClass();
        b6Var.getClass();
        this.d = xn0Var;
        this.e = xn0Var2;
        this.f = yn0Var;
        this.g = yn0Var2;
    }

    @Override // defpackage.b6
    public final Object E(q1f q1fVar) {
        q1fVar.getClass();
        return this.f.invoke(q1fVar);
    }

    @Override // defpackage.b6
    public final q1f J(Object obj) {
        yn0 yn0Var = this.g;
        yn0Var.getClass();
        return yn0Var.s.J(obj);
    }

    @Override // defpackage.b6
    public final Object u() {
        return this.d.invoke();
    }

    @Override // defpackage.b6
    public final Object v() {
        return this.e.invoke();
    }
}
