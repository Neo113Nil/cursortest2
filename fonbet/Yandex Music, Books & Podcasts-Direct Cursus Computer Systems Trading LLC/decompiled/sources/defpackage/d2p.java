package defpackage;

/* loaded from: classes4.dex */
public final class d2p extends cg6 {
    public qj6 j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ e2p m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2p(e2p e2pVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = e2pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, false, this);
    }
}
