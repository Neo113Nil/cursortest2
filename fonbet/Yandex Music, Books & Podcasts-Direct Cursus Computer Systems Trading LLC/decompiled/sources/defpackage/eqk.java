package defpackage;

/* loaded from: classes4.dex */
public final class eqk extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ t1f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqk(t1f t1fVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = t1fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.K(null, this);
    }
}
