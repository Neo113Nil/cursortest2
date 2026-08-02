package defpackage;

/* loaded from: classes6.dex */
public final class ksl extends cg6 {
    public String j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ nsl m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ksl(nsl nslVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = nslVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, null, this);
    }
}
