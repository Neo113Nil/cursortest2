package defpackage;

/* loaded from: classes.dex */
public final class r1r extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s1r k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1r(s1r s1rVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = s1rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return s1r.b(this.k, null, 0.0f, 0.0f, null, this);
    }
}
