package defpackage;

/* loaded from: classes.dex */
public final class p1k extends cg6 {
    public Object j;
    public Object k;
    public Object l;
    public qqi m;
    public /* synthetic */ Object n;
    public final /* synthetic */ w1k o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1k(w1k w1kVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = w1kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.f(this);
    }
}
