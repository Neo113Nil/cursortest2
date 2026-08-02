package defpackage;

/* loaded from: classes4.dex */
public final class hmt extends cg6 {
    public jp0 j;
    public oqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jp0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmt(jp0 jp0Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = jp0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return jp0.b(this.m, this);
    }
}
