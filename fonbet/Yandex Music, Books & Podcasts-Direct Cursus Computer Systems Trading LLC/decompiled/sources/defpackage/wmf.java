package defpackage;

/* loaded from: classes4.dex */
public final class wmf extends cg6 {
    public oqi j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ xmf m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmf(xmf xmfVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = xmfVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(this);
    }
}
