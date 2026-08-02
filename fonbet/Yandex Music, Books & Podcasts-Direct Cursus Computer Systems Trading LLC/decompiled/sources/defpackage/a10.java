package defpackage;

/* loaded from: classes3.dex */
public final class a10 extends cg6 {
    public mt j;
    public c01 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ e10 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a10(e10 e10Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = e10Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return e10.H(this.m, null, this);
    }
}
