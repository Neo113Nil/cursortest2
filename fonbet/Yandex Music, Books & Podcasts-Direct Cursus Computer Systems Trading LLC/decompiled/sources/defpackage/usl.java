package defpackage;

/* loaded from: classes5.dex */
public final class usl extends cg6 {
    public btl j;
    public cvl k;
    public /* synthetic */ Object l;
    public final /* synthetic */ btl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usl(btl btlVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = btlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(null, this);
    }
}
