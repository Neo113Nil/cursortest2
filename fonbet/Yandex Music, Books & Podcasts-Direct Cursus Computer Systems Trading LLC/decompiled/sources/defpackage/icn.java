package defpackage;

/* loaded from: classes3.dex */
public final class icn extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ocn k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icn(ocn ocnVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = ocnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object b = ocn.b(this.k, null, this);
        return b == nm6.a ? b : new z7o(b);
    }
}
