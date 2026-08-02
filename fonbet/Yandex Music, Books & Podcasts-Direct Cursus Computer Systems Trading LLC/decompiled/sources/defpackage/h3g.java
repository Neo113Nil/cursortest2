package defpackage;

/* loaded from: classes5.dex */
public final class h3g extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ t3g k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3g(t3g t3gVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = t3gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(null, this);
    }
}
