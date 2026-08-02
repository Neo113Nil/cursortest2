package defpackage;

/* loaded from: classes3.dex */
public final class zna extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p90 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zna(p90 p90Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = p90Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return p90.W0(this.k, this);
    }
}
