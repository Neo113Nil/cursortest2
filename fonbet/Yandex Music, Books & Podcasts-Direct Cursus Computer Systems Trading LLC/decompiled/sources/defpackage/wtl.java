package defpackage;

/* loaded from: classes4.dex */
public final class wtl extends cg6 {
    public String j;
    public cvl k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xtl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtl(xtl xtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = xtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, null, this);
    }
}
