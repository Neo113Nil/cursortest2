package defpackage;

/* loaded from: classes3.dex */
public final class jy2 extends cg6 {
    public String j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ oy2 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy2(oy2 oy2Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = oy2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, 0L, this);
    }
}
