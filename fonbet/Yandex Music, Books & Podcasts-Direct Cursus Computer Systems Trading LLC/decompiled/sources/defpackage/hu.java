package defpackage;

/* loaded from: classes4.dex */
public final class hu extends cg6 {
    public String j;
    public j1g k;
    public String l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ mu r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu(mu muVar, cg6 cg6Var) {
        super(cg6Var);
        this.r = muVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.f(null, null, 0L, this);
    }
}
