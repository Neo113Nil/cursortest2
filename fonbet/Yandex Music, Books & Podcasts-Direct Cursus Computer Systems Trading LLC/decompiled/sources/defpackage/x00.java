package defpackage;

/* loaded from: classes3.dex */
public final class x00 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ e10 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x00(e10 e10Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = e10Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return e10.a(this.k, this);
    }
}
