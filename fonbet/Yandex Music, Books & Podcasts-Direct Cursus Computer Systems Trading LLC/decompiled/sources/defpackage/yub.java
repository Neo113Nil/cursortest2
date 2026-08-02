package defpackage;

/* loaded from: classes3.dex */
public final class yub extends cg6 {
    public snq j;
    public snq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bvb m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yub(bvb bvbVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bvbVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(this);
    }
}
