package defpackage;

/* loaded from: classes3.dex */
public final class yc extends cg6 {
    public wc j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ osh m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc(osh oshVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = oshVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.T(null, 0, this);
    }
}
