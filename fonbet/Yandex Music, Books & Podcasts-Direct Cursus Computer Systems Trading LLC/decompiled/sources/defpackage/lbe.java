package defpackage;

/* loaded from: classes.dex */
public final class lbe extends cg6 {
    public nbe j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nbe m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbe(nbe nbeVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = nbeVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, this);
    }
}
