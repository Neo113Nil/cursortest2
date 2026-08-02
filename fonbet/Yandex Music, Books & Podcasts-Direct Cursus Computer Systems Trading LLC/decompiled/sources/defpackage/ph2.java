package defpackage;

/* loaded from: classes4.dex */
public final class ph2 extends cg6 {
    public g4q j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qh2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph2(qh2 qh2Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = qh2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
