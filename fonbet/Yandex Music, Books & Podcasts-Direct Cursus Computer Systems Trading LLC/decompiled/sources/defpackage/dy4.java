package defpackage;

/* loaded from: classes5.dex */
public final class dy4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ey4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy4(ey4 ey4Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = ey4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(0, this);
    }
}
