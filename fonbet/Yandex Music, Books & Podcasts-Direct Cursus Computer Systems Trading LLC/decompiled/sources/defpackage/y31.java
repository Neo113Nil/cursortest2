package defpackage;

/* loaded from: classes4.dex */
public final class y31 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ z31 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(z31 z31Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = z31Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
