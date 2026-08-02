package defpackage;

/* loaded from: classes3.dex */
public final class g75 extends cg6 {
    public boolean j;
    public gmu k;
    public /* synthetic */ Object l;
    public final /* synthetic */ h75 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g75(h75 h75Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = h75Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.o(false, this);
    }
}
