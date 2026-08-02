package defpackage;

/* loaded from: classes3.dex */
public final class li5 extends cg6 {
    public String j;
    public oi5 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ oi5 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li5(oi5 oi5Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = oi5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.h(null, null, null, this);
    }
}
