package defpackage;

/* loaded from: classes5.dex */
public final class v58 extends cg6 {
    public Object j;
    public bw1 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bw1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v58(bw1 bw1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = bw1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return bw1.f(this.m, null, this);
    }
}
