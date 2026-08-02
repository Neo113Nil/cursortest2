package defpackage;

/* loaded from: classes4.dex */
public final class l2p extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ m2p k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2p(m2p m2pVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = m2pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
