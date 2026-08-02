package defpackage;

/* loaded from: classes4.dex */
public final class j1l extends cg6 {
    public oqi j;
    public k1l k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ anx o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1l(anx anxVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = anxVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.D(this);
    }
}
