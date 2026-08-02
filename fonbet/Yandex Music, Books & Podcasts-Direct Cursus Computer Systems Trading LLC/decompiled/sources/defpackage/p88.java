package defpackage;

/* loaded from: classes3.dex */
public final class p88 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ r88 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p88(r88 r88Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = r88Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
