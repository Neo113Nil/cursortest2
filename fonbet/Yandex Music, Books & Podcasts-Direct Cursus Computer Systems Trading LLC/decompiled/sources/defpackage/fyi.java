package defpackage;

/* loaded from: classes.dex */
public final class fyi extends cg6 {
    public gyi j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ gyi m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyi(gyi gyiVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = gyiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.r0(0L, this);
    }
}
