package defpackage;

/* loaded from: classes3.dex */
public final class i0m extends cg6 {
    public boolean j;
    public qqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ n0m m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0m(n0m n0mVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = n0mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return n0m.a(this.m, false, this);
    }
}
