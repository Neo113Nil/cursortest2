package defpackage;

/* loaded from: classes4.dex */
public final class e6o extends cg6 {
    public boolean j;
    public vx6 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ f6o m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6o(f6o f6oVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = f6oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(this, null, false);
    }
}
