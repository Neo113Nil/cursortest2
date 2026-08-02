package defpackage;

/* loaded from: classes5.dex */
public final class s87 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ju0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s87(ju0 ju0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = ju0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object d = this.k.d(false, this);
        return d == nm6.a ? d : new z7o(d);
    }
}
