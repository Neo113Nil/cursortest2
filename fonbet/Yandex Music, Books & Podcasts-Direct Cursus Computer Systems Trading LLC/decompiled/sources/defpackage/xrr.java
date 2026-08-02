package defpackage;

/* loaded from: classes5.dex */
public final class xrr extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bsr k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrr(bsr bsrVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = bsrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
