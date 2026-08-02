package defpackage;

/* loaded from: classes6.dex */
public final class c4t extends cg6 {
    public mqs j;
    public cvl k;
    public /* synthetic */ Object l;
    public final /* synthetic */ e4t m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4t(e4t e4tVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = e4tVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, null, this);
    }
}
