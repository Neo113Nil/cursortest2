package defpackage;

/* loaded from: classes4.dex */
public final class g1p extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ h1p k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1p(h1p h1pVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = h1pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
