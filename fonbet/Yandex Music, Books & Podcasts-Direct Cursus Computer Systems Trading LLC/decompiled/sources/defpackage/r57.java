package defpackage;

/* loaded from: classes4.dex */
public final class r57 extends cg6 {
    public y57 j;
    public Throwable k;
    public /* synthetic */ Object l;
    public final /* synthetic */ y57 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r57(y57 y57Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = y57Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return y57.G(this.m, null, null, this);
    }
}
