package defpackage;

/* loaded from: classes5.dex */
public final class wa7 extends cg6 {
    public Object j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ya7 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa7(ya7 ya7Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = ya7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.M(this);
    }
}
