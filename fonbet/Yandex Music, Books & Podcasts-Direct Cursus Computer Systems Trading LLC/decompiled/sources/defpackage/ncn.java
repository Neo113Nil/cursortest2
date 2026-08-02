package defpackage;

/* loaded from: classes3.dex */
public final class ncn extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ocn k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ncn(ocn ocnVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = ocnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object d = ocn.d(this.k, null, 0L, this);
        return d == nm6.a ? d : new z7o(d);
    }
}
