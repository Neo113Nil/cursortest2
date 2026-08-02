package defpackage;

/* loaded from: classes3.dex */
public final class ad1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bd1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad1(bd1 bd1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = bd1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
