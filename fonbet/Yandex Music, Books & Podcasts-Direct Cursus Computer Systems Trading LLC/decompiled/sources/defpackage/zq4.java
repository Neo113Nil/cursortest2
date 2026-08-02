package defpackage;

/* loaded from: classes6.dex */
public final class zq4 extends cg6 {
    public String j;
    public qqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ br4 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq4(br4 br4Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = br4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
