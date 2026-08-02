package defpackage;

/* loaded from: classes3.dex */
public final class a7o extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b7o k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7o(b7o b7oVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = b7oVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
