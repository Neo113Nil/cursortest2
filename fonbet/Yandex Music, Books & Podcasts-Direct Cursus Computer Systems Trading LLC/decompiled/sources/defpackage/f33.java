package defpackage;

/* loaded from: classes.dex */
public final class f33 extends cg6 {
    public Object j;
    public bgp k;
    public /* synthetic */ Object l;
    public final /* synthetic */ g33 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f33(g33 g33Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = g33Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(this);
    }
}
