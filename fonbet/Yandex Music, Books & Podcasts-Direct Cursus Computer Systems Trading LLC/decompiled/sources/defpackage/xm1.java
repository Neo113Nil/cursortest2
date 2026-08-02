package defpackage;

/* loaded from: classes4.dex */
public final class xm1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ym1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm1(ym1 ym1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = ym1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
