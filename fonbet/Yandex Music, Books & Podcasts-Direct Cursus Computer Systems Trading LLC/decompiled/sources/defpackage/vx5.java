package defpackage;

/* loaded from: classes3.dex */
public final class vx5 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ xx5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx5(xx5 xx5Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = xx5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, null, this);
    }
}
