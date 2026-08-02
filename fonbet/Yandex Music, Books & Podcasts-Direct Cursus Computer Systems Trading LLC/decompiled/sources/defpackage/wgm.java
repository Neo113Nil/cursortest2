package defpackage;

/* loaded from: classes.dex */
public final class wgm extends cg6 {
    public q6t j;
    public t66 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ahm m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgm(ahm ahmVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = ahmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, this);
    }
}
