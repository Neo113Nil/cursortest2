package defpackage;

/* loaded from: classes3.dex */
public final class sdh extends cg6 {
    public Integer j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ tdh m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdh(tdh tdhVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = tdhVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
