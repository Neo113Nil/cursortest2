package defpackage;

/* loaded from: classes3.dex */
public final class l22 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ z22 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l22(z22 z22Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = z22Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
