package defpackage;

/* loaded from: classes5.dex */
public final class yi3 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ zi3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi3(zi3 zi3Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = zi3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object H = this.k.H(null, 0, 0L, this);
        return H == nm6.a ? H : new gd4(H);
    }
}
