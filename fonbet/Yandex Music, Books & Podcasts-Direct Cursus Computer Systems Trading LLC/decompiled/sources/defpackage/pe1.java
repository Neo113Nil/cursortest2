package defpackage;

/* loaded from: classes3.dex */
public final class pe1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ qe1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe1(qe1 qe1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = qe1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
