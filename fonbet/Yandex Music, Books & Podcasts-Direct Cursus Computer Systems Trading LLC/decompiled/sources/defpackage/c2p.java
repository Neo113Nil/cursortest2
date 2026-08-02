package defpackage;

/* loaded from: classes4.dex */
public final class c2p extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ e2p k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2p(e2p e2pVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = e2pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
