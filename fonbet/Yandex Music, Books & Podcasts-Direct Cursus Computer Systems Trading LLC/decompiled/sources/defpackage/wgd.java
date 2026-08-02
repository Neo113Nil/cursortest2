package defpackage;

/* loaded from: classes5.dex */
public final class wgd extends cg6 {
    public re5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xgd l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgd(xgd xgdVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = xgdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return xgd.a(this.l, null, this);
    }
}
