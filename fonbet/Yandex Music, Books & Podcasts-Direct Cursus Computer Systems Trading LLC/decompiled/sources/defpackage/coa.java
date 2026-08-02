package defpackage;

/* loaded from: classes.dex */
public final class coa extends cg6 {
    public hoa j;
    public yma k;
    public joa l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hoa n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coa(hoa hoaVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = hoaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return hoa.W0(this.n, null, this);
    }
}
