package defpackage;

/* loaded from: classes3.dex */
public final class nl1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ol1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl1(ol1 ol1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = ol1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, null, false, this);
    }
}
