package defpackage;

/* loaded from: classes4.dex */
public final class xk1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bl1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk1(bl1 bl1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = bl1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
