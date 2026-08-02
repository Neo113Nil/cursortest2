package defpackage;

/* loaded from: classes3.dex */
public final class mcc extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ncc k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcc(ncc nccVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = nccVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return ncc.b(this.k, null, this);
    }
}
