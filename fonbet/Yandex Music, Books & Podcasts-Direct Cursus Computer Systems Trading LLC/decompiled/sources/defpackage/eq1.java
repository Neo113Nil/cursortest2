package defpackage;

/* loaded from: classes4.dex */
public final class eq1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ fq1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq1(fq1 fq1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = fq1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this, null, null);
    }
}
