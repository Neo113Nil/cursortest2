package defpackage;

/* loaded from: classes5.dex */
public final class k9m extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ iz7 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9m(iz7 iz7Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = iz7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object h = this.k.h(false, null, null, null, null, this);
        return h == nm6.a ? h : new z7o(h);
    }
}
