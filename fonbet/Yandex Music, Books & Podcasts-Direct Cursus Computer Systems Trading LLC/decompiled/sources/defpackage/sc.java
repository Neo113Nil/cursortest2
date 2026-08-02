package defpackage;

/* loaded from: classes4.dex */
public final class sc extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ tc k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc(tc tcVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = tcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, null, null, this);
    }
}
