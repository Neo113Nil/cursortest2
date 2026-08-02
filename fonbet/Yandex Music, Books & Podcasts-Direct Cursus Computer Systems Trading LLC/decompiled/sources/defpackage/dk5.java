package defpackage;

/* loaded from: classes3.dex */
public final class dk5 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ jk5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk5(jk5 jk5Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = jk5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(0L, this);
    }
}
