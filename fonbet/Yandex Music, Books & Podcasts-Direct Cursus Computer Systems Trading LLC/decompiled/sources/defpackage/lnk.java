package defpackage;

/* loaded from: classes5.dex */
public final class lnk extends cg6 {
    public String j;
    public String k;
    public Long l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ gs4 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnk(gs4 gs4Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = gs4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.T(null, 0L, null, null, this);
    }
}
