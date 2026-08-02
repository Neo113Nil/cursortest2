package defpackage;

/* loaded from: classes3.dex */
public final class j06 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ g06 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j06(g06 g06Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = g06Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.X(false, this);
    }
}
