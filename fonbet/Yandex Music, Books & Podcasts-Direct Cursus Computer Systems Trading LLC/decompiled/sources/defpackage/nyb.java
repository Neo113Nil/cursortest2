package defpackage;

/* loaded from: classes5.dex */
public final class nyb extends cg6 {
    public qqi j;
    public /* synthetic */ Object k;
    public final /* synthetic */ syb l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyb(syb sybVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = sybVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return syb.a(this.l, this);
    }
}
