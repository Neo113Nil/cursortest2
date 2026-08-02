package defpackage;

/* loaded from: classes4.dex */
public final class hc1 extends cg6 {
    public String j;
    public j1g k;
    public String l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ mc1 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc1(mc1 mc1Var, cg6 cg6Var) {
        super(cg6Var);
        this.r = mc1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.g(null, null, 0L, this);
    }
}
