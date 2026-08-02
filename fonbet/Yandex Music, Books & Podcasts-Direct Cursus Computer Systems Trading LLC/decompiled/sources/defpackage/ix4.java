package defpackage;

/* loaded from: classes3.dex */
public final class ix4 extends cg6 {
    public uhn j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ yx4 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix4(yx4 yx4Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = yx4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.n(null, false, this);
    }
}
