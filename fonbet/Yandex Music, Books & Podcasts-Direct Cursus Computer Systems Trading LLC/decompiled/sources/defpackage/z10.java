package defpackage;

/* loaded from: classes3.dex */
public final class z10 extends cg6 {
    public String j;
    public r10 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ a20 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z10(a20 a20Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = a20Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, null, this);
    }
}
