package defpackage;

/* loaded from: classes.dex */
public final class q1r extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s1r k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1r(s1r s1rVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = s1rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, 0.0f, null, this);
    }
}
