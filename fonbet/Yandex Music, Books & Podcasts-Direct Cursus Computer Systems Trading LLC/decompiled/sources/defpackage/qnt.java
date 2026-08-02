package defpackage;

/* loaded from: classes4.dex */
public final class qnt extends cg6 {
    public z7o j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tnt m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qnt(tnt tntVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = tntVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        Object b = this.m.b(null, null, null, this);
        return b == nm6.a ? b : new z7o(b);
    }
}
