package defpackage;

/* loaded from: classes4.dex */
public final class h6t extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k6t k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6t(k6t k6tVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = k6tVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, false, this);
    }
}
