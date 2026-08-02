package defpackage;

/* loaded from: classes4.dex */
public final class i2n extends cg6 {
    public c5b j;
    public j2n k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j2n m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2n(j2n j2nVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = j2nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return j2n.b(this.m, null, this);
    }
}
