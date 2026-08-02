package defpackage;

/* loaded from: classes4.dex */
public final class a11 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b11 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(b11 b11Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = b11Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
