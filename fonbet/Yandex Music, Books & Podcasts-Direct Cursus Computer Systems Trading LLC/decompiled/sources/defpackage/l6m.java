package defpackage;

/* loaded from: classes6.dex */
public final class l6m extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ m6m k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6m(m6m m6mVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = m6mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
