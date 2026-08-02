package defpackage;

/* loaded from: classes4.dex */
public final class fo1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ go1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo1(go1 go1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = go1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, 0, this);
    }
}
