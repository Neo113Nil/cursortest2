package defpackage;

/* loaded from: classes.dex */
public final class sf0 extends cg6 {
    public tf0 j;
    public si3 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tf0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf0(tf0 tf0Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = tf0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(this);
    }
}
