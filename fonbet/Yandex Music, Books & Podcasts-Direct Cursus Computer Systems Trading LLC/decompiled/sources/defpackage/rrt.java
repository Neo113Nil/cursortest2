package defpackage;

/* loaded from: classes3.dex */
public final class rrt extends cg6 {
    public rj6 j;
    public wc k;
    public oqi l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ urt o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrt(urt urtVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = urtVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.m(null, this);
    }
}
