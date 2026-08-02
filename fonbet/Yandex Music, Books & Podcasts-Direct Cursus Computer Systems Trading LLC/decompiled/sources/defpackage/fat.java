package defpackage;

/* loaded from: classes.dex */
public final class fat extends cg6 {
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mat l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fat(mat matVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = matVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return mat.a(this.l, null, this);
    }
}
