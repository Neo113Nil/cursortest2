package defpackage;

/* loaded from: classes3.dex */
public final class hiq extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ jp0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hiq(jp0 jp0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = jp0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return jp0.a(this.k, this);
    }
}
