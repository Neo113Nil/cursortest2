package defpackage;

/* loaded from: classes4.dex */
public final class f37 extends cg6 {
    public h37 j;
    public Object k;
    public Throwable l;
    public /* synthetic */ Object m;
    public final /* synthetic */ h37 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f37(h37 h37Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = h37Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return h37.a(this.n, null, null, this);
    }
}
