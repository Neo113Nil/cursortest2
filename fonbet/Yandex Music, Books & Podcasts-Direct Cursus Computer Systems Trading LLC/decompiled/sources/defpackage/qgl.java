package defpackage;

/* loaded from: classes4.dex */
public final class qgl extends cg6 {
    public s5d j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jtc l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgl(jtc jtcVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = jtcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.m(null, this);
    }
}
