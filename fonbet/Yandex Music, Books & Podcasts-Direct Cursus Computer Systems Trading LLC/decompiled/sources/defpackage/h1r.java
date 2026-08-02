package defpackage;

/* loaded from: classes.dex */
public final class h1r extends cg6 {
    public i1r j;
    public String k;
    public String l;
    public c1r m;
    public oqi n;
    public /* synthetic */ Object o;
    public final /* synthetic */ i1r p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1r(i1r i1rVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = i1rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, this);
    }
}
