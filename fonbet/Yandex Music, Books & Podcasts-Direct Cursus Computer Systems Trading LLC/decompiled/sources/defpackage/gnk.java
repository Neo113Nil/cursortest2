package defpackage;

/* loaded from: classes5.dex */
public final class gnk extends cg6 {
    public mqs j;
    public String k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ gs4 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnk(gs4 gs4Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = gs4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.k(null, this);
    }
}
