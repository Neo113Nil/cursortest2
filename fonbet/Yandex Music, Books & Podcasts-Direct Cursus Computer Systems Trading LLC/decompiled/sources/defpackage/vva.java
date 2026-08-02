package defpackage;

/* loaded from: classes3.dex */
public final class vva extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ xva k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vva(xva xvaVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = xvaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(0L, 0L, this);
    }
}
