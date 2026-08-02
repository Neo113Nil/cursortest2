package defpackage;

/* loaded from: classes6.dex */
public final class gh1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hh1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh1(hh1 hh1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = hh1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, false, this);
    }
}
