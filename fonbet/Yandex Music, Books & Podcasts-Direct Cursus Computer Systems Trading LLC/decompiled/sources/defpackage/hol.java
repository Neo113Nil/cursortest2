package defpackage;

/* loaded from: classes4.dex */
public final class hol extends cg6 {
    public oqi j;
    public int k;
    public int l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ uol o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hol(uol uolVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = uolVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.i(this);
    }
}
