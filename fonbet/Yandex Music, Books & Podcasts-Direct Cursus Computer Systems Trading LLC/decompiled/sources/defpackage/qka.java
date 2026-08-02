package defpackage;

/* loaded from: classes3.dex */
public final class qka extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ es6 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qka(es6 es6Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = es6Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.J(null, null, null, null, this);
    }
}
