package defpackage;

/* loaded from: classes4.dex */
public final class rh2 extends cg6 {
    public xdr j;
    public xdr k;
    public /* synthetic */ Object l;
    public final /* synthetic */ th2 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh2(th2 th2Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = th2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
