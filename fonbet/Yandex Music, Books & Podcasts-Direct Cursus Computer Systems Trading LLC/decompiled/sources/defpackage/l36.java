package defpackage;

/* loaded from: classes4.dex */
public final class l36 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ m36 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l36(m36 m36Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = m36Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.q(null, this);
    }
}
