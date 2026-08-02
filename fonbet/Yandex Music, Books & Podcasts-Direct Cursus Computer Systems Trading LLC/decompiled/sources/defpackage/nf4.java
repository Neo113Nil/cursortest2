package defpackage;

/* loaded from: classes4.dex */
public final class nf4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ pf4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf4(pf4 pf4Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = pf4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, this);
    }
}
