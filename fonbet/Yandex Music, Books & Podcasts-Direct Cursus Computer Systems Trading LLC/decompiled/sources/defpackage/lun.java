package defpackage;

/* loaded from: classes5.dex */
public final class lun extends cg6 {
    public jun j;
    public dn9 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mun m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lun(mun munVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = munVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return mun.c(this.m, null, null, this);
    }
}
