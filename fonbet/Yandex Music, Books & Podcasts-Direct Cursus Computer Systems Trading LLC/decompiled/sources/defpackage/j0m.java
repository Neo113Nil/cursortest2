package defpackage;

/* loaded from: classes3.dex */
public final class j0m extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n0m k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0m(n0m n0mVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = n0mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return n0m.G(this.k, null, this);
    }
}
