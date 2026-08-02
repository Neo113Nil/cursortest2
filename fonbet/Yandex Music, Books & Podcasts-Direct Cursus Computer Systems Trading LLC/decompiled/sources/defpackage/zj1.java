package defpackage;

/* loaded from: classes3.dex */
public final class zj1 extends cg6 {
    public String j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bk1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj1(bk1 bk1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = bk1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return bk1.a(this.m, null, false, this);
    }
}
