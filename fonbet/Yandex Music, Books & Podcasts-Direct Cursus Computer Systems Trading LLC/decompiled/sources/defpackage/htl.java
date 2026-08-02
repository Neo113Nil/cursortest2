package defpackage;

/* loaded from: classes4.dex */
public final class htl extends cg6 {
    public String j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ rtl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htl(rtl rtlVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = rtlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(null, 0, this);
    }
}
