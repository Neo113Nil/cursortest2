package defpackage;

/* loaded from: classes5.dex */
public final class t78 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ c88 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t78(c88 c88Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = c88Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return c88.a(this.k, this);
    }
}
