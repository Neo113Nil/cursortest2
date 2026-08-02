package defpackage;

/* loaded from: classes5.dex */
public final class tsl extends cg6 {
    public String j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ btl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsl(btl btlVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = btlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.j(null, 0L, null, this);
    }
}
