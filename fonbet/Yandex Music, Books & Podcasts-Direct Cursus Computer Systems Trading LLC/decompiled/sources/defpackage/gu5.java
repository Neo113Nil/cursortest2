package defpackage;

/* loaded from: classes5.dex */
public final class gu5 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hu5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu5(hu5 hu5Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = hu5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
