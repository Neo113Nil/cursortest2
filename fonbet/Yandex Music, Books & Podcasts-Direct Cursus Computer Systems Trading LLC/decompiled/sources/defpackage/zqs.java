package defpackage;

/* loaded from: classes4.dex */
public final class zqs extends cg6 {
    public mqs j;
    public oq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ brs m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqs(brs brsVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = brsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(null, this);
    }
}
