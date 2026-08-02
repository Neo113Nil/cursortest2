package defpackage;

/* loaded from: classes.dex */
public final class lkd extends cg6 {
    public okd j;
    public Class k;
    public /* synthetic */ Object l;
    public final /* synthetic */ okd m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lkd(okd okdVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = okdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
