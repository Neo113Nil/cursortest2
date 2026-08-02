package defpackage;

/* loaded from: classes3.dex */
public final class uwk extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ vwk k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwk(vwk vwkVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = vwkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
