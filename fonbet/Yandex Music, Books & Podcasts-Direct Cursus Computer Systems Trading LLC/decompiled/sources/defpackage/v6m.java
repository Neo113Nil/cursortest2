package defpackage;

/* loaded from: classes3.dex */
public final class v6m extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ z6m k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6m(z6m z6mVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = z6mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
