package defpackage;

/* loaded from: classes4.dex */
public final class v3m extends cg6 {
    public String j;
    public cvl k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b4m n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3m(b4m b4mVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = b4mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.d(null, null, false, this);
    }
}
