package defpackage;

/* loaded from: classes5.dex */
public final class oyb extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ syb k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oyb(syb sybVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = sybVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object d = this.k.d(null, null, null, null, this);
        return d == nm6.a ? d : new z7o(d);
    }
}
