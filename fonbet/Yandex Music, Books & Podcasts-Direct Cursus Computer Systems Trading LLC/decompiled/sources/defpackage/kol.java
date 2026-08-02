package defpackage;

/* loaded from: classes4.dex */
public final class kol extends cg6 {
    public long j;
    public long k;
    public oqi l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ uol p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kol(uol uolVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = uolVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.l(0L, this);
    }
}
