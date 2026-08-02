package defpackage;

/* loaded from: classes4.dex */
public final class fxs extends cg6 {
    public String j;
    public rr5 k;
    public long l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ kxs o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxs(kxs kxsVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = kxsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.g(null, 0L, null, 0L, this);
    }
}
