package defpackage;

/* loaded from: classes4.dex */
public final class dxs extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ kxs k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxs(kxs kxsVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = kxsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.f(null, this);
    }
}
