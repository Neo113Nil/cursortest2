package defpackage;

/* loaded from: classes5.dex */
public final class nc0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ pc0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(pc0 pc0Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = pc0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
