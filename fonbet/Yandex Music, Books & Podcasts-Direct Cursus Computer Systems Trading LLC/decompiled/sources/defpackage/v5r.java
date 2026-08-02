package defpackage;

/* loaded from: classes3.dex */
public final class v5r extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ w5r k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5r(w5r w5rVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = w5rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, this);
    }
}
