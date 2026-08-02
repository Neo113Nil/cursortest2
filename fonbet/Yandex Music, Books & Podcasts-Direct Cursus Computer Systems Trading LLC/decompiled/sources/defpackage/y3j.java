package defpackage;

/* loaded from: classes3.dex */
public final class y3j extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ z3j k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3j(z3j z3jVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = z3jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return z3j.a(this.k, this);
    }
}
