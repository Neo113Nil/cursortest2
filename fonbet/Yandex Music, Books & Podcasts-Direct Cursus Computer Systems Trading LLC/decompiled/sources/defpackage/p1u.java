package defpackage;

/* loaded from: classes4.dex */
public final class p1u extends cg6 {
    public vtm j;
    public lhd k;
    public yks l;
    public String m;
    public alu n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ yks q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1u(yks yksVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = yksVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.e(null, null, this);
    }
}
