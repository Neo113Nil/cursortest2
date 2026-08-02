package defpackage;

/* loaded from: classes4.dex */
public final class whq extends cg6 {
    public mwk j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xhq l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public whq(xhq xhqVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = xhqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(null, this);
    }
}
