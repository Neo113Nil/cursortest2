package defpackage;

/* loaded from: classes3.dex */
public final class uj5 extends cg6 {
    public zh5 j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xj5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj5(xj5 xj5Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = xj5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, false, 0L, this);
    }
}
