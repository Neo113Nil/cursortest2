package defpackage;

/* loaded from: classes3.dex */
public final class o1q extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p1q k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1q(p1q p1qVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = p1qVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, this);
    }
}
