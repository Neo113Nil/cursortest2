package defpackage;

/* loaded from: classes5.dex */
public final class ogd extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ pgd k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogd(pgd pgdVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = pgdVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
