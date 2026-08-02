package defpackage;

/* loaded from: classes3.dex */
public final class fk5 extends cg6 {
    public String j;
    public ik5 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ik5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk5(ik5 ik5Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = ik5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, null, null, null, this);
    }
}
