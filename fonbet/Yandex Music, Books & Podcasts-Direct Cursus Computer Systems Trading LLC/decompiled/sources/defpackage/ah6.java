package defpackage;

/* loaded from: classes4.dex */
public final class ah6 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ch6 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah6(ch6 ch6Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = ch6Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, false, this);
    }
}
