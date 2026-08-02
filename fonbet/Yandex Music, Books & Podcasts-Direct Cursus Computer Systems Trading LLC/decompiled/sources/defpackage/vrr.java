package defpackage;

/* loaded from: classes5.dex */
public final class vrr extends cg6 {
    public nh4 j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bsr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrr(bsr bsrVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bsrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
