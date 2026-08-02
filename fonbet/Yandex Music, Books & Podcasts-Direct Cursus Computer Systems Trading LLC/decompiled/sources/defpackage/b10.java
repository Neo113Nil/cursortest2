package defpackage;

/* loaded from: classes3.dex */
public final class b10 extends cg6 {
    public oq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ e10 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b10(e10 e10Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = e10Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return e10.J(this.l, null, this);
    }
}
