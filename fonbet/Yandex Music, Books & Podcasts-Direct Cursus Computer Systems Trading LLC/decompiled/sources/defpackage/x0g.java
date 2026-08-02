package defpackage;

/* loaded from: classes4.dex */
public final class x0g extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ e1g k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0g(e1g e1gVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = e1gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(null, this);
    }
}
