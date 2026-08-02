package defpackage;

/* loaded from: classes3.dex */
public final class l01 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ m01 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01(m01 m01Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = m01Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
