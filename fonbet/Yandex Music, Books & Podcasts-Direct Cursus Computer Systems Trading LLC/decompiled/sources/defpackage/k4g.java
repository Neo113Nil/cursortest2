package defpackage;

/* loaded from: classes3.dex */
public final class k4g extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n4g k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4g(n4g n4gVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = n4gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
