package defpackage;

/* loaded from: classes.dex */
public final class tkn extends cg6 {
    public mr1 j;
    public cse k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mr1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tkn(mr1 mr1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = mr1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
