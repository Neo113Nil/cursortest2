package defpackage;

/* loaded from: classes4.dex */
public final class u31 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j4x k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u31(j4x j4xVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = j4xVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.j(null, false, null, this);
    }
}
