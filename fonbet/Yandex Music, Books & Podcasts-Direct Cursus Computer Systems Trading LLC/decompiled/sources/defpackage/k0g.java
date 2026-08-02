package defpackage;

/* loaded from: classes3.dex */
public final class k0g extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ l0g k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0g(l0g l0gVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = l0gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return l0g.a(this.k, this);
    }
}
