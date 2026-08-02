package defpackage;

/* loaded from: classes3.dex */
public final class h5p extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ i9w k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5p(i9w i9wVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = i9wVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.G(null, false, this);
    }
}
