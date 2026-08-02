package defpackage;

/* loaded from: classes4.dex */
public final class f8c extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ dn9 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8c(dn9 dn9Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = dn9Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return dn9.e(this.k, this);
    }
}
