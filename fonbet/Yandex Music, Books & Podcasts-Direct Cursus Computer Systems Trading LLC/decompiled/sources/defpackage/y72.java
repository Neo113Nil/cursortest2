package defpackage;

/* loaded from: classes3.dex */
public final class y72 extends cg6 {
    public String j;
    public String k;
    public m82 l;
    public String m;
    public /* synthetic */ Object n;
    public final /* synthetic */ z72 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y72(z72 z72Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = z72Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.c(null, null, this);
    }
}
