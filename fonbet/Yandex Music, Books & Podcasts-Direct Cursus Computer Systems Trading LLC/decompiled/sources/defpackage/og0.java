package defpackage;

/* loaded from: classes.dex */
public final class og0 extends cg6 {
    public qg0 j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qg0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og0(qg0 qg0Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = qg0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(0L, null, this);
    }
}
