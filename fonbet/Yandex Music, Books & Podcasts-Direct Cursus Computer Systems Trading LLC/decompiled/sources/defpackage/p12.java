package defpackage;

/* loaded from: classes6.dex */
public final class p12 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ q12 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p12(q12 q12Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = q12Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
