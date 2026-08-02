package defpackage;

/* loaded from: classes3.dex */
public final class mi5 extends cg6 {
    public mh5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ oi5 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi5(oi5 oi5Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = oi5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.j(null, null, this);
    }
}
