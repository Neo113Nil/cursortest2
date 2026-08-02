package defpackage;

/* loaded from: classes3.dex */
public final class lcn extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ocn k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lcn(ocn ocnVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = ocnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object c = ocn.c(this.k, null, this);
        return c == nm6.a ? c : new z7o(c);
    }
}
