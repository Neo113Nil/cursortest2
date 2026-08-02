package defpackage;

/* loaded from: classes3.dex */
public final class vig extends cg6 {
    public nrf j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xh1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vig(xh1 xh1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = xh1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
