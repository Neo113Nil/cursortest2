package defpackage;

/* loaded from: classes3.dex */
public final class lb3 extends cg6 {
    public xdr j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ob3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb3(ob3 ob3Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = ob3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return ob3.H(this.l, null, this);
    }
}
