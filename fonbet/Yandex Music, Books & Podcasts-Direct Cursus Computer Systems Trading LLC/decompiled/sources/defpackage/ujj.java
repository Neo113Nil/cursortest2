package defpackage;

/* loaded from: classes.dex */
public final class ujj extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ oxa k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ujj(oxa oxaVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = oxaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.s(null, this);
        return nm6.a;
    }
}
