package defpackage;

/* loaded from: classes5.dex */
public final class aed extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ced k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aed(ced cedVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = cedVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.D(this);
    }
}
