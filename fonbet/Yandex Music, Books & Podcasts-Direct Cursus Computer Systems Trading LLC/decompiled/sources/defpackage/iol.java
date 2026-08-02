package defpackage;

/* loaded from: classes4.dex */
public final class iol extends cg6 {
    public kdl j;
    public oqi k;
    public int l;
    public int m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ uol p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iol(uol uolVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = uolVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.j(null, this);
    }
}
