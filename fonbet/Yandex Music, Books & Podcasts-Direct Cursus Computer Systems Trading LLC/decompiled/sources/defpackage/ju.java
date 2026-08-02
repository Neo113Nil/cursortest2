package defpackage;

/* loaded from: classes4.dex */
public final class ju extends cg6 {
    public String j;
    public j1g k;
    public /* synthetic */ Object l;
    public final /* synthetic */ mu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(mu muVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = muVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(null, null, this);
    }
}
