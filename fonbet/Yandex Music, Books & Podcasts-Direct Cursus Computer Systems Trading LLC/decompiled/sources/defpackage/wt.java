package defpackage;

/* loaded from: classes4.dex */
public final class wt extends cg6 {
    public oq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xiu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt(xiu xiuVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = xiuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.I(null, null, this);
    }
}
