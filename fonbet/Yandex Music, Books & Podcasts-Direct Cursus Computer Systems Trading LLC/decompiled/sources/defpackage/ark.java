package defpackage;

/* loaded from: classes4.dex */
public final class ark extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ g8c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ark(g8c g8cVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = g8cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.t(null, this);
    }
}
