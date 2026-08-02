package defpackage;

/* loaded from: classes3.dex */
public final class dem extends cg6 {
    public o4k j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ eem m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dem(eem eemVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = eemVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, this);
    }
}
