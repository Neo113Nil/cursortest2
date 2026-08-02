package defpackage;

/* loaded from: classes4.dex */
public final class g5c extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ h5c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5c(h5c h5cVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = h5cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
