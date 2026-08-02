package defpackage;

/* loaded from: classes5.dex */
public final class k5g extends cg6 {
    public nu1 j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nsh m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5g(nsh nshVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = nshVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return nsh.b(this.m, null, this);
    }
}
