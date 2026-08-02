package defpackage;

/* loaded from: classes4.dex */
public final class cxs extends cg6 {
    public rr5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ kxs l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxs(kxs kxsVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = kxsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
