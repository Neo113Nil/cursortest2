package defpackage;

/* loaded from: classes4.dex */
public final class zvl extends cg6 {
    public nvl j;
    public j1g k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bwl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvl(bwl bwlVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bwlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(null, null, this);
    }
}
