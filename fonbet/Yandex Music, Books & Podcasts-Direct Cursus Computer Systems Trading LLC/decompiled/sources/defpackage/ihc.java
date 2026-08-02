package defpackage;

/* loaded from: classes.dex */
public final class ihc extends cg6 {
    public x0 j;
    public qqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ x0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ihc(x0 x0Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = x0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.G(this);
    }
}
