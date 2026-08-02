package defpackage;

/* loaded from: classes3.dex */
public final class a6r extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b6r k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6r(b6r b6rVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = b6rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, this);
    }
}
