package defpackage;

/* loaded from: classes.dex */
public final class i1k extends cg6 {
    public j1k j;
    public s4k k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j1k m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1k(j1k j1kVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = j1kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return j1k.a(this.m, null, this);
    }
}
