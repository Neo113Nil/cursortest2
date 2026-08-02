package defpackage;

/* loaded from: classes4.dex */
public final class sol extends cg6 {
    public boolean j;
    public oqi k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ uol o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sol(uol uolVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = uolVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.p(false, this);
    }
}
